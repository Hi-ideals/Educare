package com.hiideals.institute.payroll



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import grails.plugin.springsecurity.annotation.Secured

@Secured(["ROLE_ADMIN","ROLE_USERR"])
@Transactional(readOnly = true)
class SalarySettingController {
def staffService
	def userService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 100, 100)
        respond SalarySetting.findAllByInstitute(userService.getCurrentInstituite(),params), model:[salarySettingInstanceCount: SalarySetting.count()]
    }

    def show(SalarySetting salarySettingInstance) {
        respond salarySettingInstance
    }

    def create() {
        respond new SalarySetting(params),model:[staffs:staffService.getAllStaffs(params), payheadlist:PayHead.findAllByInstitute(userService.getCurrentInstituite())]
    }

    @Transactional
    def save(SalarySetting salarySettingInstance) {
        if (salarySettingInstance == null) {
            notFound()
            return
        }

        if (salarySettingInstance.hasErrors()) {
            respond salarySettingInstance.errors, view:'create'
            return
        }

        salarySettingInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'salarySetting.label', default: 'SalarySetting'), salarySettingInstance.id])
                redirect salarySettingInstance
            }
            '*' { respond salarySettingInstance, [status: CREATED] }
        }
    }

    def edit(SalarySetting salarySettingInstance) {
        respond new SalarySetting(params),model:[staffs:staffService.getAllStaffs(params), payheadlist:PayHead.findAllByInstitute(userService.getCurrentInstituite())]
    }

    @Transactional
    def update(SalarySetting salarySettingInstance) {
        if (salarySettingInstance == null) {
            notFound()
            return
        }

        if (salarySettingInstance.hasErrors()) {
            respond salarySettingInstance.errors, view:'edit'
            return
        }

        salarySettingInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'SalarySetting.label', default: 'SalarySetting'), salarySettingInstance.id])
                redirect salarySettingInstance
            }
            '*'{ respond salarySettingInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(SalarySetting salarySettingInstance) {

        if (salarySettingInstance == null) {
            notFound()
            return
        }

        salarySettingInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'SalarySetting.label', default: 'SalarySetting'), salarySettingInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'salarySetting.label', default: 'SalarySetting'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
