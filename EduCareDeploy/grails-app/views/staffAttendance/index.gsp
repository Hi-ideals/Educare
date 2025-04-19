
<%@ page import="com.hiideals.attendanceManagement.StaffAttendance" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'staffAttendance.label', default: 'StaffAttendance')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-staffAttendance" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-staffAttendance" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="remarks" title="${message(code: 'staffAttendance.remarks.label', default: 'Remarks')}" />
					
						<g:sortableColumn property="barCode" title="${message(code: 'staffAttendance.barCode.label', default: 'Bar Code')}" />
					
						<th><g:message code="staffAttendance.attendanceUpdatedBy.label" default="Attendance Updated By" /></th>
					
						<g:sortableColumn property="attendanceDate" title="${message(code: 'staffAttendance.attendanceDate.label', default: 'Attendance Date')}" />
					
						<g:sortableColumn property="inTime" title="${message(code: 'staffAttendance.inTime.label', default: 'In Time')}" />
					
						<th><g:message code="staffAttendance.institue.label" default="Institue" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${staffAttendanceInstanceList}" status="i" var="staffAttendanceInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${staffAttendanceInstance.id}">${fieldValue(bean: staffAttendanceInstance, field: "remarks")}</g:link></td>
					
						<td>${fieldValue(bean: staffAttendanceInstance, field: "barCode")}</td>
					
						<td>${fieldValue(bean: staffAttendanceInstance, field: "attendanceUpdatedBy")}</td>
					
						<td><g:formatDate date="${staffAttendanceInstance.attendanceDate}" /></td>
					
						<td><g:formatDate date="${staffAttendanceInstance.inTime}" /></td>
					
						<td>${fieldValue(bean: staffAttendanceInstance, field: "institue")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
		
			<div class="container" style="text-align: center;">
						<ul class="pagination">
							<li><g:paginate total="${staffAttendanceInstanceCount ?: 0}" /></li>
						</ul>
					</div>
			
		</div>
	</body>
</html>
