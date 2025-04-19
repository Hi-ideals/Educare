package com.hiideals.exams

import com.hiideals.instituite.main.Instituite;
import com.hiideals.instituite.users.SecUser

class Exam {
	
	def springSecurityService
	 
	String examName;
	List examDetails;
	Instituite institute;
	SecUser createdUser
	
	
	static hasMany = [examDetails:ExamDetails]
	static belongsTo = [institute:Instituite]

    static constraints = {
		institute nullable:true
		createdUser nullable:true
    }
	
	def beforeInsert() {
		
		if(createdUser ==null && springSecurityService.currentUser !=null)
			createdUser = springSecurityService.currentUser
	}
}
