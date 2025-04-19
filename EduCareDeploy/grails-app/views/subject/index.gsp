
<%@ page import="com.hiideals.instituite.classcourses.Subject"%>
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
	class="page-header-fixed page-sidebar-closed-hide-logo page-content-white"
	id="body">
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
					model="[activ:[subject:'start active open',subjectList:'active']]"></g:render>

			</div>
		</div>

		<div class="page-content-wrapper">
			<div class="page-content">

				<div class="page-bar">
					<ul class="page-breadcrumb">
						<li><a class="home" href="${createLink(uri: '/')}">Home</a> <i
							class="fa fa-circle"></i></li>


						<li><g:link action="create">Add New Subject</g:link></li>
					</ul>

				</div>

				<div class="panel">
					<div class="panel-body">

						<g:if test="${flash.message}">
							<div id="snoAlertBox" class="alert alert-success"
								data-alert="alert">
								<i class="fa fa-check" style="font-size: 25px; color: wite"></i>
								${flash.message}
							</div>
						</g:if>



						<div class="row">

							<div class="col-md-12" id="hi">
								<div class="box box-info">
									<div class="portlet light bordered">
										<div class="portlet-title">
											<div class="caption font-blue">
												<i class="icon-magnifier font-blue"></i> <span
													class="caption-subject bold uppercase"> Search
													Subjects</span>
											</div>

										</div>
										<div class="portlet-body form">

											<button class="btn blue" id="classclick">
												<i class="icon-magnifier font-white"></i> By Class
											</button>
											<div class="margin-bottom-10"></div>
											<g:formRemote name="ss" url="[action:'index']" update="body">
												<div id="class" style="display: none">
													<div class="row">

														<div class="col-md-4">
															<div
																class="form-group form-md-floating-label">

																<label>Class</label> <select name="iclass"
																	class="form-control">
																	<option value="null">All</option>
																	<g:each in="${classList}" var="cls">
																		<option value="${cls.id }">
																			${cls.classname }
																		</option>
																	</g:each>
																</select>
															</div>
														</div>


														<div class="col-md-4">
															<g:submitButton name="Search" class="btn blue"
																style="margin-top: 22px" />
														</div>
													</div>
												</div>

											</g:formRemote>
										</div>
									</div>
								</div>


							</div>

							<div class="col-md-12">

								<div id="list-IClass" class="content scaffold-list" role="main">

									<div class="portlet box grey">
										<div class="portlet-title">
											<div class="caption">
												<i class="fa fa-book"></i>List Of Subjects
											</div>
										</div>
										<div class="portlet-body">
											<div class="table-scrollable">
												<table class="table  table-hover">
													<thead>
														<tr>

															<th>
																${message(code: 'subject.subjectName.label', default: 'Subject')}
															</th>

															<th>
																${message(code: 'subject.subjectDescription.label', default: 'Subject Description')}
															</th>

															<th><g:message code="subject.iclass.classname.label"
																	default="Class " /></th>

															<th>Actions</th>

														</tr>
													</thead>
													<tbody>
														<g:each in="${subjectInstanceList}" status="i"
															var="subjectInstance">
															<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

																<td>
																	${fieldValue(bean: subjectInstance, field: "subjectName")}
																</td>

																<td>
																	${fieldValue(bean: subjectInstance, field: "subjectDescription")}
																</td>

																<td><g:each in="${subjectInstance?.iclass}"
																		var="className" status="a">
																		<ul class="list-unstyled">
																			<li>
																			<i class="fa fa-caret-right"> </i>	${fieldValue(bean: className, field: "classname")}
																			</li>
																		</ul>

																	</g:each></td>

																<td><g:form
																		url="[resource:subjectInstance, action:'delete']"
																		method="DELETE">
																		<fieldset class="buttons">
																			<g:link action="edit"
																				id="${LookUpED.encod(subjectInstance.id)}">
																				<i class="fa fa-pencil"> </i>
																				<g:message code="default.button.edit.label"
																					default="Edit" />
																			</g:link>

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
										<li><g:paginate total="${subjectInstanceCount ?: 0}" /></li>
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

	<script type="text/javascript">
		$('document').ready(function() {
			$("#classclick").click(function() {
				$("#class").toggle(500);

			});
		});
	</script>
	<script>
		$("#snoAlertBox").fadeIn();
		window.setTimeout(function() {
			$("#snoAlertBox").fadeOut(2000)
		}, 3000);
	</script>

	<!-- END THEME LAYOUT SCRIPTS -->
</body>

</html>




