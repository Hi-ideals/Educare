<%@ page import="com.hiideals.exams.ExamDetails"%>
<%@ page import="com.hiideals.instituite.classcourses.IClass"%>
<%@ page import="com.hiideals.instituite.helper.Batch"%>
<%@ page import="com.hiideals.exams.Exam"%>

<div class="form-body">
	<div class="row">
		<div class="col-md-3">

			<div
				class="fieldcontain ${hasErrors(bean: examDetailsInstance, field: 'iclass', 'error')} required">
				<label for="iclass"> <g:message
						code="examDetails.iclass.label" default="class" /> <span
					class="required-indicator">*</span>
				</label> <select id="iclass" name="iclass.id" class="form-control"
					onchange="${remoteFunction(
			          controller: 'examDetails', 
			          action: 'getSubjects',
					  update:'subjects',
			          params: "\'value=\' + this.value")}">
					<option value="">Select Class</option>
					<g:each in="${IClass.findAllByInstituite(instituite)}"
						var="iclass">
						<option value="${iclass?.id}">
							${iclass?.classname}
						</option>
					</g:each>
				</select>
			</div>
			<div id="Eiclass" style="display: none; color: red">Select your
				class</div>
		</div>

		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: examDetailsInstance, field: 'year', 'error')} required">
				<label for="year"> <g:message code="examDetails.year.label"
						default="Year" /> <span class="required-indicator">*</span>
				</label> <select id="year" name="year.id" class="form-control">
					<option value="">Select Year</option>
					<g:each in="${batchList}"
						var="batch">
						<option value="${batch?.id}">
							${batch?.batchName}
						</option>
					</g:each>
				</select>
			</div>
			<div id="Eyear" style="display: none; color: red">Select your
				year</div>
		</div>

		<div class="col-md-3">
			<div class="fieldcontain  required">
				<label for="ExamName">Exam Name* </label> <select id="exam"
					name="exam.id" class="form-control">
					<option value="">Select exam</option>
					<g:each in="${exams}" var="exam">
						<option value="${exam?.id}">
							${exam?.examName}
						</option>
					</g:each>
				</select>

			</div>
			<div id="Eexam" style="display: none; color: red">Select your
				exam name</div>

		</div>
	</div>
</div>
<br>
<br>
<br>
<div id="subjects">
	<g:render template="classSubjects"></g:render>
</div>





