package com.hiideals.transport
import com.hiideals.instituite.helper.Batch;
import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.users.SecUser

class DestinationDetails {
	def springSecurityService
	transient userService
	RouteDetails route
	String fromPlace
	String toPlace
	String stopTime
	double amount
	String subscriptionType
	Instituite institute
	Batch acdemicyear
	SecUser createdUser
	static belongsTo = [institute:Instituite]

    static constraints = {
		 subscriptionType inList : ["Yearly","Half Yearly","Quaterly","Monthly"]
		 route nullable:true
		 fromPlace nullable:true
		 toPlace nullable:true 
		 stopTime nullable:true
		 amount nullable:true
		 institute nullable:true
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
