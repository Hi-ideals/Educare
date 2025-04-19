<%@ page import="com.hiideals.institute.library.IssueDetails"%>


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
								action="staffDetails">Issued to Staff</g:link></li>
					</ul>
				</div>
				<div id="create-issueDetails" class="content scaffold-create"
					role="main">
					<h3></h3>
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
								<div class="caption font-green">
									<i class="icon-pin font-green"></i> <span
										class="caption-subject bold uppercase">Issue Details</span>
								</div>
							</div>
							<g:form url="[resource:issueDetailsInstance, action:'save']">
								<fieldset class="form">

									<regId:getInstituite />
									<div class="form-body">
										<div class="row">


											<div class="col-md-3" style="display: none;">
												<div
													class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'studentId', 'error')} ">
													<label for="studentId"> <g:message
															code="issueDetails.studentId.label"
															default="Select issueDetails" />

													</label>
													<%--<g:select id="studentId" name="studentId.id" from="${com.hiideals.instituite.student.Student.list()}" optionKey="id" value="${issueDetailsInstance?.studentId?.id}" class="many-to-one" noSelection="['null': '']"/>--%>

													<%--${issueDetailsInstance?.studentId?.id }--%>

													<select class="form-control" name="student" id="studentId2">

														<option value="issueDetailsStudent" selected="selected">Issue
															to Student</option>




														<option value="issueDetailsStudent">Student</option>

													</select>
												</div>
												<div id="SstudentId" style="display: none; color: red">select
													any one issue Details name</div>
											</div>

											<div id="Returntype" hidden="true">
												<div class="col-md-3">
													<div
														class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'studentId', 'error')} ">
														<label for="studentId"> <g:message
																code="issueDetails.studentId.label"
																default="Student Name" />

														</label>
														<%--<g:select id="studentId" name="studentId.id" from="${com.hiideals.instituite.student.Student.list()}" optionKey="id" value="${issueDetailsInstance?.studentId?.id}" class="many-to-one" noSelection="['null': '']"/>--%>

														<%--${issueDetailsInstance?.studentId?.id }--%>
														<select name="studentId.id" class="form-control"
															class="many-to-many" id="studentId1">
															<option value=""></option>
															<g:each
																in="${com.hiideals.instituite.student.Student.findAllByInstituite(instituite)}"
																var="c">

																<g:if
																	test="${issueDetailsInstance?.studentId?.id == c.id }">
																	<option value="${c.id }" selected="selected">
																		${c.studentName}
																	</option>
																</g:if>
																<g:else>
																	<option value="${c.id }">
																		${c.studentName}
																	</option>
																</g:else>
															</g:each>
														</select>
													</div>
													<div id="Sstudentname" style="display: none; color: red">select
														student name</div>
												</div>
											</div>
											<div id="Returntype1">
												<div class="col-md-3">
													<div
														class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'staffId', 'error')} ">
														<label for="staffId"> <g:message
																code="issueDetails.staffId.label" default="Staff Name" />

														</label>
														<%--<g:select id="staffId" name="staffId.id" from="${com.hiideals.institute.staff.Staff.list()}" optionKey="id" value="${issueDetailsInstance?.staffId?.id}" class="many-to-one" noSelection="['null': '']"/>--%>

														<select name="staffId.id" class="form-control"
															class="many-to-many" id="Staffname">
															<option value=""></option>
															<g:each
																in="${com.hiideals.institute.staff.Staff.findAllByInstitute(instituite)}"
																var="c">
																<g:if
																	test="${issueDetailsInstance?.staffId?.id == c.id }">
																	<option value="${c.id}" selected="selected">
																		${c.staffName }
																	</option>
																</g:if>
																<g:else>
																	<option value="${c.id}">
																		${c.staffName }
																	</option>
																</g:else>
															</g:each>
														</select>
													</div>
													<div id="SStaffname" style="display: none; color: red">select
														Staff name</div>
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

													<select class="form-control" name="category" id="categorys">
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
													<div
														class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'magazineId', 'error')} ">
														<label for="magazineId"> <g:message
																code="issueDetails.magazineId.label"
																default="Magazine name" />

														</label>
														<%--<g:select id="magazineId" name="magazineId.id" from="${com.hiideals.institute.library.Magazine.list()}" optionKey="id" value="${issueDetailsInstance?.magazineId?.id}" class="many-to-one" noSelection="['null': '']"/>--%>
														<select name="magazineId.id" class="form-control"
															class="many-to-many">
															<g:if test="${issueDetailsInstance?.magazineId }">
																<option value="${issueDetailsInstance?.magazineId }">
																	${issueDetailsInstance.magazineId?.magazineName }
																</option>
															</g:if>
															<g:else>
																<option value="${null}">Select</option>
																<g:each
																	in="${com.hiideals.institute.library.Magazine.findAllByInstituite(instituite)}"
																	var="c">
																	<option value="${c.id}">
																		${c.magazineName }
																	</option>
																</g:each>
															</g:else>
														</select>
													</div>
												</div>
											</div>


											<div id="category3" hidden="true">
												<div class="col-md-3">
													<div
														class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'booksId', 'error')} ">
														<label for="booksId"> <g:message
																code="issueDetails.booksId.label" default="Books name" />

														</label>
														<%--
	<g:select name="booksId" from="${com.hiideals.institute.library.Books.list()}" multiple="multiple" optionKey="id" size="5" value="${issueDetailsInstance?.booksId*.id}" class="many-to-many"/>--%>

														<select name="books" multiple="multiple"
															class="form-control" class="many-to-many" optionKey="id"
															size="5">
															<g:each
																in="${com.hiideals.institute.library.Books.findAllByInstituite(instituite)}"
																var="c">

																<g:if
																	test="${issueDetailsInstance?.books?.contains(c) }">
																	<option value="${c.id}" selected="selected">
																		${c. title }
																	</option>
																</g:if>
																<g:else>
																	<option value="${c.id}">
																		${c. title }
																	</option>
																</g:else>
															</g:each>
														</select>
													</div>
												</div>
											</div>


											<div id="category2" hidden="true">
												<div class="col-md-3">
													<div
														class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'newspaper', 'error')} ">
														<label for="newspaper"> <g:message
																code="issueDetails.newspaper.label"
																default="Newspaper name" />

														</label>
														<%--<g:select id="newspaper" name="newspaper.id" from="${com.hiideals.institute.library.Newspaper.list()}" optionKey="id" value="${issueDetailsInstance?.newspaper?.id}" class="many-to-one" noSelection="['null': '']"/>--%>

														<select name="newspaper.id" class="form-control"
															class="many-to-many">

															<g:if test="${issueDetailsInstance?.newspaper }">
																<option value="${issueDetailsInstance?.newspaper }">
																	${issueDetailsInstance.newspaper?.name }
																</option>
															</g:if>
															<g:else>
																<option value="null"></option>
																<g:each
																	in="${com.hiideals.institute.library.Newspaper.findAllByInstituite(instituite)}"
																	var="c">
																	<option value="${c.id}">
																		${c.name }
																	</option>
																</g:each>
															</g:else>
														</select>
													</div>
												</div>
											</div>


										</div>
									</div>

									<div class="form-body">
										<div class="row">




											<div
												class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'dateOfIssue', 'error')} required"
												style="display: none;">
												<label for="dateOfIssue"> <g:message
														code="issueDetails.dateOfIssue.label"
														default="dateOfIssue" /> <span class="required-indicator">*</span>
												</label>
												<g:datePicker name="dateOfIssue" precision="day"
													value="${new Date()}" />

											</div>




											<div class="col-md-3">
												<div
													class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'numberOfDays', 'error')} required">
													<label for="numberOfDays"> <g:message
															code="issueDetails.numberOfDays.label"
															default="Number Of Days" /> <span
														class="required-indicator">*</span>
													</label>
													<g:field name="numberOfDays" class="form-control"
														type="number" id="numberOfDays"
														value="${issueDetailsInstance?.numberOfDays}" required="" />

												</div>
												<div id="SNumberOfDays" style="display: none; color: red">Provide
													Your number of day</div>
											</div>

											<div class="col-md-3" style="display: none;">
												<label for="accessionNumber"> <g:message
														code="issueDetails.instituite.label" default="Instituite" />
													<span class="required-indicator">*</span>
												</label>
												<div
													class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'instituite', 'error')} required">
													<g:textField name="instituite" required=""
														class="form-control" type="hidden"
														value="${instituite?.id}" />
												</div>
											</div>

										</div>
									</div>



								</fieldset>
								<fieldset class="buttons">
									<g:submitButton name="create" class="btn blue" id="student1"
										value="${message(code: 'default.button.create.label', default: 'Create')}" />
								</fieldset>
							</g:form>
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
	<!-- END CORE PLUGINS -->
	<!-- BEGIN PAGE LEVEL PLUGINS -->


	<!-- END PAGE LEVEL PLUGINS -->
	<!-- BEGIN THEME GLOBAL SCRIPTS -->
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
		var input = $('#studentId2').val();
		if (input == 'issueDetailsStaff') {
			 //alert("hhhhh");
			$("#Returntype1").show();
			return false;
		}
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

