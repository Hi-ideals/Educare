package com.hiideals.institute.reports
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
		def issuedToStudents=IssueDetails.executeQuery(" from IssueDetails where staffId=null And instituite_id=${insi.id}")
		
		(issuedToStudents).each {
			
		}
		
		[issuedToStudents: issuedToStudents ]
		
		
	}
	
	def issuedStaff()
	{
		def insi = userService.getCurrentInstituite()
		def issuedToStaff=IssueDetails.executeQuery("from IssueDetails where studentId=null  And instituite_id=${insi.id}")
		
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
		def issuedToStudents=IssueDetails.executeQuery(" from IssueDetails where staffId=null And instituite_id=${insi.id}")
		
		(issuedToStudents).each {
			
		}
		
		[issuedToStudents: issuedToStudents,instituite:insi]
		}
		
	def booksIssuedstaff(){
		def insi = userService.getCurrentInstituite()
		def issuedToStaff=IssueDetails.executeQuery("from IssueDetails where studentId=null  And instituite_id=${insi.id}")
		
		[issuedToStaff:issuedToStaff,instituite:insi]
		
		}
	}

