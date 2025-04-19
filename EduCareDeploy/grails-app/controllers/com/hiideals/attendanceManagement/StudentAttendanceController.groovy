package com.hiideals.attendanceManagement




import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional

import java.text.DateFormat
import java.text.SimpleDateFormat

import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.classcourses.Section
import com.hiideals.instituite.classcourses.Subject
import com.hiideals.instituite.student.Student
import com.hiideals.institute.staff.Staff
import com.hiideals.sms.SendSMS

@Secured(["ROLE_ADMIN","ROLE_USERR"])
class StudentAttendanceController {


	def userService;
	def studentService;
	private static DateFormat df = new SimpleDateFormat("MM/dd/yyyy");//yyyy-MM-dd");
	static allowedMethods = [update: "PUT", delete: "DELETE"]

	def index(Integer max) {
		params.max = Math.min(max ?: 100, 100)
		respond StudentAttendance.list(params), model:[studentAttendanceInstanceCount: StudentAttendance.count()]
	}

	def show(StudentAttendance studentAttendanceInstance) {
		respond studentAttendanceInstance
	}

	def create() {

		respond new StudentAttendance(params),model:[classes:userService.getAllClasses(),staffs:userService.getAllStaff(),subjects:userService.getAllSubjects()]
	}

	def getStudentAttendanceSheet(){
		def attendUpdateBy=Staff.findById(params.int('attendanceUpdatedBy'))
		def iclass=IClass.findById(params.int('iclass'))
		def subject=Subject.findById(params.int('subject'))
		def staffName=Staff.findById(params.int('staffName'))
		def institute1=userService.getCurrentInstituite()

		def criteria=Student.createCriteria()
		def studentList=criteria.list{
			instituite { 'in' 'id',institute1?.id}
			academicyear{
			presentclass { 'in' 'id',iclass?.id}
			if(params.section!='Select Section'){
				eq('section',Section.findById(params.int('section')))
			}
			eq('status','current')
		}
		}

		[params:params,attendUpdateBy:attendUpdateBy,iclass:iclass,subject:subject,staffName:staffName,institue:institute1,studentList:studentList]
	}

	def studentsAttendanceList(){

		[classes:userService.getAllClasses(),students:studentService.getAllStudents(params)]
	}

	def getStudentAttendanceDetails(params){
		def aa = studentService.getStudentsAttendance(params)

		if(params.attendanceType=='Daily'){
			def studentList = [:]
			aa.eachWithIndex {it,int i->
				if(studentList.keySet().size()>0 && studentList.keySet().contains(it.student)){
					def studentAttendanceMap = studentList.get(it.student)
					studentAttendanceMap.putAt(it.attendanceDate,it.status)
					studentList.putAt(it.student,studentAttendanceMap )
				}else{def studentAttendanceMap = [:]
					studentAttendanceMap.putAt(it.attendanceDate,it.status)
					studentList.putAt(it.student,studentAttendanceMap )
				}
			}
			studentList.keySet().each {
				def map = studentList.get(it)
				def sortedMap = [:]
				map.keySet().sort().each {
					sortedMap.put(it, map.getAt(it))
				}
				studentList.put(it, sortedMap)
			}
			render template:'studentsAttendanceDetails',model:[params:params,studentList:studentService.getStudentsAttendance(params),studentAttendanceList:studentList]}
		else{
			def studentList = [:]
			def studentAttendanceMap=[]
			aa.eachWithIndex {it,int i->
				if(studentList.keySet().size()>0 && studentList.keySet().contains(it.student)){
					studentAttendanceMap = studentList.get(it.student)
					studentAttendanceMap.putAt(it.attendanceDate.getDate(),it.status)
					studentList.putAt(it.student,studentAttendanceMap )
				}else{
					studentAttendanceMap = [:]
					studentAttendanceMap.putAt(it.attendanceDate.getDate(),it.status)
					studentList.putAt(it.student,studentAttendanceMap )
				}
			}
			studentList.keySet().each {
				def map = studentList.get(it)
				def sortedMap = [:]
				map.keySet().sort().each {
					sortedMap.put(it, map.getAt(it))
				}
				studentList.put(it, sortedMap)
			}
			
			def studentattendence = [:]	//student : attendenceMap
			(studentList.keySet()).each{stit->
				println "student : "+stit
				def attendenceMap = [:]		// date   : status

				def attendenceSet = (studentList.get(stit))
				(1..31).each {
					if((attendenceSet.keySet()).contains(it)){
						attendenceMap.put(it, attendenceSet.get(it))
					}else{
						attendenceMap.put(it, "-")
					}
				}
				studentattendence.put(stit, attendenceMap)
			}
			render template:'monthlySheet',model:[studentattendence:studentattendence,studentList:studentService.getStudentsAttendance(params),studentAttendanceList:studentList,keys:studentList.keySet()]
		}
	}


