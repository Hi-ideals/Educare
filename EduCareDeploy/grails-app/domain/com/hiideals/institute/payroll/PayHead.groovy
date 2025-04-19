package com.hiideals.institute.payroll

import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.users.SecUser

class PayHead {
	
	transient userService
	def springSecurityService
	
	String payHeadName
	String description
	String  payHeadType
	Instituite institute
	SecUser createdUser
	
	static transients = ['userService']

    static constraints = {
		description nullable:true
		payHeadName nullable:true
		payHeadType nullable:true
		institute  nullable:true
		createdUser nullable:true
		
		
		payHeadType inList:["Addition", "Deduction"]
    }
	
	
	def beforeInsert() {
		if(institute ==null && userService.getCurrentInstituite() !=null)
			institute = userService.getCurrentInstituite()
			
			if(createdUser ==null && springSecurityService.currentUser !=null)
				createdUser = springSecurityService.currentUser
	}
	
	
	
}
