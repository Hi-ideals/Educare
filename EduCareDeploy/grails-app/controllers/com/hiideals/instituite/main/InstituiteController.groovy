package com.hiideals.instituite.main



import static org.springframework.http.HttpStatus.*

import com.hiideals.instituite.EDcoding.LookUpED;
import com.hiideals.instituite.helper.Image;

import grails.transaction.Transactional
import grails.plugin.springsecurity.annotation.Secured

/**
 * @author Uddha Umesh
 *
 */
@Secured(["ROLE_ADMIN","ROLE_USERR"])
class InstituiteController {

	static allowedMethods = [save: "POST", update: "POST", delete: "DELETE"]
	def userService
	def studentService

	def index(Integer max) {
		params.max = Math.min(max ?: 100, 100)
		def roles = userService.getUserRoles()

		if((roles.authority).contains("ROLE_ADMIN") && userService.getUsername() =="superadmin"){
			respond Instituite.list(params), model:[instituiteInstanceCount: Instituite.count()]//findAllByAdmin(userService.getCurrentAdmin()
		}else{ 
		    if(userService.getCurrentInstituite()){
			redirect action:'show',params:[id:LookUpED.encod(userService.getCurrentInstituite().id)]}
		}
	}

	def show(Instituite instituiteInstance) {
		//instituiteInstance = Instituite.get(LookUpED.decod(params.id))
		respond instituiteInstance
	}

	def create() {
		def admin = userService.getCurrentAdmin()
		def is = Instituite.findByAdmin(admin)

		if(params.error =='true' && is == null){
			[admin:admin]
		}
		else
		if(!is)
			respond new Instituite(params),model:[admin:admin]
		else
			redirect action:'show', params:[id:LookUpED.encod(is.id)]
	}


	@Transactional
	def save(Instituite instituiteInstance) {
		instituiteInstance.admin = userService.getCurrentAdmin()
		if (instituiteInstance == null) {
			notFound()
			return
		}

		if (instituiteInstance.hasErrors()) {
			//respond instituiteInstance.errors, view:'create'
			chain(action:'create',model:[instituiteInstance:instituiteInstance],params:[error:true])
			return
		}

		def stpath = grailsApplication.config.imageFolder
		def file = request.getFile('file_1')
		String path = studentService.getPath(stpath,instituiteInstance.name)
		String s = path + file.getOriginalFilename()

		try{
			file.transferTo(new File(s))
		}catch(Exception e){}
		Image image = new Image(imagePath:s,imageDescription:"").save(flush:true,failOnError:true)
		instituiteInstance.logo = image
		instituiteInstance.signature = image
		
		def stpathh = grailsApplication.config.imageFolder
		def filee = request.getFile('file')
		String pathh = studentService.getPath(stpath,instituiteInstance.name)
		String ss = path + file.getOriginalFilename()

		try{
			file.transferTo(new File(s))
		}catch(Exception e){}
		Image image1 = new Image(imagePath:s,imageDescription:"").save(flush:true,failOnError:true)
		instituiteInstance.signature = image1

		instituiteInstance.save flush:true
		redirect(action:'show',params:[id:LookUpED.encod(instituiteInstance.id)])

		/*request.withFormat {
		 form multipartForm {
		 flash.message = message(code: 'default.created.message', args: [
		 message(code: 'instituite.label', default: 'Instituite'),
		 instituiteInstance.id
		 ])
		 redirect instituiteInstance
		 }
		 '*' { respond instituiteInstance, [status: CREATED] }
		 }*/
	}

	def edit(Instituite instituiteInstance) {
		respond instituiteInstance,model:[admin:instituiteInstance.admin]
	}

	def update(Instituite instituiteInstance) {
		if (instituiteInstance == null) {
			notFound()
			return
		}

		if (instituiteInstance.hasErrors()) {
			respond instituiteInstance.errors, view:'edit'
			return
		}

		if(params.openimg !=null && params.openimg.equals("yes")){
			def stpath = grailsApplication.config.imageFolder
			def file = request.getFile('file_1')
			String path = studentService.getPath(stpath,instituiteInstance.name)
			String s = path + file.getOriginalFilename()

			try{
				file.transferTo(new File(s))
			}catch(Exception e){}
			Image image = new Image(imagePath:s,imageDescription:"").save(flush:true,failOnError:true)
			instituiteInstance.logo = image
		}
		
		if(params.openimgg !=null && params.openimgg.equals("yes")){
			def stpath = grailsApplication.config.imageFolder
			def file = request.getFile('file')
			String path = studentService.getPath(stpath,instituiteInstance.name)
			String s = path + file.getOriginalFilename()

			try{
				file.transferTo(new File(s))
			}catch(Exception e){}
			Image image = new Image(imagePath:s,imageDescription:"").save(flush:true,failOnError:true)
			
			instituiteInstance.signature = image
		}
		instituiteInstance.save flush:true
		redirect(action:'show',params:[id:LookUpED.encod(instituiteInstance.id)])

		/*request.withFormat {
		 form multipartForm {
		 flash.message = message(code: 'default.updated.message', args: [
		 message(code: 'Instituite.label', default: 'Instituite'),
		 instituiteInstance.id
		 ])
		 redirect instituiteInstance
		 }
		 '*'{ respond instituiteInstance, [status: OK] }
		 }*/
	}

	@Transactional
	def delete(Instituite instituiteInstance) {

		if (instituiteInstance == null) {
			notFound()
			return
		}

		instituiteInstance.delete flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.deleted.message', args: [
					message(code: 'Instituite.label', default: 'Instituite'),
					instituiteInstance.id
				])
				redirect action:"index", method:"GET"
			}
			'*'{ render status: NO_CONTENT }
		}
	}

	protected void notFound() {
		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.not.found.message', args: [
					message(code: 'instituite.label', default: 'Instituite'),
					params.id
				])
				redirect action: "index", method: "GET"
			}
			'*'{ render status: NOT_FOUND }
		}
	}
}




