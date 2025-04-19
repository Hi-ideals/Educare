package com.hiideals.library.report
import com.hiideals.institute.library.Books;
import com.hiideals.institute.library.IssueDetails;

import grails.plugin.springsecurity.annotation.Secured


@Secured(["ROLE_ADMIN","ROLE_USERR"])
class IssuedBooksController {
	
	def userService

    def index() {
		
		
	}
	
	
	def issuedStudents()
	{
		def insi = userService.getCurrentInstituite()
		def issuedToStudents=IssueDetails.createCriteria().list {
			isNotEmpty("books")
			isNotNull("studentId")
		}//executeQuery(" from IssueDetails where staffId=null And instituite_id=${insi.id}")
		 
		[issuedToStudents: issuedToStudents ]
		
			
	}
	
	def issuedStaff()
	{
		def insi = userService.getCurrentInstituite()
		def issuedToStaff=IssueDetails.createCriteria().list {
			isNotEmpty("books")
			isNotNull("staffId")
		}//findAllByStaffIdIsNotNullAndBooksIdIsNotNull()//executeQuery("from IssueDetails where studentId=null  And instituite_id=${insi.id}")
		
		[issuedToStaff:issuedToStaff]
	}
	
	def dueBooks(){
		def totNumBooks=Books.executeQuery("from Books ")
		
		(totNumBooks).each {
		  	println"total books"+it
								
		}
		[totNumBooks:totNumBooks]
		
	}
	
	def booksIssuedstudents(){
		def insi = userService.getCurrentInstituite()
		def issuedToStudents=IssueDetails.createCriteria().list {
			isNotEmpty("books")
			isNotNull("studentId")}
		
		(issuedToStudents).each {
			
		}
		
		[issuedToStudents: issuedToStudents,instituite:insi]
		}
		
	def booksIssuedstaff(){
		def insi = userService.getCurrentInstituite()
		def issuedToStaff=IssueDetails.createCriteria().list {
			isNotEmpty("books")
			isNotNull("staffId")}
		[issuedToStaff:issuedToStaff,instituite:insi]
		
		}
	}

