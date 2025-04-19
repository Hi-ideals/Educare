package com.hiideals.institute.reports

import com.hiideals.instituite.classcourses.IClass
import grails.plugin.springsecurity.annotation.Secured

import com.hiideals.instituite.feemanagment.Admissionfee;
import com.hiideals.instituite.feemanagment.Fee
import com.hiideals.instituite.feemanagment.InstFeeTypes
import com.hiideals.instituite.student.Student;
import com.hiideals.instituite.helper.AcademicYear;

@Secured(["ROLE_ADMIN","ROLE_USERR"])
class ListofFeeTypesController {
	
	def userService
	def studentService
	def batchService
	def feeService
    def index() {
		def iclass=userService.getAllClasses()
		def batchList = batchService.getListofBatches()
		def studentList = Student.findAll()
		def iClassList = IClass.findAll()
		def inst = userService.getCurrentInstituite()
		def instfeetypes = InstFeeTypes.findAllByInstituite(inst)
		
		int Totalsum = 0;
		(instfeetypes?.totalAmount).each {
			Totalsum=Totalsum+it
		}
		[Totalsum:Totalsum,batchList:batchList,studentInstanceList:studentList,iClassList:iClassList,instfeetypes:instfeetypes,iclass:iclass]
		
	}
	
	def typeOfFees(){
		def inst = userService.getCurrentInstituite()
		
		def iClassList = IClass.findById(params.iclass)
		
		def admfee = Admissionfee.findByInstituiteAndIclass(inst, iClassList)
		def instfeetypes = InstFeeTypes.findAllByInstituiteAndIclass(inst,iClassList)
		
		int Totalsum = 0;
		(instfeetypes?.totalAmount).each {
			Totalsum=Totalsum+it
		}
		if(admfee !=null){
			Totalsum = Totalsum+admfee.totalAmount
		}else{
		Totalsum=Totalsum
		}
		
		render(template:'classfeetypelist',model:[instfeetypes:instfeetypes,Totalsum:Totalsum,iClassList:iClassList,admfee:admfee])
		
		
	}
	def getfeelistprint(){
		if(params.iclass.empty){
			def inst = userService.getCurrentInstituite()
			def instfeetypes = InstFeeTypes.findAllByInstituite(inst)
			int Totalsum = 0;
			(instfeetypes?.totalAmount).each {
				Totalsum=Totalsum+it
			}
			[instfeetypes:instfeetypes,instituite:inst,Totalsum:Totalsum]
		}else{
		def inst = userService.getCurrentInstituite()
		
		println("typeOfFees........:"+inst.id)
		def iClassList = IClass.findById(params.iclass)
		println("iclass list....:"+iClassList)
		
		def instfeetypes = InstFeeTypes.findAllByInstituiteAndIclass(inst,iClassList)
		int Totalsum = 0;
		(instfeetypes?.totalAmount).each {
			Totalsum=Totalsum+it
		}
		[instfeetypes:instfeetypes,instituite:inst,Totalsum:Totalsum]
		}
	}
	
	def classgetfeelistprint(){
		def inst = userService.getCurrentInstituite()
		
		def iClassList = IClass.findById(params.iclass)
		
		def admfee = Admissionfee.findByInstituiteAndIclass(inst, iClassList)
		def instfeetypes = InstFeeTypes.findAllByInstituiteAndIclass(inst,iClassList)
		
		int Totalsum = 0;
		(instfeetypes?.totalAmount).each {
			Totalsum=Totalsum+it
		}
		if(admfee !=null){
			Totalsum = Totalsum+admfee.totalAmount
		}else{
		Totalsum=Totalsum
		}
		
		[instfeetypes:instfeetypes,Totalsum:Totalsum,iClassList:iClassList,admfee:admfee,instituite:inst]
	}
}
