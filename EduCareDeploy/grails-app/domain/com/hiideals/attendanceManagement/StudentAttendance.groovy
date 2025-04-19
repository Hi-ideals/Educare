package com.hiideals.attendanceManagement

import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.classcourses.Section
import com.hiideals.instituite.classcourses.Subject
import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.student.Student
import com.hiideals.instituite.users.SecUser
import com.hiideals.institute.staff.Staff

class StudentAttendance {

	def springSecurityService

	Student student;
	IClass iclass;
	Section section;
	Subject subject;
	String status;
	Date attendanceDate;
	Date inTime;
	String leisureClass;
	String remarks;
	String barCode;
	Staff staffName;
	Staff attendanceUpdatedBy;
	SecUser createdUser


	static belongsTo = [institue:Instituite]


	static constraints = {
		leisureClass nullable:true;
		remarks nullable:true;
		barCode nullable:true;
		section nullable:true;
		inTime nullable:true;
		attendanceUpdatedBy nullable:true;
		subject nullable:true;
		createdUser nullable:true

	}
	
	def beforeInsert() {
		
		if(createdUser ==null && springSecurityService.currentUser !=null)
			createdUser = springSecurityService.currentUser
	}
}
