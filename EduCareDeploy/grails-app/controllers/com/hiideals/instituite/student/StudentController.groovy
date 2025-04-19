package com.hiideals.instituite.student



import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional

import java.text.DateFormat
import java.text.SimpleDateFormat

import javax.servlet.ServletContext

import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.classcourses.Section
import com.hiideals.instituite.feemanagment.Admissionfee
import com.hiideals.instituite.feemanagment.Fee
import com.hiideals.instituite.feemanagment.FeeTracker
import com.hiideals.instituite.helper.AcademicYear
import com.hiideals.instituite.helper.Address
import com.hiideals.instituite.helper.Document
import com.hiideals.instituite.helper.Image
import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.users.SecUser
import com.hiideals.institute.certificates.Transfercertificate;
import com.hiideals.sms.SendSMS
import com.hiideals.transport.DestinationDetails
import com.hiideals.transport.RouteDetails
import com.hiideals.transport.Transport

@Secured(["ROLE_ADMIN","ROLE_USERR"])
class StudentController {

	private static DateFormat df = new SimpleDateFormat("dd/MM/yyyy");//yyyy-MM-dd");
	static allowedMethods = [save: "POST", update: "POST", delete: "DELETE"]
	def userService
	def studentService
	def batchService

	def index(Integer max) {
			
		params.max = Math.min(max ?: 100, 100)
		respond Student.findAllByInstituite(userService.getCurrentInstituite(),params), model:[studentInstanceCount: Student.count()]
	}

	def show(Student studentInstance) {
		println("Student Show Method..........:"+params.id)
		def docList = Student.findById(params.id)
		println("----docList----:"+docList.documents.fileName)
		def tracker = FeeTracker.findAllByStudentId(studentInstance.id)
		def trackerone = FeeTracker.findAllByStudentId(studentInstance.id,[max: 1, sort: "id", order: "desc"])
		def preeducation = PreEducation.findByStudentpreEdu(studentInstance)
		def instituite=userService.getCurrentInstituite()
		respond studentInstance,model:[tracker:tracker,preeducation:preeducation,trackerone:trackerone,instituite:instituite,docList:docList]
	}

	def create() {
	
		def rut=RouteDetails.findAllByInstitute(userService.getCurrentInstituite())
		def dst=DestinationDetails.findAllByInstitute(userService.getCurrentInstituite())
		def batchList = batchService.getListofBatches(params)
		if(!params.errors)
			respond new Student(params),model:[instituite:userService.getCurrentInstituite(),batchList:batchList,rut:rut,dst:dst]
		else{
			[instituite:userService.getCurrentInstituite(),batchList:batchList,rut:rut,dst:dst]
		}
	}
	
	def classSections(){
		
		render template:'classSections',model:[sections:IClass.findById(params.classId).sections]
	}
	
