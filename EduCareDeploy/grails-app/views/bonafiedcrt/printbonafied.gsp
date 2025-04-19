
<%@ page import="com.hiideals.instituite.student.Student"%>
<!DOCTYPE html>

<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<head>
<meta charset="utf-8" />
<title>Hi-Educare | ${studentInstance?.studentName  }</title>
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
<link href="assets1/layouts/layout/css/custom.css" rel="stylesheet"
	type="text/css" />
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
<body
	class="page-header-fixed page-sidebar-closed-hide-logo page-content-white">
	<div class="page-header navbar navbar-fixed-top">
		<div class="page-header-inner ">
			<g:render template="/header/logo"></g:render>
			<g:render template="/header/topBar"></g:render>
		</div>
	</div>
	<div class="clearfix"></div>
	<div class="page-container">

		<div class="page-content-wrapper">
			<div class="page-content">


				<br>
				<div class="row">
					<div class="col-md-12">
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
													<h3>
														${instituite?.name }
													</h3> <small>Affiliated to: ${instituite?.affiliatedTo }</small></li>
											</ul>
										</div>
									</div>

									<hr>
									<div class="row">
										<div class="col-md-6">
											<div class="pull-left">

												<h4>
													Serial No: <strong>
														${bncert.id}
													</strong>
												</h4>
											</div>

										</div>
										<div class="col-md-6">
											<div class="pull-right">
												<h4>
													Registration.No: <strong>
														${stbonafieddetails?.registrationNo}
													</strong>
												</h4>
											</div>
										</div>
									</div>
									<div class="row">
										<div class="certificate">
											<div class="text-center">
												<div class="headline1">
													<h2>Bonafied Certificate</h2>
												</div>
											</div>
											<br>
											<div class="col-md-12">
												<p>
													This is to certify that <span>
														${bncert?.stname}
													</span> S/o/D/o Mr. <span>
														${bncert?.stfathername}
													</span> is a bonafied Student of <span>
														${instituite?.name}
													</span> Class / Section <span>
														${bncert?.stclass}
													</span> He/She is/was <span>
														${bncert?.stcharacter}
													</span> at our Institute <span>
														${instituite?.name}
													</span> Academic Year <span>
														${bncert.academicyr}
													</span>
												</p>
											</div>
										</div>
									</div>

									<div class="row">
										<div class="col-md-6">
											<div class="pull-left">
												<ul class="list-unstyled">
													<li>Place: <strong>Bidar</strong></li>
													<li>Date: <strong>
															${bncert?.issueddate}
													</strong></li>
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
						<g:link class="btn blue" controller="bonafiedcrt" action="index">Back</g:link>
						<button class="btn blue" id="printPageButton"
							onClick="window.print();">
							<i class="fa fa-print"></i> Print
						</button>
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

