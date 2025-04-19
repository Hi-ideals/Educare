<%@page import="com.hiideals.enums.WeekdaysEnum"%>
<%@ page contentType="text/html;charset=UTF-8"%>

<html>
<head>
<g:set value="[tt:'start active open',ttstaffList:'active']" var="activ"
	scope="request" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="layout" content="main" />
<title>Hi-Educare | Admin</title>
</head>
<body>
	<div class="page-bar">
		<ul class="page-breadcrumb">
			<li><i class="fa fa-circle"></i><a class="home"
				href="${createLink(uri: '/')}">Home</a></li>

		</ul>
	</div>
	<div class="panel">
		<div class="panel-body">
			<div class="row">
				<div class="col-md-12">
					<div class="box box-info">

						<div class="portlet-body">
							<div class="table-scrollable">
								<table class="table  table-hover">
									<g:each in="${staffList}">
										<tr>
											<td>
												${it.staffName }
											</td>
											<td><g:formRemote name="ff" url="[action:'shTT']"
													update="shTT">
													<g:hiddenField name="staffId" value="${it.id}" />
													<g:submitButton name="Show TimeTable" class="btn blue" />
												</g:formRemote></td>
										</tr>
									</g:each>
								</table>
							</div>
						</div>
					</div>


					<div id="shTT"></div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>