<%@page import="com.hiideals.instituite.helper.AcademicYear"%>
<%@page import="com.hiideals.instituite.student.ParentDetails"%>
<%@page import="com.hiideals.instituite.main.Instituite"%>
<%@ page import="com.hiideals.instituite.student.Student"%>
<%@ page import="com.hiideals.instituite.classcourses.IClass"%>
<%@ page import="com.hiideals.instituite.classcourses.Section"%>
<!DOCTYPE html>

<html lang="en">

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
<link href="assets1/layouts/layout/css/custom.css" rel="stylesheet"
	type="text/css" />
<link rel="shortcut icon" href="assets1/layouts/layout/img/favicon.png" />
<link
	href="assets1/global/plugins/bootstrap-datepicker/css/bootstrap-datepicker6.min.css"
	type="text/css" rel="stylesheet">
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
						<li><a class="home" href="${createLink(uri: '/')}">Home</a> <i
							class="fa fa-circle"></i></li>
						<li><g:link action="create">Create New Student</g:link></li>


					</ul>

				</div>
				<div class="panel">
					<div class="panel-body">
						<div class="row">
							<div class="col-md-12">

								<g:if test="${flash.msg}">
									<h4 class="message" role="status" style="color: red">
										${flash.msg}
									</h4>
								</g:if>

								<g:if test="${flash.msgfee}">
									<h4 class="message" role="status" style="color: red">
										${studentInstance?.studentName}
										${flash.msgfee}
									</h4>
								</g:if>
								<div id="list-student" class="content scaffold-list" role="main">
									<g:if test="${flash.message}">
										<div class="message" role="status">
											${flash.message}
										</div>
									</g:if>

									<div class="box box-info">
										<div class="portlet light bordered">
											<div class="portlet-title">
												<div class="caption font-blue">
													<i class="fa fa-building font-blue"></i> <span
														class="caption-subject bold uppercase"> Students
														Details</span>
												</div>

											</div>
											<div class="form-body">
												<g:form url="[controller:'student',action:'studentIdss']"
													update="Changedisplay">

													<div class="row">




														<div class="col-md-3">
															<label>Select Academic year<span
																class="required-indicator" style="color: red">*</span></label>
															<div>

																<select name="academicyear1" class="form-control"
																	id="academicyear">

																	<g:each in="${batchList}" var="batch">
																		<option value="${batch.batchName}">
																			${batch.batchName }
																		</option>
																	</g:each>
																</select>
															</div>
															<div id="Sacademicyear" style="display: none; color: red">Provide
																your Academic year</div>
														</div>
													</div>



													<div class="row">



														<div class="col-md-3" style="margin-top:5px;">
															<label> Class<span class="required-indicator"
																style="color: red">*</span></label> <select name="iclass"
																class="form-control"
																onchange="${remoteFunction(controller:'student',action: 'stID',
                       update: 'updateSections',
                       params: '\'classId=\' + this.value')}">
																<option value="">Select</option>
																<g:each in="${iclass}" var="cls">
																	<option value="${cls.id}">
																		${cls.classname}
																	</option>
																</g:each>
															</select>
															<div id="Spresentclass1"
																style="display: none; color: red">Select your
																class</div>
														</div>

													</div>


													<div class="row" style="margin-top:5px;">


														<div id="updateSections">
															<g:render template="stID" model="[classId:classId]"></g:render>
														</div>

													</div>


													<div class="row">
														<div class="col-md-3">

															<g:submitButton name="Search" class="btn blue"
																style="margin-top: 22px" />
														</div>
													</div>
												</g:form>
											</div>
											<div class="col-md-12" id="Changedisplay" ></div>

										</div>


									</div>

								</div>


							</div>
						</div>
					</div>

				</div>
			</div>
			<g:render template="/footer/footer"></g:render>
			<script>
function myfunction(){

	var value=document.getElementById('tcheck').checked
	if(value==true){
		document.getElementById('trans').style.display='block'
			
		
		}else{
			document.getElementById('trans').style.display='none'
				
			}
	
}
</script>

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

			<script src="assets1/global/scripts/app.min.js"
				type="text/javascript"></script>

			<script src="assets1/layouts/layout/scripts/layout.min.js"
				type="text/javascript"></script>
			<script src="js/validation.js" type="text/javascript"></script>
			<script type="text/javascript"></script>
			<script
				src="assets1/global/plugins/bootstrap-datepicker/js/jquery.ui.datepicker1.js" />
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
			<script>
	/*-----------validation for PresentClass edit-------------*/
	$(document).ready(function() {
		$('#student').click(function() {
			var date = $('#presentclass1').val();
			if ($.trim(date) == 0) {
				$('#Spresentclass1').show();
				return false;
			}
		});
		$('[id="presentclass1"]').on('change', function() {
			if ($(this).val() == "") {
				$('#Spresentclass1').show();
			} else {
				$('#Spresentclass1').hide();
			}
		});
	});
	/*-----------validation for Secation-------------*/
	$(document).ready(function() {
		$('#student').click(function() {
			var date = $('#section1').val();
			if ($.trim(date) == 0) {
				$('#Ssection1').show();
				return false;
			}
		});
		$('[id="section1"]').on('change', function() {
			if ($(this).val() == "") {
				$('#Ssection1').show();
			} else {
				$('#Ssection1').hide();
			}
		});
	});
	</script>
</body>

</html>