	def admissionfee(){
		
		def dd=IClass.findById(params.classId)
		def ss= Admissionfee.findByIclass(dd)
		render template:'admissionfee',model:[sections1:ss]
	}
	
	
	@Transactional
	def save(Student studentInstance) {
		def aa=null;
			Address presentaddress = studentInstance.presentAddress
			Address permenentaddress = studentInstance.permenentAddres
			df.setLenient(false);
			studentInstance.permenentAddres = null
			studentInstance.presentAddress = null
			studentInstance.permenentAddres = Address.get(1)
			studentInstance.presentAddress = Address.get(1)

			studentInstance.studentDOB = df.parse(params.studentDOB1)
			studentInstance.studentDOJ = df.parse(params.studentDOJ1)

			studentService.checkparentDetils(studentInstance)

			if (studentInstance == null) {
				notFound()
				return
			}
			
			
			boolean isRollNoValid = true
			
			/*if (studentInstance != null) {
				Instituite inst = studentInstance.instituite
				def rollnumbersList = Student.createCriteria().list(){
					eq("instituite.id",new Long(1))
					
					academicyear {
						eq("presentclass.id",new Long(1))
						eq("section.id", new Long(2))
						eq("status", "current")
					}
				}.studentId
				
				println "rollnumbersList "+rollnumbersList+" \n"+(rollnumbersList.contains(studentInstance.studentId))
				
				if(rollnumbersList.contains(studentInstance.studentId)){
					//or
					studentInstance.errors.reject(
						'rollnumber.name.doesnotmatch',
						['rollNumber'] as Object[],
						'[ Roll number as  {0} already contains]')
					chain(action:'create',model:[studentInstance:studentInstance],params:[errors:true])
					return
				}
			
			}*/

			if (studentInstance.hasErrors()) {
				(studentInstance.errors.allErrors).each {
					if((it.field).equals("studentDOB") || (it.field).equals("studentDOJ")) {
					}else if((it.field)+":"+((it.field).equals("fatherDetails.occupation") || (it.field).equals("fatherDetails.parentName") ||
					(it.field).equals("fatherDetails.relation"))){
					}
					else{
						chain(action:'create',model:[studentInstance:studentInstance],params:[errors:true])
						return
					}
				}
			}
			
			aa = studentInstance.save(flush:true,failOnError:true)
			aa.presentAddress = presentaddress.save(flush:true,failOnError:true)
			aa.permenentAddres = permenentaddress.save(flush:true,failOnError:true)

			if(params.openimg !=null && params.openimg.equals("yes")){
				def stpath = grailsApplication.config.imageFolder
				def file = request.getFile('file_1')
				String path = studentService.getPath(stpath,studentInstance.studentName)
				String s = path + file.getOriginalFilename()
				try{
					file.transferTo(new File(s))
				}catch(Exception e){}
				Image image = new Image(imagePath:s,imageDescription:"").save(flush:true,failOnError:true)
				aa.profilePic = image
			}

			def res = userService.setStudentRole(aa)
			if(res !=true){
				chain(action:'create',model:[studentInstance:studentInstance,secUserInstance:res],params:[errors:true])
				return
			}
			aa.save(flush:true,failOnError:true)

			def institute=Instituite.get(userService.getCurrentInstituite().id)
			def smsinfo=userService.getCurrentAdmin()
			String message1= ""+institute.name+" Welcome you and congratulate you for securing your admission for class "+studentInstance.academicyear.presentclass.classname[0]+ "(standard)."
			//String message1= ""+ institute.name +" Welcome you and congratulate you for securing your admission for class " +studentInstance.academicyear.presentclass.classname[0] +" (standard)."
			try {
				
				SendSMS.sendSMSDynamic(params.fatherDetails.mobileNumber, message1, smsinfo?.smsUsername, smsinfo?.smsPassword, smsinfo?.smsSenderId)
				//SendSMS.sendSMS(params.fatherDetails.mobileNumber, message1)
			} catch (Exception e) {
			log.info("Message error"+e.getMessage())
			}
			
			if(params.transport=='on'){
			params.type="Student"
			Transport transport=new Transport(params)
			transport.student=aa
			transport.startDate=df.parse(params.startDate1)
			transport.endDate=df.parse(params.endDate1)
			transport.save(flush:true,failOnError:true)
		}

			
			redirect(controller:'preEducation', action:'create',params:[studentInstance:aa.id.toString().bytes.encodeBase64().toString()])
		


	}

	def edit(Student studentInstance) {
	def batchList = batchService.getListofBatches(params)
		if(!params.error)
			respond studentInstance,model:[instituite:studentInstance.instituite,batchList:batchList]
	}

