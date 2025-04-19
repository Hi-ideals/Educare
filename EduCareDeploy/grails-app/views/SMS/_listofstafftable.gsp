<%@ page import="com.hiideals.instituite.EDcoding.LookUpED"%>
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
<div class="portlet box green">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-user"></i>List of staff to send sms
		</div>
	</div>
	<div class="portlet-body">
		<g:form action="sendMessageTostaffs">
			<div class="table-scrollable">
				<div class="col-md-4">
					<label>Message</label>
					<g:textArea class="form-control" name="notemessage"></g:textArea>
				</div>
				<table class="table  table-hover">
					<thead>
						<tr>
							<th><g:message code="student.fatherDetails.label"
									default="Registration Number" /></th>

							<th><g:message code="student.Actions.label"
									default="Actions" /></th>
						</tr>
					</thead>
					<tbody>
						<g:each in="${staffInstance}" status="i" var="staffs">
							<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
								<td>
									${fieldValue(bean: staffs, field: "staffName")}
								</td>
								<td><button name="stId" value="${staffs?.id}">
										Send Message
										${staffs}
									</button></td>
								<g:hiddenField name="staffId${i}" value="${staffs?.id}" />
							</tr>
						</g:each>
					</tbody>
				</table>
			</div>
			<g:hiddenField name="loopSize" value="${staffInstance.size()}"/>
		<button name="messagetoall" value="yes">
		Send Message To All
		</button>
		</g:form>
	</div>
</div>
<div class="pagination">
	<g:paginate total="${studentInstanceCount ?: 0}" params="${params}" />
</div>

