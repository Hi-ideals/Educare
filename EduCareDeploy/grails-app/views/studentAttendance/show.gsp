
<%@ page import="com.hiideals.attendanceManagement.StudentAttendance" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'studentAttendance.label', default: 'StudentAttendance')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-studentAttendance" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-studentAttendance" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list studentAttendance">
			
				<g:if test="${studentAttendanceInstance?.leisureClass}">
				<li class="fieldcontain">
					<span id="leisureClass-label" class="property-label"><g:message code="studentAttendance.leisureClass.label" default="Leisure Class" /></span>
					
						<span class="property-value" aria-labelledby="leisureClass-label"><g:fieldValue bean="${studentAttendanceInstance}" field="leisureClass"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentAttendanceInstance?.remarks}">
				<li class="fieldcontain">
					<span id="remarks-label" class="property-label"><g:message code="studentAttendance.remarks.label" default="Remarks" /></span>
					
						<span class="property-value" aria-labelledby="remarks-label"><g:fieldValue bean="${studentAttendanceInstance}" field="remarks"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentAttendanceInstance?.barCode}">
				<li class="fieldcontain">
					<span id="barCode-label" class="property-label"><g:message code="studentAttendance.barCode.label" default="Bar Code" /></span>
					
						<span class="property-value" aria-labelledby="barCode-label"><g:fieldValue bean="${studentAttendanceInstance}" field="barCode"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentAttendanceInstance?.section}">
				<li class="fieldcontain">
					<span id="section-label" class="property-label"><g:message code="studentAttendance.section.label" default="Section" /></span>
					
						<span class="property-value" aria-labelledby="section-label"><g:link controller="section" action="show" id="${studentAttendanceInstance?.section?.id}">${studentAttendanceInstance?.section?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentAttendanceInstance?.attendanceUpdatedBy}">
				<li class="fieldcontain">
					<span id="attendanceUpdatedBy-label" class="property-label"><g:message code="studentAttendance.attendanceUpdatedBy.label" default="Attendance Updated By" /></span>
					
						<span class="property-value" aria-labelledby="attendanceUpdatedBy-label"><g:link controller="staff" action="show" id="${studentAttendanceInstance?.attendanceUpdatedBy?.id}">${studentAttendanceInstance?.attendanceUpdatedBy?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentAttendanceInstance?.attendanceDate}">
				<li class="fieldcontain">
					<span id="attendanceDate-label" class="property-label"><g:message code="studentAttendance.attendanceDate.label" default="Attendance Date" /></span>
					
						<span class="property-value" aria-labelledby="attendanceDate-label"><g:formatDate date="${studentAttendanceInstance?.attendanceDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentAttendanceInstance?.iclass}">
				<li class="fieldcontain">
					<span id="iclass-label" class="property-label"><g:message code="studentAttendance.iclass.label" default="Iclass" /></span>
					
						<span class="property-value" aria-labelledby="iclass-label"><g:link controller="IClass" action="show" id="${studentAttendanceInstance?.iclass?.id}">${studentAttendanceInstance?.iclass?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentAttendanceInstance?.inTime}">
				<li class="fieldcontain">
					<span id="inTime-label" class="property-label"><g:message code="studentAttendance.inTime.label" default="In Time" /></span>
					
						<span class="property-value" aria-labelledby="inTime-label"><g:formatDate date="${studentAttendanceInstance?.inTime}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentAttendanceInstance?.institue}">
				<li class="fieldcontain">
					<span id="institue-label" class="property-label"><g:message code="studentAttendance.institue.label" default="Institue" /></span>
					
						<span class="property-value" aria-labelledby="institue-label"><g:link controller="instituite" action="show" id="${studentAttendanceInstance?.institue?.id}">${studentAttendanceInstance?.institue?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentAttendanceInstance?.staffName}">
				<li class="fieldcontain">
					<span id="staffName-label" class="property-label"><g:message code="studentAttendance.staffName.label" default="Staff Name" /></span>
					
						<span class="property-value" aria-labelledby="staffName-label"><g:link controller="staff" action="show" id="${studentAttendanceInstance?.staffName?.id}">${studentAttendanceInstance?.staffName?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentAttendanceInstance?.status}">
				<li class="fieldcontain">
					<span id="status-label" class="property-label"><g:message code="studentAttendance.status.label" default="Status" /></span>
					
						<span class="property-value" aria-labelledby="status-label"><g:fieldValue bean="${studentAttendanceInstance}" field="status"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentAttendanceInstance?.student}">
				<li class="fieldcontain">
					<span id="student-label" class="property-label"><g:message code="studentAttendance.student.label" default="Student" /></span>
					
						<span class="property-value" aria-labelledby="student-label"><g:link controller="student" action="show" id="${studentAttendanceInstance?.student?.id}">${studentAttendanceInstance?.student?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentAttendanceInstance?.subject}">
				<li class="fieldcontain">
					<span id="subject-label" class="property-label"><g:message code="studentAttendance.subject.label" default="Subject" /></span>
					
						<span class="property-value" aria-labelledby="subject-label"><g:link controller="subject" action="show" id="${studentAttendanceInstance?.subject?.id}">${studentAttendanceInstance?.subject?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:studentAttendanceInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${studentAttendanceInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
