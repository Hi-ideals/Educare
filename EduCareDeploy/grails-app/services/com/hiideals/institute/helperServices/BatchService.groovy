package com.hiideals.institute.helperServices

import com.hiideals.instituite.helper.Batch;
import com.hiideals.institute.staff.Staff;

import grails.transaction.Transactional


/**
 * @author Uddha Umesh
 *
 * 06-Dec-2016
 */
@Transactional
class BatchService {

	def userService

	/**
	 * @param params
	 * @return
	 */
	 
	 def getcountofBatches(){
		return Batch.createCriteria().list(){
			eq ('institute.id', userService?.getCurrentInstituite()?.id)
			projections {
				count()
			}
			
		}
	}
	 
	def getListofBatches(params){
		return Batch.createCriteria().list(params){
			eq ('institute.id', userService?.getCurrentInstituite()?.id)
		}
	}
	
	def getListofBatches(){
		return Batch.createCriteria().list(){
			eq ('institute.id', userService?.getCurrentInstituite()?.id)
		}
	}
	
	def getListofStaff(){
		return Staff.createCriteria().list{
			eq ('institute.id', userService?.getCurrentInstituite()?.id)
			projections {
				count()
			}
		}
	}

	/**
	 * @param params
	 * @return substutingSubjects
	 */
	def getListofStaff(params){
		return Staff.createCriteria().list(params){
			eq ('institute.id', userService?.getCurrentInstituite()?.id)
			if(params.subject && params.subject != "null") {
				eq("teachingSubject.id",params.long('subject'))
			}
			if(params.iclass && params.iclass != "null"){
				or{
					teachingSubject{
						'in'("iclass.id",params.long('iclass'))
					}
				}
			}
		}
	}
}
