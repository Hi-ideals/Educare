
<%@ page import="com.hiideals.instituite.classcourses.IClass"%>
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
					model="[activ:[Settings:'start active open',IClassList:'active']]"></g:render>

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


						<li><g:link action="create">Create New Class</g:link></li>
					</ul>

				</div>
				<div class="panel">
					<div class="panel-body">
						<div class="row">
							<div class="col-md-12">
								<g:if test="${flash.msg}">
									<h3 class="message" role="status" style="color: red">
										${flash.msg}
									</h3>
								</g:if>

								<g:if test="${flash.message}">
									<div id="snoAlertBox" class="alert alert-success"
										data-alert="alert">
										<i class="fa fa-check" style="font-size: 25px; color: wite"></i>
										${flash.message}
									</div>
								</g:if>

								<div id="list-IClass" class="content scaffold-list" role="main">
									
									<div class="portlet box grey">
										<div class="portlet-title">
											<div class="caption">
												<i class="fa fa-book"></i>List of classes
											</div>
										</div>
										<div class="portlet-body">
											<div class="table-scrollable">
												<table class="table table-bordered table-hover">
													<thead>
														<tr>


															<th>
																${message(code: 'IClass.classID.label', default: 'Class ID')}
															</th>

															<th>
																${message(code: 'IClass.classname.label', default: 'Classname')}
															</th>

															<th>
																${message(code: 'IClass.classname.label', default: 'Class Section')}
															</th>

															<th>
																${message(code: 'IClass.classStrength.label', default: 'Class Strength')}
															</th>

															<th>
																${message(code: 'IClass.classTeacherName.label', default: 'Class Teacher Name')}
															</th>


															<th>Actions</th>



														</tr>
													</thead>
													<tbody>
														<g:each in="${IClassInstanceList}" status="i"
															var="IClassInstance">
															<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

																<td>
																	${fieldValue(bean: IClassInstance, field: "classID")}
																</td>


																<td>
																	${fieldValue(bean: IClassInstance, field: "classname")}
																</td>

																<td><g:each in="${IClassInstance?.sections}"
																		var="sName" status="a">
																		<ul class="list-unstyled">
																			<li><i class="fa fa-caret-right"></i> ${fieldValue(bean: sName, field: "sectionName")}
																			</li>
																		</ul>
																	</g:each></td>


																<td><g:each in="${IClassInstance?.sections}"
																		var="sName" status="a">
																		<ul class="list-unstyled">
																			<li><i class="fa fa-caret-right"></i> ${fieldValue(bean: sName, field: "sectionStrength")}
																			</li>
																		</ul>
																	</g:each></td>

																<td><g:each in="${IClassInstance?.sections}"
																		var="sName" status="a">
																		<ul class="list-unstyled">
																			<li><i class="fa fa-caret-right"></i> ${fieldValue(bean: sName, field: "sectionClassTeacher")}
																			</li>
																		</ul>
																	</g:each></td>

																<td><g:form
																		url="[resource:IClassInstance, action:'delete']"
																		method="DELETE">
																		<fieldset class="buttons">
																			<g:link class="edit" action="edit"
																				id="${LookUpED.encod(IClassInstance.id)}">
																				<i class="fa fa-pencil"> </i>
																				<g:message code="default.button.edit.label"
																					default="Edit" />
																			</g:link>
																			<!--<g:actionSubmit style="background:none;border:none;color:red" action="delete"
																		value="${message(code: 'default.button.delete.label', default: 'Delete')}"
																		onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />-->
																		</fieldset>
																	</g:form></td>

															</tr>
														</g:each>
													</tbody>
												</table>
											</div>
										</div>
									</div>
								</div>

								<div style="text-align: center;">
									<ul class="pagination">
										<li><g:paginate total="${IClassInstanceCount ?: 0}" /></li>
									</ul>
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
	<script>
		$("#snoAlertBox").fadeIn();
		window.setTimeout(function() {
			$("#snoAlertBox").fadeOut(2000)
		}, 3000);
	</script>
</body>

</html>




