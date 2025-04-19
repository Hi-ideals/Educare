package com.hiideals.instituite.feemanagment



import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional

import java.text.DateFormat
import java.text.SimpleDateFormat

import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.student.Student
import com.hiideals.sms.SendSMS
/**
 * @author Uddha Umesh
 * @createdOn 24-Nov-2016
 *
 */
@Secured(["ROLE_ADMIN","ROLE_USERR"])
@Transactional(readOnly = false)
class FeeController {
	private static DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
	def userService
	def studentService
	def feeService
	def batchService
	
	def index(Integer max) {
		params.max = Math.min(max ?: 100, 100)
		params.sort = "lastUpdated"
		params.order = "desc"

		def feeInstanceList = null;
		def institute = null;

		if(params.typ){
			feeInstanceList = feeService.getSortedfee(params)
		}else
			feeInstanceList = feeService.getInstituteFee(params)

		if(feeInstanceList[0]?.institute)
			institute = feeInstanceList[0]?.institute
		else
			institute = userService.getCurrentInstituite()
			
			if(params?.from){
				feeInstanceList = feeService.getlist(params)
				}
			
			int Totalsum = 0;
			(feeInstanceList?.totalFee).each {
				Totalsum=Totalsum+it
			}
			int Paidsum = 0;
			(feeInstanceList?.totalPaid).each {
				Paidsum=Paidsum+it
			}
			int duesum = 0;
			(feeInstanceList?.due).each {
				duesum=duesum+it
			}
			int discountsum = 0;
			(feeInstanceList?.discount).each {
				discountsum=discountsum+it
			}
		if(params?.from){
				[discountsum:discountsum,feeInstanceList:feeInstanceList,institute:institute,Totalsum:Totalsum,Paidsum:Paidsum,duesum:duesum]
				}else{
				[discountsum:discountsum,feeInstanceCount: feeInstanceList?.totalCount,feeInstanceList:feeInstanceList,institute:institute,Totalsum:Totalsum,Paidsum:Paidsum,duesum:duesum]
				}
	}

	def show(Fee feeInstance) {
		def tracker = FeeTracker.findAllByStudentId(feeInstance.studentId.id)
		respond feeInstance,model:[trackerList:tracker]
	}

	def create() {
		if(!params.id){
			redirect(action:'index')
			return
		}
		def student = null
		try{
			student = Student.get(new Long(new String(params.id.decodeBase64())))
			
		}catch(Exception e){
			redirect(action:'index')
			return
		}
	
		def Instfeetypes = InstFeeTypes.findAllByInstituiteAndIclass(student.instituite,student.academicyear.presentclass.last())
		
		
			int [] numbers = Instfeetypes?.totalAmount
		int sum = 0;
		for(int i = 0; i < numbers.length; i++){
			sum += numbers[i];
		}
		int x=sum
		int y=student?.admissionfee?.totalAmount
		int totalsum=x+y;

		respond new Fee(params),model:[Instfeetypes:Instfeetypes,student:student,totalsum:totalsum,sum:x]
	}

