
<%@ page import="com.hiideals.institute.staff.Staff"%>
<%@ page import="com.hiideals.instituite.EDcoding.LookUpED"%>
<%@ page import="com.hiideals.instituite.helper.Batch"%>
<!DOCTYPE html>

<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<!-- BEGIN HEAD -->

<head>
<meta charset="utf-8" />
<title>Hi-Educare | Admin</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1" name="viewport" />
<meta content="" name="description" />
<meta content="" name="author" />
<!-- BEGIN GLOBAL MANDATORY STYLES -->
<link
	href="assets1/global/plugins/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="assets1/global/plugins/simple-line-icons/simple-line-icons.min.css"
	rel="stylesheet" type="text/css" />
<link href="assets1/global/plugins/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<link href="assets1/global/plugins/uniform/css/uniform.default.css"
	rel="stylesheet" type="text/css" />
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<link
	href="assets1/global/plugins/bootstrap-fileinput/bootstrap-fileinput.css"
	rel="stylesheet" type="text/css" />
<link href="assets1/pages/css/profile-2.min.css" rel="stylesheet"
	type="text/css" />
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN THEME GLOBAL STYLES -->
<link href="assets1/global/css/components.min.css" rel="stylesheet"
	id="style_components" type="text/css" />
<link href="assets1/global/css/plugins.min.css" rel="stylesheet"
	type="text/css" />
<!-- END THEME GLOBAL STYLES -->
<!-- BEGIN THEME LAYOUT STYLES -->
<link href="assets1/layouts/layout/css/layout.min.css" rel="stylesheet"
	type="text/css" />
<link href="assets1/layouts/layout/css/themes/darkblue.min.css"
	rel="stylesheet" type="text/css" id="style_color" />
<link href="assets1/layouts/layout/css/custom.min.css" rel="stylesheet"
	type="text/css" />
<!-- END THEME LAYOUT STYLES -->
<link rel="shortcut icon" href="assets1/layouts/layout/img/favicon.png" />
</head>
<!-- END HEAD -->

