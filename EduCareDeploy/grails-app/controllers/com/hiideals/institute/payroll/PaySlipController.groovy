package com.hiideals.institute.payroll

import com.hiideals.institute.staff.Staff

import grails.plugin.springsecurity.annotation.Secured
import static org.springframework.http.HttpStatus.*

import com.hiideals.instituite.EDcoding.LookUpED;
import com.hiideals.instituite.helper.AcademicYear
import com.hiideals.instituite.main.Instituite;
import com.hiideals.instituite.student.Student;
import com.hiideals.sms.SendSMS

import grails.transaction.Transactional
import grails.plugin.springsecurity.annotation.Secured
import com.hiideals.instituite.helper.AcademicYear;

@Secured(["ROLE_ADMIN","ROLE_USERR"])
class PaySlipController {
def batchService
def userService
def staffService
    def index() {
		def batchList = batchService.getListofBatches(params)
		def instituite = userService.getCurrentInstituite()
		def staffs=staffService.getAllStaffs(params)
		[batchList:batchList,instituite:instituite,staffs:staffs]
	}
	
	def generatepayslip(){
		def staffdetails=Staff.findById(params.staff.id)
		def payslip=StaffSalary.findAllByStaffAndMonthAndAcademicyear(staffdetails,params.month,params.academicyear)
		def staffpayslip = StaffSalary.createCriteria()
		def results = staffpayslip.list {
				eq("staff",staffdetails)
				eq("month", params.month)
				eq("academicyear",params.academicyear)

		}
		def additionlist=[]
		def deductionlist=[]
		for (var in results[0]?.salaryTrack) {
			if(var?.payHeadType=="Addition" || var?.payHeadType == "+" ){
				additionlist.addAll(var)
				}else{
			deductionlist.addAll(var)
		     }
		}
		
		int deductionsum = 0;
		(deductionlist.aunit).each {
			deductionsum=deductionsum+it
		}
		
		int additionsum = 0;
		(additionlist.aunit).each {
			additionsum=additionsum+it
		}

		def instituite = userService.getCurrentInstituite()
		
		render(template:'paysliplist',model:[date:new Date(),deductionsum:deductionsum,additionsum:additionsum,additionlist:additionlist,deductionlist:deductionlist,instituite:instituite,staffdetails:staffdetails,total:results[0]])
		
	}
}
