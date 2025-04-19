<%@ page import="com.hiideals.exams.Exam" %>



<div class="row">


<div class="fieldcontain ${hasErrors(bean: examInstance, field: 'examDetails', 'error')} " style="display: none">
	<label for="examDetails">
		<g:message code="exam.examDetails.label" default="Exam Details" />
		
	</label>
	<g:select name="examDetails"  class="form-control" from="${com.hiideals.exams.ExamDetails.list()}" multiple="multiple" optionKey="id" size="5" value="${examInstance?.examDetails*.id}" class="many-to-many"/>

</div>
</div>

<div class="col-md-3">
<div class="fieldcontain ${hasErrors(bean: examInstance, field: 'examName', 'error')} required">
	<label for="exam Name">
		ExamName*
	</label>
	<g:textField name="examName"  class="form-control"required="" id="examName" value="${examInstance?.examName}"/>
</div>
	<div id="EexamName" style="display: none; color: red">Provide
				your ExamName Name</div>
</div>