	@Transactional
	def update(Student studentInstance) {
		if (studentInstance == null) {
			notFound()
			return
		}
		studentService.checkparentDetils(studentInstance)
		if (studentInstance.hasErrors()) {
			(studentInstance.errors.allErrors).each {
				if((it.field).equals("studentDOB") || (it.field).equals("studentDOJ")) {
				}else if((it.field)+":"+((it.field).equals("fatherDetails.occupation") || (it.field).equals("fatherDetails.parentName") ||
				(it.field).equals("fatherDetails.relation"))){
				}
				else{
					chain(action:'edit',model:[studentInstance:studentInstance,instituite:studentInstance.instituite],params:[errors:true,id:LookUpED.encod(studentInstance.id)])
					return
				}
			}
			//chain(action:'edit',model:[studentInstance:studentInstance,instituite:studentInstance.instituite,params:[error:true,id:LookUpED.encod(studentInstance.id)]])
			//respond studentInstance.errors, view:'edit'
			//return
		}

		def secuser = SecUser.findByStudentID(studentInstance)
		//secuser.username = studentInstance.studentName
		//secuser.save(flush:true,failOnError:true)
		if(params.openimg !=null && params.openimg.equals("yes")){
			def stpath = grailsApplication.config.imageFolder
			def file = request.getFile('file_1')
			String path = studentService.getPath(stpath,studentInstance.studentName)
			String s = path + file.getOriginalFilename()
			try{
				file.transferTo(new File(s))
			}catch(Exception e){}
			Image image = new Image(imagePath:s,imageDescription:"").save(flush:true,failOnError:true)
			studentInstance.profilePic = image
		}
		studentInstance.studentDOJ = df.parse(params.studentDOJ1)
		studentInstance.studentDOB = df.parse(params.studentDOB1)
		studentInstance.save(flush:true,failOnError:true)
		flash.message = "Profile Updated Successfully"
		redirect(action:'show',params:[id:LookUpED.encod(studentInstance.id)])
	}

	@Transactional
	def delete(Student studentInstance) {

		if (studentInstance == null) {
			notFound()
			return
		}

		studentInstance.delete flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.deleted.message', args: [message(code: 'Student.label', default: 'Student'), studentInstance.id])
				redirect action:"index", method:"GET"
			}
			'*'{ render status: NO_CONTENT }
		}
	}

	protected void notFound() {
		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.not.found.message', args: [message(code: 'student.label', default: 'Student'), params.id])
				redirect action: "index", method: "GET"
			}
			'*'{ render status: NOT_FOUND }
		}
	}



	def showstudentprofile(Student studentInstance){
		respond studentInstance,model:[instituite:userService.getCurrentInstituite()]
	}
	
	def viewfeedetail(Student studentInstance){
		def tracker = FeeTracker.findAllByStudentId(studentInstance.id)
		def instituite = userService.getCurrentInstituite()
		def temptracker = null;
		for(FeeTracker ff in tracker){
			if(ff.id.toString() == params.stid){
				temptracker = ff
			}
		}
		def preeducation = PreEducation.findByStudentpreEdu(studentInstance)
		println("temptracker....:"+temptracker.studentId)
		def stdetails = Student.findById(temptracker.studentId)
		respond studentInstance,model:[instituite:instituite,temptracker:temptracker,tracker:tracker,preeducation:preeducation,stdetails:stdetails]

	}

	def feeinstallmentdetails(Student studentInstance){
		def tracker = FeeTracker.findAllByStudentId(studentInstance.id)
		def totalMap=[:]
		def instituite = userService.getCurrentInstituite()
		for(varnew in tracker){
			def sum = 0;
			for (int i=0; i<varnew.feetypetracker.amountPaidT.size(); i++){
				sum += varnew.feetypetracker.amountPaidT.get(i);
			}
			sum =sum+varnew.paidadmissionfee
			totalMap.put(varnew, sum)
     }
		[tracker:tracker,instituite:instituite,totalMap:totalMap,studentInstance:studentInstance]
	}
	
	def reclassSections(){
		print"jjjjjjjjjjj"+params
		render template:'reclassSections',model:[sections:IClass.findById(params.classId).sections]
	}
	

	def reAdmission(Student studentInstance) {
		println("reAdmission method....,,   :"+params)
		def rut=RouteDetails.findAllByInstitute(userService.getCurrentInstituite())
		def dst=DestinationDetails.findAllByInstitute(userService.getCurrentInstituite())
		def batchList = batchService.getListofBatches(params)
		def student=Student.findById(params.id)
		ArrayList<IClass> ss=student.academicyear.presentclass
		def inst = userService.getCurrentInstituite()
		ArrayList<IClass> iclassList = IClass.findAllByInstituite(inst)
		print "bvncbnvcbnncv"+iclassList
		
		Iterator itr = iclassList.iterator();
		
		while(itr.hasNext()){
			IClass cls = (IClass) itr.next();
			if(ss.id.contains(cls.id)){
				itr.remove()
			}
		}
		
		println "after iterator"+iclassList.classname
		
     
		if(!params.error)
			respond studentInstance,model:[instituite:studentInstance.instituite,batchList:batchList,iclassList:iclassList,rut:rut,dst:dst]
	}
	
