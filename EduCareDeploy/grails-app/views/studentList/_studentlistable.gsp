<%@ page import="com.hiideals.instituite.EDcoding.LookUpED"%>
<%@page import="com.hiideals.utils.APPConsumer"%>
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
<div class="portlet box grey">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-users"></i>List Of Student
		</div>
	</div>
	<div class="portlet-body">
		<div class="table-scrollable">
			<table class="table table-bordered table-hover">
				<thead>
					<tr>

						<th>S.No</th>
						<g:set var="user" value="${sec.username()}" />
                                         <g:if test="${user == "vidyashree"}">
                                         
								<th style="display:none"><g:message code="student.fatherDetails.label"
										default="Registration Number" /></th>
										
										</g:if>
										<g:else>
										<th><g:message code="student.fatherDetails.label"
										default="Registration Number"/></th>
										</g:else>
						<th><g:message code="student.motherDetails.label"
								default="Student Id" /></th>

						<th><g:message code="student.guardianDetails.label"
								default="Student Name" /></th>
						<th>Father Name</th>

						<th><g:message code="student.guardianDetails.label"
								default="Class " /></th>

						<th>Date of Joining</th>
						<th id="printPageButton">View</th>


					</tr>
				</thead>
				<tbody>
					<g:each in="${studentInstanceList}" status="i"
						var="studentInstance">
						<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

							<td>
								${i+1}
							</td>

							<g:set var="user" value="${sec.username()}" />
                                         <g:if test="${user == "vidyashree"}">
								         </g:if>
										<g:else>
										<td> ${fieldValue(bean: studentInstance, field: "registrationNo")}</td>
										</g:else>

							<td>
								${fieldValue(bean: studentInstance, field: "studentId")}
							</td>

							<td>
								${fieldValue(bean: studentInstance, field: "studentName")}
							</td>
							<td>
								${fieldValue(bean: studentInstance?.fatherDetails, field: "parentName")}
							</td>


							<g:if
								test="${params?.iclass=="all" || params?.iclass=="" || params?.iclass==null}">
								<td><g:each in="${studentInstance?.academicyear}">
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


							<td><g:formatDate format="dd-MMM-yyyy"
									date="${studentInstance.studentDOJ}" /></td>

							<td id="printPageButton"><g:link controller="student"
									action="show" id="${LookUpED.encod(studentInstance.id)}">
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

<script>
	$(".step").click(function(event) {
		event.preventDefault();
		var ss = (($(this).attr('href')).split("?"))[1]

		jQuery.ajax({
			type : 'POST',
			//data : jQuery(this).serialize(), 
			url : '${APPConsumer.AJAX_NAME}/studentList/getByClass?' + ss,
			success : function(data, textStatus) {
				jQuery('#Changedisplay').html(data);
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
			}
		});
		return false

	})

	$(".nextLink").click(function(event) {
		event.preventDefault();
		var ss = (($(this).attr('href')).split("?"))[1]

		jQuery.ajax({
			type : 'POST',
			//data : jQuery(this).serialize(), 
			url : '${APPConsumer.AJAX_NAME}/studentList/getByClass?' + ss,
			success : function(data, textStatus) {
				jQuery('#Changedisplay').html(data);
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
			}
		});
		return false

	})

	$(".prevLink").click(function(event) {
		event.preventDefault();
		var ss = (($(this).attr('href')).split("?"))[1]

		jQuery.ajax({
			type : 'POST',
			//data : jQuery(this).serialize(), 
			url : '${APPConsumer.AJAX_NAME}
	/studentList/getByClass?' + ss,
			success : function(data, textStatus) {
				jQuery('#Changedisplay').html(data);
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
			}
		});
		return false

	})
</script>
