<div
	class="fieldcontain ${hasErrors(bean: transportFeeInstance, field: 'student', 'error')} ">
	<label for="student"> <g:message
			code="transportFee.student.label" default="Student" />
	</label> <input type="hidden" id="student" value="student"> <select
		id="student1" name="student.id" class="form-control"
		onchange="${remoteFunction(
			          controller: 'transportFee', 
			          action: 'getFeeDetails',
					  update:'feedetails',
			          params: "\'studentId=\' + this.value+  \'&transportId=\' + document.getElementById('transport').value+  \'&student=\' + document.getElementById('student').value")}">
		<option value="">Select Student</option>
		<g:each in="${students}" class="many-to-one">
			<option value="${it?.id}">
				${it?.studentName}
			</option>
		</g:each>
	</select>
</div>
<div id="Vstudent" style="display: none; color: red;">Select your
	student</div>
