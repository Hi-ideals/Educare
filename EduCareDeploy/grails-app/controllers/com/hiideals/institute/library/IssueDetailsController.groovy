package com.hiideals.institute.library
import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional

import com.hiideals.instituite.student.Student;
import com.hiideals.institute.staff.Staff


@Secured(["ROLE_ADMIN","ROLE_USERR"])
@Transactional(readOnly = false)
class IssueDetailsController {

	static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
def staffService
	def userService
	def issueDetailsService

	def studentDetails(Integer max){
		params.max = Math.min(max ?: 50, 100)
		def inst = userService.getCurrentInstituite()

		def bookslist = issueDetailsService.getBooksList(inst,params)


		def newspaperlist = issueDetailsService.getNewspaperList(inst,params)
		def magazinlist = issueDetailsService.getMagazinList(inst,params)

		def activeMap = issueDetailsService.getactiveMap(params)
		respond new IssueDetails(), model:[activeMap:activeMap,params:params,bookslist:bookslist,newslist:newspaperlist,magazinlist:magazinlist,bookslistCount:bookslist.totalCount,newslistCount:newspaperlist.totalCount,magazinlistCount:magazinlist.totalCount]
	}

	def staffDetails(Integer max){
		params.max = Math.min(max ?: 50, 100)
		params.staff=true;
		def inst = userService.getCurrentInstituite()

		def bookslist = issueDetailsService.getBooksList(inst,params)


		def newspaperlist = issueDetailsService.getNewspaperList(inst,params)
		def magazinlist = issueDetailsService.getMagazinList(inst,params)

		def activeMap = issueDetailsService.getactiveMap(params)
		respond new IssueDetails(), model:[activeMap:activeMap,params:params,bookslist:bookslist,newslist:newspaperlist,magazinlist:magazinlist,bookslistCount:bookslist.totalCount,newslistCount:newspaperlist.totalCount,magazinlistCount:magazinlist.totalCount]
	}

	def bookReturn(){
		def studentlist=userService.getAllStudentList()
		[studentlist:studentlist]
	
	}

