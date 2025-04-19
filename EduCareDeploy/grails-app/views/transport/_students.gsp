
<div class="col-md-3">
	<div
		class="fieldcontain ${hasErrors(bean: transportInstance, field: 'student', 'error')} ">
		<label for="student"> <g:message
				code="transport.student.label" default="Student" />

		</label> <select id="student" name="student.id" class="form-control">
			<option value="">Select Students</option>
			<g:each in="${students}">
				<option value="${it?.id}">
					${it?.studentName}
				</option>
			</g:each>
		</select>

	</div>
	<div id="Vstudent" style="display: none; color: red;">Select your
		Student</div>
</div>