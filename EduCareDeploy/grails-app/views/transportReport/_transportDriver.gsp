<div class="portlet box blue">
						<div class="portlet-title">
							<div class="caption">
								<i class="fa fa-user"></i>Lists of Drivers
							</div>
						</div>
						<div class="portlet-body">
							<div class="table-scrollable">
							<table class="table  table-hover">
									<thead>
										<tr style="color: #337ab7;">
											<th>Vehicle</th>
											<th>Name</th>
											<th>Address</th>
											<th>Dob</th>
											<th>Phone</th>
										</tr>
									</thead>
									<tbody>
										<g:each in="${driverDetailsInstanceList}" status="i"
											var="driverDetailsInstance">
											<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

												<td>
														${fieldValue(bean: driverDetailsInstance, field: "vehicle.vehicleNo")}
													</td>

												<td>
													${fieldValue(bean: driverDetailsInstance, field: "name")}
												</td>

												<td>
													${driverDetailsInstance?.presentAddress?.hsno } ${driverDetailsInstance?.presentAddress?.street }
													${driverDetailsInstance?.presentAddress?.city } ${driverDetailsInstance?.presentAddress?.state }
												</td>

												<td><g:formatDate format="MMM-dd-yyyy"
														date="${driverDetailsInstance.dob}" /></td>

												<td>
													${fieldValue(bean: driverDetailsInstance, field: "phone")}
												</td>
											</tr>
										</g:each>
									</tbody>
								</table>	
							</div>
						</div>
					</div>
					<div style="position:absolute; right:48%">
<g:link class="btn-u sm-margin-bottom-10 btn blue" controller="transportReport" action="availableDriversPrint" target='_blank' params="[driverName:params.driver.id]">Get Print</g:link>
</div>