<div class="portlet box blue">
						<div class="portlet-title">
							<div class="caption">
								<i class="fa fa-user"></i>Lists of Vehicles
							</div>
						</div>
						<div class="portlet-body">
							<div class="table-scrollable">
								<table class="table  table-hover">
									<thead>

										<tr style="color: #337ab7;">
											<th>Vehicle No</th>
											<th>No Of Seats</th>
											<th>Maxium Allowed</th>
											<th>Vehicle Type</th>
											<th>Contact Person</th>
											<th>Insurance Renewal Date</th>
										</tr>

									</thead>
									<tbody>
										<g:each in="${vehicleDetailsInstanceList}" status="i"
											var="vehicleDetailsInstance">
											<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

												<td>
														${fieldValue(bean: vehicleDetailsInstance, field: "vehicleNo")}
												</td>

												<td>
													${fieldValue(bean: vehicleDetailsInstance, field: "noOfSeats")}
												</td>

												<td>
													${fieldValue(bean: vehicleDetailsInstance, field: "maxiumAllowed")}
												</td>

												<td>
													${fieldValue(bean: vehicleDetailsInstance, field: "vehicleType")}
												</td>

												<td>
													${fieldValue(bean: vehicleDetailsInstance, field: "contactPerson")}
												</td>

												<td>
												
												<g:formatDate format="MMM-dd-yyyy"
									date="${vehicleDetailsInstance.insuranceRenewalDate}" />
													
												</td>
											</tr>
										</g:each>
									</tbody>
								</table>
							</div>
						</div>
					</div>
					<div style="position:absolute; right:48%">
<g:link class="btn-u sm-margin-bottom-10 btn blue" controller="transportReport" action="availableVehiclesPrint" target='_blank' params="[vehicleNo:params.vehicle.id]">Get Print</g:link>
</div>