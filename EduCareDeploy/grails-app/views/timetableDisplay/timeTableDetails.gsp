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
			<li>
				<i class="fa fa-circle"></i>
				<a class="home" href="${createLink(uri: '/')}">
					<g:message code="default.home.label" />
				</a>
			</li>
		</ul>
	</div>
	<div class="portlet box blue">
		<div class="portlet-title">
			<div class="caption">
				<i class="fa fa-user"></i>Lists of TimeTable
			</div>
		</div>
		<div class="portlet-body">
			<div class="table-scrollable">
				<table class="table  table-hover">
					<tbody>
						<tr>
							<th><strong> classses</strong></th>

							<g:each in="${hashset}">
								<th>
									${it}
								</th>

							</g:each>
						</tr>
						<g:each in="${mapp?.keySet()}" var="Keyclass">
							<tr>
								<td>
									${Keyclass } <g:set value="${mapp.getAt(Keyclass)}"
										var="periodmap"></g:set>
								</td>
								<g:each in="${hashset}" var="periodStaff">

									<td>
										${periodmap.getAt(periodStaff)}
									</td>

								</g:each>
							</tr>
						</g:each>
					</tbody>
				</table>
			</div>
		</div>
	</div>

</body>
</html>