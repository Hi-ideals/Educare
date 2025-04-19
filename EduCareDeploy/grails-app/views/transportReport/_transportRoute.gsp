<div class="portlet box blue">
						<div class="portlet-title">
							<div class="caption">
								<i class="fa fa-user"></i>Lists of Routes
							</div>
						</div>
						<div class="portlet-body">
							<div class="table-scrollable">
							<table class="table  table-hover">
									<thead>

										<tr style="color: #337ab7;">
											<th>Vehicle</th>
											<th>Route Code</th>
											<th>Start Place</th>
											<th>Stop Place</th>
										</tr>
									</thead>
									<tbody>
										<g:each in="${routeDetailsInstanceList}" status="i"
											var="routeDetailsInstance">
											<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

												<td>
														${fieldValue(bean: routeDetailsInstance, field: "vehicle.vehicleNo")}
												</td>

												<td>
													${fieldValue(bean: routeDetailsInstance, field: "routeCode")}
												</td>

												<td>
													${fieldValue(bean: routeDetailsInstance, field: "startPlace")}
												</td>

												<td>
													${fieldValue(bean: routeDetailsInstance, field: "stopPlace")}
												</td>
											</tr>
										</g:each>
									</tbody>
								</table>	
							</div>
						</div>
					</div>
					<div style="position:absolute; right:48%">
<g:link class="btn-u sm-margin-bottom-10 btn blue" controller="transportReport" action="availableRoutesPrint" target='_blank' params="[routeNo:params.route.id]">Get Print</g:link>
</div>