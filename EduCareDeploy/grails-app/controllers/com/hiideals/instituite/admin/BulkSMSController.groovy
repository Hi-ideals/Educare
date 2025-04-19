package com.hiideals.instituite.admin

import grails.plugin.springsecurity.annotation.Secured

import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.student.Student
import com.hiideals.institute.staff.Staff
import com.hiideals.sms.SendSMS

@Secured(["ROLE_ADMIN","ROLE_USERR"])
class BulkSMSController {
def userService
	def index() {
	def classList=IClass.findAllByInstituite(userService.getCurrentInstituite())
	[classList:classList]
	}
	
	def getphonelist={
		def phone =null
		def staffphone=null
		if(params.role1=="Staff"){
			println"!staff!!"
			def Stafflist=Staff.findAllByInstitute(userService.getCurrentInstituite())
		 staffphone=Stafflist
		}else{
		def student=Student.findAllByInstituite(userService.getCurrentInstituite())
		phone = student
		}
		render(template:'/bulkSMS/phoneList',model:[phoneList:phone,staffphone:staffphone])
	}
	
	def getphonelist1={
		print"mmmmmmmmmmmm"+params
		def instituite = userService.getCurrentInstituite()
		def studentList=Student.createCriteria().list(){
			eq ('instituite.id', instituite?.id)
					academicyear{
						presentclass{'in' 'id',IClass.findById(params.iclass)?.id}
	
					}
				}
	def phone = studentList
	
	render(template:'/bulkSMS/phoneList',model:[phoneList:phone])
  }
  
  def sendSMS(){
	  List phoneno=params.list('phone')
	  def allstudent = Student.findAllByInstituite(userService.getCurrentInstituite())
	  def instituite = userService.getCurrentInstituite()
	  def map2=[:]
	   if(params.iclass){
	  def userlist=Student.createCriteria().list(){
		  eq ('instituite.id', instituite?.id)
				  academicyear{
					  presentclass{'in' 'id',IClass.findById(params.iclass)?.id}
  
				  }
		   }
		 userlist.each{sms->
			 map2.put(sms, sms?.fatherDetails?.mobileNumber)
		 }
		
	  }
		 def Stafflist=Staff.findAllByInstitute(userService.getCurrentInstituite())
  
	  def map3=[:]
	  def map=[:]
	  def map1=[:]
	  def map4=[:]
	
	  String message= params.msg
	  def smsinfo=userService.getCurrentAdmin()
	  allstudent.each{sms->
		  map3.put(sms, sms?.fatherDetails?.mobileNumber)
	  }
	  Stafflist.each{sms->
		  map1.put(sms, sms?.address?.mobileNumber)
	  }
	 
	  if(params.role1=="Staff" && params.phone=='all' ){
		  println":::::: ALL STAFF::::::"
		  map1.keySet().each {
			  println"!@!!!"+map1.get(it)
			 // SendSMS.sendSMSDynamic(map1.get(it), message, smsinfo?.smsUsername, smsinfo?.smsPassword, smsinfo?.smsSenderId)
			  
		  }
	  }
	  
	  else if(params.role1=="Student" && params.phone=='all' && params.iclass!="" ){
		  println":::::: CLASSWISE STUDENT::::::"
		  map2.keySet().each {
		 println"!@!!!"+map2.get(it)
			//SendSMS.sendSMSDynamic(map2.get(it), message, smsinfo?.smsUsername, smsinfo?.smsPassword, smsinfo?.smsSenderId)
		  }
	  }
	 
	  else if(params.role1=="Student" && params.phone=='all' && params.iclass=="" ){
		  println":::::: ALL STUDENT::::::"
		  map3.keySet().each {
			 println"!@!!!"+map3.get(it)
			// SendSMS.sendSMSDynamic(map3.get(it), message, smsinfo?.smsUsername, smsinfo?.smsPassword, smsinfo?.smsSenderId)
		  }
	  }else
		  println":::::: PARTICULAR SELECTED USER::::::"
		  phoneno.each{sms->
			  map.put(sms, sms)
		  }
		  map.keySet().each {
			  println"!@!!!"+map.get(it)
			//  SendSMS.sendSMSDynamic(map.get(it), message, smsinfo?.smsUsername, smsinfo?.smsPassword, smsinfo?.smsSenderId)
		  }
		   
	  flash.msg1="SMS sent"
	  redirect (action:'index')
  }

def sendSMS1(){
	  
	  
	 def phoneno  = params.phone.split()
	 println "pgone" +phoneno
	  
	  /*def list =[]
	   list.add(params.phone.split())
	   println "pgoneeee" +list*/
	   
	 
	  String message = params.msg
	  def smsinfo=userService.getCurrentAdmin()
	  def map=[:]
	  
	  phoneno.each{
		  
		 sms->map.put(sms, sms)
		 }
	  map.keySet().each {
		  println"!@!!!"+map.get(it)
		//  SendSMS.sendSMSDynamic(map.get(it), message, smsinfo?.smsUsername, smsinfo?.smsPassword, smsinfo?.smsSenderId)
	  }
	  
	 
       flash.msg1="SMS sent"
	  redirect (action:'index')
  }

}
