<%@ page import="com.hiideals.instituite.feemanagment.InstFeeTypes"%>
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
					model="[activ:[issueDetailsManagement:'start active open',issueDetails1:'active']]"></g:render>

			</div>
		</div>

		<div class="page-content-wrapper">
			<div class="page-content">

				<div class="page-bar">
					<ul class="page-breadcrumb">
						<li><i class="fa fa-circle"></i><a class="home"
							href="${createLink(uri: '/')}"><g:message
									code="default.home.label" /></a></li>
						<li><i class="fa fa-circle"></i> <g:link class="list"
								action="index">
								Lists
							</g:link></li>
						<li><i class="fa fa-circle"></i> <g:link class="create"
								action="create">
								Issue to Student/Staff
							</g:link></li>
					</ul>
				</div>
				<div class="panel">
					<div class="panel-body">
						<div class="row">
							<div class="col-md-12">
								<div id="edit-issueDetails" class="content scaffold-edit"
									role="main">

									<g:if test="${flash.message}">
										<div class="message" role="status">
											${flash.message}
										</div>
									</g:if>
									<g:hasErrors bean="${issueDetailsInstance}">
										<ul class="errors" role="alert">
											<g:eachError bean="${issueDetailsInstance}" var="error">
												<li
													<g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message
														error="${error}" /></li>
											</g:eachError>
										</ul>
									</g:hasErrors>
									<div class="portlet light bordered">
										<div class="portlet-title">
											<div class="caption font-green">
												<i class="icon-user font-green"></i> <span
													class="caption-subject bold uppercase"> Edit Issued
													Details</span>
											</div>

										</div>
										<div class="portlet-body form">
											<g:form
												url="[resource:issueDetailsInstance, action:'update']"
												method="PUT">
												<g:hiddenField name="version"
													value="${issueDetailsInstance?.version}" />
												<fieldset class="form">
													<g:render template="form" />
												</fieldset>
												<fieldset class="buttons">
													<g:actionSubmit class="btn blue" action="update"
														id="student1"
														value="${message(code: 'default.button.update.label', default: 'Update')}" />
												</fieldset>
											</g:form>
										</div>
									</div>
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
	<script src="js/validation.js" type="text/javascript"></script>
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
		/*-----------validation for payment method-------------*/
		$(document).ready(function() {
			if ($('select[name=student]').val() == "issueDetailsStudent") {
				$('#Returntype').show();
				$('#Returntype1').hide();
			} else {
				$('#Returntype').hide();
				$('#Returntype1').show();
			}

			$('#student1').click(function() {
				var date = $('#studentId2').val();

				if ($.trim(date) == 0) {
					$('#SstudentId').show();
					return false;
				}

			});

			$('[id="studentId2"]').on('change', function() {
				if ($(this).val() == "") {
					$('#SstudentId').show();
				} else {
					$('#SstudentId').hide();

				}
			});
		});

		/*-----------validation for payment method-------------*/
		$(document).ready(function() {
			var input = $('#studentId2').val();
			if (input == 'issueDetailsStudent') {
				// alert("hhhhh");
				$("#Returntype").show();
				return false;
			}
		});

		$('select[name=student]').change(function(e) {
			if ($('select[name=student]').val() == 'issueDetailsStudent') {
				$('#Returntype').show();
				$('#Returntype1').hide();
			} else {
				$('#Returntype').hide();
				$('#Returntype1').show();
			}
		});

		$(document).ready(function() {
			$('#student1').click(function() {
				var date = $('#studentId1').val();
				if ($.trim(date) == 0) {
					var input = $('#studentId2').val();
					if (input == 'issueDetailsStudent') { //alert("hhhhh");
						$("#Sstudentname").show();
						return false;
					} else {
						$("#Sstudentname").hide();
					}
				}
			});

			$('[id="studentId1"]').on('change', function() {
				if ($(this).val() == "") {
					$('#Sstudentname').show();
				} else {
					$('#Sstudentname').hide();
				}
			});
		});

		/*-----------validation for payment method-------------*/
		$(document).ready(function() {
			var input = $('#studentId2').val();
			if (input == 'issueDetailsStaff') {
				//alert("hhhhh");
				$("#Returntype1").show();
				return false;
			}
		});

		$(document).ready(function() {
			$('#student1').click(function() {
				var date = $('#Staffname').val();
				if ($.trim(date) == 0) {
					var input = $('#studentId2').val();
					if (input == 'issueDetailsStaff') { //alert("hhhhh");
						$("#SStaffname").show();
						return false;
					} else {
						$("#SStaffname").hide();
					}
				}
			});

			$('[id="Staffname"]').on('change', function() {
				if ($(this).val() == "") {
					$('#SStaffname').show();
				} else {
					$('#SStaffname').hide();
				}
			});
		});

		///*-----------Validation for DD number'---------*/////

		$(document).ready(function() {
			$('#student1').click(function() {
				var input = $('#numberOfDays');
				var regexp = /^([0-9.,]){1,20}$/;
				var check = regexp.test(input.val());

				if (check == false) {
					$('#SNumberOfDays').show();
					return false;
				} else {
					$('#SNumberOfDays').hide();
				}
			});
		});
		$(document).ready(function() {
			$('[id="numberOfDays"]').on('change', function() {

				var input = $('#numberOfDays');
				var regexp = /^([0-9.,]){1,20}$/;
				var check = regexp.test(input.val());
				if (check == false) {
					$('#SNumberOfDays').show();

				} else {
					$('#SNumberOfDays').hide();

				}
			});
		});
	</script>


	<!-- END THEME LAYOUT SCRIPTS -->
</body>

</html>

