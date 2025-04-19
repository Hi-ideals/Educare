
<%@ page import="com.hiideals.instituite.admin.Admin"%>
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
				<%--
				<g:render template="/header/leftSide"></g:render>
			--%>
			</div>
		</div>
		<div class="page-content-wrapper">
			<div class="page-content">

				<div class="page-bar">
					<ul class="page-breadcrumb">
						<li><a href="${createLink(uri: '/')}">Home</a> <i
							class="fa fa-circle"></i></li>
						<li><g:link action="index">View List</g:link> <i
							class="fa fa-circle"></i></li>
						<li><g:link action="create">Create New Admin</g:link></li>
					</ul>

				</div>
				<h3 class="page-title">Admin Profile</h3>
				<div class="row">
					<div class="col-md-12">


						<div id="show-admin" class="content scaffold-show" role="main">

							<g:if test="${flash.message}">
								<div class="message" role="status">
									${flash.message}
								</div>
							</g:if>

							<div class="portlet-body">
								<div class="table-scrollable">
									<div class="box box-info">
										<table class="table  table-hover">
											<tbody>
												<tr>
													<th>Profile Pic</th>
													<td><images:getImage
															id="${adminInstance?.profilePic?.id }" height="80px"
															width="80px" /></td>
												</tr>


												<tr>
													<th width="20%">Admin ID</th>
													<td><g:fieldValue bean="${adminInstance}"
															field="adminID" /></td>
												</tr>

												<tr>
													<th>Admin Name</th>
													<td><g:fieldValue bean="${adminInstance}"
															field="adminName" /></td>
												</tr>

												<tr>
													<th>Password</th>
													<td><g:fieldValue bean="${adminInstance}"
															field="password" /></td>
												</tr>
												<tr>
													<th>Institute</th>
													<td>
														${adminInstitute?.name }
													</td>
												</tr>
												<g:if test="${adminInstance?.address}">
													<tr>
														<th>Address</th>
														<td>
															${fieldValue(bean: adminInstance.address, field: "hsno")},
															${fieldValue(bean: adminInstance.address, field: "street")},
															${fieldValue(bean: adminInstance.address, field: "city")},
															${fieldValue(bean: adminInstance.address, field: "state")},
															${fieldValue(bean: adminInstance.address, field: "country")},
															${fieldValue(bean: adminInstance.address, field: "mobileNumber")}

														</td>
													</tr>
												</g:if>
												<tr>
													<th>Option</th>
													<td><g:form
															url="[resource:adminInstance, action:'delete']"
															method="DELETE">
															<fieldset class="buttons">
																<g:link class="btn green" action="edit"
																	id="${LookUpED.encod(adminInstance.id)}">
																	<g:message code="default.button.edit.label"
																		default="Edit" />
																</g:link>
																
															<g:actionSubmit class="btn btn-danger" action="delete"
																value="${message(code: 'default.button.delete.label', default: 'Delete')}"
																onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
														
															</fieldset>
														</g:form></td>
												</tr>

											</tbody>
										</table>
									</div>
								</div>
							</div>

							<%--<ul class="list-unstyled">
			
				<g:if test="${adminInstance?.address}">
				<li class="fieldcontain">
					<span id="address-label" class="property-label"><g:message code="admin.address.label" default="Address" /></span>
					
						<span class="property-value" aria-labelledby="address-label"><g:link controller="address" action="show" id="${adminInstance?.address?.id}">${adminInstance?.address?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${adminInstance?.adminID}">
				<li class="fieldcontain">
					<span id="adminID-label" class="property-label"><g:message code="admin.adminID.label" default="Admin ID" /></span>
					
						<span class="property-value" aria-labelledby="adminID-label"><g:fieldValue bean="${adminInstance}" field="adminID"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${adminInstance?.adminName}">
				<li class="fieldcontain">
					<span id="adminName-label" class="property-label"><g:message code="admin.adminName.label" default="Admin Name" /></span>
					
						<span class="property-value" aria-labelledby="adminName-label"><g:fieldValue bean="${adminInstance}" field="adminName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${adminInstance?.instituite}">
				<li class="fieldcontain">
					<span id="instituite-label" class="property-label"><g:message code="admin.instituite.label" default="Instituite" /></span>
					
						<span class="property-value" aria-labelledby="instituite-label"><g:link controller="instituite" action="show" id="${adminInstance?.instituite?.id}">${adminInstance?.instituite?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${adminInstance?.password}">
				<li class="fieldcontain">
					<span id="password-label" class="property-label"><g:message code="admin.password.label" default="Password" /></span>
					
						<span class="property-value" aria-labelledby="password-label"><g:fieldValue bean="${adminInstance}" field="password"/></span>
					
				</li>
				</g:if>
			
			</ul>
			<g:form url="[resource:adminInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${adminInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		--%>
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


