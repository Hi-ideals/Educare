package com.hiideals.instituite.helper

class Address {

	String pinCode
	String hsno
	String street
	String city
	String state
	String country
	String phno
	String mobileNumber
	

	static constraints = {
		phno			nullable:true
		mobileNumber	nullable:true
		pinCode			nullable:true
		hsno            nullable:true
		street          nullable:true
		city            nullable:true
		state           nullable:true
		country         nullable:true
	}
}
