
<%@ page import="com.hiideals.instituite.main.Instituite"%>
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
				<g:render template="/header/leftSide"
					model="[activ:[Settings:'start active open',instituiteList:'active']]"></g:render>
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
						<li><a class="home" href="${createLink(uri: '/')}">Home</a> <i
							class="fa fa-circle"></i></li>
						<sec:ifAnyGranted roles="ROLE_SUPERADMIN">
							<li><g:link action="index">View List</g:link> <i
								class="fa fa-circle"></i></li>

							<li><g:link action="create">Create New Institute</g:link></li>
						</sec:ifAnyGranted>
					</ul>

				</div>
				<div class="panel">
					<div class="panel-body">
						<div class="row">
							<div class="col-md-12">
								<h4>Institute Details</h4>
								<g:if test="${flash.message}">
									<div class="message" role="status">
										${flash.message}
									</div>
								</g:if>
								<div class="box box-info">
									<div class="portlet light bordered">
										<div class="table-responsive">
											<table class="table table-bordered">
												<tr>
													<th width="20%">Institute Logo</th>
													<td><g:if test="${instituiteInstance?.logo !=null }">
															<images:getImage id="${instituiteInstance?.logo?.id}"
																width="80px" />
														</g:if></td>
												</tr>
												<tr>
													<th width="20%">Institute signature</th>
													<td><g:if test="${instituiteInstance?.signature !=null }">
															<images:getImage id="${instituiteInstance?.signature?.id}"
																width="80px" />
														</g:if></td>
												</tr>
												<tr>
													<th>Institute ID</th>
													<td><g:fieldValue bean="${instituiteInstance}"
															field="institutionID" /></td>
												</tr>
												<tr>
													<th>Institute Prefix Name</th>
													<td><g:fieldValue bean="${instituiteInstance}"
															field="institutionPrefixName" /></td>
												</tr>
												<tr>
													<th>Name of the Institution</th>
													<td>
														${instituiteInstance?.name?.encodeAsHTML()}
													</td>
												</tr>
												<tr>
													<th>Affiliated to</th>
													<td><g:fieldValue bean="${instituiteInstance}"
															field="affiliatedTo" /></td>
												</tr>
												<tr>
													<th>Caption</th>
													<td><g:fieldValue bean="${instituiteInstance}"
															field="caption" /></td>
												</tr>
												<tr>
													<th>About Institute</th>
													<td><g:fieldValue bean="${instituiteInstance}"
															field="description" /></td>
												</tr>
												<tr>
													<th>Institution Fax</th>
													<td><g:fieldValue bean="${instituiteInstance}"
															field="institutionFax" /></td>
												</tr>
												<tr>
													<th>Institution Phone</th>
													<td><g:fieldValue bean="${instituiteInstance}"
															field="phone" /></td>
												</tr>
												<tr>
													<th>Institution Address</th>
													<td><g:fieldValue bean="${instituiteInstance}"
															field="hsno" />, <g:fieldValue
															bean="${instituiteInstance}" field="street" />, <g:fieldValue
															bean="${instituiteInstance}" field="city" /> - <g:fieldValue
															bean="${instituiteInstance}" field="pinCode" />, <g:fieldValue
															bean="${instituiteInstance}" field="state" />, <g:fieldValue
															bean="${instituiteInstance}" field="country" /></td>
												</tr>
												<tr>
													<th>Institution Alternate Phone No.</th>
													<td><g:fieldValue bean="${instituiteInstance}"
															field="alternatephno" /></td>
												</tr>
												<tr>
													<th>Actions</th>
													<td><g:form
															url="[resource:instituiteInstance, action:'delete']"
															method="DELETE">
															<fieldset class="buttons">
																<g:link class="btn blue" action="edit"
																	id="${LookUpED.encod(instituiteInstance.id)}">
																	<g:message code="default.button.edit.label"
																		default="Edit" />
																</g:link>
																<!-- 
												<g:actionSubmit class="btn red" action="delete"
													value="${message(code: 'default.button.delete.label', default: 'Delete')}"
													onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
												 -->

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