<body
	class="page-header-fixed page-sidebar-closed-hide-logo page-content-white"
	id="body">
	<!-- BEGIN HEADER -->
	<div class="page-header navbar navbar-fixed-top">
		<!-- BEGIN HEADER INNER -->
		<div class="page-header-inner ">
			<g:render template="/header/logo"></g:render>
			<!-- BEGIN RESPONSIVE MENU TOGGLER -->
			<a href="javascript:;" class="menu-toggler responsive-toggler"
				data-toggle="collapse" data-target=".navbar-collapse"> </a>
			<g:render template="/header/topBar"></g:render>
		</div>
	</div>
	<!-- END HEADER -->
	<!-- BEGIN HEADER & CONTENT DIVIDER -->
	<div class="clearfix"></div>
	<div class="page-container">
		<!-- BEGIN SIDEBAR -->
		<div class="page-sidebar-wrapper">
			<div class="page-sidebar navbar-collapse collapse">

				<g:if test="${params.staff }">
					<g:render template="/header/leftSide"
						model="[activ:[LibraryManagement:'start active open',staffissueDetails:'active']]"></g:render>
				</g:if>
				<g:else>
					<g:render template="/header/leftSide"
						model="[activ:[LibraryManagement:'start active open',issueDetails:'active']]"></g:render>
				</g:else>


			</div>
			<!-- END SIDEBAR -->
		</div>

		<div class="page-content-wrapper">
			<!-- BEGIN CONTENT BODY -->
			<div class="page-content">

				<div class="page-bar">
					<ul class="page-breadcrumb">
						<li><a class="home" href="${createLink(uri: '/')}"><g:message
									code="default.home.label" /></a></li>
						<li><i class="fa fa-circle"></i> <g:if test="${params.staff}">
								<g:link class="create" action="create"
									params="[staff:params.staff]">Create IssueDetails</g:link>
							</g:if> <g:else>
								<g:link class="create" action="create">Issue to Student/Staff</g:link>
							</g:else></li>
					</ul>
				</div>
				<div class="panel">
					<div class="panel-body">
						<div class="row">
							<div class="col-md-12">
								<div id="list-issueDetails" class="content scaffold-list"
									role="main">

									<g:if test="${flash.message}">
										<div class="message" role="status">
											${flash.message}
										</div>
									</g:if>
									<div class="portlet box grey">
										<div class="portlet-title">
											<div class="caption">
												<i class="fa fa-users"></i>List of Issued Details
											</div>
										</div>

										<div class="portlet-body">
											<ul class="nav nav-tabs">
												<li class="${activeMap?.getAt('books') }"><a
													href="#tab_1_1" data-toggle="tab"> Books </a></li>

												<li class="${activeMap?.getAt('newspaper') }"><a
													href="#tab_1_2" data-toggle="tab"> NewsPaper </a></li>

												<li class="${activeMap?.getAt('magazin') }"><a
													href="#tab_1_3" tabindex="-1" data-toggle="tab">
														Magazine</a></li>
											</ul>
											<div class="tab-content">
												<div class="tab-pane fade ${activeMap?.getAt('books') } in"
													id="tab_1_1">



													<div class="table-scrollable">
														<table class="table table-bordered table-hover">
															<thead>
																<tr>

																	<g:if test="${!params.staff }">
																		<th><g:message
																				code="issueDetails.studentId.label"
																				default="Student name" /></th>
																	</g:if>
																	<g:else>
																		<th><g:message code="issueDetails.staffId.label"
																				default="Staff name" /></th>
																	</g:else>

																	<th>Books name</th>
																	<th><g:message
																			code="issueDetails.returndate.label"
																			default="Returndate" /></th>
																	<th><g:message code="issueDetails.issuedate.label"
																			default="Issuedate" /></th>

																	<th>Fine</th>
																	<th>Actions</th>
																</tr>
															</thead>
															<tbody>
																<g:each in="${bookslist}" status="i"
																	var="issueDetailsInstance">
																	<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

																		<g:if test="${!params.staff }">
																			<td><g:link action="show"
																					id="${LookUpED.encod(issueDetailsInstance.id)}">
																					${fieldValue(bean: issueDetailsInstance, field: "studentId.studentName")}
																				</g:link></td>
																		</g:if>
																		<g:else>
																			<td><g:link action="show"
																					id="${LookUpED.encod(issueDetailsInstance.id)}">
																					${fieldValue(bean: issueDetailsInstance, field: "staffId.staffName")}
																				</g:link></td>
																		</g:else>


																		<td>
																			${issueDetailsInstance?.books?.title.toString().replace('[', '').replace(']', '')}
																		</td>

																		<td><g:formatDate
																				date="${issueDetailsInstance.returndate }"
																				type="date" style="SHORT" /></td>

																		<td><g:formatDate
																				date="${issueDetailsInstance.issuedate}" type="date"
																				style="SHORT" /></td>

																		<td>
																			${issueDetailsInstance?.fineAmount}
																		</td>
																		<td><g:form
																				url="[resource:issueDetailsInstance, action:'delete']"
																				method="DELETE">
																				<fieldset class="buttons">
																					<g:link action="edit"
																						id="${LookUpED.encod(issueDetailsInstance.id)}">
																						<i class="fa fa-pencil"> </i>
																						<g:message code="default.button.edit.label"
																							default="Edit" />
																					</g:link>
																					<g:actionSubmit
																						style="background:none;border:none;color:red"
																						action="delete"
																						value="${message(code: 'default.button.delete.label', default: 'Delete')}"
																						onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
																				</fieldset>
																			</g:form></td>

																	</tr>
																</g:each>
															</tbody>
														</table>
													</div>
													<div class="pagination">
														<g:paginate total="${bookslistCount ?: 0}"
															params="[paginateTo:'books']" />
													</div>



												</div>
												<div
													class="tab-pane fade ${activeMap?.getAt('newspaper') } in"
													id="tab_1_2">


													<div class="table-scrollable">
														<table class="table table-bordered table-hover">
															<thead>
																<tr>

																	<g:if test="${!params.staff }">
																		<th><g:message
																				code="issueDetails.studentId.label"
																				default="Student name" /></th>
																	</g:if>
																	<g:else>
																		<th><g:message code="issueDetails.staffId.label"
																				default="Staff name" /></th>
																	</g:else>


																	<th><g:message code="issueDetails.newspaper.label"
																			default="Newspaper name" /></th>
																	<th><g:message
																			code="issueDetails.returndate.label"
																			default="Returndate" /></th>
																	<th><g:message code="issueDetails.issuedate.label"
																			default="Issuedate" /></th>

																	<th>Fine</th>
																	<th>Actions</th>
																</tr>
															</thead>
															<tbody>
																<g:each in="${newslist}" status="i"
																	var="issueDetailsInstance">
																	<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

																		<g:if test="${!params.staff }">
																			<td><g:link action="show"
																					id="${LookUpED.encod(issueDetailsInstance.id)}">
																					${fieldValue(bean: issueDetailsInstance, field: "studentId.studentName")}
																				</g:link></td>
																		</g:if>
																		<g:else>
																			<td><g:link action="show"
																					id="${LookUpED.encod(issueDetailsInstance.id)}">
																					${fieldValue(bean: issueDetailsInstance, field: "staffId.staffName")}
																				</g:link></td>
																		</g:else>



																		<td>
																			${fieldValue(bean: issueDetailsInstance, field: "newspaper.name")}
																		</td>

																		<td><g:formatDate
																				date="${issueDetailsInstance.returndate }"
																				type="date" style="SHORT" /></td>

																		<td><g:formatDate
																				date="${issueDetailsInstance.issuedate}" type="date"
																				style="SHORT" /></td>

																		<td>
																			${issueDetailsInstance?.fineAmount}
																		</td>
																		<td><g:form
																				url="[resource:issueDetailsInstance, action:'delete']"
																				method="DELETE">
																				<fieldset class="buttons">
																					<g:link action="edit"
																						id="${LookUpED.encod(issueDetailsInstance.id)}">
																						<i class="fa fa-pencil"> </i>
																						<g:message code="default.button.edit.label"
																							default="Edit" />
																					</g:link>
																					<g:actionSubmit
																						style="background:none;border:none;color:red"
																						action="delete"
																						value="${message(code: 'default.button.delete.label', default: 'Delete')}"
																						onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
																				</fieldset>
																			</g:form></td>

																	</tr>
																</g:each>
															</tbody>
														</table>
													</div>
													<div class="pagination">
														<g:paginate total="${newslistCount ?: 0}"
															params="[paginateTo:'newspaper']" />
													</div>

												</div>
												<div
													class="tab-pane fade ${activeMap?.getAt('magazin') } in"
													id="tab_1_3">

													<div class="table-scrollable">
														<table class="table table-bordered table-hover">
															<thead>
																<tr>

																	<g:if test="${!params.staff }">
																		<th><g:message
																				code="issueDetails.studentId.label"
																				default="Student name" /></th>
																	</g:if>
																	<g:else>
																		<th><g:message code="issueDetails.staffId.label"
																				default="Staff name" /></th>
																	</g:else>


																	<th><g:message code="issueDetails.newspaper.label"
																			default="Magazin name" /></th>
																	<th><g:message
																			code="issueDetails.returndate.label"
																			default="Returndate" /></th>
																	<th><g:message code="issueDetails.issuedate.label"
																			default="Issuedate" /></th>

																	<th>Fine</th>
																	<th>Actions</th>
																</tr>
															</thead>
															<tbody>
																<g:each in="${magazinlist}" status="i"
																	var="issueDetailsInstance">
																	<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

																		<g:if test="${!params.staff }">
																			<td><g:link action="show"
																					id="${LookUpED.encod(issueDetailsInstance.id)}">
																					${fieldValue(bean: issueDetailsInstance, field: "studentId.studentName")}
																				</g:link></td>
																		</g:if>
																		<g:else>
																			<td><g:link action="show"
																					id="${LookUpED.encod(issueDetailsInstance.id)}">
																					${fieldValue(bean: issueDetailsInstance, field: "staffId.staffName")}
																				</g:link></td>
																		</g:else>



																		<td>
																			${fieldValue(bean: issueDetailsInstance, field: "magazineId.magazineName")}
																		</td>

																		<td><g:formatDate
																				date="${issueDetailsInstance.returndate }"
																				type="date" style="SHORT" /></td>

																		<td><g:formatDate
																				date="${issueDetailsInstance.issuedate}" type="date"
																				style="SHORT" /></td>

																		<td>
																			${issueDetailsInstance?.fineAmount}
																		</td>
																		<td><g:form
																				url="[resource:issueDetailsInstance, action:'delete']"
																				method="DELETE">
																				<fieldset class="buttons">
																					<g:link action="edit"
																						id="${LookUpED.encod(issueDetailsInstance.id)}">
																						<i class="fa fa-pencil"> </i>
																						<g:message code="default.button.edit.label"
																							default="Edit" />
																					</g:link>
																					<g:actionSubmit
																						style="background:none;border:none;color:red"
																						action="delete"
																						value="${message(code: 'default.button.delete.label', default: 'Delete')}"
																						onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
																				</fieldset>
																			</g:form></td>

																	</tr>
																</g:each>
															</tbody>
														</table>
													</div>
													<div style="text-align: center;">
														<ul class="pagination">
															<li><g:paginate total="${magazinlistCount ?: 0}" /></li>
														</ul>
													</div>

												</div>
											</div>
											<div class="clearfix margin-bottom-20"></div>

										</div>
									</div>
									<div class="col-md-12 text-center">
										<g:link class="btn blue" controller="issueDetails"
											action="printissueDetailsList" target='_blank'
											params="[staff:params.staff]">Get List of Issue Details</g:link>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<g:render template="/footer/footer"></g:render>
	
	<!--[if lt IE 9]>
