
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
	<div class="clearfix"></div>
	<div class="page-container">
		<div class="page-sidebar-wrapper">
			<div class="page-sidebar navbar-collapse collapse">
				<g:render template="/header/leftSide"
					model="[activ:[LibraryManagement:'start active open',books:'active']]"></g:render>
			</div>
		</div>
		<div class="page-content-wrapper">
			<div class="page-content">

				<div class="page-bar">
					<ul class="page-breadcrumb">

						<li><i class="fa fa-circle"></i><a class="home"
							href="${createLink(uri: '/')}"><g:message
									code="default.home.label" /></a></li>
						<li><i class="fa fa-circle"></i> <g:link class="list"
								action="index">Book Lists</g:link></li>
						<li><i class="fa fa-circle"></i> <g:link class="create"
								action="create">Create Books</g:link></li>
					</ul>
				</div>

				<div class="panel">
					<div class="panel-body">
						<div class="row">
							<div class="col-md-12">
							<h4>View Details</h4>
								<div class="box box-info">
									
											<div class="row1">
												<table class="table table-bordered">

													<g:if test="${booksInstance?.author}">
														<tr>
															<td width="25%"><span id="author-label"
																class="property-label"><g:message
																		code="books.author.label" default="Author" /></span></td>
															<td><b> <span
																	class="property-value caption-subject bold uppercase"
																	aria-labelledby="author-label"><g:fieldValue
																			bean="${booksInstance}" field="author" /></span>
															</b></td>
														</tr>

													</g:if>



													<g:if test="${booksInstance?.title}">
														<tr>
															<td><span id="title-label" class="property-label"><g:message
																		code="books.title.label" default="Title" /></span></td>
															<td><b> <span
																	class="property-value caption-subject bold uppercase"
																	aria-labelledby="title-label"><g:fieldValue
																			bean="${booksInstance}" field="title" /></span>
															</b></td>
														</tr>

													</g:if>



													<g:if test="${booksInstance?.publisher}">
														<tr>
															<td><span id="publisher-label"
																class="property-label"><g:message
																		code="books.publisher.label" default="Publisher" /></span></td>
															<td><b> <span
																	class="property-value caption-subject bold uppercase"
																	aria-labelledby="publisher-label"><g:fieldValue
																			bean="${booksInstance}" field="publisher" /></span>

															</b></td>
														</tr>
													</g:if>
													<g:if test="${booksInstance?.place}">
														<tr>
															<td><span id="place-label" class="property-label"><g:message
																		code="books.place.label" default="Place" /></span></td>
															<td><b> <span
																	class="property-value caption-subject bold uppercase"
																	aria-labelledby="place-label"><g:fieldValue
																			bean="${booksInstance}" field="place" /></span>
															</b></td>
														</tr>

													</g:if>
													<g:if test="${booksInstance?.subject}">
														<tr>
															<td><span id="subject-label" class="property-label"><g:message
																		code="books.subject.label" default="Subject" /></span></td>
															<td><b> <span
																	class="property-value caption-subject bold uppercase"
																	aria-labelledby="subject-label"><g:fieldValue
																			bean="${booksInstance}" field="subject" /></span>
															</b></td>
														</tr>
													</g:if>


													<g:if test="${booksInstance?.edition}">
														<tr>
															<td><span id="edition-label" class="property-label"><g:message
																		code="books.edition.label" default="Edition" /></span></td>
															<td><b> <span
																	class="property-value caption-subject bold uppercase"
																	aria-labelledby="edition-label"><g:fieldValue
																			bean="${booksInstance}" field="edition" /></span>
															</b></td>
														</tr>

													</g:if>
													<g:if test="${booksInstance?.status}">
														<tr>
															<td><span id="status-label" class="property-label"><g:message
																		code="books.status.label" default="Status" /></span></td>
															<td><b> <span
																	class="property-value caption-subject bold uppercase"
																	aria-labelledby="status-label"><g:fieldValue
																			bean="${booksInstance}" field="status" /></span>

															</b></td>
														</tr>
													</g:if>
													<g:if test="${booksInstance?.volume}">
														<tr>
															<td><span id="volume-label" class="property-label"><g:message
																		code="books.volume.label" default="Volume" /></span></td>
															<td><b> <span
																	class="property-value caption-subject bold uppercase"
																	aria-labelledby="volume-label"><g:fieldValue
																			bean="${booksInstance}" field="volume" /></span>
															</b></td>
														</tr>

													</g:if>
													<g:if test="${booksInstance?.year}">
														<tr>
															<td><span id="year-label" class="property-label"><g:message
																		code="books.year.label" default="Year" /></span></td>
															<td><b> <span
																	class="property-value caption-subject bold uppercase"
																	aria-labelledby="year-label"><g:fieldValue
																			bean="${booksInstance}" field="year" /></span>

															</b></td>
														</tr>
													</g:if>
													<g:if test="${booksInstance?.pages}">
														<tr>
															<td><span id="pages-label" class="property-label"><g:message
																		code="books.pages.label" default="Pages" /></span></td>
															<td><b> <span
																	class="property-value caption-subject bold uppercase"
																	aria-labelledby="pages-label"><g:fieldValue
																			bean="${booksInstance}" field="pages" /></span>
															</b></td>
														</tr>

													</g:if>
													<g:if test="${booksInstance?.cost}">
														<tr>
															<td><span id="cost-label" class="property-label"><g:message
																		code="books.cost.label" default="Cost" /></span></td>
															<td><b> <span
																	class="property-value caption-subject bold uppercase"
																	aria-labelledby="cost-label"><g:fieldValue
																			bean="${booksInstance}" field="cost" /></span>
															</b></td>
														</tr>

													</g:if>
													<g:if test="${booksInstance?.billNumber}">
														<tr>
															<td><span id="billNumber-label"
																class="property-label"><g:message
																		code="books.billNumber.label" default="Bill Number" /></span></td>
															<td><b> <span
																	class="property-value caption-subject bold uppercase"
																	aria-labelledby="billNumber-label"><g:fieldValue
																			bean="${booksInstance}" field="billNumber" /></span>
															</b></td>
														</tr>

													</g:if>
													<g:if test="${booksInstance?.bookSource}">
														<tr>
															<td><span id="bookSource-label"
																class="property-label"><g:message
																		code="books.bookSource.label" default="Book Source" /></span></td>
															<td><b> <span
																	class="property-value caption-subject bold uppercase"
																	aria-labelledby="bookSource-label"><g:fieldValue
																			bean="${booksInstance}" field="bookSource" /></span>
															</b></td>
														</tr>

													</g:if>
													<g:if test="${booksInstance?.moreInfo}">
														<tr>
															<td><span id="moreInfo-label" class="property-label"><g:message
																		code="books.moreInfo.label" default="More Info" /></span></td>
															<td><b> <span
																	class="property-value caption-subject bold uppercase"
																	aria-labelledby="moreInfo-label"><g:fieldValue
																			bean="${booksInstance}" field="moreInfo" /></span>
															</b></td>
														</tr>

													</g:if>
													<g:if test="${booksInstance?.accessionNumber}">
														<tr>
															<td><span id="accessionNumber-label"
																class="property-label"><g:message
																		code="books.accessionNumber.label"
																		default="AccessionNumber" /></span></td>
															<td><b> <span
																	class="property-value caption-subject bold uppercase"
																	aria-labelledby="accessionNumber-label"><g:fieldValue
																			bean="${booksInstance}" field="accessionNumber" /></span>
															</b></td>
														</tr>

													</g:if>
													<g:if test="${booksInstance?.purchasedOn}">
														<tr>
															<td><span id="purchasedOn-label"
																class="property-label"><g:message
																		code="books.purchasedOn.label" default="PurchasedOn" /></span></td>
															<td><b> <span
																	class="property-value caption-subject bold uppercase"
																	aria-labelledby="purchasedOn-label"><g:formatDate
																			date="${booksInstance?.purchasedOn}" /></span>

															</b></td>
														</tr>
													</g:if>

													<tr>
														<td>Actions</td>
														<td><g:form
																url="[resource:booksInstance, action:'delete']"
																method="DELETE">
																<fieldset class="buttons">

																	<g:link class="edit" action="edit" class="btn yellow"
																		id="${LookUpED.encod(booksInstance.id)}">
																		<g:message code="default.button.edit.label"
																			default="Edit" />
																	</g:link>

																	<%--<g:actionSubmit class="delete btn blue" action="delete"
									value="${message(code: 'default.button.delete.label', default: 'Delete')}"
									onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
							--%>
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
					</div></div>
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

				<script src="assets1/global/scripts/app.min.js"
					type="text/javascript"></script>
				<script src="assets1/layouts/layout/scripts/layout.min.js"
					type="text/javascript"></script>
</body>

</html>

