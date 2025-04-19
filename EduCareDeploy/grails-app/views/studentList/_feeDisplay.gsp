<%@ page import="com.hiideals.instituite.EDcoding.LookUpED"%>
<%@page import="com.hiideals.utils.APPConsumer"%>

<div class="portlet box grey">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-user"></i>Student Details
		</div>
	</div>
	<div class="portlet-body">
		<table class="table table-striped table-hover">
			<tr>
				<td width="15%">Name</td>
				<th>
					${student.studentName }
				</th>
				<td width="15%">Father</td>
				<th>
					${student.fatherDetails?.parentName }
				</th>
			</tr>
			<tr>
				<td>Class</td>
				<th><g:each in="${student?.academicyear}">
						<g:if test="${it.status == 'current'}">
						</g:if>
					</g:each> <g:set value="${it?.presentclass}" var="pclass"></g:set> ${pclass.classname }


				</th>
				<td>Date Of Joined</td>
				<th><g:formatDate format="dd-MMM-yyyy"
						date="${student.studentDOJ}" /></th>
			</tr>
			<tr>
				<td>Section</td>
				<th><g:each in="${student?.academicyear}">
						<g:if test="${it.status == 'current'}">
						</g:if>
					</g:each> <g:set value="${it?.section}" var="pclass"></g:set> ${pclass.sectionName }
				</th>
				<td>Academic year</td>
				<th>
					${student?.academicyear?.academicyear.toString().replace('[', '').replace(']', '')}
				</th>

			</tr>


			<tr>
				<td colspan="3"><g:link controller="student" action="show"
						id="${LookUpED.encod(student?.id) }" class="btn blue">View Profile</g:link>
					<button class="btn green" onclick="$('#showfee').show(500)">View
						Fees Paid</button> <g:link controller="fee" action="edit"
						style="color:#fff" id="${LookUpED.encod(feeInstance?.id) }"
						class="btn yellow">Collect Fees  </g:link></td>
			</tr>

		</table>
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
						id="${LookUpED.encod(student?.id) }" title="">
						<i class="fa fa-pencil"></i> Edit Fees</g:link>
					<a onclick="$('#showfee').hide(500)" style="color: #fff"> <i
						class="fa fa-close"></i> Close
					</a>
				</div>
			</div>
			<div class="portlet-body">
				<g:render template="studenttable"
					model="[academicyears:student?.academicyear]" />
			</div>
		</div>
	</div>
	</div>
	