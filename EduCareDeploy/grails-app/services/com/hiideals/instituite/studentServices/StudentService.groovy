package com.hiideals.instituite.studentServices

import grails.transaction.Transactional

import java.text.DateFormat
import java.text.SimpleDateFormat

import com.hiideals.attendanceManagement.StudentAttendance
import com.hiideals.instituite.admin.Admin
import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.classcourses.Section
import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.student.Student
import com.hiideals.instituite.users.SecUser
import com.hiideals.instituite.feemanagment.FeeTracker;


/**
 * @author Uddha Umesh
 * @createdOn 23-Nov-2016
 *
 */
@Transactional
class StudentService {

	def userService
	
	/**
	 * Uddha Umesh
	 * @param params
	 * @return
	 */
	
	def getAllStudents(params){
		
		def instituite  = userService.getCurrentInstituite()
		/*return Student.createCriteria().list(params){
		 eq ('instituite.id', instituite?.id)
		 }*/

		def from = null
		def to = null
		if(params.from){

			DateFormat df = new SimpleDateFormat("MM/dd/yyyy");//yyyy-MM-dd");
			df.setLenient(false);

			from = new java.sql.Timestamp(df.parse(params.from).getTime())
			if(params.to){
				to = getSqlTime(df.parse(params.to))
			}else{
				to = getSqlTime((df.parse(params.from)+365))
			}
		}

		return  Student.createCriteria().list(params){
			eq ('transfer',false)	
			
			eq ('instituite.id', instituite?.id)
			if(params.from)
				between("studentDOJ",from,to )

			if(params.iclass && params.iclass != "all")
				presentclass {
					eq ('id',new Long(params.iclass))
				}

			if(params.gender && params.gender !="all")
				eq ('gender',params.gender)

		}

	}

	/**
	 * @param date
	 * @return
	 */
	static def getSqlTime(Date date){
		return new java.sql.Timestamp(date.getTime())
	}

/**
	 * Uddha Umesh
	 * @param params
	 * @return
	 */
	
	
	def quicksearch(params){
		
		println "params -------->" + params
		def cls = IClass.findById(params.iclass)
		def sect = Section.findById(params.section1)
		def instituite = userService.getCurrentInstituite()
		
		return Student.createCriteria().list{
			eq ('instituite.id', instituite?.id)
			academicyear{
					eq('academicyear',params.academicyear)
					
						eq('section',Section.findById(params.int('section1')))
						presentclass{'in' 'id',IClass.findById(params.int('iclass')).id}
						}
			eq ('studentId',params.studentId)
		}
		
		
	}
	
	
	def searchStudent(params){
		println "params "+params
		def instituite  = userService.getCurrentInstituite()
		return Student.createCriteria().list{
			eq ('instituite.id', instituite?.id)
			eq ('transfer',false)	
			
			or{

				if(params.registrationNo){
					eq ('registrationNo', params.registrationNo)
				}	
				if(params.studentName){
					eq ('studentName', params.studentName)
				}
				academicyear{
					eq('academicyear',params.academicyear)
				}
				if(params?.iclass && params?.section1){
					
				println"Section and class"
				academicyear{
					eq('section',Section.findById(params.int('section1')))
					presentclass{'in' 'id',IClass.findById(params.int('iclass')).id}
				    }	
				}
				if(params?.iclass && params?.section1=="" ){
					println"classs"
					academicyear{
						presentclass{'in' 'id',IClass.findById(params.int('iclass')).id}
						}
						
					}
				
			
			  }
		}
	}


	/**
	 * Uddha Umesh
	 * @param path
	 * @param instituite
	 * @return
	 */
	def String getPath(String path, String folderName){
		
		
		if(folderName.equalsIgnoreCase("")){
			folderName = ""
		}else{
			folderName = folderName+"/"
		}
		

	//	instituite = instituite.trim().replace(" ","")

		 
		 Admin admin = userService.getCurrentAdmin()//user.adminID
		 
		 Instituite inst = Instituite.findByAdmin(admin)
		 println "adminnnnnnnnn	:	"+inst +	'	:	'+ inst?.name
		 String adminName = admin.adminName+"/"
		 
		 if(!adminName.equalsIgnoreCase("admin")){
			 if(inst && inst.name)
				 path = path+admin.adminName+"/"+inst?.name+"/"+folderName
			 else{
				 path = path+admin.adminName+"/"+folderName
				 
			 }
		 }else{
			 path = path+"/stag/img/"	
		 }
		
	println "path	:"+path

		createfolder(path)

		return path
	}


	/**
	 * Uddha Umesh
	 * @param path
	 * @return
	 */
	def static createfolder(String path){

		def storagePathDirectory = new File(path)//(gpath)

		if (!storagePathDirectory.exists()) {
			if (storagePathDirectory.mkdirs()) {
			} else {
			}
		}
	}


	/**
	 * Uddha Umesh
	 * @param params
	 * @return
	 */
	def getAllStudentsDue(params){
		def instituite  = userService.getCurrentInstituite()
		return Student.createCriteria().list(params){
			eq ('instituite.id', instituite?.id)
			if(true)
				feeId{
					ne('due',new Long(0))
				}
		}
	}

