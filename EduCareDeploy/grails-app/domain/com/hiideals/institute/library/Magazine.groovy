package com.hiideals.institute.library

import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.users.SecUser

class Magazine {
	
	
	def springSecurityService
	String magazineName
	String catagory
	String volume
	boolean cddvd
	double cost
	Date purchasedOn
	Instituite instituite
	int nummagazine
	SecUser createdUser
	
	def beforeInsert() {
		
		if(createdUser ==null && springSecurityService.currentUser !=null)
			createdUser = springSecurityService.currentUser
	}
	

    static constraints = {
		
		
		 magazineName nullable:true
		 catagory nullable:true
		 volume nullable:true
		 cddvd nullable:true
		 cost nullable:true
		 purchasedOn nullable:true
		 instituite nullable:true
		 	 nummagazine nullable:true
			  createdUser nullable:true
    }
}
