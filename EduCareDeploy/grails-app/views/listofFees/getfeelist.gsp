
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
<link href="assets1/layouts/layout/css/custom.css" rel="stylesheet"
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

@media ( min-width : 992px) {
	.page-content {
		margin-left: 0px !important;
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


				<br>
				<div class="row">
					<div class="col-md-12">
						<!-- BEGIN SAMPLE FORM PORTLET-->
						<div class="portlet light bordered">

							<div class="portlet-body form">
								<div class="crtfcte">
									<div class="text-center">
										<div class="">
											<ul class="list-unstyled">
												<li><images:getImage id="${institute?.logo?.id}"
														width="110px"  />
														</li>
														<li>
													<h3>
														${institute?.name}
													</h3> <small>Affiliated to: ${institute?.affiliatedTo }</small> <br>
													<small>${institute?.hsno} ${institute?.street} ${institute?.city}-${institute?.pinCode}
														${institute?.state} ${institute?.country} Ph:${institute?.phone}
												</small></li>
											</ul>
										</div>
									</div>

									<hr>

									<div class="row">

										<div class="certificate">
											<div style="position: absolute; left: 50px; top: 280px;">
												<br>

											</div>

											<div class="col-md-12">
												<h4>
													<b>List of fees details with student name</b>
												</h4>
												<div class="portlet-body">
													<div class="table-scrollable">
														<table border="1" class="table table-bordered table-hover">
															<thead>
																<tr>

																	<th><g:message code="fee.studentId.label"
																			default="Student Name" /></th>

																		<th>Class</th>
																	<th><g:message
																			code="${message(code: 'fee.totalFee.label', default: 'Total Fee')}" /></th>
																	<%--<th>Final Settlement</th>
																	--%><th><g:message
																			code="${message(code: 'fee.totalPaid.label', default: 'Total Paid')}" /></th>
<th><g:message
																			code="${message(code: 'fee.due.label', default: 'Due')}" /></th>
<th>Fee Paid Date</th>
																	<th>
																		${message(code: 'fee.lastUpdated.label', default: 'Updated Date')}
																	</th>

																

																	<th>Academic Year</th>

																</tr>
															</thead>
															<tbody>
																<g:each in="${feeInstanceList}" status="i"
																	var="feeInstance">
																	<g:if test="${feeInstance !=null }">
																		<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

																			<td>
																				${fieldValue(bean: feeInstance?.studentId, field: "studentName")}
																			</td>

<td>
																				${feeInstance?.academic?.presentclass?.classname}
																			</td>
																			

																			<td>
																				${fieldValue(bean: feeInstance, field: "totalFee")}
																			</td>

																			<%--<td>
																				${fieldValue(bean: feeInstance, field: "discount")}
																			</td>

																			--%><td>
																				${fieldValue(bean: feeInstance, field: "totalPaid")}
																			</td>
																			<td>
																				${fieldValue(bean: feeInstance, field: "due")}
																			</td>
																			<td><g:formatDate format="dd-MMM-yyyy" date="${feeInstance.dateCreated }"/>
																				
																			</td>
																			<td><g:formatDate format="dd-MMM-yyyy"
																				date="${feeInstance.lastUpdated}" />
																				
																			</td>
																			
																			<td>
																				${feeInstance?.academic?.academicyear}
																			</td>

																		</tr>
																	</g:if>

																</g:each>
																
																<tr style="color: #337ab7">
															<td colspan="2" align="center"><strong>Grand Total</strong></td>
															<td><strong>${Totalsum}</strong></td>
															<td><strong> ${Paidsum}</strong></td>
															<td><strong>${duesum}</strong></td>
															
															
															
															<td></td>
														</tr>
																
																
															</tbody>
														</table>

													</div>
												</div>
										</div>
									</div>
									<div class="row">
									<div class="col-md-12">
								<p class="pull-right">	<b>Thanks And Regards,<br><span style="margin-left:30px;"> ${sec.username() }</span></b></p>
				</div>	</div>				<br> <br> <br> <br>
									<div class="row">
										<div class="col-md-6">
											<div class="pull-left">
												<ul class="list-unstyled">

													<li>Place: <strong>Bidar</strong></li>
												</ul>
											</div>

										</div>
										<div class="col-md-6">
											<div class="pull-right">
												<ul class="list-unstyled">
													<li>Office Seal</li>
												</ul>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="col-md-12 text-center" id="printPageButton">
						<input type="button" class="btn blue" value="Close"
							onclick="self.close()">
						<button class="btn blue" id="printPageButton"
							onClick="window.print();">
							<i class="fa fa-print"></i> Print
						</button>
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
	<!-- END THEME LAYOUT SCRIPTS -->
</body>

</html>




