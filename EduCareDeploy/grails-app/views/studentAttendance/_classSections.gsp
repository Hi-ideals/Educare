<div class="col-md-3">
		<div
			class="fieldcontain ${hasErrors(bean: studentAttendanceInstance, field: 'section', 'error')} ">
			<label for="section"> <g:message
					code="studentAttendance.section.label" default="Section" />

			</label>
				<select name="section" id="section" class="form-control">
				<option>Select Section</option>
				<g:each in="${sections}" var="section">
				<option value="${section?.id}">${section?.sectionName}</option>
				</g:each>
				</select>
		</div>
	</div>
