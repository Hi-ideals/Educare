package com.hiideals.instituite.classcourses

import com.hiideals.instituite.main.Instituite;
import com.hiideals.instituite.users.SecUser


class Subject {
	
	transient userService
	def springSecurityService

	String subjectName
	String subjectDescription
	List iclass
	SecUser createdUser
	
	static belongsTo = [institute:Instituite]
	static hasMany= [iclass:IClass]
	
	static transients = ['userService']

	static constraints = {
		subjectDescription nullable:true
		createdUser nullable:true
	}
	
	def beforeInsert() {
		if(institute ==null && userService.getCurrentInstituite() !=null)
			institute = userService.getCurrentInstituite()
			if(createdUser ==null && springSecurityService.currentUser !=null)
				createdUser = springSecurityService.currentUser
	}
}
