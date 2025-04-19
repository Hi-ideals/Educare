package com.hiideals.transport

import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.users.SecUser

class VehicleDetails {
	def springSecurityService
	transient userService
	String vehicleNo
	String noOfSeats
	String maxiumAllowed
	String vehicleType
	String contactPerson
	Date insuranceRenewalDate
	Instituite institute
	SecUser createdUser
	
	static belongsTo = [institute:Instituite]

    static constraints = {
		 vehicleNo nullable:true
		 noOfSeats nullable:true
		 maxiumAllowed nullable:true
		 vehicleType nullable:true
		 contactPerson nullable:true
		 insuranceRenewalDate nullable:true
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
