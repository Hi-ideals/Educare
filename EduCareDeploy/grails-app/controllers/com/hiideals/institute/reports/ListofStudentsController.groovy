package com.hiideals.institute.reports
import com.hiideals.instituite.classcourses.IClass
import grails.plugin.springsecurity.annotation.Secured

import com.hiideals.instituite.feemanagment.Fee
import com.hiideals.instituite.feemanagment.InstFeeTypes
import com.hiideals.instituite.student.Student;
import com.hiideals.instituite.helper.AcademicYear;

@Secured(["ROLE_ADMIN","ROLE_USERR"])
class ListofStudentsController {
	
	def userService
	def studentService
	def batchService
	
    def index() {
		def batchList = batchService.getListofBatches()
		println("batchList....:"+batchList)
		def studentList = null
		if(params.iclass && params.gender){
			if(params.iclass == "all" && params.gender == "all"){
				def instituite = userService.getCurrentInstituite()
				 studentList = Student.findAll()
				[batchList:batchList,studentInstanceList:studentList,studentInstanceCount: studentList.size(),instituite:instituite]
			}else if(params.iclass != "all"){
				 studentList=Student.createCriteria().list(){
					academicyear{
						presentclass{'in' 'id',IClass.findById(params.iclass)?.id}
	
					}
					if(params.gender!='all')
						eq('gender',params.gender)
	
				}
				def instituite = userService.getCurrentInstituite()
				
				[batchList:batchList,studentInstanceList:studentList,studentInstanceCount: studentList.size(),instituite:instituite]
			}
			
		}else{
		
	def instituite = userService.getCurrentInstituite()
	 studentList = studentService.getAllStudents(params)
	
	[batchList:batchList,instituite:instituite,studentInstanceList:studentList]
		}
		def categories=studentList.category.toSet()
		println("categories........."+categories)
		[batchList:batchList,studentInstanceList:studentList,categories:categories]
		
	}
	
	def getstudentlist(){
		def instituite = userService.getCurrentInstituite()
		def studentList = studentService.getAllStudents(params)
		[studentInstanceList:studentList,instituite:instituite]
	}
	
	def getstlist(){
		
		if(params.to.isEmpty()!=true){
			params.remove('iclass')
			params.remove('gender')
			def instituite = userService.getCurrentInstituite()
			def studentList = studentService.getAllStudents(params)
			[instituite:instituite,studentInstanceList:studentList]
		}else if(params.iclass.isEmpty()!=true){
		params.remove('to')
		params.remove('from')
		params.remove('orderd')
		
		if(params.iclass == "all" && params.gender == "all"){
			def instituite = userService.getCurrentInstituite()
			def studentList = Student.findAll()
			[studentInstanceList:studentList,studentInstanceCount: studentList.size(),instituite:instituite]
		}else if(params.iclass != "all"){
			def studentList=Student.createCriteria().list(){
				academicyear{
					presentclass{'in' 'id',IClass.findById(params.iclass)?.id}

				}
				if(params.gender!='all')
					eq('gender',params.gender)

			}
			def instituite = userService.getCurrentInstituite()
			[studentInstanceList:studentList,studentInstanceCount: studentList.size(),instituite:instituite]
		}
		
		}else{
		def instituite = userService.getCurrentInstituite()
		def studentList = studentService.getAllStudents(params)
		[instituite:instituite,studentInstanceList:studentList]
		}
		
	}
	
	
	
	def aa={
		println("student list........... :"+params)
		def student = (studentService.searchStudent(params))[0]

		def feeInstance = Fee.findByStudentId(student)
		try{
			def Instfeetypes = InstFeeTypes.findAllByInstituite(student.instituite)

			if(feeInstance == null)
				render(template:'stdisplay',model:[feeInstance:new Fee(params),Instfeetypes:Instfeetypes,student:student])
			else
				render(template:'stisplay',model:[feeInstance:feeInstance,Instfeetypes:Instfeetypes,student:student])
		}catch(Exception e){
			render "No Results Found"
			return
		}
	}
	
	def getByClass(){
		
		
		def instituite = userService.getCurrentInstituite()
		def studentList = null
		if(params.iclass.equals('all') && params.academicyear.equals('all')){
		studentList = studentService.getAllStudents(params)
		[studentInstanceList:studentList,studentInstanceCount: studentList.size(),instituite:instituite,academicYearList:AcademicYear.findAll()]
		}
		else if(params.academicyear != "all" && params.iclass !="all"){
				studentList=Student.createCriteria().list(){
					eq ('instituite.id', instituite?.id)
						academicyear{
							eq ('academicyear', params.academicyear)
							presentclass{'in' 'id',IClass.findById(params.iclass)?.id}
							}
							eq ('transfer',false)	
					}
				[studentInstanceList:studentList,studentInstanceCount: studentList.size(),instituite:instituite,academicYearList:AcademicYear.findAll()]
			}else if(params.iclass != "all"){
				studentList=Student.createCriteria().list(){
					academicyear{
						presentclass{'in' 'id',IClass.findById(params.iclass)?.id}
	
					}
					eq ('transfer',false)
				
	
				}
				[studentInstanceList:studentList,studentInstanceCount: studentList.size(),instituite:instituite,academicYearList:AcademicYear.findAll()]
			}else if(params.academicyear != "all"){
				studentList=Student.createCriteria().list(){
					eq ('instituite.id', instituite?.id)
						academicyear{
							eq ('academicyear', params.academicyear)
						}
						eq ('transfer',false)
								
					}
				[studentInstanceList:studentList,studentInstanceCount: studentList.size(),instituite:instituite,academicYearList:AcademicYear.findAll()]
			}
		
	}
	
