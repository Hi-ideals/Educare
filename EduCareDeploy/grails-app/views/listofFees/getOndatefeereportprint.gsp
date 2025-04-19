
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


			
				<div class="row">
					<div class="col-md-12">
						<!-- BEGIN SAMPLE FORM PORTLET-->
						<div class="portlet light">
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
												
											</div>

											<div class="col-md-12">
											<h3 style="text-align:center;color:#397ab7;font-family: -webkit-pictograph;">Student Fee Detail Report</h3>
												<div class="portlet-body">
												<h4 style="text-align:center"><b> From Date: ${params.from}  To Date: ${params.to }</b></h4>
													<div class="">
														<table border="1" class="table table-bordered table-hover">
															<thead>
																<tr>
									<th>Class</th>
										<th>Section</th>
										<th>Student Name</th>
										<th>Father Name</th>
										<th>R.No/Std ID</th>
									    
									     <th>Invoice No.</th>
								<th>Paid AdmissionFee</th>
								<th>Fees Paid</th>
								<th>Due Fees</th>
								<th>Due AdmissionFees</th>
								<th>FeesPaid Date</th>
										
									</tr>
															</thead>
															<tbody>
									<g:each in="${tracker}" var="feetracker" status="i">
										<tr>
										<td>
										<g:each in="${arryl[i]?.academicyear}">
											<g:if test="${it.status == 'current'}">
											</g:if>
										</g:each> <g:set value="${it?.presentclass}" var="pclass"></g:set> ${pclass.classname }
																	
										
										</td>
											<td>
											<g:each in="${arryl[i]?.academicyear}">
											<g:if test="${it.status == 'current'}">
											</g:if>
										</g:each> <g:set value="${it?.section}" var="pclass"></g:set> ${pclass?.sectionName}
											
											</td>
											<td>${feetracker?.studentName}</td>
											<td>${arryl?.fatherDetails?.parentName[i] }</td>
											<td>${(arryl?.studentId)[i]}</td>
										    
										    <td>${feetracker?.invoiceNo}</td>
											
									        <td align="right">${feetracker?.paidadmissionfee}</td>
									       
											<td align="right"> ${arl[i]}
											</td>
											<td>0</td>
											<td>0</td>
											
										<%--	<td align="right">${arrl[i]}</td>
											
										
								<g:if test="${(feetracker?.paidadmissionfee !=0)}">
			
			                        
			<%--  <td>${feetracker?.dueadmissionfee}</td> 
			</g:if>
				<g:else>
				<td>0</td>
			<%-- <td>${feetracker?.totaladmissionfee} 	</td>
				
			
			</g:else>--%>
											<td><g:formatDate format="dd-MMM-yyyy"
													date="${feetracker?.dateCreated}" /></td>
											</tr>
										
										
									</g:each>
									
									
									<tr style="color: #337ab7">
															<td colspan="6" align="center"><strong>Fee Collection</strong></td>
															<td align="right"><strong>${Paidadmissionsum }<strong></td>
															<td align="right"><strong>${Paidsum}</strong></td>
															<td></td>
															<td></td>
															<td></td>
															
														</tr>
														<tr style="color: #337ab7">
														<td colspan="6" align="center"><strong>Sum of Admission & Fee Type </strong></td>
															<td colspan="2" align="right"><strong>${bothfees }<strong></td>
															<td></td>
															<td></td>
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



