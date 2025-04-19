package com.hiideals.transport



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

import grails.plugin.springsecurity.annotation.Secured;

@Transactional(readOnly = true)
@Secured(["ROLE_ADMIN","ROLE_USERR"])
class RouteDetailsController {
	def userService;
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 100, 100)
        respond RouteDetails.findAllByInstitute(userService.getCurrentInstituite(),params), model:[routeDetailsInstanceCount: RouteDetails.count()]
    }

    def show(RouteDetails routeDetailsInstance) {
        respond routeDetailsInstance
    }

    def create() {
	def vecal=VehicleDetails.findAllByInstitute(userService.getCurrentInstituite())
        respond new RouteDetails(params),model:[vecal: vecal]
    }

    @Transactional
    def save(RouteDetails routeDetailsInstance) {
        if (routeDetailsInstance == null) {
            notFound()
            return
        }

        if (routeDetailsInstance.hasErrors()) {
            respond routeDetailsInstance.errors, view:'create'
            return
        }

        routeDetailsInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'routeDetails.label', default: 'RouteDetails'), routeDetailsInstance.id])
                redirect routeDetailsInstance
            }
            '*' { respond routeDetailsInstance, [status: CREATED] }
        }
    }

    def edit(RouteDetails routeDetailsInstance) {
		def vehicles=VehicleDetails.findAllByInstitute(userService.getCurrentInstituite())
        respond routeDetailsInstance,model:[vecal:vehicles]
    }

    @Transactional
    def update(RouteDetails routeDetailsInstance) {
        if (routeDetailsInstance == null) {
            notFound()
            return
        }

        if (routeDetailsInstance.hasErrors()) {
            respond routeDetailsInstance.errors, view:'edit'
            return
        }

        routeDetailsInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'RouteDetails.label', default: 'RouteDetails'), routeDetailsInstance.id])
                redirect routeDetailsInstance
            }
            '*'{ respond routeDetailsInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(RouteDetails routeDetailsInstance) {

        if (routeDetailsInstance == null) {
            notFound()
            return
        }

        routeDetailsInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'RouteDetails.label', default: 'RouteDetails'), routeDetailsInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'routeDetails.label', default: 'RouteDetails'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
