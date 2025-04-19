package com.hiideals.instituite.classcourses



import static org.springframework.http.HttpStatus.*

import com.hiideals.instituite.EDcoding.LookUpED;

import grails.transaction.Transactional
import grails.plugin.springsecurity.annotation.Secured

@Secured(["ROLE_ADMIN","ROLE_USERR"])
@Transactional(readOnly = true)
class SectionController {

	def userService
	def staffService
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 100, 100)
        respond Section.findAllByInstituite(userService.getCurrentInstituite(),params), model:[sectionInstanceCount: Section.count()]
    }

    def show(Section sectionInstance) {
        respond sectionInstance
    }

    def create() {
		
        respond new Section(params),model:[instituite:userService.getCurrentInstituite(),staffs:staffService.getAllStaffs()]
    }

    @Transactional
    def save(Section sectionInstance) {
       sectionInstance.instituite = userService.getCurrentInstituite()
        if (sectionInstance == null) {
            notFound()
            return
        }

       /* if (sectionInstance.hasErrors()) {
            respond sectionInstance.errors, view:'create'
            return
        }*/
        sectionInstance.save(flush:true,failOnError:true)

        flash.message = "Successfully Updated"
		redirect(action:'index',params:[id:LookUpED.encod(sectionInstance.id)])
    }

    def edit(Section sectionInstance) {
        respond sectionInstance,model:[instituite:userService.getCurrentInstituite()]
    }

    @Transactional
    def update(Section sectionInstance) {
        if (sectionInstance == null) {
            notFound()
            return
        }

        if (sectionInstance.hasErrors()) {
            respond sectionInstance.errors, view:'edit'
            return
        }

        sectionInstance.save flush:true

        flash.message = "Successfully Updated"
		redirect(action:'index',params:[id:LookUpED.encod(sectionInstance.id)])
    }

    @Transactional
    def delete(Section sectionInstance) {

        if (sectionInstance == null) {
            notFound()
            return
        }

        sectionInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Section.label', default: 'Section'), sectionInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'section.label', default: 'Section'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}

