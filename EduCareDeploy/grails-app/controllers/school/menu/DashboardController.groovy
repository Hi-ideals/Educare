package school.menu
import grails.plugin.springsecurity.annotation.Secured

import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.feemanagment.InstFeeTypes
import com.hiideals.instituite.student.Student

@Secured(["ROLE_ADMIN","ROLE_USERR"])
class DashboardController {

	def userService
	def batchService
	def springSecurityService

	def index() {
		

		def pendings = [:]
		def pendingsdisplay = [:]
		int StudentListSize = 0;

		def ins = userService.getCurrentInstituite()

		if(!ins){
			pendings.put("instituite", true)
			pendingsdisplay.put("instituite", "Institute")
		}
		else{
			def iclass = IClass.findAllByInstituite(ins)
			def instfee = InstFeeTypes.findAllByInstituite(ins)
			def student = Student.findAllByInstituite(ins)
			StudentListSize = student?.size()

			if(iclass?.size() <=0){
				pendings.put("IClass", true)
				pendingsdisplay.put("IClass", "Classes")
			}

			if(instfee?.size() <=0){
				pendings.put("instFeeTypes", true)
				pendingsdisplay.put("instFeeTypes", "Instituite Fee Structure")
			}

			if(student?.size() <=0){
				pendings.put("student", true)
				pendingsdisplay.put("student", "Student")
			}
		}

		def chart = [:]

		if(ins){
			def instsStudents = Student.findAllByInstituite(ins,[sort:'studentDOJ',order:'asc'])


			for(Student student in instsStudents){
				Date ss = student.studentDOJ

				if(chart.keySet().contains((ss.getYear()+1900))){
					chart.put((ss.getYear()+1900), chart.get((ss.getYear()+1900))+1)
				}else{
					chart.put((ss.getYear()+1900), 1)
				}
			}
		}
		def staffList = batchService.getListofStaff()
		def batches=batchService.getcountofBatches()
		def colors = ["blue", "green", "yellow" , "purple" , "red"]
		[staffList:staffList[0],chart:chart,pendings:pendings,StudentListSize:StudentListSize,colors:colors,pendingsdisplay:pendingsdisplay,inst:userService.getCurrentInstituite(),batches:batches[0]]
	}
}

