package com.hiideals.instituite.registration

import com.hiideals.instituite.helper.Image;
import com.hiideals.instituite.users.SecUser;

class ImagesTagLib {
	static encodeAsForTags = [images: [taglib:'none']]
	static namespace = "images"

	def userService

	def getProfilePic={attrs->

		def secuserInstance = SecUser.findByUsername(userService.getUsername())

		Image profilePic = null

		if(secuserInstance?.adminID != null ){
			profilePic = secuserInstance?.adminID?.profilePic
		}else{
			profilePic = secuserInstance?.adminID?.studentID//student = secuserInstance.studentID
		}

		if(profilePic !=null){
			out << """
				<img class="img-circle" alt="${secuserInstance?.username}"
				src="${createLink(controller:'home', action:'displaySingleImage', id:profilePic?.id)}" />
			"""
		}else
			out << """<img alt="" class="img-circle"
				src="assets1/layouts/layout/img/avatar.png" /> """

		//def g = grailsApplication.mainContext.getBean('org.codehaus.groovy.grails.plugins.web.taglib.ApplicationTagLib')
		//out << g.textField(name:'registrationNo',class:'form-control',value:AutoGeneration.getStudentRegId(attrs.Inst?.name))
	}

	def getImage={attrs->
		
		String height = "100px"
		String width = "100px"
		String classs = ""
		
		if(attrs.height){
			height = attrs.height
		}
		
		if(attrs.width){
			height = attrs.width
		}
		
		if(attrs.classs){
			classs = attrs.classs
		}
		
		

		if(attrs.id != null)
			out << """
				<img height='${attrs.height}' width='${attrs.width}' class='${attrs.classs}'
				src="${createLink(controller:'home', action:'displaySingleImage', id:attrs.id)}" />
			"""
		else
		out << """<img alt="" class="img-circle"
				src="assets1/layouts/layout/img/avatar.png" /> """
		
	}

	def getDashboardLogo={ attrs->
		if(attrs.id !=null){
			out << """
				<img width="200px" style="margin:12px 0px"  class="img-rounded"
				src="${createLink(controller:'home', action:'displaySingleImage', id:attrs.id)}" />
			"""
		}
	}
}

