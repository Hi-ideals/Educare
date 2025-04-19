
<%@ page import="com.hiideals.instituite.admin.Admin"%>
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

<style>
/* The Modal (background) */
.modal {
	display: none; /* Hidden by default */
	position: fixed; /* Stay in place */
	z-index: 1; /* Sit on top */
	padding-top: 100px; /* Location of the box */
	left: 0;
	top: 0;
	width: 100%; /* Full width */
	height: 100%; /* Full height */
	overflow: auto; /* Enable scroll if needed */
	background-color: rgb(0, 0, 0); /* Fallback color */
	background-color: rgba(0, 0, 0, 0.4); /* Black w/ opacity */
}

/* Modal Content */
.modal-content {
	position: relative;
	background-color: #fefefe;
	margin: auto;
	padding: 0;
	border: 1px solid #888;
	width: 50%;
	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0
		rgba(0, 0, 0, 0.19);
	-webkit-animation-name: animatetop;
	-webkit-animation-duration: 0.4s;
	animation-name: animatetop;
	animation-duration: 0.4s;
	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0
		rgba(0, 0, 0, 0.19);
}

/* Add Animation */
@
-webkit-keyframes animatetop {
	from {top: -300px;
	opacity: 0
}

to {
	top: 0;
	opacity: 1
}

}
@
keyframes animatetop {
	from {top: -300px;
	opacity: 0
}

to {
	top: 0;
	opacity: 1
}

}

/* The Close Button */
.close {
	color: white;
	float: right;
	font-size: 28px;
	font-weight: bold;
}

.close:hover, .close:focus {
	color: #000;
	text-decoration: none;
	cursor: pointer;
}

.modal-header {
	padding: 2px 16px;
	background-color: #3c8dbc;
	color: white;
}

.modal-body {
	padding: 2px 16px;
	height: 50%;
}

