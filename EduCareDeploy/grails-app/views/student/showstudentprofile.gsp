
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


				<!-- END PAGE BAR -->
				<!-- BEGIN PAGE TITLE-->
				<div class="container">
					<div class="row">
						<div class="col-md-12">
							<div class="well" style="padding: 10px">
								<div class="text-center" >
									<ul class="list-unstyled">
										<li><images:getImage id="${instituite?.logo?.id}"
												width="150px"  /><br></li>
										
										<li>
											<h2 class="page-title" style="color: #000">
												${instituite?.name }
												<br> <small>Affiliated to: ${instituite?.affiliatedTo }</small>
											</h2> <small>H.No:${instituite?.hsno} ${instituite?.street} ${instituite?.city}-${instituite?.pinCode}
												${instituite?.state} ${instituite?.country} Ph:${instituite?.phone}
										</small>
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
							<div class="portlet light bordered">
								<div class="table-responsive">
									<table class="table table-bordered">
										<tbody>
											<tr>
												<td width="10%"><a href="javascript:;">Registration
														Number </a></td>
												<td>
													${studentInstance?.registrationNo }
												</td>
												<td rowspan="6" colspan="3" align="center">
													<div class="thumbnail" style="width: 180px !important">
														<images:getImage id="${studentInstance?.profilePic?.id}"
															class="img-responsive" width="180px" height="180px" />
													</div>
												</td>

											</tr>

											<tr>
												<td><a href="javascript:;"> First Name </a></td>
												<td>
													${studentInstance?.studentName  }
												</td>

											</tr>
											<tr>
												<td><a href="javascript:;"> Last Name </a></td>
												<td>
													${studentInstance?.lastName  }
												</td>

											</tr>

											<tr>
												<td><a href="javascript:;"> Father's Name </a></td>
												<td>
													${studentInstance?.fatherDetails?.parentName}
												</td>

											</tr>
											<tr>
												<td><a href="javascript:;"> Mother's Name </a></td>
												<td>
													${studentInstance?.motherDetails?.parentName}
												</td>
											</tr>
											<tr>
												<td><a href="javascript:;">Date of Joined </a></td>
												<td><g:formatDate date="${studentInstance?.studentDOJ}"
														format="dd-MMM-yyyy" /></td>
											</tr>

											<tr>
												<td><a href="javascript:;">Class</a></td>
												<td><g:each in="${studentInstance?.academicyear}">
														<g:if test="${it.status == 'current'}">
														</g:if>
													</g:each> <g:set value="${it?.presentclass}" var="pclass"></g:set> ${pclass.classname }
													
													<b>  Section : </b><g:each in="${studentInstance?.academicyear}">
														<g:if test="${it.status == 'current'}">
														</g:if>
													</g:each> <g:set value="${it?.section}" var="pclass"></g:set> ${pclass.sectionName }


												</td>
												<td><a href="javascript:;">Student ID</a></td>
																		<td class="hidden-xs">
																	${studentInstance?.studentId}
																	</td>
											</tr>
