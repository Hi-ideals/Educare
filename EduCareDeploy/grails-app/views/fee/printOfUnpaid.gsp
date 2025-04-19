
<%@ page import="com.hiideals.instituite.EDcoding.LookUpED"%>
<!DOCTYPE html>

<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
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

<link href="assets1/global/css/components.min.css" rel="stylesheet"
	id="style_components" type="text/css" />
<link href="assets1/global/css/plugins.min.css" rel="stylesheet"
	type="text/css" />

<link href="assets1/layouts/layout/css/layout.min.css" rel="stylesheet"
	type="text/css" />
<link href="assets1/layouts/layout/css/themes/darkblue.min.css"
	rel="stylesheet" type="text/css" id="style_color" />
<link href="assets1/layouts/layout/css/custom.min.css" rel="stylesheet"
	type="text/css" />

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
	<!--Start Header-->
	<div id="printableArea" >
						<table width="700" bgcolor="#fff" border="0" cellpadding="0"
							cellspacing="0" align="center" class="deviceWidth">
							<tr>
								<td style="padding: 6px 0px 0px">
									<table width="650" border="0" cellpadding="0" cellspacing="0"
										align="center" class="deviceWidth">
										<tr>
											<td width="100%">
												<!--Start logo-->
												<table border="0" cellpadding="0" cellspacing="0"
													align="left" class="deviceWidth">
													<tr>
														<td class="center" style="padding: 20px 0px 10px 0px">
															<a href="#"><images:getImage
																	id="${institute?.logo?.id}" width="80px"
																	height="80px" /></a>
														</td>
													</tr>
												</table>
												<!--End logo--> <!--Start nav-->
												<table border="0" cellpadding="0" cellspacing="0"
													align="center" class="deviceWidth">
													<tr>
														<td class="center"
															style="font-size: 13px; color: #ffffff; font-weight: light; text-align: center; font-family: Arial, Helvetica, sans-serif; line-height: 25px; vertical-align: middle;">
															<h2>
																${institute?.name }
															</h2>
															<p>
																Affiliated to:
																${institute?.affiliatedTo }
															</p>
														</td>
													</tr>
												</table>
												<!--End nav-->
											</td>
										</tr>
									</table>
<div class="portlet box blue">
								<div class="portlet-title">
									<div class="caption">
										<i class="fa fa-user"></i> List of Student Not Paid Fees
									</div>
								</div>
								<div class="portlet-body">
									<div class="table-scrollable">

										<table class="table table-bordered table-hover">
											<thead>
												<tr>
												
												<th>Rregistration No.</th>

													<th><g:message code="fee.studentId.label"
															default="Student Name" /></th>
													
													<th>Class Name</th>
													<th>Academic year</th>
												
												</tr>
											</thead>
											<tbody>
												<g:each in="${ss}" var="st" status="i">
													<tr>
													<td>
															${st?.registrationNo}
														</td>
														<td>
															${st?.studentName}
														</td>
														<td>
														<g:each in="${st?.academicyear}">
									<g:if test="${it.status == 'current'}">
									</g:if>
								</g:each> <g:set value="${it?.presentclass}" var="pclass"></g:set> ${pclass.classname }
														</td>
														<td>
															<g:each in="${st?.academicyear}">
									<g:if test="${it.status == 'current'}">
									</g:if>
								</g:each> <g:set value="${it}" var="pclass"></g:set> ${pclass.academicyear}
														</td>
														
													</tr>
												</g:each>
											</tbody>
										</table>
									</div>
									</div>
									<div class="text-center">
							<a onclick="printDiv('printableArea')"
								class="btn btn blue btn-primary"><i class="fa fa-print"></i>
								Take Print</a>
						</div>
					</div>

								</div>
								<script type="text/javascript">
		function printDiv(akash) {
			var printContents = document.getElementById(akash).innerHTML;
			var originalContents = document.body.innerHTML;

			document.body.innerHTML = printContents;

			window.print();

			document.body.innerHTML = originalContents;
		}
	</script>
</html>
								
							