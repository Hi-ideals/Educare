<%@ page import="com.hiideals.instituite.student.Student"%>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>


<style>
body {
	margin: 0 auto;
}

.a4 {
	width: 793.92px;
	height: 1122.24px;
	margin: auto;
	position: relative;
	margin-top: 10px;
}

.user-image {
	position: absolute;
	left: 70px;
	
	top: 90px;
}

table {
	left: 40px;
	top: 200px;
	position: absolute;
	font-size: 11px;
}

.signture {
	position: absolute;
	top: 280px;
	left: 150px;
}

#Iname {
	font-size: 12px;
	margin: auto;
	top: 5px;
	text-align: center;
}

#add {
	font-size: 11px;
	text-align: center;
	padding-left: 5px;
}

.logo{
	
	position: absolute;
	top: 15px;
}

.border {
	border: 1px solid blue;
	height: 325px;
	width: 204px;
	background-image: url("assets1/img/bg1.jpg");
}

.blood-group {
	position: absolute;
	left: 185px;
	top: 130px;
	
}

.blood-sign {
	position: absolute;
	top: 90px;
	left: 180px;
	
}

.years {
	writing-mode: tb-rl;
	transform: rotate(-180deg);
	font-family: monospace;
	font-size: 14px;
	color: #654321;
	
	position: absolute;
	top: 80px;
	left: 35px;
	
}

@media print {
	div {
		page-break-inside: avoid;
		
	}
	#printPageButton {
		display: none;
	}
	
	.imgs{
	display: block !important;
	}
	
	.sign{
	display: block !important;
	}
	
	
	
	.user-image {
	position: absolute !important;
	left: 70px !important;
	
	top: 90px !important;
}

table {
	left: 40px !important;
	top: 200px !important;
	position: absolute !important;
	font-size: 11px !important;
}

.signture {
	position: absolute !important;
	top: 280px !important;
	left: 150px !important;
}

#Iname {
	font-size: 12px !important;
	margin: auto !important;
	top: 5px !important;
	text-align: center !important;
}

#add {
	font-size: 11px !important;
	text-align: center !important;
	padding-left: 5px !important;
}

.logo{
	
	position: absolute !important;
	top: 15px !important;
}



.border {
	border: 1px solid black !important;
	height: 325px !important;
	width: 204px !important;
	background-image: url("assets1/img/bg1.jpg") !important;

	
}


.blood-group {
	position: absolute !important;
	left: 185px !important;
	top: 130px !important;
	
}

.blood-sign {
	position: absolute !important;
	top: 90px !important;
	left: 180px !important;
	
}

.years {
	writing-mode: tb-rl !important;
	transform: rotate(-180deg) !important;
	font-family: monospace !important;
	font-size: 14px !important;
-webkit-text-fill-color: #654321;


	position: absolute !important;
	top: 80px !important;
	left: 40px !important;
	   
}

	
	
}
</style>
</head>

<body>

