package com.hiideals.institute.feeservices

import grails.transaction.Transactional

import java.text.DateFormat
import java.text.SimpleDateFormat

import org.hibernate.QueryException

import com.hiideals.instituite.feemanagment.Admissionfee
import com.hiideals.instituite.feemanagment.Fee
import com.hiideals.instituite.feemanagment.FeeTracker
import com.hiideals.instituite.feemanagment.FeeTypesTracker
import com.hiideals.instituite.feemanagment.FeesTypes
import com.hiideals.instituite.feemanagment.InstFeeTypes
import com.hiideals.instituite.userservices.UserService


/**
 * @author Praveen kumar
 * @createdOn 26-Nov-2016
 *
 */
@Transactional
class FeeService {
	private static DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	//def springSecurityService
	//def userService
	def studentService
	def userService


	def getlistofpendingdues(params){

		def studentList = studentService.getAllStudents(params)
		def lists = []
		studentList.feeId.each {
			if(it.due !=0)
				lists.add(it)
		}


		return lists
	}


	/**
	 * @param feeInstance
	 * @param feetypeMap
	 * @param params
	 * @return
	 */
	def addtoFeeTracker(Fee feeInstance,def feetypeMap, params){

		int instal = FeeTracker.findAllByStudentId(feeInstance.studentId.id).size()+1

		FeeTracker feeTrackerInstance = new FeeTracker(invoiceNo:studentService.getPaymentUniqueNumber(params),instalment:instal,studentId:feeInstance.studentId.id,institute:userService.getCurrentInstituite(),
		studentName:feeInstance.studentId.studentName,discountT:feeInstance.discount, penaltyT:feeInstance.penalty, paymentType:params.paymentType,checkNumber:params.checkNumber,ddNumber:params.ddNumber,paidadmissionfee:params?.admissionfee1,dueadmissionfee:params?.admissionfeedue,totaladmissionfee:params?.admissionfee ,currentpaidadmissionfee:params?.admissionfee1)
	     params.currentpaidadmissionfee=params?.admissionfee1 
        feeTrackerInstance.properties=params
		for(FeesTypes feety in feeInstance.feetypes){
			if(feetypeMap.keySet().contains(feety.instFeeType.typeName) ){
				FeeTypesTracker feeTypeTracker = new FeeTypesTracker(instFeeTypeT:feety.instFeeType.typeName,
				amountPaidT:feetypeMap.getAt(feety.instFeeType.typeName),dueT:feety.due,
				amountToBePaidT:feety.amountToBePaid)
				feeTrackerInstance.addToFeetypetracker(feeTypeTracker)
			}//feety.amountPaid
		}


	def a=feeTrackerInstance.save(flush:true,failOnError:true)
	def fee1=FeeTracker.findById(feeTrackerInstance.id)
	fee1.remarks=params?.remarks1
	fee1.dateCreated=df.parse(params?.paydate)
	fee1.save(flush:true,failsOnError:true)
	return a;
	}

	/**
	 * @param params
	 * @param due
	 * @return
	 */
	def getInstituteFee(params){
		return Fee.createCriteria().list(params){
			eq ('institute', userService.getCurrentInstituite())
			studentId {
				eq ( 'transfer' ,false)
			}
			/*and{
			 if(due)
			 gt('due',new Long(0))
			 }*/

		}
	}

	/**
	 * @param gth
	 * @param geth
	 * @param lth
	 * @param let
	 * @param amount
	 * @param fieldtype
	 * @param iclass
	 * @param params
	 * @return
	 */
	def sortFeeByAmount(boolean gth, boolean geth, boolean lth, boolean let, boolean eqt, String amount,String fieldtype, String iclass,params){
		try{
			return Fee.createCriteria().list(params){
				eq ('institute', userService.getCurrentInstituite())
				if(iclass && !iclass.equals('all')){
					studentId{
						eq ('presentclass.id',new Long(iclass))
					}}
				if(amount)
					and{
						if(gth)
							gt(fieldtype,new Long(amount))
						else if(lth)
							lt(fieldtype,new Long(amount))
						else if(let)
							le(fieldtype,new Long(amount))
						else if(geth)
							ge(fieldtype,new Long(amount))
						else if(eqt)
							eq(fieldtype,new Long(amount))


					}

			}
		}catch(QueryException e){
			println "Error in sortFeeByAmount	:	"+e.getMessage()
		}catch(NullPointerException e){
			println "Error in sortFeeByAmount	:	"+e.getMessage()
		}catch(Exception e){
			println "Error in sortFeeByAmount	:	"+e.getMessage()
		}
	}

	/**
	 * @param params
	 * @return
	 */
	public getSortedfee(params){
		def feeInstanceList = null;
		if(!params.field){
			params.field = "due"
		}

		switch (params.typ){
			case "gt":
				feeInstanceList =sortFeeByAmount(true, false, false, false, false, params.amount,params.field,params.iclass,params)
				break;

			case "lt":
				feeInstanceList =sortFeeByAmount(false, false, true, false, false, params.amount,params.field,params.iclass,params)
				break;

			case "geth":
				feeInstanceList =sortFeeByAmount(false, true, false, false, false, params.amount,params.field,params.iclass,params)
				break;

			case "let":
				feeInstanceList =sortFeeByAmount(false, false, false, true, false, params.amount,params.field,params.iclass,params)
				break;
			case "eq":
				feeInstanceList =sortFeeByAmount(false, false, false, false, true, params.amount,params.field,params.iclass,params)
				break;
		}

		return feeInstanceList
	}


	/**
	 * @param params
	 * @return
	 */
	def getInstFees(params){
		def instFeeTypesInstance =  InstFeeTypes.createCriteria().list(params){
			eq("instituite",userService.getCurrentInstituite())

			if(params.iclass && params.iclass !="all")
				iclass{
					eq("id",params.long('iclass'))
				}
		}
	}
	def getadmissionfeeList(params,UserService us){
		println("adm,issionFee List..........:"+us?.getCurrentInstituite()?.id)
		
			return Admissionfee.createCriteria().list(params){
				eq ('instituite.id', us?.getCurrentInstituite()?.id)
				if(params.iclass && params.iclass != "null"){
					'in'("iclass.id",params.long('iclass'))
				}
			}
		}
	

	def serviceMethod() {

	}
	
		def getlist(params){
	   print"sssssssssss"+params
		    def feeInstanceList
			def instituite  = userService.getCurrentInstituite()
			DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
			def from=df.parse(params?.from)
			def to=df.parse(params?.to)
			def c=Fee.createCriteria()
			return feeInstanceList=c.list {
				eq("institute",instituite)
				between("lastUpdated", from, to)
			}
			
		
     }
	
}

