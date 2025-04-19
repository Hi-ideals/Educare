package com.hiideals.instituite.feemanagment

class FeeTypesTracker {
	
	String instFeeTypeT
	Long amountPaidT
	Long dueT
	Long amountToBePaidT
	
	static belongsTo = [feeTracker:FeeTracker]

    static constraints = {
    }
}
