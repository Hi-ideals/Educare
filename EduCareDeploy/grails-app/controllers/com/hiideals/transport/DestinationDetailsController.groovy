package com.hiideals.transport



import static org.springframework.http.HttpStatus.*

import com.hiideals.instituite.helper.Batch;

import grails.transaction.Transactional
import grails.plugin.springsecurity.annotation.Secured;

@Transactional(readOnly = true)
@Secured(["ROLE_ADMIN","ROLE_USERR"])
class DestinationDetailsController {
	def batchService
	def userService;
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 100, 100)
        respond DestinationDetails.findAllByInstitute(userService.getCurrentInstituite(),params), model:[destinationDetailsInstanceCount: DestinationDetails.count()]
    }

    def show(DestinationDetails destinationDetailsInstance) {
        respond destinationDetailsInstance
    }

    def create() {
		
		def batchList = batchService.getListofBatches(params)
	def rut=RouteDetails.findAllByInstitute(userService.getCurrentInstituite())
        respond new DestinationDetails(params),model:[rut:rut,batchList:batchList]
    }

    @Transactional
    def save(DestinationDetails destinationDetailsInstance) {
        if (destinationDetailsInstance == null) {
            notFound()
            return
        }

        if (destinationDetailsInstance.hasErrors()) {
            respond destinationDetailsInstance.errors, view:'create'
            return
        }
		destinationDetailsInstance.acdemicyear=Batch.findById(params?.academicyear)
        destinationDetailsInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'destinationDetails.label', default: 'DestinationDetails'), destinationDetailsInstance.id])
                redirect destinationDetailsInstance
            }
            '*' { respond destinationDetailsInstance, [status: CREATED] }
        }
    }

    def edit(DestinationDetails destinationDetailsInstance) {
		def routes=RouteDetails.findAllByInstitute(userService.getCurrentInstituite())
        respond destinationDetailsInstance,model:[rut:routes]
    }

    @Transactional
    def update(DestinationDetails destinationDetailsInstance) {
        if (destinationDetailsInstance == null) {
            notFound()
            return
        }

        if (destinationDetailsInstance.hasErrors()) {
            respond destinationDetailsInstance.errors, view:'edit'
            return
        }
		destinationDetailsInstance.acdemicyear=Batch.findById(params?.academicyear)
        destinationDetailsInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'DestinationDetails.label', default: 'DestinationDetails'), destinationDetailsInstance.id])
                redirect destinationDetailsInstance
            }
            '*'{ respond destinationDetailsInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(DestinationDetails destinationDetailsInstance) {

        if (destinationDetailsInstance == null) {
            notFound()
            return
        }

        destinationDetailsInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'DestinationDetails.label', default: 'DestinationDetails'), destinationDetailsInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'destinationDetails.label', default: 'DestinationDetails'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
