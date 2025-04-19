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
<link href="assets1/global/plugins/cubeportfolio/css/cubeportfolio.css"
	rel="stylesheet" type="text/css" />
<link href="assets1/pages/css/portfolio.min.css" rel="stylesheet"
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

	<div class="page-container">
		<!-- BEGIN SIDEBAR -->
		<div class="page-sidebar-wrapper">
			<div class="page-sidebar navbar-collapse collapse">
				<g:render template="/header/leftSide"
					model="[activ:[gallery:'start active open',galleryList:'active']]"></g:render>
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
						<li><a class="home" href="${createLink(uri: '/')}">Home</a> <i
							class="fa fa-circle"></i></li>
						<li><g:link action="index">View List</g:link></li>


					</ul>

				</div>
				<!-- END PAGE BAR -->
				<!-- BEGIN PAGE TITLE-->
				<h3 class="page-title">Add Gallery</h3>
				<!-- END PAGE TITLE-->
				<!-- END PAGE HEADER-->
				<!-- BEGIN DASHBOARD STATS 1-->



				<div class="row">
					<div class="col-md-12">

						<div id="create-instituite" class="content scaffold-create"
							role="main">


							<div class="portlet light bordered">
								<div class="portlet-title">
									<div class="caption font-green">
										<i class="icon-pin font-green"></i> <span
											class="caption-subject bold uppercase"> Add Gallery</span>
									</div>

								</div>
								<g:if test="${flash.message}">
									<i style="font-size: 21px; color: orange;"> ${flash.message}
									</i>
								</g:if>
								<ul class="list-inline">
									<li><h3>Do you have Images to Upload??</h3></li>
									<li><input type="radio" onclick="$('#openimg').show(500)"
										name="openimg" /> Yes</li>
									<li><input type="radio" onclick="$('#openimg').hide(500)"
										name="openimg" checked="checked" /> No</li>
								</ul>


								<div id="openimg" style="display: none">
									<div class="portlet-body form">
										<g:form controller="gallery" action="save"
											enctype='multipart/form-data'>

											<div class="form-body">
												<div class="row">

													<div class="col-md-4">
														<div class="form-group  ">
															<div class="input_fields_wrap">
																<label>Choose Image </label> <input type="file"
																	id="file_1" size="10" name="file_1" value=""
																	placeholder="Input Value" class="form-control" /> <input
																	type="hidden" value="1" id="ty" name="ty" class="ty">
																<br>
															</div>
														</div>
													</div>
													<div class="col-md-4">
														<label>For Adding More Images Click Here</label>
														<button class="add_field_button btn btn-info">Add
															More Fields</button>

													</div>


												</div>
											</div>


											<fieldset class="buttons">
												<g:if test="${instituiteInstance}">
													<g:submitButton name="create" class="btn blue"
														value="${message(code: 'default.button.create.label', default: 'Create')}" />

												</g:if>
												<g:else>
													<div style="color: red">You Cannot add images without
														institute</div>
													<g:submitButton name="create" class="btn blue"
														disabled="true"
														value="${message(code: 'default.button.create.label', default: 'Create')}" />

												</g:else>
											</fieldset>
										</g:form>
									</div>
								</div>
							</div>
						</div>

						<div class="portlet light bordered">
							<div class="portlet-title">
								<div class="caption font-blue">
									<i class="fa fa-image font-blue"></i> <span
										class="caption-subject bold uppercase"> Gallery Images</span>
								</div>

							</div>
							<div class="portlet-body form">
								<div class="portfolio-content portfolio-1">
									<div id="js-grid-juicy-projects" class="cbp">
										<g:each in="${instituiteInstance?.gallery }" var="g">
											<div class="cbp-item ">
												<div class="cbp-caption">
													<div class="cbp-caption-defaultWrap">
														<img
															src="${createLink(controller:'home', action:'displaySingleImage', id:g.id)}" />
													</div>
													<div class="cbp-caption-activeWrap">
														<div class="cbp-l-caption-alignCenter">
															<div class="cbp-l-caption-body">

																<a
																	href="${createLink(controller:'home', action:'displaySingleImage', id:g.id)}"
																	" class="cbp-lightbox cbp-l-caption-buttonRight btn red uppercase btn red uppercase"
																	data-title="test">view larger</a>
															</div>
														</div>
													</div>
												</div>
												<!-- div class="cbp-l-grid-projects-title uppercase text-center uppercase text-center">TEST</div>
                                <div class="cbp-l-grid-projects-desc uppercase text-center uppercase text-center">Testing</div-->
											</div>
										</g:each>
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

		<script src="assets1/global/plugins/uniform/jquery.uniform.min.js"
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
		<script
			src="assets1/global/plugins/cubeportfolio/js/jquery.cubeportfolio.min.js"
			type="text/javascript"></script>
		<script src="assets1/pages/scripts/portfolio-1.min.js"
			type="text/javascript"></script>


		<script type="text/javascript">
			$(document)
					.ready(
							function() {
								var wrapper = $(".input_fields_wrap"); //Fields wrapper
								var add_button = $(".add_field_button"); //Add button ID

								var x = 1; //initlal text box count
								$(add_button)
										.on(
												"click",
												function(e) { //on add input button click
													e.preventDefault();
													var tyval = $('#ty').val();
													if (x != 0) { //max input box allowed
														x++; //text box increment
														$('#ty')
																.val(
																		tyval
																				+ ","
																				+ x)
														$(wrapper)
																.append(
																		'<div><input type="file" id="file_'+x+'" name="file_'+x+'" '+
																	'class="form-control" /><a href="#" class="remove_field " id="'+x+'">Remove</a></div>'); //add input box
													}
												});

								$(wrapper)
										.on(
												"click",
												".remove_field",
												function(e) { //user click on remove text
													e.preventDefault();

													var y = ($('#ty').val())
															.split(',');
													var removeItem = this.id;

													y = jQuery
															.grep(
																	y,
																	function(
																			value) {
																		return value != removeItem;
																	});
													$('#ty').val(y)

													$(this).parent('div')
															.remove();
													x--;
												})
							});
		</script>
		<!-- END THEME LAYOUT SCRIPTS -->
</body>

</html>
