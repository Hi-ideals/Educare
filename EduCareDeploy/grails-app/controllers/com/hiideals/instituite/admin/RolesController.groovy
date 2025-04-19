package com.hiideals.instituite.admin



import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional

import com.hiideals.instituite.users.SecRole
import com.hiideals.instituite.users.SecUser
@Secured(["ROLE_ADMIN","ROLE_USERR"])
@Transactional(readOnly = true)
class RolesController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
	def userService
	
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Roles.findAllByInstitute(userService.getCurrentInstituite(),params), model:[rolesInstanceCount: Roles.count()]
    }

    def show(Roles rolesInstance) {
        respond rolesInstance
    }

    def create() {
        respond new Roles(params)
    }

    @Transactional
    def save(Roles rolesInstance) {
        rolesInstance.roleName="ROLE_"+(params?.roleName).toUpperCase()	
		
		def existrole=Roles.findByRoleNameAndInstitute(rolesInstance.roleName,userService.getCurrentInstituite())
		if(existrole){
			flash.message="Role Already Exist"
			redirect(action:'create')
			
		}else{
		rolesInstance.createdUser=SecUser.findByUsername(userService.getUsername())
		rolesInstance.institute = userService.getCurrentInstituite()
		def roles = SecRole.findByAuthority(rolesInstance.roleName) ?: new SecRole(authority: rolesInstance.roleName).save(flush: true,failOnError:true)
        rolesInstance.setSecrole(roles)
		rolesInstance.save flush:true
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'roles.label', default: 'Roles'), rolesInstance.id])
                redirect rolesInstance
            }
            '*' { respond rolesInstance, [status: CREATED] }
           }
		}
    }

    def edit(Roles rolesInstance) {
        respond rolesInstance
    }

    @Transactional
    def update(Roles rolesInstance) {
        if (rolesInstance == null) {
            notFound()
            return
        }

        if (rolesInstance.hasErrors()) {
            respond rolesInstance.errors, view:'edit'
            return
        }
		rolesInstance.roleName="ROLE_"+(params?.roleName).toUpperCase()
		def existrole=Roles.findByRoleNameAndInstitute(rolesInstance.roleName,userService.getCurrentInstituite())
		if(existrole){
			flash.message="Role Already Exist"
			redirect(action:'create')
			
		}else{
		
		def secrole=SecRole.findById(rolesInstance?.secrole?.id)
		secrole.authority=rolesInstance.roleName
        rolesInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Roles.label', default: 'Roles'), rolesInstance.id])
                redirect rolesInstance
            }
            '*'{ respond rolesInstance, [status: OK] }
          }
		}
    }

    @Transactional
    def delete(Roles rolesInstance) {

        if (rolesInstance == null) {
            notFound()
            return
        }

        rolesInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Roles.label', default: 'Roles'), rolesInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'roles.label', default: 'Roles'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
