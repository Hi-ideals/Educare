

<%@ page import="com.hiideals.instituite.EDcoding.LookUpED"%>
<%@ page import="com.hiideals.institute.staff.Staff"%>
<!DOCTYPE html>

<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->


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

<link href="assets1/global/css/components.min.css" rel="stylesheet"
	id="style_components" type="text/css" />
<link href="assets1/global/css/plugins.min.css" rel="stylesheet"
	type="text/css" />

<link href="assets1/layouts/layout/css/layout.min.css" rel="stylesheet"
	type="text/css" />
<link href="assets1/layouts/layout/css/themes/darkblue.min.css"
	rel="stylesheet" type="text/css" id="style_color" />
<link href="assets1/layouts/layout/css/custom.min.css" rel="stylesheet"
	type="text/css" />
<link rel="shortcut icon" href="assets1/layouts/layout/img/favicon.png" />
</head>

<body
	class="page-header-fixed page-sidebar-closed-hide-logo page-content-white">
	<div class="page-header navbar navbar-fixed-top">
		<div class="page-header-inner ">
			<g:render template="/header/logo"></g:render>
			<a href="javascript:;" class="menu-toggler responsive-toggler"
				data-toggle="collapse" data-target=".navbar-collapse"> </a>
			<g:render template="/header/topBar"></g:render>
		</div>
	</div>
	<div class="clearfix"></div>
	<div class="page-container">
		<div class="page-sidebar-wrapper">
			<div class="page-sidebar navbar-collapse collapse">
				<g:render template="/header/leftSide"
					model="[activ:[TransportManagement:'start active open',Transport:'active']]"></g:render>
			</div>
		</div>
		<div class="page-content-wrapper">
			<div class="page-content">

				<div class="page-bar">
					<ul class="page-breadcrumb">

						<li><i class="fa fa-circle"></i><a class="home"
							href="${createLink(uri: '/')}"><g:message
									code="default.home.label" /></a></li>
						<li><i class="fa fa-circle"></i> <g:link class="list"
								action="index">Transport's List</g:link></li>
						<li><i class="fa fa-circle"></i> <g:link class="create"
								action="create">Create New List</g:link></li>
					</ul>
				</div>

				<div class="panel">
					<div class="panel-body">

							<div class="row">
								<div class="col-md-12">
									<h4>View Details</h4>
						<div class="box box-info">
									<table class="table table-bordered table-hover">
										<g:if test="${transportInstance?.route}">
											<tr>
												<td><span id="route-label" class="property-label"><g:message
															code="transport.route.label" default="Route" /></span></td>
												<td><span
													class="property-value caption-subject bold uppercase"
													aria-labelledby="route-label"><g:link
															controller="routeDetails" action="show"
															id="${transportInstance?.route?.id}">
															${transportInstance?.route?.vehicle?.vehicleNo}
															${transportInstance?.route?.routeCode}
															${transportInstance?.route?.startPlace}
															${transportInstance?.route?.stopPlace}
														</g:link></span></td>
											</tr>
										</g:if>
										<g:if test="${transportInstance?.destination}">
											<tr>
												<td><span id="destination-label" class="property-label"><g:message
															code="transport.destination.label" default="Destination" /></span>
												</td>
												<td><span
													class="property-value caption-subject bold uppercase"
													aria-labelledby="destination-label"> ${transportInstance?.destination?.fromPlace}
														${transportInstance?.destination?.toPlace} ${transportInstance?.destination?.stopTime}
												</span></td>
											</tr>
										</g:if>
										<g:if test="${transportInstance?.type}">
											<tr>
												<td><span id="type-label" class="property-label"><g:message
															code="transport.type.label" default="Type" /></span></td>
												<td><span
													class="property-value caption-subject bold uppercase"
													aria-labelledby="type-label"><g:fieldValue
															bean="${transportInstance}" field="type" /></span></td>
											</tr>
										</g:if>
										<g:if test="${transportInstance?.startDate}">
											<tr>
												<td><span id="startDate-label" class="property-label"><g:message
															code="transport.startDate.label" default="Start Date" /></span></td>
												<td><span
													class="property-value caption-subject bold uppercase"
													aria-labelledby="startDate-label"><g:formatDate
															date="${transportInstance?.startDate}" /></span></td>
											</tr>
										</g:if>
										<g:if test="${transportInstance?.endDate}">
											<tr>
												<td><span id="endDate-label" class="property-label"><g:message
															code="transport.endDate.label" default="End Date" /></span></td>
												<td><span
													class="property-value caption-subject bold uppercase"
													aria-labelledby="endDate-label"><g:formatDate
															date="${transportInstance?.endDate}" /></span></td>
											</tr>
										</g:if>
										<g:if test="${transportInstance?.student}">
											<tr>
												<td><span id="student-label" class="property-label"><g:message
															code="transport.student.label" default="Student" /></span></td>
												<td><span
													class="property-value caption-subject bold uppercase"
													aria-labelledby="student-label"> ${transportInstance?.student?.studentName}
												</span></td>
											</tr>

										</g:if>
										<g:if test="${transportInstance?.employee}">
											<tr>
												<td><span id="employee-label" class="property-label"><g:message
															code="transport.employee.label" default="Employee" /></span></td>
												<td><span
													class="property-value caption-subject bold uppercase"
													aria-labelledby="employee-label"> ${transportInstance?.employee?.encodeAsHTML()}
												</span></td>
											</tr>
										</g:if>
										<tr>
											<td>Actions</td>
											<td><g:form
													url="[resource:transportInstance, action:'delete']"
													method="DELETE">
													<fieldset class="buttons">

														<g:link class="edit" action="edit"
															id="${LookUpED.encod(transportInstance.id)}">
															<g:message code="default.button.edit.label"
																default="Edit" />
														</g:link>

														<g:actionSubmit class="delete btn blue" action="delete"
															value="${message(code: 'default.button.delete.label', default: 'Delete')}"
															onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
													</fieldset>
												</g:form></td>
										</tr>
									</table>
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
