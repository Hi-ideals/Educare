<div class="row">
	<div class="col-md-3">
		<div
			class="fieldcontain ${hasErrors(bean: marksInstance, field: 'student', 'error')} required">
			<label for="student">student* </label> <select id="student"
				name="student.id" class="form-control">
				<option value="">select</option>
				<g:each in="${students}">
					<option value="${it?.id}">
						${it?.studentName}
					</option>
				</g:each>
			</select>
		</div>
		<div id="Estudent" style="display: none; color: red">Select your
			student</div>
	</div>
</div>