package com.hiideals.institute.payroll



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import grails.plugin.springsecurity.annotation.Secured

@Secured(["ROLE_ADMIN","ROLE_USERR"])
@Transactional(readOnly = true)
class PayHeadController {

def userService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 100, 100)
         respond PayHead.findAllByInstitute(userService.getCurrentInstituite(),params), model:[payHeadInstanceCount: PayHead.count()]
    }

    def show(PayHead payHeadInstance) {
        respond payHeadInstance
    }

    def create() {
        respond new PayHead(params)
    }

    @Transactional
    def save(PayHead payHeadInstance) {
        if (payHeadInstance == null) {
            notFound()
            return
        }

        if (payHeadInstance.hasErrors()) {
            respond payHeadInstance.errors, view:'create'
            return
        }

        payHeadInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'payHead.label', default: 'PayHead'), payHeadInstance.id])
                redirect payHeadInstance
            }
            '*' { respond payHeadInstance, [status: CREATED] }
        }
    }

    def edit(PayHead payHeadInstance) {
        respond payHeadInstance
    }

    @Transactional
    def update(PayHead payHeadInstance) {
        if (payHeadInstance == null) {
            notFound()
            return
        }

        if (payHeadInstance.hasErrors()) {
            respond payHeadInstance.errors, view:'edit'
            return
        }

        payHeadInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'PayHead.label', default: 'PayHead'), payHeadInstance.id])
                redirect payHeadInstance
            }
            '*'{ respond payHeadInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(PayHead payHeadInstance) {

        if (payHeadInstance == null) {
            notFound()
            return
        }

        payHeadInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'PayHead.label', default: 'PayHead'), payHeadInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'payHead.label', default: 'PayHead'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
