

<%@ page import="com.hiideals.instituite.EDcoding.LookUpED"%>
<%@ page import="com.hiideals.institute.staff.Staff"%>
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
					model="[activ:[TransportManagement:'start active open',TransportFee:'active']]"></g:render>
				<!-- END SIDEBAR MENU -->
				<!-- END SIDEBAR MENU -->
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

						<li><i class="fa fa-circle"></i><a class="home"
							href="${createLink(uri: '/')}"><g:message
									code="default.home.label" /></a>
						<li><i class="fa fa-circle"></i> <g:link class="list"
								action="index">Transport Fee Lists</g:link>
						<li><i class="fa fa-circle"></i> <g:link class="create"
								action="create">Create New Fee</g:link>
					</ul>
				</div>
				<%--<div id="show-transportFee" class="content scaffold-show"
					role="main">
					<h3>Show Details</h3>
					<g:if test="${flash.message}">
						<div class="message" role="status">
							${flash.message}
						</div>
					</g:if>
					<div class="portlet box black"
						style="border-style: solid; border-color:lightblue; border-width: 2px;">
						<h3 class="page-title" style="margin-left: 25px">Transportfee
							Details</h3>
						<ol style="margin-left: 3%">

							<g:if test="${transportFeeInstance?.transport}">
								<span id="transport-label"
									class="property-label"><g:message
											code="transportFee.transport.label" default="Transport" /></span> <span
									class="property-value caption-subject bold uppercase"
									style="margin-left: 75px" aria-labelledby="transport-label"><g:link
											controller="transport" action="show"
											id="${transportFeeInstance?.transport?.id}">
											${transportFeeInstance?.transport?.encodeAsHTML()}
										</g:link></span>
							</g:if>

							<g:if test="${transportFeeInstance?.paymentId}">
								<span id="paymentId-label"
									class="property-label"><g:message
											code="transportFee.paymentId.label" default="Payment Id" /></span>

									<span class="property-value caption-subject bold uppercase"
									style="margin-left: 65px" aria-labelledby="paymentId-label"><g:fieldValue
											bean="${transportFeeInstance}" field="paymentId" /></span>
							</g:if>

							<g:if test="${transportFeeInstance?.paymentDate}">
								<span id="paymentDate-label"
									class="property-label"><g:message
											code="transportFee.paymentDate.label" default="Payment Date" /></span>

									<span class="property-value caption-subject bold uppercase"
									style="margin-left: 48px" aria-labelledby="paymentDate-label"><g:formatDate
											date="${transportFeeInstance?.paymentDate}" /></span>
							</g:if>

							<g:if test="${transportFeeInstance?.paidAmount}">
								<span id="paidAmount-label"
									class="property-label"><g:message
											code="transportFee.paidAmount.label" default="Paid Amount" /></span>

									<span class="property-value caption-subject bold uppercase"
									style="margin-left: 58px" aria-labelledby="paidAmount-label"><g:fieldValue
											bean="${transportFeeInstance}" field="paidAmount" /></span>
							</g:if>

							<g:if test="${transportFeeInstance?.remainingAmount}">
								<span id="remainingAmount-label"
									class="property-label"><g:message
											code="transportFee.remainingAmount.label"
											default="Remaining Amount" /></span> <span
									class="property-value caption-subject bold uppercase"
									style="margin-left: 18px"
									aria-labelledby="remainingAmount-label"><g:fieldValue
											bean="${transportFeeInstance}" field="remainingAmount" /></span>
							</g:if>

							<g:if test="${transportFeeInstance?.fine}">
								<span id="fine-label"
									class="property-label"><g:message
											code="transportFee.fine.label" default="Fine" /></span> <span
									class="property-value caption-subject bold uppercase"
									style="margin-left: 90px" aria-labelledby="fine-label"><g:fieldValue
											bean="${transportFeeInstance}" field="fine" /></span>
							</g:if>

							<g:if test="${transportFeeInstance?.institute}">
								<span id="institute-label"
									class="property-label"><g:message
											code="transportFee.institute.label" default="Institute" /></span> <span
									class="property-value caption-subject bold uppercase"
									style="margin-left: 90px" aria-labelledby="institute-label"><g:link
											controller="instituite" action="show"
											id="${transportFeeInstance?.institute?.id}">
											${transportFeeInstance?.institute?.encodeAsHTML()}
										</g:link></span>
							</g:if>

							<g:if test="${transportFeeInstance?.student}">
								<span id="student-label"
									class="property-label"><g:message
											code="transportFee.student.label" default="Student" /></span> <span
									class="property-value caption-subject bold uppercase"
									style="margin-left: 90px" aria-labelledby="student-label"><g:link
											controller="student" action="show"
											id="${transportFeeInstance?.student?.id}">
											${transportFeeInstance?.student?.encodeAsHTML()}
										</g:link></span>
							</g:if>

							<g:if test="${transportFeeInstance?.employee}">
								<span id="employee-label"
									class="property-label"><g:message
											code="transportFee.employee.label" default="Employee" /></span> <span
									class="property-value caption-subject bold uppercase"
									style="margin-left: 60px" aria-labelledby="employee-label"><g:link
											controller="staff" action="show"
											id="${transportFeeInstance?.employee?.id}">
											${transportFeeInstance?.employee?.encodeAsHTML()}
										</g:link></span>
							</g:if>

						</ol>
						<br>
						<g:form url="[resource:transportFeeInstance, action:'delete']"
							method="DELETE">
							<fieldset class="buttons">
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<g:link class="edit" action="edit"
									id="${LookUpED.encod(transportFeeInstance.id)}">
									<g:message code="default.button.edit.label" default="Edit" />
								</g:link>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<g:actionSubmit class="delete" action="delete"
									value="${message(code: 'default.button.delete.label', default: 'Delete')}"
									onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
							</fieldset>
						</g:form>
						<br>
						<br>
					</div>

				</div>
			--%>
				<div class="panel">
					<div class="panel-body">
						<div class="box box-info">

							<div class="row">
								<div class="col-md-12">
									<table class="table table-bordered">
										<g:if test="${transportFeeInstance?.transport}">
											<tr>
												<td><span id="transport-label" class="property-label"><g:message
															code="transportFee.transport.label" default="Transport" /></span>
												</td>
												<td><span
													class="property-value caption-subject bold uppercase"
													aria-labelledby="transport-label"> ${transportFeeInstance?.transport?.encodeAsHTML()}
												</span></td>
											</tr>
										</g:if>

										<g:if test="${transportFeeInstance?.paymentId}">
											<tr>
												<td><span id="paymentId-label" class="property-label"><g:message
															code="transportFee.paymentId.label" default="Payment Id" /></span>
												</td>
												<td><span
													class="property-value caption-subject bold uppercase"
													aria-labelledby="paymentId-label"><g:fieldValue
															bean="${transportFeeInstance}" field="paymentId" /></span></td>
											</tr>
										</g:if>
										<g:if test="${transportFeeInstance?.paymentDate}">
											<tr>
												<td><span id="paymentDate-label" class="property-label"><g:message
															code="transportFee.paymentDate.label"
															default="Payment Date" /></span></td>
												<td><span
													class="property-value caption-subject bold uppercase"
													aria-labelledby="paymentDate-label"><g:formatDate
															date="${transportFeeInstance?.paymentDate}" /></span></td>
											</tr>

										</g:if>
										<g:if test="${transportFeeInstance?.paidAmount}">
											<tr>
												<td><span id="paidAmount-label" class="property-label"><g:message
															code="transportFee.paidAmount.label"
															default="Paid Amount" /></span></td>
												<td><span
													class="property-value caption-subject bold uppercase"
													aria-labelledby="paidAmount-label"><g:fieldValue
															bean="${transportFeeInstance}" field="paidAmount" /></span></td>
											</tr>
										</g:if>
										<g:if test="${transportFeeInstance?.remainingAmount}">
											<tr>
												<td><span id="remainingAmount-label"
													class="property-label"><g:message
															code="transportFee.remainingAmount.label"
															default="Remaining Amount" /></span></td>
												<td><span
													class="property-value caption-subject bold uppercase"
													aria-labelledby="remainingAmount-label"><g:fieldValue
															bean="${transportFeeInstance}" field="remainingAmount" /></span>
												</td>
											</tr>
										</g:if>
										<g:if test="${transportFeeInstance?.fine}">
											<tr>
												<td><span id="fine-label" class="property-label"><g:message
															code="transportFee.fine.label" default="Fine" /></span></td>
												<td><span
													class="property-value caption-subject bold uppercase"
													aria-labelledby="fine-label"><g:fieldValue
															bean="${transportFeeInstance}" field="fine" /></span></td>
											</tr>
										</g:if>
										<g:if test="${transportFeeInstance?.institute}">
											<tr>
												<td><span id="institute-label" class="property-label"><g:message
															code="transportFee.institute.label" default="Institute" /></span>
												</td>
												<td><span
													class="property-value caption-subject bold uppercase"
													aria-labelledby="institute-label"><g:link
															controller="instituite" action="show"
															id="${transportFeeInstance?.institute?.id}">
															${transportFeeInstance?.institute?.encodeAsHTML()}
														</g:link></span></td>
											</tr>

										</g:if>
										<g:if test="${transportFeeInstance?.student}">
											<tr>
												<td><span id="student-label" class="property-label"><g:message
															code="transportFee.student.label" default="Student" /></span></td>
												<td><span
													class="property-value caption-subject bold uppercase"
													aria-labelledby="student-label"><g:link
															controller="student" action="show"
															id="${transportFeeInstance?.student?.id}">
															${transportFeeInstance?.student?.encodeAsHTML()}
														</g:link></span></td>
											</tr>
										</g:if>
										<g:if test="${transportFeeInstance?.employee}">
											<tr>
												<td><span id="employee-label" class="property-label"><g:message
															code="transportFee.employee.label" default="Employee" /></span>
												</td>
												<td><span
													class="property-value caption-subject bold uppercase"
													aria-labelledby="employee-label"><g:link
															controller="staff" action="show"
															id="${transportFeeInstance?.employee?.id}">
															${transportFeeInstance?.employee?.encodeAsHTML()}
														</g:link></span></td>
											</tr>
										</g:if>
										<tr>
											<td>Actions</td>
											<td><g:form
													url="[resource:transportFeeInstance, action:'delete']"
													method="DELETE">
													<fieldset class="buttons">
														&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
														<g:link class="edit" action="edit"
															id="${LookUpED.encod(transportFeeInstance.id)}">
															<g:message code="default.button.edit.label"
																default="Edit" />
														</g:link>
														&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
														<g:actionSubmit class="delete btn blue" action="delete"
															value="${message(code: 'default.button.delete.label', default: 'Delete')}"
															onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
													</fieldset>
												</g:form></td>
										</tr>
									</table>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<g:render template="/footer/footer"></g:render>
	<!--[if lt IE 9]>
<script src="assets1/global/plugins/respond.min.js"></script>
<script src="assets1/global/plugins/excanvas.min.js"></script> 
<![endif]-->
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