<div class="page-content">
	<div class="a4">
		<div class="row">

			<g:if test="${ student }">
				<g:each in="${student }">

					<div class="col-sm-4">
						<div class="border" style="margin-bottom: 10px">
							<div class="row">

								<div class="col-sm-2">
									<ul class="list-unstyled profile-nav">
										<li><g:if test="${student?.profilePic !=null }">
												<li>
													<div class="logo">
														<images:getImage id="${instituite?.logo?.id}" 
															 width=" 40" height="40" />
													</div>
												</li>
											</g:if> <g:else>
											<div class="logo">
												<img src="assets1/img/user.jpg" class="img"
													 width=" 40" height="50" alt="" />
													 </div>
											</g:else></li>

									</ul>
								</div>
								<div class="col-sm-10">

									<div id="Iname">
										${instituite?.name }
									</div>
									
									<div id="add">
										${instituite?.hsno}
										${instituite?.street}
										${instituite?.city}-${instituite?.pinCode}
										${instituite?.state}
										${instituite?.country}
										Ph:${instituite?.phone}

									</div>
								</div>
							</div>
							<div class="user-image">
								<images:getImage id="${student?.profilePic?.id}"
									  width=" 100" height="100"/>
							</div>

							<div class="info">
								<table>
									<tr>
										<th>Student ID :</th>
										<td>
											${student?.studentId}
										</td>
									</tr>
									<tr>
										<th>Name :</th>
										<td>
											${student?.studentName} ${student?.lastName}
										</td>
									</tr>
									<tr>
										<th>Fathers Name :</th>
										<td>
											${student?.fatherDetails?.parentName}
										</td>
									</tr>
									<tr>
										<th>D.O.B :</th>
										<td><g:formatDate date="${student?.studentDOB}"
												format="dd-MMM-yyyy" /></td>
									</tr>
									<tr>
										<th>Class :</th>
										<td><g:each in="${student?.academicyear}">
												<g:if test="${it.status == 'current'}">
												</g:if>
											</g:each> <g:set value="${it?.presentclass}" var="pclass"></g:set> <b>
												${pclass.classname }
										</b></td>
									</tr>
									<tr>
										<th>Section :</th>
										<td><g:each in="${student?.academicyear}">
												<g:if test="${it.status == 'current'}">
												</g:if>
											</g:each> <g:set value="${it?.section}" var="pclass"></g:set> <b>
												${pclass.sectionName}
										</td>
									</tr>
									<tr>
										<th>STS Number :</th>
										<td>
											${student?.stsSystem}
										</td>
									</tr>

								</table>
							</div>


							<div class="years">
								<p>
									<g:each in="${student?.academicyear}">
										<g:if test="${it.status == 'current'}">
										</g:if>
									</g:each>

									<b> ${it?.academicyear }
									</b>
								</p>

							</div>
							<div class="blood-sign">
								<img src="assets1/img/bloodgroup.png" height="35px;">

							</div>


							<div class="blood-group">
								<p>
									${student?.bloodgroup}
								</p>

							</div>
							<div class="signture">
								
									<images:getImage id="${instituite?.signature?.id}" width="40px"
										height="30px" />
								

							</div>

						</div>

					</div>
				</g:each>
			</g:if>

			<g:elseif test="${studentList}">
				<g:each in="${studentList}" var="p">

					<div class="col-sm-4" style="margin-bottom: 10px">
						<div class="border">
							<div class="row">

								<div class="col-sm-2">
									<ul class="list-unstyled profile-nav">
										<li><g:if test="${p?.profilePic !=null }">
												<li>
													<div class="logo">
														<images:getImage id="${instituite?.logo?.id}"
															 width=" 40" height="40"  />


													</div>
												</li>
											</g:if> <g:else>
												<div class="logo">
												<img src="assets1/img/user.jpg" class="img"
													 width=" 40" height="50" alt="" />
													 </div>
											</g:else></li>

									</ul>
								</div>
								<div class="col-sm-10">

									<div id="Iname">
										${instituite?.name }
									</div>
									
									<div id="add">
										${instituite?.hsno}
										${instituite?.street}
										${instituite?.city}-${instituite?.pinCode}
										${instituite?.state}
										${instituite?.country}
										Ph:${instituite?.phone}

									</div>
								</div>
							</div>
							<div class="user-image">
								<images:getImage id="${p?.profilePic?.id}"
									width=" 100" height="100"/>
							</div>

							<div class="info">
								<table>
									<tr>
										<th>Student ID :</th>
										<td>
											${p?.studentId}
										</td>
									</tr>
									<tr>
										<th>Name :</th>
										<td>
											${p?.studentName} ${p?.lastName}
										</td>
									</tr>
									<tr>
										<th>Father's Name :</th>
										<td>
											${p?.fatherDetails?.parentName}
										</td>
									</tr>
									<tr>
										<th>D.O.B :</th>
										<td><g:formatDate date="${p?.studentDOB}"
												format="dd-MMM-yyyy" /></td>
									</tr>
									<tr>
										<th>Class :</th>
										<td><g:each in="${p?.academicyear}">
												<g:if test="${it.status == 'current'}">
												</g:if>
											</g:each> <g:set value="${it?.presentclass}" var="pclass"></g:set> <b>
												${pclass.classname }
										</b></td>
									</tr>
									<tr>
										<th>Section :</th>
										<td><g:each in="${p?.academicyear}">
												<g:if test="${it.status == 'current'}">
												</g:if>
											</g:each> <g:set value="${it?.section}" var="pclass"></g:set> <b>
												${pclass.sectionName}
										</b></td>
									</tr>
									<tr>
										<th>STS Number :</th>
										<td>
											${p?.stsSystem}
										</td>
									</tr>

								</table>
							</div>


							<div class="years">
								<p>
									<g:each in="${p?.academicyear}">
										<g:if test="${it.status == 'current'}">
										</g:if>
									</g:each>

									<b>
										${it?.academicyear }
									</b>
								</p>

							</div>
							<div class="blood-sign">
									<img src="assets1/img/bloodgroup.png" height="35px;">

							</div>

							<div class="blood-group">
								<p>
									${p?.bloodgroup}
								</p>

							</div>
							<div class="signture">
								<h5>
									<images:getImage id="${instituite?.signature?.id}" width="40px"
										height="30px"/>
								</h5>

							</div>

						</div>

					</div>




				</g:each>
			</g:elseif>
		</div>


	</div>
</div>
	<button class="btn btn-info center-block" onclick="window.print()" id="printPageButton">Print
	</button>


</body>
</html>
