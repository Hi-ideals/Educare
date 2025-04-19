<!DOCTYPE html>

<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<head>
<meta charset="utf-8" />
<title>Hi-Educare | Dashboard</title>
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

<link href="assets1/global/plugins/fullcalendar/fullcalendar.min.css"
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
<link href="assets1/layouts/layout/css/custom.css" rel="stylesheet"
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
				<g:render template="/header/leftSide"
					model="[activ:[dashboard:'start active open']]"></g:render>

			</div>

		</div>

		<div class="page-content-wrapper">
			<div class="page-content">

				<div class="page-bar">
					<ul class="page-breadcrumb">
						<li><a class="home" href="${createLink(uri: '/')}">Home</a> <i
							class="fa fa-circle"></i></li>
						<li><span>Dashboard</span></li>
					</ul>

				</div>
				<br>
				<div class="panel">
					<div class="panel-body">

						<ul class="list-inline">
							<g:if test="${pendings.size() >0}">
								<div class="alert alert-danger">
									<strong>Note!</strong> Please Fill Your "Institution / Fees /
									Class / Section Details"
								</div>
							</g:if>
							<g:each in="${pendings.keySet()}" var="key" status="j">
								<li><g:if test="${pendings.get(key)}">


										<g:link controller="${key}" action="create"
											class="btn ${colors.getAt(j)} purple uppercase">
										Create ${pendingsdisplay.get(key)}
										</g:link>

									</g:if></li>
							</g:each>
						</ul>
						<br>
						<g:if test="${pendings.size() ==0}">
							<div>
								<div class="text-center">


									<ul class="list-unstyled">
										<li><images:getDashboardLogo id="${inst?.logo?.id }" /></li>

										<li>
											<h2 class="page-title" style="color: #000">
												${inst?.name }
												<br> <small><b>Affiliated to: ${inst?.affiliatedTo }</b></small>
											</h2> <b>H.No:${inst?.hsno} ${inst?.street} ${inst?.city}-${inst?.pinCode}
												${inst?.state} ${inst?.country} Ph:${inst?.phone}</b>

										</li>
									</ul>
								</div>
							</div>
						</g:if>

						<div class="row">
							<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
								<div class="dashboard-stat grey">
									<div class="visual">
										<i class="fa fa-group"></i>
									</div>
									<div class="details">
										<div class="number">
											<span data-counter="counterup" data-value="${staffList}">0</span>
										</div>
										<div class="desc">List of Staff</div>
									</div>
									<g:link controller="staff" class="more" action="index"> View more <i
											class="m-icon-swapright m-icon-dark"></i>
									</g:link>
								</div>
							</div>

							<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
								<div class="dashboard-stat purple">
									<div class="visual">
										<i class="fa fa-calendar"></i>
									</div>
									<div class="details">
										<div class="number">
											<span data-counter="counterup" data-value="${batches}">0</span>
										</div>
										<div class="desc">List of Academic Year</div>
									</div>
									<g:link controller="batch" class="more" action="index"> View more <i
											class="m-icon-swapright m-icon-dark"></i>
									</g:link>
								</div>
							</div>
							<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
								<div class="dashboard-stat red">
									<div class="visual">
										<i class="fa fa-users"></i>
									</div>
									<div class="details">
										<div class="number">
											<span data-counter="counterup"
												data-value="${StudentListSize}">0</span>
										</div>
										<div class="desc">List of Students</div>
									</div>
									<g:link controller="studentList" class="more" action="index"> View more
                                    <i
											class="m-icon-swapright m-icon-dark"></i>
									</g:link>
								</div>
							</div>
						</div>
						<div class="clearfix"></div>
						<div class="row">

							<div class="col-md-12 col-sm-6">
								<div class="portlet light bordered">
									<div class="portlet-title">
										<div class="caption">
											<i class="icon-share font-red-sunglo hide"></i> <span
												class="caption-subject font-red-sunglo bold uppercase">Revenue</span>
											<span class="caption-helper">monthly stats...</span>
										</div>

									</div>
									<div class="portlet-body">
										<div class="row">
											<div class="col-md-12 " style="margin: 10px 0px 100px 0px">
												<div id="chartContainer" style="height: 400px; width: 100%;"></div>
											</div>
										</div>

									</div>
									<input type="hidden" value="${chart.keySet()}" name="ch"
										id="kys" /> <input type="hidden" value="${chart.values()}"
										name="ch" id="vals" />
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
	<script src="assets1/pages/js/canvasjs.min.js" type="text/javascript"></script>
	<script src="assets1/pages/js/jquery.canvasjs.min.js"
		type="text/javascript"></script>

	<script
		src="assets1/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js"
		type="text/javascript"></script>


	<script src="assets1/global/plugins/counterup/jquery.waypoints.min.js"
		type="text/javascript"></script>
	<script src="assets1/global/plugins/counterup/jquery.counterup.min.js"
		type="text/javascript"></script>


	<script src="assets1/global/plugins/jquery.sparkline.min.js"
		type="text/javascript"></script>
	<script src="assets1/global/scripts/app.min.js" type="text/javascript"></script>

	<script src="assets1/layouts/layout/scripts/layout.min.js"
		type="text/javascript"></script>
	<script type="text/javascript">
		window.onload = function() {
			var kys = ($('#kys').val()).replace("[", "").replace("]", "")
					.split(",");
			var vals = ($('#vals').val()).replace("[", "").replace("]", "")
					.split(",");

			var dps = [];
			var chart = new CanvasJS.Chart("chartContainer", {
				title : {
					text : "Student Admissions per Year"
				},
				data : [ {
					type : "column",
					name : "1st",
					dataPoints : dps

				} ]
			});
			for (var i = 0; i < kys.length; i++) {
				chart.options.data[0].dataPoints.push({
					y : parseInt(vals[i]),
					label : kys[i]
				});
			}

			chart.render();
		}
	</script>
</body>

</html>

