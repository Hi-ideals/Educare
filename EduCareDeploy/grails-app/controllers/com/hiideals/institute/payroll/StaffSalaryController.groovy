package com.hiideals.institute.payroll



import static org.springframework.http.HttpStatus.*

import java.lang.reflect.WeakCache.Value

import com.fasterxml.classmate.util.ResolvedTypeCache.Key
import com.hiideals.institute.staff.Staff

import grails.transaction.Transactional
import grails.plugin.springsecurity.annotation.Secured
import groovyx.gpars.pa.SumClosure

@Secured(["ROLE_ADMIN","ROLE_USERR"])
@Transactional(readOnly = false)
class StaffSalaryController {
def batchService
def userService
	static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

	def index(Integer max) {
		params.max = Math.min(max ?: 100, 100)
		respond StaffSalary.findAllByInstitute(userService.getCurrentInstituite(),params), model:[staffSalaryInstanceCount: StaffSalary.count()]
	}

	def show(StaffSalary staffSalaryInstance) {
		respond staffSalaryInstance
	}

	def create() {
		def batchList = batchService.getListofBatches(params)
		respond new StaffSalary(params),model:[batchList:batchList]
	}

	@Transactional
	def save(StaffSalary staffSalaryInstance) {
		
		//println"!!!!!"+params
		//println"@@@@@"+(params.payheadname1 instanceof String)
		
		
		
		if (staffSalaryInstance == null) {
			notFound()
			return
		}

		if (staffSalaryInstance.hasErrors()) {
			respond staffSalaryInstance.errors, view:'create'
			return
		}
		
		
		if(params.payheadname1 instanceof String){
			SalaryTrack salaryTracker = new SalaryTrack(payHead:params.payheadname1,
				aunit:params.aunits,payHeadType:params.payheadtype1)
			   staffSalaryInstance.addToSalaryTrack(salaryTracker.save(flush:true))
			
		}else{
			
			def payheadname=params.payheadname1 as List
			def payheadtype=params.payheadtype1 as List
			def amount=params.aunits as List
			
			payheadname.eachWithIndex  {it,Integer i->
				SalaryTrack salaryTracker = new SalaryTrack(payHead:it,
					aunit:amount[i],payHeadType:payheadtype[i])
				   staffSalaryInstance.addToSalaryTrack(salaryTracker.save(flush:true))	
			}
			
		}
		
		def staff=Staff.findById(params.staff.id)
		def saltypes = SalarySetting.findAllByStaff(staff)
		for(int i=0;i<saltypes.size();i++){
			SalaryTrack salaryTracker = new SalaryTrack(payHead:saltypes[i]?.payhead?.payHeadName,
		     aunit:saltypes[i]?.aunit,payHeadType:saltypes[i]?.payhead?.payHeadType)
			staffSalaryInstance.addToSalaryTrack(salaryTracker.save(flush:true))
		   }
		   
		   
		   
							   
			    
		staffSalaryInstance.totalPaid=Integer.parseInt(params.totalamount)
		staffSalaryInstance.save flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.created.message', args: [
					message(code: 'staffSalary.label', default: 'StaffSalary'),
					staffSalaryInstance.id
				])
				redirect staffSalaryInstance
			}
			'*' { respond staffSalaryInstance, [status: CREATED] }
		}
	}
	
	def edit(StaffSalary staffSalaryInstance) {
		def batchList = batchService.getListofBatches(params)
		respond staffSalaryInstance,model:[batchList:batchList]
	}
	
	

	@Transactional
	def update(StaffSalary staffSalaryInstance) {
		if (staffSalaryInstance == null) {
			notFound()
			return
		}

		if (staffSalaryInstance.hasErrors()) {
			respond staffSalaryInstance.errors, view:'edit'
			return
		}

		staffSalaryInstance.save flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.updated.message', args: [
					message(code: 'StaffSalary.label', default: 'StaffSalary'),
					staffSalaryInstance.id
				])
				redirect staffSalaryInstance
			}
			'*'{ respond staffSalaryInstance, [status: OK] }
		}
	}

	@Transactional
	def delete(StaffSalary staffSalaryInstance) {

		if (staffSalaryInstance == null) {
			notFound()
			return
		}

		staffSalaryInstance.delete flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.deleted.message', args: [
					message(code: 'StaffSalary.label', default: 'StaffSalary'),
					staffSalaryInstance.id
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
					message(code: 'staffSalary.label', default: 'StaffSalary'),
					params.id
				])
				redirect action: "index", method: "GET"
			}
			'*'{ render status: NOT_FOUND }
		}
	}

	def getpayhead(){
		def staff=Staff.findById(params.staffId)
		def staffid=SalarySetting.findAllByStaff(staff)
		def deductionmap=[:]
		def additionmap=[:]
		
		for (var in staffid) {	
			if(var.payhead?.payHeadType=="Addition"){
				additionmap.put(var, var.aunit)
			}else{
				deductionmap.put(var, var.aunit)
			}	
		}
		
		int deductionsum = 0;
		(deductionmap.values()).each {
			deductionsum=deductionsum+it
		}
		
		int additionsum = 0;
		(additionmap.values()).each {
			additionsum=additionsum+it
		}

		def total=additionsum-(deductionsum)
		render template:'staffpayhead',model:[staffpayhead:staffid,total:total]
	}
	
	def getstafflist(){
		
		def stfflist=Staff.findAllByStaffTypeAndInstitute(params.staff,userService.getCurrentInstituite())
		println"!!!!!!!!!!!!!"+stfflist
		render template:'staffList',model:[stfflist:stfflist]
		
		
	}
}
