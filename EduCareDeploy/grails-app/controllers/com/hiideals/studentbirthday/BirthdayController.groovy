package com.hiideals.studentbirthday


import grails.plugin.springsecurity.annotation.Secured
import java.sql.Timestamp
import java.text.DateFormat
import java.text.SimpleDateFormat
import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.student.Student
import com.hiideals.sms.SendSMS

@Secured(["ROLE_ADMIN","ROLE_USERR"])

class BirthdayController {
	private static DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
	def userService
	def index() {

		def aa=[]
		def todaysDate=new Timestamp(new Date().getTime()).clearTime()
		def bday=Student.findAllByInstituite(userService.getCurrentInstituite())
		bday?.each {

			//Birthday Wishes
			Date birthday = (it.studentDOB);
			def bdate=birthday.getDate()
			def bmonth=birthday.getMonth()+1
			def tdate=todaysDate.getDate()
			def tmonth=todaysDate.getMonth()+1
			if(bdate.equals(tdate) && bmonth.equals(tmonth)){

				aa.add(it)
			}
		}
		[bdays:aa]


	}
	def bday(){
		def todaysDate=new Timestamp(new Date().getTime()).clearTime()
		def smsinfo=userService.getCurrentAdmin()
		def bday=Student.findAllByStudentDOBAndInstituite(todaysDate,userService.getCurrentInstituite())
		bday.each{
			try {
				SendSMS.sendSMSDynamic(it?.fatherDetails.mobileNumber, params.messgae, smsinfo?.smsUsername, smsinfo?.smsPassword, smsinfo?.smsSenderId)
			} catch (Exception e) {
				e.printStackTrace()
			}
			//SendSMS.sendSMS(it?.fatherDetails.mobileNumber, params.messgae)

		}
		redirect  (controller: "birthday" , action:"index")
	}
	def stubday(){
		def smsinfo=userService.getCurrentAdmin()
		def stu=Student.findById(params.id)
		try {
			SendSMS.sendSMSDynamic(stu.fatherDetails.mobileNumber, params.messgae, smsinfo?.smsUsername, smsinfo?.smsPassword, smsinfo?.smsSenderId)
		} catch (Exception e) {
			e.printStackTrace()
		}
		//SendSMS.sendSMS(stu.fatherDetails.mobileNumber, params.messgae)
		//SendSMS.sendSMS("9886147394", params.messgae)
		redirect  (controller: "birthday" , action:"index")

	}
	
	
	def bydate(){
		def instituite = userService.getCurrentInstituite()
		def from = df.parse(params.from)
		def to =df.parse(params.to)
		Date frmdate = from;
		Date todate = to;
		SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd");
		String fromdate = dateFormater.format(frmdate);
		String todate1 = dateFormater.format(todate);
		println"!!!!!!dd!!!"+fromdate
		println"!!!!!!dd!!!"+todate1
	     /*	def bdaylist=Student.createCriteria().list(params){
					eq ('instituite.id', instituite?.id)
				    between("studentDOB", from, to)				
		 }	
		 */
def ss= Student.executeQuery("from Student where DATE_FORMAT(studentDOB, '%m-%d') between DATE_FORMAT( '" + fromdate + "' , '%m-%d') and DATE_FORMAT('" + todate1 + "', '%m-%d') and instituite.id = '" + instituite?.id + "'")
     	render(template:'bdayList',model:[bdays:ss])
		
	}
	
}
