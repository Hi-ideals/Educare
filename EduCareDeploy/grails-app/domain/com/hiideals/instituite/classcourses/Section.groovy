package com.hiideals.instituite.classcourses

import com.hiideals.instituite.main.Instituite;
import com.hiideals.instituite.users.SecUser

class Section {
	
	def springSecurityService
	
	String sectionID
	String sectionName
	Integer sectionStrength
	String sectionClassTeacher
	SecUser createdUser
	
	static belongsTo =  [instituite:Instituite]

    static constraints = {
		sectionStrength		nullable:true
		sectionClassTeacher	nullable:true
		createdUser nullable:true
    }
	
	def beforeInsert() {
		
		if(createdUser ==null && springSecurityService.currentUser !=null)
			createdUser = springSecurityService.currentUser
	}
	
}

