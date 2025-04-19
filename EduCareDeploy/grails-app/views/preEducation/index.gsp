
<%@ page import="com.hiideals.instituite.student.PreEducation"%>
<%@ page import="com.hiideals.instituite.EDcoding.LookUpED"%>
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
	class="page-header-fixed page-sidebar-closed-hide-logo page-content-white">
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
				<g:render template="/header/leftSide"></g:render>
				<!-- END SIDEBAR MENU -->
				<!-- END SIDEBAR MENU -->
			</div>
			<!-- END SIDEBAR -->
		</div>
		<!-- END SIDEBAR -->
		<!-- BEGIN CONTENT -->
		<div class="page-content-wrapper">
			<!-- BEGIN CONTENT BODY -->
			<div class="page-content">

				<div class="page-bar">
					<ul class="page-breadcrumb">
						<li><a href="${createLink(uri: '/')}">Home</a> <i
							class="fa fa-circle"></i></li>
						<li><g:link action="index">View List</g:link> <i
							class="fa fa-circle"></i></li>
						<li><g:link action="create">Create New Fee</g:link></li>
					</ul>

				</div>
				<div class="panel">
					<div class="panel-body">
						<div class="row">
							<div class="col-md-12">
								<div id="list-preEducation" class="content scaffold-list"
									role="main">
									<g:if test="${flash.message}">
										<div class="message" role="status">
											${flash.message}
										</div>
									</g:if>
									<div class="portlet box grey">
										<div class="portlet-title">
											<div class="caption">
												<i class="fa fa-rupee"></i>List Of Institute Fees Added
											</div>
										</div>
										<div class="portlet-body">
											<div class="table-scrollable">
												<table class="table table-bordered table-hover">
													<thead>
														<tr>

															<th>
															School Address
															</th>
															<th>Marks Percentage</th>
															<th>Qualification</th>
															<th>School Name</th>
															<th>Studentpre Edu</th>
															<th>Transfer Certificate Id</th>
															
														</tr>
													</thead>
													<tbody>
														<g:each in="${preEducationInstanceList}" status="i"
															var="preEducationInstance">
															<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

																<td><g:link action="show"
																		id="${LookUpED.encod(preEducationInstance.id)}">
																		${fieldValue(bean: preEducationInstance, field: "schoolAddress")}
																	</g:link></td>

																<td>
																	${fieldValue(bean: preEducationInstance, field: "marksPercentage")}
																</td>

																<td>
																	${fieldValue(bean: preEducationInstance, field: "qualification")}
																</td>

																<td>
																	${fieldValue(bean: preEducationInstance, field: "schoolname")}
																</td>

																<td>
																	${fieldValue(bean: preEducationInstance, field: "studentpreEdu")}
																</td>

																<td>
																	${fieldValue(bean: preEducationInstance, field: "transferCertificatId")}
																</td>

															</tr>
														</g:each>
													</tbody>
												</table>
											</div>
										</div>
									</div>

									<div style="text-align: center;">
										<ul class="pagination">
											<li><g:paginate
													total="${preEducationInstanceCount ?: 0}" /></li>
										</ul>
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
			<script
				src="assets1/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js"
				type="text/javascript"></script>
			
			<script src="assets1/global/scripts/app.min.js"
				type="text/javascript"></script>
			
			<script src="assets1/layouts/layout/scripts/layout.min.js"
				type="text/javascript"></script>
</body>

</html>



