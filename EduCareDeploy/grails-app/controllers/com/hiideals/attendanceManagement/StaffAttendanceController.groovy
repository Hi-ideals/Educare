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

@Secured(["ROLE_ADMIN","ROLE_USERR"])
class StaffAttendanceController { 

	def  staffService
	def userService;
	private static DateFormat df = new SimpleDateFormat("MM/dd/yyyy");//yyyy-MM-dd");

	static allowedMethods = [update: "PUT", delete: "DELETE"]

	def index(Integer max) {
		params.max = Math.min(max ?: 100, 100)
		
		respond StaffAttendance.list(params), model:[staffAttendanceInstanceCount: StaffAttendance.count(),staffs:staffs]
	}

	def show(StaffAttendance staffAttendanceInstance) {
		respond staffAttendanceInstance
	}

	def create() {
	def staffs=staffService.getAllStaffs(params)
		respond new StaffAttendance(params),model:[staffs:staffs]
	}




	def staffAttendanceList(){
		[institute:userService.getCurrentInstituite(),staffs:staffService.getAllStaffs(params)]
	}

	def getStaffAttendanceDetails(){

		def aa = staffService.getStaffAttendance(params)
		println "aa "+aa
		
		if(params.attendanceType=='Daily'){

			
			def staffList = [:]
			aa.eachWithIndex {it,int i->
				if(staffList.keySet().size()>0 && staffList.keySet().contains(it.staffName)){
					def staffAttendanceMap = staffList.get(it.staffName)
					staffAttendanceMap.putAt(it.attendanceDate,it.status)
					staffList.putAt(it.staffName,staffAttendanceMap )
				}else{def staffAttendanceMap = [:]
					staffAttendanceMap.putAt(it.attendanceDate,it.status)
					staffList.putAt(it.staffName,staffAttendanceMap )
				}
			}
			staffList.keySet().each {
				def map = staffList.get(it)
				def sortedMap = [:]
				map.keySet().sort().each {
					sortedMap.put(it, map.getAt(it))
				}
				staffList.put(it, sortedMap)
	
			}
			
			

			render template:'staffAttendanceDetails',model:[staffList:staffService.getStaffAttendance(params),staffAttendanceList:staffList]}
		else{

			def staffAttendanceMap=[]
			def staffList = [:]
			aa.eachWithIndex {it,int i->
				if(staffList.keySet().size()>0 && staffList.keySet().contains(it.staffName)){
					 staffAttendanceMap = staffList.get(it.staffName)
					staffAttendanceMap.putAt(it.attendanceDate.getDate(),it.status)
					staffList.putAt(it.staffName,staffAttendanceMap )
				}else{
				staffAttendanceMap=[:]
					staffAttendanceMap.putAt(it.attendanceDate.getDate(),it.status)
					staffList.putAt(it.staffName,staffAttendanceMap )
				}
			}
			staffList.keySet().each {
				def map = staffList.get(it)
				def sortedMap = [:]
				map.keySet().sort().each {
					sortedMap.put(it, map.getAt(it))
				}
				staffList.put(it, sortedMap)
	
			}
			
			def staffattendence = [:]	//student : attendenceMap
			(staffList.keySet()).each{stit->
				println "student : "+stit
				def attendenceMap = [:]		// date   : status

				def attendenceSet = (staffList.get(stit))
				(1..31).each {
					println "attendenceSet "+attendenceSet
					if((attendenceSet.keySet()).contains(it)){
						attendenceMap.put(it, attendenceSet.get(it))
					}else{
						attendenceMap.put(it, "-")
					}
				}
				staffattendence.put(stit, attendenceMap)
			}
			
			println "staffattendence "+staffattendence
			

			render template:'monthlySheet',model:[staffattendence:staffattendence,staffList:staffService.getStaffAttendance(params),staffAttendanceList:staffattendence]}
	}




	def getStaffAttendanceSheet(){
		def attendUpdateBy=Staff.findById(params.int('attendanceUpdatedBy'))
		def staff=Staff.findById(params.int('staffName'))
		def institute1=userService.getCurrentInstituite()
		def criteria=Staff.createCriteria()
		def staffList=criteria.list{
			institute { 'in' 'id',institute1?.id}
			eq('id',staff?.id)
		}
		[params:params,attendUpdateBy:attendUpdateBy,staffName:staff,institue:institute1,staffList:staffList]
	}


