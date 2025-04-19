
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
<link href="assets1/layouts/layout/css/custom.css" rel="stylesheet"
	type="text/css" />
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

	<div class="page-container">

		<div class="page-content-wrapper">

			<div class="page-content">

				<div class="container">
					<div class="row">

						<div class="col-md-12">
							<div class="crtfcte" style="margin-bottom: 5px">
								<div class="well">
									<div class="text-center">
										<ul class="list-unstyled" >
											<li><images:getImage id="${instituite?.logo?.id}"
													 width="100px"/></li>
											<li>
												<h2 class="page-title" style="color: #000">
													${instituite?.name }
													<br> <small>Affiliated to: ${instituite?.affiliatedTo }</small>
												</h2>

											</li>
										</ul>
										<div class="certitle">
											<div class="certitlebor">
												<h3>TRANSFER CERTIFICATE</h3>
											</div>
										</div>
										<br>
									</div>

									<div class="row">

										<div class="col-md-12">
											<div class="table-responsive">
												<table class="table table-bordered">
													<tr>
														<td width="15%">Institute Name:</td>
														<th>
															${tcdocument?.instName}
														</th>

														<td width="15%">Admission No:</td>
														<th>
															${tcdocument?.admissionnumber}
														</th>
													</tr>
													<tr>
														<td width="15%">Name</td>
														<th>
															${tcdocument?.stName}
														</th>
														<td width="15%">Date Of Birth</td>
														<th>
															${tcdocument?.stDOB}
														</th>
													</tr>
													<tr>
														<td width="15%">Mother</td>
														<th>
															${tcdocument?.stmotherName}
														</th>
														<td width="15%">Father</td>
														<th>
															${tcdocument?.stfatherName}
														</th>
													</tr>
													<tr>
														<td width="15%">Religion</td>
														<th>
															${tcdocument?.stReligion}
														</th>
														<td width="15%">Nationality</td>
														<th>
															${tcdocument?.stNationality}
														</th>
													</tr>
													<tr>
														<td width="15%">Gender</td>
														<th>
															${tcdocument?.stGender}
														</th>
														<td width="15%">Category</td>
														<th>
															${tcdocument?.stCategory}
														</th>
													</tr>
													<tr>
														<td>Class</td>
														<th>
															${tcdocument?.stClass}
														</th>
														<td>Section</td>
														<th>
															${tcdocument?.stSection}
														</th>
													</tr>

													<tr>
														<td>Medium of Instruction</td>
														<th>
															${tcdocument?.mediumofInstruction}
														</th>
														<td>Admission Date</td>
														<th>
															${tcdocument?.stadmissionDate}
														</th>
													</tr>
													<tr>
														<td>Whether Qualified for promotion to higher
															standard ?</td>
														<th>
															${tcdocument?.stPromotion}
														</th>
														<td>Whether Candidate has paid all the fee ?</td>
														<th>
															${tcdocument?.stfeePaid}
														</th>
													</tr>
													<tr>
														<td>Scholarship if any</td>
														<th>
															${tcdocument?.stScholarship}
														</th>
														<td>Medically Examined or not</td>
														<th>
															${tcdocument?.stmedicalExamine}
														</th>
													</tr>
													<tr>
														<td>TC Issued date</td>
														<th>
															${tcdocument?.stTcissuedate}
														</th>
														<td>Date of candidate's last attendance</td>
														<th>
															${tcdocument?.stlastattendancedate}
														</th>
													</tr>
													<tr>
														<td>Number of school days up to the date of leaving</td>
														<th>
															${tcdocument?.noOfschoolDays}
														</th>
														<td>Number of school days the candidates attendant</td>
														<th>
															${tcdocument?.noOfstattendanceDays}
														</th>
													</tr>
													<tr>
														<td>Character & Conduct</td>
														<th>
															${tcdocument?.stCharacterconduct}
														</th>
														<td colspan="2"></td>
													</tr>


												</table>
												<table class="table table-bordered">
													<tr>
														<td>Clerk :</td>
														<th></th>
														<td>Class Teacher :</td>
														<th></th>
														<td>Principal :</td>
														<th></th>
													</tr>
												</table>
											</div>

										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<!-- END PAGE TITLE-->
					<!-- END PAGE HEADER-->
					<!-- BEGIN DASHBOARD STATS 1-->
					<!-- <div id="background">
  <p id="bg-text">Hi-ideals technologies pvt ltd.</p>
	</div> -->




					<div class="row">
						<div class="col-md-12 text-center" id="printPageButton">
							<g:link class="btn blue" controller="transfercertificate"
								action="index">Back</g:link>
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


