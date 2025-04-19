
<div class="portlet box grey">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-user"></i>List Of Return Books From Staff
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
					<g:each in="${staffreturnDate}" status="i"
						var="returnInstance">
						<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
							<td>
								${returnInstance?.staffId?.staffName}
							</td>
							<td>
								${returnInstance?.books?.title.toString().replace('[', '').replace(']', '')}
							</td>
							<td>
							${returnInstance?.dateOfReturn}
							</td>
						</tr>
					</g:each>
				</tbody>
			</table>

		</div>
	</div>
</div><br>
<div style="position:absolute; right:48%">
<g:link class="btn-u sm-margin-bottom-10 btn blue" controller="libraryReports" action="getByReturnDatePrint" target='_blank' params="[type:params.type,from:params.from,to:params.to]">Get Print</g:link>
</div>
<%--
<div class="pagination">
	<g:paginate total="${studentInstanceCount ?: 0}" params="${params}"/>
</div>
 --%>


