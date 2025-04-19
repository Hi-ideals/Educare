package com.hiideals.instituite.main

import com.hiideals.instituite.admin.Admin;
import com.hiideals.instituite.classcourses.Courses;
import com.hiideals.instituite.classcourses.IClass;
import com.hiideals.instituite.helper.Image;
import com.hiideals.instituite.student.Student;

class Instituite {

	String institutionID
	String name
	String caption
	String description
	String affiliatedTo
	String institutionFax
	String phone
	List courses
	List classes
	List students
	
	String hsno
	String street
	String city
	String state
	String country
	String alternatephno
	String pinCode
	String institutionPrefixName

	Image logo
	Image signature
	
	static hasMany = [courses:Courses,classes:IClass,students:Student,gallery:Image]
	
	static belongsTo = [admin:Admin]

	static constraints = { 
		classes		nullable:true
		logo		nullable:true
		signature   nullable:true
		gallery		nullable:true
		phone       nullable:true
		alternatephno nullable:true
		institutionFax nullable:true
		institutionPrefixName nullable:true
		 }

	static mapping = {
		caption 		type:"text"
		description		type:"text"
		courses 		cascade: "all-delete-orphan"
		admin			cascade: "all-delete-orphan"
		students		cascade: "all"
	}
}

