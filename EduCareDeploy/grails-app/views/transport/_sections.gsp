<div class="col-md-3">
	<div
		class="fieldcontain ${hasErrors(bean: transportInstance, field: 'student', 'error')} ">
		<label for="student"> <g:message
				code="transport.student.label" default="Sections" />

		</label> <select id="section" name="section" class="form-control"
			onchange="${remoteFunction(
			          controller: 'transport', 
			          action: 'getStudents',
					  update:'stu',
			          params: "\'sec=\' + this.value+  \'&cls=\' + document.getElementById('classes').value")}">
			<option value="">Select Section</option>
			<g:each in="${sections}">
				<option value="${it?.id}">
					${it?.sectionName}
				</option>
			</g:each>
		</select>
	</div>
	<div id="Vsection" style="display: none; color: red;">Select your
		Sections</div>
</div>