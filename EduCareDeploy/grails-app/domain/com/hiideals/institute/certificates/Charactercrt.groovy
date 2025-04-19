package com.hiideals.institute.certificates

class Charactercrt {
	
	String regNo
	String stname
	String ftname
	String batchno
	String stclass
	String crtdate
	String stcharacter

    static constraints = {
		regNo nullable:true
		stname nullable:true
		ftname nullable:true
		batchno nullable:true
		stclass nullable:true
		crtdate nullable:true
		stcharacter nullable:true
    }
}
