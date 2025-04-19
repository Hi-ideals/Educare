<div class="col-md-3" style="display: none">
	<div
		class="fieldcontain ${hasErrors(bean: studentAttendanceInstance, field: 'section', 'error')} ">
		<label for="section"> <g:message
				code="studentAttendance.section.label" default="Student Name" />
		</label> <select name="studentID" class="form-control">
			<option value="All Students">All Students</option>
			<%--<g:each in="${classStudents}" var="student">
				<option value="${student?.id}">
					${student?.studentName}
				</option>
			</g:each>
		--%></select>
	</div>
</div>