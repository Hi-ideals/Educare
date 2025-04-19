
<%@ page import="com.hiideals.instituite.feemanagment.FeesTypes"%>
<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main">
<g:set var="entityName"
	value="${message(code: 'feesTypes.label', default: 'FeesTypes')}" />
<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>
<body>
	<a href="#show-feesTypes" class="skip" tabindex="-1"><g:message
			code="default.link.skip.label" default="Skip to content&hellip;" /></a>
	<div class="nav" role="navigation">
		<ul>
			<li><a class="home" href="${createLink(uri: '/')}"><g:message
						code="default.home.label" /></a></li>
			<li><g:link class="list" action="index">
					<g:message code="default.list.label" args="[entityName]" />
				</g:link></li>
			<li><g:link class="create" action="create">
					<g:message code="default.new.label" args="[entityName]" />
				</g:link></li>
		</ul>
	</div>
	<div id="show-feesTypes" class="content scaffold-show" role="main">
		<h1>
			<g:message code="default.show.label" args="[entityName]" />
		</h1>
		<g:if test="${flash.message}">
			<div class="message" role="status">
				${flash.message}
			</div>
		</g:if>
		<ol class="property-list feesTypes">

			<g:if test="${feesTypesInstance?.amountPaid}">
				<li class="fieldcontain"><span id="amountPaid-label"
					class="property-label"><g:message
							code="feesTypes.amountPaid.label" default="Amount Paid" /></span> <span
					class="property-value" aria-labelledby="amountPaid-label"><g:fieldValue
							bean="${feesTypesInstance}" field="amountPaid" /></span></li>
			</g:if>

			<g:if test="${feesTypesInstance?.amountToBePaid}">
				<li class="fieldcontain"><span id="amountToBePaid-label"
					class="property-label"><g:message
							code="feesTypes.amountToBePaid.label" default="Amount To Be Paid" /></span>

					<span class="property-value" aria-labelledby="amountToBePaid-label"><g:fieldValue
							bean="${feesTypesInstance}" field="amountToBePaid" /></span></li>
			</g:if>

			<g:if test="${feesTypesInstance?.due}">
				<li class="fieldcontain"><span id="due-label"
					class="property-label"><g:message code="feesTypes.due.label"
							default="Due" /></span> <span class="property-value"
					aria-labelledby="due-label"><g:fieldValue
							bean="${feesTypesInstance}" field="due" /></span></li>
			</g:if>

			<g:if test="${feesTypesInstance?.fee}">
				<li class="fieldcontain"><span id="fee-label"
					class="property-label"><g:message code="feesTypes.fee.label"
							default="Fee" /></span> <span class="property-value"
					aria-labelledby="fee-label"><g:link controller="fee"
							action="show" id="${feesTypesInstance?.fee?.id}">
							${feesTypesInstance?.fee?.encodeAsHTML()}
						</g:link></span></li>
			</g:if>

			<g:if test="${feesTypesInstance?.instFeeType}">
				<li class="fieldcontain"><span id="instFeeType-label"
					class="property-label"><g:message
							code="feesTypes.instFeeType.label" default="Inst Fee Type" /></span> <span
					class="property-value" aria-labelledby="instFeeType-label"><g:link
							controller="instFeeTypes" action="show"
							id="${feesTypesInstance?.instFeeType?.id}">
							${feesTypesInstance?.instFeeType?.encodeAsHTML()}
						</g:link></span></li>
			</g:if>

		</ol>
		<g:form url="[resource:feesTypesInstance, action:'delete']"
			method="DELETE">
			<fieldset class="buttons">
				<g:link class="edit" action="edit" resource="${feesTypesInstance}">
					<g:message code="default.button.edit.label" default="Edit" />
				</g:link>
				<g:actionSubmit class="delete" action="delete"
					value="${message(code: 'default.button.delete.label', default: 'Delete')}"
					onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
			</fieldset>
		</g:form>
	</div>
</body>
</html>
