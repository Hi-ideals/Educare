package com.hiideals.institute.library

import java.util.Date;

import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.student.Student
import com.hiideals.instituite.users.SecUser
import com.hiideals.institute.staff.Staff

class IssueDetails {
	
	def springSecurityService
	Date issuedate=new Date();
	Date returndate
	int numberOfDays
	Student studentId
	Staff staffId
	Magazine magazineId
	Newspaper newspaper
	Books booksId
	Date dateOfIssue
	Date dateOfReturn
	String returned="No"
	Instituite instituite
	long fineAmount
	SecUser createdUser
	
	static hasMany=[books:Books]
	
	def beforeInsert() {
		
		if(createdUser ==null && springSecurityService.currentUser !=null)
			createdUser = springSecurityService.currentUser
	}
	
    static constraints = {
		 studentId nullable:true
		 staffId nullable:true
		 booksId nullable:true
		 magazineId nullable:true
		 newspaper nullable:true
		 returndate nullable:true
		 dateOfIssue nullable:true
		 dateOfReturn nullable:true
		 fineAmount nullable:true
		 instituite nullable:true
		 createdUser nullable:true
    }
}
