
<%@ page import="com.hiideals.instituite.feemanagment.Fee"%>
<%@ page import="com.hiideals.instituite.classcourses.IClass"%>
<%@ page import="com.hiideals.instituite.EDcoding.LookUpED"%>
<!DOCTYPE html>

<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->

<head>
<meta charset="utf-8" />
<title>Hi-Educare | Admin</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1" name="viewport" />
<meta content="" name="description" />
<meta content="" name="author" />
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
<link
	href="assets1/global/plugins/bootstrap-datepicker/css/bootstrap-datepicker6.min.css"
	type="text/css" rel="stylesheet">
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

<body
	class="page-header-fixed page-sidebar-closed-hide-logo page-content-white">
	<div class="page-header navbar navbar-fixed-top">
		<div class="page-header-inner ">
			<g:render template="/header/logo"></g:render>
			<a href="javascript:;" class="menu-toggler responsive-toggler"
				data-toggle="collapse" data-target=".navbar-collapse"> </a>
			<g:render template="/header/topBar"></g:render>
		</div>
	</div>

	<div class="clearfix"></div>
	<div class="page-container">
		<div class="page-sidebar-wrapper">
			<div class="page-sidebar navbar-collapse collapse">
				<g:render template="/header/leftSide"
					model="[activ:[feeStructure:'start active open',fee:'active']]"></g:render>

			</div>
		</div>

		<div class="page-content-wrapper">
			<div class="page-content">

				<div class="page-bar">
					<ul class="page-breadcrumb">
						<li><a href="${createLink(uri: '/')}">Home</a></li>
					</ul>

				</div>

				<div class="panel">
					<div class="panel-body">
						<g:if test="${flash.message}">
							<div class="message" role="status" style="color: green;"></div>

							<div class="modal fade" id="overlay">
								<div class="modal-dialog">
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal"
												aria-hidden="true">&times;</button>
											<h4 class="modal-title">
												${flash.message}
											</h4>
										</div>
										<div class="modal-body">
											<button class="btn blue" class="close" data-dismiss="modal">
												Close</button>

											<g:link class="btn blue" controller="student"
												action="specificfeeprint" id="${LookUpED.decod(params.id)}"
												target='_blank'>Get Fee Print</g:link>

										</div>
									</div>
								</div>
							</div>

						</g:if>

						<div class="row">
							<div class="col-md-12">
								<div class="box box-info">
									<div class="portlet light bordered">
										<div class="portlet-title">
											<div class="caption font-blue">
												<i class="icon-magnifier font-blue"></i> <span
													class="caption-subject bold uppercase"> Search
													Student</span>
											</div>

										</div>

										<div class="portlet-body form">


											<button class="btn blue" id="classclick">
												<i class="icon-magnifier font-white"></i> By Due Amount
											</button>
											<button class="btn yellow" id="dateclick">
												<i class="icon-magnifier font-white"></i> By Date
											</button>
											<div class="margin-bottom-10"></div>
											<div id="class" style="display: none">
												<g:form action="index">
													<div class="row">


														<div class="col-md-3">
															<div class="form-group form-md-floating-label">
																<label>Sort by Field </label> <select name="field"
																	class="form-control">
																	<option value="due">Due</option>
																	<option value="totalPaid">Total Paid</option>
																</select>
															</div>
														</div>
														<div class="col-md-3">
															<div class="form-group  form-md-floating-label">
																<label>Calculate </label> <select name="typ"
																	class="form-control">
																	<option value="gt">greater than</option>
																	<option value="geth">greater than or equalto</option>
																	<option value="lt">less than</option>
																	<option value="let">less than or equalto</option>
																	<option value="eq">Equal To</option>
																</select>
															</div>
														</div>

														<div class="col-md-3">
															<div class="form-group form-md-floating-label">
																<label>Amount </label>
																<g:field type="text" name="amount" class="form-control" />

															</div>
														</div>

														<div class="col-md-3">
															<div
																class="form-group form-md-line-input form-md-floating-label">
																<g:submitButton name="submit"
																	class="btn btn blue btn-primary btn-block" />
															</div>
														</div>
													</div>
												</g:form>
											</div>

											<div id="date" style="display: none">
												<g:form name="ss" url="[action:'index']">
													<div class="row">

														<div class="col-md-4">
															<label>From</label> <input type="text" name="from"
																id="datepicker" class="form-control date-picker">
														</div>
														<div class="col-md-4">
															<label>To</label> <input type="text" name="to"
																id="datepicker1" class="form-control date-picker"
																value="${params.to}">
														</div>
														<input type="hidden" value="asc" name="orderd">

														<div class="col-md-4">
															<g:submitButton name="Search" class="btn green"
																style="margin-top: 22px" />
														</div>
													</div>

												</g:form>
											</div>
										</div>

										<div class="form-body"></div>
									</div>
								</div>
							</div>

							<div class="col-md-12" style="margin-top: 20px">
								<div id="list-fee" class="content scaffold-list" role="main">



									<div class="row" id="printlogoButton" hidden="">
										<div class="col-md-12">
											<div class="well" style="padding: 1px">
												<div class="text-center">
													<ul class="list-inline">
														<li><images:getImage id="${institute?.logo?.id}"
																width="100px" height="100px" /><br></li>
														<li>
															<h2 class="page-title" style="color: #000">
																${institute?.name }
																<br> <small>Affiliated to: ${institute?.affiliatedTo }</small>
															</h2>

														</li>
													</ul>
												</div>
											</div>
										</div>
									</div>
									<div class="portlet box grey">
										<div class="portlet-title">
											<div class="caption">
												<i class="fa fa-rupee"></i> List of Fees
											</div>
										</div>
										<div class="portlet-body">
											<div class="table-scrollable">
												<table class="table table-bordered table-hover">
													<thead>
														<tr>

															<th><g:message code="fee.studentId.label"
																	default="Student Name" /></th>
															<th>Class</th>
															<th>Section</th>

															<th><g:message
																	code="${message(code: 'fee.due.label', default: 'Due')}" /></th>

															<th><g:message
																	code="${message(code: 'fee.totalFee.label', default: 'Total Fee')}" /></th>

															<th>Final Settlement</th>
															<th><g:message
																	code="${message(code: 'fee.totalPaid.label', default: 'Total Paid')}" /></th>

															<th>
																${message(code: 'fee.lastUpdated.label', default: 'Last Updated on')}
															</th>
															<th>Academic year</th>
															<th id="printPageButton">Options</th>
														</tr>
													</thead>
													<tbody>
														<g:if test="${feeInstanceList}">
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
																			${feeInstance?.academic?.section?.sectionName}
																		</td>

																		<td>
																			${feeInstance?.totalFee-feeInstance?.totalPaid }
																		</td>

																		<td>
																			${fieldValue(bean: feeInstance, field: "totalFee")}
																		</td>

																		<td>
																			${fieldValue(bean: feeInstance, field: "discount")}
																		</td>
																		<td>
																			${fieldValue(bean: feeInstance, field: "totalPaid")}
																		</td>
																		<td>
																			${fieldValue(bean: feeInstance, field: "lastUpdated")}
																		</td>
																		<td>
																			${feeInstance?.academic?.academicyear}
																		</td>
																		<td id="printPageButton"><g:link controller="fee"
																				action="edit"
																				id="${LookUpED.encod(feeInstance?.id) }" title="">Collect Fees</g:link>
																			| <g:link controller="student" action="show"
																				id="${LookUpED.encod(feeInstance?.studentId?.id) }">View Profile</g:link>
																			<g:if test="${feeInstance.due==0}">
																			</g:if> <g:else>
																| <g:link controller="fee" action="feenotice"
																					params="[id:feeInstance?.studentId?.id]"
																					target="blank">Fee Notice</g:link>
																			</g:else></td>

																	</tr>
																</g:if>
															</g:each>

															<tr style="color: #337ab7">
																<td><b>Total : </b></td>
																<td></td>
																<td></td>
																<td><b> ${duesum}
																</b></td>
																<td><b> ${Totalsum}
																</b></td>
																<td><b> ${discountsum}
																</b></td>
																<td><b> ${Paidsum}
																</b></td>
																<td colspan="1"></td>
															</tr>


														</g:if>
														<g:else>
															<td align="center"><h4 style="color: red;">No
																	results found</h4></td>
														</g:else>
													</tbody>
												</table>
											</div>
											<div style="text-align: center;">
												<ul class="pagination">
													<li><g:paginate total="${feeInstanceCount ?: 0}"
															params="${params}" /></li>
												</ul>
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
	<script
		src="assets1/global/plugins/bootstrap-datepicker/js/jquery.ui.datepicker.js"></script>

	<script type="text/javascript">
		function printDiv(akash) {
			var printContents = document.getElementById(akash).innerHTML;
			var originalContents = document.body.innerHTML;

			document.body.innerHTML = printContents;

			window.print();

			document.body.innerHTML = originalContents;
		}
	</script>
	<script>
		$('#overlay').modal('show');

		setTimeout(function() {
			$('#overlay').modal('hide');
		}, 500000);
	</script>
	<script type="text/javascript"></script>
	<script type="text/javascript">
		$('document').ready(function() {
			$("#regclick").click(function() {
				$("#Reg").toggle(500);
				$("#class").hide(500);
				$("#date").hide(500);
				$("#casting").hide(500);
				$("#genderid").hide(500);

			});

			$("#classclick").click(function() {
				$("#class").toggle(500);
				$("#Reg").hide(500);
				$("#date").hide(500);
				$("#casting").hide(500);
				$("#genderid").hide(500);

			});
			$("#dateclick").click(function() {
				$("#class").hide(500);
				$("#Reg").hide(500);
				$("#date").toggle(500);
				$("#casting").hide(500);
				$("#genderid").hide(500);

			});
			$("#castclick").click(function() {
				$("#class").hide(500);
				$("#Reg").hide(500);
				$("#date").hide(500);
				$("#casting").toggle(500);
				$("#genderid").hide(500);

			});
			$("#genderclick").click(function() {
				$("#class").hide(500);
				$("#Reg").hide(500);
				$("#date").hide(500);
				$("#casting").hide(500);
				$("#genderid").toggle(500);

			});
		});
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
</body>

</html>