def savereadmission(Student studentInstance){
	boolean isClear = true
	if(!studentInstance.academicyear.feeId.contains(null)){
		def feedue = studentInstance.academicyear.feeId?.due
		def totaldue = 0
		feedue.each {
		totaldue = totaldue+it
			}
		
		if(totaldue == 0){
			println("payment clear")
			}else{
			println("payment pending")
			isClear = false
			}
		}else{
	//first time
		println("first time payment")
		isClear = false
		}
	if(!isClear){
		
		flash.msgfee=  "has not paid previous class complete fees. "
		def classione=IClass.findById(studentInstance.academicyear[0]?.presentclass?.id)
		
		println("Readmission method....   :"+classione.classname)
		redirect(controller:'student', action:'reAdmission',params:[id:(params.id)])
	}else{
	println("This student has paid complete fees.....:")
	
	if(params.section1 && params.presentclass1 && params.academicyear1){
	
		def classi=IClass.findById(params.presentclass1)
		def sction=Section.findById(params.section1)
		def student=Student.findById(params.id)
		AcademicYear academic=new AcademicYear()
		if(student?.academicyear.size()>0){
			for (var in student?.academicyear) {
				var.status="completed"
			   }
			}
		academic?.academicyear=params.academicyear1
		academic?.presentclass=classi
		academic?.section=sction
		academic?.status="current"
		def ss=student?.academicyear?.academicyear.contains(params.academicyear1)
		if(ss){
			println"!!!"
			flash.msg="This academic year already exist"
			redirect(controller:'student', action:'reAdmission',params:[id:(params.id)])
			
		}else{
		
		student?.addToAcademicyear(academic?.save(flush:true,failsOnError:true))
		student.readmission=true
		student.save(flush:true,failsOnError:true)
		def smsinfo=userService.getCurrentAdmin()
		String message1= "Congratulate you for securing your Readmission for class " +classi.classname
			try {
				SendSMS.sendSMSDynamic(studentInstance.fatherDetails.mobileNumber, message1, smsinfo?.smsUsername, smsinfo?.smsPassword, smsinfo?.smsSenderId)
				//SendSMS.sendSMS(studentInstance.fatherDetails.mobileNumber, message1)
			} catch (Exception e) {
			log.info("Message error"+e.getMessage())
			}

			if (studentInstance == null) {
			notFound()
			return
		}
		studentService.checkparentDetils(studentInstance)
		if (studentInstance.hasErrors()) {
			(studentInstance.errors.allErrors).each {
				if((it.field).equals("studentDOB") || (it.field).equals("studentDOJ")) {
				}else if((it.field)+":"+((it.field).equals("fatherDetails.occupation") || (it.field).equals("fatherDetails.parentName") ||
				(it.field).equals("fatherDetails.relation"))){
				}
				else{
					chain(action:'edit',model:[studentInstance:studentInstance,instituite:studentInstance.instituite],params:[errors:true,id:LookUpED.encod(studentInstance.id)])
					return
				}
			}
		}

		def secuser = SecUser.findByStudentID(studentInstance)
		//secuser.username = studentInstance.studentName
		//secuser.save(flush:true,failOnError:true)
		if(params.openimg !=null && params.openimg.equals("yes")){
			def stpath = grailsApplication.config.imageFolder
			def file = request.getFile('file_1')
			String path = studentService.getPath(stpath,studentInstance.studentName)
			String s = path + file.getOriginalFilename()
			try{
				file.transferTo(new File(s))
			}catch(Exception e){}
			Image image = new Image(imagePath:s,imageDescription:"").save(flush:true,failOnError:true)
			studentInstance.profilePic = image
		}
		studentInstance.save(flush:true,failOnError:true)
		flash.message = "Profile Updated Successfully"
			redirect(controller:'fee', action:'create',params:[id:(params.id.toString()).bytes.encodeBase64().toString(),student:"Readmission"])
	  }
     	}
}
	}
	
	
		def readmissionList(Integer max){
	params.max = Math.min(max ?: 50, 100)
	params.sort = "studentDOJ"
	params.order = (params.orderd) ?:"desc"
	def ss=AcademicYear.findAll()
		def year=ss.academicyear.toSet()
	def instituite = userService.getCurrentInstituite()
	def studentList = null
	if(params.castName != null ){
		studentList = (studentService.searchStudentcast(params))
		[studentInstanceList:studentList,instituite:instituite,academicYearList:year]
		}else{
	
		studentList = studentService.getAllStudents(params)
		[studentInstanceList:studentList,studentInstanceCount: studentList.getTotalCount(),instituite:instituite,academicYearList:year]
		
		}

	
}
def byYear(){
	
		def clsname
		if(params.iclass!='all'){
		 clsname = IClass.findById(params.iclass).classname
		}
		params.max= params.max ?: 1000
		def instituite = userService.getCurrentInstituite()
		def studentList = null
		if(params.iclass.equals('all') && params.iyear.equals('all')){
		studentList = studentService.getAllStudents(params)
		render(template:'rejoinList',model:[studentInstanceList:studentList,studentInstanceCount: studentList.totalCount,instituite:instituite,academicYearList:AcademicYear.findAll(),clsname:clsname])
		}else if(params.iyear != "all" && params.iclass !="all"){
			
			
				studentList=Student.createCriteria().list(params){
					eq ('instituite.id', instituite?.id)
						academicyear{
							eq ('academicyear', params.iyear)
							presentclass{'in' 'id',IClass.findById(params.iclass)?.id}
							}
								
					}
					render(template:'rejoinList',model:[studentInstanceList:studentList,studentInstanceCount: studentList.totalCount,instituite:instituite,academicYearList:AcademicYear.findAll(),clsname:clsname])
			}else if(params.iclass != "all" && params.iyear.equals('all')){
				
			
				studentList=Student.createCriteria().list(params){
					academicyear{
						presentclass{'in' 'id',IClass.findById(params.iclass)?.id}
	
					}
					
					
				}
				
				render(template:'rejoinList',model:[studentInstanceList:studentList,studentInstanceCount: studentList.totalCount,instituite:instituite,academicYearList:AcademicYear.findAll(),clsname:clsname])
			}else if(params.iyear != "all" && params.iclass.equals('all')){
				
				studentList=Student.createCriteria().list(params){
					eq ('instituite.id', instituite?.id)
						academicyear{
							eq ('academicyear', params.iyear)
						}
								
					}
					render(template:'rejoinList',model:[studentInstanceList:studentList,studentInstanceCount: studentList.totalCount,instituite:instituite,academicYearList:AcademicYear.findAll(),clsname:clsname])
			}
	
	}

