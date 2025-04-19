package com.hiideals.instituite.users

import com.hiideals.instituite.admin.Admin
import com.hiideals.instituite.admin.UserList
import com.hiideals.instituite.student.Student

class SecUser implements Serializable {

	private static final long serialVersionUID = 1

	transient springSecurityService

	String username
	String password
	
	Student studentID
	Admin adminID
	UserList userlistID
	
	boolean enabled = true
	boolean accountExpired
	boolean accountLocked
	boolean passwordExpired

	SecUser(String username, String password) {
		this()
		this.username = username
		this.password = password
	}

	@Override
	int hashCode() {
		username?.hashCode() ?: 0
	}

	@Override
	boolean equals(other) {
		is(other) || (other instanceof SecUser && other.username == username)
	}

	@Override
	String toString() {
		username
	}

	Set<SecRole> getAuthorities() {
		SecUserSecRole.findAllBySecUser(this)*.secRole
	}

	def beforeInsert() {
		encodePassword()
	}

	def beforeUpdate() {
		if (isDirty('password')) {
			encodePassword()
		}
	}

	protected void encodePassword() {
		password = springSecurityService?.passwordEncoder ? springSecurityService.encodePassword(password) : password
	}

	static transients = ['springSecurityService']

	static constraints = {
		username blank: false, unique: true
		password blank: false
		studentID nullable:true
		adminID nullable:true
		userlistID nullable:true
	}

	static mapping = {
		password column: '`password`'
	}
}

