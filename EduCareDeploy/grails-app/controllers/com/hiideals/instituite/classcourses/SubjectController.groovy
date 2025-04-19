package com.hiideals.instituite.classcourses



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import grails.plugin.springsecurity.annotation.Secured;
@Secured(["ROLE_ADMIN","ROLE_USERR"])
@Transactional(readOnly = true)
class SubjectController {

	static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
	def userService
	def subjectService

	def index(Integer max) {
		params.max = Math.min(max ?: 100, 100)
		def subjectList = subjectService.getSubjectList(params,userService)
		respond subjectList, model:[subjectInstanceCount: subjectList.getTotalCount(),classList:userService.getAllClasses()]
	}

	def show(Subject subjectInstance) {
		respond subjectInstance
	}

	def create() {
		def inst = userService.getCurrentInstituite()
		respond new Subject(params),model:[iclass:IClass.findAllByInstituite(inst),instituite:inst]
	}

	@Transactional
	def save(Subject subjectInstance) {



		if (subjectInstance == null) {
			notFound()
			return
		}


		if (subjectInstance.hasErrors()) {

			respond subjectInstance.errors, view:'create'
			return
		}
		subjectInstance.save flush:true,failOnError:true

		flash.message = message(code: 'default.created.message', args: [
			message(code: 'subject.label', default: 'Subject'),
			subjectInstance.subjectName
		])
		redirect(action:'index')
	}

	def edit(Subject subjectInstance) {
		def inst = userService.getCurrentInstituite()
		respond subjectInstance,model:[iclass:IClass.findAllByInstituite(inst),instituite:inst]
	}

	@Transactional
	def update(Subject subjectInstance) {
		if (subjectInstance == null) {
			notFound()
			return
		}

		if (subjectInstance.hasErrors()) {
			respond subjectInstance.errors, view:'edit'
			return
		}

		subjectInstance.save flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.updated.message', args: [
					message(code: 'Subject.label', default: 'Subject'),
					subjectInstance.subjectName
				])
				redirect subjectInstance
			}
			'*'{ respond subjectInstance, [status: OK] }
		}
	}

	@Transactional
	def delete(Subject subjectInstance) {

		if (subjectInstance == null) {
			notFound()
			return
		}

		subjectInstance.delete flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.deleted.message', args: [
					message(code: 'Subject.label', default: 'Subject'),
					subjectInstance.subjectName
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
					message(code: 'subject.label', default: 'Subject'),
					params.id
				])
				redirect action: "index", method: "GET"
			}
			'*'{ render status: NOT_FOUND }
		}
	}
}
