
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
<title>Hi-Educare | ${studentInstance?.studentName  }</title>
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

			<g:render template="/header/topBar"></g:render>
		</div>
	</div>
	<!-- END HEADER -->
	<!-- BEGIN HEADER & CONTENT DIVIDER -->
	<div class="clearfix"></div>
	<div class="page-container">

		<div class="page-content-wrapper">
			<!-- BEGIN CONTENT BODY -->
			<div class="page-content">


				<!-- END PAGE BAR -->
				<!-- BEGIN PAGE TITLE-->
				<div class="container">
					<div class="row">
						<div class="col-md-12">
							<div class="well" style="padding: 1px">
								<div class="text-center">
									<ul class="list-inline">
										<li><images:getImage id="${instituite?.logo?.id}"
												width="100px" height="100px" /><br></li>
										<li>
											<h2 class="page-title" style="color: #000">
												${instituite?.name }
												<br> <small>Affiliated to: ${instituite?.affiliatedTo }</small>
											</h2>

										</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
					<!-- END PAGE TITLE-->
					<!-- END PAGE HEADER-->
					<!-- BEGIN DASHBOARD STATS 1-->
					<!-- <div id="background">
  <p id="bg-text">Hi-ideals technologies pvt ltd.</p>
	</div> -->



					<div class="row">
						<div class="col-md-12">
							<div class="portlet light bordered" style="margin-right: 61px;">
								<div class="table-responsive">
									<div>
										<div class="modal-header">
											<h4 class="modal-title" style="text-align: center">
												<b>Fees Notice</b>
											</h4>
										</div>

										<br> Dear Parents,<br>
										<br>&nbsp;&nbsp;&nbsp; The fees payment details is given
										with your child. Kindly pay the fees as per the <br>dates
										without delay immediately for Academic year.
										${stfeenotice.batchno}<br> Thanks for your co-operation. <br>
										<br>
										<div class="table-scrollable">
											<table border="1" class="table table-bordered table-hover">
												<thead>
													<tr>

														<th><g:message code="fee.studentId.label"
																default="Student Name" /></th>

														<th><g:message
																code="${message(code: 'fee.due.label', default: 'Due')}" /></th>

														<th><g:message
																code="${message(code: 'fee.totalFee.label', default: 'Total Fee')}" /></th>

														<th><g:message
																code="${message(code: 'fee.totalPaid.label', default: 'Total Paid')}" /></th>

														<th>Year</th>
														<th>Class</th>
														<th>Section</th>
													</tr>
												</thead>
												<tbody>

													<g:each in="${stfeenotice.academicyear}" status="i"
														var="feeInstance">
														<g:if test="${feeInstance !=null }">
															<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

																<td>
																	${fieldValue(bean: stfeenotice, field: "studentName")}
																</td>

																<td>
																	${fieldValue(bean: feeInstance?.feeId, field: "due")}
																</td>

																<td>
																	${fieldValue(bean: feeInstance?.feeId, field: "totalFee")}
																</td>

																<td>
																	${fieldValue(bean: feeInstance?.feeId, field: "totalPaid")}
																</td>
																<td>
																	${feeInstance?.academicyear}
																</td>
																<td>
																	${feeInstance?.presentclass?.classname}
																</td>
																<td>
																	${feeInstance?.section?.sectionName}
																</td>
															</tr>
														</g:if>
													</g:each>
												</tbody>
											</table>
										</div>
										<br>
										<br> By Order<br> Principal .



									</div>
									<div class="col-xs-6 text-right" id="printPageButton">
										<%--<g:link class="btn blue" controller="fee" action="index">Back</g:link>
	--%>
										<button class="btn blue" id="printPageButton"
											onClick="window.print();">
											<i class="fa fa-print"></i> Print
										</button>
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
			<!-- END CORE PLUGINS -->
			<!-- BEGIN PAGE LEVEL PLUGINS -->


			<!-- END PAGE LEVEL PLUGINS -->
			<!-- BEGIN THEME GLOBAL SCRIPTS -->
			<script src="assets1/global/scripts/app.min.js"
				type="text/javascript"></script>
			<!-- END PAGE LEVEL SCRIPTS -->
			<!-- BEGIN THEME LAYOUT SCRIPTS -->
			<script src="assets1/layouts/layout/scripts/layout.min.js"
				type="text/javascript"></script>
			<!-- END THEME LAYOUT SCRIPTS -->
</body>

</html>


