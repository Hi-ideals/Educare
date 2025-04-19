package com.hiideals.institute.helperServices

import com.hiideals.instituite.classcourses.Subject;
import com.hiideals.instituite.userservices.UserService;

import grails.transaction.Transactional

/**
 * @author Uddha Umesh
 *
 * 06-Dec-2016
 */
@Transactional
class SubjectService {

	def userService
	
    /**
     * @param params
     * @return
     */
    def getSubjectList(params){
		return Subject.createCriteria().list(params){
			eq ('institute.id', userService?.getCurrentInstituite()?.id)
		}
	}
	
	
	/**
	 * @param params
	 * @param us
	 * @return
	 */
	def getSubjectList(params, UserService us){
		return Subject.createCriteria().list(params){
			eq ('institute.id', us?.getCurrentInstituite()?.id)
			if(params.iclass && params.iclass != "null"){
				//'in'("iclass.id",params.long('iclass'))
				iclass {
					eq ('id',new Long(params.iclass))
				}
			}
		}
	}
}
