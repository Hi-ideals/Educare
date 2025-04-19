
<div class="col-md-3">
	<div
		class="fieldcontain ${hasErrors(bean: staffSalaryInstance, field: 'staff', 'error')} required">
		<label for="staff"> <g:message code="staffSalary.staff.label"
				default="Staff" /> <span class="required-indicator">*</span>
		</label> <select name="staff.id" id="staff" class="form-control"
			required="required" class="many-to-one"
			onchange="${remoteFunction(controller:'staffSalary',action: 'getpayhead',
                       update: 'updatepayhead',
                       params: '\'staffId=\' + this.value')};">
			<option value="">Select Staff</option>
			<g:each in="${stfflist}" var="staffName">
				<option value="${staffName?.id}">
					${staffName?.staffName}
				</option>
			</g:each>
		</select>
		<%--<g:select id="staff" name="staff.id" from="${com.hiideals.institute.staff.Staff.list()}" optionKey="id" required="" value="${staffSalaryInstance?.staff?.id}" class="many-to-one"/>

--%>
	</div>
	<div id="Sstaff" style="display: none; color: red;">Select your
		Staff</div>
</div>