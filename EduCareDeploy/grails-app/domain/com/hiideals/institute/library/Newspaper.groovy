package com.hiideals.institute.library

import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.users.SecRole
import com.hiideals.instituite.users.SecUser

class Newspaper {
	
	
	def springSecurityService
	String name
	Date dateofnewspaper
	Instituite instituite
	double cost
	SecUser createdUser
	
	
	def beforeInsert() {
		
		if(createdUser ==null && springSecurityService.currentUser !=null)
			createdUser = springSecurityService.currentUser
	}
	

    static constraints = {
		
		name nullable:true
		dateofnewspaper nullable:true
       cost nullable:true
	   instituite nullable:true
	   createdUser nullable:true 
		}
}
