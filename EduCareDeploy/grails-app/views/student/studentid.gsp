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
									<g:form controller="student" enctype='multipart/form-data'>
										<div class="box box-info">
											<div class="portlet light bordered">
												<div class="portlet-title">
													<div class="caption font-blue">
														<i class="fa fa-building font-blue"></i> <span
															class="caption-subject bold uppercase">
															Readmission Details</span>
													</div>

												</div>
												<div class="form-body">
													<div class="row">
														<div class="col-md-3">
															<label>Registration Number<span
																class="required-indicator" style="color: red">*</span></label>
															<g:if test="${studentInstance?.registrationNo !=null}">
																<g:textField name="registrationNo" class="form-control"
																	id="registrationNo" required=""
																	value="${studentInstance?.registrationNo}" />

															</g:if>

															<g:else>
																<regId:getRegId Inst="${instituite}" />
															</g:else>

															<div id="SregistrationNo"
																style="display: none; color: red">Provide your
																Registration Number</div>
														</div>

														<g:each in="${studentInstance?.academicyear}">
															<g:if test="${it.status == 'current'}">
															</g:if>
														</g:each>
														<g:set value="${it?.academicyear}" var="pacademic"></g:set>
														<div class="col-md-3">
															<label>Last Academic year<span
																class="required-indicator" style="color: red">*</span></label>
															<div>
																<input name=""
																	class="form-control" readonly="readonly"
																	value="${pacademic}" />
															</div>
														</div>

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

													<g:each in="${studentInstance?.academicyear}">
														<g:if test="${it.status == 'current'}">
														</g:if>
													</g:each>
													<g:set value="${it?.presentclass?.classname}" var="pclass"></g:set>
													<div class="row">
														<div class="col-md-3">
															<label>Class last Studied<span
																class="required-indicator" style="color: red">*</span></label> <input
																name="academicyear[0].presentclass.id" id="presentclass"
																class="form-control" readonly="readonly"
																value="${pclass}" />

														</div>


														<div class="col-md-3">
															<label>Promoted to Class<span
																class="required-indicator" style="color: red">*</span></label> <select
																name="presentclass1" class="form-control"
																id="presentclass1"
																onchange="${remoteFunction(controller:'student',action: 'reclassSections',
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

													<g:each in="${studentInstance?.academicyear}">
														<g:if test="${it.status == 'current'}">
														</g:if>
													</g:each>
													<g:set value="${it?.section?.sectionName}" var="psec"></g:set>
													<div class="row">
														<div class="col-md-3">
															<label>Section last Studied<span
																class="required-indicator" style="color: red">*</span></label> <input
																name="academicyear[0].presentclass.id" id="presentclass"
																class="form-control" readonly="readonly" value="${psec}" />

														</div>


														<div id="updateSections">
															<g:render template="reclassSections"
																model="[classId:classId]"></g:render>
														</div>
														<div class="col-md-3">
															<label>Student Tracking System(Number)</label>
															<g:if test="${studentInstance?.stsSystem !=null}">
																<g:textField name="stsSystem" class="form-control"
																	id="stsSystem" value="${studentInstance?.stsSystem}"
																	readonly="readonly" />

															</g:if>

															<g:else>
																<g:textField name="stsSystem" class="form-control"
																	id="stsSystem" value="${studentInstance?.stsSystem}" />
															</g:else>


															<div id="SregistrationNo"
																style="display: none; color: red">Provide your
																Registration Number</div>
														</div>




													</div>
												</div>
											</div>
										</div>
										<div class="box box-info">
											<div class="portlet light bordered">
												<div class="portlet-title">
													<div class="caption font-blue">
														<i class="fa fa-user font-blue"></i> <span
															class="caption-subject bold uppercase"> Personal
															Info</span>
													</div>

												</div>

												<div class="form-body">
													<div class="row">
														<div class="col-md-3">
															<label>Student Id<span class="required-indicator"
																style="color: red">*</span></label>
															<div
																class="fieldcontain ${hasErrors(bean: studentInstance, field: 'studentId', 'error')} required">
																<g:textField name="studentId" id="studentId"
																	class="form-control" required=""
																	value="${studentInstance?.studentId}" />

															</div>
															<div id="SstudentId" style="display: none; color: red">Provide
																your student id</div>
														</div>

														<div class="col-md-3">
															<label>First Name<span class="required-indicator"
																style="color: red">*</span></label>
															<div
																class="fieldcontain ${hasErrors(bean: studentInstance, field: 'studentName', 'error')} required">
																<g:textField name="studentName" class="form-control"
																	id="studentName" required=""
																	value="${studentInstance?.studentName}" />


															</div>
															<div id="SstudentName" style="display: none; color: red">Provide
																your student name</div>
														</div>


														<div class="col-md-3">
															<label>Last Name<span class="required-indicator"
																style="color: red">*</span></label>
															<div
																class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lastName', 'error')} required">
																<g:textField name="lastName" class="form-control"
																	id="lastName" required=""
																	value="${studentInstance?.lastName}" />


															</div>
															<div id="SlastName" style="display: none; color: red">Provide
																your Last Name</div>
														</div>


														<div class="col-md-3">
															<label>Student DOB<span
																class="required-indicator" style="color: red">*</span></label>
															<div
																class="fieldcontain ${hasErrors(bean: studentInstance, field: 'studentDOB', 'error')} required">
																<input type="text" id="datepicker" name="studentDOB1"
																	class="form-control date-picker"
																	value="${formatDate(format:'dd/MM/yyyy',date:studentInstance?.studentDOB)}">

															</div>
															<div id="Sdatepickerdob"
																style="display: none; color: red">Provide your
																Student DOB</div>
															<div id="Sdatepickerdob1"
																style="display: none; color: red">DOB should be
																this format "dd/mm/yyyy"</div>
														</div>
													</div>
												</div>
												<div class="form-body">
													<div class="row">
														<div class="col-md-3">
															<label>Student DOJ<span
																class="required-indicator" style="color: red">*</span></label>
															<div
																class="fieldcontain ${hasErrors(bean: studentInstance, field: 'studentDOJ', 'error')} required">
																<input type="text" id="datepicker1" name="studentDOJ1"
																	class="form-control date-picker"
																	value="${formatDate(format:'dd/MM/yyyy',date:studentInstance?.studentDOJ)}">

															</div>
															<div id="Sdatepickerdoj"
																style="display: none; color: red">Provide your
																Student DOJ</div>
															<div id="Sdatepickerdoj1"
																style="display: none; color: red">DOj should be
																this format "dd/mm/yyyy"</div>
														</div>


														<div class="col-md-3">
															<label>Blood group</label>
															<div
																class="fieldcontain ${hasErrors(bean: studentInstance?.presentAddress, field: 'bloodgroup', 'error')} ">

																<g:textField name="bloodgroup" class="form-control"
																	value="${studentInstance?.bloodgroup}" />

															</div>

														</div>

														<div class="col-md-3">
															<label>Mother Tongue<span
																class="required-indicator" style="color: red">*</span></label>
															<div
																class="fieldcontain ${hasErrors(bean: studentInstance?.presentAddress, field: 'motherTongue', 'error')} ">

																<g:textField name="motherTongue" class="form-control"
																	value="${studentInstance?.motherTongue}"
																	id="motherTongue" />

															</div>
															<div id="SmotherTongue" style="display: none; color: red">Provide
																your Mother Tongue</div>
														</div>

														<div class="col-md-3">
															<label>Religion<span class="required-indicator"
																style="color: red">*</span></label>
															<div
																class="fieldcontain ${hasErrors(bean: studentInstance?.presentAddress, field: 'religion', 'error')} ">

																<g:textField name="religion" class="form-control"
																	value="${studentInstance?.religion}" id="religion" />


															</div>
															<div id="Sreligion" style="display: none; color: red">Provide
																your Religion</div>
														</div>
													</div>
												</div>
												<div class="form-body">
													<div class="row">
														<div class="col-md-3">
															<label>Nationality</label>
															<div
																class="fieldcontain ${hasErrors(bean: studentInstance?.presentAddress, field: 'nationality', 'error')} ">

																<g:textField name="nationality" class="form-control"
																	value="${studentInstance?.nationality}" />

															</div>
														</div>

														<div class="col-md-3">
															<label>Email</label>
															<div
																class="fieldcontain ${hasErrors(bean: studentInstance, field: 'email', 'error')} ">
																<g:textField name="email" class="form-control"
																	value="${studentInstance?.email}" />

															</div>
														</div>
														<div class="col-md-3">
															<label>Category Name</label>
															<div
																class="fieldcontain ${hasErrors(bean: studentInstance, field: 'category', 'error')} required">


																<g:textField name="category" class="form-control"
																	value="${studentInstance?.category}" />


															</div>
														</div>
													</div>
												</div>
												<div class="form-body">
													<div class="row">
														<div class="col-md-3">
															<label>Select Gender</label>
															<div
																class="fieldcontain ${hasErrors(bean: studentInstance, field: 'gender', 'error')} required">
																<select name="gender" class="form-control">
																	<g:if test="${studentInstance?.gender !=null}">
																		<option value="${studentInstance?.gender}">
																			${studentInstance?.gender}
																		</option>
																	</g:if>
																	<option></option>

																	<g:each
																		in="${studentInstance.constraints.gender.inList}"
																		var="gen">
																		<option value="${gen}">
																			${gen}
																		</option>
																	</g:each>
																</select>
																<!--  <label for="Gender"> <g:message
								code="student.gender.label" default="Select Gender" /></label>-->
															</div>
														</div>

														<div class="col-md-3">
															<label>Adhar Card Number</label>
															<div
																class="fieldcontain ${hasErrors(bean: studentInstance, field: 'studentAdharNo', 'error')}">
																<g:textField name="studentAdharNo" class="form-control"
																	value="${studentInstance?.studentAdharNo}" />
																<!--  <label for="Gender"> <g:message
								code="student.gender.label" default="Select Gender" /></label>-->
															</div>
														</div>

													</div>

												</div>
											</div>
										</div>

										<div class="row">
											<div class="col-md-12">
												<div class="box box-info">
													<div class="portlet light bordered">
														<div class="portlet-title">
															<div class="caption font-blue">
																<i class="fa fa-home font-blue"></i> <span
																	class="caption-subject bold uppercase"> Present
																	Address</span>
															</div>

														</div>
														<g:render template="presentaddress"
															model="[addr:'presentAddress',address:studentInstance?.presentAddress]"></g:render>

													</div>
												</div>


												<div
													class="form-group form-md-line-input form-md-floating-label">
													<label>If Permanent address is same as Present
														address please check here</label>
													<g:checkBox name="PPA" id="ppa" />
												</div>

												<div class="box box-info">
													<div class="portlet light bordered">
														<div class="portlet-title">
															<div class="caption font-blue">
																<i class="fa fa-home font-blue"></i> <span
																	class="caption-subject bold uppercase">
																	Permanent Address</span>
															</div>

														</div>
														<g:render template="presentaddress"
															model="[addr:'permenentAddres',address:studentInstance?.permenentAddres]"></g:render>


													</div>
												</div>
											</div>
										</div>
										<div class="box box-info">
											<div class="portlet light bordered">
												<div class="portlet-title">
													<div class="caption font-blue">
														<i class="icon-user font-blue"></i> <span
															class="caption-subject bold uppercase"> Father
															Details</span>
													</div>

												</div>
												<g:render template="/parentDetails/parentForm"
													model="[parentDetailsInstance:studentInstance?.fatherDetails,petails:'fatherDetails',parent:'Father']"></g:render>


											</div>
										</div>
										<div class="box box-info">
											<div class="portlet light bordered">
												<div class="portlet-title">
													<div class="caption font-blue">
														<i class="icon-user-female font-blue"></i> <span
															class="caption-subject bold uppercase"> Mother
															Details</span>
													</div>

												</div>
												<g:render template="/parentDetails/parentForm"
													model="[parentDetailsInstance:studentInstance?.motherDetails,petails:'motherDetails',parent:'Mother']"></g:render>
											</div>
										</div>


										<div
											class="form-group form-md-line-input form-md-floating-label">
											<label>Do you want to add bus transportation:</label> <input
												type="checkbox" id="tcheck" name="transport"
												onclick="myfunction()" />
										</div>
										<div class="portlet light bordered" id="trans"
											style="display: none">
											<div class="portlet-title">
												<div class="caption font-blue">
													<i class="icon-pin font-blue"></i> <span
														class="caption-subject bold uppercase">Transportation
														Details</span>
												</div>

											</div>
											<div class="form-body">
												<div class="row">
													<div class="col-md-3">
														<label for="route"> <g:message
																code="transport.route.label" default="Bus Route" />

														</label> <select id="route" name="route.id" class="form-control">
															<option value="">select</option>
															<g:each in="${rut}">
																<option value="${it?.id}">From
																	${it?.startPlace} to
																	${it?.stopPlace}, Bus Route No
																	${it?.routeCode}
																</option>
															</g:each>
														</select>
														<div id="Troute" style="display: none; color: red;">
															select your Bus Route</div>
													</div>

													<div class="col-md-3">
														<label for="destination"> <g:message
																code="transport.destination.label"
																default="Student Route" />
														</label> <select id="destination" name="destination.id"
															class="form-control">
															<option value="">select</option>
															<g:each in="${dst}">
																<option value="${it?.id}">From
																	${it?.fromPlace} to
																	${it?.toPlace} Rs
																	${it?.amount}
																</option>
															</g:each>
														</select>
														<div id="Tdestination" style="display: none; color: red;">
															select your Student Route</div>
													</div>


													<div class="col-md-3">
														<label for="startDate"> <g:message
																code="transport.startDate.label" default="Start Date" />

														</label> <input name="startDate1" precision="day" id="startDate1"
															class="form-control date-picker"
															value="${transportInstance?.startDate}" default="none"
															noSelection="['': '']" />
														<div id="TstartDate1" style="display: none; color: red;">
															select your Start Date</div>
													</div>

													<div class="col-md-3">
														<label for="endDate"> <g:message
																code="transport.endDate.label" default="End Date" />

														</label> <input name="endDate1" precision="day" id="endDate1"
															class="form-control date-picker"
															value="${transportInstance?.endDate}" default="none"
															noSelection="['': '']" />
														<div id="TendDate1" style="display: none; color: red;">
															select your End Date</div>
													</div>

												</div>
											</div>
										</div>
										<div class="col-md-8">
											<g:if test="${studentInstance?.profilePic != null }">
												<ul class="list-inline">
													<li>Do you have Images to Upload??</li>
													<li><input type="radio"
														onclick="$('#openimg').show(500)" name="openimg"
														value="yes" /> Yes</li>
													<li><input type="radio"
														onclick="$('#openimg').hide(500)" name="openimg"
														value="no" checked="checked" /> No</li>
												</ul>
												<images:getImage id="${studentInstance?.profilePic?.id }"
													width="150px" />
											</g:if>
											<br> <br>
											<div id="openimg" style="display: none">
												Upload a Profile Pic:

												<div class="fileinput fileinput-new"
													data-provides="fileinput">
													<div>
														<span class="btn default btn-file"> <span
															class="fileinput-new"> Select Profile Picture </span> <input
															type="file" id="file_1" name="file_1" name="...">
														</span>
													</div>
												</div>
											</div>

										</div>

										<div class="col-md-4" style="display: none">
											<div
												class="form-group form-md-line-input form-md-floating-label">
												<div
													class="fieldcontain ${hasErrors(bean: sectionInstance, field: 'instituite', 'error')} ">
													<select id="instituite" class="form-control"
														name="instituite.id">
														<option value="${instituite?.id}">
															${instituite?.name}
														</option>
													</select> <label for="admin"> <g:message
															code="instituite.admin.label" default="instituite" />

													</label>

												</div>
											</div>


										</div>

										<g:hiddenField name="id" value="${params.id}" />
										<fieldset class="buttons" style="margin-left: 85%">
											<g:actionSubmit value="submit" action="savereadmission"
												class="btn blue" id="student" />
										</fieldset>
									</g:form>

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

	<script src="assets1/global/scripts/app.min.js" type="text/javascript"></script>

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