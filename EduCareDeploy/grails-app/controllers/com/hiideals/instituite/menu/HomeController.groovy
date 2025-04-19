package com.hiideals.instituite.menu

import grails.plugin.springsecurity.SpringSecurityUtils;
import grails.plugin.springsecurity.annotation.Secured

import com.hiideals.instituite.helper.Image;
import com.hiideals.instituite.admin.RequestedDemo

import grails.plugin.springsecurity.SpringSecurityUtils;
import grails.plugin.springsecurity.annotation.Secured

/**
 * @author Uddha Umesh
 *
 */
@Secured(['IS_AUTHENTICATED_ANONYMOUSLY'])
class HomeController {
     def EmailsService
	 def springSecurityService
	 
	def index() {
		println"@@@@"+springSecurityService.getPrincipal().getAuthorities()
		
		if(SpringSecurityUtils.ifAllGranted("ROLE_SUPERADMIN"))
			redirect(controller:'admin')
		else if(SpringSecurityUtils.ifAnyGranted("ROLE_ADMIN,ROLE_USERR"))
			redirect(controller:'dashboard')
			else{
				redirect(controller:'login',action:'auth')
			}
			
	}

	def displaySingleImage(){

		def image = Image.findById(new Long(params.id))
		def file = new File(image.imagePath)
		def fileInputStream = new FileInputStream(file)
		def outputStream = response.getOutputStream()
		byte[] buffer = new byte[4096];
		int len;
		while ((len = fileInputStream.read(buffer)) > 0) {
			outputStream.write(buffer, 0, len);
		}
		outputStream.flush()
		outputStream.close()
		fileInputStream.close()
	}
	def requesteddemo(){
        def rr=new RequestedDemo(params)
        rr.save(flush:true)
        flash.msg="Successfully saved"
        try {
        //EmailsService.sendRequestedDemoMessage(requestedDemo.email,'Requesteed For Demo','<b>Name:</b> '+requestedDemo.name+'<br/><b>Email:</b> '+requestedDemo.email+'<br/><b>mobile:</b> '+requestedDemo.mobile+'<br/><b>place:</b> '+requestedDemo.place+'<br/><b>School/Colleg:</b> '+requestedDemo.sclclg+'<br/><b>Description:</b> '+ params.description+'<br/><b>Phone Number:</b> '+requestedDemo.phNo+'<br/>')
        } catch (Exception e) {
            e.printStackTrace()
        }
        render(template:'success')
    }

}


