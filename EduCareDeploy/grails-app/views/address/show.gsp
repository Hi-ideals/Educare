
<%@ page import="com.hiideals.instituite.helper.Address"%>
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
<link
	href="assets1/global/plugins/bootstrap-fileinput/bootstrap-fileinput.css"
	rel="stylesheet" type="text/css" />
<link href="assets1/pages/css/profile-2.min.css" rel="stylesheet"
	type="text/css" />
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
				<g:render template="/header/leftSide"></g:render>
			</div>
		</div>
		<div class="page-content-wrapper">
			<div class="page-content">

				<div class="page-bar">
					<ul class="page-breadcrumb">
						<li><a href="#">Home</a> <i class="fa fa-circle"></i></li>
						<li><a href="#">Admin</a> <i class="fa fa-circle"></i></li>
					</ul>

				</div>
				<h3 class="page-title">Admin Profile</h3>
				<div class="row">
					<div class="col-md-12">
						<div class="nav" role="navigation">
							<ul>
								<li><a class="home" href="${createLink(uri: '/')}"><g:message
											code="default.home.label" /></a></li>
								<li><g:link class="list" action="index">
										<g:message code="default.list.label" args="[entityName]" />
									</g:link></li>
								<li><g:link class="create" action="create">
										<g:message code="default.new.label" args="[entityName]" />
									</g:link></li>
							</ul>
						</div>
						<div id="show-address" class="content scaffold-show" role="main">
							<h1>
								<g:message code="default.show.label" args="[entityName]" />
							</h1>
							<g:if test="${flash.message}">
								<div class="message" role="status">
									${flash.message}
								</div>
							</g:if>
							<ol class="property-list address">

								<g:if test="${addressInstance?.phno}">
									<li class="fieldcontain"><span id="phno-label"
										class="property-label"><g:message
												code="address.phno.label" default="Phno" /></span> <span
										class="property-value" aria-labelledby="phno-label"><g:fieldValue
												bean="${addressInstance}" field="phno" /></span></li>
								</g:if>

								<g:if test="${addressInstance?.mobileNumber}">
									<li class="fieldcontain"><span id="mobileNumber-label"
										class="property-label"><g:message
												code="address.mobileNumber.label" default="Mobile Number" /></span>

										<span class="property-value"
										aria-labelledby="mobileNumber-label"><g:fieldValue
												bean="${addressInstance}" field="mobileNumber" /></span></li>
								</g:if>

								<g:if test="${addressInstance?.nationality}">
									<li class="fieldcontain"><span id="nationality-label"
										class="property-label"><g:message
												code="address.nationality.label" default="Nationality" /></span> <span
										class="property-value" aria-labelledby="nationality-label"><g:fieldValue
												bean="${addressInstance}" field="nationality" /></span></li>
								</g:if>

								<g:if test="${addressInstance?.bloodgroup}">
									<li class="fieldcontain"><span id="bloodgroup-label"
										class="property-label"><g:message
												code="address.bloodgroup.label" default="Bloodgroup" /></span> <span
										class="property-value" aria-labelledby="bloodgroup-label"><g:fieldValue
												bean="${addressInstance}" field="bloodgroup" /></span></li>
								</g:if>

								<g:if test="${addressInstance?.motherTongue}">
									<li class="fieldcontain"><span id="motherTongue-label"
										class="property-label"><g:message
												code="address.motherTongue.label" default="Mother Tongue" /></span>

										<span class="property-value"
										aria-labelledby="motherTongue-label"><g:fieldValue
												bean="${addressInstance}" field="motherTongue" /></span></li>
								</g:if>

								<g:if test="${addressInstance?.religion}">
									<li class="fieldcontain"><span id="religion-label"
										class="property-label"><g:message
												code="address.religion.label" default="Religion" /></span> <span
										class="property-value" aria-labelledby="religion-label"><g:fieldValue
												bean="${addressInstance}" field="religion" /></span></li>
								</g:if>

								<g:if test="${addressInstance?.city}">
									<li class="fieldcontain"><span id="city-label"
										class="property-label"><g:message
												code="address.city.label" default="City" /></span> <span
										class="property-value" aria-labelledby="city-label"><g:fieldValue
												bean="${addressInstance}" field="city" /></span></li>
								</g:if>

								<g:if test="${addressInstance?.country}">
									<li class="fieldcontain"><span id="country-label"
										class="property-label"><g:message
												code="address.country.label" default="Country" /></span> <span
										class="property-value" aria-labelledby="country-label"><g:fieldValue
												bean="${addressInstance}" field="country" /></span></li>
								</g:if>

								<g:if test="${addressInstance?.hsno}">
									<li class="fieldcontain"><span id="hsno-label"
										class="property-label"><g:message
												code="address.hsno.label" default="Hsno" /></span> <span
										class="property-value" aria-labelledby="hsno-label"><g:fieldValue
												bean="${addressInstance}" field="hsno" /></span></li>
								</g:if>

								<g:if test="${addressInstance?.state}">
									<li class="fieldcontain"><span id="state-label"
										class="property-label"><g:message
												code="address.state.label" default="State" /></span> <span
										class="property-value" aria-labelledby="state-label"><g:fieldValue
												bean="${addressInstance}" field="state" /></span></li>
								</g:if>

								<g:if test="${addressInstance?.street}">
									<li class="fieldcontain"><span id="street-label"
										class="property-label"><g:message
												code="address.street.label" default="Street" /></span> <span
										class="property-value" aria-labelledby="street-label"><g:fieldValue
												bean="${addressInstance}" field="street" /></span></li>
								</g:if>

							</ol>
							<g:form url="[resource:addressInstance, action:'delete']"
								method="DELETE">
								<fieldset class="buttons">
									<g:link class="edit" action="edit"
										resource="${addressInstance}">
										<g:message code="default.button.edit.label" default="Edit" />
									</g:link>
									<g:actionSubmit class="delete" action="delete"
										value="${message(code: 'default.button.delete.label', default: 'Delete')}"
										onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
								</fieldset>
							</g:form>
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
	<script
		src="assets1/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js"
		type="text/javascript"></script>
	<script src="assets1/global/scripts/app.min.js" type="text/javascript"></script>
	<script src="assets1/layouts/layout/scripts/layout.min.js"
		type="text/javascript"></script>
</body>

</html>