	/**
	 * Uddha Umesh
	 * @param studentInstance
	 * @return
	 */
	def checkparentDetils(Student studentInstance){
		if(studentInstance.fatherDetails.parentName == null && studentInstance.fatherDetails.occupation == null &&
		studentInstance.fatherDetails.relation == null && studentInstance.fatherDetails.mobileNumber == null){
			studentInstance.fatherDetails = null//.parentName = " "
		}

		if(studentInstance.motherDetails.parentName == null && studentInstance.motherDetails.occupation == null &&
		studentInstance.motherDetails.relation == null && studentInstance.motherDetails.mobileNumber == null){
			studentInstance.motherDetails = null//.parentName = " "
		}

		/*if(studentInstance.guardianDetails.parentName == null && studentInstance.guardianDetails.occupation == null &&
		studentInstance.guardianDetails.relation == null && studentInstance.guardianDetails.mobileNumber == null){
			studentInstance.guardianDetails = null//.parentName = " "
		}
*/

		return studentInstance
	}



	/**
	 * Uddha Umesh
	 * @param params
	 * @return students
	 */
	def getStudentsAttendance(params){


		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");//yyyy-MM-dd");
		df.setLenient(false);
		def from = new java.sql.Timestamp(df.parse(params.fromDate).getTime())

		def students=StudentAttendance.createCriteria().list {
			if(params.studentID!="All Students"){
				eq('student',Student.findById(params.int('studentID')))
			}
			if(params.section!='Select Section'){
				student{
					academicyear{
						eq('section',Section.findById(params.int('academicyear[0].section.id')))
					}
				}
			}
			student{
				academicyear{
					presentclass{'in' 'id',IClass.findById(params.int('classID')).id}
				}
			}

			if(params.attendanceType=='Daily')
			{
				between("attendanceDate",from,from)
			}else{
				def to = new java.sql.Timestamp(df.parse(params.toDate).getTime())
				between("attendanceDate",from,to)
			}
		}
		return students
	}
	/**
	 * Uddha Umesh
	 * @param params
	 * @return particular students of particular class
	 */

	def getClassStudents(params){
		return Student.findAllByPresentclass(IClass.findById(params.int('classId')))
	}
	
	def searchStudentcast(params){
		println("Search student by cast service..")
		def instituite  = userService.getCurrentInstituite()
		return Student.createCriteria().list{
			eq ('instituite.id', instituite?.id)
				eq ('category', params.castName)
				
		}
	}
	
	/**
	 * Baswa Prasad
	 * @param params
	 * @return sequence unique student Id of particular class and section
	 */
	
	def getCustomerUniqueNumber(params){
		def randomno;
		def c = Student.createCriteria()
		def results = c.list {
			academicyear{
				eq('presentclass',IClass.findById(params.classId))
				eq('section',Section.findById(params.sectionId))
			}
			maxResults(1)
			order("id", "desc")
		}
		
		def number;
		String line;
		if(results[0]?.studentId)
		{
			line = results[0]?.studentId;
			number=(line.toInteger()+1).toInteger();
		}else{
			randomno="0001"
		}

		if(number!=null){
			if(number<=9){
				randomno="000"+number
			}else if(number<100 && number>=10){
				randomno="00"+number
			}else if(number<1000 && number>=100){
				randomno="0"+number
			}else{
				randomno="0001"
			}
		}
		return randomno;
	}
	
	def getPaymentUniqueNumber(params){
		def randomno;
		def c =FeeTracker.createCriteria()
		def results = c.list {
		eq ('institute', userService.getCurrentInstituite())
			maxResults(1)
			order("id", "desc")
		}
		
		def number;
		String line;
		if(results[0]?.invoiceNo)
		{
			line = results[0]?.invoiceNo;
			number=(line.toInteger()+1).toInteger();
		}else{
			randomno="000001"
		}

		if(number!=null){
			if(number<=9){
				randomno="00000"+number
			}else if(number<100 && number>=10){
				randomno="00"+number
			}else if(number<1000 && number>=100){
				randomno="0"+number
			}else if(number<10000 && number>=1000){
				randomno="0"+number
			}
			 else if(number<100000 && number>=10000){
			randomno="0"+number
			}
			
			else{
				randomno="000001"
			}
		}
		return randomno;
	}
	
	
	def searchStudentt(params){
		println "params "+params
		def instituite  = userService.getCurrentInstituite()
		return Student.createCriteria().list{
			eq ('instituite.id', instituite?.id)
			eq ('transfer',false)
			
			or{

				if(params.registrationNo){
					eq ('registrationNo', params.registrationNo)
				}
				if(params.studentName){
					eq ('studentName', params.studentName)
				}
				academicyear{
					eq('academicyear',params.academicyear)
				}
				if(params?.iclass && params?.section1){
					
				println"Section and class"
				academicyear{
					eq('section',Section.findById(params.int('section1')))
					presentclass{'in' 'id',IClass.findById(params.int('presentclass1')).id}
					}
				}
				if(params?.iclass && params?.section1=="" ){
					println"classs"
					academicyear{
						presentclass{'in' 'id',IClass.findById(params.int('presentclass1')).id}
						}
						
					}
				
			
			  }
		}
	}

}

