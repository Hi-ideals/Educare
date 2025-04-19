
<%@ page import="com.hiideals.instituite.student.Student"%>
<%@ page import="com.hiideals.instituite.EDcoding.LookUpED"%>
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
<!-- END THEME GLOBAL STYLES -->
<!-- BEGIN THEME LAYOUT STYLES -->
<link href="assets1/layouts/layout/css/layout.min.css" rel="stylesheet"
	type="text/css" />
<link
	href="assets1/global/plugins/bootstrap-modal/css/bootstrap-modal-bs3patch.css"
	rel="stylesheet" type="text/css" />

<link href="assets1/layouts/layout/css/themes/darkblue.min.css"
	rel="stylesheet" type="text/css" id="style_color" />
<link href="assets1/layouts/layout/css/custom.min.css" rel="stylesheet"
	type="text/css" />
<!-- END THEME LAYOUT STYLES -->
<link rel="shortcut icon" href="assets1/layouts/layout/img/favicon.png" />

<style type="text/css">
@media print {
	#printPageButton {
		display: none;
	}
	#printshowlogoButton {
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

	<div class="clearfix"></div>
	<div class="page-container">
		<div class="page-sidebar-wrapper">
			<div class="page-sidebar navbar-collapse collapse">
				<g:render template="/header/leftSide"
					model="[activ:[studentInfo:'start active open',studentList:'active']]"></g:render>

			</div>
		</div>

		<div class="page-content-wrapper">
			<div class="page-content">

				<div class="page-bar">
					<ul class="page-breadcrumb">
						<li><a class="home" href="${createLink(uri: '/')}">Home</a> <i
							class="fa fa-circle"></i></li>
						<li><g:link controller="studentList" action="index">View List</g:link>
							<i class="fa fa-circle"></i></li>

						<li><g:link action="create">Add New Student</g:link></li>
					</ul>

				</div>
				<div class="panel">
					<div class="panel-body">

						<div class="row">

							<div class="col-md-12" id="printshowlogoButton" hidden="">

								<div class="well" style="padding: 1px">
									<div class="text-center">
										<ul class="list-unstyled">
											<li><images:getImage id="${instituite?.logo?.id}"
													width="100px"/></li>
											
											<li>
												<h2 class="page-title" style="color: #000">
													${instituite?.name }
													<br> <small>Affiliated to: ${instituite?.affiliatedTo }</small>
												</h2>

											</li>
										</ul>
									</div>
								</div>
								<b>Studen Name : </b>
								${studentInstance?.studentName}<br>
								<b>Father Name : </b>
								${studentInstance?.fatherDetails?.parentName}<br>
						<b>Class : </b>
								<g:each in="${studentInstance?.academicyear}">
									<g:if test="${it.status == 'current'}">
									</g:if>
								</g:each>
								<g:set value="${it?.presentclass}" var="pclass"></g:set>


								${pclass.classname }
								<br>
							</div>

							<div class="col-md-12" id="printPageButton">

								<div class="btn-group pull-right" id="printPageButton">
									<button type="button"
										class="btn green btn-sm btn-outline dropdown-toggle"
										data-toggle="dropdown" aria-expanded="false">
										Actions <i class="fa fa-angle-down"></i>
									</button>
									<ul class="dropdown-menu pull-right" role="menu">
										<li><g:link class="edit" action="edit"
												id="${LookUpED.encod(studentInstance.id)}">
												<i class="icon-pencil"></i> Edit</g:link></li>
										<li><g:link controller="student"
												action="showstudentprofile" id="${studentInstance.id }"
												target="blank">
												<i class="fa fa-print"></i> Get print</g:link></li>

										<li><g:link action="reAdmission"
												id="${studentInstance.id}">Readmision</g:link></li>


										<li></li>
									</ul>
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col-md-12">
								<h4><i class="fa fa-graduation-cap"></i> Student Profile</h4>
								<div id="show-student" class="content scaffold-show" role="main">
									<g:if test="${flash.message}">
										<div class="message" role="status">
											${flash.message}
										</div>
									</g:if>

									<div class="profile">
										<div class="tabbable-line tabbable-full-width">
											<ul class="nav nav-tabs" id="printPageButton">
												<li class="active"><a href="#tab_1_1" data-toggle="tab">
														Overview </a></li>
												<li><a href="#tab_1_3" data-toggle="tab"> Account </a></li>

											</ul>
											<div class="tab-content">
												<div class="tab-pane active" id="tab_1_1">
													<div class="row">
														<div class="col-md-3">
															<ul class="list-unstyled profile-nav">
																<li><g:if
																		test="${studentInstance?.profilePic !=null }">
																		<li>
																			<div class="thumbnail">
																				<images:getImage
																					id="${studentInstance?.profilePic?.id}"
																					class="img-responsive" />
																			</div>
																		</li>
																	</g:if> <g:else>
																		<img src="assets1/layouts/layout/img/user.jpg"
																			class="img-responsive pic-bordered" alt="" />
																	</g:else></li>

															</ul>
														</div>
														<div class="col-md-9">
															<div class="row">
																<div class="col-md-12 profile-info">
																	<div class="portlet light bordered">
																		<h1 class="font-green sbold uppercase"></h1>
																		<table class="table table-bordered  table-advance table-hover">

																			<tbody>
																				<tr>
																					<td width="25%">  Registration
																							Number  </td>
																					<td>
																						<b>${studentInstance?.registrationNo}</b>
																					</td>

																				</tr>

																				<tr>
																					<td>Class </td>
																					<td ><g:each
																							in="${studentInstance?.academicyear}">
																							<g:if test="${it.status == 'current'}">
																							</g:if>
																						</g:each> <g:set value="${it?.presentclass}" var="pclass"></g:set>
																						<g:set value="${it.feeId}" var="feeid"></g:set> <b> ${pclass.classname }</b></td>

																				</tr>
																				<tr>
																					<td> Section </td>
																					<td><g:each
																							in="${studentInstance?.academicyear}">
																							<g:if test="${it.status == 'current'}">
																							</g:if>
																						</g:each> <g:set value="${it?.section}" var="pclass"></g:set>


																						<b>${pclass.sectionName}</b></td>

																				</tr>
																				<tr>

																					<td>Student ID</td>
																					<td>
																						<b>${studentInstance?.studentId}</b>
																					</td>
																				</tr>
																				<tr>

																					<td>Medium Of
																							Instruction</td>
																					<td>
																						<b>${studentInstance?.mediumOfInstruction }</b>
																					</td>
																				</tr>
																				<tr>
																					<td> First Name </td>
																					<td>
																						<b>${studentInstance?.studentName}</b>
																					</td>

																				</tr>

																				<tr>
																					<td>Last Name </td>
																					<td>
																						<b>${studentInstance?.lastName}</b>
																					</td>

																				</tr>

																				<tr>
																					<td>Father's Name
																					</td>
																					<td>
																						<b>${studentInstance?.fatherDetails?.parentName}</b>
																					</td>

																				</tr>
																				<tr>
																					<td> Mother's Name
																					</td>
																					<td>
																						<b>${studentInstance?.motherDetails?.parentName}</b>
																					</td>

																				</tr>
																				<tr>
																					<td>Date of Joined
																					</td>
																					<td>
																					<b><g:formatDate
																							date="${studentInstance?.studentDOJ}"
																							format="dd-MMM-yyyy" /></b></td>

																				</tr>
																				<tr>
																					<td>STS Number </td>
																					<td>
																						<b>${studentInstance?.stsSystem}</b>
																					
																				</tr>
																				<tr>
																					<td>Aadhar Card</td>
																					<td>
																						<b>${studentInstance?.studentAdharNo}</b>
																					
																				</tr>

																			</tbody>
																		</table>

																	</div>
																</div>
															</div>


														</div>
													</div>
													<div class="row">
														<div class="col-md-12">
															<div class="portlet box blue">
																<div class="portlet-title">
																	<div class="caption">
																		<i class="fa fa-user"></i>Personal Details
																	</div>

																</div>
																<div class="portlet-body">
																	<div class="table-scrollable">
																		<table class="table  table-hover">

																			<tbody>
																				<tr>
																					<td width="20%">Date of Birth</td>
																					<td><b><g:formatDate
																							date="${studentInstance?.studentDOB}"
																							format="dd-MMM-yyyy" /></b></td>
																					<td width="15%">Gender</td>
																					<td>
																						<b>${studentInstance?.gender}</b>
																					</td>

																				</tr>

																				<tr>
																					<td width="20%">Mother Tongue</td>
																					<td>
																						<b>${studentInstance?.motherTongue}</b>
																					</td>
																					<td width="15%">Blood Group</td>
																					<td>
																						<b>${studentInstance?.bloodgroup}</b>
																					</td>

																				</tr>
																				<tr>
																					<td width="20%">Religion</td>
																					<td>
																						<b>${studentInstance?.religion}</b>
																					</td>
																					<td width="15%"> Nationality</td>
																					<td>
																						<b>${studentInstance?.nationality}</b>
																					</td>

																				</tr>

																				<tr>
																					<td>Father's Occupation</td>
																					<td>
																						<b>${studentInstance?.fatherDetails?.occupation}</b>
																					</td>

																					<td>Father's Contact</td>
																					<td>
																						${studentInstance?.fatherDetails?.mobileNumber}
																					</td>

																				</tr>
																				<tr>

																					<td>Father's Name</td>
																					<td>
																						<b>${studentInstance?.fatherDetails?.parentName}</b>
																					</td>
																					<td>Father's Adhar Card</td>
																					<td>
																						<b>${studentInstance?.fatherDetails?.parentAdharNo}</b>
																					</td>

																				</tr>

																				<tr>

																					<td>Father's VoterId</td>
																					<td><b>${studentInstance?.fatherDetails?.parentVoterId}</b>
																			</td>
																		<td>Mother's Adhar Card</td>
																			<td>
																			<b>${studentInstance?.motherDetails?.parentAdharNo}</b>
																			</td>
																			
																		</tr>
																		
																		<tr>
																		
																		<td>Mother's Name</td>
																			<td>
																				<b>${studentInstance?.motherDetails?.parentName}</b>
																			</td>
																			<td>Email Id</td>
																			<td>
																				<b>${studentInstance?.email}</b>
																			</td>
																		
																		</tr>


																		<tr>
																			<td>Mother's Occupation</td>
																			<td>
																				<b>${studentInstance?.motherDetails?.occupation}</b>
																			</td>

																			<td>Mother's Contact</td>
																			<td>
																				${studentInstance?.motherDetails?.mobileNumber}
																			</td>

																		</tr>

																		



																		<tr>
																			<td>Guardian Name</td>
																			<td>
																				<b>${studentInstance?.guardianDetails?.parentName}</b>
																			</td>
																			<td>Guardian Occupation </td>
																			<td>
																				<b>${studentInstance?.guardianDetails?.occupation}</b>
																			</td>

																		</tr>
																		<tr>
																			<td>Guardian Contact</td>
																			<td>
																				<b>${studentInstance?.guardianDetails?.mobileNumber}</b>
																			</td>
																			<td>Category</td>
																			<td>
																				<b>${studentInstance?.category}</b>
																			</td>
																		</tr>
																		
																		<tr>
																			<td>Guardian Adhar Card</td>
																			<td>
																				<b>${studentInstance?.guardianDetails?.parentAdharNo}</b>
																			</td>
																			<td>Guardian Voter Id </td>
																			<td>
																				<b>${studentInstance?.guardianDetails?.parentVoterId}</b>
																			</td>

																		</tr>

																	</tbody>

																</table>
															</div>
														</div>
													</div>

													<div class="portlet box blue">
														<div class="portlet-title">
															<div class="caption">
																<i class="fa fa-home"></i>Contact Details
															</div>

														</div>
														<div class="portlet-body">
															<div class="table-scrollable">
																<table class="table  table-hover">

																	<tbody>
																		<tr>
																			<td width="20%">Present Address</td>
																			<td>
																				<b>${studentInstance?.presentAddress?.hsno} ${studentInstance?.presentAddress?.street},
																				${studentInstance?.presentAddress?.city} - ${studentInstance?.presentAddress?.pinCode}, ${studentInstance?.presentAddress?.state},
																				- ${studentInstance?.presentAddress?.country}</b>
																			</td>
																			<td></td>
																			<td></td>

																		</tr>
																		<tr>
																			<td>Permanent Address </td>
																			<td>
																				<b>${studentInstance?.permenentAddres?.hsno} ${studentInstance?.permenentAddres?.street},
																				${studentInstance?.permenentAddres?.city} - ${studentInstance?.presentAddress?.pinCode}, ${studentInstance?.permenentAddres?.state},
																				- ${studentInstance?.permenentAddres?.country}</b>
																			</td>
                                                    <td>  </td>
                                                    <td>  </td>
                                                    
                                                </tr>
                                                 <tr>
                                                    <td> Student Contact Number</td>
                                                    <td><b>${studentInstance?.studentPhNumber}</b></td>
													</tr>
													<tr>
                                                    <td>Email ID </td>
                                                    
                                                </tr>
                                               
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                    	</div>
		
		
                    </div>
                                    
                                </div>
                                <!--tab_1_2-->
                                <div class="tab-pane" id="tab_1_3">
                                    <div class="row profile-account">
                                        <div class="col-md-3" id="printPageButton">
                                            <ul class="ver-inline-menu tabbable margin-bottom-10">
                                                <li class="active">
                                                    <a data-toggle="tab" href="#tab_1-1">
                                                        <i class="fa fa-cog"></i> Course Info </a>
                                                    <span class="after"> </span>
                                                </li>
                                                
                                                <li>
                                                    <a data-toggle="tab" href="#tab_3-3">
                                                        <i class="fa fa-lock"></i> Fee Details</a>
                                                </li>
                                                 <li>
                                                    <a data-toggle="tab" href="#tab_4-4">
                                                        <i class="fa fa-rupee"></i> Fee History</a>
                                                </li>
                                                <li>
                                                    <a data-toggle="tab" href="#tab_2-2">
                                                        <i class="fa fa-picture-o"></i> Change Picture </a>
                                                </li>
                                                <li>
                                                 <a data-toggle="tab" href="#tab_5-5">
                                                        <i class="fa fa-picture-o"></i> Documents Uploaded </a>
                                                </li>
                                                
                                            </ul>
                                        </div>
                                        <div class="col-md-9">
                                            <div class="tab-content">
                                                <div id="tab_1-1" class="tab-pane active">
                              <div class="portlet box blue">
                                <div class="portlet-title">
                                    <div class="caption">
                                        <i class="fa fa-pencil"></i>Course Details </div>
                                    
                                </div>
                                <div class="portlet-body">
                                    <div class="table-scrollable">
                                        <table class="table  table-hover">
                                           
                                            <tbody>
                                                <tr>
                                                    <td width="20%"> Registration Number</td>
                                                    <td> <b>${studentInstance?.registrationNo } </b></td>
                                                    <td width="20%">Academic Year  </td>
                                                   <td><g:each in="${studentInstance?.academicyear?.academicyear}" var="acdemic">
                                                     <b>${acdemic}</b>
                                                    </g:each>
                                                   </td>
                                                    
                                                </tr>
                                                <tr>
                                                    <td>Student ID </td>
                                                    <td><b>${studentInstance?.studentId } </b></td>
                                                     <td>Class Name </td>
                                                    <td><g:each in="${studentInstance?.academicyear}">
													<g:if test="${it.status == 'current'}">
													</g:if>
													</g:each>
													<g:set value="${it?.presentclass}" var="pclass"></g:set>
							
								
													<b>${pclass.classname }</b>
												</td>
                                               
                                                </tr>
                                                
                                                <tr><td colspan="4"><h4>Previous Education details</h4></td></tr>
                                                 <tr>
                                                    <td> School Name </td>
                                                    <td><b>${preeducation?.schoolname } </b></td>
                                                    <td> Previous Class   </td>
                                                    <td><b>${preeducation?.qualification } </b></td>
                                                    
                                                </tr>
                                                 <tr>
                                                    <td>  Percentage of Previous Class   </td>
                                                    <td><b>${preeducation?.marksPercentage }% </b> </td>
                                                    <td> Transfer Certificate</td>
                                                    <td><b>${preeducation?.transferCertificatId }</b> </td>
                                                    
                                                </tr>
                                                <tr>
                                                    <td> School Address  </td>
                                                    <td><b>${preeducation?.schoolAddress?.hsno },
                                                    	${preeducation?.schoolAddress?.street },
                                                    	${preeducation?.schoolAddress?.city },
                                                    	${preeducation?.schoolAddress?.state },
                                                    	${preeducation?.schoolAddress?.country },
                                                    	${preeducation?.schoolAddress?.mobileNumber },
                                                    	${preeducation?.schoolAddress?.phno }</b>
                                                    </td>
                                                    <td> <a></a> </td>
                                                    <td></td>
                                                    
                                                </tr>
                                               
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                                                </div>
                                                
                                                <div id="tab_3-3" class="tab-pane">
                                                    <div class="portlet box green">
                                <div class="portlet-title" style="background:#3598dc">
                                    <div class="caption">
                                        <i class="fa fa-pencil"></i>Fees Details </div>
                                        <div class="tools" id="bye1">
										
				</div>
                                    
                                </div>
                           
                                <div class="portlet-body">
                                    <div class="table-scrollable">
                                         <g:if test="${feeid == null}">
                                    	${studentInstance.studentName} is not yet paid fee Click 'Add Fee' link to add fee
                                    	<g:link controller="fee" action="create"  id="${LookUpED.encod(studentInstance.id) }" title="">
					<i class="fa fa-pencil"></i> Add Fee</g:link>
                                    </g:if><g:else>
                                   
                                    <g:if test="${studentInstance?.academicyear.size()>0}">
                                        <g:render template="/studentList/studenttable" model="[academicyears:studentInstance?.academicyear]"></g:render>
                                    </g:if>
                                      </g:else>
                                  
                                    </div>
                                </div>
                            </div>
                            
                              
                            <div class="col-xs-6 text-right" id="printPageButton">
						<g:if test="${studentInstance?.academicyear.size()>0}">
						<g:link class="btn blue" controller="student" action="feedetailprint" id="${studentInstance.id}" target='_blank' >Get Print</g:link>
									</g:if>
									</div>
                                     </div>
                                     
                                     
                                      <div id="tab_4-4" class="tab-pane" id="printPageButton">
                                      		<div class="portlet box blue">
                                <div class="portlet-title">
                                    <div class="caption">
                                        <i class="fa fa-pencil"></i>Fees History </div>
                                    
                                </div>
                                <div class="portlet-body">
                                    <div class="table-scrollable">
                                    
                                    <table class="table table-bordered table-hover">
                                    	<thead>
                                    	<tr>
                                    		<th>Installments</th>
											<th>Invoice No</th>
                                    		<th>Payment Type</th>
											<th>Details</th>
                                    		<th>Date of Fees Paid </th>
                                    		<th id="printPageButton">View Details</th>
                                    		<th id="printPageButton">Print</th>
                                    		<th id="printPageButton">Get Fee Print</th>
                                    	</tr>
                                    	</thead>
                                    	<tbody>
                                    	<g:each in="${tracker}" var="tr" status="k">
                                    		<tr>
                                    		<td>${tr.instalment}</td>
												<td> ${tr?.invoiceNo}</td>
                                    		<td>${tr.paymentType}</td>
											<g:if test="${tr.paymentType=='CHECK' || tr.paymentType=='DD'}">
                                    		<td>${tr?.paymentType} No: ${tr?.ddNumber} <br/> Acc/No: ${tr?.accNo} <br/>
                                    		Bank Name: ${tr?.ddNumber} <br/> Pin No : ${tr?.ddNumber}
                                    		<br/>
                                    		Teller No: ${tr?.ddNumber}
                                    		</td>
                                    		</g:if>
                                    		<g:else><td>-</td></g:else>
                                    		<td><g:formatDate format="dd-MMM-yyyy" date="${tr.dateCreated}"/> </td>
                                    		<td id="printPageButton"><a class="btn btn-outline dark" data-target="#feeDetails_${k}" data-toggle="modal"> View Details </a></td>
                                    		<td id="printPageButton"><g:link controller="student" action="viewfeedetail" params="[id:studentInstance.id,stid:tr.id]" target="_blank">
								<i class="fa fa-print"></i></g:link></td>
								<td><g:link controller="student" action="specificviewfeedetail" params="[id:studentInstance.id,stid:tr.id]" target="_blank">
								<i class="fa fa-print"></i></g:link></td>
                                    	</tr>
                                    	</g:each>
                                    	</tbody>
                                    </table>
                                    <g:each in="${tracker}" var="tr" status="j">
                                    <g:render template="/student/feePopup"  model="[feeInstance:tr,i:j]"></g:render>
                                    </g:each>
                                    
                                    </div>
                                   </div>
                                  </div>
                                <div class="col-xs-6 text-right" id="printPageButton">
                               
						<g:link class="btn blue" controller="student" action="feeinstallmentdetails" params="[id:studentInstance.id]" target='_blank'>Get Print</g:link>
									</div>
                                      
                                     </div>
                                                
                                                <div id="tab_2-2" class="tab-pane">
                                                   
                                                     <div id="updatepic"></div>
                                                     <g:form name="ss" controller="gallery" action="editImage" enctype='multipart/form-data' >
                                                    <input type="hidden" name="studentId" value="${LookUpED.encod(studentInstance?.id)}"/>
                                                        <div class="form-group">
                                                            <div class="fileinput fileinput-new" data-provides="fileinput">
                                                                <div class="fileinput-new thumbnail" >
                                                                    <images:getImage id="${studentInstance?.profilePic?.id }" width="250px" height="250px"/>
                                                                    </div>
                                                                <div>
                                                                    <span class="btn default btn-file">
                                                                        <span class="fileinput-new"> Select image </span>
                                                                        <input type="file" name="file_1"> </span>
                                                                </div>
                                                            </div>
                                                          
                                                        </div>
                                                        <div class="margin-top-10">
                                                         <g:submitButton name="Submit" class="btn blue"/>
                                                        </div>
                                                    </g:form>
                                                </div>
                                                
                                                <div id="tab_5-5" class="tab-pane">
                                                <g:each in="${docList?.documents}" var="dc" status="y">
                                                <div class="margin-top-10">
                                                         <ul>
                                                         <li><b>DOWNLOAD :  </b><a href="${createLink(controller:'student', action:'downloadFile', id:dc?.id)}">${dc?.fileName}</a>
                                                         </li>
                                                        </ul>
                                                        </div>
                                                
                                                
                                                </g:each>
                                                <ul class="list-inline">
				<li>Do you have Documents/Certificates to Upload??</li>
				<li><input type="radio" onclick="$('#openimg1').show(500)"
					name="openimg1" value="yes" /> Yes</li>
				<li><input type="radio" onclick="$('#openimg1').hide(500)"
					name="openimg1" value="no" checked="checked" /> No</li>
			</ul> 
			<div id="openimg1" style="display: none">
				<div class="portlet-body form">
					<g:form url="[controller:'student', action:'saveDocuments']" enctype='multipart/form-data'>
					<div class="form-body">
						<div class="row">
							<div class="col-md-4">
								<div class="form-group  ">
								<g:hiddenField name="stId" value="${studentInstance?.id}"/>
									<g:each in="${1..4}" var="documentFile" status="i">
										<input type="file" name="document${i}" class="form-control" />
										<br>
									</g:each>

								</div>
							</div>
						</div>
					</div>
					<fieldset class="buttons">
											<g:submitButton name="create" class="btn blue" id="Educationcreate"
												value="${message(code: 'default.button.create.label', default: 'Create')}" />
											
											
										
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
                        </div>
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
	
	
	<script src="assets1/global/scripts/app.min.js" type="text/javascript"></script>
	
	<script src="assets1/layouts/layout/scripts/layout.min.js"
		type="text/javascript"></script>
</body>

</html>



