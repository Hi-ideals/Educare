package com.hiideals.instituite.feemanagment

import com.hiideals.instituite.helper.AcademicYear
import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.student.Student
import com.hiideals.instituite.users.SecUser

class Fee {
	
	def springSecurityService
	
	Long totalFee
	Long totalPaid
	Long admissionfeepaid
    Long dueadmissionfee
    Long totaladmissionfee
	Long due
	List feetypes
	int discount
	int penalty
	
	
	Date dateCreated
	Date lastUpdated
	Instituite institute
	Student studentId
	SecUser createdUser
	
	
	def beforeInsert() {
		if(studentId?.instituite !=null)
		institute = studentId.instituite
		if(createdUser ==null && springSecurityService.currentUser !=null)
			createdUser = springSecurityService.currentUser
	}
	
	def beforeUpdate() {
		if(institute ==null && studentId.instituite !=null)
		institute = studentId.instituite
	}
	
	static hasMany = [feetypes:FeesTypes]
	
	static belongsTo = [academic:AcademicYear]
	
	

    static constraints = {
		discount default:0
		penalty default:0
		feetypes nullable:true
		institute nullable:true
		studentId nullable:true
		admissionfeepaid nullable:true
        dueadmissionfee  nullable:true
		totaladmissionfee nullable:true
		createdUser nullable:true
    }
	
	static mapping = {
		feetypes cascade: "all-delete-orphan"
	}
	
	
}


