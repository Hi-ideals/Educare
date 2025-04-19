
<%@ page import="com.hiideals.instituite.helper.Address"%>
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
<link
	href="assets1/global/plugins/bootstrap-fileinput/bootstrap-fileinput.css"
	rel="stylesheet" type="text/css" />
<link href="assets1/pages/css/profile-2.min.css" rel="stylesheet"
	type="text/css" />
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
				<g:render template="/header/leftSide"></g:render>
			</div>
		</div>
		<div class="page-content-wrapper">
			<div class="page-content">

				<div class="page-bar">
					<ul class="page-breadcrumb">
						<li><a href="#">Home</a> <i class="fa fa-circle"></i></li>
						<li><a href="#">Admin</a> <i class="fa fa-circle"></i></li>
					</ul>

				</div>
				<h3 class="page-title">Addresses</h3>
				<div class="row">
					<div class="col-md-12">
						<div class="nav" role="navigation">
							<g:link class="btn btn-warning" action="create">Create New Address</g:link>
						</div>
						<br>
						<div id="list-address" class="content scaffold-list" role="main">
							<g:if test="${flash.message}">
								<div class="message" role="status">
									${flash.message}
								</div>
							</g:if>
							<div class="portlet box green">
								<div class="portlet-title">
									<div class="caption">
										<i class="fa fa-user"></i>List Of Admins
									</div>
								</div>
								<div class="portlet-body">
									<div class="table-scrollable">
										<table class="table table-bordered table-hover">
											<thead>
												<tr>

													<g:sortableColumn property="phno"
														title="${message(code: 'address.phno.label', default: 'Phno')}" />

													<g:sortableColumn property="mobileNumber"
														title="${message(code: 'address.mobileNumber.label', default: 'Mobile Number')}" />

													<g:sortableColumn property="nationality"
														title="${message(code: 'address.nationality.label', default: 'Nationality')}" />

													<g:sortableColumn property="bloodgroup"
														title="${message(code: 'address.bloodgroup.label', default: 'Bloodgroup')}" />

													<g:sortableColumn property="motherTongue"
														title="${message(code: 'address.motherTongue.label', default: 'Mother Tongue')}" />

													<g:sortableColumn property="religion"
														title="${message(code: 'address.religion.label', default: 'Religion')}" />

												</tr>
											</thead>
											<tbody>
												<g:each in="${addressInstanceList}" status="i"
													var="addressInstance">
													<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

														<td><g:link action="show" id="${addressInstance.id}">
																${fieldValue(bean: addressInstance, field: "phno")}
															</g:link></td>

														<td>
															${fieldValue(bean: addressInstance, field: "mobileNumber")}
														</td>

														<td>
															${fieldValue(bean: addressInstance, field: "nationality")}
														</td>

														<td>
															${fieldValue(bean: addressInstance, field: "bloodgroup")}
														</td>

														<td>
															${fieldValue(bean: addressInstance, field: "motherTongue")}
														</td>

														<td>
															${fieldValue(bean: addressInstance, field: "religion")}
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
									<li><g:paginate total="${addressInstanceCount ?: 0}" /></li>
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
	<script src="assets1/global/scripts/app.min.js" type="text/javascript"></script>
	<script src="assets1/layouts/layout/scripts/layout.min.js"
		type="text/javascript"></script>
</body>
</html>


