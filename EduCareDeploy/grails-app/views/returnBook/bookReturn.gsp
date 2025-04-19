<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'issueDetails.label', default: 'IssueDetails')}" />
		<title><g:message code="default.create.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#create-issueDetails" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="create-issueDetails" class="content scaffold-create" role="main">
			<h1><g:message code="default.create.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<g:hasErrors bean="${issueDetailsInstance}">
			<ul class="errors" role="alert">
				<g:eachError bean="${issueDetailsInstance}" var="error">
				<li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
				</g:eachError>
			</ul>
			</g:hasErrors>
			<g:form url="[resource:issueDetailsInstance, action:'save']" >
				
				
						
				
				
				
				
				
				<%@ page import="com.hiideals.institute.library.IssueDetails"%>
<%@ page import="com.hiideals.instituite.student.Student"%>


<div
	class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'studentId', 'error')} ">
	<label for="studentId"> <g:message
			code="issueDetails.studentId.label" default="Student Id" />

	</label> <select id="studentId" name="studentId.id">

		<option value="${null}">select</option>
		<g:each in="${Student.list()}">
			<option value="${it.id }">
				${it.studentName }
			</option>
		</g:each>
	</select>
</div>

<div
	class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'staffId', 'error')} ">
	<label for="staffId"> <g:message
			code="issueDetails.staffId.label" default="Staff Id" />

	</label> <select id="staffId" name="staffId.id">
		<option value="${null }">select</option>
		<g:each in="${com.hiideals.institute.staff.Staff.list()}">
			<option value="${it.id}">
				${it.staffName}
			</option>

		</g:each>


	</select>
</div>

<div
	class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'booksId', 'error')} ">
	<label for="booksId"> <g:message
			code="issueDetails.booksId.label" default="Books Id" />
	</label> <select name="books" id="books" multiple="multiple"
		class="many-to-many">

		<option>select</option>
		<g:each in="${com.hiideals.institute.library.Books.list()}" var="c">
			<option value="${c.id}">
				${c.title }
			</option>

		</g:each>
	</select>
</div>

<div
	class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'magazineId', 'error')} ">
	<label for="magazineId"> <g:message
			code="issueDetails.newspaper.label" default="magazineId" />

	</label> <select id="magazine" name="magazineId">
		<option></option>
		<g:each in="${com.hiideals.institute.library.Magazine.list()}">
			<option value="${it.id }">
				${it.magazineName }
			</option>
		</g:each>


	</select>
</div>

<div
	class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'newspaper', 'error')} ">
	<label for="newspaper"> <g:message
			code="issueDetails.newspaper.label" default="Newspaper" />

	</label> <select id="newspaper" name="newspaper.id">
		<option></option>
		<g:each in="${com.hiideals.institute.library.Newspaper.list()}">
			<option value="${it.id }">
				${it.name }
			</option>
		</g:each>
	</select>
</div>
	


				
				<fieldset class="buttons">
					<g:submitButton name="ReturnBoook" class="save" value="Return Book" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
