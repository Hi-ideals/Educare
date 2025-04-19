package com.hiideals.institute.staff



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import grails.plugin.springsecurity.annotation.Secured;
@Secured(["ROLE_ADMIN","ROLE_USERR"])
@Transactional(readOnly = true)
class StaffController {

	static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
	def userService
	def batchService
	def subjectService

	def index(Integer max) {
		params.max = Math.min(max ?: 100, 100)
		params.sort = "dateCreated" ?: params.sort
		params.order = "desc"
		
		def staffList = batchService.getListofStaff(params)
		params.sort = null
		params.order = null
		def subjectList = subjectService.getSubjectList(params,userService)
		respond staffList, model:[staffInstanceCount: staffList.totalCount,subjectList:subjectList,classList:userService.getAllClasses()]
	}

	def show(Staff staffInstance) {
		respond staffInstance
	}

	def create() {
		if(!params.errors)
			respond new Staff(params),model:[instituite:userService.getCurrentInstituite()]
		else{
			[instituite:userService.getCurrentInstituite()]
		}
	}

	@Transactional
	def save(Staff staffInstance) {
		def inst = userService.getCurrentInstituite()
		def allStaff=Staff.findAllByInstitute(inst)
		def duplicatestaff = allStaff.staffID
		def duplicateStaffId=duplicatestaff.contains(Integer.parseInt(params.staffID))
		if(duplicateStaffId){
			flash.msg= "This Staff ID already exist in this Institute ."
			redirect(action:'create')
			
		}else{
		if (staffInstance == null) {
			notFound()
			return
		}

		if (staffInstance.hasErrors()) {
			chain(action:'create',model:[staffInstance:staffInstance],params:[errors:true])
			return
		}
		
		staffInstance.address.save(flush:true,failOnError:true)
		

		staffInstance.save flush:true
		flash.message = message(code: 'default.created.message', args: [
			message(code: 'Staff.label', default: 'Staff'),
			staffInstance.staffName
		])
		redirect(action:'index')
		}
		
	}

	def edit(Staff staffInstance) {
		respond staffInstance,model:[instituite:userService.getCurrentInstituite()]
	}

	@Transactional
	def update(Staff staffInstance) {
		if (staffInstance == null) {
			notFound()
			return
		}

		if (staffInstance.hasErrors()) {
			respond staffInstance.errors, view:'edit'
			return
		}

		staffInstance.save flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.updated.message', args: [
					message(code: 'Staff.label', default: 'Staff'),
					staffInstance.staffName
				])
				redirect staffInstance
			}
			'*'{ respond staffInstance, [status: OK] }
		}
	}

	@Transactional
	def delete(Staff staffInstance) {

		if (staffInstance == null) {
			notFound()
			return
		}

		staffInstance.delete flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.deleted.message', args: [
					message(code: 'Staff.label', default: 'Staff'),
					staffInstance.staffName
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
					message(code: 'staff.label', default: 'Staff'),
					params.id
				])
				redirect action: "index", method: "GET"
			}
			'*'{ render status: NOT_FOUND }
		}
	}
}
