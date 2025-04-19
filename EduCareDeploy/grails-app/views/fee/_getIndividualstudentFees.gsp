<%@ page import="com.hiideals.instituite.EDcoding.LookUpED"%>
<%@ page import="com.hiideals.instituite.helper.AcademicYear"%>
<div class="portlet box blue">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-rupee"></i>Student Fees Details
		</div>
	</div>
	<div class="portlet-body">
		<div class="table-responsive">
			<table class="table table-striped table-hover">
				<thead>
					<tr>
						<th>Registration number</th>
						<th>Name</th>
						<th>Father Name</th>
						<th>Academic Year</th>
						<th>Class</th>
						<th>Section</th>
						<th>Total Fee</th>
						<th>Fees paid</th>
						<th>Due</th>
						<th>collect</th>
					</tr>
				</thead>
				<tbody>
					<g:each in="${list1}" var="ss">
						<tr>
							<td>
								${ss?.studentId?.registrationNo}
								
							</td>
							<td>
								${ss?.studentId?.studentName}
							</td>
							<td>
								${ss?.studentId?.fatherDetails?.parentName}
							</td>
							<td>
								${ss?.academic?.academicyear}
							</td>

							<g:set var="iclass"
								value="${AcademicYear.findById(ss?.academic?.id)}" />

							<td>
								${iclass?.presentclass?.classname}
							</td>
							<td>
								${iclass?.section?.sectionName}
							</td>
							
							<td>
								${ss?.totalFee}
							</td>
							<td>
								${ss?.totalPaid}
							</td>
							<td>
								${ss?.due}
							</td>
							<td><g:if test="${ss?.due==0}">
			---
			</g:if> <g:else>
									<g:link controller="fee" action="edit"
										id="${LookUpED.encod(ss?.id)}" class="btn yellow">Collect Fees</g:link>
								</g:else></td>

						</tr>
					</g:each>
				</tbody>
				<g:if test="${ss?.due==0}">
					<h3>
						<font face="verdana" color="green">This student has paid
							full fees.</font>
					</h3>
				</g:if>
				<g:else></g:else>

			</table>
		</div>

	</div>
</div>
<div id="showfee" style="display: none">
	<div class="">
		<div class="portlet box grey">
			<div class="portlet-title">
				<div class="caption">
					<i class="fa fa-rupee"></i>Fees Paid
				</div>
				<div class="tools" id="bye1">

					<g:link controller="fee" action="edit" style="color:#fff"
						id="${LookUpED.encod(feeInstance?.id) }" title="">
						<i class="fa fa-pencil"></i> Edit Fees</g:link>
					<a onclick="$('#showfee').hide(500)" style="color: #fff"> <i
						class="fa fa-close"></i> Close
					</a>
				</div>
			</div>
		</div>
	</div>
</div>