def downloadFile(){
		
		def filefile=Document.findById(params.id)
		
		
		String filePath = filefile.path//grailsApplication.config.generalFiles//+file.getOriginalFilename()//params.file;
		File dwnldFile = new File(filePath);
		FileInputStream inStream = new FileInputStream(dwnldFile);
		// if you want to use a relative path to context root:
		String relativePath = getServletContext().getRealPath("");

		// obtains ServletContext
		ServletContext context = getServletContext();

		// gets MIME type of the file
		String mimeType = context.getMimeType(filePath);
		if (mimeType == null) {
			// set to binary type if MIME mapping not found
			mimeType = "application/octet-stream";
		}
		System.out.println("MIME type: " + mimeType);

		// modifies response
		response.setContentType(mimeType);
		response.setContentLength((int) dwnldFile.length());

		// forces download
		String headerKey = "Content-Disposition";
		String headerValue = String.format("attachment; filename=\"%s\"", dwnldFile.getName());
		response.setHeader(headerKey, headerValue);

		// obtains response's output stream
		OutputStream outStream = response.getOutputStream();

		byte[] buffer = new byte[4096];
		int bytesRead = -1;

		while ((bytesRead = inStream.read(buffer)) != -1) {
			outStream.write(buffer, 0, bytesRead);
		}

		println("File Downloaded Successfully for filingId : ")
		inStream.close();
		outStream.close();


	
	}

