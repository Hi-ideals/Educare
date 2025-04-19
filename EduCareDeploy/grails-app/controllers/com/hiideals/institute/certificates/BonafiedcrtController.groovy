package com.hiideals.institute.certificates

import com.hiideals.instituite.feemanagment.Fee;
import com.hiideals.instituite.feemanagment.InstFeeTypes;
import com.hiideals.instituite.main.Instituite;
import com.hiideals.instituite.student.Student;
import com.hiideals.instituite.helper.AcademicYear;
import grails.transaction.Transactional;


import grails.plugin.springsecurity.annotation.Secured;
@Secured(["ROLE_ADMIN","ROLE_USERR"])
class BonafiedcrtController {
	
	def userService
	def studentService
	def batchService
    def index() {
		def batchList = batchService.getListofBatches()
		[batchList:batchList]
	}
	
	
	def aaa={
		def student = (studentService.searchStudent(params))[0]
		def feeInstance = Fee.findByStudentId(student)
		try{
			def Instfeetypes = InstFeeTypes.findAllByInstituite(student.instituite)

			if(feeInstance == null)
				render(template:'studentdisplay',model:[feeInstance:new Fee(params),Instfeetypes:Instfeetypes,student:student])
			else
				render(template:'studentdisplay',model:[feeInstance:feeInstance,Instfeetypes:Instfeetypes,student:student])
		}catch(Exception e){
			render "No Results Found"
			return
		}
	}
	
	def printbonafied(){
		
		def instituite = userService.getCurrentInstituite()
		def stbonafieddetails = Student.findById(params.id)
		Bonafied bncert = new Bonafied()
		bncert.stname = stbonafieddetails.studentName
		bncert.stfathername = stbonafieddetails.fatherDetails.parentName
		bncert.stclass = stbonafieddetails.academicyear.presentclass.classname.last()
		bncert.academicyr = stbonafieddetails.academicyear.academicyear.toString().replace('[', '').replace(']', '')
		bncert.stcharacter = params.stcharacter
		bncert.issueddate = params.studentDOB1
		bncert.save(flush:true,failOnError:true)
		[instituite:instituite,bncert:bncert,stbonafieddetails:stbonafieddetails]
	}
}
