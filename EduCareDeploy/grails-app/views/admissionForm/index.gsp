<!DOCTYPE html>

<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<!-- BEGIN HEAD -->

<head>
<meta charset="utf-8" />
<title>Hi-Educare | Admission Form</title>
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
						<li><a href="#">Dashboard</a> <i class="fa fa-circle"></i></li>
						<li><span>Admission Form</span></li>
					</ul>

				</div>
				<h3 class="page-title">Admission Form</h3>
				<div class="row">
					<div class="col-md-12">
						<div class="portlet light bordered">
							<div class="portlet-title">
								<div class="caption font-green">
									<i class="icon-pin font-green"></i> <span
										class="caption-subject bold uppercase"> Personal Info</span>
								</div>

							</div>
							<div class="portlet-body form">
								<form role="form">
									<div class="form-body">
										<div class="row">
											<div class="col-md-4">
												<div
													class="form-group form-md-line-input form-md-floating-label">
													<input type="text" class="form-control" id="form_control_1">
													<label for="form_control_1">First Name</label>
												</div>
											</div>
											<div class="col-md-4">
												<div
													class="form-group form-md-line-input form-md-floating-label has-success">
													<input type="text" class="form-control" id="form_control_1">
													<label for="form_control_1">Last Name</label>
												</div>
											</div>
											<div class="col-md-4">
												<div
													class="form-group form-md-line-input form-md-floating-label has-success">
													<input type="text" class="form-control" id="form_control_1">
													<label for="form_control_1">Father's Name</label>
												</div>
											</div>
										</div>
										<div class="row">
											<div class="col-md-4">
												<div
													class="form-group form-md-line-input form-md-floating-label">
													<input type="text" class="form-control" id="form_control_1">
													<label for="form_control_1">Mother Name</label>
												</div>
											</div>
											<div class="col-md-4">
												<div
													class="form-group form-md-line-input form-md-floating-label has-success">
													<input type="date" class="form-control" id="form_control_1">
												</div>
											</div>
											<div class="col-md-4">
												<div
													class="form-group form-md-line-input form-md-floating-label has-success">
													<select class="form-control edited" id="form_control_1">
														<option value=""></option>
														<option value="1" selected>Select Gender</option>
														<option value="2">Male</option>
														<option value="3">Female</option>
													</select>
												</div>
											</div>
										</div>

										<div
											class="form-group form-md-line-input form-md-floating-label has-info">
											<select class="form-control edited" id="form_control_1">
												<option value=""></option>
												<option value="1" selected>Option 1</option>
												<option value="2">Option 2</option>
												<option value="3">Option 3</option>
												<option value="4">Option 4</option>
											</select> <label for="form_control_1">Dropdown sample</label>
										</div>
										<div
											class="form-group form-md-line-input form-md-floating-label">
											<textarea class="form-control" rows="3"></textarea>
											<label for="form_control_1">Textarea input</label>
										</div>
										<div
											class="form-group form-md-line-input form-md-floating-label has-error">
											<input type="text" class="form-control" disabled
												id="form_control_1"> <label for="form_control_1">Disabled</label>
										</div>
										<div
											class="form-group form-md-line-input form-md-floating-label has-error">
											<input type="text" class="form-control" readonly
												value="You can't edit this" id="form_control_1"> <label
												for="form_control_1">Readonly</label>
										</div>
										<div
											class="form-group form-md-line-input form-md-floating-label">
											<div class="form-control form-control-static">
												email@example.com</div>
											<label for="form_control_1">Static Control</label>
										</div>
										<div
											class="form-group form-md-line-input form-md-floating-label has-info">
											<input type="text" class="form-control input-sm"
												id="form_control_1"> <label for="form_control_1">Small
												input</label>
										</div>
										<div
											class="form-group form-md-line-input form-md-floating-label has-info">
											<input type="text" class="form-control input-lg"
												id="form_control_1"> <label for="form_control_1">Large
												input</label>
										</div>
									</div>
									<div class="form-actions noborder">
										<button type="button" class="btn blue">Submit</button>
										<button type="button" class="btn default">Cancel</button>
									</div>
								</form>
							</div>
						</div>
						<div class="portlet light bordered">
							<div class="portlet-title">
								<div class="caption font-red-sunglo">
									<i class="icon-drop font-red-sunglo"></i> <span
										class="caption-subject bold uppercase"> Radios</span>
								</div>
								<div class="actions">
									<a class="btn btn-circle btn-icon-only blue"
										href="javascript:;"> <i class="icon-cloud-upload"></i>
									</a> <a class="btn btn-circle btn-icon-only green"
										href="javascript:;"> <i class="icon-wrench"></i>
									</a> <a class="btn btn-circle btn-icon-only red"
										href="javascript:;"> <i class="icon-trash"></i>
									</a> <a class="btn btn-circle btn-icon-only btn-default fullscreen"
										href="javascript:;" data-original-title="" title=""> </a>
								</div>
							</div>
							<div class="portlet-body form">
								<form role="form">
									<div class="form-group form-md-radios">
										<label>Checkboxes</label>
										<div class="md-radio-list">
											<div class="md-radio">
												<input type="radio" id="radio1" name="radio1"
													class="md-radiobtn"> <label for="radio1"> <span></span>
													<span class="check"></span> <span class="box"></span>
													Option 1
												</label>
											</div>
											<div class="md-radio">
												<input type="radio" id="radio2" name="radio1"
													class="md-radiobtn" checked> <label for="radio2">
													<span></span> <span class="check"></span> <span class="box"></span>
													Option 2
												</label>
											</div>
											<div class="md-radio">
												<input type="radio" id="radio3" name="radio1"
													class="md-radiobtn"> <label for="radio3"> <span></span>
													<span class="check"></span> <span class="box"></span>
													Option 3
												</label>
											</div>
											<div class="md-radio">
												<input type="radio" id="radio5" name="radio1" disabled
													class="md-radiobtn"> <label for="radio5"> <span></span>
													<span class="check"></span> <span class="box"></span>
													Disabled
												</label>
											</div>
										</div>
									</div>
									<div class="form-group form-md-radios">
										<label>Checkboxes</label>
										<div class="md-radio-inline">
											<div class="md-radio">
												<input type="radio" id="radio6" name="radio2"
													class="md-radiobtn"> <label for="radio6"> <span></span>
													<span class="check"></span> <span class="box"></span>
													Option 1
												</label>
											</div>
											<div class="md-radio">
												<input type="radio" id="radio7" name="radio2"
													class="md-radiobtn" checked> <label for="radio7">
													<span></span> <span class="check"></span> <span class="box"></span>
													Option 2
												</label>
											</div>
											<div class="md-radio">
												<input type="radio" id="radio8" name="radio2"
													class="md-radiobtn"> <label for="radio8"> <span></span>
													<span class="check"></span> <span class="box"></span>
													Option 3
												</label>
											</div>
										</div>
									</div>
									<div class="form-group form-md-radios">
										<label>Checkboxes</label>
										<div class="md-radio-list">
											<div class="md-radio">
												<input type="radio" id="radio9" name="radio1"
													class="md-radiobtn"> <label for="radio9"> <span></span>
													<span class="check"></span> <span class="box"></span>
													Option 1
												</label>
											</div>
											<div class="md-radio has-error">
												<input type="radio" id="radio10" name="radio1"
													class="md-radiobtn" checked> <label for="radio10">
													<span></span> <span class="check"></span> <span class="box"></span>
													Option 2
												</label>
											</div>
											<div class="md-radio has-warning">
												<input type="radio" id="radio11" name="radio1"
													class="md-radiobtn"> <label for="radio11">
													<span></span> <span class="check"></span> <span class="box"></span>
													Option 3
												</label>
											</div>
											<div class="md-radio has-success">
												<input type="radio" id="radio13" name="radio1" disabled
													class="md-radiobtn"> <label for="radio13">
													<span></span> <span class="check"></span> <span class="box"></span>
													Disabled
												</label>
											</div>
										</div>
									</div>
									<div class="form-group form-md-radios">
										<label>Checkboxes</label>
										<div class="md-radio-inline">
											<div class="md-radio">
												<input type="radio" id="radio14" name="radio2"
													class="md-radiobtn"> <label for="radio14">
													<span></span> <span class="check"></span> <span class="box"></span>
													Option 1
												</label>
											</div>
											<div class="md-radio has-error">
												<input type="radio" id="radio15" name="radio2"
													class="md-radiobtn" checked> <label for="radio15">
													<span></span> <span class="check"></span> <span class="box"></span>
													Option 2
												</label>
											</div>
											<div class="md-radio has-warning">
												<input type="radio" id="radio16" name="radio2"
													class="md-radiobtn"> <label for="radio16">
													<span></span> <span class="check"></span> <span class="box"></span>
													Option 3
												</label>
											</div>
										</div>
									</div>
								</form>
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
	<script
		src="assets1/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js"
		type="text/javascript"></script>
	<script src="assets1/global/scripts/app.min.js" type="text/javascript"></script>
	<script src="assets1/layouts/layout/scripts/layout.min.js"
		type="text/javascript"></script>
</body>

</html>
