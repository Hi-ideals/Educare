package com.hiideals.instituite.helper

import com.hiideals.instituite.EDcoding.LookUpED;
import com.hiideals.instituite.student.Student;

import grails.plugin.springsecurity.annotation.Secured;

@Secured(["ROLE_ADMIN","ROLE_USERR"])
class GalleryController {

	def userService
	def studentService

	def index() {
		[instituiteInstance : userService.getCurrentInstituite()]

	}


	def save(){
		def instituiteInstance = userService.getCurrentInstituite()

		def lists = (params.ty).split(",");



		def stpath = grailsApplication.config.imageFolder
		for(int i=0;i<lists.size();i++){
			def file = request.getFile('file_'+lists.getAt(i))
			String path = studentService.getPath(stpath,instituiteInstance.name)
			String s = path + file.getOriginalFilename()

			try{
				file.transferTo(new File(s))
			}catch(Exception e){}
			Image image = new Image(imagePath:s,isMainImage:false).save(flush:true,failOnError:true)
			instituiteInstance.addToGallery(image)
		}

		instituiteInstance.save(flush:true,failOnError:true)
		flash.message="Successfully Added Images"
		redirect(controller:'gallery')

	}

	def editImage(){ 
		
		def studentInstance = Student.get(LookUpED.decod(params.studentId))
		
		Image image = studentInstance.profilePic
		
		def stpath = grailsApplication.config.imageFolder
		def file = request.getFile('file_1')
		String path = studentService.getPath(stpath,studentInstance.studentName)
		String s = path + file.getOriginalFilename()

		File directory=new File(s)
		if(!directory.exists()){
			directory.mkdirs()
		}
		try{
			file.transferTo(new File(s))
		}catch(Exception e){
		e.printStackTrace()
		}
		
		if(image !=null){
			image.imagePath = s
			image.save(flush:true,failOnError:true)
		}
		else{
			image = new Image(imagePath:s,imageDescription:"").save(flush:true,failOnError:true)
			studentInstance.profilePic = image
			studentInstance.save(flush:true,failOnError:true)
		}
		
		redirect(controller:'student',action:'show',params:[id:LookUpED.encod(studentInstance.id)])
	}
}
