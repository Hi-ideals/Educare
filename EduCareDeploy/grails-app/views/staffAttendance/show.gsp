
<%@ page import="com.hiideals.attendanceManagement.StaffAttendance" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'staffAttendance.label', default: 'StaffAttendance')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-staffAttendance" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-staffAttendance" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list staffAttendance">
			
				<g:if test="${staffAttendanceInstance?.remarks}">
				<li class="fieldcontain">
					<span id="remarks-label" class="property-label"><g:message code="staffAttendance.remarks.label" default="Remarks" /></span>
					
						<span class="property-value" aria-labelledby="remarks-label"><g:fieldValue bean="${staffAttendanceInstance}" field="remarks"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${staffAttendanceInstance?.barCode}">
				<li class="fieldcontain">
					<span id="barCode-label" class="property-label"><g:message code="staffAttendance.barCode.label" default="Bar Code" /></span>
					
						<span class="property-value" aria-labelledby="barCode-label"><g:fieldValue bean="${staffAttendanceInstance}" field="barCode"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${staffAttendanceInstance?.attendanceUpdatedBy}">
				<li class="fieldcontain">
					<span id="attendanceUpdatedBy-label" class="property-label"><g:message code="staffAttendance.attendanceUpdatedBy.label" default="Attendance Updated By" /></span>
					
						<span class="property-value" aria-labelledby="attendanceUpdatedBy-label"><g:link controller="staff" action="show" id="${staffAttendanceInstance?.attendanceUpdatedBy?.id}">${staffAttendanceInstance?.attendanceUpdatedBy?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${staffAttendanceInstance?.attendanceDate}">
				<li class="fieldcontain">
					<span id="attendanceDate-label" class="property-label"><g:message code="staffAttendance.attendanceDate.label" default="Attendance Date" /></span>
					
						<span class="property-value" aria-labelledby="attendanceDate-label"><g:formatDate date="${staffAttendanceInstance?.attendanceDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${staffAttendanceInstance?.inTime}">
				<li class="fieldcontain">
					<span id="inTime-label" class="property-label"><g:message code="staffAttendance.inTime.label" default="In Time" /></span>
					
						<span class="property-value" aria-labelledby="inTime-label"><g:formatDate date="${staffAttendanceInstance?.inTime}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${staffAttendanceInstance?.institue}">
				<li class="fieldcontain">
					<span id="institue-label" class="property-label"><g:message code="staffAttendance.institue.label" default="Institue" /></span>
					
						<span class="property-value" aria-labelledby="institue-label"><g:link controller="instituite" action="show" id="${staffAttendanceInstance?.institue?.id}">${staffAttendanceInstance?.institue?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${staffAttendanceInstance?.staffName}">
				<li class="fieldcontain">
					<span id="staffName-label" class="property-label"><g:message code="staffAttendance.staffName.label" default="Staff Name" /></span>
					
						<span class="property-value" aria-labelledby="staffName-label"><g:link controller="staff" action="show" id="${staffAttendanceInstance?.staffName?.id}">${staffAttendanceInstance?.staffName?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${staffAttendanceInstance?.status}">
				<li class="fieldcontain">
					<span id="status-label" class="property-label"><g:message code="staffAttendance.status.label" default="Status" /></span>
					
						<span class="property-value" aria-labelledby="status-label"><g:fieldValue bean="${staffAttendanceInstance}" field="status"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:staffAttendanceInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${staffAttendanceInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
