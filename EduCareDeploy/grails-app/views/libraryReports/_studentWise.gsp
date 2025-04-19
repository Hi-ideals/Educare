
<div class="portlet box grey">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-user"></i>Library details student Name : ${stWise?.studentId?.studentName[0]}
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
					<g:each in="${stWise}" status="i"
						var="sWise">
						<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
							<td>
								${sWise?.books?.title.toString().replace('[', '').replace(']', '')}
							</td>
							<td>
							${sWise?.dateOfIssue}
							</td>
							<td>
							${sWise?.dateOfReturn}
							</td>
							<td>
							${sWise?.fineAmount}
							</td>
							<td>
							${sWise?.returned}
							</td>
						</tr>
					</g:each>
				</tbody>
			</table>

		</div>
	</div>
</div><br>
<div style="position:absolute; right:48%">
<g:link class="btn-u sm-margin-bottom-10 btn blue" controller="libraryReports" action="getBystudentWisePrint" target='_blank' params="[stName:params.stName]">Get Print</g:link>
</div>
<%--
<div class="pagination">
	<g:paginate total="${studentInstanceCount ?: 0}" params="${params}"/>
</div>
 --%>


