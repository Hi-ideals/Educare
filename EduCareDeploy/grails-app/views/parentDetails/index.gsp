
<%@ page import="com.hiideals.instituite.student.ParentDetails"%>
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
						<li><a href="#">Home</a> <i class="fa fa-circle"></i></li>
						<li><a href="#">Admin</a> <i class="fa fa-circle"></i></li>
					</ul>

				</div>
				<!-- END PAGE BAR -->
				<!-- BEGIN PAGE TITLE-->
				<h3 class="page-title">Admin Profile</h3>
				<!-- END PAGE TITLE-->
				<!-- END PAGE HEADER-->
				<!-- BEGIN DASHBOARD STATS 1-->



				<div class="row">
					<div class="col-md-12">
						<div class="nav" role="navigation">
							<ul>
								<li><a class="home" href="${createLink(uri: '/')}"><g:message
											code="default.home.label" /></a></li>
								<li><g:link class="create" action="create">
										<g:message code="default.new.label" args="[entityName]" />
									</g:link></li>
							</ul>
						</div>
						<div id="list-parentDetails" class="content scaffold-list"
							role="main">
							<g:if test="${flash.message}">
								<div class="message" role="status">
									${flash.message}
								</div>
							</g:if>
							<br>
							<div class="portlet box green">
								<div class="portlet-title">
									<div class="caption">
										<i class="fa fa-user"></i>Parent Details
									</div>
								</div>
								<div class="portlet-body">
									<div class="table-scrollable">
										<table class="table  table-hover">
											<thead>
												<tr>

													<g:sortableColumn property="mobileNumber"
														title="${message(code: 'parentDetails.mobileNumber.label', default: 'Mobile Number')}" />

													<g:sortableColumn property="occupation"
														title="${message(code: 'parentDetails.occupation.label', default: 'Occupation')}" />

													<g:sortableColumn property="parentName"
														title="${message(code: 'parentDetails.parentName.label', default: 'Parent Name')}" />

													<g:sortableColumn property="relation"
														title="${message(code: 'parentDetails.relation.label', default: 'Relation')}" />

													<th><g:message code="parentDetails.student.label"
															default="Student" /></th>

												</tr>
											</thead>
											<tbody>
												<g:each in="${parentDetailsInstanceList}" status="i"
													var="parentDetailsInstance">
													<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

														<td><g:link action="show"
																id="${parentDetailsInstance.id}">
																${fieldValue(bean: parentDetailsInstance, field: "mobileNumber")}
															</g:link></td>

														<td>
															${fieldValue(bean: parentDetailsInstance, field: "occupation")}
														</td>

														<td>
															${fieldValue(bean: parentDetailsInstance, field: "parentName")}
														</td>

														<td>
															${fieldValue(bean: parentDetailsInstance, field: "relation")}
														</td>

														<td>
															${fieldValue(bean: parentDetailsInstance, field: "student")}
														</td>

													</tr>
												</g:each>
											</tbody>
										</table>
									</div>
								</div>
							</div>

							<div  style="text-align: center;">
								<ul class="pagination">
									<li><g:paginate total="${parentDetailsInstanceCount ?: 0}" /></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<g:render template="/footer/footer"></g:render>
	<!-- END FOOTER -->
	<!--[if lt IE 9]>
<script src="assets1/global/plugins/respond.min.js"></script>
<script src="assets1/global/plugins/excanvas.min.js"></script> 
<![endif]-->
	<!-- BEGIN CORE PLUGINS -->
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
	<!-- END CORE PLUGINS -->
	<!-- BEGIN PAGE LEVEL PLUGINS -->


	<!-- END PAGE LEVEL PLUGINS -->
	<!-- BEGIN THEME GLOBAL SCRIPTS -->
	<script src="assets1/global/scripts/app.min.js" type="text/javascript"></script>
	<!-- END PAGE LEVEL SCRIPTS -->
	<!-- BEGIN THEME LAYOUT SCRIPTS -->
	<script src="assets1/layouts/layout/scripts/layout.min.js"
		type="text/javascript"></script>
	<!-- END THEME LAYOUT SCRIPTS -->
</body>

</html>




