<%@ page import="com.hiideals.exams.Marks"%>
<%@ page import="com.hiideals.exams.Exam"%>
<%@ page import="com.hiideals.instituite.classcourses.IClass"%>
<div class="form-body">
	<div class="row">
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: examDetailsInstance, field: 'year', 'error')} required">
				<label for="year"> <g:message code="examDetails.year.label"
						default="Year" /> <span class="required-indicator">*</span>
				</label> <select id="year" name="year.id" class="form-control">
					<option value="">Select Year</option>
					<g:each in="${batchList}" var="batch">
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
			<div
				class="fieldcontain ${hasErrors(bean: examDetailsInstance, field: 'year', 'error')} required">
				<label for="ExamName"> Exam Name* </label> <select id="exam"
					name="exam.id" class="form-control">
					<option value="">Select ExamName</option>
					<g:each in="${Exam.findAllByInstitute(instituite)}" var="exam">
						<option value="${exam?.id}">
							${exam?.examName}
						</option>
					</g:each>
				</select>

			</div>
			<div id="Eexam" style="display: none; color: red">Select your
				exam</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: examDetailsInstance, field: 'iclass', 'error')} required">
				<label for="iclass"> <g:message
						code="examDetails.iclass.label" default="Iclass" /> <span
					class="required-indicator">*</span>
				</label> <select id="iclass" name="iclass.id" class="form-control"
					onchange="${remoteFunction(
			          controller: 'marks', 
			          action: 'getExamDetails',
					  update:'subjects',
			         params: "\'iclass=\' + this.value +  \'&examId=\' + document.getElementById('exam').value+ \'&yearId=\' + document.getElementById('year').value ")};${remoteFunction(
			          controller: 'marks', 
			          action: 'getStudents',
					  update:'getStudents',
			         params: "\'iclass=\' + this.value +  \'&examId=\' + document.getElementById('exam').value+ \'&yearId=\' + document.getElementById('year').value ")}">
					<option value="">Select Class</option>
					<g:each in="${IClass.findAllByInstituite(instituite)}" var="iclass">
						<option value="${iclass?.id}">
							${iclass?.classname}
						</option>
					</g:each>
				</select>
			</div>
			<div id="Eiclass" style="display: none; color: red">Select your
				class</div>
		</div>
	</div>

</div>

<div id="getStudents">
	<g:render template="students" />
</div>


<div id="subjects">
	<g:render template="marksList"></g:render>
</div>
