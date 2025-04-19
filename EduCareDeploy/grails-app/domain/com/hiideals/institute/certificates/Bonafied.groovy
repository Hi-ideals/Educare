package com.hiideals.institute.certificates

class Bonafied {
	
	String stname
	String stcharacter
	String issueddate
	String stfathername
	String academicyr
	String stclass

    static constraints = {
		stname nullable:true
		stcharacter nullable:true
		issueddate nullable:true
		stfathername nullable:true
		academicyr nullable:true
		stclass nullable:true
    }
}
