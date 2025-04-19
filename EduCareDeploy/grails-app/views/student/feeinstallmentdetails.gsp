
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
											<ul class="list-inline">
												<li><images:getImage id="${instituite?.logo?.id}"
														width="60px" height="60px" />
													<h3>
														${instituite?.name }
													</h3> <small>Affiliated to: ${instituite?.affiliatedTo }</small> <br>
													<small>H.No:${instituite?.hsno} ${instituite?.street} ${instituite?.city}-${instituite?.pinCode}
														${instituite?.state} ${instituite?.country} Ph:${instituite?.phone}
												</small></li>
											</ul>
										</div>
									</div>

									<hr>

									<div class="row">
										<div style="position: absolute; right: 60px; top: 270px;">
											<g:if test="${studentInstance?.profilePic !=null }">

												<div class="thumbnail" style="margin-top: 30px">
													<images:getImage id="${studentInstance?.profilePic?.id}"
														width="180px" height="180px" class="img-responsive" />
												</div>
												</li>
											</g:if>
											<g:else>
												<img src="assets1/layouts/layout/img/user.jpg"
													class="img-responsive pic-bordered" alt="" />
											</g:else>
										</div>
										<div class="certificate">
											<div style="position: absolute; right: 30%; top: 200px;">
												<div class="headline1">
													<h2>Student Installment Details</h2>
												</div>
											</div>
											<br> <br> <br>
											<div style="position: absolute; left: 50px; top: 280px;">
												<br>

												<h4>
													Student Name:
													${studentInstance?.studentName}
													${studentInstance?.lastName}<strong></strong>
												</h4>
												<h4>
													Father:
													${studentInstance?.fatherDetails?.parentName}<strong></strong>
												</h4>
												<h4>
													Registration No:
													${studentInstance?.registrationNo}<strong></strong>
												</h4>
												<h4>
													Class:
													<g:each in="${studentInstance?.academicyear}">
														<g:if test="${it.status == 'current'}">
														</g:if>
													</g:each>
													<g:set value="${it?.presentclass}" var="pclass"></g:set>


													${pclass.classname }

													<strong></strong>
												</h4>
												<h4>
													Address:
													${studentInstance?.presentAddress?.hsno}
													${studentInstance?.presentAddress?.street},
													${studentInstance?.presentAddress?.city} - ${studentInstance?.presentAddress?.pinCode},<br>
													<br>
													${studentInstance?.presentAddress?.state}, -
													${studentInstance?.presentAddress?.country}

													<strong></strong>
												</h4>
											</div>
											<br> <br> <br> <br> <br> <br> <br>
											<br> <br> <br>
											<br>
											<br>
											<br>
											<br>
											<br>
											<br>
											<div class="col-md-12">
												<div class="table-scrollable">
													<table border="1" class="table table-bordered table-hover">
														<thead>
															<tr>
																<td><b>Installments</b></td>
																<td><b>Invoice No</b></td>
																<td><b>Payment Type</b></td>
																	<td><b>Details</b></td>
																<td><b>Date of Fees Paid</b></td>
																<td><b>Paid Amount</b></td>
															</tr>
														</thead>
														<tbody>
															<g:each in="${tracker}" var="tr" status="k">
																<tr>
																	<td>
																		${tr.instalment}
																	</td>
																	<td> #${tr?.invoiceNo}</td>
																	<td>
																		${tr.paymentType}
																	</td>
																	<g:if test="${tr.paymentType=='CHECK' || tr.paymentType=='DD'}">
                                    		<td>${tr?.paymentType} No: ${tr?.ddNumber} <br/> Acc/No: ${tr?.accNo} <br/>
                                    		Bank Name: ${tr?.ddNumber} <br/> Pin No : ${tr?.ddNumber}
                                    		<br/>
                                    		Teller No: ${tr?.ddNumber}
                                    		</td>
                                    		</g:if>
                                    		<g:else><td>-</td></g:else>
																	<td><g:formatDate format="dd-MMM-yyyy"
																			date="${tr.dateCreated}" /></td>
																	<td>
																		${totalMap.get(tr)}
																	</td>

																</tr>
															</g:each>
														</tbody>
													</table>
												</div>

											</div>
										</div>
									</div>
									<br>
									<br>
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

