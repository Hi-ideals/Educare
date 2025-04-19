package com.hiideals.instituite.student

import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.classcourses.Section
import com.hiideals.instituite.feemanagment.Fee
import com.hiideals.instituite.helper.AcademicYear
import com.hiideals.instituite.helper.Address
import com.hiideals.instituite.helper.Batch
import com.hiideals.instituite.helper.Document
import com.hiideals.instituite.helper.Image
import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.users.SecUser
import com.hiideals.instituite.feemanagment.Admissionfee

class Student {
	
	def springSecurityService

	String stsSystem
	String identificationMark
	String mediumOfInstruction
	String studentName
	String studentPhNumber
	String studentId
	String lastName
	Admissionfee admissionfee
	boolean readmission
	boolean repeate
	Address permenentAddres
	Address presentAddress
	ParentDetails fatherDetails
	ParentDetails motherDetails
	ParentDetails guardianDetails
	String email
	int numberOfBooks
	Date studentDOJ
	Date studentDOB
	String studentAdharNo
	
	String nationality
	String bloodgroup
	String motherTongue
	String religion
	String registrationNo
	String  batchno
	List academicyear
	Image profilePic
	
	boolean transfer
	
	boolean isalumni
	
	IClass presentclass
	Section section;
	
	String gender
	String category
	SecUser createdUser
	
	
	
	
	static belongsTo = [instituite:Instituite]
	static hasMany=[documents:Document,academicyear:AcademicYear]
	
	def beforeInsert() {
	
			if(createdUser ==null && springSecurityService.currentUser !=null)
				createdUser = springSecurityService.currentUser
	}

	static constraints = {
		stsSystem nullable:true
	     lastName  nullable:true
	    admissionfee nullable:true
		studentPhNumber nullable:true
		fatherDetails	nullable:true
		motherDetails	nullable:true
		guardianDetails nullable:true
		email			nullable:true
		batchno         nullable:true
		nationality		nullable:true
		bloodgroup		nullable:true
		motherTongue	nullable:true
		religion		nullable:true
		isalumni		default:"no"
		profilePic		nullable:true
		section         nullable:true
		documents       nullable:true
		presentclass  nullable:true
		academicyear nullable:true
		readmission nullable:true
		repeate nullable:true
		transfer nullable:true
		category nullable:true
		studentAdharNo nullable:true 
		identificationMark nullable:true
		createdUser nullable:true
		//permenentAddres nullable:true
		//presentAddress nullable:true
		
		gender inList : [
			"Male",
			"Female"
		]
	}

	static mapping = {
		fatherDetails	cascade: "all-delete-orphan"
		motherDetails	cascade: "all-delete-orphan"
		guardianDetails	cascade: "all-delete-orphan"
	}
}

