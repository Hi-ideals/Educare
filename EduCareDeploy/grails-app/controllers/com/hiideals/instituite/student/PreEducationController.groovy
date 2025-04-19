package com.hiideals.instituite.student



import static org.springframework.http.HttpStatus.*

import com.hiideals.instituite.helper.Image;
import com.hiideals.instituite.helper.Document;
import com.hiideals.institution.autogeneration.RandomString

import grails.transaction.Transactional
import grails.plugin.springsecurity.annotation.Secured

@Secured(["ROLE_ADMIN","ROLE_USERR"])
@Transactional(readOnly = true)
class PreEducationController {

    static allowedMethods = [save: "POST", update: "POST", delete: "DELETE"]
	def studentService
	def userService

    def index(Integer max) {
        params.max = Math.min(max ?: 100, 100)
        respond PreEducation.list(params), model:[preEducationInstanceCount: PreEducation.count()]
    }

    def show(PreEducation preEducationInstance) {
        respond preEducationInstance
    }

    def create() {
		
		def studentInstance = null
		if(params.studentInstance){
			studentInstance = Student.get(new Long(new String(params.studentInstance.decodeBase64())))
		}
		
        respond new PreEducation(params),model:[studentInstance:studentInstance]
    }

    @Transactional
    def save(PreEducation preEducationInstance) {
		
		preEducationInstance.schoolAddress.save(flush:true,failOnError:true)
		
        if (preEducationInstance == null) {
            return
        }

        if (preEducationInstance.hasErrors()) {
            respond preEducationInstance.errors, view:'create'
            return
        }
		
		def lists = (params.ty).split(",");
		def stpath = grailsApplication.config.imageFolder
		for(int i=0;i<lists.size();i++){
			def file = request.getFile('file_'+lists.getAt(i))
			String path = studentService.getPath(stpath,preEducationInstance?.studentpreEdu?.instituite?.name)
			String s = path + file?.getOriginalFilename()

			try{
				file.transferTo(new File(s))
			}catch(Exception e){}
			Image image = new Image(imagePath:s,isMainImage:false).save(flush:true,failOnError:true)
			preEducationInstance.addToFiles(image)
		}
		

        preEducationInstance.save flush:true
			saveDocuments(Student.findById(params.int('studentpreEdu.id')),params)
		redirect(controller:'fee', action:'create',params:[id:(preEducationInstance.studentpreEdu.id.toString()).bytes.encodeBase64().toString()])

       /* request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'preEducation.label', default: 'PreEducation'), preEducationInstance.id])
                redirect preEducationInstance
            }
            '*' { respond preEducationInstance, [status: CREATED] }
        }*/
    }

    def edit(PreEducation preEducationInstance) {
        respond preEducationInstance,model:[studentInstance:preEducationInstance.studentpreEdu]
    }

    @Transactional
    def update(PreEducation preEducationInstance) {
        if (preEducationInstance == null) {
            notFound()
            return
        }

        if (preEducationInstance.hasErrors()) {
            respond preEducationInstance.errors, view:'edit'
            return
        }
		if(params.openimg !=null && params.openimg.equals("yes")){
			def lists = (params.ty).split(",");
			
			def stpath = grailsApplication.config.imageFolder
			for(int i=0;i<lists.size();i++){
				def file = request.getFile('file_'+lists.getAt(i))
				String path = studentService.getPath(stpath,preEducationInstance?.studentpreEdu?.instituite?.name)
				String s = path + file?.getOriginalFilename()
	
				try{
					file.transferTo(new File(s))
				}catch(Exception e){}
				Image image = new Image(imagePath:s,isMainImage:false).save(flush:true,failOnError:true)
				preEducationInstance.addToFiles(image)
			}
		}

        preEducationInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'PreEducation.label', default: 'PreEducation'), preEducationInstance.id])
                redirect preEducationInstance
            }
            '*'{ respond preEducationInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(PreEducation preEducationInstance) {

        if (preEducationInstance == null) {
            notFound()
            return
        }

        preEducationInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'PreEducation.label', default: 'PreEducation'), preEducationInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'preEducation.label', default: 'PreEducation'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
	
	def saveDocuments(Student student,params){
		def stpath = grailsApplication.config.documentFolder
		for(int i=0;i<=3;i++){
			def file = request.getFile("document${i}")
			String path = studentService.getPath(stpath,student.registrationNo)
			if(file.getOriginalFilename()!=null && file.getOriginalFilename().isEmpty()==false){
				String s = path + file.getOriginalFilename()//+RandomString 
				try{
					file.transferTo(new File(s))
				}catch(Exception e){e.printStackTrace()}
				Document document=new Document(path:s,fileName:file.getOriginalFilename()).save(flush:true,failOnError:true);
				student.addToDocuments(document).save(flush:true,failOnError:true)
			}
		}
	}
	
	
}


