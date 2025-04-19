package com.hiideals.instituite.feemanagment

import java.util.Date;

import com.hiideals.instituite.main.Instituite;
import com.hiideals.instituite.users.SecUser

class FeeTracker {

	
	def springSecurityService
	int instalment
	Long studentId
	String studentName
	List feetypetracker
	
	int discountT
	int penaltyT
	
	String paymentType
	String remarks
	Date dateCreated
	Date lastUpdated
	
	String ddNumber
	String checkNumber
	
	String accNo
	String bankName
	String tellerNo
	String pinCode
	String notes
	
	Long totaladmissionfee
	Long paidadmissionfee
	Long dueadmissionfee
		Long currentpaidadmissionfee
	String invoiceNo
		Instituite institute
		SecUser createdUser

	static hasMany = [feetypetracker:FeeTypesTracker]

	
	def beforeInsert() {
		
		if(createdUser ==null && springSecurityService.currentUser !=null)
			createdUser = springSecurityService.currentUser
	}
	
	static constraints = {
		totaladmissionfee nullable:true
		paidadmissionfee nullable:true
		dueadmissionfee  nullable:true
		studentName nullable:true
		feetypetracker nullable:true
		paymentType inList:["DD", "CHECK", "CASH", "ONLINE"]
		ddNumber nullable:true
		checkNumber nullable:true
		invoiceNo nullable:true
		accNo nullable:true
		bankName nullable:true
		tellerNo nullable:true
		pinCode nullable:true
		notes nullable:true
		currentpaidadmissionfee nullable:true
		institute nullable:true
		createdUser nullable:true
		remarks nullable:true
	}
	
	
}