	@Transactional
	def save(Fee feeInstance) {
	
		
		if(params.Skip == "skip"){
			redirect(controller:'studentList')
			return
		}
		
		def feetypeMap = [:]

		if (feeInstance == null) {
			notFound()
			return
		}

		if (feeInstance.hasErrors()) {
			respond feeInstance.errors, view:'create'
			return
		}

		def feetypes = InstFeeTypes.findAllByInstituiteAndIclass(feeInstance?.studentId?.instituite,feeInstance?.studentId?.academicyear?.presentclass.last())//Instituite.get(1))
		for(int i=0;i<feetypes.size();i++){
			def instfee ;
			Long totalAmount = 0;
			if(feetypes.id.contains(new Long(params.getAt("FeeType_" + i)))){
				instfee = feetypes[i]
				totalAmount = instfee.totalAmount
			}

			params.amountPaid = new Long(params.getAt("amountToBePaid_" + i))
			params.due =totalAmount-params.amountPaid//new Long(params.getAt("due_" + i))
			params.amountToBePaid = totalAmount//new Long(params.getAt("amountToBePaid_" + i))
			feetypeMap.put(instfee.typeName, params.amountPaid)

			FeesTypes feesTypes =  new FeesTypes(params)
			feesTypes.instFeeType = instfee
			feeInstance.addToFeetypes(feesTypes)
			
			
		}
		
		
		if(params?.discount1){
			feeInstance?.discount= Integer.parseInt(params.discount1)
		}
		if(params.admissionfee!='0'){
		feeInstance?.dueadmissionfee= Integer.parseInt(params.admissionfeedue)
		feeInstance?.admissionfeepaid=Integer.parseInt(params.paidadmissionfee)
		feeInstance?.totaladmissionfee=Integer.parseInt(params.admissionfee)
		}
		def fee = feeInstance.save flush:true
		def smsinfo=userService.getCurrentAdmin()
		//String message1= "Your total amount is "+ params.totalFee +"Rs Paid amount " +params.totalPaid +"Rs"
		try {
		String message1="Your total amount is "+params.totalFee+" Rs Paid amount "+params.totalPaid+" Rs"
			SendSMS.sendSMSDynamic(feeInstance?.studentId?.fatherDetails.mobileNumber, message1, smsinfo?.smsUsername, smsinfo?.smsPassword, smsinfo?.smsSenderId)
			//SendSMS.sendSMS(feeInstance?.studentId?.fatherDetails.mobileNumber, message1)
		} catch (Exception e) {
		log.info("Message error"+e.getMessage())
		}
		feeService.addtoFeeTracker(fee,feetypeMap, params)
		def fee1=Fee.findById(feeInstance.id)
		fee1.dateCreated=df.parse(params?.paydate)
		fee1.save(flush:true,failsOnError:true)
		
		flash.message = "Successfully Paid the fee for Student : "+feeInstance?.studentId?.studentName + "  and SMS has been sent to your mobile number "
		redirect(action:'index',params:[id:LookUpED.encod(feeInstance.id),page1:'create'])
	}

	def edit(Fee feeInstance) {
		//def feeInstance = Fee.get(LookUpED.decod(params.id))
		//TODO: display feetypes even when instfeeTypes are added later
		def totalsum=0;
		  totalsum=feeInstance?.totalFee
		  def sum=feeInstance?.totalFee
		println("totalsum")
		def Instfeetypes = InstFeeTypes.findAllByInstituiteAndIclass(feeInstance?.institute,feeInstance?.studentId?.academicyear?.presentclass.last())
	
		
		if(feeInstance.feetypes.size()<=0){
			Instfeetypes.each{
				totalsum = totalsum+it.totalAmount
				def feeTypes = new FeesTypes(instFeeType:it,amountPaid:0,due:it.totalAmount,amountToBePaid:it.totalAmount,fee:feeInstance)
				//feeTypes.save(flush:true,failOnError:true)
				feeInstance.addToFeetypes(feeTypes)
			}
			
			
			feeInstance.totalFee =totalsum
			feeInstance.due=totalsum-feeInstance.totalPaid
			
			feeInstance.save(flush:true,failOnError:true)
		}
		println "feetypes afdter: "+feeInstance.feetypes
		
		
		respond feeInstance,model:[student:feeInstance.studentId,Instfeetypes:Instfeetypes,totalsum:totalsum,sum:sum]
	}

	@Transactional
	def update(Fee feeInstance) {
		
		def feetypeMap = [:]
		
		if (feeInstance == null) {
			notFound()
			return
		}

		if (feeInstance.hasErrors()) {
			respond feeInstance.errors, view:'edit'
			return
		}


		def feetypes = feeInstance.feetypes.instFeeType//InstFeeTypes.findAllByInstituite(Instituite.get(1))
		int i=0;
		for (FeesTypes feetype in feeInstance.feetypes) {

			def instfee ;
			Long totalAmount = 0;
			Long aa = new Long(params.getAt("amountToBePaid_" + i))
			
			feetype.amountPaid =( new Long(params.getAt("amountToBePaid_" + i)) + feetype.amountPaid)
			
			
			feetype.amountToBePaid = (new Long(params.getAt("totalAmount_" + i)))
			
			feetype.due =feetype.amountToBePaid-(feetype.amountPaid)//new Long(params.getAt("due_" + i))
			
		
			i++;
			feetypeMap.put(feetype.instFeeType.typeName, aa)
		}


		if(params.admissionfee!='0'){
		feeInstance?.dueadmissionfee= Integer.parseInt(params.admissionfeedue)
		feeInstance?.admissionfeepaid=Integer.parseInt(params.paidadmissionfee)
		feeInstance?.totaladmissionfee=Integer.parseInt(params.admissionfee)
		}
		feeInstance.dateCreated=df.parse(params?.paydate)
		feeInstance.save flush:true
		
		feeService.addtoFeeTracker(feeInstance,feetypeMap, params)
		
		
		flash.message = "Successfully Updated fee for Student : "+feeInstance?.studentId?.studentName + "  and SMS has been sent to your mobile number "
		//redirect(action:'index',params:[id:LookUpED.encod(feeInstance?.studentId?.id)])
		//redirect(action:'index',params:[id:LookUpED.encod(feeInstance?.studentId?.id)])
		redirect(action:'index',params:[id:LookUpED.encod(feeInstance.id),page1:'edit'])
	}

