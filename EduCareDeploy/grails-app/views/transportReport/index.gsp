<%@ page import="com.hiideals.instituite.classcourses.IClass"%>
<%@ page import="com.hiideals.instituite.EDcoding.LookUpED"%>
<%@ page import="com.hiideals.transport.VehicleDetails"%>
<%@ page import="com.hiideals.transport.RouteDetails"%>
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
<link
	href="assets1/global/plugins/bootstrap-datepicker/css/bootstrap-datepicker6.min.css"
	type="text/css" rel="stylesheet">
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
					model="[activ:[TransportManagement:'start active open',TransportFeer:'active']]"></g:render>
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

				<div class="panel">
					<div class="panel-body">

						<div class="row">
							<div class="col-md-12" id="hi">
								<div class="box box-info">
									<div class="portlet light bordered">
										<div class="portlet-title">
											<div class="caption font-blue">
												<i class="icon-magnifier font-blue"></i> <span
													class="caption-subject bold uppercase"> Search For
													Transport Details</span>
											</div>

										</div>
										<div class="portlet-body form">

											<button class="btn green" id="regclick">
												<i class="icon-magnifier font-white"></i> By Available
												Vehicles
											</button>
											<button class="btn blue" id="classclick">
												<i class="icon-magnifier font-white"></i> By Available
												Drivers
											</button>
											<button class="btn yellow" id="dateclick">
												<i class="icon-magnifier font-white"></i> By Available Route
											</button>
											<button class="btn green" id="castclick">
												<i class="icon-magnifier font-white"></i> By Student/staff
												Wise
											</button>
											<button class="btn green" id="yearclick">
												<i class="icon-magnifier font-white"></i> By Transportation
												Fees
											</button>
											<div class="margin-bottom-10"></div>
											<div id="Reg" style="display: none">
												<g:formRemote name="ss" url="[action:'availableVehicles']"
													update="Changedisplay">
													<div class="row">
														<div class="col-md-4">
															<label>Select Vehicle No.</label> <select id="vehicleNo"
																name="vehicle.id" class="form-control">
																<option value="all">All</option>
																<g:each
																	in="${com.hiideals.transport.VehicleDetails.list()}"
																	var="veh">
																	<option value="${veh?.vehicleNo}">
																		${veh?.vehicleNo}
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
											<div id="class" style="display: none">
												<g:formRemote name="ss" url="[action:'availableDrivers']"
													update="Changedisplay">
													<div class="row">
														<div class="col-md-4">
															<label>Select Driver </label> <select id="driverNo"
																name="driver.id" class="form-control">
																<option value="all">All</option>
																<g:each
																	in="${com.hiideals.transport.DriverDetails.list()}"
																	var="driver">
																	<option value="${driver?.name}">
																		${driver?.name}
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
											<div id="date" style="display: none">
												<g:formRemote name="ss" url="[action:'availableRoutes']"
													update="Changedisplay">
													<div class="row">
														<div class="col-md-4">
															<label>Select Route </label> <select id="routeNo"
																name="route.id" class="form-control">
																<option value="all">All</option>
																<g:each
																	in="${com.hiideals.transport.RouteDetails.list()}"
																	var="route">
																	<option value="${route?.routeCode}">
																		${route?.routeCode}
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

											<div id="cast" style="display: none">
												<g:formRemote name="sscast"
													url="[action:'transportAllocation']" update="Changedisplay">
													<div class="row">

														<div class="col-md-3">
															<label>Select Options</label> <select name="type"
																class="form-control">
																<option value="all">All</option>
																<option value="Students">Students</option>
																<option value="Staff">Staff</option>
															</select>
														</div>

														<div class="col-md-3">
															<label>Select Route </label> <select id="routeNo"
																name="route.id" class="form-control">
																<option value="all">All</option>
																<g:each
																	in="${com.hiideals.transport.RouteDetails.list()}"
																	var="route">
																	<option value="${route?.routeCode}">
																		${route?.routeCode}
																	</option>
																</g:each>
															</select>
														</div>

														<input type="hidden" value="asc" name="orderd">

														<div class="col-md-3">
															<g:submitButton name="Search" class="btn green"
																style="margin-top: 22px" />
														</div>
													</div>

												</g:formRemote>
											</div>

											<div id="yearclass" style="display: none">
												<g:formRemote name="kk" url="[action:'transportFeedetails']"
													update="Changedisplay">

													<div class="row">

														<div class="col-md-4">
															<label>Select Search Type</label> <select id="searchType"
																name="type" class="form-control">
																<option value="student">By Student</option>
																<option value="staff">By Staff</option>
															</select>
														</div>




														<div class="col-md-4">
															<label>Select Academic year</label> <select
																class="form-control" name="academicyear"
																id="academicyear" required="required">
																<option value="">Select Academic Year</option>
																<g:each in="${batchList}" var="batch">
																	<option value="${batch.id}">
																		${batch.batchName}
																	</option>
																</g:each>
															</select>
														</div>


														<div class="col-md-4">
															<label>Enter Name</label> <input type="text"
																class="form-control" name="Name"
																placeholder="Enter Name" />
														</div>

														<input type="hidden" value="asc" name="orderd">

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
							</div>

							<div class="col-md-12" id="Changedisplay">
								<div id="printableArea">
									<%--
							<g:render template="/student/studentlistable"></g:render>
							 --%>
								</div>



								<%--<div class="text-center">
							<a onclick="printDiv('printableArea','printlogoButton')" class="btn btn-primary"><i class="fa fa-print"></i> Take Print</a>
						</div>
					--%>
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

	<script type="text/javascript">
		function doMath() {
			// Capture the entered values of two input boxes
			var totalamount = document.getElementById('totalamount').value;
			var payamount = document.getElementById('payamount').value;

			// Add them together and display
			var sum = parseInt(totalamount) - parseInt(payamount);

			document.getElementById('paid').innerHTML = payamount;
			document.getElementById('result').innerHTML = sum;
		}
	</script>


	<script src="assets1/global/plugins/jquery.min.js"
		type="text/javascript"></script>
	<script src="assets1/pages/scripts/jquery-ui.min.js"
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
	<script
		src="assets1/global/plugins/bootstrap-datepicker/js/jquery.ui.datepicker.js"></script>

	<!-- END PAGE LEVEL PLUGINS -->
	<!-- BEGIN THEME GLOBAL SCRIPTS -->
	<script src="assets1/global/scripts/app.min.js" type="text/javascript"></script>
	<!-- END PAGE LEVEL SCRIPTS -->
	<!-- BEGIN THEME LAYOUT SCRIPTS -->
	<script src="assets1/layouts/layout/scripts/layout.min.js"
		type="text/javascript"></script>
	<script type="text/javascript">
		$('#sum_table tr:first td').each(
				function() {
					var $td = $(this);

					var colTotal = 0;
					$('#sum_table tr:not(:first,.totalColumn)').each(
							function() {
								colTotal += parseInt($(this).children().eq(
										$td.index()).html(), 10);
							});

					$('#sum_table tr.totalColumn').children().eq($td.index())
							.html('Total: ' + colTotal);
				});
	</script>

	<script type="text/javascript">
		$('document').ready(function() {
			$("#regclick").click(function() {
				$("#Reg").toggle(500);
				$("#class").hide(500);
				$("#date").hide(500);
				$("#cast").hide(500);
				$("#yearclass").hide(500);

			});

			$("#classclick").click(function() {
				$("#class").toggle(500);
				$("#Reg").hide(500);
				$("#date").hide(500);
				$("#cast").hide(500);
				$("#yearclass").hide(500);
			});
			$("#dateclick").click(function() {
				$("#class").hide(500);
				$("#Reg").hide(500);
				$("#date").toggle(500);
				$("#cast").hide(500);
				$("#yearclass").hide(500);
			});
			$("#castclick").click(function() {
				$("#class").hide(500);
				$("#Reg").hide(500);
				$("#date").hide(500);
				$("#cast").toggle(500);
				$("#yearclass").hide(500);
			});
			$("#yearclick").click(function() {
				$("#class").hide(500);
				$("#Reg").hide(500);
				$("#date").hide(500);
				$("#cast").hide(500);
				$("#yearclass").toggle(500);
			});
		});
	</script>

	<script>
		$(document).ready(function() {
			$("#datepicker").datepicker({
				changeYear : true,
				changeMonth : true,
				onSelect : function() {
					$("#datepicker").focusout()
				}
			});

			$("#datepicker1").datepicker({
				changeYear : true,
				changeMonth : true,
				onSelect : function() {
					$("#datepicker").focusout()
				}
			});

			$("#datepicker2").datepicker({
				changeYear : true,
				changeMonth : true,
				onSelect : function() {
					$("#datepicker").focusout()
				}
			});

			$("#datepicker3").datepicker({
				changeYear : true,
				changeMonth : true,
				onSelect : function() {
					$("#datepicker").focusout()
				}
			});

		});
	</script>

	<script type="text/javascript">
		function printDiv(akash) {
			var printContents = document.getElementById(akash).innerHTML;
			var originalContents = document.body.innerHTML;

			document.body.innerHTML = printContents;

			window.print();

			document.body.innerHTML = originalContents;
		}
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
	<!-- END THEME LAYOUT SCRIPTS -->
</body>

</html>

