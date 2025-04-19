package com.hiideals.instituite.feemanagment



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import grails.plugin.springsecurity.annotation.Secured

@Secured(["ROLE_ADMIN","ROLE_USERR"])
@Transactional(readOnly = true)
class FeesTypesController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 100, 100)
        respond FeesTypes.list(params), model:[feesTypesInstanceCount: FeesTypes.count()]
    }

    def show(FeesTypes feesTypesInstance) {
        respond feesTypesInstance
    }

    def create() {
        respond new FeesTypes(params)
    }

    @Transactional
    def save(FeesTypes feesTypesInstance) {
        if (feesTypesInstance == null) {
            notFound()
            return
        }

        if (feesTypesInstance.hasErrors()) {
            respond feesTypesInstance.errors, view:'create'
            return
        }

        feesTypesInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'feesTypes.label', default: 'FeesTypes'), feesTypesInstance.id])
                redirect feesTypesInstance
            }
            '*' { respond feesTypesInstance, [status: CREATED] }
        }
    }

    def edit(FeesTypes feesTypesInstance) {
        respond feesTypesInstance
    }

    @Transactional
    def update(FeesTypes feesTypesInstance) {
        if (feesTypesInstance == null) {
            notFound()
            return
        }

        if (feesTypesInstance.hasErrors()) {
            respond feesTypesInstance.errors, view:'edit'
            return
        }

        feesTypesInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'FeesTypes.label', default: 'FeesTypes'), feesTypesInstance.id])
                redirect feesTypesInstance
            }
            '*'{ respond feesTypesInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(FeesTypes feesTypesInstance) {

        if (feesTypesInstance == null) {
            notFound()
            return
        }

        feesTypesInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'FeesTypes.label', default: 'FeesTypes'), feesTypesInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'feesTypes.label', default: 'FeesTypes'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
