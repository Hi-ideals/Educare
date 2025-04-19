package com.hiideals.exams

import com.hiideals.instituite.main.Instituite;
import com.hiideals.instituite.student.Student
import com.hiideals.instituite.users.SecUser

class Marks {
	
	def springSecurityService
	
	int obtainedMarks
	Student student
	Instituite institute;
	SecUser createdUser
	
	static belongsTo = [examDetails:ExamDetails,institute:Instituite]

    static constraints = {
		institute nullable:true
		createdUser nullable:true
    }
	
	def beforeInsert() {
		
		if(createdUser ==null && springSecurityService.currentUser !=null)
			createdUser = springSecurityService.currentUser
	}
}
