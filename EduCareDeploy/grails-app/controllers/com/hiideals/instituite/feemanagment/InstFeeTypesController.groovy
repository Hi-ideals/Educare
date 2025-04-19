package com.hiideals.instituite.feemanagment



import static org.springframework.http.HttpStatus.*

import com.hiideals.instituite.EDcoding.LookUpED;

import grails.transaction.Transactional
import grails.plugin.springsecurity.annotation.Secured

@Secured(["ROLE_ADMIN","ROLE_USERR"])
@Transactional(readOnly = true)
class InstFeeTypesController {

	static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
	def userService
	def feeService

	def index(Integer max) {
		params.max = Math.min(max ?: 100, 100)
		
		def instFeeTypesInstance = feeService.getInstFees(params)
		int Totalsum = 0;
		(instFeeTypesInstance?.totalAmount).each {
			Totalsum=Totalsum+it
		}
		respond instFeeTypesInstance, model:[Totalsum:Totalsum,instFeeTypesInstanceCount: instFeeTypesInstance.getTotalCount()]
	}

	def show(InstFeeTypes instFeeTypesInstance) {
		respond instFeeTypesInstance
	}

	def create() {
		respond new InstFeeTypes(params),model:[instituite:userService.getCurrentInstituite()]
	}

	@Transactional
	def save(InstFeeTypes instFeeTypesInstance) {


		instFeeTypesInstance.instituite = userService.getCurrentInstituite()

		if (instFeeTypesInstance == null) {
			notFound()
			return
		}

		if (instFeeTypesInstance.hasErrors()) {
			//respond instFeeTypesInstance.errors, view:'create'
			// return
		}

		instFeeTypesInstance.save(flush:true,failOnError:true)
		redirect(action:'index')
	}

	def edit(InstFeeTypes instFeeTypesInstance) {
		respond instFeeTypesInstance,model:[instituite:instFeeTypesInstance.instituite]
	}

	@Transactional
	def update(InstFeeTypes instFeeTypesInstance) {
		if (instFeeTypesInstance == null) {
			notFound()
			return
		}

		if (instFeeTypesInstance.hasErrors()) {
			respond instFeeTypesInstance.errors, view:'edit'
			return
		}

		instFeeTypesInstance.save flush:true
		flash.message = "Successfully Updated"
		redirect action:'index'
	}

	@Transactional
	def delete(InstFeeTypes instFeeTypesInstance) {

		if (instFeeTypesInstance == null) {
			notFound()
			return
		}

		instFeeTypesInstance.delete flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.deleted.message', args: [
					message(code: 'InstFeeTypes.label', default: 'InstFeeTypes'),
					instFeeTypesInstance.id
				])
				redirect action:"index", method:"GET"
			}
			'*'{ render status: NO_CONTENT }
		}
	}

	protected void notFound() {
		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.not.found.message', args: [
					message(code: 'instFeeTypes.label', default: 'InstFeeTypes'),
					params.id
				])
				redirect action: "index", method: "GET"
			}
			'*'{ render status: NOT_FOUND }
		}
	}
}



