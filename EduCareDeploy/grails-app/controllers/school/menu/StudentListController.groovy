package school.menu

import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional

import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.feemanagment.Fee
import com.hiideals.instituite.feemanagment.InstFeeTypes
import com.hiideals.instituite.helper.AcademicYear;
import com.hiideals.instituite.student.Student

/**
 * @author Uddha Umesh
 * @createdOn 23-Nov-2016
 *
 */
@Secured(["ROLE_ADMIN","ROLE_USERR"])
@Transactional
class StudentListController {
	def userService
	def studentService
	def batchService

	def index(Integer max) {
		params.max = Math.min(max ?: 100, 100)
		params.sort = "studentDOJ"
		params.order = (params.orderd) ?:"desc"
		
		
		def instituite = userService.getCurrentInstituite()
		def studentList = null
		def ss=AcademicYear.findAll()
		def year=ss.academicyear.toSet()
		def batchList = batchService.getListofBatches()
		if(params.castName != null ){
			studentList = (studentService.searchStudentcast(params))
			[studentInstanceList:studentList,instituite:instituite,academicYearList:batchList,batchList:batchList]
			}else{
			studentList = studentService.getAllStudents(params)
			[batchList:batchList,studentInstanceList:studentList,studentInstanceCount: studentList.getTotalCount(),instituite:instituite,academicYearList:batchList]
			//
			}
	//	def instituite = userService.getCurrentInstituite()
		//studentInstanceCount: studentList.getTotalCount(),
		//[studentInstanceList:studentList,studentInstanceCount: studentList.getTotalCount(),instituite:instituite]
	}

	def aa={
		params.max= params.max ?: 1000
		if(params.academicyear!=null && params.registrationNo=='' && params.studentName==''){
			def instituite = userService.getCurrentInstituite()
			def studentList
			studentList=Student.createCriteria().list(params){
				eq ('instituite.id', instituite?.id)
					academicyear{
						eq ('academicyear', params?.academicyear)
					}
					eq ('transfer', false)
							
				}
			render(template:'allListbyYear',model:[studentInstanceList:studentList,studentInstanceCount: studentList.totalCount,instituite:instituite,academicYearList:AcademicYear.findAll()])
			
		}else{	
		def student = (studentService.searchStudent(params))[0]
		
				def feeInstance = Fee.findByStudentId(student)
				try{
					def Instfeetypes = InstFeeTypes.findAllByInstituite(student.instituite)
		
					if(feeInstance == null)
						render(template:'feeDisplay',model:[feeInstance:new Fee(params),Instfeetypes:Instfeetypes,student:student])
					else
						render(template:'feeDisplay',model:[feeInstance:feeInstance,Instfeetypes:Instfeetypes,student:student])
				}catch(Exception e){
					render "No Results Found"
					return
				}
		}
		
	}
	
	def getByClass(){
		
		println("params.Iclass....:"+params.iclass)
		params.max= params.max ?: 1000
		def studentList = null
		if(params.iclass == "all" && params.gender == "all"){
			studentList = Student.createCriteria().list(params){
				
				eq ('transfer', false)
			}
		}else if(params.iclass == "all" && params.gender != "all"){
		def instituite = userService.getCurrentInstituite()
		studentList=Student.createCriteria().list(params){
			eq ('instituite.id', instituite?.id)
			eq ('transfer', false)
			eq('gender',params.gender)
		
			}
		}else if(params.iclass != "all"){
			studentList=Student.createCriteria().list(params){
				academicyear{
					presentclass{'in' 'id',IClass.findById(params.iclass)?.id}

				}
				eq ('transfer', false)
				if(params.gender!='all')
					eq('gender',params.gender)

			}
		}
		def instituite = userService.getCurrentInstituite()
		def clsname = IClass.findById(params.iclass)
		println("clasnname..:"+clsname.classname)
		render(template:'studentlistable',model:[studentInstanceList:studentList,studentInstanceCount: studentList.totalCount,instituite:instituite,clsname:clsname.classname])
	}
	
	def byYear(){
		
		println"@@@@"+params
		
		def clsname
		if(params.iclass!='all'){
		 clsname = IClass.findById(params.iclass).classname
		}
		params.max= params.max ?: 1000
		def instituite = userService.getCurrentInstituite()
		def studentList = null
		if(params.iclass.equals('all') && params.iyear.equals('all')){
		studentList = studentService.getAllStudents(params)
		render(template:'allListbyYear',model:[studentInstanceList:studentList,studentInstanceCount: studentList.totalCount,instituite:instituite,academicYearList:AcademicYear.findAll(),clsname:clsname])
		}else if(params.iyear != "all" && params.iclass !="all"){
			
				studentList=Student.createCriteria().list(params){
					eq ('instituite.id', instituite?.id)
						academicyear{
							eq ('academicyear', params.iyear)
							presentclass{'in' 'id',IClass.findById(params.iclass)?.id}
							}
						
						eq ('transfer', false)
					}
					render(template:'allListbyYear',model:[studentInstanceList:studentList,studentInstanceCount: studentList.totalCount,instituite:instituite,academicYearList:AcademicYear.findAll(),clsname:clsname])
			}else if(params.iclass != "all" && params.iyear){
				studentList=Student.createCriteria().list(params){
					academicyear{
						presentclass{'in' 'id',IClass.findById(params.iclass)?.id}
	
					}
					eq ('transfer', false)
	
				}
				render(template:'allListbyYear',model:[studentInstanceList:studentList,studentInstanceCount: studentList.totalCount,instituite:instituite,academicYearList:AcademicYear.findAll(),clsname:clsname])
			}else if(params.iyear != "all" && params.iclass){
				studentList=Student.createCriteria().list(params){
					eq ('instituite.id', instituite?.id)
						academicyear{
							eq ('academicyear', params.iyear)
						}
						eq ('transfer', false)
								
					}
					render(template:'allListbyYear',model:[studentInstanceList:studentList,studentInstanceCount: studentList.totalCount,instituite:instituite,academicYearList:AcademicYear.findAll(),clsname:clsname])
			}
	}
	
	def byStudentId(){
		
		println("byStudentId..   :"+params)
		
		params.max= params.max ?: 1000
		//def clsname = IClass.findById(params.iclass)
		def instituite = userService.getCurrentInstituite()
		def studentList=Student.createCriteria().list(params){
			eq ('instituite.id', instituite?.id)
			
			eq ('studentId',params.studentId)
			eq ('transfer', false)
			/*academicyear{
				eq ('academicyear', params.iyear)
			}*/
		}
		println("bystudentId..  :"+studentList)
		render(template:'listbystudentId',model:[studentInstanceList:studentList,studentInstanceCount: studentList.totalCount,instituite:instituite,academicYearList:AcademicYear.findAll()])
	}
}