	/*def getDetails(){



		def std=Student.findById(params.studentId)
		
		
		if(params.categorys=="Newspapername")
		println"params"+params
		if(params.categorys=="Booksname"){
			def arylist=[]

		def stdbooks=IssueDetails.createCriteria().list {
			
			isNotEmpty("books")
			eq("studentId",std)
		}
				
		println"stdbooks"+stdbooks.books
		def studentBooks=stdbooks.books
		(studentBooks).each{

			println"boks"+it.title
			arylist.addAll(it)
		}
		
		
		println"boooks"	
		}
		if(params.categorys=="Magazinename"){
			
			
			def arylist1=[]
			
					def stdmagazine=IssueDetails.createCriteria().list {
						
						isNotNull("magazineId")
						eq("studentId",std)	
					}
							
					println"stdmagazine"+stdmagazine.magazineId
					def studentmagazines=stdmagazine.magazineId
					(studentmagazines).each{
			
						println"mag"+it.magazineName
						arylist1.addAll(it)
					}
					
			println"magazine"
		}
		
		def arylist=[]

		def stdbooks=IssueDetails.createCriteria().list {
			
			isNotEmpty("books")
			eq("studentId",std)
		}
				
		println"stdbooks"+stdbooks.books
		def studentBooks=stdbooks.books
		(studentBooks).each{

			println"boks"+it.title
			arylist.addAll(it)
		}
		
		
		render template:'books',model:[booksList: arylist,magazinelist:arylist1]
	}*/
	def bookReturnStaff(){
	def staffs=staffService.getAllStaffs(params)
		[staffs:staffs]
	}
	def returnBook(IssueDetails issueDetailsInstance){
		def inst = userService.getCurrentInstituite()
		String str2="are not availale to return please add books "
		String str1="sucessfully Returned"

		def checkStaff=issueDetailsInstance.staffId
		def action="create";
		def action1="index"
		def redirectionParams = [:]

		def curentSelectedBooks=issueDetailsInstance.books;
		def currentSelectedMagzines=issueDetailsInstance.magazineId;
		def currentSelectedNewspaper=issueDetailsInstance.newspaper;

		def previousMultipleBooksList = null
		if(issueDetailsInstance.studentId){
			previousMultipleBooksList = (IssueDetails.findAllByStudentIdAndInstituite(issueDetailsInstance.studentId,inst))
		}
		if(issueDetailsInstance.staffId){
			redirectionParams = issueDetailsService.getStaffRedirection()
			previousMultipleBooksList = (IssueDetails.findAllByStaffIdAndInstituite(issueDetailsInstance.staffId,inst))
		}

		def currentSelectedBooks = [] as List
		if(issueDetailsInstance?.books)
			currentSelectedBooks.addAll(issueDetailsInstance?.books)
		issueDetailsInstance?.books?.clear()
		previousMultipleBooksList.each{ previousSingleBookList->

			Iterator<Books> itr = currentSelectedBooks.iterator();
			if(issueDetailsInstance.magazineId!=null)
				if(previousSingleBookList.magazineId?.id == issueDetailsInstance.magazineId?.id){

					int volume=Integer.parseInt(issueDetailsInstance.magazineId.volume);
					volume=volume+1
					
					issueDetailsInstance.magazineId.volume=volume
					issueDetailsInstance.magazineId.save(flush:true);
					issueDetailsInstance.dateOfIssue = previousSingleBookList.dateOfIssue
					previousSingleBookList.magazineId=null
					previousSingleBookList.fineAmount =previousSingleBookList.fineAmount+ issueDetailsInstance.fineAmount
					previousSingleBookList.save(flush:true)
				}


			if(previousMultipleBooksList.books?.size()>0)
				while(itr.hasNext()){
					Books singleSelectedBook = (Books) itr.next()
					if(previousSingleBookList.books.id.contains(singleSelectedBook.id)){


						int volume=Integer.parseInt(singleSelectedBook.volume)
						volume=volume+1
						if(previousSingleBookList.staffId){
							def num1= previousSingleBookList.staffId
							num1.numberOfBooks=num1.numberOfBooks-1
							num1.save(flush:true)
						}else{


							def num= previousSingleBookList.studentId
							num.numberOfBooks=num.numberOfBooks-1
							num.save(flush:true)
						}



						singleSelectedBook.volume=volume.toString();
						singleSelectedBook.save(flush:true);

						previousSingleBookList.removeFromBooks(singleSelectedBook)
						previousSingleBookList.fineAmount = previousSingleBookList.fineAmount+issueDetailsInstance.fineAmount
						previousSingleBookList.save(flush:true)
						itr.remove()
					}

					if(previousSingleBookList.books.size()<=0){
						previousSingleBookList.numberOfDays=0
						previousSingleBookList.save(flush:true)
					}
				}//end of singleSelectedBook

		}//end of previousSingleBookList

		issueDetailsService.checkNewsPaper(issueDetailsInstance,inst)

		issueDetailsService.removeEmptyDetails(inst)
		if(issueDetailsInstance.studentId!=null){
			action="issueToStudent"
			action1="studentDetails"
		}else{
			action="issueToStaff"
			action1="staffDetails"
		}
		if(currentSelectedBooks?.size()>0){
			flash.message=(currentSelectedBooks.title).toString()+ " books need to be issued "
			redirect(controller:"issueDetails",action:action)
			return;
		}else{
			flash.message=str1;
			redirect(controller:"issueDetails",action:action1,params:redirectionParams)
		}


		if(currentSelectedMagzines){
			flash.message=(currentSelectedMagzines.magazineName).toString()+ " Magazine need to be issued "

		}

		if(currentSelectedNewspaper){
			flash.message=(currentSelectedNewspaper.name).toString()+ " newspaper need to be issued "

		}
	}

