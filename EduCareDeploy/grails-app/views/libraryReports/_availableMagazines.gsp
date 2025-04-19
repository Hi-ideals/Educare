<%--
<div class="row" id="printlogoButton" hidden="">
						<div class="col-md-12">
							<div class="well" style="padding: 1px">
								<div class="text-center">
									<ul class="list-inline">
										<li><images:getImage id="${instituite?.logo?.id}" width="100px" height="100px"/><br>

										</li><br>
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
 --%>

<div class="portlet box grey">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-user"></i>List Of Available Magazines
		</div>
	</div>
	<div class="portlet-body">
		<div class="table-scrollable">
			<table class="table table-bordered table-hover">
				<thead>
					<tr>
						<th>Magazine Name</th>
						<th>Category</th>
						<th>Volume</th>
						<th>CD/DVD</th>
						<th>Date</th>
						
					</tr>
				</thead>
				<tbody>
					<g:each in="${allMagazines}" status="i"
						var="magazineInstance">
						<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
							<td>
								${magazineInstance?.magazineName}
							</td>
							<td>
								${magazineInstance?.catagory}
							</td>
							<td>
							${magazineInstance?.volume}
							</td>
							<td>
							<g:if test="${magazineInstance?.cddvd == true}">
							Yes
							</g:if><g:else>
							No
							</g:else>
							</td>
							<td>
							${magazineInstance?.purchasedOn}
							</td>
						</tr>
					</g:each>
				</tbody>
			</table>

		</div>
	</div>
</div><br>
<div style="position:absolute; right:48%">
<g:link class="btn-u sm-margin-bottom-10 btn blue" controller="libraryReports" action="availableMagazinesPrint" target='_blank'>Get Print</g:link>
</div>
<%--
<div class="pagination">
	<g:paginate total="${studentInstanceCount ?: 0}" params="${params}"/>
</div>
 --%>