<script src="assets1/global/plugins/respond.min.js"></script>
<script src="assets1/global/plugins/excanvas.min.js"></script> 
<![endif]-->
	
	<script src="assets1/global/plugins/jquery.min.js"
		type="text/javascript"></script>
	<script src="assets1/global/plugins/bootstrap/js/bootstrap.min.js"
		type="text/javascript"></script>
	<script src="assets1/global/plugins/js.cookie.min.js"
		type="text/javascript"></script>
	<script
		src="assets1/global/plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js"
		type="text/javascript"></script>
	<script
		src="assets1/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js"
		type="text/javascript"></script>
	<script src="assets1/global/plugins/jquery.blockui.min.js"
		type="text/javascript"></script>
	<script src="assets1/global/plugins/uniform/jquery.uniform.min.js"
		type="text/javascript"></script>
	
	<script src="assets1/global/scripts/app.min.js" type="text/javascript"></script>
	<script src="assets1/layouts/layout/scripts/layout.min.js"
		type="text/javascript"></script>

	<script type="text/javascript">
		$('document').ready(function() {
			$("#regclick").click(function() {
				$("#Reg").toggle(500);
				$("#class").hide(500);
				$("#date").hide(500);

			});

			$("#classclick").click(function() {
				$("#class").toggle(500);
				$("#Reg").hide(500);
				$("#date").hide(500);

			});
			$("#dateclick").click(function() {
				$("#class").hide(500);
				$("#Reg").hide(500);
				$("#date").toggle(500);

			});
		});
	</script>
	<script>
		$("#snoAlertBox").fadeIn();
		window.setTimeout(function() {
			$("#snoAlertBox").fadeOut(2000)
		}, 3000);
	</script>

</body>

</html>



