
<%@ page import="com.hiideals.attendanceManagement.StudentAttendance" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'studentAttendance.label', default: 'StudentAttendance')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-studentAttendance" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-studentAttendance" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="leisureClass" title="${message(code: 'studentAttendance.leisureClass.label', default: 'Leisure Class')}" />
					
						<g:sortableColumn property="remarks" title="${message(code: 'studentAttendance.remarks.label', default: 'Remarks')}" />
					
						<g:sortableColumn property="barCode" title="${message(code: 'studentAttendance.barCode.label', default: 'Bar Code')}" />
					
						<th><g:message code="studentAttendance.section.label" default="Section" /></th>
					
						<th><g:message code="studentAttendance.attendanceUpdatedBy.label" default="Attendance Updated By" /></th>
					
						<g:sortableColumn property="attendanceDate" title="${message(code: 'studentAttendance.attendanceDate.label', default: 'Attendance Date')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${studentAttendanceInstanceList}" status="i" var="studentAttendanceInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${studentAttendanceInstance.id}">${fieldValue(bean: studentAttendanceInstance, field: "leisureClass")}</g:link></td>
					
						<td>${fieldValue(bean: studentAttendanceInstance, field: "remarks")}</td>
					
						<td>${fieldValue(bean: studentAttendanceInstance, field: "barCode")}</td>
					
						<td>${fieldValue(bean: studentAttendanceInstance, field: "section")}</td>
					
						<td>${fieldValue(bean: studentAttendanceInstance, field: "attendanceUpdatedBy")}</td>
					
						<td><g:formatDate date="${studentAttendanceInstance.attendanceDate}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div style="text-align: center;">
						<ul class="pagination">
							<li><g:paginate total="${studentAttendanceInstanceCount ?: 0}" /></li>
						</ul>
					</div>
		</div>
	</body>
</html>
