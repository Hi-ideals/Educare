package com.hiideals.instituite.feemanagment


import grails.plugin.springsecurity.annotation.Secured
import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional


@Secured(["ROLE_ADMIN","ROLE_USERR"])
@Transactional(readOnly = true)
class AdmissionfeeController {
def userService
def feeService
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
		def admList = feeService.getadmissionfeeList(params,userService)
		println("def subjectList........:"+admList)
        params.max = Math.min(max ?: 100, 100)
        respond admList, model:[admissionfeeInstanceCount: Admissionfee.count()]
    }

    def show(Admissionfee admissionfeeInstance) {
        respond admissionfeeInstance
    }

    def create() {
        respond new Admissionfee(params),model:[instituite:userService.getCurrentInstituite()]
    }

    @Transactional
    def save(Admissionfee admissionfeeInstance) {
        if (admissionfeeInstance == null) {
            notFound()
            return
        }

        if (admissionfeeInstance.hasErrors()) {
            respond admissionfeeInstance.errors, view:'create'
            return
        }
		
		
		admissionfeeInstance.instituite=userService.getCurrentInstituite()
		
		println"!!!!!!!!!"+userService.getCurrentInstituite()

        admissionfeeInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'admissionfee.label', default: 'Admissionfee'), admissionfeeInstance.id])
                redirect admissionfeeInstance
            }
            '*' { respond admissionfeeInstance, [status: CREATED] }
        }
    }

    def edit(Admissionfee admissionfeeInstance) {
        respond admissionfeeInstance,model:[instituite:userService.getCurrentInstituite()]
    }

    @Transactional
    def update(Admissionfee admissionfeeInstance) {
        if (admissionfeeInstance == null) {
            notFound()
            return
        }

        if (admissionfeeInstance.hasErrors()) {
            respond admissionfeeInstance.errors, view:'edit'
            return
        }

        admissionfeeInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Admissionfee.label', default: 'Admissionfee'), admissionfeeInstance.id])
                redirect admissionfeeInstance
            }
            '*'{ respond admissionfeeInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Admissionfee admissionfeeInstance) {

        if (admissionfeeInstance == null) {
            notFound()
            return
        }

        admissionfeeInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Admissionfee.label', default: 'Admissionfee'), admissionfeeInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'admissionfee.label', default: 'Admissionfee'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
