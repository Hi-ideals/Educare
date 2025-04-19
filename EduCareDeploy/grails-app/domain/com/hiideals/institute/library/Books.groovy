package com.hiideals.institute.library

import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.users.SecUser

class Books {
	
	def springSecurityService
	
	Date purchasedOn
	 String accessionNumber
	 String author
	 String title
	 String publisher
	 String place
	 String subject
	 String edition
	 String status
	 String volume
	 String year
	 long pages
	 double cost
	 String billNumber
	 String bookSource
	 String moreInfo
	 
	Instituite instituite
	SecUser createdUser
	
	
	def beforeInsert() {
		
		if(createdUser ==null && springSecurityService.currentUser !=null)
			createdUser = springSecurityService.currentUser
	}

    static constraints = {
		
		 author nullable:true
		 title nullable:true
	     publisher nullable:true
		 place nullable:true
		 subject nullable:true
		 edition nullable:true
		 status nullable:true
		 volume nullable:true
		 year nullable:true
		 pages nullable:true
		 cost nullable:true
		 billNumber nullable:true
		 bookSource nullable:true
		 moreInfo nullable:true
		 instituite nullable:true
		 createdUser nullable:true
    }
}
