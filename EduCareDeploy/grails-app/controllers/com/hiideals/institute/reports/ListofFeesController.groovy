package com.hiideals.institute.reports

import grails.plugin.springsecurity.annotation.Secured

import java.text.DateFormat
import java.text.SimpleDateFormat

import com.hiideals.instituite.classcourses.IClass;
import com.hiideals.instituite.feemanagment.Fee
import com.hiideals.instituite.feemanagment.FeeTracker;
import com.hiideals.instituite.feemanagment.InstFeeTypes;
import com.hiideals.instituite.helper.AcademicYear;
import com.hiideals.instituite.main.Instituite;
import com.hiideals.instituite.student.Student;

@Secured(["ROLE_ADMIN","ROLE_USERR"])
class ListofFeesController {

	def userService
	def studentService
	def feeService
	def batchService

	def index() {
		println"nooooo"
		def iclass=userService.getAllClasses()
		def feeInstanceList;
		def institute = null;
		feeInstanceList=getFeeDetailsStudets(params)
		print"llllllllllll"+params
		def ss=AcademicYear.findAll()
		def year=ss.academicyear.toSet()
		def batchList = batchService.getListofBatches()
		def studentList =  Student.findAll()
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
		
		
		[discountsum:discountsum,batchList:batchList,academicYearList:batchList,iclass:iclass,studentInstanceList:studentList,feeInstanceList:feeInstanceList,institute: userService.getCurrentInstituite(),Totalsum:Totalsum,Paidsum:Paidsum,duesum:duesum]

	}

	

	def getfeelist(){
		def institute = null;
		def feeInstanceList=getFeeDetailsStudets(params)
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
		[discountsum:discountsum,feeInstanceList:feeInstanceList,institute: userService.getCurrentInstituite(),Totalsum:Totalsum,Paidsum:Paidsum,duesum:duesum]
	}
	
	
	
	
	def getFeeDetailsStudets(params){
		println"suhasasas"+params
		
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");//yyyy-MM-dd");
		df.setLenient(false);
		def feeInstanceList= null;
		def institute = null;

		if(params.typ){
			feeInstanceList = feeService.getSortedfee(params)
		}else
			feeInstanceList = feeService.getInstituteFee(params)

		if(feeInstanceList[0]?.institute)
			institute = feeInstanceList[0]?.institute
		else
			institute = userService.getCurrentInstituite()

		if(params.from){
			
			def from = null
			def to = null
			from = new java.sql.Timestamp(df.parse(params.from).getTime())
			to = new java.sql.Timestamp(df.parse(params.to).getTime())
			
			
			//feeInstanceList = Fee.executeQuery("from Fee as fees where fees.dateCreated between ? and ?",[from,to] +"and fees.institute=?",[institute])
			feeInstanceList=Fee.createCriteria().list(params) {
				print"aaaaaaaa"+params
				eq('institute',institute)
				if(params.from)
				 between("dateCreated", from, to)
			}

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
		
		//render(template:'bwndayfeelist',model:[feeInstanceList:feeInstanceList,Totalsum:Totalsum,Paidsum:Paidsum,duesum:duesum])
		return feeInstanceList
	}
	
	def getFeeDetailsStudets2(params){
		println"suhasasasssssssssssss"
		
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");//yyyy-MM-dd");
		df.setLenient(false);
		def feeInstanceList= null;
		def institute = null;

		if(params.typ){
			feeInstanceList = feeService.getSortedfee(params)
		}else
			feeInstanceList = feeService.getInstituteFee(params)

		if(feeInstanceList[0]?.institute)
			institute = feeInstanceList[0]?.institute
		else
			institute = userService.getCurrentInstituite()
def feeInstanceList1
		if(params.to){
			def from = null
			def to = null
			from = new java.sql.Timestamp(df.parse(params.from).getTime()).clearTime()
			to = new java.sql.Timestamp(df.parse(params.to).getTime()).clearTime()
			
			
			//feeInstanceList = Fee.executeQuery("from Fee as fees where fees.dateCreated between ? and ?",[from,to] +"and fees.institute=?",[institute])
			feeInstanceList1=Fee.createCriteria().list {
				eq('institute',institute)
				 between("lastUpdated", from, to)
			}
			feeInstanceList=FeeTracker.createCriteria().list {
				eq('institute',institute)
				 between("dateCreated", from, to)
			}

		}
		
		
		int Totalsum = 0;
		/*(feeInstanceList?.totalFee).each {
			Totalsum=Totalsum+it
		}*/
		int Paidsum = 0;
		/*(feeInstanceList?.totalPaid).each {
			Paidsum=Paidsum+it
		}*/
		int duesum = 0;
		/*(feeInstanceList?.due).each {
			duesum=duesum+it
		}*/
		int discountsum = 0;
		/*(feeInstanceList?.discount).each {
			discountsum=discountsum+it
		}*/
		
