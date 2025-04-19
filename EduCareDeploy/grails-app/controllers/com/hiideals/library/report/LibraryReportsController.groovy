package com.hiideals.library.report

import com.hiideals.instituite.student.Student;
import com.hiideals.institute.library.Books;
import com.hiideals.institute.library.IssueDetails;
import com.hiideals.institute.library.Magazine;
import com.hiideals.institute.library.Newspaper;
import com.hiideals.institute.staff.Staff;

import java.text.DateFormat
import java.text.SimpleDateFormat

import net.sf.ehcache.search.expression.IsNull;
import grails.plugin.springsecurity.annotation.Secured
@Secured(["ROLE_ADMIN","ROLE_USERR"])
class LibraryReportsController {
	
	def userService
	
    def index() { 
		
	}
	def availableBooks(){
		def inst = userService.getCurrentInstituite()
		def allBooks = Books.findAllByInstituite(inst)
		render(template:'availableBooks',model:[allBooks:allBooks])
	}
	
	def availableNewsPapers(){
		def inst = userService.getCurrentInstituite()
		def allNewsPapers = Newspaper.findAllByInstituite(inst)
		render(template:'availableNewsPapers',model:[allNewsPapers:allNewsPapers])
	}
	
	def availableMagazines(){
		def inst = userService.getCurrentInstituite()
		def allMagazines = Magazine.findAllByInstituite(inst)
		render(template:'availableMagazines',model:[allMagazines:allMagazines])
	}
	
