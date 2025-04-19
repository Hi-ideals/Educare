package com.hiideals.instituite.timetable

import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.classcourses.Section
import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.users.SecUser

class ClassTimeTable {
	
	 def springSecurityService	
	IClass classname
	Section section
	int lunchAfterPeriod
	
	
	Instituite institute
	String availableFor
	SecUser createdUser
	
	static hasMany = [timetables:TimeTable]
	
	def beforeInsert() {
		
				if(createdUser ==null && springSecurityService.currentUser !=null)
					createdUser = springSecurityService.currentUser
		}

    static constraints = {
		createdUser nullable:true
		timetables nullable:true
		institute nullable:true
		availableFor inlist:['Monday','Tuesday','Wednesday','Thursday','Friday','Satuarday']
    }
	
	static mapping = {
		timetables sort: 'periodName', order: 'asc'
		timetables		cascade: "all"
	}
}
