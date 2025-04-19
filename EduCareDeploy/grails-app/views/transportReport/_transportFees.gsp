<div class="portlet box blue">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-user"></i>Lists of Transport Fees	
		</div>
	</div>
<div class="portlet-body">
							<div class="table-scrollable">
							<g:if test="${params?.type == "student"}">
							<table class="table  table-hover">
									<thead>


										<tr style="color: #337ab7;">
											<th>Transport</th>
											<th>Payment Id</th>
											<th>Payment Date</th>
											<th>Paid Amount</th>
											<th>Remaining Amount</th>
											<th>Student</th>
											<th>Class</th>
											<th>Section</th>
										</tr>
									</thead>
									<tbody>
										<%@ page import="com.hiideals.instituite.classcourses.IClass"%>
										<%@ page import="com.hiideals.instituite.EDcoding.LookUpED"%>
										<g:each in="${transportFeeInstanceList}" status="i"
											var="transportFeeInstance">
											<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

												<td>
														${transportFeeInstance.transport.destination.fromPlace } to
													${transportFeeInstance.transport.destination.toPlace }
													</td>

												<td>
													${fieldValue(bean: transportFeeInstance, field: "paymentId")}
												</td>

												<td><g:formatDate
														date="${transportFeeInstance.paymentDate}" type="date"
														style="SHORT" /></td>

												<td>
													${fieldValue(bean: transportFeeInstance, field: "paidAmount")}
												</td>

												<td>
													${fieldValue(bean: transportFeeInstance, field: "remainingAmount")}
												</td>
												<td>
													${fieldValue(bean: transportFeeInstance, field: "student.studentName")}
												</td>
												
												<g:if test="${transportFeeInstance?.student}">
												<td>
													${transportFeeInstance?.student?.academicyear[0]?.presentclass.classname}
												</td>
												<td>
													${transportFeeInstance?.student?.academicyear[0]?.section?.sectionName}
												</td>
												</g:if>
												<g:else>
												<td>
												</td>
												<td>
												</td>
												</g:else>
												
											</tr>
										</g:each>
									</tbody>
								</table>
							</g:if>
							<g:elseif test="${params?.type == "staff"}">
							<table class="table  table-hover">
									<thead>


										<tr style="color: #337ab7;">
											<th>Transport</th>
											<th>Payment Id</th>
											<th>Payment Date</th>
											<th>Paid Amount</th>
											<th>Remaining Amount</th>
											<th>Staff</th>
										</tr>
									</thead>
									<tbody>
										<%@ page import="com.hiideals.instituite.classcourses.IClass"%>
										<%@ page import="com.hiideals.instituite.EDcoding.LookUpED"%>
										<g:each in="${transportFeeInstanceList}" status="i"
											var="transportFeeInstance">
											<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

												<td>
														${transportFeeInstance.transport.destination.fromPlace } to
													${transportFeeInstance.transport.destination.toPlace }
													</td>

												<td>
													${fieldValue(bean: transportFeeInstance, field: "paymentId")}
												</td>

												<td><g:formatDate
														date="${transportFeeInstance.paymentDate}" type="date"
														style="SHORT" /></td>

												<td>
													${fieldValue(bean: transportFeeInstance, field: "paidAmount")}
												</td>

												<td>
													${fieldValue(bean: transportFeeInstance, field: "remainingAmount")}
												</td>
												<td>
													${fieldValue(bean: transportFeeInstance, field: "employee.staffName")}
												</td>
											</tr>
										</g:each>
									</tbody>
								</table>
							</g:elseif>
								
							</div>
						</div>
					</div>
					</div>
					<div style="position:absolute; right:48%">
<g:link class="btn-u sm-margin-bottom-10 btn blue" controller="transportReport" action="transportFeedetailsPrint" target='_blank' params="[type:params.type,name:params.Name,academicyear:params.academicyear]">Get Print</g:link>
</div>