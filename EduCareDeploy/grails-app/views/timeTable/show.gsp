<%@ page import="com.hiideals.instituite.EDcoding.LookUpED"%>
<%@ page import="com.hiideals.institute.payroll.PayHead"%>
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
				<g:render template="/header/leftSide"
					model="[activ:[payroll:'start active open',payheadList:'active']]"></g:render>
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
						<li><i class="fa fa-circle"></i><a class="home"
							href="${createLink(uri: '/')}"><g:message
									code="default.home.label" /></a></li>
						<li><i class="fa fa-circle"></i> <g:link class="list"
								action="index">Timetable Lists</g:link></li>
						<li><i class="fa fa-circle"></i> <g:link class="create"
								action="create">Create New Timetable</g:link></li>
					</ul>
				</div>
				<div class="panel">
					<div class="panel-body">
						<div class="row">
							<div class="col-md-12">
								<div id="show-magazine" class="content scaffold-show"
									role="main">

									<g:if test="${flash.message}">
										<div class="message" role="status">
											${flash.message}
										</div>
									</g:if>
									<div class="portlet box black"
										style="border-style: solid; border-color: darkcyan; border-width: 2px;">
										<h3 class="page-title" style="margin-left: 25px">Details</h3>
										<ol style="margin-left: 3%">

											<g:if test="${timeTableInstance?.classname}">
												<li class="fieldcontain"><span id="classname-label"
													class="property-label"><g:message
															code="timeTable.classname.label" default="Classname" /></span>

													<span class="property-value caption-subject bold uppercase"
													style="margin-left: 25px" aria-labelledby="classname-label"><g:link
															controller="IClass" action="show"
															id="${timeTableInstance?.classname?.id}">
															${timeTableInstance?.classname?.classname?.encodeAsHTML()}
														</g:link></span></li>
											</g:if>

											<g:if test="${timeTableInstance?.section}">
												<li class="fieldcontain"><span id="section-label"
													class="property-label"><g:message
															code="timeTable.section.label" default="Section" /></span> <span
													class="property-value caption-subject bold uppercase"
													style="margin-left: 50px" aria-labelledby="section-label"><g:link
															controller="section" action="show"
															id="${timeTableInstance?.section?.id}">
															${timeTableInstance?.section?.sectionName?.encodeAsHTML()}
														</g:link></span></li>
											</g:if>

											<g:if test="${timeTableInstance?.subject}">
												<li class="fieldcontain"><span id="subject-label"
													class="property-label"><g:message
															code="timeTable.subject.label" default="Subject" /></span> <span
													class="property-value caption-subject bold uppercase"
													style="margin-left: 50px" aria-labelledby="subject-label"><g:link
															controller="subject" action="show"
															id="${timeTableInstance?.subject?.id}">
															${timeTableInstance?.subject?.subjectName?.encodeAsHTML()}
														</g:link></span></li>
											</g:if>

											<g:if test="${timeTableInstance?.staff}">
												<li class="fieldcontain"><span id="staff-label"
													class="property-label"><g:message
															code="timeTable.staff.label" default="Staff" /></span> <span
													class="property-value caption-subject bold uppercase"
													style="margin-left: 68px" aria-labelledby="staff-label"><g:link
															controller="staff" action="show"
															id="${timeTableInstance?.staff?.id}">
															${timeTableInstance?.staff?.encodeAsHTML()}
														</g:link></span></li>
											</g:if>

											<g:if test="${timeTableInstance?.periodName}">
												<li class="fieldcontain"><span id="periodName-label"
													class="property-label"><g:message
															code="timeTable.periodName.label" default="Period Name" /></span>

													<span
													class="property-value caption-subject bold uppercase "
													style="margin-left: 15px"
													aria-labelledby="periodName-label"><g:fieldValue
															bean="${timeTableInstance}" field="periodName" /></span></li>
											</g:if>

											<g:if test="${timeTableInstance?.periodtimings}">
												<li class="fieldcontain"><span id="periodtimings-label"
													class="property-label"><g:message
															code="timeTable.periodtimings.label"
															default="Periodtimings" /></span> <span
													class="property-value caption-subject bold uppercase"
													style="margin-left: 13px"
													aria-labelledby="periodtimings-label"><g:fieldValue
															bean="${timeTableInstance}" field="periodtimings" /></span></li>
											</g:if>

										</ol>
										<br>
										<g:form url="[resource:timeTableInstance, action:'delete']"
											method="DELETE">
											<fieldset class="buttons">
												&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
												<g:link class="edit" action="edit"
													id="${LookUpED.encod(timeTableInstance?.id)}">
													<g:message code="default.button.edit.label" default="Edit" />
												</g:link>
												&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
												<g:actionSubmit class="delete" action="delete"
													value="${message(code: 'default.button.delete.label', default: 'Delete')}"
													onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
											</fieldset>
										</g:form>
										<br> <br>
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
