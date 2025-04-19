package com.hiideals.attendanceManagement

import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.classcourses.Section
import com.hiideals.instituite.classcourses.Subject
import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.users.SecUser
import com.hiideals.institute.staff.Staff

class StaffAttendance {
	
	def springSecurityService
	Staff staffName;
	
	String status;
	Date attendanceDate;
	Date inTime;
	String remarks;
	String barCode;
	Staff attendanceUpdatedBy;
	SecUser createdUser
	static belongsTo = [institue:Instituite]
	
	
	def beforeInsert() {
		
		if(createdUser ==null && springSecurityService.currentUser !=null)
			createdUser = springSecurityService.currentUser
	}

    static constraints = {
		remarks nullable:true
		inTime nullable:true
		barCode nullable:true
		createdUser nullable:true
		attendanceUpdatedBy nullable:true
    }
	
	
}
