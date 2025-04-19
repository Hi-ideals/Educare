package com.hiideals.institute.library



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional

import java.text.DateFormat
import java.text.SimpleDateFormat

@Secured(["ROLE_ADMIN","ROLE_USERR"])
@Transactional(readOnly = true)
class NewspaperController {
	private static DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
	def userService

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Newspaper.list(params), model:[newspaperInstanceCount: Newspaper.count()]
    }

    def show(Newspaper newspaperInstance) {
        respond newspaperInstance
    }

    def create() {
        respond new Newspaper(params)
    }

    @Transactional
    def save(Newspaper newspaperInstance) {
		df.setLenient(false);
		newspaperInstance.dateofnewspaper = df.parse(params.dateofnewspaper1)
        if (newspaperInstance == null) {
            notFound()
            return
        }

        if (newspaperInstance.hasErrors()) {
            respond newspaperInstance.errors, view:'create'
            return
        }

        newspaperInstance.save flush:true
		flash.message = message(code: 'Newspaper Succesfully Created', args: [message(code: 'Newspaper.label', default: 'Newspaper'), newspaperInstance.id])
		redirect action:'index'
    }

    def edit(Newspaper newspaperInstance) {
        respond newspaperInstance
    }
	
	
	def printNewspaperList(){
		def inst = userService.getCurrentInstituite()
		respond Newspaper.findAllByInstituite(inst,params), model:[newspaperInstanceCount: Newspaper.countByInstituite(inst),instituite:inst]
		
		}

    @Transactional
    def update(Newspaper newspaperInstance) {
		df.setLenient(false);
		newspaperInstance.dateofnewspaper = df.parse(params.dateofnewspaper1)
        if (newspaperInstance == null) {
            notFound()
            return
        }

        if (newspaperInstance.hasErrors()) {
            respond newspaperInstance.errors, view:'edit'
            return
        }

        newspaperInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Newspaper.label', default: 'Newspaper'), newspaperInstance.id])
                redirect newspaperInstance
            }
            '*'{ respond newspaperInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Newspaper newspaperInstance) {

        if (newspaperInstance == null) {
            notFound()
            return
        }

        newspaperInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Newspaper.label', default: 'Newspaper'), newspaperInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'newspaper.label', default: 'Newspaper'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
