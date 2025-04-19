
<%@ page import="com.hiideals.instituite.helper.Batch" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'batch.label', default: 'Batch')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-batch" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-batch" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list batch">
			
				<g:if test="${batchInstance?.description}">
				<li class="fieldcontain">
					<span id="description-label" class="property-label"><g:message code="batch.description.label" default="Description" /></span>
					
						<span class="property-value" aria-labelledby="description-label"><g:fieldValue bean="${batchInstance}" field="description"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${batchInstance?.batchName}">
				<li class="fieldcontain">
					<span id="batchName-label" class="property-label"><g:message code="batch.batchName.label" default="Batch Name" /></span>
					
						<span class="property-value" aria-labelledby="batchName-label"><g:fieldValue bean="${batchInstance}" field="batchName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${batchInstance?.batchfrom}">
				<li class="fieldcontain">
					<span id="from-label" class="property-label"><g:message code="batch.batchfrom.label" default="From" /></span>
					
						<span class="property-value" aria-labelledby="from-label"><g:formatDate date="${batchInstance?.batchfrom}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${batchInstance?.institute}">
				<li class="fieldcontain">
					<span id="institute-label" class="property-label"><g:message code="batch.institute.label" default="Institute" /></span>
					
						<span class="property-value" aria-labelledby="institute-label"><g:link controller="instituite" action="show" id="${batchInstance?.institute?.id}">${batchInstance?.institute?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${batchInstance?.batchto}">
				<li class="fieldcontain">
					<span id="to-label" class="property-label"><g:message code="batch.batchto.label" default="To" /></span>
					
						<span class="property-value" aria-labelledby="batchto-label"><g:formatDate date="${batchInstance?.batchto}" /></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:batchInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${batchInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
