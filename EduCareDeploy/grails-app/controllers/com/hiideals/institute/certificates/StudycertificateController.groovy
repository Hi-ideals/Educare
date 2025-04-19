package com.hiideals.institute.certificates

import com.hiideals.instituite.feemanagment.Fee;
import com.hiideals.instituite.feemanagment.InstFeeTypes;
import com.hiideals.instituite.main.Instituite;
import com.hiideals.instituite.student.Student;
import com.hiideals.instituite.helper.AcademicYear;

import grails.transaction.Transactional;

import grails.plugin.springsecurity.annotation.Secured

/**
 * @author Praveenkumar
 * @createdOn 09-Dec-2016
 *
 */
@Secured(["ROLE_ADMIN","ROLE_USERR"])
class StudycertificateController {
	
	def userService
	def studentService
	def batchService
    def index() {
		println("Inside study certificate")
		def batchList = batchService.getListofBatches()
		[batchList:batchList]
		
	}
	
	def aaaa={
		println("Study certificate search  :"+params)
		def student = (studentService.searchStudent(params))[0]
		def feeInstance = Fee.findByStudentId(student)
		try{
			def Instfeetypes = InstFeeTypes.findAllByInstituite(student.instituite)

			if(feeInstance == null)
				render(template:'studyDisplay',model:[feeInstance:new Fee(params),Instfeetypes:Instfeetypes,student:student])
			else
				render(template:'studyDisplay',model:[feeInstance:feeInstance,Instfeetypes:Instfeetypes,student:student])
		}catch(Exception e){
			render "No Results Found"
			return
		}
		
		
	}
	
	def printstudycertificate(){
		println("study details")
		def instituite = userService.getCurrentInstituite()
		def stbonafieddetails = Student.findById(params.id)
		println("Save;;;;;;;;"+stbonafieddetails)
		Studycrt studyobj = new Studycrt()
		studyobj.stregistrationnumber = stbonafieddetails.registrationNo
		studyobj.stname = stbonafieddetails.studentName
		studyobj.ftname= stbonafieddetails.fatherDetails.parentName
		studyobj.stdate = params.studentDOB1
		studyobj.fromdate = params.fromdate
		studyobj.todate = params.todate
		studyobj.fromclass = stbonafieddetails.academicyear.presentclass.classname.last()//stbonafieddetails.presentclass.classname
		studyobj.toclass = stbonafieddetails.academicyear.presentclass.classname.last()//stbonafieddetails.presentclass.classname
		studyobj.save(flush:true,failOnError:true)
		[instituite:instituite,studyobj:studyobj]
	}
	
}

