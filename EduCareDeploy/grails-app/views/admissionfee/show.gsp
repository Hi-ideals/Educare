
<%@ page import="com.hiideals.instituite.feemanagment.Admissionfee" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'admissionfee.label', default: 'Admissionfee')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-admissionfee" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-admissionfee" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list admissionfee">
			
				<g:if test="${admissionfeeInstance?.iclass}">
				<li class="fieldcontain">
					<span id="iclass-label" class="property-label"><g:message code="admissionfee.iclass.label" default="Iclass" /></span>
					
						<span class="property-value" aria-labelledby="iclass-label"><g:link controller="IClass" action="show" id="${admissionfeeInstance?.iclass?.id}">${admissionfeeInstance?.iclass?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${admissionfeeInstance?.instituite}">
				<li class="fieldcontain">
					<span id="instituite-label" class="property-label"><g:message code="admissionfee.instituite.label" default="Instituite" /></span>
					
						<span class="property-value" aria-labelledby="instituite-label"><g:link controller="instituite" action="show" id="${admissionfeeInstance?.instituite?.id}">${admissionfeeInstance?.instituite?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${admissionfeeInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="admissionfee.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${admissionfeeInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${admissionfeeInstance?.totalAmount}">
				<li class="fieldcontain">
					<span id="totalAmount-label" class="property-label"><g:message code="admissionfee.totalAmount.label" default="Total Amount" /></span>
					
						<span class="property-value" aria-labelledby="totalAmount-label"><g:fieldValue bean="${admissionfeeInstance}" field="totalAmount"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:admissionfeeInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${admissionfeeInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
