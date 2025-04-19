package com.hiideals.transport



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import java.text.DateFormat
import java.text.SimpleDateFormat

import grails.plugin.springsecurity.annotation.Secured;

@Transactional(readOnly = true)
@Secured(["ROLE_ADMIN","ROLE_USERR"])
class VehicleDetailsController {

    private static DateFormat df = new SimpleDateFormat("MM/dd/yyyy");//yyyy-MM-dd");
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
	def userService
    def index(Integer max) {
        params.max = Math.min(max ?: 100, 100)
        respond VehicleDetails.findAllByInstitute(userService.getCurrentInstituite(),params), model:[vehicleDetailsInstanceCount: VehicleDetails.count()]
    }

    def show(VehicleDetails vehicleDetailsInstance) {
        respond vehicleDetailsInstance
    }

    def create() {
        respond new VehicleDetails(params)
    }

    @Transactional
    def save(VehicleDetails vehicleDetailsInstance) {
	vehicleDetailsInstance.insuranceRenewalDate=df.parse(params.insuranceRenewalDate1)
        if (vehicleDetailsInstance == null) {
            notFound()
            return
        }

        if (vehicleDetailsInstance.hasErrors()) {
            respond vehicleDetailsInstance.errors, view:'create'
            return
        }

        vehicleDetailsInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'vehicleDetails.label', default: 'VehicleDetails'), vehicleDetailsInstance.id])
                redirect vehicleDetailsInstance
            }
            '*' { respond vehicleDetailsInstance, [status: CREATED] }
        }
    }

    def edit(VehicleDetails vehicleDetailsInstance) {
        respond vehicleDetailsInstance
    }

    @Transactional
    def update(VehicleDetails vehicleDetailsInstance) {
	vehicleDetailsInstance.insuranceRenewalDate=df.parse(params.insuranceRenewalDate1)
        if (vehicleDetailsInstance == null) {
            notFound()
            return
        }

        if (vehicleDetailsInstance.hasErrors()) {
            respond vehicleDetailsInstance.errors, view:'edit'
            return
        }

        vehicleDetailsInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'VehicleDetails.label', default: 'VehicleDetails'), vehicleDetailsInstance.id])
                redirect vehicleDetailsInstance
            }
            '*'{ respond vehicleDetailsInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(VehicleDetails vehicleDetailsInstance) {

        if (vehicleDetailsInstance == null) {
            notFound()
            return
        }

        vehicleDetailsInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'VehicleDetails.label', default: 'VehicleDetails'), vehicleDetailsInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'vehicleDetails.label', default: 'VehicleDetails'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
