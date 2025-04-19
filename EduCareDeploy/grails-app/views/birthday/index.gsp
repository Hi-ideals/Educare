
<%@ page import="com.hiideals.instituite.classcourses.IClass"%>
<%@ page import="com.hiideals.instituite.EDcoding.LookUpED"%>
<!DOCTYPE html>

<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
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
<link
	href="assets1/global/plugins/bootstrap-datepicker/css/bootstrap-datepicker6.min.css"
	type="text/css" rel="stylesheet">
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
					model="[activ:[BirthDays:'start active open',BirthDays:'active']]"></g:render>
			</div>
		</div>
		<div class="page-content-wrapper">
			<div class="page-content">

				<div class="page-bar">
					<ul class="page-breadcrumb">
						<li><i class="fa fa-circle"></i><a class="home"
							href="${createLink(uri: '/')}"><g:message
									code="default.home.label" /></a></li>
					</ul>
				</div>
				<div class="panel">
					<div class="panel-body">
						<div class="row">
							<div class="col-md-12">

								<g:form controller="birthday">
									<div class="row">
										<div class="col-md-3">
											<input type="text" class="form-control" name="messgae"
												value="" placeholder="Write a msg ">
										</div>
										<g:actionSubmit class="btn blue" action="bday"
											value="Send to all"></g:actionSubmit>

									</div>
								</g:form>
								<br> <br>

								<div class="portlet box grey">
									<div class="portlet-title">
										<div class="caption">
											<i class="fa fa-birthday-cake"></i>Birthdays
										</div>
									</div>
									<div class="portlet-body">
										<div class="table-scrollable">
											<table class="table table-bordered table-hover">
												<tr>

													<th>Student Name</th>
													<th>Date Of Birth</th>
													<th>Send Message</th>
													<%--
     <th>objectid</th>
  --%>
												</tr>


												<g:each in="${bdays}" var="c" status="j">
													<tr>
														<td>
															${c?.studentName}
														</td>

														<td><g:formatDate date="${c?.studentDOB}" type="date"
																style="SHORT" /></td>

														<td><g:form controller="birthday">
																<input type="hidden" name="id" value="${c?.id }">
																<input type="text" name="messgae" value=""
																	placeholder="        Write a msg ">
																<g:actionSubmit value="send " action="stubday" />
															</g:form></td>
													</tr>
												</g:each>
											</table>
										</div>
									</div>
								</div>


								<div class="portlet-body form">
									<button class="btn yellow" id="dateclick">
										<i class="icon-magnifier font-white"></i> Search By Date
									</button>
									<div id="date" style="display: none">
										<g:formRemote name="ss" url="[action:'bydate']"
											update="Changedisplay">
											<div class="row">

												<div class="col-md-4">
													<label>From</label> <input type="text" name="from"
														id="datepicker" class="form-control date-picker">
												</div>
												<div class="col-md-4">
													<label>To</label> <input type="text" name="to"
														id="datepicker1" class="form-control date-picker"
														value="${params.to}">
												</div>
												<input type="hidden" value="asc" name="orderd">

												<div class="col-md-4">
													<g:submitButton name="Search" class="btn green"
														style="margin-top: 22px" />
												</div>
											</div>

										</g:formRemote>
										<div class="margin-bottom-10"></div>
									</div>
									
									<div class="col-md-12" id="Changedisplay"></div>

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
	<script
		src="assets1/global/plugins/bootstrap-datepicker/js/jquery.ui.datepicker.js"></script>
	<script src="assets1/global/scripts/app.min.js" type="text/javascript"></script>
	<script src="assets1/layouts/layout/scripts/layout.min.js"
		type="text/javascript"></script>
	<script type="text/javascript">
		$('document').ready(function() {
			$("#dateclick").click(function() {
				$("#date").toggle(500);
			});
		});
	</script>
	<script>
		$("#snoAlertBox").fadeIn();
		window.setTimeout(function() {
			$("#snoAlertBox").fadeOut(2000)
		}, 3000);
	</script>
	<script type="text/javascript">
		$(function() {
			$(".date-picker").datepicker({
				changeMonth : true,
				changeYear : true,
				yearRange : "1800:3000",
			});
		});
	</script>
</body>

</html>

