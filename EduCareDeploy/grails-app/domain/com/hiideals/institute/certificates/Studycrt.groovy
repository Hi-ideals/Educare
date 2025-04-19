package com.hiideals.institute.certificates

class Studycrt {
	
	String stregistrationnumber
	String stname
	String ftname
	String stdate
	String fromdate
	String todate
	String fromclass
	String toclass

    static constraints = {
		stregistrationnumber nullable:true
		stname nullable:true
		stdate nullable:true
		fromdate nullable:true
		todate nullable:true
		fromclass nullable:true
		toclass nullable:true
		ftname nullable:true
    }
}
