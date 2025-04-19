package com.hiideals.instituite.helper



import grails.plugin.springsecurity.annotation.Secured

import com.hiideals.instituite.admin.Admin
import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.student.Student
import com.hiideals.institute.staff.Staff
import com.hiideals.sms.SendSMS

@Secured(["ROLE_ADMIN","ROLE_USERR"])
class SMSController {

	def studentService;
	def staffService;
	def userService;
	def SmsService;

	def index() {
		[staffs:staffService.getAllStaffs(params),students:studentService.getAllStudents(params),classes:IClass.findAllByInstituite(userService.getCurrentInstituite())]
	}

	def getStaffsAndStudents() {
		def studentsOrStaff=SmsService.getSmsList(params)

		if(params.student)
		{
			render template:'listofstudenttable',model:[studentInstanceList:studentsOrStaff,params:params]
		}
		if(params.staff)
		{
			render template:'listofstafftable',model:[staffInstance:studentsOrStaff,params:params]
		}

	}

	def sendMessageToStudents(){
		Admin currentAdmin=userService.getCurrentAdmin()
		if(params.messagetoall){
			try{
				for(int i=0;i<params.loopSize;i++){
					Student student=Student.findById(params["studentId${i}"])
					SendSMS.sendSMSDynamic(student.fatherDetails.mobileNumber,params.notemessage,currentAdmin.smsUsername,currentAdmin.smsPassword,currentAdmin.smsSenderId)
				}
			}catch(Exception e){
				e.printStackTrace()
			}
		}else{
			Student student=Student.findById(params.int('stId'))
			try {
				SendSMS.sendSMSDynamic(student.fatherDetails.mobileNumber,params.notemessage,currentAdmin.smsUsername,currentAdmin.smsPassword,currentAdmin.smsSenderId)
			} catch (Exception e) {
				e.printStackTrace()
			}
		}
		redirect(action:'index')
	}
	
	
	def sendMessageTostaffs(){
		Admin currentAdmin=userService.getCurrentAdmin()
		if(params.messagetoall){
			try{
				for(int i=0;i<params.loopSize;i++){
					Staff staff=Staff.findById(params["staffId${i}"])
					SendSMS.sendSMSDynamic(staff.mobileNumber,params.notemessage,currentAdmin.smsUsername,currentAdmin.smsPassword,currentAdmin.smsSenderId)
				}
			}catch(Exception e){
				e.printStackTrace()
			}
		}else{
			Staff staff=Staff.findById(params.int('stId'))
			try {
				SendSMS.sendSMSDynamic(staff.mobileNumber,params.notemessage,currentAdmin.smsUsername,currentAdmin.smsPassword,currentAdmin.smsSenderId)
			} catch (Exception e) {
				e.printStackTrace()
			}
		}
		redirect(action:'index')
		
	}
	
	
	
	
	
}
