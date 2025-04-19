package com.hiideals.instituite.student



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import grails.plugin.springsecurity.annotation.Secured

@Secured(["ROLE_ADMIN","ROLE_USERR"])
@Transactional(readOnly = true)
class ParentDetailsController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 100, 100)
        respond ParentDetails.list(params), model:[parentDetailsInstanceCount: ParentDetails.count()]
    }

    def show(ParentDetails parentDetailsInstance) {
        respond parentDetailsInstance
    }

    def create() {
        respond new ParentDetails(params)
    }

    @Transactional
    def save(ParentDetails parentDetailsInstance) {
        if (parentDetailsInstance == null) {
            notFound()
            return
        }

        if (parentDetailsInstance.hasErrors()) {
            respond parentDetailsInstance.errors, view:'create'
            return
        }

        parentDetailsInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'parentDetails.label', default: 'ParentDetails'), parentDetailsInstance.id])
                redirect parentDetailsInstance
            }
            '*' { respond parentDetailsInstance, [status: CREATED] }
        }
    }

    def edit(ParentDetails parentDetailsInstance) {
        respond parentDetailsInstance
    }

    @Transactional
    def update(ParentDetails parentDetailsInstance) {
        if (parentDetailsInstance == null) {
            notFound()
            return
        }

        if (parentDetailsInstance.hasErrors()) {
            respond parentDetailsInstance.errors, view:'edit'
            return
        }

        parentDetailsInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'ParentDetails.label', default: 'ParentDetails'), parentDetailsInstance.id])
                redirect parentDetailsInstance
            }
            '*'{ respond parentDetailsInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(ParentDetails parentDetailsInstance) {

        if (parentDetailsInstance == null) {
            notFound()
            return
        }

        parentDetailsInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'ParentDetails.label', default: 'ParentDetails'), parentDetailsInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'parentDetails.label', default: 'ParentDetails'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
