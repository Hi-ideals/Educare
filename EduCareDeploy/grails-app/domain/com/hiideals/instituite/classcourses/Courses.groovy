package com.hiideals.instituite.classcourses

import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.users.SecUser

class Courses {
	
	def springSecurityService

	 String courseName
	 String courseDescription	
	 SecUser createdUser
	 
	static belongsTo = [instituite:Instituite]

	
	

	static constraints = {
		createdUser nullable:true
	}
	
	def beforeInsert() {
		
		if(createdUser ==null && springSecurityService.currentUser !=null)
			createdUser = springSecurityService.currentUser
	}
	
}
