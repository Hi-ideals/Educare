package com.hiideals.instituite.userservices

import grails.plugin.springsecurity.SpringSecurityUtils
import grails.transaction.Transactional

import com.hiideals.instituite.admin.Admin
import com.hiideals.instituite.admin.UserList
import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.classcourses.Subject
import com.hiideals.instituite.helper.UserModules
import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.student.Student
import com.hiideals.instituite.users.SecRole
import com.hiideals.instituite.users.SecUser
import com.hiideals.instituite.users.SecUserSecRole
import com.hiideals.institute.staff.Staff


/**
 * @author Uddha Umesh
 * @createdOn 23-Nov-2016
 *
 */
@Transactional
class UserService {

	def springSecurityService

	/**
	 * Uddha Umesh
	 * @return
	 */
	def String getEmail() {
		def user = springSecurityService.currentUser

		def userEmailAddress = null;
		if(user!=null){
			userEmailAddress = user.email;
		}

		return userEmailAddress;
	}

	/**
	 * Uddha Umesh
	 * @return
	 */
	def String getUsername() {
		def user = springSecurityService.currentUser
		
		println"@@@"+user

		def userName = null;
		if(user!=null){
			userName = user.username;
		}

		return userName;
	}
	
	
	/**
	 * Uddha Umesh
	 * @return
	 */
	def getUserRoles(){
		return springSecurityService.getPrincipal().getAuthorities()
	}


	/**
	 * Uddha Umesh
	 * @param adminInstance
	 * @return
	 */
	@Transactional
	def setAdminRole(Admin adminInstance){
		def adminRole = SecRole.findByAuthority('ROLE_ADMIN')
		def studentRole = SecRole.findByAuthority('ROLE_STUDENT')
		try{
			def adminUser = new SecUser(username: adminInstance.adminName, password: adminInstance.password, adminID:adminInstance.save(flush:true,failOnError:true)).save(flush: true,failOnError:true)

			if(!adminUser.authorities.contains(adminRole)){
				SecUserSecRole.create(adminUser, adminRole) ;
			}
			if(!adminUser.authorities.contains(studentRole)){
				SecUserSecRole.create( adminUser, studentRole) ;
			}
		}catch(Exception e){
			return e
		}
		return true
	}


	/**
	 * Uddha Umesh
	 * @param secuser
	 * @return
	 */
	def deleteAdmin(SecUser secuser){
		try{
			secuser.adminID = null
			secuser.studentID = null
			secuser.save flush:true
			Collection<SecUserSecRole> userRoles = SecUserSecRole.findAllBySecUser(secuser);
			userRoles*.delete();
			secuser.delete();
			return true
		}catch(Exception e){

			return false
		}
	}

	/**
	 * Uddha Umesh
	 * @param studentInstance
	 * @return
	 */
	def setStudentRole(Student studentInstance){
		def studentRole = SecRole.findByAuthority('ROLE_STUDENT')
		
		try{
			def studentUser = new SecUser(username: studentInstance.studentName + studentInstance.lastName + studentInstance.registrationNo, password: studentInstance.registrationNo, studentID:studentInstance).save(flush: true,failOnError:true)
			
			if(!studentUser.authorities.contains(studentRole)){
				SecUserSecRole.create(studentUser, studentRole) ;
			}
		}catch(Exception e){
			return e
		}
		return true
	}
	
	/**
	 * Uddha Umesh
	 * @return
	 */
	def Admin getCurrentAdmin(){
		def user = springSecurityService.currentUser
		return user.adminID
	}
	
	
	def UserList getCurrentUser(){
		def user = springSecurityService.currentUser
		return user.userlistID
	}
	
	
	/**
	 * Uddha Umesh
	 * @return
	 */
	def getCurrentStudent(){
		def user = springSecurityService.currentUser
		return user.studentID
	}
	
	/**
	 * Uddha Umesh
	 * @return
	 */
	def getCurrentInstituite(){
		
		def user
		if(SpringSecurityUtils.ifAllGranted("ROLE_ADMIN")){
			user = getCurrentAdmin()
			return Instituite.findByAdmin(user)
		}else{
			user= getCurrentUser()
			def secuser=SecUser.findByUsername(user?.createdUser)
			return Instituite.findByAdmin(secuser?.adminID)
		}
		
	}
	
	/**
	 * @param params
	 * @return
	 */
	def getAllClasses(params){
		return IClass.createCriteria().list(params){
			eq("instituite",getCurrentInstituite())
			
		}
	}
	
	/**
	 * @return
	 */
	def getAllClasses(){
		return IClass.createCriteria().list{
			eq("instituite",getCurrentInstituite())
			
		}
	}
	
	
	def getAllStaff(){
		return Staff.createCriteria().list{
			eq("institute",getCurrentInstituite())
			
		}
	}
	
	def getAllSubjects(){
		return Subject.createCriteria().list{
			eq("institute",getCurrentInstituite())
			
		}
	}
	
