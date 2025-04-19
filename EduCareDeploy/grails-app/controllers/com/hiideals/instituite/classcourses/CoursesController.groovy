package com.hiideals.instituite.classcourses



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import grails.plugin.springsecurity.annotation.Secured

@Secured(["ROLE_ADMIN","ROLE_USERR"])
@Transactional(readOnly = true)
class CoursesController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 100, 100)
        respond Courses.list(params), model:[coursesInstanceCount: Courses.count()]
    }

    def show(Courses coursesInstance) {
        respond coursesInstance
    }

    def create() {
        respond new Courses(params)
    }

    @Transactional
    def save(Courses coursesInstance) {
        if (coursesInstance == null) {
            notFound()
            return
        }

        if (coursesInstance.hasErrors()) {
            respond coursesInstance.errors, view:'create'
            return
        }

        coursesInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'courses.label', default: 'Courses'), coursesInstance.id])
                redirect coursesInstance
            }
            '*' { respond coursesInstance, [status: CREATED] }
        }
    }

    def edit(Courses coursesInstance) {
        respond coursesInstance
    }

    @Transactional
    def update(Courses coursesInstance) {
        if (coursesInstance == null) {
            notFound()
            return
        }

        if (coursesInstance.hasErrors()) {
            respond coursesInstance.errors, view:'edit'
            return
        }

        coursesInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Courses.label', default: 'Courses'), coursesInstance.id])
                redirect coursesInstance
            }
            '*'{ respond coursesInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Courses coursesInstance) {

        if (coursesInstance == null) {
            notFound()
            return
        }

        coursesInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Courses.label', default: 'Courses'), coursesInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'courses.label', default: 'Courses'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
