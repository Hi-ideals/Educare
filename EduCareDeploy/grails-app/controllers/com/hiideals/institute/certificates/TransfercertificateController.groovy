package com.hiideals.institute.certificates

import grails.plugin.springsecurity.annotation.Secured

import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.feemanagment.Fee
import com.hiideals.instituite.feemanagment.InstFeeTypes
import com.hiideals.instituite.student.Student

@Secured(["ROLE_ADMIN","ROLE_USERR"])
class TransfercertificateController {
	
	def userService
	def studentService
	def batchService
    def index() { 
		def batchList = batchService.getListofBatches()
		[batchList:batchList]
	}
	
	def tcdoc(){
		def student = (studentService.searchStudent(params))[0]
		def feeInstance = Fee.findByStudentId(student)
		try{
			def Instfeetypes = InstFeeTypes.findAllByInstituite(student.instituite)

			if(feeInstance == null)
				render(template:'tcstudentdisplay',model:[feeInstance:new Fee(params),Instfeetypes:Instfeetypes,student:student])
			else
				render(template:'tcstudentdisplay',model:[feeInstance:feeInstance,Instfeetypes:Instfeetypes,student:student])
		}catch(Exception e){
			render "No Results Found"
			return
		}
	}
	def printtransfercertificate(){
		def instituite = userService.getCurrentInstituite()
		def tcDetails = Student.findById(params.id)
	
		def feeInstance =Fee.findByStudentId(tcDetails)
		
		boolean isClear = true
		if(!tcDetails.academicyear.feeId.contains(null)){
			def feedue = tcDetails.academicyear.feeId?.due
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
		
			println("first time payment")
			isClear = false
			}
		if(!isClear){
			
			flash.msgtcfee= tcDetails.studentName+" " + "has not paid full fees. "
			def classione=IClass.findById(tcDetails.academicyear[0]?.presentclass?.id)
			redirect(controller:'student', action:'transfer',params:[id:(params.id)])
			//redirect(controller:'fee', action:'edit',id:(feeInstance.id.toString()).bytes.encodeBase64().toString())
		
		}else{
		println("This student has paid complete fees.....:") 
		println "yeaccr------>" + instituite.id
		
		Transfercertificate tcdocument = new Transfercertificate()
		tcdocument.instName = tcDetails.instituite.name
		tcdocument.admissionnumber = tcDetails.registrationNo
		tcdocument.stName = tcDetails.studentName
		tcdocument.stDOB = tcDetails.studentDOB
		tcdocument.stfatherName = tcDetails.fatherDetails.parentName
		tcdocument.stmotherName = tcDetails.motherDetails.parentName
		tcdocument.stReligion = tcDetails.religion
		tcdocument.stNationality = tcDetails.nationality
		tcdocument.stGender = tcDetails.gender
		tcdocument.stCategory = tcDetails.category
		tcdocument.stClass = tcDetails.academicyear.presentclass.classname.last()
		tcdocument.stSection = tcDetails.academicyear.section.sectionName.last()
		tcdocument.mediumofInstruction = params.mediumofInstruction
		tcdocument.stadmissionDate = tcDetails.studentDOJ
		tcdocument.stPromotion = params.stPromotion
		tcdocument.stfeePaid = params.stfeePaid
		tcdocument.stScholarship = params.stScholarship
		tcdocument.stmedicalExamine = params.stmedicalExamine
		tcdocument.stTcissuedate = params.stTcissuedate
		tcdocument.stlastattendancedate = params.stlastattendancedate
		tcdocument.noOfschoolDays = params.noOfschoolDays
		tcdocument.noOfstattendanceDays = params.noOfstattendanceDays
		tcdocument.stCharacterconduct = params.stCharacterconduct
		tcdocument.academicyear = params.academicyear
		tcdocument.instid = instituite.id
		tcDetails.transfer = true
		tcdocument.save(flush:true,failsOnError:true)
		[instituite:instituite,tcdocument:tcdocument,tcDetails:tcDetails]
	}
}
	}
