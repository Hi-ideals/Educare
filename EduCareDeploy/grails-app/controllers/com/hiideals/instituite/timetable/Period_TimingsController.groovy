package com.hiideals.instituite.timetable



import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional
@Secured(["ROLE_ADMIN","ROLE_USERR"])
@Transactional(readOnly = true)
class Period_TimingsController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
	def userService
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
		def inst = userService.getCurrentInstituite()
        respond Period_Timings.findAllByInstitute(inst,params), model:[period_TimingsInstanceCount: Period_Timings.count()]
    }

    def show(Period_Timings period_TimingsInstance) {
        respond period_TimingsInstance
    }

    def create() {
        respond new Period_Timings(params)
    }

    @Transactional
    def save(Period_Timings period_TimingsInstance) {
        if (period_TimingsInstance == null) {
            notFound()
            return
        }

        if (period_TimingsInstance.hasErrors()) {
            respond period_TimingsInstance.errors, view:'create'
            return
        }

        period_TimingsInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'period_Timings.label', default: 'Period_Timings'), period_TimingsInstance.id])
                redirect period_TimingsInstance
            }
            '*' { respond period_TimingsInstance, [status: CREATED] }
        }
    }

    def edit(Period_Timings period_TimingsInstance) {
        respond period_TimingsInstance
    }

    @Transactional
    def update(Period_Timings period_TimingsInstance) {
        if (period_TimingsInstance == null) {
            notFound()
            return
        }

        if (period_TimingsInstance.hasErrors()) {
            respond period_TimingsInstance.errors, view:'edit'
            return
        }

        period_TimingsInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Period_Timings.label', default: 'Period_Timings'), period_TimingsInstance.id])
                redirect period_TimingsInstance
            }
            '*'{ respond period_TimingsInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Period_Timings period_TimingsInstance) {

        if (period_TimingsInstance == null) {
            notFound()
            return
        }

        period_TimingsInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Period_Timings.label', default: 'Period_Timings'), period_TimingsInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'period_Timings.label', default: 'Period_Timings'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
