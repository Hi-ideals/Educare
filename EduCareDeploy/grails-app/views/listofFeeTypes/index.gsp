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
					model="[activ:[reports:'start active open',feetypes1:'active']]"></g:render>
			</div>
		</div>
		<div class="page-content-wrapper">
			<div class="page-content">

				<div class="page-bar">
					<ul class="page-breadcrumb">
						<li><a class="home" href="${createLink(uri: '/')}">Home</a> <i
							class="fa fa-circle"></i></li>
						<li><g:link action="create" controller="instFeeTypes">Create New Fee</g:link>
						</li>
					</ul>
				</div>
				<div class="panel">
					<div class="panel-body">
						<div class="row">
							<div class="col-md-12" id="hi">
								<div class="portlet light bordered">
									<div class="portlet-title">
										<div class="caption font-blue">
											<i class="icon-magnifier font-blue"></i> <span
												class="caption-subject bold uppercase"> Search For
												Fee List</span>
										</div>
									</div>
									<div class="portlet-body form">
										<button class="btn blue" id="classclick">
											<i class="icon-magnifier font-white"></i> By Class
										</button>
										<g:link controller="listofFeeTypes" class="btn btn-success"
											action="index">Get All Fees List</g:link>
										<div class="margin-bottom-10"></div>	
										<div id="class" style="display: none">
											<g:formRemote name="ssone" url="[action:'typeOfFees']"
												update="Changedisplay">
												<div class="row">
													<div class="col-md-4">
														<label>Class</label> <select name="iclass"
															class="form-control">
															<option value="">Select Class</option>
															<g:each in="${iclass}" var="cls">
																<option value="${cls?.id}">
																	${cls?.classname }
																</option>
															</g:each>
														</select>

													</div>
													<%--
											<div class="col-md-4">
												<label>Academic Year</label> 
												 <select class="form-control" name="academicyear">
														<option value="all">All</option>
														<g:each in="${batchList}" var="batch">
																<option value="${batch.batchName}">
																${batch.batchName }
															</option>
														</g:each>
													</select>
												</div>
											 --%>


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
								<div id="printableArea">

									<g:render template="/listofFeeTypes/feetypelist"></g:render>
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
		src="assets1/global/plugins/bootstrap-datepicker/js/jquery.ui.datepicker.js"></script>
	<script src="assets1/global/scripts/app.min.js" type="text/javascript"></script>
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
				$("#casting").hide(500);
				$("#genderid").hide(500);

			});

			$("#classclick").click(function() {
				$("#class").toggle(500);
				$("#Reg").hide(500);
				$("#date").hide(500);
				$("#casting").hide(500);
				$("#genderid").hide(500);

			});
			$("#dateclick").click(function() {
				$("#class").hide(500);
				$("#Reg").hide(500);
				$("#date").toggle(500);
				$("#casting").hide(500);
				$("#genderid").hide(500);

			});
			$("#castclick").click(function() {
				$("#class").hide(500);
				$("#Reg").hide(500);
				$("#date").hide(500);
				$("#casting").toggle(500);
				$("#genderid").hide(500);

			});
			$("#genderclick").click(function() {
				$("#class").hide(500);
				$("#Reg").hide(500);
				$("#date").hide(500);
				$("#casting").hide(500);
				$("#genderid").toggle(500);

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

