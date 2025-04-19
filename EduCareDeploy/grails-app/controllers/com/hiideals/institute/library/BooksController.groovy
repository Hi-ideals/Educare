package com.hiideals.institute.library



import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional

import java.text.DateFormat
import java.text.SimpleDateFormat

@Transactional(readOnly = true)
@Secured(["ROLE_ADMIN","ROLE_USERR"])
class BooksController {
	private static DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
   def userService
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
		def inst = userService.getCurrentInstituite()
        respond Books.findAllByInstituite(inst,params), model:[booksInstanceCount: Books.countByInstituite(inst)]
    }

    def show(Books booksInstance) {
        respond booksInstance
    }

    def create() {
		
        respond new Books(params)
    }

    @Transactional
    def save(Books booksInstance) {
		df.setLenient(false);
		booksInstance.purchasedOn = df.parse(params.purchasedOn1)  
		      
        booksInstance.save flush:true
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'books.label', default: 'Books'), booksInstance.id])
                redirect booksInstance
            }
            '*' { respond booksInstance, [status: CREATED] }
        }
    }

    def edit(Books booksInstance) {
        respond booksInstance
    }

    @Transactional
    def update(Books booksInstance) {
		println("asdgasdgasdg....:"+params)
		df.setLenient(false);
		booksInstance.purchasedOn = df.parse(params.purchasedOn1)
        if (booksInstance == null) {
            notFound()
            return
        }

        if (booksInstance.hasErrors()) {
            respond booksInstance.errors, view:'edit'
            return
        }

        booksInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Books.label', default: 'Books'), booksInstance.id])
                redirect booksInstance
            }
            '*'{ respond booksInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Books booksInstance) {

        if (booksInstance == null) {
            notFound()
            return
        }

        booksInstance.delete flush:true

       
                flash.message = message(code: booksInstance.title+' has been deleted', args: [message(code: 'Books.label', default: 'Books'), booksInstance.id])
				redirect action: "index"
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'books.label', default: 'Books'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
	def printBooksList(){
		println("Print Books list.....:  "+params)
		def inst = userService.getCurrentInstituite()
		respond Books.findAllByInstituite(inst,params), model:[booksInstanceCount: Books.countByInstituite(inst),instituite:inst]
	}
}
