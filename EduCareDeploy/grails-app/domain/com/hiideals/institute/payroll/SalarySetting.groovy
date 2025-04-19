package com.hiideals.institute.payroll

import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.users.SecUser
import com.hiideals.institute.staff.Staff

class SalarySetting {
	transient userService
	def springSecurityService
	
	Staff staff
	PayHead payhead
	Long aunit
	String type
	Instituite institute
	SecUser createdUser
	
	static transients = ['userService']

    static constraints = {
		institute  nullable:true
		type inList:["Amount"]
		createdUser nullable:true
    }
	
	def beforeInsert() {
		if(institute ==null && userService.getCurrentInstituite() !=null)
			institute = userService.getCurrentInstituite()
			if(createdUser ==null && springSecurityService.currentUser !=null)
				createdUser = springSecurityService.currentUser
	}
}
