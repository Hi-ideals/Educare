package com.hiideals.instituite.timetable

import com.hiideals.enums.WeekdaysEnum
import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.classcourses.Section
import com.hiideals.institute.staff.Staff

import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional

@Secured(["ROLE_ADMIN","ROLE_USERR"])
class TimetableDisplayController {

	def userService
	def timeTableService

	def timeTableDate() {
		def inst = userService.getCurrentInstituite()
		[iclassList:IClass.findAllByInstituite(inst)]
	}


	@Transactional
	def timeTableDetails() {

		def timeTableSchedule = TimeTable.findAllByDateOfTimeTableAndInstitute(params.date,userService.getCurrentInstituite())

		def hashset = (timeTableSchedule.periodName as Set)

		def mapp=[:]
		def arrlist=[]

		(timeTableSchedule).each {

			def classes=it.classname.classname
			def sectioon=it.section.sectionName
			def subjectsDetails=it.subject?.subjectName
			def staffDetails=it.staff?.staffName
			def period = it?.periodName

			String key = (classes+" : "+sectioon )
			String value = (subjectsDetails+" : "+staffDetails)

			if(mapp.keySet().contains(key)){
				def getvalueMap = [:]
				getvalueMap = mapp.getAt(key)
				getvalueMap.put(period, value)
				mapp.put(key,getvalueMap)
			}else{
				def mm = [:]
				mm.put(period, value)
				mapp.put(key, mm)
			}
		}
		[timeTableSchedule:timeTableSchedule,mapp:mapp,hashset:hashset]
	}


	def showTimeTable(){
		def iclass = IClass.get(params.int('cid'))

		def section = Section.get(params.int('sid'))

		def classTimeTable = ClassTimeTable.findAllByClassnameAndSection(iclass,section)

		ClassTimeTable single = null
		if(classTimeTable){
			single = (classTimeTable[0])
		}
		def className = single?.classname
		def sectionName = single?.section
		int lunchAfterPeriod =  single?.lunchAfterPeriod ?: 0
		int numberofColumns = single?.timetables?.size()  ?: 0


		[classTimeTable:classTimeTable,single:single,noOfColumnsCount:numberofColumns,params:params]
	}


	def staffTimeTable(){
		def inst = userService.getCurrentInstituite()
		def staffList = Staff.findAllByInstitute(inst)

		[staffList:staffList]
	}

	def shTT={
		def staff = Staff.get(params.int('staffId'))

		def aa = TimeTable.createCriteria().list(){ eq("staff",staff) }

		def weekdaysMap = [:]// as TreeMap

		aa.each{
			it

			String weekday = it?.classTimeTable.availableFor

			WeekdaysEnum wde = WeekdaysEnum.valueOf(weekday)

			if(weekdaysMap.keySet().contains(wde.getCode())){
				def periodsMap = weekdaysMap.get(wde.getCode())
				periodsMap.put(it.periodName, it)
				weekdaysMap.put(wde.getCode(), periodsMap)
			}else{
				def periodsMap = [:] as TreeMap
				periodsMap.put(it.periodName, it)
				weekdaysMap.put(wde.getCode(), periodsMap)
			}

		}

		render(template:'shTT',model:[weekdaysMap:(weekdaysMap as TreeMap),params:params])
	}

	def deleteTime(){

		timeTableService.resetTimeTable(params.int('cid'), params.int('sid'))
		
		redirect(uri:'/CreateTimeTable')
		
	}

	def checkStaffPeriod={
		def iclass = IClass.get(params.int('iclass')) 
		
		def section = Section.get(params.int('section'))
		
		String dd = params.weekday
		String period = params.periodName
		
		def staff = Staff.get(params.int('staff'))
		
		def vvv= ClassTimeTable.createCriteria().list(){
			eq("availableFor",dd)
			
			timetables {
				eq("periodName",period)
				eq("staff",staff)
			}
		}
		if(vvv?.size()>0)
		render template:'scrp'//text:"""<script>err()</script>""", contentType: 'text/javascript'
	}



	def showTimeTablePrint(){
		def inst = userService.getCurrentInstituite()
		def iclass = IClass.get(params.int('cid'))
		
				def section = Section.get(params.int('sid'))
		
				def classTimeTable = ClassTimeTable.findAllByClassnameAndSection(iclass,section)
		
				ClassTimeTable single = null
				if(classTimeTable){
					single = (classTimeTable[0])
				}
				def className = single?.classname
				def sectionName = single?.section
				int lunchAfterPeriod =  single?.lunchAfterPeriod ?: 0
				int numberofColumns = single?.timetables?.size()  ?: 0
		
		
				[iclass:iclass,section:section,classTimeTable:classTimeTable,single:single,noOfColumnsCount:numberofColumns,instituite:inst]
		
	}
	def staffTimeTablePrint(){
		def inst = userService.getCurrentInstituite()
		def staff = Staff.get(params.int('staffId'))
		
				def aa = TimeTable.createCriteria().list(){ eq("staff",staff) }
		
				def weekdaysMap = [:]// as TreeMap
		
				aa.each{
					it
		
					String weekday = it?.classTimeTable.availableFor
		
					WeekdaysEnum wde = WeekdaysEnum.valueOf(weekday)
		
					if(weekdaysMap.keySet().contains(wde.getCode())){
						def periodsMap = weekdaysMap.get(wde.getCode())
						periodsMap.put(it.periodName, it)
						weekdaysMap.put(wde.getCode(), periodsMap)
					}else{
						def periodsMap = [:] as TreeMap
						periodsMap.put(it.periodName, it)
						weekdaysMap.put(wde.getCode(), periodsMap)
					}
		
				}
		
				[weekdaysMap:(weekdaysMap as TreeMap),instituite:inst,staff:staff]
	}

}
