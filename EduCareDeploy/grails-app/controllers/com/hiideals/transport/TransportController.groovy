package com.hiideals.transport



import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional

import java.text.DateFormat
import java.text.SimpleDateFormat

import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.classcourses.Section
import com.hiideals.instituite.student.Student

@Transactional(readOnly = true)
@Secured(["ROLE_ADMIN","ROLE_USERR"])
class TransportController {
	
	def userService;
	private static DateFormat df = new SimpleDateFormat("MM/dd/yyyy");//yyyy-MM-dd");
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 100, 100)
        respond Transport.findAllByInstitute(userService.getCurrentInstituite(),params), model:[transportInstanceCount: Transport.count()]
    }

    def show(Transport transportInstance) {
        respond transportInstance
    }

    def create() {
		def classes=userService.getAllClasses();
		def rut=RouteDetails.findAllByInstitute(userService.getCurrentInstituite())
		def dst=DestinationDetails.findAllByInstitute(userService.getCurrentInstituite())
        respond new Transport(params),model:[classes:classes,rut:rut,dst:dst]
    }

    @Transactional
    def save(Transport transportInstance) {
		transportInstance.startDate=df.parse(params.startDate1)
		transportInstance.endDate=df.parse(params.endDate1)
        def stu=Student.findById(params.student.id)
		def rut=RouteDetails.findById(params.route.id)
		def des=DestinationDetails.findById(params.destination.id)
		def trap=Transport.findByStudentAndRouteAndDestination(stu,rut,des)
		def message;
		if(trap){
			flash.message="Already Exists"
			redirect(action:'create')
			return;
		}else{
			transportInstance.save flush:true
			flash.message="Sucessfully Added"
			redirect(action:'index')
			return;
		}
    }

    def edit(Transport transportInstance) {
		def routes=RouteDetails.findAllByInstitute(userService.getCurrentInstituite())
		def destinations=DestinationDetails.findAllByInstitute(userService.getCurrentInstituite())
      def classes=IClass.findAllByInstituite(userService.getCurrentInstituite())
        respond transportInstance,model:[rut:routes,dst:destinations,classes:classes]
    }

    @Transactional
    def update(Transport transportInstance) {
	transportInstance.startDate=df.parse(params.startDate1)
		transportInstance.endDate=df.parse(params.endDate1)
        if (transportInstance == null) {
            notFound()
            return
        }

        if (transportInstance.hasErrors()) {
            respond transportInstance.errors, view:'edit'
            return
        }

        transportInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Transport.label', default: 'Transport'), transportInstance.id])
                redirect transportInstance
            }
            '*'{ respond transportInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Transport transportInstance) {

        if (transportInstance == null) {
            notFound()
            return
        }

        transportInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Transport.label', default: 'Transport'), transportInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'transport.label', default: 'Transport'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
	
	def getSections(){
		
		def sections=IClass.findById(params.int('value')).sections
		println "sections "+sections
		render template:'sections',model:[sections:sections]
	}
	
	def getStudents(){
		
		def students=Student.createCriteria().list{
			academicyear{
				eq('status','current')
				eq('presentclass',IClass.findById(params.int('cls')))
				eq('section',Section.findById(params.int('sec')))
			}
		}
		render template:'students',model:[students:students]
	}
}