	def index(Integer max) {
		println("index....method  :"+params)
		params.max = Math.min(max ?: 50, 100)
		def inst = userService.getCurrentInstituite()

		def bookslist = issueDetailsService.getBooksList(inst,params)


		def newspaperlist = issueDetailsService.getNewspaperList(inst,params)
		println"newspaperlist"+newspaperlist
		def magazinlist = issueDetailsService.getMagazinList(inst,params)

		def activeMap = issueDetailsService.getactiveMap(params)
		respond new IssueDetails(), model:[activeMap:activeMap,params:params,bookslist:bookslist,newslist:newspaperlist,magazinlist:magazinlist,bookslistCount:bookslist.totalCount,newslistCount:newspaperlist.totalCount,magazinlistCount:magazinlist.totalCount]
	}


	def show(IssueDetails issueDetailsInstance) {
		respond issueDetailsInstance
	}

	def create() {

		respond new IssueDetails(params)
	}

	def issueToStudent(){

		respond new IssueDetails(params)

	}
	def issueToStaff(){


	}




	@Transactional
	def save(IssueDetails issueDetailsInstance) {

		def action="index"
		def action1="create"

		def datee=new Date()+Integer.parseInt(params.numberOfDays)
		issueDetailsInstance.returndate=datee;
		issueDetailsInstance.dateOfReturn=datee;
		def magz=issueDetailsInstance.magazineId
		def news=issueDetailsInstance.newspaper


		String str= null


		def inst = userService.getCurrentInstituite()
		def checkStudents= issueDetailsInstance.studentId
		def checkStaff= issueDetailsInstance.staffId

		def isueDList= IssueDetails.findAllByStudentIdAndInstituite(checkStudents,inst)
		def IsueStafList= IssueDetails.findAllByStaffIdAndInstituite(checkStaff,inst)
		def redirectionParams = [:]

		boolean isnewsExist = false;
		boolean ismagazinExists = false;
		def student=issueDetailsInstance.studentId
		def staff=issueDetailsInstance.staffId

		if(checkStudents!=null){

			if(magz){
				def getStudentMagazing = IssueDetails.findByStudentIdAndMagazineId(student, magz)
				if(getStudentMagazing){
					ismagazinExists = true;
				}
			}

			if(news){
				def getStudentMagazing = IssueDetails.findByStudentIdAndNewspaper(student, news)
				if(getStudentMagazing){
					isnewsExist = true;
				}
			}
		}

		if(checkStaff!=null){
			if(magz){
				def getStudentMagazing = IssueDetails.findByStaffIdAndMagazineId(staff, magz)
				if(getStudentMagazing){
					ismagazinExists = true;
				}
			}

			if(news){
				def getStudentMagazing = IssueDetails.findByStaffIdAndNewspaper(staff, news)
				if(getStudentMagazing){
					isnewsExist = true;
				}
			}
		}


		if(issueDetailsInstance.studentId!=null){
			action="issueToStudent"
			action1="studentDetails"
		}else{
			action="issueToStaff"
			action1="staffDetails"
		}


		if(ismagazinExists){
			flash.message = "${issueDetailsInstance.magazineId.magazineName} already issued  "
			redirect(action:action)
			return

		}

		if(isnewsExist){
			flash.message = "${issueDetailsInstance.newspaper.name} already issued "
			redirect(action:action)
			return
		}


		if(checkStaff!=null){
			redirectionParams = issueDetailsService.getStaffRedirection()
			(IsueStafList).each{staffbooklist->

				(issueDetailsInstance.books).each{

					if(staffbooklist.books.id.contains(it.id))
					{
						if(str == null){
							str= "${staffbooklist.staffId.staffName} already contains book please return ${it.title} "
						}else{
							str = str.concat(it.title);
						}
					}
				}

			}
		}

		if(checkStudents!=null){
			(isueDList).each {mainbooklist->



				(issueDetailsInstance.books).each{

					if(mainbooklist.books.id.contains(it.id))
					{

						if(str == null){
							str= "${mainbooklist.studentId.studentName}already conntains book please return ${it.title} "
						}else{
							str = str.concat(it.title);
						}
					}
				}

			}
			if(str){

				flash.message=str;
				redirect( controller:"issueDetails",action:"bookReturn")

				return
			}
		}



		//				issueDetailsInstance.save(flush:true)





		def bookReduce=issueDetailsInstance.books

		if(bookReduce){


			if(student){
				def bookCount=student?.numberOfBooks
				bookCount=bookCount+bookReduce.size();
				student.numberOfBooks=bookCount
				student.save(flush:true)


			}


			if(staff){
				def bookCount1=staff?.numberOfBooks
				bookCount1=bookCount1+bookReduce.size();
				staff.numberOfBooks=bookCount1

				staff.save(flush:true)
			}
			(bookReduce).each {

				it.volume
				int volume=Integer.parseInt(it.volume);
				volume=volume-1;
				it.volume=volume;
				it.save(flush:true,failOnError:true);
			}
		}

		def previousMag=IssueDetails.findAllByStudentId(issueDetailsInstance.studentId);


		(previousMag).each {

			println"previouys"+it

			if(issueDetailsInstance.magazineId)
				if(previousMag.id==(issueDetailsInstance.magazineId.id)){
					int volume1=Integer.parseInt(issueDetailsInstance.magazineId.volume);
					if(volume1>0){


						volume1=volume1-1;

						previousMag.volume=volume1

						previousMag.save(flush:true)
					}
					else{
						println"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
						flash.message=mesage
						// redirect(action:"create")
					}
				}

			if (issueDetailsInstance == null) {
				notFound()
				return
			}
			if (issueDetailsInstance.hasErrors()) {
				respond issueDetailsInstance.errors, view:'create'
				return
			}

		}
		issueDetailsInstance.save (flush:true,failOnError:true)

		flash.message = message(code: 'sucessfully Issued', args: [
			message(code: 'issued.label', default: 'IssueDetails'),
			""
		])

		if(issueDetailsInstance.studentId!=null){
			action="issueToStudent"
			action1="studentDetails"
		}else{
			action="issueToStaff"
			action1="staffDetails"
		}

		redirect(controller:"issueDetails",action:action1,params:redirectionParams)
		/*request.withFormat {
		 form multipartForm {
		 flash.message = message(code: 'default.created.message', args: [
		 message(code: 'issueDetails.label', default: 'IssueDetails'),
		 issueDetailsInstance.id
		 ])
		 redirect issueDetailsInstance
		 }
		 '*' { respond issueDetailsInstance, [status: CREATED] ,params:redirectionParams}
		 }*/
	}

