package com.hiideals.instituite.timetable

import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.users.SecUser

class Period_Timings {
	
	transient userService
	def springSecurityService
	
	String periodName
	int from_H
	int from_M
	
	int to_H
	int to_M
	
	//or use this
	String from_time
	String to_time
	Instituite institute
	SecUser createdUser
	
	static transients = ['userService']

	
	
    static constraints = {
		from_time			nullable:true
		to_time				nullable:true
		institute			nullable:true
		createdUser          nullable:true
    }
	
	String addInst(){
		institute = userService.getCurrentInstituite()
	}
	
	
	def beforeInsert() {
		if(createdUser ==null && springSecurityService.currentUser !=null){
			createdUser = springSecurityService.currentUser
		}
		return addInst()
					
			
	}
}
