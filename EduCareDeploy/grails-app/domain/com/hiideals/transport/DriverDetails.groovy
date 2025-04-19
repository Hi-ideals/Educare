package com.hiideals.transport

import com.hiideals.instituite.helper.Address
import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.users.SecUser

class DriverDetails {
	transient userService
	def springSecurityService
	VehicleDetails vehicle
	String name
	Address presentAddress
	Address permanentAddress
	Date dob
	String phone
	String licenseNumber
	Instituite institute
	SecUser createdUser
		
	static belongsTo = [institute:Instituite]
	

	static constraints = {
		
		 
		 vehicle nullable:true
		 name nullable:true
		 presentAddress nullable:true
		 permanentAddress nullable:true
		 dob nullable:true
		 phone nullable:true
		 licenseNumber nullable:true
		 institute nullable:true
		 createdUser nullable:true

	}
	
	def beforeInsert() {
		if(institute ==null && userService.getCurrentInstituite() !=null)
			institute = userService.getCurrentInstituite()
			if(createdUser ==null && springSecurityService.currentUser !=null)
				createdUser = springSecurityService.currentUser
	}
}