	@Transactional
	def delete(Fee feeInstance) {

		if (feeInstance == null) {
			notFound()
			return
		}

		feeInstance.delete flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.deleted.message', args: [
					message(code: 'Fee.label', default: 'Fee'),
					feeInstance.id
				])
				redirect action:"index", method:"GET"
			}
			'*'{ render status: NO_CONTENT }
		}
	}

	protected void notFound() {
		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.not.found.message', args: [
					message(code: 'fee.label', default: 'Fee'),
					params.id
				])
				redirect action: "index", method: "GET"
			}
			'*'{ render status: NOT_FOUND }
		}
	}

	/**
	 * Praveen Kumar
	 * @return
	 */
	def getlistofdues(){
		def feedueList = studentService.getAllStudentsDue(params)
		[feedueList:feedueList.feeId]
	}
	
	def feenotice(){
		def stfeenotice = Student.findById(params.id)
		
		def instituite = userService.getCurrentInstituite()
		[instituite:instituite,stfeenotice:stfeenotice]
	}
	
	def individualstfee(){
	
		def studentList = null
		studentList = studentService.getAllStudents(params)
		def batchList = batchService.getListofBatches()
		[batchList:batchList,studentInstanceList:studentList]
	}
	
	def quickstudentfeelist(){
		
		def studentList = null
		studentList = studentService.getAllStudents(params)
		def batchList = batchService.getListofBatches()
		[batchList:batchList,studentInstanceList:studentList]
	}
	
	def getIndividualstudentFees(){
		
		def student = (studentService.searchStudent(params))
		print"kkkkkkkkkkk"+student
		def list1=[]
		for (var in student) {
				def feeInstance = Fee.findAllByStudentId(var)
				list1.add(feeInstance)
		}
		def ss=list1.flatten()
		def somepaidlist
		somepaidlist=ss.grep() as Set
		
		def list2=[]
		if(params?.academicyear){
			for (var in somepaidlist) {
			def sss=var?.academic?.academicyear.equals(params?.academicyear)
			if(sss){
			list2.add(var)
			  }
			}
			somepaidlist=list2 as Set
		}
		if(somepaidlist){
		def Instfeetypes = InstFeeTypes.findAllByInstituite(student.instituite)
		render(template:'getIndividualstudentFees',model:[list1:somepaidlist,Instfeetypes:Instfeetypes,student:student])

		}
		else if(!student){
			render("<span style='font-family: monospace; font-size:20px; color:red;margin-top:5px;'>No Student with this Name ...! </span>")
		}
		else{
		render("<span style='font-family: monospace; font-size:20px; color:red;margin-top:5px;'>Fees NOT Paid!</span>")
		}
	}
	
	
	def quickstudentfee(){
		def student = (studentService.quicksearch(params))
		def list1=[]
		for (var in student) {
				def feeInstance = Fee.findAllByStudentId(var)
				list1.add(feeInstance)
		}
		def ss=list1.flatten()
		def somepaidlist
		somepaidlist=ss.grep() as Set
		
		def list2=[]
		if(params?.academicyear){
			for (var in somepaidlist) {
			def sss=var?.academic?.academicyear.equals(params?.academicyear)
			if(sss){
			list2.add(var)
			  }
			}
			somepaidlist=list2 as Set
		}
		if(somepaidlist){
		def Instfeetypes = InstFeeTypes.findAllByInstituite(student.instituite)
		render(template:'getIndividualstudentFees',model:[list1:somepaidlist,Instfeetypes:Instfeetypes,student:student])

		}
		else if(!student){
			render("<span style='font-family: monospace; font-size:20px; color:red;margin-top:5px;'>No Student with this Name ...! </span>")
		}
		else{
		render("<span style='font-family: monospace; font-size:20px; color:red;margin-top:5px;'>Fees NOT Paid!</span>")
		}
	}
	
	
	
		/*def getIndividualstudentFees(){
		def student = (studentService.searchStudent(params))[0]
		
		def feeInstance = Fee.findByStudentId(student)
		try{
			def Instfeetypes = InstFeeTypes.findAllByInstituite(student.instituite)
			
			
			if(feeInstance == null){
				
				render(template:'getIndividualstudentFees',model:[feeInstance:new Fee(params),Instfeetypes:Instfeetypes,student:student])
			}
				else{
					render(template:'getIndividualstudentFees',model:[feeInstance:feeInstance,Instfeetypes:Instfeetypes,student:student])
				}
		}catch(Exception e){
			render "No Results Found"
			return
		}
	}

*/
	

	def newfeepay(Fee feeInstance){
		println("New Fees Edit Payment///..:"+params)
		def Instfeetypes = InstFeeTypes.findAllByInstituiteAndIclass(feeInstance?.institute,feeInstance?.studentId?.academicyear?.presentclass)
		def institute = userService.getCurrentInstituite()
		if(params.paid){
			println "aaaaaaaaaa"
			def feeTracker=FeeTracker.findById(params.int('feeTrackerId'))
			def studentdetails = Student.findById(feeTracker.studentId)
			def b = FeeTypesTracker.findAllByFeeTracker(feeTracker)
			def sum = 0;
			for (int i=0; i<b.amountPaidT.size(); i++){
				sum += b.amountPaidT.get(i);
			  }
			[params:params,b:FeeTypesTracker.findAllByFeeTracker(feeTracker),institute:institute,feeTracker:feeTracker,studentdetails:studentdetails,sum:sum]
		}
		else{
			params.paid=false
			respond feeInstance,model:[student:feeInstance.studentId,Instfeetypes:Instfeetypes,institute:institute]
		}
	}

	@Transactional
	def newFeeupdate(Fee feeInstance) {
		println("NewFeeupdate method....:"+params)

		def feetypeMap = [:]

		if (feeInstance == null) {
			notFound()
			return
		}

		if (feeInstance.hasErrors()) {
			respond feeInstance.errors, view:'edit'
			return
		}


		def feetypes = feeInstance.feetypes.instFeeType//InstFeeTypes.findAllByInstituite(Instituite.get(1))
		int i=0;
		for (FeesTypes feetype in feeInstance.feetypes) {

			def instfee ;
			Long totalAmount = 0;
			Long aa = new Long(params.getAt("amountToBePaid_" + i))
			feetype.amountPaid =( new Long(params.getAt("amountToBePaid_" + i)) + feetype.amountPaid)
			feetype.due =feetype.instFeeType.totalAmount-(feetype.amountPaid)//new Long(params.getAt("due_" + i))
			feetype.amountToBePaid = feetype.due//new Long(params.getAt("amountToBePaid_" + i))
			i++;

			feetypeMap.put(feetype.instFeeType.typeName, aa)
		}

		feeInstance.save flush:true

		def b=feeService.addtoFeeTracker(feeInstance,feetypeMap, params)
		flash.message = "Successfully Updated fee for Student : "+feeInstance?.studentId?.studentName
		def institute = userService.getCurrentInstituite()

		params.clear()
		params.paid=true
		params.feeTrackerId=b?.id
		//[institute:institute,feeInstance:feeInstance,b:FeeTypesTracker.findAllByFeeTracker(b),params:params]
		redirect(action:'newfeepay',params:params)
	}
	
	/*def feezeroPaid(){
		def stunPaidFee = Student.findAllByInstituite(userService.getCurrentInstituite())

		Set ss=[]
		def aaa=[]
		def fees=Fee.list();
		if(fees.size()<=0){
			ss = stunPaidFee
		}
		stunPaidFee.each {aa ->

			//println("feeee list. fees.."+fees)
			fees.each {
				if(it.studentId==aa)
				{
					//println("feeee list. if.."+aa)
					aaa.addAll(aa)
				}else{
					//println("feeee list else..."+aa)
					ss.addAll(aa)
				}
			}
		}
		ss.removeAll(aaa)
		//println(",./,./,./ // ...   :"+ss.studentName)

		def instituite = userService.getCurrentInstituite()
		[institute:instituite,ss:ss]
	}
	
	
	
	*/
	
	def feezeroPaid(){
		def stunPaidFee = Student.findAllByInstituite(userService.getCurrentInstituite())

		Set ss=[]
		def aaa=[]
		def bbb=[]
		def fees=Fee.list();
		if(fees.size()<=0){
			ss = stunPaidFee
		}
		stunPaidFee.each {aa ->
			aa.academicyear.each {kk ->
				if(kk?.status=='current')
				/*	{
						aaa.addAll(kk)
					}*/
					if(kk.feeId){
					bbb.addAll(aa)
				   }else{
					ss.addAll(aa)
					}
					
				}
		}
		def instituite = userService.getCurrentInstituite()
		[institute:instituite,ss:ss]
	}

	

