package com.hiideals.email

import grails.transaction.Transactional

@Transactional
class EmailsService {

	
	def mailService
	def grailsApplication
	def groovyPageRenderer
	
    def serviceMethod() {

    }
	
	
	
	/**
	 * Requested demo
	 * @param subject
	 * @param recipentEmail
	 * @param recipentName
	 * @param contactTxt
	 * @returns
	 */

	def sendRequestedDemoMessage(String senderemail, String subject1, String contactTxt){
		println"---------Requested Demo email ----------"
		Sendmail {
			multipart true
			async true
			to grailsApplication.config.grails.mail.username
			from senderemail
			subject subject1
			html  contactTxt
			//html view: template, model: [recipentName:recipentName,contactTxt:contactTxt]
		}
	}
	
	
	/**
	 * @param callable
	 * @return
	 */

	def Sendmail(Closure callable){
		mailService.sendMail(callable);
	}


}
