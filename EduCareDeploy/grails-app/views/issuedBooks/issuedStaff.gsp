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

	<div class="clearfix"></div>
	<div class="page-container">
		<div class="page-sidebar-wrapper">
			<div class="page-sidebar navbar-collapse collapse">
				<g:render template="/header/leftSide"
					model="[activ:[BooksReport:'start active open',issuedStaffs:'active']]"></g:render>

			</div>

		</div>
		<div class="page-content-wrapper">

			<div class="page-content">
				<div class="page-bar">
					<ul class="page-breadcrumb">
						<li><a class="home" href="${createLink(uri: '/')}">Home</a></li>
					</ul>
				</div>
				<div class="panel">
					<div class="panel-body">
						<div class="row">
							<div class="col-md-12">
								<div class="portlet box grey">
									<div class="portlet-title">
										<div class="caption">
											<i class="fa fa-user"></i>List Books Issued to Staff
										</div>
									</div>
									<div class="portlet-body">
										<div class="table-scrollable">
											<table class="table table-striped table-hover table-bordered"
												id="sample_editable_1">
												<tr>
													<th>Accession number</th>
													<th>Staff Id</th>
													<th>Staff Member name</th>
													<th>Book Issued</th>
													<th>Date OF Issue</th>
													<th>Date OF Return</th>


													<g:each in="${issuedToStaff}">

														<tr>
															<td>
																${it.books?.accessionNumber.toString().replace('[', '').replace(']', '')}
															</td>
															<td>
																${it.staffId.staffID }
															</td>
															<td>
																${it.staffId.staffName }
															</td>
															<td>
																${it.books?.title.toString().replace('[', '').replace(']', '')}
															</td>

															<td>
																${it.dateOfIssue }
															</td>

															<td>
																${it.dateOfReturn }
															</td>

														</tr>


													</g:each>
											</table>
										</div>
									</div>
								</div>
								<div style="text-align: center">
									<g:link class="btn blue" controller="issuedBooks"
										action="booksIssuedstaff" target='_blank'>Get Print</g:link>
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

			});

			$("#classclick").click(function() {
				$("#class").toggle(500);
				$("#Reg").hide(500);
				$("#date").hide(500);

			});
			$("#dateclick").click(function() {
				$("#class").hide(500);
				$("#Reg").hide(500);
				$("#date").toggle(500);

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

</body>

</html>





