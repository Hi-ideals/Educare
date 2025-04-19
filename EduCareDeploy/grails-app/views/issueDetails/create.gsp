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
					model="[activ:[LibraryManagement:'start active open',issueDetails:'active']]"></g:render>
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
						<li><i class="fa fa-circle"></i><a class="home"
							href="${createLink(uri: '/')}"><g:message
									code="default.home.label" /></a></li>
						<li><i class="fa fa-circle"></i> <g:link class="list"
								action="index">Issued to Student List</g:link></li>
					</ul>
				</div>
				<div class="panel">
					<div class="panel-body">
						<div class="row">
							<div class="col-md-12">
								<div id="create-issueDetails" class="content scaffold-create"
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
									<div class="box box-info">
										<div class="portlet light bordered">
											<div class="portlet-title">
												<div class="caption font-blue">
													<i class="icon-user font-blue"></i> <span
														class="caption-subject bold uppercase">Issue
														Details</span>
												</div>
											</div>
											<g:form url="[resource:issueDetailsInstance, action:'save']">
												<fieldset class="form">
													<g:render template="form" />
												</fieldset>
												<fieldset class="buttons">
													<g:submitButton name="create" class="btn blue"
														id="student1"
														value="${message(code: 'default.button.create.label', default: 'Create')}" />
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
	
	<script src="assets1/global/scripts/app.min.js" type="text/javascript"></script>
	<!-- END PAGE LEVEL SCRIPTS -->
	<!-- BEGIN THEME LAYOUT SCRIPTS -->
	<script src="assets1/layouts/layout/scripts/layout.min.js"
		type="text/javascript"></script>
	<script src="js/validation.js" type="text/javascript"></script>
	<!-- END THEME LAYOUT SCRIPTS -->
	<script>
		/*-----------validation for payment method-------------*/
		$(document).ready(function() {

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

		/*-----------validation for Magazinename-------------*/
		$(document).ready(function() {
			var input = $('#categorys').val();
			if (input == 'Magazinename') {
				$("#category1").show();
				return false;
			}
		});

		$('select[name=category]').change(function(e) {
			if ($('select[name=category]').val() == 'Magazinename') {
				$('#category1').show();
			} else {
				$('#category1').hide();
			}
		});
		/*-----------validation for Newspapername-------------*/
		$(document).ready(function() {
			var input = $('#categorys').val();
			if (input == 'Newspapername') {
				$("#category2").show();
				return false;
			}
		});

		$('select[name=category]').change(function(e) {
			if ($('select[name=category]').val() == 'Newspapername') {
				$('#category2').show();
			} else {
				$('#category2').hide();
			}
		});

		/*-----------validation for Booksname-------------*/
		$(document).ready(function() {
			var input = $('#categorys').val();
			if (input == 'Booksname') {
				$("#category3").show();
				return false;
			}
		});

		$('select[name=category]').change(function(e) {
			if ($('select[name=category]').val() == 'Booksname') {
				$('#category3').show();
			} else {
				$('#category3').hide();
			}
		});
	</script>



</body>

</html>

