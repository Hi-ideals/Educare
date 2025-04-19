package com.hiideals.instituite.student

class ParentDetails {
	
	String parentName
	String mobileNumber
	String occupation
	String relation
	String parentAdharNo
	String parentVoterId
	String parentQualification

    static constraints = {
		mobileNumber nullable:true
		relation nullable:true
		parentAdharNo nullable:true
		parentVoterId nullable:true
		parentName nullable:true
		occupation nullable:true
		parentQualification nullable:true
    }
	
	static belongsTo = [student:Student]
	
	static mapping = {
		
	}
}
