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
					model="[activ:[tt:'start active open',ptCreate:'active']]"></g:render>

			</div>
		</div>

		<div class="page-content-wrapper">
			<div class="page-content">

				<div class="page-bar">
					<ul class="page-breadcrumb">
						<li><i class="fa fa-circle"></i><a class="home"
							href="${createLink(uri: '/')}"><g:message
									code="default.home.label" /></a>
						<li><i class="fa fa-circle"></i> <g:link class="list"
								action="index">Period Lists</g:link>
						<li><i class="fa fa-circle"></i> <g:link class="create"
								action="create">Create New periods</g:link>
					</ul>
				</div>

				<div class="panel">
					<div class="panel-body">
						<div class="row">
							<div class="col-md-12">

								<div class="box box-info">

									<div class="row">
										<div class="col-md-12">
											<table class="table table-bordered table-hover">
												<g:if test="${period_TimingsInstance?.from_time}">
													<tr>
														<td width="20%"><span id="from_time-label"
															class="property-label"><g:message
																	code="period_Timings.from_time.label"
																	default="Fromtime" /></span></td>
														<td><span
															class="property-value caption-subject bold uppercase"
															aria-labelledby="from_time-label"><g:fieldValue
																	bean="${period_TimingsInstance}" field="from_time" /></span></td>
													</tr>

												</g:if>
												<g:if test="${period_TimingsInstance?.to_time}">
													<tr>
														<td><span id="to_time-label" class="property-label"><g:message
																	code="period_Timings.to_time.label" default="Totime" /></span>
														</td>
														<td><span
															class="property-value caption-subject bold uppercase"
															aria-labelledby="to_time-label"><g:fieldValue
																	bean="${period_TimingsInstance}" field="to_time" /></span></td>
													</tr>

												</g:if>
												<g:if test="${period_TimingsInstance?.from_H}">
													<tr>
														<td><span id="from_H-label" class="property-label"><g:message
																	code="period_Timings.from_H.label" default="From H" /></span>
														</td>
														<td><span
															class="property-value caption-subject bold uppercase"
															aria-labelledby="from_H-label"><g:fieldValue
																	bean="${period_TimingsInstance}" field="from_H" /></span></td>
													</tr>

												</g:if>

												<g:if test="${period_TimingsInstance?.from_M}">
													<tr>
														<td><span id="from_M-label" class="property-label"><g:message
																	code="period_Timings.from_M.label" default="From M" /></span>
														</td>
														<td><span
															class="property-value caption-subject bold uppercase"
															aria-labelledby="from_M-label"><g:fieldValue
																	bean="${period_TimingsInstance}" field="from_M" /></span></td>
													</tr>

												</g:if>

												<g:if test="${period_TimingsInstance?.periodName}">
													<tr>
														<td><span id="periodName-label"
															class="property-label"><g:message
																	code="period_Timings.periodName.label"
																	default="Period Name" /></span></td>
														<td><span
															class="property-value caption-subject bold uppercase"
															aria-labelledby="periodName-label"><g:fieldValue
																	bean="${period_TimingsInstance}" field="periodName" /></span>
														</td>
													</tr>
												</g:if>
												<g:if test="${period_TimingsInstance?.to_H}">
													<tr>
														<td><span id="to_H-label" class="property-label"><g:message
																	code="period_Timings.to_H.label" default="To H" /></span></td>
														<td><span
															class="property-value caption-subject bold uppercase"
															aria-labelledby="to_H-label"><g:fieldValue
																	bean="${period_TimingsInstance}" field="to_H" /></span></td>
													</tr>

												</g:if>

												<g:if test="${period_TimingsInstance?.to_M}">
													<tr>
														<td><span id="to_M-label" class="property-label"><g:message
																	code="period_Timings.to_M.label" default="To M" /></span></td>
														<td><span
															class="property-value caption-subject bold uppercase"
															aria-labelledby="to_M-label"><g:fieldValue
																	bean="${period_TimingsInstance}" field="to_M" /></span></td>
													</tr>

												</g:if>
												<tr>
													<td>Actions</td>
													<td><g:form
															url="[resource:period_TimingsInstance, action:'delete']"
															method="DELETE">
															<fieldset class="buttons">

																<g:link class="btn yellow" action="edit"
																	id="${LookUpED.encod(period_TimingsInstance?.id)}">
																	<g:message code="default.button.edit.label"
																		default="Edit" />
																</g:link>

																<g:actionSubmit class="btn red" action="delete"
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
</body>

</html>
