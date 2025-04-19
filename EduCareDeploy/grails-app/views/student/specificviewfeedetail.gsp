<%@ page import="com.hiideals.instituite.student.Student"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<meta name="description" content="School Management 	" />
<meta name="keywords" content="School Management   " />
<title>
	${instituite?.name} : Fee Payment
</title>

<link href="includes/css/blue.css" rel="stylesheet" type="text/css" />
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
	#printhide {
		display: none;
	}
	.col-md-1, .col-md-2, .col-md-3, .col-md-4, .col-md-5, .col-md-6,
		.col-md-7, .col-md-8, .col-md-9, .col-md-10, .col-md-11, .col-md-12 {
		float: left;
	}
	.col-md-12 {
		width: 100%;
	}
	.col-md-11 {
		width: 91.66666667%;
	}
	.col-md-10 {
		width: 83.33333333%;
	}
	.col-md-9 {
		width: 75%;
	}
	.col-md-8 {
		width: 66.66666667%;
	}
	.col-md-7 {
		width: 58.33333333%;
	}
	.col-md-6 {
		width: 50%;
	}
	.col-md-5 {
		width: 41.66666667%;
	}
	.col-md-4 {
		width: 33.33333333%;
	}
	.col-md-3 {
		width: 25%;
	}
	.col-md-2 {
		width: 16.66666667%;
	}
	.col-md-1 {
		width: 8.33333333%;
	}
}

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
<body class="body_pop">

	<div class="portlet light">
		<div
			style="max-width: 600px; margin: 0 auto; border: 1px solid #bbb; padding: 3px 8px;">
			<div class="row">
				<div class="col-md-12">
					<div class="text-center">
						<div class="headline">
							<ul class="list-inline">
								<li>
									<div style="margin-top: -30px !important">
										<images:getImage id="${instituite?.logo?.id}" width="50px"
											height="50px" alt="Image" title="Images" />
									</div>
								</li>
								<li>
									<h3>
										${instituite?.name}
									</h3> <small> ${instituite?.hsno} ${instituite?.street} ${instituite?.city}-${instituite?.pinCode}
										${instituite?.state} ${instituite?.country} Ph:${instituite?.phone}
								</small>
								</li>
								<li></li>
							</ul>
							<h4>Student Payment Details</h4>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-10">
					<table>
						<tr>
							<td width="37%">Date</td>
							<td>: <g:formatDate date="${tracker?.lastUpdated}" format="dd-MMM-yyyy"/></td>
						</tr>
						<tr>
							<td>Invoice No</td>
							<td>: ${tracker?.invoiceNo}</td>
						</tr>
						<tr>
							<td>Student Name</td>
							<td>: ${stdetails?.studentName} ${stdetails?.lastName}</td>
						</tr>
						<tr>
							<td>Student Id</td>
							<td>: ${stdetails?.studentId}</td>
						</tr>
						<tr>
							<td>Class</td>
							<td>: <g:each in="${stdetails?.academicyear}">
									<g:if test="${it.status == 'current'}">
									</g:if>
								</g:each> <g:set value="${it?.presentclass}" var="pclass"></g:set> ${pclass?.classname }</td>
						</tr>
						<tr>
							<td>Section</td>
							<td>: <g:each in="${studentInstance?.academicyear}">
									<g:if test="${it.status == 'current'}">
									</g:if>
								</g:each> <g:set value="${it?.section}" var="pclass"></g:set> ${pclass?.sectionName}</td>
						</tr>
						<tr>
							<td>Father/Guardian Name</td>
							<td>: ${stdetails?.fatherDetails?.parentName}</td>
						</tr>
						<%--<tr>
							<td>Address</td>
							<td>: ${stdetails?.presentAddress?.hsno} ${stdetails?.presentAddress?.street},
								${stdetails?.presentAddress?.city} - ${stdetails?.presentAddress?.pinCode},
								${stdetails?.presentAddress?.state}, ${stdetails?.presentAddress?.country}</td>
						</tr>
						--%><tr>
							<td>Academic Session</td>
							<td>: <g:each in="${stdetails?.academicyear}">
									<g:if test="${it.status == 'current'}">
									</g:if>
								</g:each> <g:set value="${it}" var="pclass"></g:set> ${pclass?.academicyear}</td>
						</tr>
              <g:set var="user" value="${sec.username()}" />
								<g:if test="${user=="lkbed2011"}">
				<tr> 	
				<td>Remarks</td>
					
				<td >:${tracker?.remarks.toString().replace('[', '').replace(']', '')}
					
					</td>
				</tr>
			</g:if>
					</table>
				</div>
				<div class="col-md-2">
					<g:if test="${studentInstance?.profilePic !=null }">
						<images:getImage id="${studentInstance?.profilePic?.id}"
							width="60" height="60" alt="Image" border="0" title="Images" />
					</g:if>
					<g:else>
						<img src="assets1/layouts/layout/img/user.jpg"
							class="img-responsive pic-bordered" alt="" style="width: 60px" />
					</g:else>
				</div>
				<div class="col-md-12">
					<table id="sum_table" border="1"
						class="table table-striped table-bordered table-hover">
						<tr>
							<td><a>Fee Details</a></td>
							<td><a>Amount</a></td>
							<td><a>Paid Amount</a></td>
							<td><a>Due</a></td>
						</tr>
						<g:each in="${fList}" var="trackerInstance" status="j">
							<tr>
								<td>
									${j+1}
								</td>
								<td>
									${trackerInstance?.instFeeTypeT}
								</td>
								<%--
	<td>
	${trackerInstance?.amountToBePaidT}
	</td>
	 --%>
								<td>
									${trackerInstance?.amountPaidT}
								</td>
								<td>0</td>
																	<%--
									<td>${trackerInstance?.dueT}</td>--%>
									
		
							</tr>
						</g:each>

					</table>
				</div>
				<div class="col-md-12">
					<div class="pull-right">
						<p>
							<strong>Received with thanks</strong>
						</p>
						<input type="button" id="printbutton" value="&nbsp;PRINT"
							onclick="return printing();" class="btn blue" />
					</div>
				</div>
			</div>
		</div>
	</div>



	<script type="text/javaScript">
		function printing() {
			document.getElementById("printbutton").style.display = "none";
			window.print();
			window.close();
		}
	</script>


</body>
</html>


