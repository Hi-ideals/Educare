
<%@ page import="com.hiideals.instituite.student.Student"%>
<!DOCTYPE html>

<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<!-- BEGIN HEAD -->

<head>
<meta charset="utf-8" />
<title>Hi-Educare | ${studentInstance?.studentName  }</title>
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
<link href="assets1/layouts/layout/css/custom.css" rel="stylesheet"
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

@media ( min-width : 992px) {
	.page-content {
		margin-left: 0px !important;
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

			<g:render template="/header/topBar"></g:render>
		</div>
	</div>
	<!-- END HEADER -->
	<!-- BEGIN HEADER & CONTENT DIVIDER -->
	<div class="clearfix"></div>
	<div class="page-container">

		<div class="page-content-wrapper">
			<!-- BEGIN CONTENT BODY -->
			<div class="page-content">


				<div class="panel">
					<div class="panel-body">
						<div class="row">
							<div class="col-md-12">
								<!-- BEGIN SAMPLE FORM PORTLET-->
								<div class="portlet light bordered">

									<div class="portlet-body form">
										<div class="crtfcte">
											<div class="text-center">
												<div class="">
													<ul class="list-unstyled">
														<li><images:getImage id="${instituite?.logo?.id}"
																width="100px" />
														</li>
														<li>		
															<h2>
																${instituite?.name }
															</h2>
															 <p>Affiliated to: ${instituite?.affiliatedTo }</p>
															 <p>${instituite?.hsno} ${instituite?.street}
																${instituite?.city}-${instituite?.pinCode} ${instituite?.state}
																${instituite?.country} Ph:${instituite?.phone}
														</p></li>
													</ul>
												</div>
											</div>

											<hr>

											<div class="row">

												<div class="certificate">
													<div class="col-md-12">
														
														<div style="background:#3a3131; display:block; width: 261px;
    margin: auto;">
														<h4 style="text-decoration:underline;text-align:center; padding:10px 30px; font-family:roboto-condensed; color:#fff; text-transform:uppercase">
															<b>Report Card </b>
														</h4>
														
														</div>
														<div class="portlet-body">
															<div class="table-responsive">
															<table class="table table-bordered">
																<tr>
																	<td width="20%">Registration Number</td>
																	<td><b>${exams?.student?.registrationNo[0]}</b></td>
																	<td>Academic Year</td>
																	<td><b>${exams?.examDetails.year.batchName[0]}</b></td>
																</tr>
																<tr>
																	<td>Student Name</td>
																	<td><b>${exams?.student?.studentName[0]}</b></td>
																	<td>Father Name </td>
																	<td><b>${exams?.student?.fatherDetails?.parentName[0]}</b></td>
																</tr>
																
																<tr>
																	<td>Student ID</td>
																	<td><b>${exams?.student?.studentId[0]}</b></td>
																	<td>Class</td>
																	<td><b>${academicyr?.presentclass?.classname}</b></td>
																</tr>
																<tr>
																	<td>Section</td>
																	<td><b>${academicyr?.section?.sectionName}</b></td>
																	<td>Exam</td>
																	<td><b>${exams?.examDetails?.exam?.examName[0]}</b></td>
																</tr>
																
																
															</table>
															 </div>
															<div class="table-scrollable">
																<table class="table  table-hover">
																	<tr>
																		<th style="color: #337ab7;">Subjects</th>
																		<th style="color: #337ab7;">Date</th>
																		<th style="color: #337ab7;">Total Marks</th>
																		<th style="color: #337ab7;">Pass Marks</th>
																		<th style="color: #337ab7;">Marks Obtained</th>
																	</tr>
																	<g:each in="${exams}" status="i" var="examdetails">
																		<tr>

																			<td>
																				<div class="fieldcontain">
																					${examdetails?.examDetails?.subject?.subjectName}
																					<input name="examdetails" type="hidden"
																						value="${examdetails?.id}" />
																				</div>
																			</td>

																			<td>
																				<div class="fieldcontain">
																					<g:formatDate
																						date="${examdetails?.examDetails?.examDate}"
																						type="date" style="LONG" timeStyle="SHORT" />
																				</div>
																			</td>


																			<td>
																				<div class="fieldcontain">
																					${examdetails?.examDetails?.totalMarks}
																				</div>
																			</td>

																			<td>
																				<div class="fieldcontain">
																					${examdetails?.examDetails?.passMarks}
																				</div>
																			</td>

																			<td>
																				<div class="fieldcontain">
																					${examdetails?.obtainedMarks}
																					<script>
/*-----------validation for student-------------*/
 $(document).ready(function() {
	$('#marks').click(function() {
		var input = $('#obtainedMarks${i}').val();
		if (input == '') {
			$('#MobtainedMarks${i}').show();
		} else if (!input.match(/^[0-9.,%]{1,}$/)) {
			$('#MobtainedMarks1${i}').show();
			return false;
		} else {
			$('#MobtainedMarks${i}').hide();
			$('#MobtainedMarks1${i}').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="obtainedMarks${i}"]').on('change', function() {
		var input = $('#obtainedMarks${i}').val();
		if (input == '') {
			$('#MobtainedMarks1${i}').hide();
			$('#MobtainedMarks${i}').show();
		} else if (!input.match(/^[0-9.,%]{1,}$/)) {
			$('#MobtainedMarks1${i}').show();
			$('#MobtainedMarks${i}').hide();
		} else {
			$('#MobtainedMarks${i}').hide();
			$('#MobtainedMarks1${i}
																				')
																																	.hide();
																														}
																													});
																								});
																			</script>
																					<div id="MobtainedMarks${i}"
																						style="display: none; color: red">Provide
																						your Obtained Marks</div>
																					<div id="MobtainedMarks1${i}"
																						style="display: none; color: red">Obtained
																						Marks should be only number</div>
																				</div>
																			</td>
																		</tr>
																	</g:each>
																	<tr style="color: #337ab7">
																		<td><b></b></td>
																		<td><b>Total :</b></td>
																		<td><b> ${exams.sum{it.examDetails?.totalMarks}}</b></td>
																		<td><b> ${exams.sum{it.examDetails?.passMarks}}</b></td>
																		<td><b> ${exams.sum{it.obtainedMarks}}</b></td>
																		<td colspan="1"></td>
																	</tr>



																</table>
															</div>

														</div>

													</div>
												</div>
											</div>
											<br> <br>
											<div class="row">
												<div class="col-md-6">
													<div class="pull-left">
														<ul class="list-unstyled">

															<li>Place: <strong>Bidar</strong></li>
														</ul>
													</div>

												</div>
												<div class="col-md-6">
													<div class="pull-right">
														<ul class="list-unstyled">
															<li>Office Seal</li>
														</ul>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>

							<div class="col-md-12 text-center" id="printPageButton">
								<input type="button" class="btn blue" value="Close"
									onclick="self.close()">
								<button class="btn blue" id="printPageButton"
									onClick="window.print();">
									<i class="fa fa-print"></i> Print
								</button>
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
	
	<script src="assets1/global/scripts/app.min.js" type="text/javascript"></script>
	
	<script src="assets1/layouts/layout/scripts/layout.min.js"
		type="text/javascript"></script>
</body>

</html>
																
