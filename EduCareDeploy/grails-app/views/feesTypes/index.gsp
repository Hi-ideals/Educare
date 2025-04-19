
<%@ page import="com.hiideals.instituite.feemanagment.FeesTypes"%>
<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main">
<g:set var="entityName"
	value="${message(code: 'feesTypes.label', default: 'FeesTypes')}" />
<title><g:message code="default.list.label" args="[entityName]" /></title>
</head>
<body>
	<a href="#list-feesTypes" class="skip" tabindex="-1"><g:message
			code="default.link.skip.label" default="Skip to content&hellip;" /></a>
	<div class="nav" role="navigation">
		<ul>
			<li><a class="home" href="${createLink(uri: '/')}"><g:message
						code="default.home.label" /></a></li>
			<li><g:link class="create" action="create">
					<g:message code="default.new.label" args="[entityName]" />
				</g:link></li>
		</ul>
	</div>
	<div id="list-feesTypes" class="content scaffold-list" role="main">
		<h1>
			<g:message code="default.list.label" args="[entityName]" />
		</h1>
		<g:if test="${flash.message}">
			<div class="message" role="status">
				${flash.message}
			</div>
		</g:if>
		<table>
			<thead>
				<tr>

					<th>
						${message(code: 'feesTypes.amountPaid.label', default: 'Amount Paid')}
					</th>

					<th>
						${message(code: 'feesTypes.amountToBePaid.label', default: 'Amount To Be Paid')}
					</th>

					<th>
						${message(code: 'feesTypes.due.label', default: 'Due')}
					</th>

					<th><g:message code="feesTypes.fee.label" default="Fee" /></th>

					<th><g:message code="feesTypes.instFeeType.label"
							default="Inst Fee Type" /></th>

				</tr>
			</thead>
			<tbody>
				<g:each in="${feesTypesInstanceList}" status="i"
					var="feesTypesInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

						<td><g:link action="show" id="${feesTypesInstance.id}">
								${fieldValue(bean: feesTypesInstance, field: "amountPaid")}
							</g:link></td>

						<td>
							${fieldValue(bean: feesTypesInstance, field: "amountToBePaid")}
						</td>

						<td>
							${fieldValue(bean: feesTypesInstance, field: "due")}
						</td>

						<td>
							${fieldValue(bean: feesTypesInstance, field: "fee")}
						</td>

						<td>
							${fieldValue(bean: feesTypesInstance, field: "instFeeType")}
						</td>

					</tr>
				</g:each>
			</tbody>
		</table>
		<div class="container" style="text-align: center;">
			<ul class="pagination">
				<li><g:paginate total="${feesTypesInstanceCount ?: 0}" /></li>
			</ul>
		</div>
	</div>
</body>
</html>
