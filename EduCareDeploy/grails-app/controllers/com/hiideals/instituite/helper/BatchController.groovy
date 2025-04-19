package com.hiideals.instituite.helper



import static org.springframework.http.HttpStatus.*

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import grails.transaction.Transactional
import grails.plugin.springsecurity.annotation.Secured;
@Secured(["ROLE_ADMIN","ROLE_USERR"])
@Transactional(readOnly = true)
class BatchController {

	def userService
	def batchService
	private static DateFormat df = new SimpleDateFormat("dd/MM/yyyy");//yyyy-MM-dd");
	
	static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

	def index(Integer max) {
		params.max = Math.min(max ?: 100, 100)
		def batchList = batchService.getListofBatches(params)
		respond batchList, model:[batchInstanceCount: batchList.totalCount]
	}

	def show(Batch batchInstance) {
		respond batchInstance
	}

	def create() {
		respond new Batch(params),model:[instituite:userService.getCurrentInstituite()]
	}

	@Transactional
	def save(Batch batchInstance) {

	def exist=Batch.findByBatchNameAndInstitute(params.batchName,userService.getCurrentInstituite())
		 if(exist){
			flash.message="Academic Year already Exist" 
			redirect(action:'create')
		 }else{
		batchInstance.setInstitute(userService.getCurrentInstituite())
		
		batchInstance.batchfrom  = df.parse(params.batchfrom1)
		batchInstance.batchto  = df.parse(params.batchto1)

		if (batchInstance == null) {
			notFound()
			return
		}

		if (batchInstance.hasErrors()) {
			(batchInstance.errors.allErrors).each {
				if(it.field.equals("institute")){
					batchInstance.clearErrors()
				}
				else{
					respond batchInstance.errors, view:'create'
					return
				}
			}
		}

		batchInstance.save flush:true
		flash.message = message(code: 'default.created.message', args: [
			message(code: 'Batch.label', default: 'Batch'),
			batchInstance.batchName
		])
		redirect(action:'index')
	   }
	}

	def edit(Batch batchInstance) {
		respond batchInstance
	}

	@Transactional
	def update(Batch batchInstance) {
		try{
		batchInstance.batchfrom  = df.parse(params.batchfrom1)}catch(Exception e){}
		try{batchInstance.batchto  = df.parse(params.batchto1)}catch(Exception e){}
		if (batchInstance == null) {
			notFound()
			return
		}

		if (batchInstance.hasErrors()) {
			respond batchInstance.errors, view:'edit'
			return
		}

		batchInstance.save flush:true
		flash.message = message(code: 'default.updated.message', args: [
			message(code: 'Batch.label', default: 'Batch'),
			batchInstance.batchName
		])
		redirect(action:'index')
	}

	@Transactional
	def delete(Batch batchInstance) {

		if (batchInstance == null) {
			notFound()
			return
		}

		batchInstance.delete flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.deleted.message', args: [
					message(code: 'Batch.label', default: 'Batch'),
					batchInstance.batchName
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
					message(code: 'batch.label', default: 'Batch'),
					params.id
				])
				redirect action: "index", method: "GET"
			}
			'*'{ render status: NOT_FOUND }
		}
	}
}