	def edit(IssueDetails issueDetailsInstance) {
		respond issueDetailsInstance
	}

	@Transactional
	def update(IssueDetails issueDetailsInstance) {
		if (issueDetailsInstance == null) {
			notFound()
			return
		}

		if (issueDetailsInstance.hasErrors()) {
			respond issueDetailsInstance.errors, view:'edit'
			return
		}

		issueDetailsInstance.save flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.updated.message', args: [
					message(code: 'IssueDetails.label', default: 'IssueDetails'),
					issueDetailsInstance.id
				])
				redirect issueDetailsInstance
			}
			'*'{ respond issueDetailsInstance, [status: OK] }
		}
	}


	def printissueDetailsList(){
		println("issue Details Print.. .... :"+params)
		def issueDetailsInstanceList;
		
		params.max = params.max ?: 2
		
		
		def inst = userService.getCurrentInstituite()
		if(params.staff){
			if(params.books){
				def staffBooks = IssueDetails.findAllByInstituiteAndStaffIdIsNotNullAndMagazineIdIsNullAndNewspaperIsNull(inst)
				[issueDetailsInstanceList: staffBooks,instituite:inst,params:params]
			}else if(params.newspaper || params.newsPapers){
			
			def staffnewsPaper = IssueDetails.findAllByInstituiteAndStaffIdIsNotNullAndNewspaperIsNotNull(inst)
			[issueDetailsInstanceList: staffnewsPaper,instituite:inst,params:params]
			}else if(params.magazin || params.magazines){
			
			def staffMagazines = IssueDetails.findAllByInstituiteAndStaffIdIsNotNullAndMagazineIdIsNotNull(inst)
			[issueDetailsInstanceList: staffMagazines,instituite:inst,params:params]
			}
		}else{
		if(params.books){
			def stBooks = IssueDetails.findAllByInstituiteAndStudentIdIsNotNullAndMagazineIdIsNullAndNewspaperIsNull(inst)
			[issueDetailsInstanceList: stBooks,instituite:inst,params:params]
		}else if(params.newspaper || params.newsPapers){
		
		def stnewsPaper = IssueDetails.findAllByInstituiteAndStudentIdIsNotNullAndNewspaperIsNotNull(inst)
		[issueDetailsInstanceList: stnewsPaper,instituite:inst,params:params]
		}else if(params.magazin || params.magazines){
		
		def stMagazines = IssueDetails.findAllByInstituiteAndStudentIdIsNotNullAndMagazineIdIsNotNull(inst)
		[issueDetailsInstanceList: stMagazines,instituite:inst,params:params]
		}
		}
		
		/*if(params.books){
			println("only books   :"+params)
			issueDetailsInstanceList = issueDetailsService.getBooksList(inst,params)
			println("issueDetailsInstanceList....:"+issueDetailsInstanceList.booksId)
			def stBooks = IssueDetails.findAllByInstituiteAndStaffIdIsNotNull(inst)
			println("stBooks    :"+stBooks.booksId)
			[issueDetailsInstanceCount: IssueDetails.countByInstituiteAndStaffIdIsNotNull(inst),instituite:inst]
		}
		if(params.newspaper && params.newsPapers){
			println("only newsPapers")
			issueDetailsInstanceList = issueDetailsService.getNewspaperList(inst,params)
			//respond issueDetailsInstanceList, model:[issueDetailsInstanceCount: IssueDetails.countByInstituiteAndStaffIdIsNotNull(inst),instituite:inst]
		}
		if(params.magazin && params.magazines){
			println("only magazines")
			issueDetailsInstanceList= issueDetailsService.getMagazinList(inst,params)
			//respond issueDetailsInstanceList, model:[issueDetailsInstanceCount: IssueDetails.countByInstituiteAndStaffIdIsNotNull(inst),instituite:inst]
		}



		if(params.staff){
			[issueDetailsInstanceList:issueDetailsInstanceList,issueDetailsInstanceCount: IssueDetails.countByInstituiteAndStaffIdIsNotNull(inst),instituite:inst]
			return
			}else{
			[issueDetailsInstanceList:issueDetailsInstanceList,issueDetailsInstanceCount: IssueDetails.countByInstituiteAndStudentIdIsNotNull(inst),instituite:inst]
			return
			}*/
	}



	@Transactional
	def delete(IssueDetails issueDetailsInstance) {
		if (issueDetailsInstance == null) {
			notFound()
			return
		}

		String name = "";
		def redirectionParams = [:]


		if(issueDetailsInstance.studentId){
			name = issueDetailsInstance.studentId.studentName
		}

		if(issueDetailsInstance.staffId){
			redirectionParams = (issueDetailsService.getStaffRedirection())
			println "redirectionParams : "+redirectionParams
			name = issueDetailsInstance.staffId.staffName
		}

		issueDetailsInstance.delete flush:true

		flash.message = message(code: 'default.deleted.message', args: [
			name,
			message(code: 'IssueDetails.label', default: 'IssueDetails')
		])
		redirect(controller:"issueDetails",action:"index",params:redirectionParams)
		/*request.withFormat {
		 form multipartForm {
		 flash.message = message(code: 'default.deleted.message', args: [
		 name,
		 message(code: 'IssueDetails.label', default: 'IssueDetails')					
		 ])
		 redirect action:"index", method:"GET"
		 }
		 '*'{ render status: NO_CONTENT }
		 }*/
	}

	protected void notFound() {
		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.not.found.message', args: [
					message(code: 'issueDetails.label', default: 'IssueDetails'),
					params.id
				])
				redirect action: "index", method: "GET"
			}
			'*'{ render status: NOT_FOUND }
		}
	}


}

