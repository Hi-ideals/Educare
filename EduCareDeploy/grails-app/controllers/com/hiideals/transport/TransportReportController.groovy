package com.hiideals.transport

import grails.plugin.springsecurity.annotation.Secured;
import com.hiideals.instituite.helper.Batch

@Secured(["ROLE_ADMIN","ROLE_USERR"])
class TransportReportController {
def batchService
	def userService

	def index() {
	def batchList = batchService.getListofBatches(params)
		[batchList:batchList]
	}

	def availableVehicles(){

		def inst = userService.getCurrentInstituite()
		if(params.vehicle.id == "all"){
			def vehicleList = VehicleDetails.findAllByInstitute(inst)
			render(template:'transportVehicles',model:[vehicleDetailsInstanceList:vehicleList])
		}else{
			def vehicleList = VehicleDetails.findAllByInstituteAndVehicleNo(inst,params.vehicle.id)
			render(template:'transportVehicles',model:[vehicleDetailsInstanceList:vehicleList,params:params])
		}
	}

	def availableVehiclesPrint(){

		def inst = userService.getCurrentInstituite()
		if(params.vehicleNo == "all"){
			def vehicleList = VehicleDetails.findAllByInstitute(inst)
			[vehicleDetailsInstanceList:vehicleList,instituite:inst]
		}else{
			def vehicleList = VehicleDetails.findAllByInstituteAndVehicleNo(inst,params.vehicleNo)
			[vehicleDetailsInstanceList:vehicleList,instituite:inst]
		}
	}

	def availableDrivers(){

		def inst = userService.getCurrentInstituite()
		if(params.driver.id == "all"){
			def driverList = DriverDetails.findAllByInstitute(inst)
			render(template:'transportDriver',model:[driverDetailsInstanceList:driverList])
		}else{
			def driverList = DriverDetails.findAllByInstituteAndName(inst,params.driver.id)
			render(template:'transportDriver',model:[driverDetailsInstanceList:driverList,params:params])
		}
	}

	def availableDriversPrint(){

		def inst = userService.getCurrentInstituite()
		if(params.driverName == "all"){
			def driverList = DriverDetails.findAllByInstitute(inst)
			[driverDetailsInstanceList:driverList,instituite:inst]
		}else{
			def driverList = DriverDetails.findAllByInstituteAndName(inst,params.driverName)
			[driverDetailsInstanceList:driverList,instituite:inst]
		}
	}

	def availableRoutes(){
		def inst = userService.getCurrentInstituite()
		if(params.route.id == "all"){
			def routeList = RouteDetails.findAllByInstitute(inst)
			render(template:'transportRoute',model:[routeDetailsInstanceList:routeList])
		}else{
			def routeList = RouteDetails.findAllByInstituteAndRouteCode(inst,params.route.id)
			render(template:'transportRoute',model:[routeDetailsInstanceList:routeList,params:params])
		}
	}

	def availableRoutesPrint(){

		def inst = userService.getCurrentInstituite()
		if(params.routeNo == "all"){
			def routeList = RouteDetails.findAllByInstitute(inst)
			[routeDetailsInstanceList:routeList,instituite:inst]
		}else{
			def routeList = RouteDetails.findAllByInstituteAndRouteCode(inst,params.routeNo)
			[routeDetailsInstanceList:routeList,instituite:inst]
		}
	}

	def transportAllocation(){
		def inst = userService.getCurrentInstituite()
		def routeno = RouteDetails.findByRouteCode(params.route.id)
		if(params.type == "all" && params.route.id == "all"){
			def transportList = Transport.findAllByInstitute(inst)
			render(template:'tAllocation',model:[transportInstanceList:transportList,params:params])
		}else if(params.type == "Students" && params.route.id == "all"){
			def transportList = Transport.findAllByInstituteAndType(inst,"Student")
			render(template:'tAllocation',model:[transportInstanceList:transportList,params:params])
		}else if(params.type == "Staff" && params.route.id == "all"){
			def transportList = Transport.findAllByInstituteAndType(inst,"Employee")
			render(template:'tAllocation',model:[transportInstanceList:transportList,params:params])
		}else if(params.type == "Students" && params.route.id != "all"){
			def transportList = Transport.findAllByInstituteAndTypeAndRoute(inst,"Student",routeno)
			render(template:'tAllocation',model:[transportInstanceList:transportList,params:params])
		}else if(params.type == "Staff" && params.route.id != "all"){
			def transportList = Transport.findAllByInstituteAndTypeAndRoute(inst,"Employee",routeno)
			render(template:'tAllocation',model:[transportInstanceList:transportList,params:params])
		}
	}
	
	def tAllocationPrint(){
		
		def inst = userService.getCurrentInstituite()
		def routeno = RouteDetails.findByRouteCode(params.routeNo)
		if(params.type == "all" && params.routeNo == "all"){
			def transportList = Transport.findAllByInstitute(inst)
			[transportInstanceList:transportList,instituite:inst]
		}else if(params.type == "Students" && params.routeNo == "all"){
			def transportList = Transport.findAllByInstituteAndType(inst,"Student")
			[transportInstanceList:transportList,instituite:inst]
		}else if(params.type == "Staff" && params.routeNo == "all"){
			def transportList = Transport.findAllByInstituteAndType(inst,"Employee")
			[transportInstanceList:transportList,instituite:inst]
		}else if(params.type == "Students" && params.routeNo != "all"){
			def transportList = Transport.findAllByInstituteAndTypeAndRoute(inst,"Student",routeno)
			[transportInstanceList:transportList,instituite:inst]
		}else if(params.type == "Staff" && params.routeNo != "all"){
			def transportList = Transport.findAllByInstituteAndTypeAndRoute(inst,"Employee",routeno)
			[transportInstanceList:transportList,instituite:inst]
		}
		
	}
	
	def transportFeedetails(){
		def inst = userService.getCurrentInstituite()
		def academic=Batch.findById(params?.academicyear)
		//def transportfeeList = TransportFee.findAllByInstitute(inst)
		if(params.type == "student"){
			println("student..   :")
			def results=TransportFee.createCriteria().list
				{
				eq('acdemicyear',academic)
					eq('institute',userService.getCurrentInstituite())
					student{
						ilike("studentName","%"+params.Name+"%")
					}
				}
			render(template:'transportFees',model:[transportFeeInstanceList:results,params:params,instituite:inst])
		}else{
		println("Staff..   :")
		def results=TransportFee.createCriteria().list
		{
		eq('acdemicyear',academic)
			eq('institute',userService.getCurrentInstituite())
			employee{
				ilike("staffName","%"+params.Name+"%")
			}
		}
		render(template:'transportFees',model:[transportFeeInstanceList:results,params:params,instituite:inst])
		}
			
	}
	
	def transportFeedetailsPrint(){
		
		def inst = userService.getCurrentInstituite()
		def academic=Batch.findById(params?.academicyear)
		if(params.type == "student"){
			def results=TransportFee.createCriteria().list
				{
				eq('acdemicyear',academic)
					eq('institute',userService.getCurrentInstituite())
					student{
						ilike("studentName","%"+params.name+"%")
					}
				}
			[transportFeeInstanceList:results,params:params,instituite:inst]
		}else{
		def results=TransportFee.createCriteria().list
		{
		eq('acdemicyear',academic)
			eq('institute',userService.getCurrentInstituite())
			employee{
				ilike("staffName","%"+params.name+"%")
			}
		}
		[transportFeeInstanceList:results,params:params,instituite:inst]
		}
			
	}
}

