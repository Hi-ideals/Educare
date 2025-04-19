package com.hiideals.instituite.admin



import static org.springframework.http.HttpStatus.*

import java.util.Date

import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional

import com.hiideals.instituite.helper.Address
import com.hiideals.instituite.users.SecRole
import com.hiideals.instituite.users.SecUser
import com.hiideals.instituite.users.SecUserSecRole
@Secured(["ROLE_ADMIN","ROLE_USERR"])
@Transactional(readOnly = true) 
class UserListController {
	def userService
	static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

	def index(Integer max) {
		params.max = Math.min(max ?: 10, 100)
		respond UserList.findAllByInstitute(userService.getCurrentInstituite(),params), model:[userListInstanceCount: UserList.count()]
	}

	def show(UserList userListInstance) {
		respond userListInstance
	}

	def create() {
		def roles=Roles.findAllByInstitute(userService?.getCurrentInstituite())
		respond new UserList(params),model:[roles:roles]
	}

	@Transactional
	def save(UserList userListInstance) {
		
		def userexist=SecUser.findByUsername(userListInstance?.userName)
		if(userexist){
			flash.message="Username already exist"
			redirect(action:'create')
			
		}else{
		def role=Roles.findById(params?.secrole?.id)
		def secrole=SecRole.findById(role?.secrole?.id)
		def userrole = SecRole.findByAuthority(secrole?.authority)
		def sRole = SecRole.findByAuthority('ROLE_USERR')
		userListInstance.institute = userService.getCurrentInstituite()
		Address address=new Address(params)
		def admin=Admin.findById(SecUser?.findByUsername(userService.getUsername())?.adminID?.id)
		userListInstance.setAddress(address.save(flush:true))
		userListInstance.setSecrole(Roles?.findById(params?.secrole?.id))
		userListInstance.setCreatedUser(SecUser?.findByUsername(userService.getUsername()))
		userListInstance.save(flush:true)
		userService.setusersModules(params.module, userListInstance)
		def User = new SecUser(params)
			User.username=userListInstance.userName
		 	User.password=userListInstance.password
			User.adminID=admin
			User.userlistID=userListInstance
			User.save(flush:true,failOnError:true)
				if(!User.authorities.contains(userrole)){
					SecUserSecRole.create(User, userrole) ;
				}
				if(!User.authorities.contains(sRole)){
					SecUserSecRole.create(User, sRole) ;
				}	
				
				
		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.created.message', args: [
					message(code: 'userList.label', default: 'UserList'),
					userListInstance.id
				])
				redirect userListInstance	
			}
			'*' { respond userListInstance, [status: CREATED] }
		 }
		}
	}

	def edit(UserList userListInstance) {
		respond userListInstance
	}

	@Transactional
	def update(UserList userListInstance) {
       userListInstance.properties=params
	   userListInstance.address.properties=params
		userListInstance.save flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.updated.message', args: [
					message(code: 'UserList.label', default: 'UserList'),
					userListInstance.id
				])
				redirect userListInstance
			}
			'*'{ respond userListInstance, [status: OK] }
		}
	}

	@Transactional
	def delete(UserList userListInstance) {

		if (userListInstance == null) {
			notFound()
			return
		}

		userListInstance.delete flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.deleted.message', args: [
					message(code: 'UserList.label', default: 'UserList'),
					userListInstance.id
				])
				redirect action:"index", method:"GET"
			}
			'*'{ render status: NO_CONTENT }
		}
	}

	protected void notFound() {
		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.not.found.message', args: [
					message(code: 'userList.label', default: 'UserList'),
					params.id
				])
				redirect action: "index", method: "GET"
			}
			'*'{ render status: NOT_FOUND }
		}
	}
}
