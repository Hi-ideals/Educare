package com.hiideals.instituite.feemanagment

import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.users.SecUser

class Admissionfee {
	
	def springSecurityService
	
	String name
	Long totalAmount
	SecUser createdUser
	
	static belongsTo = [instituite:Instituite,iclass:IClass]

    static constraints = {
	instituite nullable:true
	createdUser nullable:true
    }
	
	def beforeInsert() {
		
		if(createdUser ==null && springSecurityService.currentUser !=null)
			createdUser = springSecurityService.currentUser
	}
}
