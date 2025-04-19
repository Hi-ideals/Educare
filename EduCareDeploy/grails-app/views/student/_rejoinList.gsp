
<%@ page import="com.hiideals.instituite.EDcoding.LookUpED"%>
<%@ page import="com.hiideals.instituite.classcourses.IClass"%>
<div id="printableArea">

	<div class="row" id="printlogoButton" hidden="">
		<div class="col-md-12">
			<div class="well" style="padding: 1px">
				<div class="text-center">
					<ul class="list-inline">
						<li><images:getImage id="${instituite?.logo?.id}"
								width="100px" height="100px" /><br></li>
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
	<div class="portlet box blue">
		<div class="portlet-title">
			<div class="caption">
				<i class="fa fa-user"></i>List Of Students
			</div>
		</div>
		<div class="portlet-body">
			<div class="table-scrollable">
				<table class="table  table-hover">
					<thead>
						<tr>

							<th><g:message code="student.fatherDetails.label"
									default="Registration Number" /></th>

							<th><g:message code="student.motherDetails.label"
									default="Roll Number" /></th>

							<th><g:message code="student.guardianDetails.label"
									default="Student Name" /></th>
									
							<th>FatherName</th>		

							<th>Academic Year</th>
							<th>Class</th>

							<th id="printPageButton">Readmission</th>


						</tr>
					</thead>
					<tbody>


						<g:each in="${studentInstanceList}" status="i"
							var="studentInstance">

							<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

								<td>
									${fieldValue(bean: studentInstance, field: "registrationNo")}
								</td>

								<td>
									${fieldValue(bean: studentInstance, field: "studentId")}
								</td>

								<td>
									${fieldValue(bean: studentInstance, field: "studentName")}
								</td>
								<td>
									${fieldValue(bean: studentInstance, field: "fatherDetails.parentName")}
								</td>
								<%--
                           <g:each in="${studentInstance?.academicyear}">
                        <g:if test="${it.status == 'current'}">
                    </g:if>
                  </g:each>
                 <g:set value="${it?.academicyear}" var="academicyear1"></g:set>
              <g:set value="${it?.presentclass}" var="iclass1"></g:set>
							--%>
								<g:if test="${params?.iyear=='all' }">

									<g:each in="${studentInstance?.academicyear}">
										<g:set value="${IClass.findById(params?.iclass).classname}"
											var="icalssname"></g:set>
										<g:if test="${it?.presentclass?.classname==icalssname}">
											<td>
												${it?.academicyear}
											</td>
										</g:if>
									</g:each>

								</g:if>
								<g:else>
									<td>
										${params?.iyear}
									</td>
								</g:else>
								<g:if test="${params?.iclass=='all'}">
									<g:each in="${studentInstance?.academicyear}">
										<g:if test="${it?.academicyear==params?.iyear}">
											<td>
												${it?.presentclass?.classname}
											</td>
										</g:if>
									</g:each>

								</g:if>
								<g:else>
									<td><g:if test="${icalssname}">
											${icalssname}
										</g:if> <g:else>
											${IClass.findById(params?.iclass).classname}
										</g:else></td>
								</g:else>
								<td id="printPageButton"><g:link controller="student"
										action="reAdmission" id="${studentInstance.id}">
								 Readmission
								</g:link> || <g:link controller="student" action="show"
										id="${LookUpED.encod(studentInstance.id)}">
										<i class="fa fa-eye"></i> View Profile
								</g:link></td>

							</tr>

						</g:each>
					</tbody>
				</table>

			</div>
		</div>
	</div>
	<div class="pagination">
		<g:paginate total="${studentInstanceCount ?: 0}" params="${params}" />
	</div>


</div>