	def getBycast(){
		
		def instituite = userService.getCurrentInstituite()
		def studentList = null
		if(params.iclass=="all" && params.academicyear=="all" && params.catone =="all"){
		studentList = studentService.getAllStudents(params)
		[studentInstanceList:studentList,studentInstanceCount: studentList.size(),instituite:instituite,academicYearList:AcademicYear.findAll()]
		}else if(params.iclass=="all" && params.academicyear=="all" && params.catone !="all"){
		studentList=Student.createCriteria().list(){
			eq ('instituite.id', instituite?.id)
			eq ('category', params.catone)
			eq ('transfer',false)
			}
		[studentInstanceList:studentList,studentInstanceCount: studentList.size(),instituite:instituite,academicYearList:AcademicYear.findAll()]
		}else if(params.iclass=="all" && params.academicyear!="all" && params.catone !="all"){
		studentList=Student.createCriteria().list(){
			eq ('instituite.id', instituite?.id)
			eq ('transfer',false)
			eq ('category', params.catone)
			academicyear{
					eq ('academicyear', params.academicyear)
					//presentclass{'in' 'id',IClass.findById(params.iclass)?.id}
					}
						
			}
		[studentInstanceList:studentList,studentInstanceCount: studentList.size(),instituite:instituite,academicYearList:AcademicYear.findAll()]
		}else if(params.academicyear != "all" && params.iclass !="all" && params.catone !="all"){
				studentList=Student.createCriteria().list(){
					eq ('instituite.id', instituite?.id)
					eq ('transfer',false)
					eq ('category', params.catone)
						academicyear{
							eq ('academicyear', params.academicyear)
							presentclass{'in' 'id',IClass.findById(params.iclass)?.id}
							}
								
					}
				[studentInstanceList:studentList,studentInstanceCount: studentList.size(),instituite:instituite,academicYearList:AcademicYear.findAll()]
		}else if(params.iclass !="all" &&  params.academicyear == "all" && params.catone !="all"){
		println("notall , all , notall")
		studentList=Student.createCriteria().list(){
			eq ('instituite.id', instituite?.id)
			eq ('transfer',false)
			eq ('category', params.catone)
				academicyear{
							//eq ('academicyear', params.academicyear)
							presentclass{'in' 'id',IClass.findById(params.iclass)?.id}
							}
						
			}
		[studentInstanceList:studentList,studentInstanceCount: studentList.size(),instituite:instituite,academicYearList:AcademicYear.findAll()]
		}
		
		
	}
	def getBygender(){
		println("list of students sort by gender.....:"+params)
		
		
		def instituite = userService.getCurrentInstituite()
		def studentList = null
		if(params.iclass=="all" && params.academicyear=="all" && params.genderone =="all"){
		studentList = studentService.getAllStudents(params)
		[studentInstanceList:studentList,studentInstanceCount: studentList.size(),instituite:instituite,academicYearList:AcademicYear.findAll()]
		}else if(params.iclass=="all" && params.academicyear=="all" && params.genderone !="all"){
		studentList=Student.createCriteria().list(){
			eq ('instituite.id', instituite?.id)
			eq ('transfer',false)
			eq ('gender', params.genderone)
			}
		[studentInstanceList:studentList,studentInstanceCount: studentList.size(),instituite:instituite,academicYearList:AcademicYear.findAll()]
		}else if(params.iclass=="all" && params.academicyear!="all" && params.genderone !="all"){
		studentList=Student.createCriteria().list(){
			eq ('instituite.id', instituite?.id)
			eq ('transfer',false)
			eq ('gender', params.genderone)
				academicyear{
					eq ('academicyear', params.academicyear)
					//presentclass{'in' 'id',IClass.findById(params.iclass)?.id}
					}
						
			}
		[studentInstanceList:studentList,studentInstanceCount: studentList.size(),instituite:instituite,academicYearList:AcademicYear.findAll()]
		}else if(params.iclass !="all" && params.academicyear != "all" &&  params.genderone !="all"){
				studentList=Student.createCriteria().list(){
					eq ('instituite.id', instituite?.id)
					eq ('transfer',false)
					eq ('gender', params.genderone)
						academicyear{
							eq ('academicyear', params.academicyear)
							presentclass{'in' 'id',IClass.findById(params.iclass)?.id}
							}
								
					}
				[studentInstanceList:studentList,studentInstanceCount: studentList.size(),instituite:instituite,academicYearList:AcademicYear.findAll()]
			}else if(params.iclass !="all" && params.academicyear != "all" &&  params.genderone =="all"){
			studentList=Student.createCriteria().list(){
				eq ('instituite.id', instituite?.id)
					academicyear{
						eq ('academicyear', params.academicyear)
						presentclass{'in' 'id',IClass.findById(params.iclass)?.id}
						}
					eq ('transfer',false)
				}
			[studentInstanceList:studentList,studentInstanceCount: studentList.size(),instituite:instituite,academicYearList:AcademicYear.findAll()]
			}else if(params.iclass !="all" && params.academicyear == "all" &&  params.genderone =="all"){
			studentList=Student.createCriteria().list(){
				academicyear{
					presentclass{'in' 'id',IClass.findById(params.iclass)?.id}

				}
				eq ('transfer',false)
			

			}
			[studentInstanceList:studentList,studentInstanceCount: studentList.size(),instituite:instituite,academicYearList:AcademicYear.findAll()]
			}
		
		
		
	}
}
