package com.hiideals.instituite.helper

import com.hiideals.instituite.main.Instituite;
import com.hiideals.instituite.users.SecUser

class Batch {
	
	transient userService
	def springSecurityService
	
	String batchName
	String description
	Date batchfrom
	Date batchto
	SecUser createdUser
	
	static belongsTo = [institute:Instituite]
	static transients = ['userService']
	
	def beforeInsert() {
		if(institute ==null && userService.getCurrentInstituite() !=null)
			institute = userService.getCurrentInstituite()
			if(createdUser ==null && springSecurityService.currentUser !=null)
				createdUser = springSecurityService.currentUser
	}

    static constraints = {
		description nullable:true
		createdUser nullable:true
    }
	
	
}
