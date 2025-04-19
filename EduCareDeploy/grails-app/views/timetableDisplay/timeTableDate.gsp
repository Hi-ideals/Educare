<%@page import="com.hiideals.instituite.EDcoding.LookUpED"%>
<%@ page contentType="text/html;charset=UTF-8"%>

<html>
<head>
<g:set value="[tt:'start active open',ttList:'active']" var="activ"
	scope="request" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta name="layout" content="main" />
<title>Hi-Educare</title>
</head>
<body>

	<div class="page-bar">
		<ul class="page-breadcrumb">
			<li><i class="fa fa-circle"></i><a class="home"
				href="${createLink(uri: '/')}"><g:message
						code="default.home.label" /></a></li>
		</ul>
	</div>
	<div class="panel">
		<div class="panel-body">
			<div class="row">
				<div class="col-md-12">
					<div class="text-center">
						<g:form action="timeTableDetails">
							<label>Date</label>

							<g:datePicker name="date" precision="day" />

							<g:submitButton class="btn blue" name="Get Time Table" />

						</g:form>
					</div>
					<div class="box box-info">
						<div class="portlet light bordered">
							<div class="portlet-title">
								<div class="caption font-blue">
									<i class="fa fa-bars font-blue"></i> <span
										class="caption-subject bold uppercase"> List of classes</span>
								</div>

							</div>

							<div class="portlet-body form">
								<div class="table-scrollable">
									<table id="MyTable" class="table table-hover table-bordered">
										<thead>
											<tr>
												<th>Class</th>
												<th>Action</th>
											</tr>
										</thead>
										<tbody>
											<g:each in="${iclassList}" var="iclass">
												<g:each in="${iclass.sections }" var="section">
													<tr>
														<td>
															${iclass.classname} ${section.sectionName}
														</td>
														<td><g:link class="btn blue"
																controller="timetableDisplay" action="showTimeTable"
																params="[cid:iclass?.id,sid:section?.id]">Show</g:link>
															<g:link class="btn green" controller="timetableDisplay"
																action="deleteTime"
																params="[cid:iclass?.id,sid:section?.id]">Reset</g:link></td>
													</tr>
												</g:each>
											</g:each>
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>