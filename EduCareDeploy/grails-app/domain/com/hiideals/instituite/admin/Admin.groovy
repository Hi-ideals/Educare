package com.hiideals.instituite.admin

import com.hiideals.instituite.helper.Address
import com.hiideals.instituite.helper.Image
import com.hiideals.instituite.helper.UserModules

class Admin {

	String adminName
	String password
	String adminID
	Image profilePic
	
	Address address
	String smsSenderId
	String smsPassword
	String smsUsername
	static hasMany = [modules:UserModules]


	static constraints = {  
		address		nullable:true
		profilePic	nullable:true
		smsSenderId	nullable:true
		smsPassword	nullable:true
		smsUsername	nullable:true
		}

	static mapping = {
		address cascade: "all-delete-orphan"
		profilePic cascade: "all-delete-orphan"
	}
}

