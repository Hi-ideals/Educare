<%@ page import="com.hiideals.instituite.EDcoding.LookUpED"%>
<div class="row" id="printlogoButton" hidden="">
	<div class="col-md-12">
		<div class="well" style="padding: 1px">
			<div class="text-center">
				<ul class="list-inline">
					<li><images:getImage id="${instituite?.logo?.id}"
							width="100px" height="100px" /><br></li>
					<br>
					<li>
						<h2 class="page-title" style="color: #000">
							${instituite?.name }
							<br> <small>Affiliated to: ${instituite?.affiliatedTo }</small>
						</h2>

					</li>
				</ul>
			</div>
		</div>
	</div>
</div>
<div class="portlet box grey">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-users"></i>List Of Students to get print
		</div>
	</div>
	<div class="portlet-body">
		<div class="table-scrollable">
			<table class="table table-bordered table-hover">
				<thead>
					<tr>
						<g:set var="user" value="${sec.username()}" />
                                         <g:if test="${user == "vidyashree"}">
                                         
								<th style="display:none"><g:message code="student.fatherDetails.label"
										default="Registration Number" /></th>
										
										</g:if>
										<g:else>
										<th><g:message code="student.fatherDetails.label"
										default="Registration Number"/></th>
										</g:else>



						<th><g:message code="student.guardianDetails.label"
								default="Student Name" /></th>
								
								<th>FatherName</th>

						<th><g:message code="student.guardianDetails.label"
								default="Class " /></th>
						<th>Section</th>
						<th>Date of Joining</th>

					</tr>
				</thead>
				<tbody>
					<g:each in="${studentInstanceList}" status="i"
						var="studentInstance">
						<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

							

<g:set var="user" value="${sec.username()}" />
                                         <g:if test="${user == "vidyashree"}">
								         </g:if>
										<g:else>
										<td> ${fieldValue(bean: studentInstance, field: "registrationNo")}</td>
										</g:else>

							<td>
								${fieldValue(bean: studentInstance, field: "studentName")}
							</td>
							
							<td>
								${fieldValue(bean: studentInstance, field: "fatherDetails.parentName")}
							</td>

							<td><g:each in="${studentInstance?.academicyear}">
									<g:if test="${it.status == 'current'}">
									</g:if>
								</g:each> <g:set value="${it?.presentclass}" var="pclass"></g:set> ${pclass.classname }
							</td>
							<td><g:each in="${studentInstance?.academicyear}">
									<g:if test="${it.status == 'current'}">
									</g:if>
								</g:each> <g:set value="${it?.section}" var="pclass"></g:set> ${pclass.sectionName }
							<td><g:formatDate format="dd-MMM-yyyy"
									date="${studentInstance.studentDOJ}" /></td>
						</tr>
					</g:each>
				</tbody>
			</table>

		</div>
	</div>
</div>

<%--<g:form controller="listofStudents" action="getstlist" target='_blank'>
<g:hiddenField name="gender" value="${params?.gender}"/>
<g:hiddenField name="iclass" value="${params?.iclass}"/>
<g:hiddenField name="from" value="${params?.from}"/>
<g:hiddenField name="orderd" value="${params?.orderd}"/>
<g:hiddenField name="to" value="${params?.to}"/>
<g:hiddenField name="Search" value="Search"/>
<g:submitButton name="Get Print"/>
</g:form>
	--%>
<div class="pagination">
	<g:paginate total="${studentInstanceCount ?: 0}" params="${params}" />
</div>

