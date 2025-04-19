package com.hiideals.exams


import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.classcourses.Subject
import com.hiideals.instituite.helper.Batch
import com.hiideals.instituite.main.Instituite;
import com.hiideals.instituite.users.SecUser

class ExamDetails {
	
	def springSecurityService

	Batch year;
	IClass iclass;
	Subject subject;
	Date examDate;
	String examDuration;
	int totalMarks;
	int passMarks;
	Exam exam
	Instituite institute;
	SecUser createdUser
	
	
	static belongsTo = [exam:Exam,institute:Instituite]
	static constraints = {
		exam nullable:true
		institute nullable:true
		createdUser nullable:true
	}
	
	def beforeInsert() {
		
		if(createdUser ==null && springSecurityService.currentUser !=null)
			createdUser = springSecurityService.currentUser
	}
}
