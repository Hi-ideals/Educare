<%@ page import="com.hiideals.instituite.classcourses.Courses" %>


<div class="form-body">
	<div class="row">
		<div class="col-md-4">
			<div class="form-group form-md-line-input form-md-floating-label">
<div class="fieldcontain ${hasErrors(bean: coursesInstance, field: 'courseDescription', 'error')} required">
	<g:textField name="courseDescription" class="form-control" required="" value="${coursesInstance?.courseDescription}"/>
	<label for="courseDescription">
		<g:message code="courses.courseDescription.label" default="Course Description" />
		<span class="required-indicator">*</span>
	</label>

</div>
</div>
</div>
<div class="col-md-4">
<div class="form-group form-md-line-input form-md-floating-label">
<div class="fieldcontain ${hasErrors(bean: coursesInstance, field: 'courseName', 'error')} required">
	<g:textField name="courseName" class="form-control"  required="" value="${coursesInstance?.courseName}"/>
	<label for="courseName">
		<g:message code="courses.courseName.label" default="Course Name" />
		<span class="required-indicator">*</span>
	</label>

</div>
</div>
</div>

<div class="col-md-4">
<div class="form-group form-md-line-input form-md-floating-label">
<div class="fieldcontain ${hasErrors(bean: coursesInstance, field: 'instituite', 'error')} required">
	<g:select id="instituite" class="form-control"  name="instituite.id" from="${com.hiideals.instituite.main.Instituite.list()}" optionKey="id" required="" value="${coursesInstance?.instituite?.id}" class="many-to-one"/>
	<label for="instituite">
		<g:message code="courses.instituite.label" default="Instituite" />
		<span class="required-indicator">*</span>
	</label>

</div>
</div>
</div>
</div>
</div>

