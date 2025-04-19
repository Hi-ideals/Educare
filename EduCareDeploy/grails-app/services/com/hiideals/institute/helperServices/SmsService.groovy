package com.hiideals.institute.helperServices

import grails.transaction.Transactional

import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.student.Student
import com.hiideals.institute.staff.Staff

@Transactional
class SmsService {

	def userService

	def serviceMethod() {

	}

	def getSmsList(params){

		def result;
		
		if(params.type=='student'){
			def student =Student.createCriteria()
			if(params.classes=='all'){
				 result=student.list(params){
					instituite{'in' 'id',userService.getCurrentInstituite()?.id}
				}
			}else{
				 result=student.list(params){
					instituite{'in' 'id',userService.getCurrentInstituite()}
					presentclass {'in' 'id',IClass.findById(params.int('class')).id}
				}
			}
		}

		if(params.type=='staff'){
			def staff= Staff.createCriteria()

			if(params.staff!='all'){
				 result=staff.list(params){
					institute {'in' 'id',userService.getCurrentInstituite()?.id}
					eq('id',Staff.findById(params.int('staff')).id)
				}
			}else{
				 result=staff.list(params){
					institute {'in' 'id',userService.getCurrentInstituite()?.id}
				}
			}
		}
		
		return result;
	}
}
