package com.hiideals.exams



import static org.springframework.http.HttpStatus.*

import java.util.Date;

import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional

import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.classcourses.Subject;
import com.hiideals.instituite.helper.Batch
import com.hiideals.instituite.student.Student

@Secured(["ROLE_ADMIN","ROLE_USERR"])
@Transactional(readOnly = true)
class MarksController {

	static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
	def batchService
	def userService
	def index(Integer max) {
		params.max = Math.min(max ?: 100, 100)
		respond Marks.findAllByInstitute(userService.getCurrentInstituite(),params), model:[marksInstanceCount: Marks.count()]
	}

	def show(Marks marksInstance) {
		respond marksInstance
	}

	def create() {
		def batchList = batchService.getListofBatches(params)
		respond new Marks(params),model:[instituite:userService.getCurrentInstituite(),batchList:batchList]
	}

	@Transactional
	def save() {
		def examdetails=[params.examdetails].flatten().findAll{ it != null }
		def obtainedMarks=[params.obtainedMarks].flatten().findAll{ it != null }
		def student=Student.findById(params.student.id)

		for(int i=0;i<examdetails.size();i++){

			Marks marksInstance=new Marks(params);
			marksInstance.student=student
			marksInstance.obtainedMarks=obtainedMarks[i].toInteger()
			marksInstance.examDetails=ExamDetails.findById(examdetails[i])
			marksInstance.institute = userService.getCurrentInstituite()
			marksInstance.save(flush:true,failOnError:true)
		}


		redirect(action:'create')
	}

	def edit(Marks marksInstance) {
		def batchList = batchService.getListofBatches(params)
		respond marksInstance,model:[instituite:userService.getCurrentInstituite(),batchList:batchList]
	}

	@Transactional
	def update(Marks marksInstance) {
		if (marksInstance == null) {
			notFound()
			return
		}

		if (marksInstance.hasErrors()) {
			respond marksInstance.errors, view:'edit'
			return
		}

		marksInstance.save flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.updated.message', args: [message(code: 'Marks.label', default: 'Marks'), marksInstance.id])
				redirect marksInstance
			}
			'*'{ respond marksInstance, [status: OK] }
		}
	}

	@Transactional
	def delete(Marks marksInstance) {

		if (marksInstance == null) {
			notFound()
			return
		}

		marksInstance.delete flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.deleted.message', args: [message(code: 'Marks.label', default: 'Marks'), marksInstance.id])
				redirect action:"index", method:"GET"
			}
			'*'{ render status: NO_CONTENT }
		}
	}

	protected void notFound() {
		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.not.found.message', args: [message(code: 'marks.label', default: 'Marks'), params.id])
				redirect action: "index", method: "GET"
			}
			'*'{ render status: NOT_FOUND }
		}
	}

	def getExamDetails(){

		println "getExamDetails "+params
		def exams=ExamDetails.createCriteria().list(){
			eq('iclass',IClass.findById(params.iclass))
			eq('year',Batch.findById(params.yearId))
			eq('exam',Exam.findById(params.examId))
		}
		if(exams.isEmpty()){
			flash.msg="dsasda"
		}
		render(template:'marksList',model:[exams:exams])
	}


	def getStudents(){
		
		def students=Student.createCriteria().list(){
			eq('instituite',userService.getCurrentInstituite())
			academicyear{
				eq('presentclass',IClass.findById(params.iclass))
			}
		}

		//to compare student marks entered or not before
		def studentsFromMarks=Marks.createCriteria().list {

			examDetails{
				eq('iclass',IClass.findById(params.iclass))
				eq('year',Batch.findById(params.yearId))
				eq('exam',Exam.findById(params.examId))
			}
		}

		def aa=[];
		students.each{
			if(studentsFromMarks.student.contains(it)){
				aa.addAll(it)
			}
		}
		students.removeAll(aa)

		render(template:'students',model:[students:students])
	}
	
	def studentReports(){
		def instituite=userService.getCurrentInstituite();
		def batchList = batchService.getListofBatches(params)
		[instituite:instituite,batchList:batchList]
	}
	
	def results(){
		println "@@@@@@@ "+params
		def instituite=userService.getCurrentInstituite();
	}

	def getExamTT(){

		def instituite=userService.getCurrentInstituite();
		def exams = Exam.findById(params.exam.id)
		def classes = IClass.findById(params.iclass.id)
		def years = Batch.findById(params.year.id)
		def examDetails = ExamDetails.findAllByExamAndIclassAndYear(exams,classes,years)

		render(template:'examTT',model:[examDetails:examDetails,instituite:instituite,exams:exams,params:params])

	}

	def getExamTTPrint(){

		def instituite=userService.getCurrentInstituite();
		def exams = Exam.findById(params.exam)
		def classes = IClass.findById(params.iclass)
		def years = Batch.findById(params.year)
		def examDetails = ExamDetails.findAllByExamAndIclassAndYear(exams,classes,years)

		[examDetails:examDetails,instituite:instituite,exams:exams,params:params]
	}

	def getreportCard(){
		def iclassName = IClass.findById(params.iclass.id)
		Student stDetail = Student.findById(params.student.id)
		def instituite=userService.getCurrentInstituite();
		def exams=Marks.createCriteria().list {

			examDetails{
				eq('iclass',iclassName)
				eq('year',Batch.findById(params.year.id))
				eq('exam',Exam.findById(params.exam.id))
			}
			eq('student',stDetail)

		}

		def academicyr = stDetail.academicyear.find{ it.presentclass==iclassName }
		render(template:'reportCard',model:[exams:exams,academicyr:academicyr,params:params])
	}
	def getreportCardPrint(){
		def iclassName = IClass.findById(params.iclass)
		Student stDetail = Student.findById(params.student)
		def instituite=userService.getCurrentInstituite();
		def exams=Marks.createCriteria().list {

			examDetails{
				eq('iclass',iclassName)
				eq('year',Batch.findById(params.year))
				eq('exam',Exam.findById(params.exam))
			}
			eq('student',stDetail)

		}

		def academicyr = stDetail.academicyear.find{ it.presentclass==iclassName }
		[exams:exams,academicyr:academicyr,instituite:instituite]
		
	}
}
