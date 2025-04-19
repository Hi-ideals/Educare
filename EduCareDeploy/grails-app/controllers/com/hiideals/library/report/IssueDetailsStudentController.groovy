package com.hiideals.library.report
import grails.plugin.springsecurity.annotation.Secured

import com.hiideals.instituite.student.Student
import com.hiideals.institute.library.IssueDetails
import com.hiideals.institute.library.Magazine
@Secured(["ROLE_ADMIN","ROLE_USERR"])

class IssueDetailsStudentController {
	
	def userService

    def index() { }
	def form() { }
	def form1(){
		
	}
	
	
	def report(){
		def studentobj=Student.findByStudentId(params.StudentId)
		def issuedetails=IssueDetails.findAllByStudentId(studentobj)
		
		 
		[issuedetails:issuedetails,studentobj:studentobj]
		
	}
	def studentmagazinereport(){
		def issudetail=IssueDetails.findAllByStudentIdIsNotNullAndMagazineIdIsNotNull()
		[issudetail:issudetail]
		
	}
	def returned(){
		def issuedetail=IssueDetails.findById(params.Id)
		def magazine=Magazine.findById(issuedetail.magazineId.id)
		magazine.nummagazine=(magazine.nummagazine + 1)
		issuedetail.returned="yes"
		issuedetail.save(flush:true,failOn:Error)
		redirect(controller: "IssueDetailsStudent", action: "form")
	}
	def newsreport(){
		def studentobj=Student.findByStudentId(params.StudentId)
		def issuedetails=IssueDetails.findAllByStudentId(studentobj)
		[issuedetails:issuedetails,studentobj:studentobj]
		
	}
	def studentnewsreport(){
		def issudetail=IssueDetails.findAllByNewspaperIsNotNullAndStudentIdIsNotNull()
		[issudetail:issudetail]
		
	}
	def returned1(){
		def issuedetail=IssueDetails.findById(params.Id)
		issuedetail.returned="yes"
		issuedetail.save(flush:true,failOn:Error)
		redirect(controller: "IssueDetailsStudent", action: "form1")
		
	}
}
