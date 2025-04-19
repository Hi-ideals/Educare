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
		<!-- BEGIN SIDEBAR -->
		<div class="page-sidebar-wrapper">
			<div class="page-sidebar navbar-collapse collapse">
				<g:render template="/header/leftSide"
					model="[activ:[exams:'start active open',examDetails:'active']]"></g:render>

			</div>

		</div>
		<div class="page-content-wrapper">
			<!-- BEGIN CONTENT BODY -->
			<div class="page-content">

				<div class="nav" role="navigation">
					<div class="page-bar">
						<ul class="page-breadcrumb">
							<li><i class="fa fa-circle"></i><a class="home"
								href="${createLink(uri: '/')}"><g:message
										code="default.home.label" /></a>
							<li><i class="fa fa-circle"></i> <g:link class="list"
									action="index">ExamDetail Lists</g:link>
							<li><i class="fa fa-circle"></i> <g:link class="create"
									action="create">Create ExamDetails </g:link>
						</ul>
					</div>
				</div>
				<br>
				
				<div class="box box-info">
					<div>
						<div class="" style="padding: 15px">
							<div class="row1">
								<div class="col-md-6">
									<g:if test="${examDetailsInstance?.examDate}">

										<span id="examDate-label" class="property-label"><g:message
												code="examDetails.examDate.label" default="Exam Date" /></span>

										<span class="property-value caption-subject bold uppercase"
											style="margin-left: 42px" aria-labelledby="examDate-label"><g:formatDate
												date="${examDetailsInstance?.examDate}" /></span>


									</g:if>
								</div>
								<div class="col-md-6">
									<g:if test="${examDetailsInstance?.examDuration}">

										<span id="examDuration-label" class="property-label"><g:message
												code="examDetails.examDuration.label"
												default="Exam Duration" /></span>

										<span class="property-value caption-subject bold uppercase"
											style="margin-left: 18px"
											aria-labelledby="examDuration-label"><g:fieldValue
												bean="${examDetailsInstance}" field="examDuration" /></span>


									</g:if>
								</div>
							</div>

							<div class="row1">
								<div class="col-md-6">
									<g:if test="${examDetailsInstance?.iclass}">

										<span id="iclass-label" class="property-label"><g:message
												code="examDetails.iclass.label" default="Iclass" /></span>

										<span class="property-value caption-subject bold uppercase"
											style="margin-left: 78px" aria-labelledby="iclass-label"><g:link
												controller="IClass" action="show"
												id="${examDetailsInstance?.iclass?.id}">
												${examDetailsInstance?.iclass?.classname?.encodeAsHTML()}
											</g:link></span>


									</g:if>
								</div>
								<div class="col-md-6">
									<g:if test="${examDetailsInstance?.passMarks}">

										<span id="passMarks-label" class="property-label"><g:message
												code="examDetails.passMarks.label" default="Pass Marks" /></span>

										<span class="property-value caption-subject bold uppercase"
											style="margin-left: 42px" aria-labelledby="passMarks-label"><g:fieldValue
												bean="${examDetailsInstance}" field="passMarks" /></span>


									</g:if>
								</div>
							</div>

							<div class="row1">

								<div class="col-md-6">
									<g:if test="${examDetailsInstance?.subject}">

										<span id="subject-label" class="property-label"><g:message
												code="examDetails.subject.label" default="Subject" /></span>

										<span class="property-value caption-subject bold uppercase"
											style="margin-left: 69px" aria-labelledby="subject-label"><g:link
												controller="subject" action="show"
												id="${examDetailsInstance?.subject?.id}">
												${examDetailsInstance?.subject?.subjectName?.encodeAsHTML()}
											</g:link></span>


									</g:if>
								</div>
								<div class="col-md-6">
									<g:if test="${examDetailsInstance?.totalMarks}">

										<span id="totalMarks-label" class="property-label"><g:message
												code="examDetails.totalMarks.label" default="Total Marks" /></span>

										<span class="property-value caption-subject bold uppercase"
											style="margin-left: 42px" aria-labelledby="totalMarks-label"><g:fieldValue
												bean="${examDetailsInstance}" field="totalMarks" /></span>


									</g:if>
								</div>
							</div>

							<div class="row1">

								<div class="col-md-6">
									<g:if test="${examDetailsInstance?.year}">

										<span id="year-label" class="property-label"><g:message
												code="examDetails.year.label" default="Year" /></span>

										<span class="property-value caption-subject bold uppercase"
											style="margin-left: 87px" aria-labelledby="year-label"><g:link
												controller="batch" action="show"
												id="${examDetailsInstance?.year?.id}">
												${examDetailsInstance?.year?.batchName?.encodeAsHTML()}
											</g:link></span>


									</g:if>
								</div>
							</div>
							<br>
							<g:form url="[resource:examDetailsInstance, action:'delete']"
								method="DELETE">
								<fieldset class="buttons">
									&nbsp;&nbsp;&nbsp;&nbsp;
									<g:link class="edit" action="edit"
										id="${LookUpED.encod(examDetailsInstance.id)}">
										<g:message code="default.button.edit.label" default="Edit" />
									</g:link>
									&nbsp;&nbsp;&nbsp;&nbsp;
									<g:actionSubmit class="delete btn blue" action="delete"
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
	<script>
		$("#snoAlertBox").fadeIn();
		window.setTimeout(function() {
			$("#snoAlertBox").fadeOut(2000)
		}, 3000);
	</script>
	<!-- END THEME LAYOUT SCRIPTS -->
</body>

</html>
