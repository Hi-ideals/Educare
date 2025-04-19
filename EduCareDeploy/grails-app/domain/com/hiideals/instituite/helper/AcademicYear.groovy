package com.hiideals.instituite.helper

import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.classcourses.Section
import com.hiideals.instituite.feemanagment.Fee

class AcademicYear {
	
	String academicyear
	IClass presentclass
	Section section
	
	String status
	
	static hasOne = [feeId:Fee]
	
	
    static constraints = {
		feeId nullable:true
		status nullable:true
    }
}