def saveDocuments(params){
	println("student upload documetns....st ID....:"+params.stId)
	def stdoc = Student.findById(params.stId)
	println("stdoc..stdoc.....:"+stdoc.registrationNo)
	def stpath = grailsApplication.config.documentFolder
	for(int i=0;i<=3;i++){
		def file = request.getFile("document${i}")
		String path = studentService.getPath(stpath,stdoc.registrationNo)
		if(file.getOriginalFilename()!=null && file.getOriginalFilename().isEmpty()==false){
			String s = path + file.getOriginalFilename()//+RandomString
			try{
				file.transferTo(new File(s))
			}catch(Exception e){e.printStackTrace()}
			Document document=new Document(path:s,fileName:file.getOriginalFilename()).save(flush:true,failOnError:true);
			stdoc.addToDocuments(document).save(flush:true,failOnError:true)
			
		}
	}
	redirect(action:'show',params:[id:LookUpED.encod(stdoc.id)])
}

def getStudentUniqueId(){
	
	println params
	def studentid=studentService.getCustomerUniqueNumber(params)
	println "studentid "+studentid
	
	render(template:'studentIdtemp',model:[studentid:studentid])
	}
	def feedetailprint(){

		def instituite = userService.getCurrentInstituite()
		def studentInstance = Student.findById(params.id)
		def tracker = FeeTracker.findAllByStudentId(studentInstance.id)
		def trackerone = FeeTracker.findAllByStudentId(studentInstance.id,[max: 1, sort: "id", order: "desc"])
		[instituite:instituite,studentInstance:studentInstance,tracker:tracker,trackerone:trackerone]
		
	}
	
	
	def popfeeprint(){
		def feeinatance=Fee.findById(params?.id)
		def instituite = userService.getCurrentInstituite()
		def studentInstance = Student.findById(feeinatance?.studentId?.id)
		def tracker = FeeTracker.findAllByStudentId(studentInstance.id)
		def trackerone = FeeTracker.findAllByStudentId(studentInstance.id,[max: 1, sort: "id", order: "desc"])
		[instituite:instituite,studentInstance:studentInstance,tracker:tracker,trackerone:trackerone]
	}
	
	def specificfeeprint(){
		println"specificfeeprint  :   "+params
		def feeinatance=Fee.findById(params?.id)
		def instituite = userService.getCurrentInstituite()
		def studentInstance = Student.findById(feeinatance?.studentId?.id)
		def tracker = FeeTracker.findAllByStudentId(studentInstance.id)
		println"tracker  :  "+tracker?.feetypetracker//.get(myArrayList.size()-1)
		//println"tracker last element list  :  "+tracker?.feetypetracker.get(tracker?.feetypetracker.size()-1).amountPaidT
		def particularfeepaid = tracker?.feetypetracker.get(tracker?.feetypetracker.size()-1)//.amountPaidT
		println"particularfeepaid  :   "+particularfeepaid
		def fList = []
		for (var in particularfeepaid) {
			//stList=BookIssuedetails.findByStudentdetails(var)
			println"var  :  "+var.amountPaidT
			if(var.amountPaidT!=0){
			println"not null"+var.amountPaidT
			
			fList.add(var)
			}
	}
		println"fList fList     :  "+fList
		def trackerone = FeeTracker.findAllByStudentId(studentInstance.id,[max: 1, sort: "id", order: "desc"])
		[instituite:instituite,studentInstance:studentInstance,fList:fList,tracker:tracker,trackerone:trackerone]
	}
	
	def specificviewfeedetail(Student studentInstance){
		println"ddddd    :    "+params
		def tracker = FeeTracker.findById(params?.stid)
		
		println"tracker  :  "+tracker?.feetypetracker//?.amountPaidT
		def particularfeepaid = tracker?.feetypetracker
		
		def fList = []
		for (var in particularfeepaid) {
			//stList=BookIssuedetails.findByStudentdetails(var)
			println"var  :  "+var.amountPaidT
			if(var.amountPaidT!=0){
			println"not null"+var.amountPaidT
			
			fList.add(var)
			}
	}
		
		String instFeeTypeT
		Long amountPaidT
		Long dueT
		Long amountToBePaidT
		
		def instituite = userService.getCurrentInstituite()
		def preeducation = PreEducation.findByStudentpreEdu(studentInstance)
		def temptracker = null;
		for(FeeTracker ff in tracker){
			if(ff.id.toString() == params.stid){
				temptracker = ff
			}
		}
		
		def stdetails = Student.findById(temptracker.studentId)
		respond studentInstance,model:[fList:fList,instituite:instituite,preeducation:preeducation,tracker:tracker,preeducation:preeducation,stdetails:stdetails]

	}
	
	def transfer(){
		
		def student = Student.findById(params.id)
		def instituite=userService.getCurrentInstituite()
		[instituite:instituite,student:student]
	}
	
	
	def repeate(Student studentInstance){
		println("Repeate method....,,   :"+params)
		def rut=RouteDetails.findAllByInstitute(userService.getCurrentInstituite())
		def dst=DestinationDetails.findAllByInstitute(userService.getCurrentInstituite())
		def batchList = batchService.getListofBatches(params)
		def student=Student.findById(params.id)
	
		if(!params.error)
			respond studentInstance,model:[instituite:studentInstance.instituite,batchList:batchList,rut:rut,dst:dst]
		
	}
	
	
	def saverepeate(Student studentInstance){
		
	
	boolean isClear = true
	if(!studentInstance.academicyear.feeId.contains(null)){
		def feedue = studentInstance.academicyear.feeId?.due
		def totaldue = 0
		feedue.each {
		totaldue = totaldue+it
			}
		
		if(totaldue == 0){
			println("payment clear")
			}else{
			println("payment pending")
			isClear = false
			}
		}else{
	//first time
		println("first time payment")
		isClear = false
		}
	if(!isClear){
		
		flash.msgfee=  "has not paid previous class complete fees. "
		def classione=IClass.findById(studentInstance.academicyear[0]?.presentclass?.id)
		
		println("Repeate method....   :"+classione.classname)
		redirect(controller:'student', action:'repeate',params:[id:(params.id)])
	}else{
	println("This student has paid complete fees.....:")
	
	if(params.section && params.ppclass && params.academicyear1){
	
		def classi=IClass.findById(params.ppclass)		
		def sction=Section.findById(params.section)
		
		
		def student=Student.findById(params.id)
		AcademicYear academic=new AcademicYear()
		if(student?.academicyear.size()>0){
			for (var in student?.academicyear) {
				var.status="completed"
			   }
			}
		academic?.academicyear=params.academicyear1
		academic?.presentclass=classi
		academic?.section=sction
		academic?.status="current"
		def ss=student?.academicyear?.academicyear.contains(params.academicyear1)
		if(ss){
			println"!!!"
			flash.msg="This academic year already exist"
			redirect(controller:'student', action:'repeate',params:[id:(params.id)])
			
		}else{
		
		student?.addToAcademicyear(academic?.save(flush:true,failsOnError:true))
		student.repeate=true
		student.save(flush:true,failsOnError:true)
		def smsinfo=userService.getCurrentAdmin()
		String message1= "Congratulate you for securing your Readmission for class " +classi.classname
			try {
				SendSMS.sendSMSDynamic(studentInstance.fatherDetails.mobileNumber, message1, smsinfo?.smsUsername, smsinfo?.smsPassword, smsinfo?.smsSenderId)
				//SendSMS.sendSMS(studentInstance.fatherDetails.mobileNumber, message1)
			} catch (Exception e) {
			log.info("Message error"+e.getMessage())
			}

		
	
		
		if (studentInstance == null) {
			notFound()
			return
		}
		studentService.checkparentDetils(studentInstance)
		if (studentInstance.hasErrors()) {
			(studentInstance.errors.allErrors).each {
				if((it.field).equals("studentDOB") || (it.field).equals("studentDOJ")) {
				}else if((it.field)+":"+((it.field).equals("fatherDetails.occupation") || (it.field).equals("fatherDetails.parentName") ||
				(it.field).equals("fatherDetails.relation"))){
				}
				else{
					chain(action:'edit',model:[studentInstance:studentInstance,instituite:studentInstance.instituite],params:[errors:true,id:LookUpED.encod(studentInstance.id)])
					return
				}
			}
		}

		def secuser = SecUser.findByStudentID(studentInstance)
		
		if(params.openimg !=null && params.openimg.equals("yes")){
			def stpath = grailsApplication.config.imageFolder
			def file = request.getFile('file_1')
			String path = studentService.getPath(stpath,studentInstance.studentName)
			String s = path + file.getOriginalFilename()
			try{
				file.transferTo(new File(s))
			}catch(Exception e){}
			Image image = new Image(imagePath:s,imageDescription:"").save(flush:true,failOnError:true)
			studentInstance.profilePic = image
		}
		studentInstance.save(flush:true,failOnError:true)
		flash.message = "Profile Updated Successfully"
			redirect(controller:'fee', action:'create',params:[id:(params.id.toString()).bytes.encodeBase64().toString()])
	  }
     	}
}
		
		
		
	}
	
	def transferlist(){
	
		def instituite = userService.getCurrentInstituite()
		def transfer = Transfercertificate.findAllByInstid(instituite.id)
		println "fff--->" +instituite.id
		[transer:transfer]
	}
	
	
	
	def idcard(){
		
		def instituite = userService.getCurrentInstituite()
		
		def batchList = batchService.getListofBatches(params)
		def iclass = IClass.findAllByInstituite(instituite)
		
		[instituite:userService.getCurrentInstituite(),batchList:batchList,iclass:iclass]
		
	}
	
	def stID(){
		print"id card---------"+params
		def iclass = params.classId
		
		render template:'stID',model:[sections:IClass.findById(params.classId).sections,iclass:iclass]
		
	}
	
	def phoneList(){
		
		print"paramsssssssssssssssss"+params
		
		def instituite = userService.getCurrentInstituite()
		def studentList=Student.createCriteria().list(){
			eq ('instituite.id', instituite?.id)
					academicyear{
						eq('section',Section.findById(params.int('sectionId')))
						presentclass{'in' 'id',IClass.findById(params.classId)?.id}
	
					}
				}
	def phone = studentList
	
	
	render template:'phoneList',model:[phone:phone]
		
  }
	
	def studentIdss(Student studentInstance){
		print"lllllllllllllllllfffff"+params
		/*ArrayList<Integer> student = new ArrayList<Integer>();
		ArrayList<Integer> arry = params.phone
		
		for (int z = 0; z < arry.size; z++) {
			int[] array1 = arry[z];
			print"kkkkkkkkkkkk"+array1
			//def instituite=userService.getCurrentInstituite()
			def stdetails = Student.findById(array1)
			student.add(stdetails)
		}*/
	  
	if (params.phone =="all"){
		def instituite = userService.getCurrentInstituite()
		def studentList=Student.createCriteria().list(){
			eq ('instituite.id', instituite?.id)
					academicyear{
						eq('section',Section.findById(params.int('section1')))
						presentclass{'in' 'id',IClass.findById(params.iclass)?.id}
	
					}
				}
	
	           [studentList:studentList,instituite:instituite]
	
		
	}else{
	def instituite = userService.getCurrentInstituite()
	def student = Student.findById(params.phone)
	respond student,model:[student:student,instituite:instituite]
	}
	
	}
}
	



