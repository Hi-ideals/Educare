<%@ page import="com.hiideals.instituite.classcourses.IClass"%>
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

<link href="assets1/layouts/layout/css/custom.css" rel="stylesheet"
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

<style type="text/css">
@media print {
	#printPageButton {
		display: none;
	}
	#printlogoButton {
		display: inline;
	}
}
</style>

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
					model="[activ:[studentInfo:'start active open',studentList:'active']]"></g:render>
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
						<li><g:link action="create" controller="student">Create New Student</g:link>
						</li>


					</ul>

				</div>
				<h3 class="page-title">Student List</h3>
				<div class="row">
					<div class="col-md-12" id="hi">
						<div class="portlet light bordered">
							<div class="portlet-title">
								<div class="caption font-green">
									<i class="icon-magnifier font-green"></i> <span
										class="caption-subject bold uppercase"> Search For
										Student</span>
								</div>

							</div>
							<div class="portlet-body form">
								<g:formRemote name="ssone" url="[action:'getStaffsAndStudents']"
									update="Changedisplay">
									<div class="row">
										<div class="col-md-4">
											<label>Student/Staff</label> <select name="type" id="type"
												onchange="smsfunc1()" class="form-control">
												<option value="all">Select staff/student</option>
												<option value="student">Student</option>
												<option value="staff">Staff</option>
											</select>
										</div>
										<div class="col-md-4" id="staff" style="display: none">
											<label>Staff</label> <select name="staff"
												class="form-control" id="staffvalue">
												<option value="all">All</option>
												<g:each in="${staffs}" var="staff">
													<option value="${staff?.id}">
														${staff?.staffName}
													</option>
												</g:each>
											</select>
										</div>
										<div class="col-md-4" id="classes" style="display: none">
											<label>Class</label> <select name="classes"
												class="form-control" id="classesvalue">
												<option value="all">All</option>
												<g:each in="${classes}" var="cls">
													<option value="${cls?.id}">
														${cls?.classname}
													</option>
												</g:each>
											</select>
										</div>
										<div class="col-md-4" id="student" style="display: none">
											<label>Student</label> <select name="student"
												class="form-control" id="studentvalue">
												<option value="all">All</option>
												<g:each in="${students}" var="student">
													<option value="${student?.id}">
														${student?.studentName}
													</option>
												</g:each>
											</select>
										</div>
										
										<div class="col-md-4">
											<g:submitButton name="Search" class="btn green"
												style="margin-top: 22px" />
										</div>
									</div>
								</g:formRemote>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12" id="Changedisplay">
					<g:if test="${params.student}">
						<g:render template="listofstudenttable"></g:render>
					</g:if>
					<g:if test="${params.staff}">
						<g:render template="listofstafftable"></g:render>
					</g:if>
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
	function smsfunc1(){
				var type = document.getElementById('type').value
				if (type == 'staff') {
					document.getElementById("studentvalue").value='';
					 document.getElementById("classesvalue").value='';
					 document.getElementById("staff").style.display = 'block';
					 document.getElementById('student').style.display = 'none';
					 document.getElementById('classes').style.display = 'none';
				} else {
					document.getElementById("staffvalue").value='';
					 document.getElementById('student').style.display = 'block';
					 document.getElementById('staff').style.display = 'none';
					 document.getElementById('classes').style.display = 'block';
				}
				
				
			}
	</script>
	<!-- END THEME LAYOUT SCRIPTS -->
</body>

</html>

