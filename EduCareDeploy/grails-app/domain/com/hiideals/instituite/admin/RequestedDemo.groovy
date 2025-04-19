package com.hiideals.instituite.admin

class RequestedDemo {
	
	
	
	String name
	String email
	String phNo
	String mobile
	String sclclg
	String place
	String description

    static constraints = {
		name nullable:true
		phNo nullable:true
		mobile nullable:true
		email  nullable:true
		description nullable:true
		place nullable:true
		sclclg nullable:true
    }
}
