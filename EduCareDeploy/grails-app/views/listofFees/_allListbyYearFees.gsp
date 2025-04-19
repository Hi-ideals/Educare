
<%@ page import="com.hiideals.instituite.EDcoding.LookUpED"%>
<div id="printableArea">
				
<div class="row" id="printlogoButton" hidden="">
						<div class="col-md-12">
							<div class="well" style="padding: 1px">
								<div class="text-center">
									<ul class="list-inline">
										<li><images:getImage id="${instituite?.logo?.id}" width="100px" height="100px"/><br>

										</li>
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
<div class="portlet box green">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-user"></i>List Of Students fees with class wise
		</div>
	</div>
	<div class="portlet-body">
		<div class="table-scrollable">
			<table class="table  table-hover">
				<thead>
					<tr>

						
						<th>Student Name</th>
                        <th>Total Fee</th>
						<%--<th>Final Settlement</th>
                        --%><th>Total Paid</th>
						<th>Due</th>
						<th>Fee Paid Date	</th>
						<th>Updated Date</th>
						
						<th>Class</th>
						
						<th>Academic Year</th>

					</tr>
				</thead>
				<tbody>
					<g:each in="${studentInstanceList}" status="i"
						var="studentInstance">
						<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

							<td>
								${fieldValue(bean: studentInstance?.studentId, field: "studentName")}
							</td>


							<td>
								${fieldValue(bean: studentInstance, field: "totalFee")}
							</td>
							
							<%--<td>
								${fieldValue(bean: studentInstance, field: "Final Settlement")}
							</td>
							
							--%><td>
								${fieldValue(bean: studentInstance, field: "totalPaid")}
							</td>

							<td>${fieldValue(bean: studentInstance, field: "due")}</td>
							
							<td>
							<g:formatDate format="dd-MMM-yyyy" date="${studentInstance.dateCreated}"/>
							</td>
							
							<td>
							<g:formatDate format="dd-MMM-yyyy" date="${studentInstance.lastUpdated}"/>
							</td>
							
						<g:if test="${params?.iclass=="all" || params?.iclass=="" || params?.iclass==null}">
								<td>
							<g:each in="${studentInstance?.studentId?.academicyear}">
									<g:if test="${it.status == 'current'}">
									</g:if>
								</g:each> <g:set value="${it?.presentclass}" var="pclass"></g:set> ${pclass.classname }
							</td>
							</g:if>
							<g:else>
							<td>
							${clsname}
							</td>
							</g:else>
							<td>
							${studentInstance?.academic?.academicyear}
							</td>
							
						</tr>
					</g:each>
				</tbody>
			</table>

		</div>
	</div>
</div>
<div class="text-center">
						<g:form controller="listofFees" action="byYearPrint" target='_blank'>

<g:hiddenField name="iclass" value="${params?.iclass}"/>
<g:hiddenField name="iyear" value="${params?.iyear}"/>
<g:hiddenField name="Search" value="Search"/>
<g:submitButton class="btn blue" name="Get Print"/>
</g:form>
							</div>

<%--
<div class="pagination">
	<g:paginate total="${studentInstanceCount ?: 0}" params="${params}"/>
</div>
 --%>



					
						</div>