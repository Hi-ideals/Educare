package com.hiideals.instituite.classcourses

import com.hiideals.instituite.main.Instituite;
import com.hiideals.instituite.users.SecUser

class IClass {
	
	transient userService
	def springSecurityService
	
	
	String classID
	String classname
	Integer classStrength
	String classTeacherName
	List sections
	//List subjects
	SecUser createdUser
	
	static hasMany = [sections:Section]
	
	static belongsTo = [instituite:Instituite]
	
	static transients = ['userService']
	
    static constraints = {
		classStrength		nullable:true
		classTeacherName	nullable:true
		sections			nullable:true
		createdUser       nullable:true
		//subjects  			nullable:true
    }
	
	static mapping = {
		sections		cascade: "all"
	}
	
	def beforeInsert() {
		if(instituite ==null && userService.getCurrentInstituite() !=null)
			instituite = userService.getCurrentInstituite()
			
			if(createdUser ==null && springSecurityService.currentUser !=null)
				createdUser = springSecurityService.currentUser
	}
	

}

