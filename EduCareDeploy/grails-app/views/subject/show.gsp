
<%@ page import="com.hiideals.instituite.classcourses.Subject" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'subject.label', default: 'Subject')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-subject" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-subject" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list subject">
			
				<g:if test="${subjectInstance?.subjectDescription}">
				<li class="fieldcontain">
					<span id="subjectDescription-label" class="property-label"><g:message code="subject.subjectDescription.label" default="Subject Description" /></span>
					
						<span class="property-value" aria-labelledby="subjectDescription-label"><g:fieldValue bean="${subjectInstance}" field="subjectDescription"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${subjectInstance?.institute}">
				<li class="fieldcontain">
					<span id="institute-label" class="property-label"><g:message code="subject.institute.label" default="Institute" /></span>
					
						<span class="property-value" aria-labelledby="institute-label"><g:link controller="instituite" action="show" id="${subjectInstance?.institute?.id}">${subjectInstance?.institute?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${subjectInstance?.subjectName}">
				<li class="fieldcontain">
					<span id="subjectName-label" class="property-label"><g:message code="subject.subjectName.label" default="Subject Name" /></span>
					
						<span class="property-value" aria-labelledby="subjectName-label"><g:fieldValue bean="${subjectInstance}" field="subjectName"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:subjectInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${subjectInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
