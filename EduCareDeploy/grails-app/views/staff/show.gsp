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
					model="[activ:[staff:'start active open',staffList:'active']]"></g:render>
				
			</div>
		</div>
		
		<div class="page-content-wrapper">
			<div class="page-content">

				<div class="page-bar">
					<ul class="page-breadcrumb">
						<li><a href="${createLink(uri: '/')}">Home</a> <i
							class="fa fa-circle"></i>
						<li><g:link action="index">View List</g:link>
					</ul>

				</div>


				<div class="panel">
					<div class="panel-body">
						<div class="box box-info">

							<div class="row">
								<%--<div class="col-md-6">
			     <g:if test="${staffInstance?.substutingSubjects}">
				
					<span id="substutingSubjects-label" class="property-label"><g:message code="staff.substutingSubjects.label" default="Substuting Subjects" /></span>
					
						<g:each in="${staffInstance.substutingSubjects}" var="s">
						<span class="property-value caption-subject bold uppercase"  style="margin-left:45px" aria-labelledby="substutingSubjects-label"><g:link controller="subject" action="show" id="${s.id}">${s?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				
				</g:if>
			</div>--%>
								<div class="col-md-12">
									<table class="table table-bordered table-hover">
										<g:if test="${staffInstance?.institute}">
											<tr>
												<td width="25%"><span id="institute-label" class="property-label"><g:message
															code="staff.institute.label" default="Institute" /></span></td>
												<td><span
													class="property-value caption-subject bold uppercase"
													aria-labelledby="institute-label"> ${staffInstance?.institute?.name}
												</span></td>
											</tr>

										</g:if>

										<g:if test="${staffInstance?.address}">
											<tr>
												<td><span id="address-label" class="property-label"><g:message
															code="staff.address.label" default="Address" /></span></td>
												<td><span
													class="property-value caption-subject bold uppercase"
													aria-labelledby="address-label"> ${staffInstance?.address?.hsno}
														${staffInstance?.address?.street}, ${staffInstance?.address?.city},
														${staffInstance?.address?.state}, - ${staffInstance?.address?.country}
												</span></td>
											</tr>

										</g:if>
										<g:if test="${staffInstance?.teachingSubject}">
											<tr>
												<td><span id="teachingSubject-label"
													class="property-label"><g:message
															code="staff.teachingSubject.label"
															default="TeachingSubject" /></span></td>
												<td><span
													class="property-value caption-subject bold uppercase"
													aria-labelledby="teachingSubject-label"> ${staffInstance?.teachingSubject?.subjectName}</span>

												</td>
											</tr>
										</g:if>
										<g:if test="${staffInstance?.qualification}">
											<tr>
												<td><span id="qualification-label"
													class="property-label"><g:message
															code="staff.qualification.label" default="Qualification" /></span>
												</td>
												<td><span
													class="property-value caption-subject bold uppercase"
													aria-labelledby="qualification-label"><g:fieldValue
															bean="${staffInstance}" field="qualification" /></span></td>
											</tr>

										</g:if>

										<g:if test="${staffInstance?.staffID}">
											<tr>
												<td><span id="staffID-label" class="property-label"><g:message
															code="staff.staffID.label" default="Staff ID" /></span></td>
												<td><span
													class="property-value caption-subject bold uppercase"
													aria-labelledby="staffID-label"><g:fieldValue
															bean="${staffInstance}" field="staffID" /></span></td>
											</tr>

										</g:if>
										<g:if test="${staffInstance?.staffName}">
											<tr>
												<td><span id="staffName-label" class="property-label"><g:message
															code="staff.staffName.label" default="Staff Name" /></span></td>
												<td><span
													class="property-value caption-subject bold uppercase"
													aria-labelledby="staffName-label"><g:fieldValue
															bean="${staffInstance}" field="staffName" /></span></td>
											</tr>

										</g:if>
										<tr>
											<td>Actions</td>
											<td><g:form
													url="[resource:staffInstance, action:'delete']"
													method="DELETE">
													<fieldset class="buttons">
														<g:link class="btn yellow" action="edit"
															id="${LookUpED.encod(staffInstance.id)}">
															<g:message code="default.button.edit.label"
																default="Edit" />
														</g:link>
														<g:actionSubmit class=" btn red" action="delete"
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