<tr>
																	
																	<td><a href="javascript:;">Medium  Of Instruction</a></td>
																		<td class="hidden-xs">
																	${studentInstance?.mediumOfInstruction }
																	</td>
																	<td><a href="javascript:;">STS Number</a></td>
																		<td class="hidden-xs">
																	${studentInstance?.stsSystem}
																	</td>
																	</tr>
											<tr>
												<td colspan="4" align="center"><h4
														style="color: #fc6403">Personal Details</h4></td>
											</tr>



											<tr>
												<td width="20%"><a>Date of Birth</a></td>
												<td><g:formatDate date="${studentInstance?.studentDOB}"
														format="dd-MMM-yyyy" /></td>


											</tr>

											<tr>
												<td width="20%"><a>Mother Tongue</a></td>
												<td>
													${studentInstance?.motherTongue}
												</td>
												<td width="20%"><a> Blood Group</a></td>
												<td>
													${studentInstance?.bloodgroup}
												</td>

											</tr>
											<tr>
												<td width="20%"><a>Religion</a></td>
												<td>
													${studentInstance?.religion}
												</td>
												<td width="20%"><a> Nationality</a></td>
												<td>
													${studentInstance?.nationality}
												</td>

											</tr>
											<tr>
												<td><a>Gender</a></td>
												<td>
													${studentInstance?.gender}
												</td>
												<td><a>Category</a></td>
												<td>
													${studentInstance?.category}
												</td>
											</tr>
											<tr>
												<td><a>Adhar Card</a></td>
												<td>
													${studentInstance?.studentAdharNo}
												</td>
												
											</tr>
											<tr>
												<td colspan="4" align="center"><h4
														style="color: #fc6403">Parent's / Guardian Details</h4></td>
											</tr>
											<tr>
												<td><a>Father's Name</a></td>
												<td>
													${studentInstance?.fatherDetails?.parentName}
												</td>
												<td><a>Mother's Name</a></td>
												<td>
													${studentInstance?.motherDetails?.parentName}
												</td>

											</tr>
											<tr>
												<td><a>Father's Occupation</a></td>
												<td>
													${studentInstance?.fatherDetails?.occupation}
												</td>

												<td><a>Father's Contact</a></td>
												<td>
													${studentInstance?.fatherDetails?.mobileNumber}
												</td>

											</tr>
											
											<tr>
												<td><a>Father's Adhar Card</a></td>
												<td>
													${studentInstance?.fatherDetails?.parentAdharNo}
												</td>

												<td><a>Father's Voter Id</a></td>
												<td>
													${studentInstance?.fatherDetails?.parentVoterId}
												</td>

											</tr>



											<tr>
												<td><a>Mother's Occupation</a></td>
												<td>
													${studentInstance?.motherDetails?.occupation}
												</td>

												<td><a>Mother's Contact</a></td>
												<td>
													${studentInstance?.motherDetails?.parentVoterId}
												</td>

											</tr>
											<tr>
												<td><a>Mother's Adhar Card</a></td>
												<td>
													${studentInstance?.fatherDetails?.parentAdharNo}
												</td>

												<td><a>Mother's Voter ID</a></td>
												<td>
													${studentInstance?.fatherDetails?.parentVoterId}
												</td>

											</tr>
											<tr>
												<td><a>Guardian Name</a></td>
												<td>
													${studentInstance?.guardianDetails?.parentName}
												</td>
												<td><a>Guardian Occupation </a></td>
												<td>
													${studentInstance?.guardianDetails?.occupation}
												</td>

											</tr>
											<tr>
												<td><a>Guardian Contact</a></td>
												<td>
													${studentInstance?.guardianDetails?.mobileNumber}
												</td>
												<td></td>
												<td></td>

											</tr>
											<tr>
												<td><a>Guardian Adhar Card</a></td>
												<td>
													${studentInstance?.guardianDetails?.parentAdharNo}
												</td>
												<td><a>Guardian Voter Id</a></td>
												<td>
												${studentInstance?.guardianDetails?.parentVoterId}
												</td>

											</tr>

											<tr>
												<td colspan="4" align="center"><h4
														style="color: #fc6403">Address Details</h4></td>
											</tr>



											<tr>
												<td width="20%"><a>Present Address</a></td>
												<td>
													${studentInstance?.presentAddress?.hsno} ${studentInstance?.presentAddress?.street},
													${studentInstance?.presentAddress?.city} - ${studentInstance?.presentAddress?.pinCode}, ${studentInstance?.presentAddress?.state},
													- ${studentInstance?.presentAddress?.country}
												</td>
												<td></td>
												<td></td>

											</tr>
											<tr>
												<td><a>Permanent Address </a></td>
												<td>
													${studentInstance?.permenentAddres?.hsno} ${studentInstance?.permenentAddres?.street},
													${studentInstance?.permenentAddres?.city} - ${studentInstance?.presentAddress?.pinCode}, ${studentInstance?.permenentAddres?.state},
													- ${studentInstance?.permenentAddres?.country}
												</td>
												<td></td>
												<td></td>

											</tr>
											<tr>
												<td><a>Contact Number</a></td>
												<td>
													${studentInstance?.studentPhNumber  }
												</td>
												<td><a>Email ID </a></td>
												<td>
													${studentInstance?.email  }
												</td>

											</tr>
											<%-- 
										<tr>
											<td colspan="4" align="center"><h4 style="color:#fc6403 ">Fees Paid Details</h4></td>
										</tr>
										<tr>
											<td><a>Class Name </a></td>
											<td>
												${studentInstance?.presentclass?.classname }
											</td>
											<td colspan="2"></td>
										</tr>
										 --%>


											<%--
										<g:each in="${studentInstance?.academicyear?.feeId?.feetypes }" var="feetype">
										<tr>
											<td>
												<a>${feetype?.instFeeType.typeName}</a>
											</td>
											<td>${feetype?.amountPaid} <i style="margin-left:200px" class="fa fa-arrows-h"></i></td>
											<td><a>Due Amount:</a> </td>
											<td>${feetype?.due}</td>
										</tr>
										</g:each>
										
										<tr><td colspan="4"></td></tr>
										<tr>
											<td colspan="2"></td>
											<td align="right"> <b>Total Amount:</b></td>
											<td>${studentInstance?.academicyear?.feeId?.totalFee }</td>
										</tr>
										<tr>
											<td colspan="2"></td>
											<td align="right"> <b>Final Settlement:</b></td>
											<td>${studentInstance?.academicyear?.feeId?.discount }</td>
										</tr>
										<tr>
											<td colspan="2"></td>
											<td align="right"> <b>Amount Paid:</b></td>
											<td>${studentInstance?.academicyear?.feeId?.totalPaid }</td>
										</tr>
										<tr>
											<td colspan="2"></td>
											<td align="right"> <b>Due:</b></td>
											<td>${studentInstance?.academicyear?.feeId?.due }</td>
										</tr>
										
										<g:if test="${studentInstance?.academicyear?.feeId?.penalty > 0}">
										<tr>
											<td colspan="2"></td>
											<td align="right"> <b>Penalty:</b></td>
											<td>${studentInstance?.academicyear?.feeId?.penalty }</td>
										</tr>
										</g:if>
									--%>
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
					<div class="col-xs-6 text-right">
						<a href="javascript:window.print()"
							class="btn-u sm-margin-bottom-10"> <i class="fa fa-print"></i>
							Print
						</a>
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

