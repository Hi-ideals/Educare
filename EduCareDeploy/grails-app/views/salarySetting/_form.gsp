<%@ page import="com.hiideals.institute.payroll.SalarySetting"%>


<div class="form-body">
	<div class="row">
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: salarySettingInstance, field: 'type', 'error')} required">
				<label for="type"> <g:message
						code="salarySetting.type.label" default="Type" /> <span
					class="required-indicator">*</span>
				</label>
				<g:select name="type" class="form-control"
					from="${salarySettingInstance.constraints.type.inList}" required=""
					value="${salarySettingInstance?.type}"
					valueMessagePrefix="salarySetting.type" />

			</div>
		</div>

		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: salarySettingInstance, field: 'staff', 'error')} required">
				<label for="staff"> <g:message
						code="salarySetting.staff.label" default="Staff" /> <span
					class="required-indicator">*</span>
				</label> <select name="staff.id" id="staff" class="form-control">
					<option value="">Select Staff</option>
					<g:each in="${staffs}"
						var="staffName">
						<option value="${staffName?.id}">
							${staffName?.staffName}
						</option>
					</g:each>
				</select>
				<%--<g:select id="staff" name="staff.id" from="${com.hiideals.institute.staff.Staff.list()}" optionKey="id" required="" value="${salarySettingInstance?.staff?.id}" class="many-to-one"/>

--%>
			</div>
			<div id="Pstaff" style="display: none; color: red;">Select your
				Staff</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: salarySettingInstance, field: 'payhead', 'error')} required">
				<label for="payhead"> <g:message
						code="salarySetting.payhead.label" default="Payhead" /> <span
					class="required-indicator">*</span>
				</label> <select name="payhead.id" id="payhead" class="form-control">
					<option value="">Select Pay Head</option>
					<g:each in="${payheadlist}"
						var="payhead">
						<option value="${payhead?.id}">
							${payhead?.payHeadName}
						</option>
					</g:each>
				</select>
				<%--<g:select id="payhead" name="payhead.id" from="${com.hiideals.institute.payroll.PayHead.list()}" optionKey="id" required="" value="${salarySettingInstance?.payhead?.id}" class="many-to-one"/>

--%>
			</div>
			<div id="Ppayhead" style="display: none; color: red;">Select
				your payhead</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: salarySettingInstance, field: 'aunit', 'error')} required">
				<label for="aunit"> <g:message
						code="salarySetting.unit.label" default="Unit" /> <span
					class="required-indicator">*</span>
				</label>

				<g:field name="aunit" type="number" id="aunit" class="form-control"
					value="${salarySettingInstance.aunit}" required="" />

			</div>
			<div id="Paunit" style="display: none; color: red">Provide your
				Unit Number</div>
			<div id="Paunit1" style="display: none; color: red">Unit should
				be allowed only number</div>
		</div>
	</div>
</div>

