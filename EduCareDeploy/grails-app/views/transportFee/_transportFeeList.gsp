<div class="portlet box grey">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-rupee"></i>Lists of TransportFee
		</div>
	</div>
	<div class="portlet-body">
		<div class="table-responsive">
			<table class="table table-bordered table-hover">
				<thead>
					<tr>
						<th>Transport</th>
						<th>Payment Id</th>
						<th>Payment Date</th>
						<th>Paid Amt</th>
						<th>Remaining Amt</th>
						<th>Total Paid till date</th>
						<th>Student</th>
						<th>Academic Year</th>
						<th>Staff</th>
						<th>Class</th>
						<th>Section</th>
						<th>Action</th>
						<th>Print</th>
					</tr>
				</thead>
				<tbody>
					<%@ page import="com.hiideals.instituite.classcourses.IClass"%>
					<%@ page import="com.hiideals.instituite.EDcoding.LookUpED"%>
					<g:each in="${transportFeeInstanceList}" status="i"
						var="transportFeeInstance">
						<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

							<td><strong style="color: green"> ${transportFeeInstance.transport.destination.fromPlace }
							</strong> to <strong style="color: green"> ${transportFeeInstance.transport.destination.toPlace }</strong>
							</td>

							<td>
								${fieldValue(bean: transportFeeInstance, field: "paymentId")}
							</td>

							<td><g:formatDate date="${transportFeeInstance.paymentDate}"
									type="date" style="SHORT" /></td>

							<td>Rs. ${fieldValue(bean: transportFeeInstance, field: "payingAmount")}
							</td>

							<td>Rs. ${fieldValue(bean: transportFeeInstance, field: "remainingAmount")}
							</td>

							<td>Rs. ${fieldValue(bean: transportFeeInstance, field: "paidAmount")}
							</td>
							<td>
								${fieldValue(bean: transportFeeInstance, field: "student.studentName")}
							</td>
							<td>
								${fieldValue(bean: transportFeeInstance?.acdemicyear, field: "batchName")}
							</td>
							<td>
								${fieldValue(bean: transportFeeInstance, field: "employee.staffName")}
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
								<td></td>
								<td></td>
							</g:else>
							<td><g:form
									url="[resource:transportFeeInstance, action:'delete']"
									method="DELETE">
									<fieldset class="buttons">
										<g:link action="edit"
											id="${LookUpED.encod(transportFeeInstance.id)}">
											<i class="fa fa-pencil"> </i>
											<g:message code="default.button.edit.label" default="Edit" />
										</g:link>
										<%--<g:actionSubmit
																style="background:none;border:none;color:red"
																action="delete"
																value="${message(code: 'default.button.delete.label', default: 'Delete')}"
																onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
														--%>
									</fieldset>
								</g:form></td>
							<td><g:link controller="transportFee" action="transportBill"
									id="${transportFeeInstance.id}" target='_blank'>
									<i class="fa fa-print"></i>
								</g:link></td>
						</tr>
					</g:each>
				</tbody>
			</table>
		</div>
	</div>
</div>
</div>
<%--<div class="portlet box blue">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-user"></i>Lists of TransportFee	
		</div>
	</div>
<div class="portlet-body">
							<div class="table-scrollable">
								<table class="table  table-hover">
									<thead>


										<tr style="color: #337ab7;">
											<th>Transport</th>
											<th>Payment Id</th>
											<th>Payment Date</th>
											<th>Paid Amt</th>
											<th>Remaining Amt</th>
											<th>Total Paid till date</th>
											<th>Student</th>
											<th>Staff</th>
											<th>Class</th>
											<th>Section</th>
											<th>Action</th>
											<th>Print</th>
										</tr>
									</thead>
									<tbody>
										<%@ page import="com.hiideals.instituite.classcourses.IClass"%>
										<%@ page import="com.hiideals.instituite.EDcoding.LookUpED"%>
										<g:each in="${transportFeeInstanceList}" status="i"
											var="transportFeeInstance">
											<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

												<td>
													<strong style="color: green">  ${transportFeeInstance.transport.destination.fromPlace }  </strong> to
													<strong style="color: green"> ${transportFeeInstance.transport.destination.toPlace }</strong>
													</td>

												<td>
													${fieldValue(bean: transportFeeInstance, field: "paymentId")}
												</td>

												<td><g:formatDate
														date="${transportFeeInstance.paymentDate}" type="date"
														style="SHORT" /></td>

												<td>
													Rs. ${fieldValue(bean: transportFeeInstance, field: "payingAmount")}
												</td>

												<td>
												  Rs. ${fieldValue(bean: transportFeeInstance, field: "remainingAmount")}
												</td>
												
												<td>
													Rs. ${fieldValue(bean: transportFeeInstance, field: "paidAmount")}
												</td>
												<td>
													${fieldValue(bean: transportFeeInstance, field: "student.studentName")}
												</td>
												<td>
													${fieldValue(bean: transportFeeInstance, field: "employee.staffName")}
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
												<td><g:form
														url="[resource:transportFeeInstance, action:'delete']"
														method="DELETE">
														<fieldset class="buttons">
															<g:link action="edit"
																id="${LookUpED.encod(transportFeeInstance.id)}">
																<i class="fa fa-pencil"> </i>
																<g:message code="default.button.edit.label"
																	default="Edit" />
															</g:link>
															<g:actionSubmit
																style="background:none;border:none;color:red"
																action="delete"
																value="${message(code: 'default.button.delete.label', default: 'Delete')}"
																onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
														</fieldset>
													</g:form></td>
													<td><g:link controller="transportFee" action="transportBill" id="${transportFeeInstance.id}" target='_blank'><i class="fa fa-print"></i></g:link></td>
											</tr>
										</g:each>
									</tbody>
								</table>
							</div>
						</div>
					</div>
					</div>--%>