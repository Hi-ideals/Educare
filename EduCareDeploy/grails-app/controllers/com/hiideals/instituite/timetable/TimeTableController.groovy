package com.hiideals.instituite.timetable



import static org.springframework.http.HttpStatus.*

import java.text.DateFormat
import java.text.SimpleDateFormat

import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.classcourses.Section
import com.hiideals.instituite.classcourses.Subject
import com.hiideals.instituite.student.Student
import com.hiideals.institute.staff.Staff
import com.hiideals.utils.APPConsumer

import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional
@Secured(["ROLE_ADMIN","ROLE_USERR"])
@Transactional(readOnly = true)
class TimeTableController {

	def userService
	def timeTableService

	def index(Integer max) {
		params.max = Math.min(max ?: 10, 100)
		respond TimeTable.list(params), model:[timeTableInstanceCount: TimeTable.count()]
	}

	def show(TimeTable timeTableInstance) {
		respond timeTableInstance
	}

	def create() {
		respond new TimeTable(params)
	}

	@Transactional
	def save(TimeTable timeTableInstance) {

		params.dateOfTimeTable = APPConsumer.parseMMDDYYYY(params.dateOfTimeTable321)
		int i=0;
		int j=0;

		params.classname = params.classname_1
		params.section = params.sectionname_1

		timeTableService.resetTimeTable(params.int('classname'), params.int('section'))

		if(params.classname_1 instanceof String){

			([
				'Monday',
				'Tuesday',
				'Wednesday',
				'Thursday',
				'Friday',
				'Satuarday']
			).each {
				params.availableFor = it
				ClassTimeTable classTime = new ClassTimeTable(params);
				//classTime.institute


				(1..(params.int('dynamicColumnCount'))).each {itt->
					int ii = i++
					if(params.periodname_1 instanceof String)
						params.periodName = params.periodname_1
					else
						params.periodName = params.periodname_1[itt-1]

					def ite = Period_Timings.findByPeriodName(params.periodName)

					params.periodName = itt

					String periodtimings = (ite.from_H+":"+ite.from_M)+"-"+(ite.to_H+":"+ite.to_M)

					params.periodtimings = periodtimings
					params.subject = params.subjectname_1[ii]
					try{
						params.staff = params.staffname_1[ii]
					}catch(Exception e){
						params.staff = null
					}
					classTime.addToTimetables(new TimeTable(params))//).save(flush:true,failOnError:true)
				}

				classTime.save(flush:true,failOnError:true)
			}
		}




		/*else{
		 for multiple rows
		 (['Monday','Tuesday','Wednesday','Thursday','Friday','Satuarday']).each {
		 params.classname = it
		 params.section = params.sectionname_1[j++]
		 params.classname = params.classname_1
		 params.section = params.sectionname_1
		 (1..(params.int('dynamicColumnCount'))).each {itt->
		 int ii = i++
		 if(params.periodname_1 instanceof String)
		 params.periodName = params.periodname_1
		 else
		 params.periodName = params.periodname_1[itt-1]
		 def ite = Period_Timings.findByPeriodName(params.periodName)
		 String periodtimings = (ite?.from_H+":"+ite?.from_M)+"-"+(ite?.to_H+":"+ite?.to_M)
		 params.periodtimings = periodtimings
		 params.subject = params.subjectname_1[ii]
		 try{
		 params.staff = params.staffname_1[ii]
		 }catch(Exception e){
		 params.staff = null
		 }
		 timeTableInstance = (new TimeTable(params)).save(flush:true,failOnError:true)
		 }
		 }
		 }*/


		/*if (timeTableInstance == null) {
		 notFound()
		 return
		 }
		 if (timeTableInstance.hasErrors()) {
		 respond timeTableInstance.errors, view:'create'
		 return
		 }*/

		//timeTableInstance.save flush:true

		flash.message = message(code: 'default.created.message', args: [
			message(code: 'timeTable.label', default: 'TimeTable'),
			""
		])
		redirect(controller:'timetableDisplay',action:'timeTableDate')
		return

		/*request.withFormat {
		 form multipartForm {
		 flash.message = message(code: 'default.created.message', args: [
		 message(code: 'timeTable.label', default: 'TimeTable'),
		 timeTableInstance.id
		 ])
		 redirect timeTableInstance
		 }
		 '*' { respond timeTableInstance, [status: CREATED] }
		 }*/
	}

	def edit(TimeTable timeTableInstance) {
		respond timeTableInstance
	}

	@Transactional
	def update(TimeTable timeTableInstance) {
		if (timeTableInstance == null) {
			notFound()
			return
		}

		if (timeTableInstance.hasErrors()) {
			respond timeTableInstance.errors, view:'edit'
			return
		}

		timeTableInstance.save flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.updated.message', args: [
					message(code: 'TimeTable.label', default: 'TimeTable'),
					timeTableInstance.id
				])
				redirect timeTableInstance
			}
			'*'{ respond timeTableInstance, [status: OK] }
		}
	}

	@Transactional
	def delete(TimeTable timeTableInstance) {

		if (timeTableInstance == null) {
			notFound()
			return
		}

		timeTableInstance.delete flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.deleted.message', args: [
					message(code: 'TimeTable.label', default: 'TimeTable'),
					timeTableInstance.id
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
					message(code: 'timeTable.label', default: 'TimeTable'),
					params.id
				])
				redirect action: "index", method: "GET"
			}
			'*'{ render status: NOT_FOUND }
		}
	}

	def populatesec(){
		IClass cls = IClass.findById(params.clsId)
		render template:'sectionDropdown',model:[sections:cls?.sections]
	}

	def populatestaff(){
		Subject sub = Subject.findById(params.subId)
		def staffList = Staff.findAllByTeachingSubject(sub)
		render template:'staffListDropdown',model:[staffList:staffList]
	}

	@Transactional(readOnly = false)
	def pupolateTable(){

		int periods = Period_Timings.count()
		String message = null;
		def cls = IClass.get(params.int('iclass'))

		def subList = Subject.createCriteria().list {
			eq("institute",cls.instituite)
			iclass{
				eq("id",cls.id)
			}
		}

		try{
			def classTimeTable = timeTableService.getClsTTL(params.int('iclass'),params.int('section'))//ClassTimeTable.findAllByClassnameAndSection(iclass,section)



			if(classTimeTable?.size()>0){
				message = "Class Already contains time table, if create it will Over-ride previous records."
			}
		}catch(Exception e){}






		if(params.int('subId') > periods){
			timeTableService.autoGenPeriods()
			/*render """<h3 style="color:red;">Select periods shoeld be less than or equal to ${periods}</h3>
			 <a href="#" onclick="changeForm()"><b>Generate Table</b></a>"""
			 return;*/
		}


		render template:'formTable',model:[noOfColumnsCount:params.int('subId'),message:message,subList:subList]
	}

}