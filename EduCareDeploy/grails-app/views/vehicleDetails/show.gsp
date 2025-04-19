<%@ page import="com.hiideals.instituite.EDcoding.LookUpED"%>
<%@ page import="com.hiideals.institute.staff.Staff"%>
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
					model="[activ:[TransportManagement:'start active open',AddVechile:'active']]"></g:render>
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
								action="index">VehicleDetails List</g:link></li>
						<li><i class="fa fa-circle"></i> <g:link class="create"
								action="create">Create New Vehicles</g:link></li>
					</ul>
				</div>

				<div class="panel">
					<div class="panel-body">
						<h4>Vehicle Details</h4>
						<div class="box box-info">


							<div class="row">
								<div class="col-md-12">
									<table class="table table-bordered table-hover">
										<g:if test="${vehicleDetailsInstance?.vehicleNo}">
											<tr>
												<td width="25%"><span id="vehicleNo-label"
													class="property-label"><g:message
															code="vehicleDetails.vehicleNo.label"
															default="Vehicle No" /></span></td>
												<td><b> <span
														class="property-value  caption-subject bold uppercase"
														aria-labelledby="vehicleNo-label"><g:fieldValue
																bean="${vehicleDetailsInstance}" field="vehicleNo" /></span>
												</b></td>
											</tr>

										</g:if>
										<g:if test="${vehicleDetailsInstance?.noOfSeats}">
											<tr>
												<td><span id="noOfSeats-label" class="property-label"><g:message
															code="vehicleDetails.noOfSeats.label"
															default="No Of Seats" /></span></td>
												<td><b> <span
														class="property-value  caption-subject bold uppercase"
														aria-labelledby="noOfSeats-label"><g:fieldValue
																bean="${vehicleDetailsInstance}" field="noOfSeats" /></span>
												</b></td>
											</tr>

										</g:if>

										<g:if test="${vehicleDetailsInstance?.maxiumAllowed}">
											<tr>
												<td><span id="maxiumAllowed-label"
													class="property-label"><g:message
															code="vehicleDetails.maxiumAllowed.label"
															default="Maxium Allowed" /></span></td>
												<td><b> <span
														class="property-value  caption-subject bold uppercase"
														aria-labelledby="maxiumAllowed-label"><g:fieldValue
																bean="${vehicleDetailsInstance}" field="maxiumAllowed" /></span>
												</b></td>
											</tr>

										</g:if>
										<g:if test="${vehicleDetailsInstance?.vehicleType}">
											<tr>
												<td><span id="vehicleType-label" class="property-label"><g:message
															code="vehicleDetails.vehicleType.label"
															default="Vehicle Type" /></span></td>
												<td><b> <span
														class="property-value  caption-subject bold uppercase"
														aria-labelledby="vehicleType-label"><g:fieldValue
																bean="${vehicleDetailsInstance}" field="vehicleType" /></span>
												</b></td>
											</tr>

										</g:if>
										<g:if test="${vehicleDetailsInstance?.contactPerson}">
											<tr>
												<td><span id="contactPerson-label"
													class="property-label"><g:message
															code="vehicleDetails.contactPerson.label"
															default="ContactPerson" /></span></td>
												<td><b> <span
														class="property-value  caption-subject bold uppercase"
														aria-labelledby="contactPerson-label"><g:fieldValue
																bean="${vehicleDetailsInstance}" field="contactPerson" /></span>
												</b></td>
											</tr>

										</g:if>
										<g:if test="${vehicleDetailsInstance?.insuranceRenewalDate}">
											<tr>
												<td><span id="insuranceRenewalDate-label"
													class="property-label"><g:message
															code="vehicleDetails.insuranceRenewalDate.label"
															default="InsuranceRenewalDate" /></span></td>
												<td><b> <span
														class="property-value  caption-subject bold uppercase"
														aria-labelledby="insuranceRenewalDate-label"><g:fieldValue
																bean="${vehicleDetailsInstance}"
																field="insuranceRenewalDate" /></span>
												</b></td>
											</tr>

										</g:if>
										<tr>
											<td>Actions</td>
											<td><g:form
													url="[resource:vehicleDetailsInstance, action:'delete']"
													method="DELETE">
													<fieldset class="buttons">
														
														<g:link class="btn yellow" action="edit"
															id="${LookUpED.encod(vehicleDetailsInstance.id)}">
															<g:message code="default.button.edit.label"
																default="Edit" />
														</g:link>
														
														<%--<g:actionSubmit class="delete btn blue" action="delete"
									value="${message(code: 'default.button.delete.label', default: 'Delete')}"
									onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
							--%>
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
