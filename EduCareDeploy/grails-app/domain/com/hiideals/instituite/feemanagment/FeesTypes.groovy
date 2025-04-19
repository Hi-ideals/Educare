package com.hiideals.instituite.feemanagment

class FeesTypes {

	
	InstFeeTypes instFeeType
	Long amountPaid
	Long due
	Long amountToBePaid
	
	static belongsTo = [fee:Fee]

	static constraints = {
	}
}