	def getByIssuedDate(){
		def inst = userService.getCurrentInstituite()
		
		if(params.type=="Students"){
			def qwe = IssueDetails.findAll()
			DateFormat df = new SimpleDateFormat("MM/dd/yyyy");//yyyy-MM-dd");
			df.setLenient(false);
			def from = new java.sql.Timestamp(df.parse(params.from).getTime())
			def	to = new java.sql.Timestamp(df.parse(params.to).getTime())
			def issuedToStudents=IssueDetails.createCriteria().list(params){
				eq ('instituite', inst)
				isNull ("staffId")
				if(params.from){
					between("dateOfIssue",from,to )
				}
			}
			render(template:'stIssuedDate',model:[issuedToStudents:issuedToStudents,params:params])
			
			}else if(params.type=="Staff"){
			
		def insi = userService.getCurrentInstituite()
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");//yyyy-MM-dd");
		df.setLenient(false);
		def from = new java.sql.Timestamp(df.parse(params.from).getTime())
		def	to = new java.sql.Timestamp(df.parse(params.to).getTime())
		def issuedToStaff=IssueDetails.createCriteria().list(params){
			eq ('instituite', inst)
			isNull ("studentId")
			if(params.from){
				between("dateOfIssue",from,to )
			}
		}
		render(template:'staffIssuedDate',model:[issuedToStaff:issuedToStaff,params:params])
		}
		
	}
	
	def getByReturnDate(){
		def inst = userService.getCurrentInstituite()
		
		if(params.type=="Students"){
			def qwe = IssueDetails.findAll()
			DateFormat df = new SimpleDateFormat("MM/dd/yyyy");//yyyy-MM-dd");
			df.setLenient(false);
			def from = new java.sql.Timestamp(df.parse(params.from).getTime())
			def	to = new java.sql.Timestamp(df.parse(params.to).getTime())
			def streturnDate=IssueDetails.createCriteria().list(params){
				eq ('instituite', inst)
				isNull ("staffId")
				if(params.from){
					between("dateOfReturn",from,to )
				}
			}
			render(template:'stReturnDate',model:[streturnDate:streturnDate,params:params])
			
			}else if(params.type=="Staff"){
			
		def insi = userService.getCurrentInstituite()
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");//yyyy-MM-dd");
		df.setLenient(false);
		def from = new java.sql.Timestamp(df.parse(params.from).getTime())
		def	to = new java.sql.Timestamp(df.parse(params.to).getTime())
		def staffreturnDate=IssueDetails.createCriteria().list(params){
			eq ('instituite', inst)
			isNull ("studentId")
			if(params.from){
				between("dateOfReturn",from,to )
			}
		}
		render(template:'staffReturnDate',model:[staffreturnDate:staffreturnDate,params:params])
		}
		
		
	}
	def studentWise(){
		def inst = userService.getCurrentInstituite()
		def stdetails = Student.findByStudentName(params.stName)
		def stWise = IssueDetails.findAllByStudentIdAndInstituite(stdetails,inst)
		render(template:'studentWise',model:[stWise:stWise,params:params])
	}
	
	def staffWise(){
		def inst = userService.getCurrentInstituite()
		def staffdetails = Staff.findByStaffName(params.staffName)
		def stffWise = IssueDetails.findAllByStaffIdAndInstituite(staffdetails,inst)
		render(template:'staffWise',model:[stffWise:stffWise,params:params])
	}
	
	def availableBooksPrint(){
		def inst = userService.getCurrentInstituite()
		def allBooks = Books.findAllByInstituite(inst)
		[allBooks:allBooks,instituite:inst]
	}
	def availableMagazinesPrint(){
		def inst = userService.getCurrentInstituite()
		def allMagazines = Magazine.findAllByInstituite(inst)
		[allMagazines:allMagazines,instituite:inst]
	}
	def availableNewsPapersPrint(){
		def inst = userService.getCurrentInstituite()
		def allNewsPapers = Newspaper.findAllByInstituite(inst)
		[allNewsPapers:allNewsPapers,instituite:inst]
		
	}
	def getByIssuedDatePrint(){
		println("getByIssuedDatePrint   :"+params)
		def inst = userService.getCurrentInstituite()
		
		if(params.type=="Students"){
			def qwe = IssueDetails.findAll()
			DateFormat df = new SimpleDateFormat("MM/dd/yyyy");//yyyy-MM-dd");
			df.setLenient(false);
			def from = new java.sql.Timestamp(df.parse(params.from).getTime())
			def	to = new java.sql.Timestamp(df.parse(params.to).getTime())
			def issuedToStudents=IssueDetails.createCriteria().list(params){
				eq ('instituite', inst)
				isNull ("staffId")
				if(params.from){
					between("dateOfIssue",from,to )
				}
			}
			[issuedToStudents:issuedToStudents,instituite:inst]
			
			}else if(params.type=="Staff"){
			
		def insi = userService.getCurrentInstituite()
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");//yyyy-MM-dd");
		df.setLenient(false);
		def from = new java.sql.Timestamp(df.parse(params.from).getTime())
		def	to = new java.sql.Timestamp(df.parse(params.to).getTime())
		def issuedToStaff=IssueDetails.createCriteria().list(params){
			eq ('instituite', inst)
			isNull ("studentId")
			if(params.from){
				between("dateOfIssue",from,to )
			}
		}
		[issuedToStaff:issuedToStaff,instituite:inst]
		}
		
	}
	
	def getByReturnDatePrint(){
		println("getByReturnDatePrint   :"+params)
		def inst = userService.getCurrentInstituite()
		
		if(params.type=="Students"){
			def qwe = IssueDetails.findAll()
			DateFormat df = new SimpleDateFormat("MM/dd/yyyy");//yyyy-MM-dd");
			df.setLenient(false);
			def from = new java.sql.Timestamp(df.parse(params.from).getTime())
			def	to = new java.sql.Timestamp(df.parse(params.to).getTime())
			def streturnDate=IssueDetails.createCriteria().list(params){
				eq ('instituite', inst)
				isNull ("staffId")
				if(params.from){
					between("dateOfReturn",from,to )
				}
			}
			[streturnDate:streturnDate,instituite:inst]
			
			}else if(params.type=="Staff"){
			
		def insi = userService.getCurrentInstituite()
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");//yyyy-MM-dd");
		df.setLenient(false);
		def from = new java.sql.Timestamp(df.parse(params.from).getTime())
		def	to = new java.sql.Timestamp(df.parse(params.to).getTime())
		def staffreturnDate=IssueDetails.createCriteria().list(params){
			eq ('instituite', inst)
			isNull ("studentId")
			if(params.from){
				between("dateOfReturn",from,to )
			}
		}
		[staffreturnDate:staffreturnDate,instituite:inst]
		}
		
	}
	
	def getBystudentWisePrint(){
		println("getBystudentWisePrint   :"+params)
		
		def inst = userService.getCurrentInstituite()
		def stdetails = Student.findByStudentName(params.stName)
		def stWise = IssueDetails.findAllByStudentIdAndInstituite(stdetails,inst)
		[stWise:stWise,instituite:inst]
		
	}
	
	def getBystaffWisePrint(){
		println("getBystaffWisePrint    :"+params)
		
		def inst = userService.getCurrentInstituite()
		def staffdetails = Staff.findByStaffName(params.staffName)
		def stffWise = IssueDetails.findAllByStaffIdAndInstituite(staffdetails,inst)
		[stffWise:stffWise,instituite:inst]
		
	}
}
