<%@ page import="com.hiideals.instituite.classcourses.IClass"%>
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

<link href="assets1/layouts/layout/css/custom.css" rel="stylesheet"
	type="text/css" />
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
<link
	href="assets1/global/plugins/bootstrap-datepicker/css/bootstrap-datepicker6.min.css"
	type="text/css" rel="stylesheet">
<style type="text/css">
@media print {
	#printPageButton {
		display: none;
	}
	#printlogoButton {
		display: inline;
	}
}
</style>

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
					model="[activ:[studentInfo:'start active open',studentList:'active']]"></g:render>
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
						<li><g:link action="create" controller="student">Create New Student</g:link>
						</li>


					</ul>

				</div>
				<div class="panel">
					<div class="panel-body">
						<div class="row">
							<div class="col-md-12" id="hi">
							
							<g:if test="${flash.msgtcfee}">
									<h4 class="message flash" role="status" style="color: red;text-transform:capitalize;">
										${flash.msgtcfee}
									</h4>
								</g:if>
							
							
								<div class="box box-info">
									<div class="portlet light bordered">
										
										<%@ page import="com.hiideals.instituite.EDcoding.LookUpED"%>
<g:form controller="transfercertificate"  target='_blank'>
	
		<div class="portlet box grey">
			<div class="portlet-title">
				<div class="caption">
					<i class="fa fa-user"></i>Transfer certificate Student Details
				</div>
			</div>
			<div class="portlet-body">

				<table class="table table-striped table-hover">
					<tr>
						<td width="15%">Institute Name:</td>
						<th>
							${student.instituite?.name}
						</th>
						
						<td width="15%">Registration Number:</td>
						<th>
							${student?.registrationNo}
						</th>
					</tr>
					<tr>
						<td width="15%">Name</td>
						<th>
							${student?.studentName}  
						</th>
						<td width="15%">Date Of Birth</td>
						<th>
							<g:formatDate format="dd-MMM-yyyy" date="${student?.studentDOB}"/>
						</th>
					</tr>
					<tr>
						<td width="15%">Mother</td>
						<th>
							${student?.motherDetails?.parentName}
						</th>
						<td width="15%">Father</td>
						<th>
							${student?.fatherDetails?.parentName }
						</th>
					</tr>
					<tr>
						<td width="15%">Religion</td>
						<th>
							${student?.religion}
						</th>
						<td width="15%">Nationality</td>
						<th>
							${student?.nationality}
						</th>
					</tr>
					<tr>
						<td width="15%">Gender</td>
						<th>
							${student?.gender}
						</th>
						<td width="15%">Category</td>
						<th>
							${student?.category}
						</th>
					</tr>
					<tr>
						<td>Class</td>
						<th>
							
				<g:each in="${student?.academicyear}">
<g:if test="${it.status == 'current'}">
</g:if>
</g:each>
<g:set value="${it?.presentclass}" var="pclass"></g:set>
							
								
							${pclass?.classname }	
						</th>
						<td>Section</td>
						<th>
							
				<g:each in="${student?.academicyear}">
