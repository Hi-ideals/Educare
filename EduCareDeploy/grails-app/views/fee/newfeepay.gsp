<%@ page import="com.hiideals.instituite.feemanagment.Fee"%>
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
				<g:render template="/header/leftSide"
					model="[activ:[feeStructure:'start active open',fee:'active']]"></g:render>
			</div>
		</div>
		<div class="page-content-wrapper">
			<div class="page-content">

				<div class="page-bar">
					<ul class="page-breadcrumb">
						<li><a href="${createLink(uri: '/')}">Home</a> <i
							class="fa fa-circle"></i></li>
						<li><a>Fee Details</a></li>
					</ul>

				</div>
				<g:if test="${params.paid==false}">
					<h3 class="page-title">
						Name of the Student:
						${feeInstance?.studentId?.studentName}
					</h3>
				</g:if>
				<g:else>
				</g:else>
				<div class="row">
					<div class="col-md-12">
						<div id="edit-fee" class="content scaffold-edit" role="main">
							<g:if test="${flash.message}">
								<div class="message" role="status">
									${flash.message}
								</div>
							</g:if>
							<g:hasErrors bean="${feeInstance}">
								<ul class="errors" role="alert">
									<g:eachError bean="${feeInstance}" var="error">
										<li
											<g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message
												error="${error}" /></li>
									</g:eachError>
								</ul>
							</g:hasErrors>
							<g:if test="${params.paid==false}">
								<g:form url="[resource:feeInstance, action:'newFeeupdate']"
									method="PUT">

									<g:hiddenField name="version" value="${feeInstance?.version}" />
									<fieldset class="form">
										<g:render template="newfeeform" model="[edit:'true']" />
									</fieldset>
									<fieldset class="pull-right">
										<g:actionSubmit class="btn blue" action="newFeeupdate"
											value="${message(code: 'default.button.update.label', default: 'Update')}" />
									</fieldset>
								</g:form>
							</g:if>
							<g:else>
								<g:render template="instaFeePayPrintTemplate" />
							</g:else>
						</div>

						<script type="text/javascript">
							$('#sum_table tr:first td')
									.each(
											function() {
												var $td = $(this);

												var colTotal = 0;
												$(
														'#sum_table tr:not(:first,.totalColumn)')
														.each(
																function() {
																	if ($td
																			.index() != 0
																			&& $td
																					.index() != 1
																			&& $td
																					.index() != 5)
																		colTotal += parseInt(
																				$(
																						this)
																						.children()
																						.eq(
																								$td
																										.index())
																						.html(),
																				10);

																});
												if ($td.index() != 0
														&& $td.index() != 1
														&& $td.index() != 5)
													$(
															'#sum_table tr.totalColumn')
															.children()
															.eq($td.index())
															.html(
																	'Total: '
																			+ colTotal);
											});
						</script>
						<script type="text/javascript">
							function doMath(vv) {
								// Capture the entered values of two input boxes
								var nn = vv.name.split("_")[1]
								var totalamount = document
										.getElementById('totalamount-' + nn).value;
								var payamount = document
										.getElementById('payamount_' + nn).value;
								var amountPaid = document
										.getElementById('amountPaid_' + nn).value;

								// Add them together and display
								var pp = parseInt(payamount)
										+ parseInt(amountPaid)
								var sum = parseInt(totalamount) - pp;

								document.getElementById('paid_' + nn).innerHTML = pp;
								document.getElementById('result_' + nn).innerHTML = sum;

								$('#sum_table tr:first td')
										.each(
												function() {
													var $td = $(this);

													var colTotal = 0;
													$(
															'#sum_table tr:not(:first,.totalColumn)')
															.each(
																	function() {
																		if ($td
																				.index() != 0
																				&& $td
																						.index() != 1
																				&& $td
																						.index() != 5)
																			colTotal += parseInt(
																					$(
																							this)
																							.children()
																							.eq(
																									$td
																											.index())
																							.html(),
																					10);

																	});
													if ($td.index() != 0
															&& $td.index() != 1
															&& $td.index() != 5)
														$(
																'#sum_table tr.totalColumn')
																.children()
																.eq($td.index())
																.html(
																		'Total: '
																				+ colTotal);

													var totalPaid = 0;
													var due = 0;
													var totalFee = 0;
													if ($td.index() == 3) {
														totalPaid = colTotal;
														$('#totalPaid').val(
																totalPaid);
													}

													if ($td.index() == 4) {
														due = colTotal;
														$('#pending').val(due);
													}

													if ($td.index() == 2) {
														totalFee = colTotal;
														$('#totalFee').val(
																totalFee);
													}

												});
							}
						</script>


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