		render(template:'bwndayfeelist',model:[feeInstanceList1:feeInstanceList1,feeInstanceList:feeInstanceList,Totalsum:Totalsum,Paidsum:Paidsum,duesum:duesum])
		//return feeInstanceList
	}
	
	def individualstudentFees(){
	//	def tracker = FeeTracker.findAllByStudentName(params.studentName)
		def student = (studentService.searchStudent(params))[0]
		def institute = userService.getCurrentInstituite()
		
		
		
				def feeInstance = Fee.findByStudentId(student)
				def Instfeetypes = InstFeeTypes.findAllByInstituite(student?.instituite)
				
				
				
				
				DateFormat df = new SimpleDateFormat("MM/dd/yyyy");//yyyy-MM-dd");
				
				if(params.from){
					
					def from = null
					def to = null
					from = new java.sql.Timestamp(df.parse(params.from).getTime())
					to = new java.sql.Timestamp(df.parse(params.to).getTime())
					
					
				
					//def trackerr = FeeTracker.findAllByDateCreated(from)
			def tracker =FeeTracker.createCriteria().list(params) {
						
						eq('institute',institute)
						if(params.from)
						 between("dateCreated", from, to)
					}
			
		
					
				def paidlist = tracker?.feetypetracker?.amountPaidT
				
				def tobepaidlist = tracker?.feetypetracker?.dueT
				
				
				
				ArrayList<Integer> arl = new ArrayList<Integer>();
				ArrayList<Integer> ar = paidlist
				
				int i, x;
				for ( i = 0; i < ar.size; i++) {
					 int[] array = ar[i];
			
				
				int sum = 0;
				for( int num : array) {
					sum = sum+num;
					x=sum
					}
				
				arl.add(x)
			
				}
				
			int Paidsum = 0;
				(arl).each {
					Paidsum=Paidsum+it
				}
				
				int Paidadmissionsum = 0;
				(tracker.paidadmissionfee).each {
					Paidadmissionsum=Paidadmissionsum+it
				}
				
				int bothfees = 0;
				bothfees=Paidadmissionsum+Paidsum
				
				def temptracker = null;
				for(FeeTracker ff in tracker){
					if(ff.dateCreated.toString() == from){
						temptracker = ff
					}
				}
				
				ArrayList<Integer> arrl = new ArrayList<Integer>();
				ArrayList<Integer> arr = tobepaidlist
				int j, y;
				for ( j = 0; j < arr.size; j++) {
					 int[] array = arr[j];
			
				
				int summ = 0;
				for( int num : array) {
					summ = summ+num;
					y=summ
					}
				
				arrl.add(y)
			
				}
				
				
				int Duesum = 0;
				(arrl).each {
					Duesum=Duesum+it
				}
				
				def stdID = tracker?.studentId
				
				ArrayList<Integer> arryl = new ArrayList<Integer>();
				ArrayList<Integer> arry = stdID
				for (int z = 0; z < arry.size; z++) {
					int[] array1 = arry[z];
					def stdetails = Student.findById(array1)
					arryl.add(stdetails)
				}
					
				
				[arryl:arryl,Duesum:Duesum,arrl:arrl,arl:arl,bothfees:bothfees,Paidadmissionsum:Paidadmissionsum,Paidsum:Paidsum,tracker:tracker,feeInstance:feeInstance,Instfeetypes:Instfeetypes,institute:institute]
	}	}
	
	
	def getOndatefeereportprint(){
		//	def tracker = FeeTracker.findAllByStudentName(params.studentName)
		def student = (studentService.searchStudent(params))[0]
		def institute = userService.getCurrentInstituite()
		
		
		
				def feeInstance = Fee.findByStudentId(student)
				def Instfeetypes = InstFeeTypes.findAllByInstituite(student?.instituite)
				
				
				
				
				DateFormat df = new SimpleDateFormat("MM/dd/yyyy");//yyyy-MM-dd");
				
				if(params.from){
					
					def from = null
					def to = null
					from = new java.sql.Timestamp(df.parse(params.from).getTime())
					to = new java.sql.Timestamp(df.parse(params.to).getTime())
					
					
				
					//def trackerr = FeeTracker.findAllByDateCreated(from)
			def tracker =FeeTracker.createCriteria().list(params) {
						
						eq('institute',institute)
						if(params.from)
						 between("dateCreated", from, to)
					}
			
		
					
				def paidlist = tracker?.feetypetracker?.amountPaidT
				
				def tobepaidlist = tracker?.feetypetracker?.dueT
				
				
				
				ArrayList<Integer> arl = new ArrayList<Integer>();
				ArrayList<Integer> ar = paidlist
				
				int i, x;
				for ( i = 0; i < ar.size; i++) {
					 int[] array = ar[i];
			
				
				int sum = 0;
				for( int num : array) {
					sum = sum+num;
					x=sum
					}
				
				arl.add(x)
			
				}
				
			int Paidsum = 0;
				(arl).each {
					Paidsum=Paidsum+it
				}
				
				int Paidadmissionsum = 0;
				(tracker.paidadmissionfee).each {
					Paidadmissionsum=Paidadmissionsum+it
				}
				
				int bothfees = 0;
				bothfees=Paidadmissionsum+Paidsum
				
				def temptracker = null;
				for(FeeTracker ff in tracker){
					if(ff.dateCreated.toString() == from){
						temptracker = ff
					}
				}
				
				ArrayList<Integer> arrl = new ArrayList<Integer>();
				ArrayList<Integer> arr = tobepaidlist
				int j, y;
				for ( j = 0; j < arr.size; j++) {
					 int[] array = arr[j];
			
				
				int summ = 0;
				for( int num : array) {
					summ = summ+num;
					y=summ
					}
				
				arrl.add(y)
			
				}
				
				
				int Duesum = 0;
				(arrl).each {
					Duesum=Duesum+it
				}
				
				def stdID = tracker?.studentId
				
				ArrayList<Integer> arryl = new ArrayList<Integer>();
				ArrayList<Integer> arry = stdID
				for (int z = 0; z < arry.size; z++) {
					int[] array1 = arry[z];
					def stdetails = Student.findById(array1)
					arryl.add(stdetails)
				}
					
				
				[arryl:arryl,Duesum:Duesum,arrl:arrl,arl:arl,bothfees:bothfees,Paidadmissionsum:Paidadmissionsum,Paidsum:Paidsum,tracker:tracker,feeInstance:feeInstance,Instfeetypes:Instfeetypes,institute:institute]
	}
		
	}
	
	
	def viewfeedetail(){
		def tracker = FeeTracker.findAllByStudentId(params.int('stid'))
		def instituite = userService.getCurrentInstituite()
		def temptracker = null;
		for(FeeTracker ff in tracker){
			if(ff.id.toString() == params.ftid){
				temptracker = ff
			}
		}
		[temptracker:temptracker,tracker:tracker,instituite:instituite]
	}
	
	/*def aa={
		
		println("serach student by registration number and name")
		def student = (studentService.searchStudent(params))[0]

		def feeInstance = Fee.findByStudentId(student)
		def Instfeetypes = InstFeeTypes.findAllByInstituite(student.instituite)
		println("search fee instance  :"+feeInstance)
		println("search Instfeetypes  :"+Instfeetypes)
		[feeInstance:feeInstance,Instfeetypes:Instfeetypes]
		try{
			def Instfeetypes = InstFeeTypes.findAllByInstituite(student.instituite)

			if(feeInstance == null)
				render(template:'feeDisplay',model:[feeInstance:new Fee(params),Instfeetypes:Instfeetypes,student:student])
			else
				render(template:'feeDisplay',model:[feeInstance:feeInstance,Instfeetypes:Instfeetypes,student:student])
		}catch(Exception e){
			render "No Results Found"
			return
		}
	}*/
	
	def byYear(){
		
		
		def clsname
		def feeInstanceList;
		def institute = null;
		if(params.iclass!='all'){
			clsname = IClass.findById(params.iclass).classname
		   }
		
		def instituite = userService.getCurrentInstituite()
		def studentList = null
		if(params.iclass.equals('all') && params.iyear.equals('all')){
		//studentList = Fee.findAllByInstitute(instituite)
			studentList =  Fee.createCriteria().list(params){
				eq ('institute', userService.getCurrentInstituite())
				studentId {
					eq ( 'transfer' ,false)
				}}
			
		render(template:'allListbyYearFees',model:[studentInstanceList:studentList,studentInstanceCount: studentList.size(),instituite:instituite,academicYearList:AcademicYear.findAll(),clsname:clsname])
		}else if(params.iyear != "all" && params.iclass !="all"){
				studentList=Fee.createCriteria().list(){
					eq ('institute.id', instituite?.id)
					
						academic{
							eq ('academicyear', params.iyear)
							presentclass{'in' 'id',IClass.findById(params.iclass)?.id}
							}
				
					}
					render(template:'allListbyYearFees',model:[studentInstanceList:studentList,studentInstanceCount: studentList.size(),instituite:instituite,academicYearList:AcademicYear.findAll(),clsname:clsname])
			}else if(params.iclass != "all" && params.iyear.equals('all')){
				println"@@@class"+params.iclass
				studentList=Fee.createCriteria().list(){
					eq ('institute.id', instituite?.id)
					
					academic{
						presentclass{'in' 'id',IClass.findById(params.iclass)?.id}
	
					
					}
	
				}
				render(template:'allListbyYearFees',model:[studentInstanceList:studentList,studentInstanceCount: studentList.size(),instituite:instituite,academicYearList:AcademicYear.findAll(),clsname:clsname])
			}else if(params.iyear != "all" && params.iclass.equals('all')){
				
				studentList=Fee.createCriteria().list(){
					eq ('institute.id', instituite?.id)
					academic{
							eq ('academicyear', params.iyear)
						}
				
					}
					
					
					render(template:'allListbyYearFees',model:[studentInstanceList:studentList,studentInstanceCount: studentList.size(),instituite:instituite,academicYearList:AcademicYear.findAll(),clsname:clsname])
			}
	}
	
	def byYearPrint(){
		
		def feeInstanceList;
		def institute = null;
		
		def instituite = userService.getCurrentInstituite()
		def studentList = null
		if(params.iclass=="all" && params.iyear=="all"){
		studentList = Fee.findAllByInstitute(instituite)
		[studentInstanceList:studentList,studentInstanceCount: studentList.size(),instituite:instituite,academicYearList:AcademicYear.findAll()]
		}else if(params.iyear != "all" && params.iclass !="all"){
				studentList=Fee.createCriteria().list(){
					eq ('institute.id', instituite?.id)
					studentId{
						
						
						academicyear{
							eq ('academicyear', params.iyear)
							presentclass{'in' 'id',IClass.findById(params.iclass)?.id}
							}
					}
					}
			[studentInstanceList:studentList,studentInstanceCount: studentList.size(),instituite:instituite,academicYearList:AcademicYear.findAll()]
			}else if(params.iclass != "all"){
				studentList=Fee.createCriteria().list(){
					eq ('institute.id', instituite?.id)
					studentId{
					academicyear{
						presentclass{'in' 'id',IClass.findById(params.iclass)?.id}
	
					}
					}
	
				}
				[studentInstanceList:studentList,studentInstanceCount: studentList.size(),instituite:instituite,academicYearList:AcademicYear.findAll()]
			}else if(params.iyear != "all"){
				studentList=Fee.createCriteria().list(){
					eq ('institute.id', instituite?.id)
					studentId{
					academicyear{
							eq ('academicyear', params.iyear)
						}
					}
					}
					[studentInstanceList:studentList,studentInstanceCount: studentList.size(),instituite:instituite,academicYearList:AcademicYear.findAll()]
			}
		
	}
	
}

