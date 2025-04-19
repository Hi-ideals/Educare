<%@ page import="com.hiideals.instituite.EDcoding.LookUpED"%>
<%@ page import="com.hiideals.instituite.student.PreEducation"%>
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
				<g:render template="/header/leftSide"></g:render>
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
						<li><a href="${createLink(uri: '/')}">Home</a> <i
							class="fa fa-circle"></i></li>
						<li><g:link action="index">View List</g:link> <i
							class="fa fa-circle"></i></li>
						<li><g:link action="create">Create New Fee</g:link></li>
					</ul>

				</div>
				<div class="panel">
					<div class="panel-body">

						<div class="row">
							<div class="col-md-12">
								<div id="show-preEducation" class="content scaffold-show"
									role="main">
									<h1>
										<g:message code="default.show.label" args="[entityName]" />
									</h1>
									<g:if test="${flash.message}">
										<div class="message" role="status">
											${flash.message}
										</div>
									</g:if>
									<ol class="property-list preEducation">

										<g:if test="${preEducationInstance?.schoolAddress}">
											<li class="fieldcontain"><span id="schoolAddress-label"
												class="property-label"><g:message
														code="preEducation.schoolAddress.label"
														default="School Address" /></span> <span class="property-value"
												aria-labelledby="schoolAddress-label"><g:link
														controller="address" action="show"
														id="${preEducationInstance?.schoolAddress?.id}">
														${preEducationInstance?.schoolAddress?.encodeAsHTML()}
													</g:link></span></li>
										</g:if>

										<g:if test="${preEducationInstance?.marksPercentage}">
											<li class="fieldcontain"><span
												id="marksPercentage-label" class="property-label"><g:message
														code="preEducation.marksPercentage.label"
														default="Marks Percentage" /></span> <span
												class="property-value"
												aria-labelledby="marksPercentage-label"><g:fieldValue
														bean="${preEducationInstance}" field="marksPercentage" /></span>

											</li>
										</g:if>

										<g:if test="${preEducationInstance?.qualification}">
											<li class="fieldcontain"><span id="qualification-label"
												class="property-label"><g:message
														code="preEducation.qualification.label"
														default="Qualification" /></span> <span class="property-value"
												aria-labelledby="qualification-label"><g:fieldValue
														bean="${preEducationInstance}" field="qualification" /></span></li>
										</g:if>

										<g:if test="${preEducationInstance?.schoolname}">
											<li class="fieldcontain"><span id="schoolname-label"
												class="property-label"><g:message
														code="preEducation.schoolname.label" default="Schoolname" /></span>

												<span class="property-value"
												aria-labelledby="schoolname-label"><g:fieldValue
														bean="${preEducationInstance}" field="schoolname" /></span></li>
										</g:if>

										<g:if test="${preEducationInstance?.studentpreEdu}">
											<li class="fieldcontain"><span id="studentpreEdu-label"
												class="property-label"><g:message
														code="preEducation.studentpreEdu.label"
														default="Studentpre Edu" /></span> <span class="property-value"
												aria-labelledby="studentpreEdu-label"><g:link
														controller="student" action="show"
														id="${preEducationInstance?.studentpreEdu?.id}">
														${preEducationInstance?.studentpreEdu?.encodeAsHTML()}
													</g:link></span></li>
										</g:if>

										<g:if test="${preEducationInstance?.transferCertificatId}">
											<li class="fieldcontain"><span
												id="transferCertificatId-label" class="property-label"><g:message
														code="preEducation.transferCertificatId.label"
														default="Transfer Certificat Id" /></span> <span
												class="property-value"
												aria-labelledby="transferCertificatId-label"><g:fieldValue
														bean="${preEducationInstance}"
														field="transferCertificatId" /></span></li>
										</g:if>

										<g:each in="${preEducationInstance.files}" var="g">
											<li><img
												src="${createLink(controller:'home', action:'displaySingleImage', id:g.id)}"
												height="100px" width="100px" /></li>
										</g:each>


									</ol>
									<g:form url="[resource:preEducationInstance, action:'delete']"
										method="DELETE">
										<fieldset class="buttons">
											<g:link class="edit" action="edit"
												id="${LookUpED.encod(preEducationInstance.id)}">
												<g:message code="default.button.edit.label" default="Edit" />
											</g:link>
											<g:actionSubmit class="delete" action="delete"
												value="${message(code: 'default.button.delete.label', default: 'Delete')}"
												onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
										</fieldset>
									</g:form>
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




