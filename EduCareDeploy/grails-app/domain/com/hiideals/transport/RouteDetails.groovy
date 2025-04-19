package com.hiideals.transport

import com.hiideals.instituite.main.Instituite;
import com.hiideals.instituite.users.SecUser

class RouteDetails {
	def springSecurityService
	transient userService
	VehicleDetails vehicle
	String routeCode
	String startPlace
	String  stopPlace
	Instituite institute
   SecUser createdUser
	
	
	static belongsTo = [institute:Instituite]

	static constraints = {
		vehicle nullable:true
		routeCode nullable:true
		startPlace nullable:true
		stopPlace nullable:true
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
