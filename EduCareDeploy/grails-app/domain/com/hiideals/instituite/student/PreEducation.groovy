package com.hiideals.instituite.student
import com.hiideals.instituite.helper.Address;
import com.hiideals.instituite.helper.Image;

class PreEducation {
	
	int marksPercentage
	String schoolname
	String qualification
	String transferCertificatId
	
	Address schoolAddress
	
	static hasMany = [files:Image]
	static belongsTo = [studentpreEdu:Student]

    static constraints = {
		schoolAddress nullable:true
		files nullable:true
    }
}
