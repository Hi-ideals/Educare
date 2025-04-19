
<div class="portlet box grey">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-user"></i>Library details staff Name : ${stffWise?.staffId?.staffName[0]}
		</div>
	</div>
	<div class="portlet-body">
		<div class="table-scrollable">
			<table class="table table-bordered table-hover">
				<thead>
					<tr>
						<th>Book Name</th>
						<th>Issued Date</th>
						<th>Return Date</th>
						<th>Fine Amount</th>
						<th>Return status</th>
					</tr>
				</thead>
				<tbody>
					<g:each in="${stffWise}" status="i"
						var="stfInstance">
						<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
							<td>
								${stfInstance?.books?.title.toString().replace('[', '').replace(']', '')}
							</td>
							<td>
							${stfInstance?.dateOfIssue}
							</td>
							<td>
							${stfInstance?.dateOfReturn}
							</td>
							<td>
							${stfInstance?.fineAmount}
							</td>
							<td>
							${stfInstance?.returned}
							</td>
						</tr>
					</g:each>
				</tbody>
			</table>

		</div>
	</div>
</div><br>
<div style="position:absolute; right:48%">
<g:link class="btn-u sm-margin-bottom-10 btn blue" controller="libraryReports" action="getBystaffWisePrint" target='_blank' params="[staffName:params.staffName]">Get Print</g:link>
</div>
<%--
<div class="pagination">
	<g:paginate total="${studentInstanceCount ?: 0}" params="${params}"/>
</div>
 --%>


