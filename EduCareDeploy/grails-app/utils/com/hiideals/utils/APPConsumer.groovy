package com.hiideals.utils
import java.text.DateFormat
import java.text.SimpleDateFormat


class APPConsumer {
	
	//public static final String AJAX_NAME="/ms";//for myschool
	public static final String AJAX_NAME="/";//for RG
	//public static final String AJAX_NAME="/vs";//for Vidya shree
	
	public static Date parseMMDDYYYY(String stringDate){
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		return df.parse(stringDate)
	}

}
