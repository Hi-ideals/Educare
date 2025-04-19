package com.hiideals.transport

import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.student.Student
import com.hiideals.instituite.users.SecUser
import com.hiideals.institute.staff.Staff
import com.hiideals.instituite.helper.AcademicYear
import com.hiideals.instituite.helper.Batch
class TransportFee {
	transient userService
	def springSecurityService
	Transport transport;
	String paymentId;	
    Date paymentDate=new Date();
	double payingAmount;
	double paidAmount;
	double remainingAmount;
	double fine;
	Instituite institute;
	Student student
	Staff  employee;
	Batch acdemicyear
	SecUser createdUser
	 
	static belongsTo = [employee:Staff,student:Student,institute:Instituite]
	
    static constraints = {
		
		 transport nullable:true
		 paymentId nullable:true
		 paymentDate nullable:true
		 paidAmount nullable:true
		 remainingAmount nullable:true
		 fine nullable:true
		 institute nullable:true
		 student nullable:true
		  employee nullable:true
		    acdemicyear nullable:true
			createdUser nullable:true
		 
    }
	
	def beforeInsert() {
		if(institute ==null && userService.getCurrentInstituite() !=null)
			institute = userService.getCurrentInstituite()
			if(createdUser ==null && springSecurityService.currentUser !=null)
				createdUser = springSecurityService.currentUser
	}
}
