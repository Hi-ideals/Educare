package com.hiideals.institute.library
import com.hiideals.instituite.main.Instituite
import grails.transaction.Transactional

@Transactional
class IssueDetailsService {

	def removeEmptyDetails(Instituite inst){
		def emptyList = IssueDetails.createCriteria().list {
			eq('instituite',inst)
			and{
				isEmpty("books")
				isNull("magazineId")
				isNull("newspaper")
			}
		}
		emptyList.each {
it.delete(flush:true,failOnError:true)
}
}
																																																																																																																				

def checkNewsPaper(IssueDetails issueDetailsInstance, Instituite inst){
def issuedetail = null;

if(issueDetailsInstance.studentId){
issuedetail = (IssueDetails.findByStudentIdAndNewspaperAndInstituite(issueDetailsInstance.studentId,issueDetailsInstance.newspaper,inst))
}

if(issueDetailsInstance.staffId){
issuedetail = (IssueDetails.findByStaffIdAndNewspaperAndInstituite(issueDetailsInstance.staffId,issueDetailsInstance.newspaper,inst))
}

if(issuedetail){
issuedetail.newspaper = null;
issuedetail.save(flush:true)
}
}

	def getStaffRedirection(){
		return ["staff": true]
	}

	def getBooksList(Instituite inst ,params){
		return IssueDetails.createCriteria().list(params){
			eq("instituite",inst)
			if(params.staff)
				isNotNull("staffId")
			else
				isNotNull("studentId")

			isNotEmpty("books")
		}
	}
	
	def getMagazinList(Instituite inst ,params){
		return IssueDetails.createCriteria().list(params){
			eq("instituite",inst)
			if(params.staff)
				isNotNull("staffId")
			else
				isNotNull("studentId")

			isNotNull("magazineId")
		}
	}
	
	def getNewspaperList(Instituite inst ,params){
		return IssueDetails.createCriteria().list(params){
			eq("instituite",inst)
			if(params.staff)
				isNotNull("staffId")
			else
				isNotNull("studentId")

			isNotNull("newspaper")
		}
	}
	
	public static def  getactiveMap(params){
		
		if(params.paginateTo){
			def activemap = [:]
			activemap.put(params.paginateTo, 'active')
			return activemap
		}else{
			return ["books":'active']
		}
		
	}
}