<g:if test="${it.status == 'current'}">
</g:if>
</g:each>
<g:set value="${it?.section}" var="pclass"></g:set>
							
								
							${pclass?.sectionName}	
						</th>
					</tr>
					<tr>
					<td>Studen Id</td>
					<th>
					${student?.studentId }
					</th>
					<td>Academic Year</td>
					<th>
					
				<g:each in="${student.academicyear}">
											<g:if test="${it.status == 'current'}">
											</g:if>
										</g:each> 
										<input name="academicyear" value="${it.academicyear }" style="display:none">${it.academicyear }
																	
					</th>
					</tr>
					<tr>
					<td>Medium of Instruction</td>
					<th>
					<input type="text" name="mediumofInstruction"
					class="form-control" id="mediumofInstruction" required="required">
					</th>
					<td>Admission Date</td>
					<th>
					<g:formatDate format="yyyy-MM-dd" date="${student?.studentDOJ}"/>
					</th>
					</tr>
					<tr>
					<td>Whether Qualified for promotion to higher standard ?</td>
					<th>
					<select name="stPromotion">
  					<option value="yes">Yes</option>
  					<option value="no">No</option>
					</select></th>
					<td>Whether Candidate has paid all the fee ?</td>
					<th>
					<select name="stfeePaid">
  					<option value="yes">Yes</option>
  					<option value="no">No</option>
					</select></th>
					</tr>
					<tr>
					<td>Scholarship if any</td>
					<th><select name="stScholarship">
  					<option value="yes">Yes</option>
  					<option value="no">No</option>
					</select></th>
					<td>Medically Examined or not</td>
					<th><select name="stmedicalExamine">
  					<option value="yes">Yes</option>
  					<option value="no">No</option>
					</select></th>
					</tr>
					<tr>
					<td>TC Issued date</td>
						<td><input type="text" id="datepickerr" name="stTcissuedate"
							class="form-control" required="required"></td>
					<td>Date of candidate's last attendance</td>
					<th><input type="text" id="datepicker" name="stlastattendancedate"
							class="form-control" required="required"></th>
					</tr>
					<tr>
					<td>Number of school days up to the date of leaving</td>
					<th><input type="text" name="noOfschoolDays"
					class="form-control" id="noOfschoolDays" required="required"></th>
					<td>Number of school days the candidates attendant</td>
					<th><input type="text" name="noOfstattendanceDays"
					class="form-control" id="noOfstattendanceDays" required="required"></th>
					</tr>
					
					<tr>
						<td>Character & Conduct</td>
						<th><input type="text" name="stCharacterconduct"
							class="form-control" id="stCharacterconduct" required="required">
						</th>
						<td></td>
						<th>
							<%--<g:link class="btn blue" controller="bonafiedcrt" action="printbonafied" target="blank"><i class="fa fa-print"></i>Get print</g:link>
				--%>
						</th>

					</tr>

				</table>
				<g:hiddenField name="id" value="${student.id }" />
				<g:actionSubmit class="btn blue" action="printtransfercertificate"
					params="[id:student.id]" value="submit" />

		
			
			</div>
		</div>



</g:form>
										
							</div>

							

						</div>
					</div>
				</div>
			</div>
</div></div></div>


			<g:render template="/footer/footer"></g:render>
	</div>		
			

			<script type="text/javascript">
				function doMath() {
					// Capture the entered values of two input boxes
					var totalamount = document.getElementById('totalamount').value;
					var payamount = document.getElementById('payamount').value;

					// Add them together and display
					var sum = parseInt(totalamount) - parseInt(payamount);

					document.getElementById('paid').innerHTML = payamount;
					document.getElementById('result').innerHTML = sum;
				}
			</script>


			<script src="assets1/global/plugins/jquery.min.js"
				type="text/javascript"></script>
			<script src="assets1/pages/scripts/jquery-ui.min.js"
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
			<!-- END CORE PLUGINS -->
			<!-- BEGIN PAGE LEVEL PLUGINS -->

			<script
				src="assets1/global/plugins/bootstrap-datepicker/js/jquery.ui.datepicker.js"></script>
			<!-- END PAGE LEVEL PLUGINS -->
			<!-- BEGIN THEME GLOBAL SCRIPTS -->
			<script src="assets1/global/scripts/app.min.js"
				type="text/javascript"></script>
			<!-- END PAGE LEVEL SCRIPTS -->
			<!-- BEGIN THEME LAYOUT SCRIPTS -->
			<script src="assets1/layouts/layout/scripts/layout.min.js"
				type="text/javascript"></script>
			<script type="text/javascript">
				$('#sum_table tr:first td').each(
						function() {
							var $td = $(this);

							var colTotal = 0;
							$('#sum_table tr:not(:first,.totalColumn)').each(
									function() {
										colTotal += parseInt($(this).children()
												.eq($td.index()).html(), 10);
									});

							$('#sum_table tr.totalColumn').children().eq(
									$td.index()).html('Total: ' + colTotal);
						});
			</script>
			<script type="text/javascript"></script>
			<script type="text/javascript"></script>
			

			  <script>
		$(document).ready(function() {
			$("#datepickerr").datepicker({
				changeYear : true,
				changeMonth : true,
				onSelect : function() {
					$("#datepicker").focusout()
				}
			});

			$("#datepickerr1").datepicker({
				changeYear : true,
				changeMonth : true,
				onSelect : function() {
					$("#datepicker").focusout()
				}
			});

		});
	</script>
	
	 <script>
		$(document).ready(function() {
			$("#datepicker").datepicker({
				changeYear : true,
				changeMonth : true,
				onSelect : function() {
					$("#datepicker").focusout()
				}
			});

			$("#datepicker1").datepicker({
				changeYear : true,
				changeMonth : true,
				onSelect : function() {
					$("#datepicker").focusout()
				}
			});

		});
	</script>

			
</body></html>