	def getAllStudentList(){
		return Student.createCriteria().list{
			eq("instituite",getCurrentInstituite())
			
		}
	}
	
	
	
	def deleteTimeTable(def classTimeTable){
		try{
		classTimeTable.each {
			it.delete(flush:true)
		}
		}catch(Exception e){
			e.printStackTrace()
		}
	}
	
	def setModules(params,Admin adminInstance){
		
				
				def aa=[params].flatten().findAll{ it != null }
				aa.each {
					if(it=='Student Management'){
						adminInstance.addToModules(UserModules.findByModuleNameIlikeIlike('dashboard'))
						adminInstance.addToModules(UserModules.findByModuleNameIlike('admission'))
						adminInstance.addToModules(UserModules.findByModuleNameIlike('readmission'))
						adminInstance.addToModules(UserModules.findByModuleNameIlike('student'))
						adminInstance.addToModules(UserModules.findByModuleNameIlike('academicyear'))
						adminInstance.addToModules(UserModules.findByModuleNameIlike('BirthDays'))
						adminInstance.addToModules(UserModules.findByModuleNameIlike('reports'))
						adminInstance.addToModules(UserModules.findByModuleNameIlike('settings'))
						adminInstance.addToModules(UserModules.findByModuleNameIlike('subjects'))
						adminInstance.addToModules(UserModules.findByModuleNameIlike('staff'))
						adminInstance.addToModules(UserModules.findByModuleNameIlike('feemanagement'))
						adminInstance.addToModules(UserModules.findByModuleNameIlike('BulkSMS'))
					}
		
					if(it=='Library Management'){
						adminInstance.addToModules(UserModules.findByModuleNameIlike('library'))
						adminInstance.addToModules(UserModules.findByModuleNameIlike('booksreport'))
					}
		
					if(it=='Transport Management'){
		
						adminInstance.addToModules(UserModules.findByModuleNameIlike('transport'))
					}
		
					if(it=='HR'){
						adminInstance.addToModules(UserModules.findByModuleNameIlike('payroll'))
					}
		
					if(it=='Exam'){
						adminInstance.addToModules(UserModules.findByModuleNameIlike('Exams'))
					}
		
					if(it=='Time Table'){
						adminInstance.addToModules(UserModules.findByModuleNameIlike('timetable'))
					}
		
					if(it=='Attendance Management'){
						adminInstance.addToModules(UserModules.findByModuleNameIlike('attendence'))
					}
					
					if(it=='Certificates'){
						adminInstance.addToModules(UserModules.findByModuleNameIlike('Certificates'))
					}
				}
				   return adminInstance
				
			}
	
			
			def setusersModules(params,UserList userListInstance){
				
						
						def aa=[params].flatten().findAll{ it != null }
						aa.each {
							if(it=='Student Management'){
								userListInstance.addToModules(UserModules.findByModuleNameIlikeIlike('dashboard'))
								userListInstance.addToModules(UserModules.findByModuleNameIlike('admission'))
								userListInstance.addToModules(UserModules.findByModuleNameIlike('readmission'))
								userListInstance.addToModules(UserModules.findByModuleNameIlike('student'))
								userListInstance.addToModules(UserModules.findByModuleNameIlike('academicyear'))
								userListInstance.addToModules(UserModules.findByModuleNameIlike('BirthDays'))
								userListInstance.addToModules(UserModules.findByModuleNameIlike('reports'))
								userListInstance.addToModules(UserModules.findByModuleNameIlike('settings'))
								userListInstance.addToModules(UserModules.findByModuleNameIlike('subjects'))
								userListInstance.addToModules(UserModules.findByModuleNameIlike('staff'))
								userListInstance.addToModules(UserModules.findByModuleNameIlike('feemanagement'))
								userListInstance.addToModules(UserModules.findByModuleNameIlike('BulkSMS'))
							}
				
							if(it=='Library Management'){
								userListInstance.addToModules(UserModules.findByModuleNameIlike('library'))
								userListInstance.addToModules(UserModules.findByModuleNameIlike('booksreport'))
							}
				
							if(it=='Transport Management'){
				
								userListInstance.addToModules(UserModules.findByModuleNameIlike('transport'))
							}
				
							if(it=='HR'){
								userListInstance.addToModules(UserModules.findByModuleNameIlike('payroll'))
							}
				
							if(it=='Exam'){
								userListInstance.addToModules(UserModules.findByModuleNameIlike('Exams'))
							}
				
							if(it=='Time Table'){
								userListInstance.addToModules(UserModules.findByModuleNameIlike('timetable'))
							}
				
							if(it=='Attendance Management'){
								userListInstance.addToModules(UserModules.findByModuleNameIlike('attendence'))
							}
							
							if(it=='Certificates'){
								userListInstance.addToModules(UserModules.findByModuleNameIlike('Certificates'))
							}
						}
						   return userListInstance
						
					}
			
			
	
	
}


