package com.hiideals.instituite.helper

class Document {
	
	String path;
	String fileName;

    static constraints = {
		path nullable:true
		fileName nullable:true
    }
}
