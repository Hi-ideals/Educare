package com.hiideals.instituite.registration

import grails.plugin.springsecurity.SpringSecurityUtils

import com.hiideals.instituite.helper.UserModules
import com.hiideals.institution.autogeneration.AutoGeneration

/**
 * @author Uddha Umesh
 * @createdOn 24-Nov-2016
 *
 */
class RegistrationTagLib {

	static encodeAsForTags = [regId: [taglib:'none']]
	static namespace = "regId"
	def userService
	def springSecurityService


	def getRegId={attrs->
		//def g = grailsApplication.mainContext.getBean('org.codehaus.groovy.grails.plugins.web.taglib.ApplicationTagLib')
		out << g.textField(name:'registrationNo',class:'form-control',value:AutoGeneration.getStudentRegId(attrs.Inst?.name))
	}


	def getInstId={attrs->
		out << g.textField(name:'institutionID',class:'form-control',value:AutoGeneration.getInstitutionId(attrs.admin?.adminName))
	}

	def getIClsId={attrs->
		out << g.textField(name:'classID',class:'form-control',value:AutoGeneration.getclassId(attrs.inst))
	}

	def getSecId={attrs->
		out << g.textField(name:'sectionID',class:'form-control',value:AutoGeneration.getclassId(attrs.inst))
	}
	
	def getInstituite={attrs->
		
		out<<g.set(value:userService.getCurrentInstituite(),  , var:'instituite')
	}
	
	def getdrop={attrs->
		
		out<<"""<select>
							<option>
								dsaf
							</option>
				</select>"""
	}
	
	def getModule={attrs->
		
		def aa
		if(SpringSecurityUtils.ifAllGranted("ROLE_ADMIN")){
			aa=userService.getCurrentAdmin().modules.contains(UserModules.findByModuleName(attrs.name))
		}else{	
			aa=userService.getCurrentUser().modules.contains(UserModules.findByModuleName(attrs.name))
		}
		out<< g.set(value:aa, var:'module')
	}
}


//static defaultEncodeAs = [taglib:'html']
//static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]
