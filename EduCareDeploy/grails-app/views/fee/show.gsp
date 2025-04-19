
<%@ page import="com.hiideals.instituite.feemanagment.Fee"%>
<%@ page import="com.hiideals.instituite.EDcoding.LookUpED"%>

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
</head>
<!-- END HEAD -->

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
		<!-- BEGIN SIDEBAR -->
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
						<li><a href="${createLink(uri: '/')}">Home</a> <i
							class="fa fa-circle"></i></li>
						<li><g:link action="index">View List</g:link></li>
					</ul>

				</div>
				<div class="panel">
					<div class="panel-body">
						<div class="row">
							<div class="col-md-12">
								<div id="show-fee" class="content scaffold-show" role="main">
									<g:if test="${flash.message}">
										<div class="message" role="status">
											${flash.message}
										</div>
									</g:if>
									<ol class="property-list fee">

										<g:if test="${feeInstance?.feetypes}">
											<li class="fieldcontain"><span id="feetypes-label"
												class="property-label"><g:message
														code="fee.feetypes.label" default="Feetypes" /></span> <g:each
													in="${feeInstance.feetypes}" var="f">
													<span class="property-value"
														aria-labelledby="feetypes-label"><g:link
															controller="feesTypes" action="show" id="${f.id}">
															${f?.encodeAsHTML()}
														</g:link></span>
												</g:each></li>
										</g:if>

										<g:if test="${feeInstance?.studentId}">
											<li class="fieldcontain"><span id="studentId-label"
												class="property-label"><g:message
														code="fee.studentId.label" default="Student Id" /></span> <span
												class="property-value" aria-labelledby="studentId-label"><g:link
														controller="student" action="show"
														id="${feeInstance?.studentId?.id}">
														${feeInstance?.studentId?.encodeAsHTML()}
													</g:link></span></li>
										</g:if>

										<g:if test="${feeInstance?.due}">
											<li class="fieldcontain"><span id="due-label"
												class="property-label"><g:message
														code="fee.due.label" default="Due" /></span> <span
												class="property-value" aria-labelledby="due-label"><g:fieldValue
														bean="${feeInstance}" field="due" /></span></li>
										</g:if>

										<g:if test="${feeInstance?.totalFee}">
											<li class="fieldcontain"><span id="totalFee-label"
												class="property-label"><g:message
														code="fee.totalFee.label" default="Total Fee" /></span> <span
												class="property-value" aria-labelledby="totalFee-label"><g:fieldValue
														bean="${feeInstance}" field="totalFee" /></span></li>
										</g:if>

										<g:if test="${feeInstance?.totalPaid}">
											<li class="fieldcontain"><span id="totalPaid-label"
												class="property-label"><g:message
														code="fee.totalPaid.label" default="Total Paid" /></span> <span
												class="property-value" aria-labelledby="totalPaid-label"><g:fieldValue
														bean="${feeInstance}" field="totalPaid" /></span></li>
										</g:if>

										<g:if test="${feeInstance?.discount}">
											<li class="fieldcontain"><span id="discount-label"
												class="property-label"><g:message
														code="fee.discount.label" default="Discount" /></span> <span
												class="property-value" aria-labelledby="discount-label"><g:fieldValue
														bean="${feeInstance}" field="discount" /></span></li>
										</g:if>

										<g:if test="${feeInstance?.penalty}">
											<li class="fieldcontain"><span id="penalty-label"
												class="property-label"><g:message
														code="fee.penalty.label" default="Penalty" /></span> <span
												class="property-value" aria-labelledby="totalPaid-label"><g:fieldValue
														bean="${feeInstance}" field="penalty" /></span></li>
										</g:if>

									</ol>
									<g:form url="[resource:feeInstance, action:'delete']"
										method="DELETE">
										<fieldset class="buttons">
											<g:link class="edit" action="edit"
												id="${LookUpED.encod(feeInstance?.id)}">
												<g:message code="default.button.edit.label" default="Edit" />
											</g:link>
											<g:actionSubmit class="delete" action="delete"
												value="${message(code: 'default.button.delete.label', default: 'Delete')}"
												onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
										</fieldset>
									</g:form>

									<div class="table-scrollable">
										<table class="table  table-hover">

											<thead>
												<tr>
													<th>instalment</th>
													<th>Payment Type</th>
													<th>instFeeType</th>
													<th>amountPaid</th>
													<th>due</th>
											</thead>
											<g:each in="${trackerList}" var="feet" status="j">
												<tr>
													<g:each in="${feet.feetypetracker}" var="ty" status="i">
														<tr>
															<g:if test="${i==0 }">
																<td rowspan="${feet.feetypetracker.size()}"
																	align="center" valign="bottom">
																	${feet.instalment}
																</td>
																<td rowspan="${feet.feetypetracker.size()}">
																	${feet.paymentType}
																</td>
															</g:if>

															<td>
																${ty.instFeeTypeT}
															</td>
															<td>
																${ty.amountPaidT}
															</td>
															<td>
																${ty.dueT}
															</td>

														</tr>
													</g:each>
												</tr>
											</g:each>
										</table>
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

	<script src="assets1/global/scripts/app.min.js" type="text/javascript"></script>

	<script src="assets1/layouts/layout/scripts/layout.min.js"
		type="text/javascript"></script>
</body>

</html>