	def classAndSectionStudents(){
		render template:'classStudent',model:[classStudents:studentService.getClassStudents(params) ]
	}


	def classSections(){
		render template:'classSections',model:[sections:IClass.findById(params.classId).sections]
	}



	@Transactional
	def save() {
		df.setLenient(false);
		def p=0;
		def a=0;
		def faculty=Staff.findById(params.int('staffName'))
		def classN=IClass.findById(params.int('iclass'))
		def attUpdatedBy=Staff.findById(params.int('attendanceUpdatedBy'))
		def subject=Subject.findById(params.int('subject'))
		for(int i=0;i<(params.loopSize.toInteger());i++)
		{
			StudentAttendance  st = new StudentAttendance();
			def student= Student.findById(params["studentID${i}"])
			def takenAttendance=StudentAttendance.findByAttendanceDateAndStudent(df.parse(params.attendanceDate1),student)
			if(takenAttendance){}else{
				st.student=student
				if(params["status${i}"]=='on')
				{
					p++
					st.status="P"
				}
				else{
					st.status="A"
					a++
					SendSMS.sendSMSDynamic(student?.fatherDetails?.mobileNumber, "Dear Parents, "+student?.studentName+" has not been present for the day "+ params.attendanceDate1,smsinfo?.smsUsername, smsinfo?.smsPassword, smsinfo?.smsSenderId)
				}
				st.remarks=params["remarks${i}"]
				st.institue=userService.getCurrentInstituite()
				st.attendanceDate =df.parse(params.attendanceDate1)
				st.attendanceUpdatedBy=attUpdatedBy
				st.iclass=classN
				st.subject=subject
				if(params.int('section')){st.section=Section.findById(params.int('section'))}
				st.staffName=faculty
				st.save(flush:true,failOnError:true)
			}
		}

		//SendSMS.sendSMS("9738939533", "Date : "+params.attendanceDate1+"\n"+"Present : "+p+"\n"+"Absent : "+a+"\n"+"Faculty : "+faculty?.staffName+"\n"+"class : "+classN.classname)
			redirect(action:'create')
	}



	def edit(StudentAttendance studentAttendanceInstance) {
		respond studentAttendanceInstance
	}

