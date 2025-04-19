
<div
	class="fieldcontain ${hasErrors(bean: transportFeeInstance, field: 'student', 'error')} ">
	<label for="staff"> <g:message
			code="transportFee.student.label" default="Staff" />
	</label> <input type="hidden" id="staff" value="staff"> <select
		id="employee" name="employee.id" class="form-control"
		onchange="${remoteFunction(
			          controller: 'transportFee', 
			          action: 'getFeeDetails',
					  update:'feedetails',
			          params: "\'staffId=\' + this.value+  \'&transportId=\' + document.getElementById('transport').value+  \'&staff=\' + document.getElementById('staff').value")}">
		<option value="">Select Staff</option>
		<g:each in="${staffs}" class="many-to-one">
			<option value="${it?.id}">
				${it?.staffName}
			</option>
		</g:each>
	</select>
</div>
<div id="Vstaff" style="display: none; color: red;">Select your
	staff</div>
