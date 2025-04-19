package com.hiideals.instituite.timetable

import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.classcourses.Section
import com.hiideals.instituite.classcourses.Subject
import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.users.SecUser
import com.hiideals.institute.staff.Staff

class TimeTable {
	
	def springSecurityService
	transient userService

	String periodName
	String periodtimings				//9:30-10:15
	Instituite institute

	IClass classname
	Section section
	Subject subject
	Staff staff
	
	Date dateOfTimeTable
	SecUser createdUser
	
	String addPeriod_Timings(){
		
		institute = userService.getCurrentInstituite()
		
		try{
			Period_Timings periodTimingsInstance = Period_Timings.findByPeriodName(periodName)
			String from = (periodTimingsInstance.from_H+":"+periodTimingsInstance.from_M)
			String to = (periodTimingsInstance.to_H+":"+periodTimingsInstance.to_M)

			periodtimings = from+"-"+to;
			return true
		}catch(Exception e){
			return false
		}
	}


	static belongsTo = [classTimeTable:ClassTimeTable]
	static transients = ['addPeriod_Timings','userService']
	static constraints = {
		classname			nullable:true
		section				nullable:true
		subject				nullable:true
		staff				nullable:true
		institute			nullable:true
		createdUser         nullable:true
	}

	def beforeInsert() {
		if(createdUser ==null && springSecurityService.currentUser !=null){
		createdUser = springSecurityService.currentUser
		}
		return addPeriod_Timings()
		
	}

	def beforeUpdate() {
		return addPeriod_Timings()
	}
}