	@Transactional
	def update(StudentAttendance studentAttendanceInstance) {
		if (studentAttendanceInstance == null) {
			notFound()
			return
		}

		if (studentAttendanceInstance.hasErrors()) {
			respond studentAttendanceInstance.errors, view:'edit'
			return
		}

		studentAttendanceInstance.save flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.updated.message', args: [
					message(code: 'StudentAttendance.label', default: 'StudentAttendance'),
					studentAttendanceInstance.id
				])
				redirect studentAttendanceInstance
			}
			'*'{ respond studentAttendanceInstance, [status: OK] }
		}
	}

	@Transactional
	def delete(StudentAttendance studentAttendanceInstance) {

		if (studentAttendanceInstance == null) {
			notFound()
			return
		}

		studentAttendanceInstance.delete flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.deleted.message', args: [
					message(code: 'StudentAttendance.label', default: 'StudentAttendance'),
					studentAttendanceInstance.id
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
					message(code: 'studentAttendance.label', default: 'StudentAttendance'),
					params.id
				])
				redirect action: "index", method: "GET"
			}
			'*'{ render status: NOT_FOUND }
		}
	}

	def printattendance(){
		def aa = studentService.getStudentsAttendance(params)
		println("aa...  :"+aa)
		def studentList = [:]
			def studentAttendanceMap=[]
			aa.eachWithIndex {it,int i->
				if(studentList.keySet().size()>0 && studentList.keySet().contains(it.student)){
					studentAttendanceMap = studentList.get(it.student)
					studentAttendanceMap.putAt(it.attendanceDate.getDate(),it.status)
					studentList.putAt(it.student,studentAttendanceMap )
				}else{
					studentAttendanceMap = [:]
					studentAttendanceMap.putAt(it.attendanceDate.getDate(),it.status)
					studentList.putAt(it.student,studentAttendanceMap )
				}
			}
			studentList.keySet().each {
				def map = studentList.get(it)
				def sortedMap = [:]
				map.keySet().sort().each {
					sortedMap.put(it, map.getAt(it))
				}
				studentList.put(it, sortedMap)
			}
			
			def studentattendence = [:]	//student : attendenceMap
			(studentList.keySet()).each{stit->
				println "student : "+stit
				def attendenceMap = [:]		// date   : status

				def attendenceSet = (studentList.get(stit))
				(1..31).each {
					if((attendenceSet.keySet()).contains(it)){
						attendenceMap.put(it, attendenceSet.get(it))
					}else{
						attendenceMap.put(it, "-")
					}
				}
				studentattendence.put(stit, attendenceMap)
			}
		//[studentList:studentService.getStudentsAttendance(params),studentAttendanceList:studentList,instituite:instituite]
			def institute1=userService.getCurrentInstituite()
		[studentattendence:studentattendence,studentList:studentService.getStudentsAttendance(params),studentAttendanceList:studentList,keys:studentList.keySet(),instituite:institute1]
		}

	def printattendencedaily(){
		def aa = studentService.getStudentsAttendance(params)

		if(params.attendanceType=='Daily'){
			def studentList = [:]
			aa.eachWithIndex {it,int i->
				if(studentList.keySet().size()>0 && studentList.keySet().contains(it.student)){
					def studentAttendanceMap = studentList.get(it.student)
					studentAttendanceMap.putAt(it.attendanceDate,it.status)
					studentList.putAt(it.student,studentAttendanceMap )
				}else{def studentAttendanceMap = [:]
					studentAttendanceMap.putAt(it.attendanceDate,it.status)
					studentList.putAt(it.student,studentAttendanceMap )
				}
			}
			studentList.keySet().each {
				def map = studentList.get(it)
				def sortedMap = [:]
				map.keySet().sort().each {
					sortedMap.put(it, map.getAt(it))
				}
				studentList.put(it, sortedMap)
			}
			def instituite=userService.getCurrentInstituite()
			[params:params,instituite:instituite,params:params,studentList:studentService.getStudentsAttendance(params),studentAttendanceList:studentList]
			}else{
			def studentList = [:]
			def studentAttendanceMap=[]
			aa.eachWithIndex {it,int i->
				if(studentList.keySet().size()>0 && studentList.keySet().contains(it.student)){
					studentAttendanceMap = studentList.get(it.student)
					studentAttendanceMap.putAt(it.attendanceDate.getDate(),it.status)
					studentList.putAt(it.student,studentAttendanceMap )
				}else{
					studentAttendanceMap = [:]
					studentAttendanceMap.putAt(it.attendanceDate.getDate(),it.status)
					studentList.putAt(it.student,studentAttendanceMap )
				}
			}
			studentList.keySet().each {
				def map = studentList.get(it)
				def sortedMap = [:]
				map.keySet().sort().each {
					sortedMap.put(it, map.getAt(it))
				}
				studentList.put(it, sortedMap)
			}
			
			def studentattendence = [:]	//student : attendenceMap
			(studentList.keySet()).each{stit->
				println "student : "+stit
				def attendenceMap = [:]		// date   : status

				def attendenceSet = (studentList.get(stit))
				(1..31).each {
					if((attendenceSet.keySet()).contains(it)){
						attendenceMap.put(it, attendenceSet.get(it))
					}else{
						attendenceMap.put(it, "-")
					}
				}
				studentattendence.put(stit, attendenceMap)
			}
			def instituite=userService.getCurrentInstituite()
			[params:params,instituite:instituite,studentattendence:studentattendence,studentList:studentService.getStudentsAttendance(params),studentAttendanceList:studentList,keys:studentList.keySet()]
		}
		
	}

}

