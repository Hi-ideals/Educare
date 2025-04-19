
<div class="portlet box grey">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-user"></i>List Of Issued Books to Staff
		</div>
	</div>
	<div class="portlet-body">
		<div class="table-scrollable">
			<table class="table table-bordered table-hover">
				<thead>
					<tr>
						<th>Staff Name</th>
						<th>Book Name</th>
						<th>Issued Date</th>
					</tr>
				</thead>
				<tbody>
					<g:each in="${issuedToStaff}" status="i"
						var="issuedInstance">
						<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
							<td>
								${issuedInstance?.staffId?.staffName}
							</td>
							<td>
								${issuedInstance?.books?.title.toString().replace('[', '').replace(']', '')}
							</td>
							<td>
							${issuedInstance?.dateOfIssue}
							</td>
						</tr>
					</g:each>
				</tbody>
			</table>

		</div>
	</div>
</div><br>
<div style="position:absolute; right:48%">
<g:link class="btn-u sm-margin-bottom-10 btn blue" controller="libraryReports" action="getByIssuedDatePrint" target='_blank' params="[type:params.type,from:params.from,to:params.to]">Get Print</g:link>
</div>
<%--
<div class="pagination">
	<g:paginate total="${studentInstanceCount ?: 0}" params="${params}"/>
</div>
 --%>


