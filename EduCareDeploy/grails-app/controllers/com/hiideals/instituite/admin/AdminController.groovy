package com.hiideals.instituite.admin



import grails.plugin.springsecurity.annotation.Secured

import com.hiideals.instituite.helper.Image
import com.hiideals.instituite.helper.UserModules
import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.users.SecRole
import com.hiideals.instituite.users.SecUser
import com.hiideals.instituite.users.SecUserSecRole
import com.hiideals.institution.autogeneration.AutoGeneration
import com.hiideals.onlinepayment.Payment
import com.hiideals.random.RandomNoGenerator
import com.instamojo.wrapper.api.Instamojo
import com.instamojo.wrapper.api.InstamojoImpl
import com.instamojo.wrapper.exception.ConnectionException
import com.instamojo.wrapper.exception.InvalidPaymentOrderException
import com.instamojo.wrapper.model.PaymentOrder
import com.instamojo.wrapper.response.CreatePaymentOrderResponse



@Secured(["ROLE_ADMIN","ROLE_USERR"])

class AdminController {

	static allowedMethods = [save: "POST", update: "POST", delete: "DELETE"]
	def userService
	def studentService

	@Secured(['ROLE_SUPERADMIN'])
	def index(Integer max) {
		params.max = Math.min(max ?: 100, 100)
		def adminRole = SecRole.findByAuthority('ROLE_ADMIN')
		def studentRole = SecRole.findByAuthority('ROLE_STUDENT')

		Admin adminInstance = session["admin"]
		Payment pay = session["pay"]

		if(adminInstance){
			adminInstance.save(flush:true,failOnError:true)
			pay.save(flush:true,failOnError:true)
			def adminUser = new SecUser()
			adminUser.username=adminInstance.adminName
			adminUser.password=adminInstance.password
			adminUser.adminID=adminInstance
			adminUser.save(flush:true,failOnError:true)

			if(!adminUser.authorities.contains(adminRole)){
				SecUserSecRole.create(adminUser, adminRole) ;
			}
			if(!adminUser.authorities.contains(studentRole)){
				SecUserSecRole.create( adminUser, studentRole) ;
			}
		}
		session.removeAttribute("admin")
		respond Admin.list(params), model:[adminInstanceCount: Admin.count()]
	}

	def show(Admin adminInstance) {
		def adminInstitute = Instituite.findByAdmin(adminInstance)
		respond adminInstance,model:[adminInstitute:adminInstitute]
	}

	def create() {
		if(!params.errors)
			respond new Admin(params), model:['ID':AutoGeneration.generateID()]
	}


