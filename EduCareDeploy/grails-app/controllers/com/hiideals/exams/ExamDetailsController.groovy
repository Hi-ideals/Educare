package com.hiideals.exams



import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional

import java.text.DateFormat
import java.text.SimpleDateFormat

import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.classcourses.Subject
import com.hiideals.instituite.helper.Batch

@Secured(["ROLE_ADMIN","ROLE_USERR"])
@Transactional(readOnly = false)
class ExamDetailsController {
	def batchService
	def userService
	//static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
	private static DateFormat df = new SimpleDateFormat("MM/dd/yyyy");//yyyy-MM-dd");

	def index(Integer max) {
		params.max = Math.min(max ?: 100, 100)
		respond ExamDetails.findAllByInstitute(userService.getCurrentInstituite(),params), model:[examDetailsInstanceCount: ExamDetails.count()]
	}

	def show(ExamDetails examDetailsInstance) {
		respond examDetailsInstance
	}

	def create() {
		def batchList = batchService.getListofBatches(params)
		def exams = Exam.findAllByInstitute(userService.getCurrentInstituite())
		respond new ExamDetails(params),model:[instituite:userService.getCurrentInstituite(),batchList:batchList,exams:exams]
	}

	@Transactional
	def save() {
		def examDate=[params.examDate].flatten().findAll{ it != null }
		def passMarks=[params.passMarks].flatten().findAll{ it != null }
		def examDuration=[params.examDuration].flatten().findAll{ it != null }
		def totalMarks=[params.totalMarks].flatten().findAll{ it != null }
		def subjects=[params.subject].flatten().findAll{ it != null }
		def year=Batch.findById(params.year.id)
		def cls=IClass.findById(params.iclass.id)
		def exam=Exam.findById(params.exam.id)
		params.clear()
		for(int i=0;i<subjects.size();i++){
			params.passMarks=passMarks[i]
			params.passMarks=passMarks[i]
			params.examDuration=examDuration[i]
			params.totalMarks=totalMarks[i]
			ExamDetails examDetailsInstance=new ExamDetails(params)
			examDetailsInstance.examDate=df.parse(examDate[i])
			examDetailsInstance.year=year
			examDetailsInstance.iclass=cls
			examDetailsInstance.subject=Subject.findById(subjects[i])
			examDetailsInstance.exam=exam
			examDetailsInstance.institute = userService.getCurrentInstituite()
			exam.addToExamDetails(examDetailsInstance.save(flush:true,failOnError:true))
			exam.save(flush:true,failOnError:true)
			
		}
        redirect(action:'create')



		/* if (examDetailsInstance == null) {
		 notFound()
		 return
		 }
		 if (examDetailsInstance.hasErrors()) {
		 respond examDetailsInstance.errors, view:'create'
		 return
		 }
		 examDetailsInstance.save flush:true
		 request.withFormat {
		 form multipartForm {
		 flash.message = message(code: 'default.created.message', args: [message(code: 'examDetails.label', default: 'ExamDetails'), examDetailsInstance.id])
		 redirect examDetailsInstance
		 }
		 '*' { respond examDetailsInstance, [status: CREATED] }
		 }*/
	}

	def edit(ExamDetails examDetailsInstance) {
			def batchList = batchService.getListofBatches(params)
		def exams = Exam.findAllByInstitute(userService.getCurrentInstituite())
		respond examDetailsInstance,model:[instituite:userService.getCurrentInstituite(),batchList:batchList,exams:exams]
	}

	@Transactional
	def update(ExamDetails examDetailsInstance) {
		if (examDetailsInstance == null) {
			notFound()
			return
		}

		if (examDetailsInstance.hasErrors()) {
			respond examDetailsInstance.errors, view:'edit'
			return
		}

		examDetailsInstance.save flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.updated.message', args: [message(code: 'ExamDetails.label', default: 'ExamDetails'), examDetailsInstance.id])
				redirect examDetailsInstance
			}
			'*'{ respond examDetailsInstance, [status: OK] }
		}
	}

	@Transactional
	def delete(ExamDetails examDetailsInstance) {

		if (examDetailsInstance == null) {
			notFound()
			return
		}

		examDetailsInstance.delete flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.deleted.message', args: [message(code: 'ExamDetails.label', default: 'ExamDetails'), examDetailsInstance.id])
				redirect action:"index", method:"GET"
			}
			'*'{ render status: NO_CONTENT }
		}
	}

	protected void notFound() {
		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.not.found.message', args: [message(code: 'examDetails.label', default: 'ExamDetails'), params.id])
				redirect action: "index", method: "GET"
			}
			'*'{ render status: NOT_FOUND }
		}
	}

	def getSubjects(){

		println "FFFF "+params
		def cls=IClass.findById(params.value)
		println "ad "+cls
		def subjects=Subject.createCriteria().list{
			iclass{
				eq('id',IClass.findById(params.value).id)
			}
			eq('institute',userService.getCurrentInstituite())
		}
		if(subjects.isEmpty())
		{
			flash.msg="asdada"
		}
		render(template:'classSubjects',model:[subjects:subjects])
	}
}
