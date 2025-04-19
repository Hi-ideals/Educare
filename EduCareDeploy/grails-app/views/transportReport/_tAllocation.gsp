<div class="portlet box blue">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-user"></i>Lists of Transport
		</div>
	</div>
	<div class="portlet-body">
		<div class="table-scrollable">
		<g:if test="${params.type == "all" && params.route.id == "all"}">
		<table class="table  table-hover">
				<thead>
					<tr style="color: #337ab7;">
						<th>Route</th>
						<th>Destination</th>
						<th>Type</th>
						<th>Start Dat</th>
						<th>End Date</th>
						<th>Student</th>
						<th>Staff</th>
					</tr>
				</thead>
				<tbody>
					<g:each in="${transportInstanceList}" status="i"
						var="transportInstance">
						<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

							<td>
								${fieldValue(bean: transportInstance, field: "route.routeCode")}
							</td>

							<td>
								${transportInstance?.destination?.fromPlace } to ${transportInstance?.destination?.toPlace}
							</td>

							<td>
								${fieldValue(bean: transportInstance, field: "type")}
							</td>

							<td><g:formatDate format="MM-dd-yyyy"
									date="${transportInstance.startDate}" /></td>


							<td><g:formatDate format="MM-dd-yyyy"
									date="${transportInstance.endDate}" /></td>

							<td>
								${fieldValue(bean: transportInstance, field: "student.studentName")}
							</td>
							<td>
								${fieldValue(bean: transportInstance, field: "employee.staffName")}
							</td>
						</tr>
					</g:each>
				</tbody>
			</table>
		</g:if>
		<g:elseif test="${(params.type == "Students" && params.route.id == "all")
		            ||(params.type == "Students" && params.route.id != "all")}">
		
		<table class="table  table-hover">
				<thead>
					<tr style="color: #337ab7;">
						<th>Route</th>
						<th>Destination</th>
						<th>Start Dat</th>
						<th>End Date</th>
						<th>Student Name</th>
					</tr>
				</thead>
				<tbody>
					<g:each in="${transportInstanceList}" status="i"
						var="transportInstance">
						<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

							<td>
								${fieldValue(bean: transportInstance, field: "route.routeCode")}
							</td>

							<td>
								${transportInstance?.destination?.fromPlace } to ${transportInstance?.destination?.toPlace}
							</td>

							<td><g:formatDate format="MM-dd-yyyy"
									date="${transportInstance.startDate}" /></td>


							<td><g:formatDate format="MM-dd-yyyy"
									date="${transportInstance.endDate}" /></td>

							<td>
								${fieldValue(bean: transportInstance, field: "student.studentName")}
							</td>

						</tr>
					</g:each>
				</tbody>
			</table>
		</g:elseif>
		<g:elseif test="${(params.type == "Staff" && params.route.id == "all")
		            ||(params.type == "Staff" && params.route.id != "all") }">
		           	<table class="table  table-hover">
				<thead>
					<tr style="color: #337ab7;">
						<th>Route</th>
						<th>Destination</th>
						<th>Start Dat</th>
						<th>End Date</th>
						<th>Staff Name</th>
					</tr>
				</thead>
				<tbody>
					<g:each in="${transportInstanceList}" status="i"
						var="transportInstance">
						<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

							<td>
								${fieldValue(bean: transportInstance, field: "route.routeCode")}
							</td>

							<td>
								${transportInstance?.destination?.fromPlace } to ${transportInstance?.destination?.toPlace}
							</td>

							<td><g:formatDate format="MM-dd-yyyy"
									date="${transportInstance.startDate}" /></td>


							<td><g:formatDate format="MM-dd-yyyy"
									date="${transportInstance.endDate}" /></td>

							<td>
								${fieldValue(bean: transportInstance, field: "employee.staffName")}
							</td>

						</tr>
					</g:each>
				</tbody>
			</table> 
		   </g:elseif>
		</div>
	</div>
</div>
<div style="position: absolute; right: 48%">
	<g:link class="btn-u sm-margin-bottom-10 btn blue"
		controller="transportReport" action="tAllocationPrint"
		target='_blank' params="[routeNo:params.route.id,type:params.type]">Get Print</g:link>
</div>