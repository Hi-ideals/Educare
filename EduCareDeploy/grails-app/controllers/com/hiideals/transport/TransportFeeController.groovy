package com.hiideals.transport



import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional
import com.hiideals.instituite.helper.Batch
import com.hiideals.instituite.helper.AcademicYear
import com.hiideals.instituite.student.Student
import com.hiideals.institute.staff.Staff
import com.hiideals.institution.autogeneration.RandomString
import com.hiideals.random.RandomNoGenerator


@Transactional(readOnly = true)
@Secured(["ROLE_ADMIN","ROLE_USERR"])
class TransportFeeController {
	def userService;
def batchService
	static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

	def index(Integer max) {
		params.max = Math.min(max ?: 100, 100)
		respond TransportFee.findAllByInstitute(userService.getCurrentInstituite(),params), model:[transportFeeInstanceCount: TransportFee.count()]
	}

	def show(TransportFee transportFeeInstance) {
		respond transportFeeInstance
	}

	def create() {
		def transp=Transport.findAllByInstitute(userService.getCurrentInstituite());
		def tt=[]
		transp.each {
			if(!tt?.destination?.contains(it?.destination)){
				tt.addAll(it)
			}
		}
		def batchList = batchService.getListofBatches(params)
		def random=RandomString.instance.generate(5)+RandomNoGenerator.numberGenerator();
		respond new TransportFee(params),model:[paymentId:random,transprt:tt,batchList:batchList]
	}

	@Transactional
	def save(TransportFee transportFeeInstance) {
	
		if (transportFeeInstance == null) {
			notFound()
			return
		}

		if (transportFeeInstance.hasErrors()) {
			respond transportFeeInstance.errors, view:'create'
			return
		}
        def ss=Transport.findById(params?.transport.id) 
        transportFeeInstance.acdemicyear=ss?.destination?.acdemicyear
		transportFeeInstance.save flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.created.message', args: [message(code: 'transportFee.label', default: 'TransportFee'), transportFeeInstance.id])
				redirect transportFeeInstance
			}
			'*' { respond transportFeeInstance, [status: CREATED] }
		}
	}

	def edit(TransportFee transportFeeInstance) {
		def transp=Transport.findAllByInstitute(userService.getCurrentInstituite());
		respond transportFeeInstance,model:[transprt:transp]
	}

	@Transactional
	def update(TransportFee transportFeeInstance) {
		if (transportFeeInstance == null) {
			notFound()
			return
		}

		if (transportFeeInstance.hasErrors()) {	
			respond transportFeeInstance.errors, view:'edit'
			return
		}
		 def ss=Transport.findById(transport.id) 
		 println"@@@@@@@@@" +ss?.destination?.acdemicyear?.batchName
        transportFeeInstance.acdemicyear=ss?.destination?.acdemicyear
		transportFeeInstance.save flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.updated.message', args: [message(code: 'TransportFee.label', default: 'TransportFee'), transportFeeInstance.id])
				redirect transportFeeInstance
			}
			'*'{ respond transportFeeInstance, [status: OK] }
		}
	}

	@Transactional
	def delete(TransportFee transportFeeInstance) {

		if (transportFeeInstance == null) {
			notFound()
			return
		}

		transportFeeInstance.delete flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.deleted.message', args: [message(code: 'TransportFee.label', default: 'TransportFee'), transportFeeInstance.id])
				redirect action:"index", method:"GET"
			}
			'*'{ render status: NO_CONTENT }
		}
	}

	protected void notFound() {
		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.not.found.message', args: [message(code: 'transportFee.label', default: 'TransportFee'), params.id])
				redirect action: "index", method: "GET"
			}
			'*'{ render status: NOT_FOUND }
		}
	}

	def getStudents(){
		Transport tra=Transport.findById(params.int('value'))
		List<Transport> transport=Transport.findAllByDestinationAndEmployee(tra.destination,null)
		render(template:'students',model:[students:transport?.student])
	}
	
	def getStaffs(){
		Transport tra=Transport.findById(params.int('value'))
		List<Transport> transport=Transport.findAllByDestinationAndStudent(tra.destination,null)
		render(template:'staffs',model:[staffs:transport?.employee])
	}

	
	
	
	
	
	
	
	
	
	def getFeeDetails(){
		println"@@@@@@@@@"+params?.transportId
		
		def tt=Transport.findById(params?.transportId)
		params.max=1
		params.sort='id'
		params.order="desc"
		def transportFee
		println "@@@@@@@@@@@@ "+params
		if(params.student){
		transportFee=TransportFee.findByStudentAndAcdemicyear(Student.findById(params.int('studentId')),tt?.destination?.acdemicyear,params)
		}else{
		transportFee=TransportFee.findByEmployeeAndAcdemicyear(Staff.findById(params.int('staffId')),tt?.destination?.acdemicyear,params)
		}
		def paid
		def remaining
	
		if(transportFee){
			paid=transportFee.paidAmount;
			remaining=transportFee.remainingAmount;
		}else{
		
			Transport tra=Transport.findById(params.int('transportId'))
			Transport transport
			if(params.student){
			 transport=Transport.findByStudentAndDestination(Student.findById(params.int('studentId')),tra?.destination,params)
			}else{
			 transport=Transport.findByEmployeeAndDestination(Staff.findById(params.int('staffId')),tra?.destination,params)
			}
			
			println"@@@@@@"+transport
			paid=0;
			remaining=transport.destination.amount;
		}

		render(template:'feedetails',model:[paid:paid,remaining:remaining])
	}
	
	def getSearchDetails(){

		def results=TransportFee.createCriteria()
		if(params.type.equalsIgnoreCase('student')){
			results=results.list(params){	
				eq('institute',userService.getCurrentInstituite())
				student{
					ilike("studentName","%"+params.value+"%")
				}
			}
		}
		if(params.type.equalsIgnoreCase('staff')){
			results=results.list(params){
				eq('institute',userService.getCurrentInstituite())
				employee{
					ilike("staffName","%"+params.value+"%")
				}
			}
		}
		if(params.type.equalsIgnoreCase('route')){
			results=results.list(params){
				eq('institute',userService.getCurrentInstituite())
				transport{
					route{
						ilike("startPlace","%"+params.value+"%")
					}
				}
			}
		}
		if(params.type.equalsIgnoreCase('Destination')){
			results=results.list(params){
				eq('institute',userService.getCurrentInstituite())
				transport{
					destination{
						ilike("fromPlace","%"+params.value+"%")
					}
				}
			}
		}
		render (template:'transportFeeList',model:[transportFeeInstanceList:results])
	}
	def transportBill(){
		def inst = userService.getCurrentInstituite()
		def transportFeeInstanceList = TransportFee.findAllByInstituteAndId(inst,params.id)
		[transportFeeInstanceList:transportFeeInstanceList,instituite:inst]
	}
}
