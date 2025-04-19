package com.hiideals.instituite.classcourses



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import grails.plugin.springsecurity.annotation.Secured

@Secured(["ROLE_ADMIN","ROLE_USERR"])
@Transactional(readOnly = true)
class IClassController {

	def userService
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 100, 100)
        respond IClass.findAllByInstituite(userService.getCurrentInstituite(),params), model:[IClassInstanceCount: IClass.count()]
    }

    def show(IClass IClassInstance) {
        respond IClassInstance
    }

    def create() {
        respond new IClass(params),model:[instituite:userService.getCurrentInstituite()]
    }

    @Transactional
    def save(IClass IClassInstance) {
		
		def instituite = userService.getCurrentInstituite()
		def IclassList = IClass.findAllByInstituite(instituite)
		def duplicateClass=IclassList.classname.contains(params.classname)
		if(duplicateClass){
			flash.msg="This Class already exist in this Institute ."
			redirect(action:'index')
			
		}else{
		if (IClassInstance == null) {
			notFound()
			return
		}

        if (IClassInstance.hasErrors()) {
            respond IClassInstance.errors, view:'create'
            return
        }

        IClassInstance.save flush:true

		flash.message = "Successfully Updated"
		redirect(action:'index')
		}
		
    }

    def edit(IClass IClassInstance) {
        respond IClassInstance,model:[instituite:userService.getCurrentInstituite()]
    }

    @Transactional
    def update() {
		
		IClass IClassInstance=IClass.findById(params.int('id'))
		IClassInstance.sections.clear()
		IClassInstance.properties=params
        if (IClassInstance == null) {
            notFound()
            return
        }

        if (IClassInstance.hasErrors()) {
            respond IClassInstance.errors, view:'edit'
            return
        }
		
        IClassInstance.save flush:true

        flash.message = "Successfully Updated"
		redirect(action:'index')
    }

    @Transactional
    def delete(IClass IClassInstance) {

        if (IClassInstance == null) {
            notFound()
            return
        }

        IClassInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'IClass.label', default: 'IClass'), IClassInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'IClass.label', default: 'IClass'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}


