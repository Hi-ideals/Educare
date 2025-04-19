package com.hiideals.onlinepayment

import com.hiideals.instituite.admin.Admin

class Payment {

	String name
	String email
	String phone
	String currency
	String amount
	String description
	String transactionId
	Admin admin


	static constraints = {
		name nullable:true
		email nullable:true
		phone nullable:true
		currency nullable:true
		amount nullable:true
		description nullable:true
		transactionId nullable:true
		admin nullable:true
	}
}