/*	def byClasszerofee(){
		def byClass = IClass.findById(params.iclass)
		//println("By Class zero fee"+byClass.classname)
		def stunPaidFee = Student.createCriteria().list {
			eq('instituite',userService.getCurrentInstituite())
			academicyear{
				eq('presentclass',byClass)
			}
		}

		def fees=Fee.list();
		def ss=[];
		def aaa=[]
		if(fees.size()<=0){
			ss = stunPaidFee
		}

		stunPaidFee.each {aa ->

			//println("feeee list. fees.."+fees)
			fees.each {
				if(it.studentId==aa)
				{
					//println("feeee list. if.."+aa)
					aaa.addAll(aa)
				}else{
					//println("feeee list else..."+aa)
					ss.addAll(aa)
				}
			}
		}
		ss.removeAll(aaa)
		ss.toSet()
		//println("Student   :"+ss.toSet())
		def instituite = userService.getCurrentInstituite()
		//[institute:instituite,ss:ss.toSet()]
		if(ss.toSet().isEmpty()){
			render 'No list Found .'//(template:'byClasszerofees',model:[institute:instituite,ss:ss.toSet()])
			
		}else{
			render(template:'byClasszerofees',model:[institute:instituite,ss:ss.toSet()])
		}
		

		//println("stunPaidFee...:"+stunPaidFee)


	}*/
	
	def byClasszerofee(){
		def byClass = IClass.findById(params.iclass)
		//println("By Class zero fee"+byClass.classname)
		def stunPaidFee = Student.createCriteria().list {
			eq('instituite',userService.getCurrentInstituite())
			academicyear{
				eq('presentclass',byClass)
			}
		}

		def fees=Fee.list();
		def ss=[];
		def aaa=[]
		def bbb=[]
		if(fees.size()<=0){
			ss = stunPaidFee
		}

		stunPaidFee.each {aa ->
			aa.academicyear.each {kk ->
				if(kk?.status=='current')
				/*	{
						aaa.addAll(kk)
					}*/
					if(kk.feeId){
					bbb.addAll(aa)
				   }else{
					ss.addAll(aa)
					}
					
				}
		}
		ss.toSet()
		//println("Student   :"+ss.toSet())
		def instituite = userService.getCurrentInstituite()
		//[institute:instituite,ss:ss.toSet()]
		if(ss.toSet().isEmpty()){
			render 'No list Found .'//(template:'byClasszerofees',model:[institute:instituite,ss:ss.toSet()])
			
		}else{
			render(template:'byClasszerofees',model:[institute:instituite,ss:ss.toSet()])
		}
		

		//println("stunPaidFee...:"+stunPaidFee)


	}
	
		def printOfUnpaid(){
		
		def stunPaidFee = Student.findAllByInstituite(userService.getCurrentInstituite())
		
				Set ss=[]
				def aaa=[]
				def fees=Fee.list();
				if(fees.size()<=0){
					ss = stunPaidFee
				}
				stunPaidFee.each {aa ->
					fees.each {
						if(it.studentId==aa)
						{
							aaa.addAll(aa)
						}else{
							ss.addAll(aa)
						}
					}
				}
				ss.removeAll(aaa)
		
				def instituite = userService.getCurrentInstituite()
				[institute:instituite,ss:ss]
		
	}

	
	
	def reclassSections(){
		print"jjjjjjjjjjjjjjjj"+params
		render template:'sectionlist',model:[sections:IClass.findById(params.classId).sections]
	}

}




