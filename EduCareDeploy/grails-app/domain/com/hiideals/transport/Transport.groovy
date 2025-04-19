package com.hiideals.transport

import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.classcourses.Section
import com.hiideals.instituite.main.Instituite;
import com.hiideals.instituite.student.Student
import com.hiideals.instituite.users.SecUser
import com.hiideals.instituite.userservices.UserService;
import com.hiideals.institute.staff.Staff

class Transport {
	def springSecurityService
	transient userService
	RouteDetails route
	DestinationDetails destination
	String type // Student or Staff
	Date startDate
	Date endDate
	Student student
	Staff  employee
	Instituite institute
	SecUser createdUser

	static belongsTo = [employee:Staff,student:Student,institute:Instituite]

	static constraints = {

		route nullable:true
		destination nullable:true
		type inList:["Student","Employee"]
		startDate nullable:true
		endDate nullable:true
		student nullable:true
		employee nullable:true
		institute nullable:true
		createdUser nullable:true

	}
	
	def beforeInsert() {
		if(institute ==null && userService.getCurrentInstituite() !=null)
			institute = userService.getCurrentInstituite()
			if(createdUser ==null && springSecurityService.currentUser !=null)
				createdUser = springSecurityService.currentUser
	}
}
