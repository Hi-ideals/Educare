package com.hiideals.library.report
import grails.plugin.springsecurity.annotation.Secured

import com.hiideals.institute.library.IssueDetails
import com.hiideals.institute.library.Magazine
import com.hiideals.institute.staff.Staff
@Secured(["ROLE_ADMIN","ROLE_USERR"])
class IssueDetailsStaffController {
	
	def userService

    def index() { }
	def form() { }
	def form1(){
	}
	
	
	def magazinereport(){
		def staffobj=Staff.findByStaffID(params.staffId)
		def issueDetail=IssueDetails.findAllByStaffId(staffobj)	
		[issueDetail:issueDetail,staffobj:staffobj]
		
		
		
	}
	def staffmagazinerep(){
		def issueDetails=IssueDetails.findAllByStaffIdIsNotNullAndMagazineIdIsNotNull()
		[issueDetails:issueDetails]
	}
	def returned(){
		
		def issueDetail=IssueDetails.findById(params.Id)
		
		
		def magazine=Magazine.findById(issueDetail.magazineId.id)
		magazine.nummagazine=(magazine.nummagazine + 1)
		issueDetail.returned="Yes"
		issueDetail.save(flush:true,failOn:Error)
		redirect(controller: "IssueDetailsStaff", action: "form")
	}
	def newspaperreport(){
		def staffobj=Staff.findByStaffID(params.staffId)
		def issueDetail=IssueDetails.findAllByStaffId(staffobj)
		[issueDetail:issueDetail,staffobj:staffobj]
		
	}
	def staffnewspaperrep(){
		
		
		def issueDetails=IssueDetails.findAllByNewspaperIsNotNullAndStaffIdIsNotNull()//findAllByInstituite(userService.getCurrentInstituite())
		println"issueDetails"+issueDetails
		
		[issueDetails:issueDetails]
	}
	def returned1(){
		
		def issueDetail=IssueDetails.findById(params.Id)
		
		issueDetail.returned="Yes"
		issueDetail.save(flush:true,failOn:Error)
		redirect(controller: "IssueDetailsStaff", action: "form1")
	}
	
}