	@Transactional
	def save() {

		df.setLenient(false);
		for(int i=0;i<(params.loopSize.toInteger());i++)
		{
			StaffAttendance  st = new StaffAttendance();
			def staff=Staff.findById(params["staffID${i}"])
			def takenAttendance=StaffAttendance.findByStaffNameAndAttendanceDate(staff,df.parse(params.attendanceDate1))
			if(takenAttendance){}else{
				if(params["status${i}"]=='on'){
					st.status="P"}else{st.status="A"}
				st.remarks=params["remarks${i}"]
				st.institue=userService.getCurrentInstituite()
				st.attendanceDate =df.parse(params.attendanceDate1)
				st.attendanceUpdatedBy=Staff.findById(params.int('attendanceUpdatedBy'))
				if(params.int('section')){st.section=Section.findById(params.int('section'))}
				st.staffName=staff
				st.save(flush:true,failOnError:true)
			}
		}
		redirect(action:'create')
	}



	def edit(StaffAttendance staffAttendanceInstance) {
		respond staffAttendanceInstance
	}

	@Transactional
	def update(StaffAttendance staffAttendanceInstance) {
		if (staffAttendanceInstance == null) {
			notFound()
			return
		}

		if (staffAttendanceInstance.hasErrors()) {
			respond staffAttendanceInstance.errors, view:'edit'
			return
		}

		staffAttendanceInstance.save flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.updated.message', args: [message(code: 'StaffAttendance.label', default: 'StaffAttendance'), staffAttendanceInstance.id])
				redirect staffAttendanceInstance
			}
			'*'{ respond staffAttendanceInstance, [status: OK] }
		}
	}

	@Transactional
	def delete(StaffAttendance staffAttendanceInstance) {

		if (staffAttendanceInstance == null) {
			notFound()
			return
		}

		staffAttendanceInstance.delete flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.deleted.message', args: [message(code: 'StaffAttendance.label', default: 'StaffAttendance'), staffAttendanceInstance.id])
				redirect action:"index", method:"GET"
			}
			'*'{ render status: NO_CONTENT }
		}
	}

	protected void notFound() {
		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.not.found.message', args: [message(code: 'staffAttendance.label', default: 'StaffAttendance'), params.id])
				redirect action: "index", method: "GET"
			}
			'*'{ render status: NOT_FOUND }
		}
	}

	def printattendencestaffdaily(){
		def aa = staffService.getStaffAttendance(params)
		def staffList = [:]
		aa.eachWithIndex {it,int i->
			if(staffList.keySet().size()>0 && staffList.keySet().contains(it.staffName)){
				def staffAttendanceMap = staffList.get(it.staffName)
				staffAttendanceMap.putAt(it.attendanceDate,it.status)
				staffList.putAt(it.staffName,staffAttendanceMap )
			}else{def staffAttendanceMap = [:]
				staffAttendanceMap.putAt(it.attendanceDate,it.status)
				staffList.putAt(it.staffName,staffAttendanceMap )
			}
		}
		staffList.keySet().each {
			def map = staffList.get(it)
			def sortedMap = [:]
			map.keySet().sort().each {
				sortedMap.put(it, map.getAt(it))
			}
			staffList.put(it, sortedMap)

		}
		def instituite = userService.getCurrentInstituite()
		[instituite:instituite,staffList:staffService.getStaffAttendance(params),staffAttendanceList:staffList]
	}

	def printattendencestaffmonthly(){
		def aa = staffService.getStaffAttendance(params)
		println "aa "+aa
		def staffAttendanceMap=[]
		def staffList = [:]
		aa.eachWithIndex {it,int i->
			if(staffList.keySet().size()>0 && staffList.keySet().contains(it.staffName)){
				 staffAttendanceMap = staffList.get(it.staffName)
				staffAttendanceMap.putAt(it.attendanceDate.getDate(),it.status)
				staffList.putAt(it.staffName,staffAttendanceMap )
			}else{
			staffAttendanceMap=[:]
				staffAttendanceMap.putAt(it.attendanceDate.getDate(),it.status)
				staffList.putAt(it.staffName,staffAttendanceMap )
			}
		}
		staffList.keySet().each {
			def map = staffList.get(it)
			def sortedMap = [:]
			map.keySet().sort().each {
				sortedMap.put(it, map.getAt(it))
			}
			staffList.put(it, sortedMap)

		}
		
		def staffattendence = [:]	//student : attendenceMap
		(staffList.keySet()).each{stit->
			println "student : "+stit
			def attendenceMap = [:]		// date   : status

			def attendenceSet = (staffList.get(stit))
			(1..31).each {
				println "attendenceSet "+attendenceSet
				if((attendenceSet.keySet()).contains(it)){
					attendenceMap.put(it, attendenceSet.get(it))
				}else{
					attendenceMap.put(it, "-")
				}
			}
			staffattendence.put(stit, attendenceMap)
		}
		
		println "staffattendence MONTHLY......    :"+staffattendence
		
		def instituite = userService.getCurrentInstituite()
		
		[staffattendence:staffattendence,staffList:staffService.getStaffAttendance(params),staffAttendanceList:staffattendence,instituite:instituite]
		//[instituite:instituite,staffList:staffService.getStaffAttendance(params),staffAttendanceList:staffList]

	}
}

