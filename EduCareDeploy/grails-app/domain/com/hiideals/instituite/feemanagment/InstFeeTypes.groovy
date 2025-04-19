package com.hiideals.instituite.feemanagment

import java.util.List;

import com.hiideals.instituite.classcourses.IClass;
import com.hiideals.instituite.main.Instituite;
import com.hiideals.instituite.student.Student;
import com.hiideals.instituite.users.SecUser

class InstFeeTypes {
	
	def springSecurityService
	
	String typeName
	String description
	Long totalAmount
	SecUser createdUser
	
	static belongsTo = [instituite:Instituite,iclass:IClass]

	
	def beforeInsert() {
		
		if(createdUser ==null && springSecurityService.currentUser !=null)
			createdUser = springSecurityService.currentUser
	}
	
    static constraints = {
		createdUser nullable:true
    }
	
	
}

