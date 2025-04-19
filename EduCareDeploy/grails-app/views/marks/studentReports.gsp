<%@ page import="com.hiideals.instituite.classcourses.IClass"%>
<%@ page import="com.hiideals.exams.Marks"%>
<%@ page import="com.hiideals.exams.Exam"%>
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
	<div class="page-header navbar navbar-fixed-top">
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
					model="[activ:[exams:'start active open',marks:'active']]"></g:render>
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
													Exam Time Table/Report Card</span>
											</div>

										</div>
										<div class="portlet-body form">

											<button class="btn green" id="regclick">
												<i class="icon-magnifier font-white"></i> Get Exam Timetable
											</button>
											<button class="btn blue" id="classclick">
												<i class="icon-magnifier font-white"></i> Get Student Score
												Card
											</button>
											<%--
									<button class="btn yellow" id="dateclick">
										<i class="icon-magnifier font-white"></i> By Date
									</button>
									<button class="btn green" id="castclick">
										<i class="icon-magnifier font-white"></i> By Cast
									</button>
									<button class="btn green" id="yearclick">
										<i class="icon-magnifier font-white"></i> By Academic Year
									</button>
									 --%>

											<div class="margin-bottom-10"></div>
											<div id="Reg" style="display: none">
												<g:formRemote name="ss" url="[action:'getExamTT']"
													update="Changedisplay">
													<div class="row">
														<div class="col-md-4">
															<label>Enter Class</label> <select id="iclass"
																name="iclass.id" class="form-control">
																<option value="">Select Class</option>
																<g:each in="${IClass.findAllByInstituite(instituite)}"
																	var="iclass">
																	<option value="${iclass?.id}">
																		${iclass?.classname}
																	</option>
																</g:each>
															</select>
														</div>
														<div class="col-md-4">
															<label>Exam Name</label> <select id="exam" name="exam.id"
																class="form-control">
																<option value="">Select exam</option>
																<g:each in="${Exam.findAllByInstitute(instituite)}"
																	var="exam">
																	<option value="${exam?.id}">
																		${exam?.examName}
																	</option>
																</g:each>
															</select>
														</div>

														<div class="col-md-4">
															<label>Academic Year</label> <select id="year"
																name="year.id" class="form-control">
																<option value="">Select Year</option>
																<g:each in="${batchList}" var="batch">
																	<option value="${batch?.id}">
																		${batch?.batchName}
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
												<g:formRemote name="ss" url="[action:'getreportCard']"
													update="Changedisplay">
													<div class="row">
														<div class="col-md-3">
															<div
																class="fieldcontain ${hasErrors(bean: examDetailsInstance, field: 'year', 'error')} required">
																<label for="year"> <g:message
																		code="examDetails.year.label" default="Year" /> <span
																	class="required-indicator">*</span>
																</label> <select id="year" name="year.id" class="form-control">
																	<option value="">Select Year</option>
																	<g:each in="${batchList}" var="batch">
																		<option value="${batch?.id}">
																			${batch?.batchName}
																		</option>
																	</g:each>
																</select>
															</div>
														</div>

														<div class="col-md-3">
															<div
																class="fieldcontain ${hasErrors(bean: examDetailsInstance, field: 'year', 'error')} required">
																<label for="ExamName"> Exam Name* </label> <select
																	id="exam" name="exam.id" class="form-control">
																	<option value="">Select ExamName</option>
																	<g:each in="${Exam.findAllByInstitute(instituite)}"
																		var="exam">
																		<option value="${exam?.id}">
																			${exam?.examName}
																		</option>
																	</g:each>
																</select>

															</div>
														</div>
														<div class="col-md-3">
															<div
																class="fieldcontain ${hasErrors(bean: examDetailsInstance, field: 'iclass', 'error')} required">
																<label for="iclass"> <g:message
																		code="examDetails.iclass.label" default="Iclass" /> <span
																	class="required-indicator">*</span>
																</label> <select id="iclass" name="iclass.id"
																	class="form-control"
																	onchange="${remoteFunction(
			          controller: 'marks', 
			          action: 'getExamDetails',
					  update:'subjects',
			         params: "\'iclass=\' + this.value +  \'&examId=\' + document.getElementById('exam').value+ \'&yearId=\' + document.getElementById('year').value ")};${remoteFunction(
			          controller: 'marks', 
			          action: 'getStudents',
					  update:'getStudents',
			         params: "\'iclass=\' + this.value +  \'&examId=\' + document.getElementById('exam').value+ \'&yearId=\' + document.getElementById('year').value ")}">
																	<option value="">Select Class</option>
																	<g:each in="${IClass.findAllByInstituite(instituite)}"
																		var="iclass">
																		<option value="${iclass?.id}">
																			${iclass?.classname}
																		</option>
																	</g:each>
																</select>
															</div>
														</div>
														<div id="getStudents">
															<g:render template="students" />
														</div>


														<div class="col-md-3">
															<g:submitButton name="Search" class="btn green"
																style="margin-top: 22px" />
														</div>
													</div>

												</g:formRemote>
											</div>
											<div id="date" style="display: none">
												<g:form name="ss" url="[action:'index']"
													update="Changedisplay">
													<div class="row">

														<div class="col-md-4">
															<label>From</label> <input type="text" name="from"
																id="datepicker" class="form-control date-picker">
														</div>
														<div class="col-md-4">
															<label>To</label> <input type="text" name="to"
																id="datepicker1" class="form-control date-picker"
																value="${params.to }">
														</div>
														<input type="hidden" value="asc" name="orderd">

														<div class="col-md-4">
															<g:submitButton name="Search" class="btn green"
																style="margin-top: 22px" />
														</div>
													</div>

												</g:form>
											</div>

											<div id="cast" style="display: none">
												<g:form name="sscast" url="[action:'index']"
													update="Changedisplay">
													<div class="row">

														<div class="col-md-4">
															<label>Enter Cast Name</label> <input type="text"
																class="form-control" name="castName"
																placeholder="Enter Cast Name" />
														</div>

														<input type="hidden" value="asc" name="orderd">

														<div class="col-md-4">
															<g:submitButton name="Search" class="btn green"
																style="margin-top: 22px" />
														</div>
													</div>

												</g:form>
											</div>

											<div id="yearclass" style="display: none">
												<g:formRemote name="kk" url="[action:'byYear']"
													update="Changedisplay">

													<div class="row">
														<div class="col-md-4">
															<label>Class</label> <select name="iclass"
																class="form-control">
																<option value="all">All</option>
																<%--
														<g:each
															in="${studentInstanceList[0]?.instituite?.classes }"
															var="cls">
															<option value="${cls.id}">
																${cls.classname }
															</option>
														</g:each>
														 --%>

															</select>

														</div>

														<div class="col-md-4">
															<label>Academic Year</label> <select name="iyear"
																class="form-control">
																<option value="all">All</option>
																<%--
														<g:each in="${academicYearList}" var="cls">
															<option value="${cls}">
																${cls}
															</option>
														</g:each>
														 --%>

															</select>

														</div>



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
	<script type="text/javascript"></script>
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
	<script type="text/javascript"></script>
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

