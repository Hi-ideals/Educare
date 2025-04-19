package com.hiideals.instituite.timetable

import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.classcourses.Section

import grails.transaction.Transactional

@Transactional
class TimeTableService {
	
    def autoGenPeriods(){
		(1..8).each {
			String periodname = "P"+it
			Period_Timings.findByPeriodName(periodname) ?:(new Period_Timings(periodName:periodname, from_H:0, from_M:0, to_H:0, to_M:0)).save(flush:true,failOnError:true)
		}
		
	}
	
	def getClsTTL(int iclassId, int sectionId){
		def iclass = IClass.get(iclassId)
		def section = Section.get(sectionId)
		return ClassTimeTable.findAllByClassnameAndSection(iclass,section)
	}
	
	def resetTimeTable(int iclassId, int sectionId){
		def classTimeTable = getClsTTL(iclassId,sectionId);//ClassTimeTable.findAllByClassnameAndSection(iclass,section)
		
		if(classTimeTable?.size()>0){
			try{
				classTimeTable.each {
					it.delete(flush:true)
				}
				}catch(Exception e){
					e.printStackTrace()
				}
		}
	}
}
