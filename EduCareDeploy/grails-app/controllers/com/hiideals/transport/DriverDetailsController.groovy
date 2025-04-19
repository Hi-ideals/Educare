package com.hiideals.transport



import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional

import java.text.DateFormat
import java.text.SimpleDateFormat

import com.hiideals.instituite.helper.Address

@Transactional(readOnly = true)
@Secured(["ROLE_ADMIN","ROLE_USERR"])
class DriverDetailsController {
	def userService;
	private static DateFormat df = new SimpleDateFormat("MM/dd/yyyy");//yyyy-MM-dd");
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 100, 100)
        respond DriverDetails.findAllByInstitute(userService.getCurrentInstituite(),params), model:[driverDetailsInstanceCount: DriverDetails.count()]
    }

    def show(DriverDetails driverDetailsInstance) {
        respond driverDetailsInstance
    }

    def create() {
	def vecal=VehicleDetails.findAllByInstitute(userService.getCurrentInstituite())
        respond new DriverDetails(params),model:[vecal: vecal]
    }

    @Transactional
    def save(DriverDetails driverDetailsInstance) {
		driverDetailsInstance.dob=df.parse(params.dob1)
		Address address=new Address(params).save(flush:true,failOnError:true)
		driverDetailsInstance.presentAddress=address
        if (driverDetailsInstance == null) {
            notFound()
            return
        }

        if (driverDetailsInstance.hasErrors()) {
            respond driverDetailsInstance.errors, view:'create'
            return
        }

        driverDetailsInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'driverDetails.label', default: 'DriverDetails'), driverDetailsInstance.id])
                redirect driverDetailsInstance
            }
            '*' { respond driverDetailsInstance, [status: CREATED] }
        }
    }

    def edit(DriverDetails driverDetailsInstance) {
		
		def vehicles=VehicleDetails.findAllByInstitute(userService.getCurrentInstituite())
		println "vehicles "+vehicles
        respond driverDetailsInstance,model:[vecal:vehicles]
    }

    @Transactional
    def update(DriverDetails driverDetailsInstance) {
		driverDetailsInstance.dob=df.parse(params.dob1)
        if (driverDetailsInstance == null) {
            notFound()
            return
        }

        if (driverDetailsInstance.hasErrors()) {
            respond driverDetailsInstance.errors, view:'edit'
            return
        }

        driverDetailsInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'DriverDetails.label', default: 'DriverDetails'), driverDetailsInstance.id])
                redirect driverDetailsInstance
            }
            '*'{ respond driverDetailsInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(DriverDetails driverDetailsInstance) {

        if (driverDetailsInstance == null) {
            notFound()
            return
        }

        driverDetailsInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'DriverDetails.label', default: 'DriverDetails'), driverDetailsInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'driverDetails.label', default: 'DriverDetails'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
