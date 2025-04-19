package com.hiideals.instituite.admin

import java.util.Date

import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.users.SecRole
import com.hiideals.instituite.users.SecUser

class Roles {

	String roleName
	SecUser createdUser
	Date dateCreated
	Date lastUpdated
	SecRole secrole

	static belongsTo = [institute:Instituite]
	
    static constraints = {
		roleName nullable:true
		createdUser nullable:true
		dateCreated nullable:true
		lastUpdated  nullable:true
		secrole nullable:true
		institute nullable:true
    }
}
