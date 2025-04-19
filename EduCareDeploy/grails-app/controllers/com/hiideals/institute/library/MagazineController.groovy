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
class MagazineController {
	private static DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
	def userService

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Magazine.list(params), model:[magazineInstanceCount: Magazine.count()]
    }

    def show(Magazine magazineInstance) {
        respond magazineInstance
    }

    def create() {
        respond new Magazine(params)
    }

    @Transactional
    def save(Magazine magazineInstance) {
		df.setLenient(false);
		magazineInstance.purchasedOn = df.parse(params.purchasedOn1)
		
        if (magazineInstance == null) {
            notFound()
            return
        }

        if (magazineInstance.hasErrors()) {
            respond magazineInstance.errors, view:'create'
            return
        }

        magazineInstance.save flush:true
		flash.message = message(code: 'Magazine Succesfully Created', args: [message(code: 'magazine.label', default: 'Magazine'), magazineInstance.id])
		redirect action:'index'
    }

    def edit(Magazine magazineInstance) {
        respond magazineInstance
    }

    @Transactional
    def update(Magazine magazineInstance) {
		df.setLenient(false);
		magazineInstance.purchasedOn = df.parse(params.purchasedOn1)
        if (magazineInstance == null) {
            notFound()
            return
        }

        if (magazineInstance.hasErrors()) {
            respond magazineInstance.errors, view:'edit'
            return
        }

        magazineInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Magazine.label', default: 'Magazine'), magazineInstance.id])
                redirect magazineInstance
            }
            '*'{ respond magazineInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Magazine magazineInstance) {

        if (magazineInstance == null) {
            notFound()
            return
        }

        magazineInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Magazine.label', default: 'Magazine'), magazineInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'magazine.label', default: 'Magazine'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
	
	def printMagazineList(){
		
		def inst = userService.getCurrentInstituite()
		respond Magazine.findAllByInstituite(inst,params), model:[magazineInstanceCount: Magazine.countByInstituite(inst),instituite:inst]
		
	}
}
