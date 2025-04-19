<%@ page import="com.hiideals.instituite.EDcoding.LookUpED"%>
<%@ page import="com.hiideals.instituite.admin.UserList"%>
<!DOCTYPE html>

<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->

<head>
<meta charset="utf-8" />
<title>Hi-Educare | Users</title>
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
				<g:render template="/header/leftSide"
					model="[activ:[userlist:'start active open']]"></g:render>


			</div>
		</div>

		<div class="page-content-wrapper">
			<div class="page-content">

				<div class="page-bar">
					<ul class="page-breadcrumb">
						<li><a class="home" href="${createLink(uri: '/')}">Home</a> <i
							class="fa fa-circle"></i></li>


						<li><g:link action="index">View user list</g:link></li>
					</ul>

				</div>
				<br>
				<div class="panel">
					<div class="panel-body">
						<div class="row">
							<div class="col-md-12">
								<div id="show-userList" class="content scaffold-show"
									role="main">
									<h3>View Details</h3>
									<g:if test="${flash.message}">
										<div class="message" role="status">
											${flash.message}
										</div>
									</g:if>
									<div class="table-responsive">
										<table class="table table-hover">
											<g:if test="${userListInstance?.userName}">
												<tr>
													<td width="20%">User Name</td>
													<td><strong><g:fieldValue
																bean="${userListInstance}" field="userName" /></strong></td>
												</tr>
											</g:if>
											<g:if test="${userListInstance?.password}">
												<tr>
													<td>Password</td>
													<td><strong><g:fieldValue
																bean="${userListInstance}" field="password" /> </strong></td>
												</tr>
											</g:if>
											<g:if test="${userListInstance?.address}">
												<tr>
													<td>Address</td>
													<td style="font-weight: bold;"><g:fieldValue bean="${userListInstance?.address}"
													field="hsno" />,
												<g:fieldValue bean="${userListInstance?.address}"
													field="street" />,
												<g:fieldValue bean="${userListInstance?.address}"
													field="city" /> - <g:fieldValue bean="${userListInstance?.address}"
													field="pinCode" />,
												<g:fieldValue bean="${userListInstance?.address}"
													field="state" />,
												<g:fieldValue bean="${userListInstance?.address}"
													field="country" />
													
													</td>
												</tr>
											</g:if>
											<g:if test="${userListInstance?.createdUser}">
												<tr>
													<td>Created User</td>
													<td><Strong>
															${userListInstance?.createdUser?.username}
													</Strong></td>
												</tr>
											</g:if>
											<g:if test="${userListInstance?.secrole}">
												<tr>
													<td>Sec Role</td>
													<td>
													<strong>	${userListInstance?.secrole?.roleName}</strong>
													</td>
												</tr>
											</g:if>
											<g:if test="${userListInstance?.modules}">
												<tr>
													<td>Modules</td>
													<td><strong> <g:each
																in="${userListInstance.modules}" var="m">
																<span class="property-value" aria-labelledby="modules-label"><%--<g:link
																		controller="userModules" action="show" id="${m.id}">
																		--%>${m?.moduleName},
																	<%--</g:link></span>--%></span>
															</g:each>
													</strong></td>
												</tr>
											</g:if>
											<g:if test="${userListInstance?.dateCreated}">
												<tr>
													<td>Date Created</td>
													<td><strong><g:formatDate
																date="${userListInstance?.dateCreated}"
																format="dd-MMM-yyyy" /></strong></td>
												</tr>
											</g:if>
											<%--<g:if test="${userListInstance?.institute}">
					<tr>
						<td>Institute</td>
						<td><strong>${userListInstance?.institute?.encodeAsHTML()}</strong></td>
					</tr>
					</g:if>
					--%>
											<%--<g:if test="${userListInstance?.lastUpdated}">
					<tr>
						<td>Last Updated</td>
						<td><strong><g:formatDate date="${userListInstance?.lastUpdated}" /></strong></td>
					</tr>
					</g:if>
					--%>
											<tr>
												<td>Actions</td>
												<td><g:form
														url="[resource:userListInstance, action:'delete']"
														method="DELETE">
														<fieldset class="buttons">
															<g:link class="btn btn-warning" action="edit"
																id="${LookUpED.encod(userListInstance?.id)}"
																resource="${userListInstance}">
																<g:message code="default.button.edit.label"
																	default="Edit" />
															</g:link>
															<%--<g:actionSubmit class="btn btn-danger" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
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




