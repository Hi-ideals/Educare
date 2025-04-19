package com.hiideals.institute.certificates
import com.hiideals.instituite.main.Instituite;
import grails.plugin.springsecurity.annotation.Secured;
@Secured(["ROLE_ADMIN","ROLE_USERR"])
class HolidayController {
	
	def userService
	
    def index() { 
		
		def holidaylist = Holidaynotice.findAll()
		[holidaylist:holidaylist]
	}
	def holidaysave(){
	
		Holidaynotice holiday = new Holidaynotice()
		holiday.holidaydate = params.holidaydate
		holiday.toholidaydate = params.toholidaydate
		holiday.holidayreason =	params.holidayreason
		holiday.save(flush:true,failOnError:true)
		redirect action:'index'
		
	}
	
	def printholiday(){
		def instituite = userService.getCurrentInstituite()
		def holidayprint = Holidaynotice.findById(params.id)
		[holidayprint:holidayprint,instituite:instituite]
	}
	
}

