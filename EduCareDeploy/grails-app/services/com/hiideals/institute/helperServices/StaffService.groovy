package com.hiideals.institute.helperServices

import grails.transaction.Transactional

import java.text.DateFormat
import java.text.SimpleDateFormat

import com.hiideals.attendanceManagement.StaffAttendance
import com.hiideals.instituite.main.Instituite;
import com.hiideals.institute.staff.Staff

/**
 * @author Baswa Prasad
 *
 * 06-Dec-2016
 */
@Transactional
class StaffService {

	def userService

	/**
	 * @param params
	 * @return
	 */
	def getAllStaffs(params){
		return Staff.createCriteria().list(){
			eq ('institute.id', userService?.getCurrentInstituite()?.id)
		}
	}


	def getStaffAttendance(params){
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");//yyyy-MM-dd");
		df.setLenient(false);
		def from = new java.sql.Timestamp(df.parse(params.fromDate).getTime())
		def to
		if(params.toDate)
		{
			 to = new java.sql.Timestamp(df.parse(params.toDate).getTime())
		}
		return StaffAttendance.createCriteria().list {
			if(params.staffID!="All staff"){
				eq('staffName',Staff.findById(params.int('staffID')))
			}
			if(!params.toDate)
			{
				between("attendanceDate",from,from)
			}else{
				between("attendanceDate",from,to)
			}
		}
	}

}
