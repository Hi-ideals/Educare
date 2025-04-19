<%@ page import="com.hiideals.instituite.EDcoding.LookUpED"%>
<div class="portlet box grey">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-rupee"></i> List of Student Not Paid Fees
		</div>
	</div>
	<div class="portlet-body">
		<div class="table-scrollable">

			<table class="table table-bordered table-hover">
				<thead>
					<tr>

						<th>Registration No.</th>

						<th><g:message code="fee.studentId.label"
								default="Student Name" /></th>
                        <th>Father Name</th>
						<th>Class Name</th>
						
						<th>Academic year</th>
						<th id="printPageButton">Options</th>
					</tr>
				</thead>
				<tbody>
					<g:each in="${ss}" var="st" status="i">
						<tr>
							<td>
								${st?.registrationNo}
							</td>
							<td>
								${st?.studentName}
							</td>
							<td>
								${st?.fatherDetails?.parentName}
							</td>
							<td><g:each in="${st?.academicyear}">
									<g:if test="${it.status == 'current'}">
									</g:if>
								</g:each> <g:set value="${it?.presentclass}" var="pclass"></g:set> ${pclass.classname }
							</td>
							<td><g:each in="${st?.academicyear}">
									<g:if test="${it.status == 'current'}">
									</g:if>
								</g:each> <g:set value="${it}" var="pclass"></g:set> ${pclass.academicyear}
							</td>
							<td><g:link controller="fee" action="create"
									id="${LookUpED.encod(st?.id) }" class="btn yellow">
														Collect Fees
															</g:link></td>
						</tr>
					</g:each>
				</tbody>
			</table>
		</div>
		<div style="text-align: center;">
			<ul class="pagination">
				<li><g:paginate total="${feeInstanceCount ?: 0}"
						params="${params}" /></li>
			</ul>
		</div>

	</div>
</div>