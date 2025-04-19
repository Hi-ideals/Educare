package com.hiideals.institute.staff

import java.util.Date;

import com.hiideals.instituite.classcourses.Subject;
import com.hiideals.instituite.helper.Address;
import com.hiideals.instituite.main.Instituite;
import com.hiideals.instituite.users.SecUser

class Staff {

	transient userService
	def springSecurityService
	
	String staffName
	String staffType
	String mobileNumber
	String qualification
	Address address
	int staffID
	Subject teachingSubject
	List substutingSubjects 
	long numberOfBooks
	SecUser  createdUser 
	Date dateCreated
	Date lastUpdated
	
	static belongsTo = [institute:Instituite]
	static hasMany = [substutingSubjects:Subject]
	
	static transients = ['userService']
	
    static constraints = {
		substutingSubjects nullable:true
		mobileNumber nullable:true
		createdUser nullable:true
		staffType inList :[
			"Teaching",
			"Non-Teaching"
			]
    }
	
	def beforeInsert() {
		if(institute ==null && userService.getCurrentInstituite() !=null)
			institute = userService.getCurrentInstituite()
			if(createdUser ==null && springSecurityService.currentUser !=null)
				createdUser = springSecurityService.currentUser
	}
}
