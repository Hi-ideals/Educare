package com.hiideals.institute.payroll

import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.users.SecUser
import com.hiideals.institute.staff.Staff

class StaffSalary {
	transient userService
	def springSecurityService
	
	Staff staff
	String staffType
	String academicyear
	String month
	Long totalPaid
	List salaryTrack
	Instituite institute
	SecUser createdUser
	
    static hasMany = [salaryTrack:SalaryTrack]
	static transients = ['userService']
    static constraints = {
	staffType inList :["Teaching","Non-Teaching"]
		totalPaid nullable:true
		institute  nullable:true
		createdUser nullable:true
		month inList:["January", "February", "March", "April", "May", "June","July", "August","September", "October","November", "December"]
    }
	
	def beforeInsert() {
		if(institute ==null && userService.getCurrentInstituite() !=null)
			institute = userService.getCurrentInstituite()
			if(createdUser ==null && springSecurityService.currentUser !=null)
				createdUser = springSecurityService.currentUser
	}
}