.modal-footer {
	padding: 2px 16px;
	background-color: #3c8dbc;
	color: white;
}
</style>


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
		<div class="page-sidebar-wrapper">
			<div class="page-sidebar navbar-collapse collapse">
				<%--
				<g:render template="/header/leftSide"
					model="[activ:[superAdmin:'start active open',adminList:'active']]"></g:render>
			--%>
			</div>
		</div>
		<div class="page-content-wrapper">
			<div class="page-content">

				<div class="page-bar">
					<ul class="page-breadcrumb">
						<li><a href="${createLink(uri: '/')}">Home</a> <i
							class="fa fa-circle"></i></li>
						<li><g:link action="create">Create New Admin</g:link><i
							class="fa fa-circle"></i></li>
						<li><a id="myBtn">Add Modules</a><i class="fa fa-circle"></i></li>
						<li><g:link controller="admin" action="modulesList"> Modules List</g:link></li>
					</ul>

				</div>

				<div id="myModal" class="modal">
					<div class="modal-content">
						<div class="modal-header">
							<span class="close">&times;</span>
							<h2>Add Modules</h2>
						</div>
						<div class="modal-body">
							<g:form controller="admin" action="addModules">
								<br>
								<div class="form-group">
									<label>Module Name</label>
									<div class="row">
										<div class="col-md-4">
											<%--<input type="text" class="form-control" name="moduleName"
												required="required">
												
												--%><select class="form-control" name="moduleName"
												required="required" >
												<option name="dashboard" value="dashboard" >Dashboard</option>
												<option name="admission" value="admission">Admission</option>
												<option name="readmission" value="readmission">Readmission</option>
												<option name="student" value="student">Student</option>
												<option name="studentList" value="studentList">StudentList</option>
												<option name="feemanagement" value="feemanagement">Fee Management</option>
												<option name="Exams" value="Exams">Exams</option>
												<option name="library" value="library">Library</option>
												<option name="booksreport" value="booksreport">Books Report</option>
												<option name="transport" value="transport">Transport</option>
												<option name="attendence" value="attendence">Attendence</option>
												<option name="payroll" value="payroll">Payroll</option>
												<option name="settings" value="settings">Settings</option>
												<option name="staff" value="staff">Staff</option>
												<option name="academicyear" value="academicyear">Academic Year</option>
												<option name="subjects" value="subjects">Subjects</option>
												<option name="certificates" value="certificates">Certificates</option>
												<option name="reports" value="reports">Reports</option>
												<option name="BirthDays"  value="BirthDays">Birthdays</option>
												<option name="timetable" value="timetable">Timetable</option>
												<option name="BulkSMS" value="BulkSMS">BulkSMS</option>
												<option name="HomeWork" value="HomeWork">HomeWork</option>
												</select>
												
										</div>
									</div>
								</div>
								<div class="form-group">
									<label>Module Price</label>
									<div class="row">
										<div class="col-md-4">
											<input type="number" class="form-control" name="modulePrice"
												required="required">
										</div>
									</div>
								</div>
								<div class="form-group">
									<div class="row">
										<div class="col-md-4">
											<g:submitButton name="Save Module"
												class="btn blue btn-block uppercase" />
										</div>
									</div>
								</div>

							</g:form>
						</div>
						<div class="modal-footer">
							<h3>SMS</h3>
						</div>
					</div>
				</div>
				<h3 class="page-title">List of Admin's Added By Super Admin</h3>
				<g:if test="${flash.msg1}">
					<h4 style="color: green">
						${flash.msg1}
					</h4>
				</g:if>
				<g:if test="${flash.msg2}">
					<h4 style="color: red">
						${flash.msg2}
					</h4>
				</g:if>
				<div class="panel">
					<div class="panel-body">

						<div class="row">
							<div class="col-md-12">

								<div id="list-admin" class="content scaffold-list" role="main">
									<g:if test="${flash.message}">
										<div class="message" role="status">
											${flash.message}
										</div>
									</g:if>
									
									<div class="portlet box grey">
										<div class="portlet-title">
											<div class="caption">
												<i class="fa fa-users"></i>List Of Admins
											</div>
										</div>
										<div class="portlet-body">
											<div class="table-scrollable">
												<table class="table  table-hover">
													<thead>
														<tr>
															<th>Admin ID</th>
															<th>Admin Name</th>
															<th>Password</th>
															<th>Actions</th>
																	
															
														</tr>
													</thead>
													<tbody>
														<g:each in="${adminInstanceList}" status="i"
															var="adminInstance">
															<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

																<td>
																	<div>
																		<images:getImage
																			id="${adminInstance?.profilePic?.id }" height="50px"
																			width="50px" classs="img-rounded" />
																	</div> ${fieldValue(bean: adminInstance, field: "adminID")}

																</td>

																<td>
																	${fieldValue(bean: adminInstance, field: "adminName")}
																</td>


																<td>
																	${fieldValue(bean: adminInstance, field: "password")}
																</td>
																<td>
																	${fieldValue(bean: adminInstance.address, field: "hsno")},
																	${fieldValue(bean: adminInstance.address, field: "street")},
																	${fieldValue(bean: adminInstance.address, field: "city")},
																	${fieldValue(bean: adminInstance.address, field: "state")},
																	${fieldValue(bean: adminInstance.address, field: "country")},
																	${fieldValue(bean: adminInstance.address, field: "mobileNumber")}
																</td>
																<td><g:link action="show"
																		id="${LookUpED.encod(adminInstance.id)}">
																		<i class="fa fa-eye"></i> View
																</g:link></td>

															</tr>
														</g:each>
													</tbody>
												</table>
											</div>
										</div>
									</div>
									<div style="text-align: center;">
										<ul class="pagination">
											<li><g:paginate total="${adminInstanceCount ?: 0}" /></li>
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
	<script>
		// Get the modal
		var modal = document.getElementById('myModal');

		// Get the button that opens the modal
		var btn = document.getElementById("myBtn");

		// Get the <span> element that closes the modal
		var span = document.getElementsByClassName("close")[0];

		// When the user clicks the button, open the modal 
		btn.onclick = function() {
			modal.style.display = "block";
		}

		// When the user clicks on <span> (x), close the modal
		span.onclick = function() {
			modal.style.display = "none";
		}

		// When the user clicks anywhere outside of the modal, close it
		window.onclick = function(event) {
			if (event.target == modal) {
				modal.style.display = "none";
			}
		}
	</script>
</body>

</html>