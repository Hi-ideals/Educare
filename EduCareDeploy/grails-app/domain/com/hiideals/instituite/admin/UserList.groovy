package com.hiideals.instituite.admin

import com.hiideals.instituite.helper.Address
import com.hiideals.instituite.helper.UserModules
import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.users.SecRole
import com.hiideals.instituite.users.SecUser

class UserList {
	
	
	String userName
	String password
	Address address
	SecUser createdUser
	Date dateCreated
	Date lastUpdated
	Roles secrole
	
	static belongsTo = [institute:Instituite]
	
	static hasMany = [modules:UserModules]
	

    static constraints = {
		
		 userName nullable:true
		 password nullable:true
		 address nullable:true
		 createdUser nullable:true
		 secrole nullable:true
		 modules nullable:true
		 institute nullable:true
    }
}