	def save(Admin adminInstance) {
		if (adminInstance == null) {
			notFound()
			return
		}
		if (adminInstance.hasErrors()) {
			respond adminInstance.errors, view:'create'
			return
		}
		def stpath = grailsApplication.config.imageFolder + adminInstance.adminName+"/"
		def file = request.getFile('file_1')
		String path = studentService.getPath(stpath,"")
		String s = path + file.getOriginalFilename()
		try{
			file.transferTo(new File(s))
		}catch(Exception e){}
		Image image = new Image(imagePath:s,imageDescription:"").save(flush:true,failOnError:true)
		adminInstance.profilePic = image
		userService.setModules(params.module, adminInstance)
		def secUserInstance = userService.setAdminRole(adminInstance)
		println "secUserInstance  "+secUserInstance
		if(secUserInstance !=true){
			adminInstance.delete(flush:true,failOnError:true)
			adminInstance = new Admin(params)
			chain(action:'create',model:[adminInstance:adminInstance,secUserInstance:secUserInstance],params:[errors:true])
			return
		}
		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.created.message', args: [
					message(code: 'admin.label', default: 'Admin'),
					adminInstance.id
				])
				redirect adminInstance
			}
			'*' { respond adminInstance, [status: CREATED] }
		}
	}

	def edit(Admin adminInstance) {
		respond adminInstance
	}


	def update(Admin adminInstance) {
		adminInstance.modules.clear()
		if (adminInstance == null) {
			notFound()
			return
		}

		if (adminInstance.hasErrors()) {
			respond adminInstance.errors, view:'edit'
			return
		}
		userService.setModules(params.module, adminInstance)
		if(params.openimg !=null && params.openimg.equals("yes")){
			def stpath = grailsApplication.config.imageFolder

			def file = request.getFile('file_1')
			String path = studentService.getPath(stpath,"Admins")
			String s = path + file.getOriginalFilename()

			try{
				file.transferTo(new File(s))
			}catch(Exception e){}
			Image image = new Image(imagePath:s,imageDescription:"").save(flush:true,failOnError:true)
			adminInstance.profilePic = image
		}

		def secuser = SecUser.findByAdminID(adminInstance)
		try{
			secuser.username = adminInstance.adminName
			secuser.password=adminInstance.password
			secuser.save(flush:true,failOnError:true)
		}catch(Exception e){}


		adminInstance.save flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.updated.message', args: [
					message(code: 'Admin.label', default: 'Admin'),
					adminInstance.id
				])
				redirect adminInstance
			}
			'*'{
				respond adminInstance, [status: OK]
			}
		}
	}


	def delete(Admin adminInstance) {

		if (adminInstance == null) {
			notFound()
			return
		}

		def secuser = SecUser.findByAdminID(adminInstance)
		if(userService.deleteAdmin(secuser))
			adminInstance.delete flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.deleted.message', args: [
					message(code: 'Admin.label', default: 'Admin'),
					adminInstance.id
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
					message(code: 'admin.label', default: 'Admin'),
					params.id
				])
				redirect action: "index1", method: "GET"
			}
			'*'{ render status: NOT_FOUND }
		}
	}

	def addModules(){
		def module=UserModules.findByModuleNameIlike(params.moduleName)
		if(!module){
			UserModules modules=new UserModules(params).save(flush:true,failOnError:true)
			flash.msg1="Module Added"
		}else{
			flash.msg2="This module is added."
		}
		redirect(action:'index')
	}

	def modulesList(){
		def modules=UserModules.list()
		[modules:modules]
	}

	def editmodules(){
		def modules=UserModules.findById(params.id)
		modules.properties=params
		def a=modules.save(flush:true,failOnError:true)
		if(a){
			flash.msg1="Updated"
		}
		redirect(action:'modulesList')
	}

	def deletemodules(){
		def modules=UserModules.findById(params.id)
		def a=modules.delete(flush:true)
		if(a){
			flash.msg2="Deleted"
		}
		redirect(action:'modulesList')
	}


	def makepayment(){
		println "@@@@@@@ "+params
		Admin adminInstance=new Admin(params)
		def paymentURL=null

		def stpath = grailsApplication.config.imageFolder

		def file = request.getFile('file_1')
		String path = studentService.getPath(stpath,"Admins")
		String s = path + file.getOriginalFilename()

		try{
			file.transferTo(new File(s))
		}catch(Exception e){}
		Image image = new Image(imagePath:s,imageDescription:"").save(flush:true,failOnError:true)
		adminInstance.profilePic = image
		userService.setModules(params.module, adminInstance)
		try{
			session.admin=adminInstance
		}catch(Exception e){
			println  e
		}

		Payment pay=new Payment();
		pay.name=params.adminName
		pay.email="info@hiideals.com"
		pay.phone=params.address.mobileNumber
		pay.currency="INR"
		pay.amount=params.payamt.toDouble()
		pay.description="You are paying to hiideals.com."
		pay.transactionId=RandomNoGenerator.numberGenerator().toString()
		pay.admin=adminInstance
		session.pay=pay


		PaymentOrder order = new PaymentOrder();
		order.setName(params.adminName);
		order.setEmail("info@hiideals.com");
		order.setPhone(params.address.mobileNumber);
		order.setCurrency("INR");
		order.setAmount(params.payamt.toDouble())
		order.setDescription("You are paying to hiideals.com.");
		order.setRedirectUrl("http://localhost:8080/vidya/admin");//"http://staging.sooperdeal.in/invoice");
		order.setTransactionId(pay.transactionId);

		Instamojo api = null;

		try {
			// gets the reference to the instamojo api

			//Production
			 /*api = InstamojoImpl.getApi("5gx95h7rZ9rLkPPpDK5JQ71SodttDU0VauEY5bK6",
			 "A45bALb5NUZkU7M8A4SHP2YrfR2wBXfy0T3DcOYo8pOpsU90h9CDa50qEfVPFD3pYsLInqBQp6xEJUGlvVFcBoAmIegpVPupvvH0dpfvC0uS1Ekvjif64hL3B9ioyQnQ",
			 "https://api.instamojo.com/v2/",
			 "https://www.instamojo.com/oauth2/token/");*/

			//Test
			api = InstamojoImpl.getApi("wvDJOYuJZkAqDIcrcaX87QLLbipAEbnCn9hOXWlt",
					"Phnga6eJ2ncOxTwje53jKOlq5xqoWzVZFo9ogZ9BizhGIloevdiZpYWRpqKH5aDT5sDnKOyGaLW9lShJSL40F4TDewYO6AqOvSMEuOTTSpziTSBRmif1lh6fedNLQ8SQ",
					"https://test.instamojo.com/v2/",
					"https://test.instamojo.com/oauth2/token/");


		} catch (ConnectionException e) {
			println "inside"
			//	Logger.log(Level.SEVERE, e.toString(), e);
		}

		boolean isOrderValid = order.validate();

		if (isOrderValid) {
			try {
				CreatePaymentOrderResponse createPaymentOrderResponse = api.createNewPaymentOrder(order);
				// print the status of the payment order.

				paymentURL=createPaymentOrderResponse.paymentOptions.paymentUrl

				println(createPaymentOrderResponse.getPaymentOrder().getStatus());

			} catch (InvalidPaymentOrderException e) {
				println(e.printStackTrace())

				if (order.isTransactionIdInvalid()) {
					println("Transaction id is invalid. This is mostly due to duplicate  transaction id.");
				}
				if (order.isCurrencyInvalid()) {
					println("Currency is invalid.");
				}
			} catch (ConnectionException e) {
				//Logger.log(Level.SEVERE, e.toString(), e);
			}
		} else {
			// inform validation errors to the user.
			if (order.isTransactionIdInvalid()) {
				println("Transaction id is invalid.");
			}
			if (order.isAmountInvalid()) {
				println("Amount can not be less than 9.00.");
			}
			if (order.isCurrencyInvalid()) {
				println("Please provide the currency.");
			}
			if (order.isDescriptionInvalid()) {
				println("Description can not be greater than 255 characters.");
			}
			if (order.isEmailInvalid()) {
				println("Please provide valid Email Address.");
			}
			if (order.isNameInvalid()) {
				println("Name can not be greater than 100 characters.");
			}
			if (order.isPhoneInvalid()) {
				println("Phone is invalid.");
			}
			if (order.isRedirectUrlInvalid()) {
				println("Please provide valid Redirect url.");
			}
		}
		[paymentURL:paymentURL]
	}
}


