package com.hiideals.institute.certificates
import com.hiideals.instituite.feemanagment.Fee;
import com.hiideals.instituite.feemanagment.InstFeeTypes;
import com.hiideals.instituite.main.Instituite;
import com.hiideals.instituite.student.Student;

import grails.transaction.Transactional;
import grails.plugin.springsecurity.annotation.Secured;
import com.hiideals.instituite.helper.AcademicYear;

@Secured(["ROLE_ADMIN","ROLE_USERR"])
class CharactercertificateController {
	
	def userService
	def studentService
	def batchService
    def index() { 
		def batchList = batchService.getListofBatches()
		[batchList:batchList]
		
	}
	
	def stsearch={
		def student = (studentService.searchStudent(params))[0]
		def feeInstance = Fee.findByStudentId(student)
		try{
			def Instfeetypes = InstFeeTypes.findAllByInstituite(student.instituite)

			if(feeInstance == null)
				render(template:'stcharacterdisplay',model:[feeInstance:new Fee(params),Instfeetypes:Instfeetypes,student:student])
			else
				render(template:'stcharacterdisplay',model:[feeInstance:feeInstance,Instfeetypes:Instfeetypes,student:student])
		}catch(Exception e){
			render "No Results Found"
			return
		}
		
	}
	def printcharactercrt(){
		def instituite = userService.getCurrentInstituite()
		def stcharacterdetails = Student.findById(params.id)
		Charactercrt characterInstance = new Charactercrt()
		characterInstance.regNo = stcharacterdetails.registrationNo
		characterInstance.stname = stcharacterdetails.studentName
		characterInstance.ftname = stcharacterdetails.fatherDetails.parentName
		characterInstance.batchno = stcharacterdetails.academicyear.academicyear.toString().replace('[', '').replace(']', '')//stcharacterdetails.batchno
		characterInstance.stclass = stcharacterdetails.academicyear.presentclass.classname.last()
		characterInstance.crtdate = params.studentDOB1
		characterInstance.stcharacter = params.stcharacter
		characterInstance.save(flush:true,failOnError:true)
		[characterInstance:characterInstance,instituite:instituite]
		
	}
}
