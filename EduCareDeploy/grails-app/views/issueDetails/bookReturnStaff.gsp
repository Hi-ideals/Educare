<%@ page import="com.hiideals.institute.library.IssueDetails"%>
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
					model="[activ:[LibraryManagement:'start active open',bookReturnStaff:'active']]"></g:render>
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
						<li><a class="home"
							href="${createLink(uri: '/')}"><g:message
									code="default.home.label" /></a></li>
						<li><i class="fa fa-circle"></i> <g:link class="list"
								action="index">Issued Staff Details</g:link></li>
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
									<%--					<g:hasErrors bean="${issueDetailsInstance}">--%>
									<%--						<ul class="errors" role="alert">--%>
									<%--							<g:eachError bean="${issueDetailsInstance}" var="error">--%>
									<%--								<li--%>
									<%--									<g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message--%>
									<%--										error="${error}" /></li>--%>
									<%--							</g:eachError>--%>
									<%--						</ul>--%>
									<%--					</g:hasErrors>--%>


									<%--							<a href="#create-issueDetails" class="skip" tabindex="-1"><g:message--%>
									<%--									code="default.link.skip.label"--%>
									<%--									default="Skip to content&hellip;" /></a>--%>
									<%--							<div class="nav" role="navigation">--%>
									<%--								<ul>--%>
									<%--									<li><a class="home" href="${createLink(uri: '/')}"><g:message--%>
									<%--												code="default.home.label" /></a></li>--%>
									<%--									<li><g:link class="list" action="index">--%>
									<%--											<g:message code="default.list.label" args="[entityName]" />--%>
									<%--										</g:link></li>--%>
									<%--								</ul>--%>
									<%--							</div>--%>
									<div id="create-issueDetails" class="content scaffold-create"
										role="main">
										<%--								<h1>--%>
										<%--									<g:message code="default.create.label" args="[entityName]" />--%>
										<%--								</h1>--%>
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
														<i class="fa fa-user font-blue"></i> <span
															class="caption-subject bold uppercase"> Return By
															Staff</span>
													</div>
												</div>
												<g:form url="[controller:issueDetails, action:'returnBook']">

													<div class="form-body">
														<div class="row">
															<%--<div class="col-md-3">
												<label for="studentId"> <g:message
														code="issueDetails.studentId.label" default="Student name" />

												</label>
												<div
													class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'studentId', 'error')} ">
													<select id="studentId" class="form-control"
														name="studentId.id">

														<option value="${null}">select</option>
														<g:each in="${Student.list()}">
															<option value="${it.id }">
																${it.studentName }
															</option>
														</g:each>
													</select>
												</div>
											</div>
											--%>
															<div class="col-md-3">
																<label for="staffId"> <g:message
																		code="issueDetails.staffId.label" default="Staff name" />

																</label>
																<div
																	class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'staffId', 'error')} ">
																	<select id="staffId" class="form-control"
																		name="staffId.id">
																		<option value="${null }">select</option>
																		<g:each in="${staffs}">
																			<option value="${it.id}">
																				${it.staffName}
																			</option>

																		</g:each>


																	</select>
																</div>
															</div>



															<div class="col-md-3">
																<div
																	class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'studentId', 'error')} ">
																	<label for="studentId"> <g:message
																			code="issueDetails.studentId.label"
																			default="Select category" />

																	</label>
																	<%--<g:select id="studentId" name="studentId.id" from="${com.hiideals.instituite.student.Student.list()}" optionKey="id" value="${issueDetailsInstance?.studentId?.id}" class="many-to-one" noSelection="['null': '']"/>--%>

																	<%--${issueDetailsInstance?.studentId?.id }--%>

																	<select class="form-control" name="category"
																		id="categorys">
																		<option value="${null}">Select any one</option>
																		<option value="Magazinename">Magazine name</option>
																		<option value="Newspapername">Newspaper name</option>
																		<option value="Booksname">Books name</option>
																	</select>
																</div>
																<div id="SstudentId" style="display: none; color: red">select
																	any one issue Details name</div>
															</div>








															<div id="category1" hidden="true">
																<div class="col-md-3">
																	<label for="magazineId"> <g:message
																			code="issueDetails.newspaper.label"
																			default="magazine Name" />

																	</label>
																	<div
																		class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'magazineId', 'error')} ">
																		<select id="magazine" class="form-control"
																			name="magazineId">
																			<option></option>
																			<g:each
																				in="${com.hiideals.institute.library.Magazine.list()}">
																				<option value="${it.id }">
																					${it.magazineName }
																				</option>
																			</g:each>

																		</select>
																	</div>
																</div>
															</div>

															<div id="category2" hidden="true">
																<div class="col-md-3">
																	<label for="newspaper"> <g:message
																			code="issueDetails.newspaper.label"
																			default="Newspaper name" />
																	</label>
																	<div
																		class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'newspaper', 'error')} ">
																		<select id="newspaper" class="form-control"
																			name="newspaper.id">
																			<option></option>
																			<g:each
																				in="${com.hiideals.institute.library.Newspaper.list()}">
																				<option value="${it.id }">
																					${it.name }
																				</option>
																			</g:each>
																		</select>
																	</div>
																</div>
															</div>
														</div>
													</div>
													<br>
													<div class="form-body">
														<div class="row">
															<div id="category3" hidden="true">
																<div class="col-md-3">
																	<label for="booksId"> <g:message
																			code="issueDetails.booksId.label"
																			default="Books name" />
																	</label>
																	<div
																		class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'booksId', 'error')} ">
																		<select name="books" class="form-control" id="books"
																			multiple="multiple" class="many-to-many">

																			<option>select</option>
																			<g:each
																				in="${com.hiideals.institute.library.Books.list()}"
																				var="c">
																				<option value="${c.id}">
																					${c.title }
																				</option>

																			</g:each>
																		</select>
																	</div>
																</div>
															</div>


															<div class="col-md-3">
																<label for="fineAmount"> <g:message
																		code="issueDetails.fineAmount.label"
																		default="Fine Amount" />
																</label>
																<div
																	class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'fineAmount', 'error')} ">
																	<input type="number" name="fineAmount"
																		class="form-control">
																</div>
															</div>

														</div>
													</div>

													<br>
													<br>
													<fieldset class="buttons">
														<g:submitButton name="ReturnBoook"
															controller="issueDetails" class="btn blue"
															value="Return Book" />
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
	<script src="js/validation.js" type="text/javascript"></script>
	<script>
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

