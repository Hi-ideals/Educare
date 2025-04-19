<%@ page import="com.hiideals.attendanceManagement.StudentAttendance"%>
<%@ page import="com.hiideals.institute.staff.Staff"%>
<div style="display:none;">
<div class="row">
	<div class="col-md-3">
		<div
			class="fieldcontain ${hasErrors(bean: studentAttendanceInstance, field: 'attendanceUpdatedBy', 'error')} ">
			<label for="attendanceUpdatedBy"> <g:message
					code="studentAttendance.attendanceUpdatedBy.label"
					default="Attendance Updated By" />
			</label> <select name="attendanceUpdatedBy" class="form-control"
				disabled id="attendanceUpdatedBy">
				<option value="${attendUpdateBy?.id}">
					${attendUpdateBy?.staffName}
				</option>
			</select>
		</div>
	</div>


	<div class="col-md-3">
		<div
			class="fieldcontain ${hasErrors(bean: studentAttendanceInstance, field: 'attendanceDate', 'error')} required">
			<label for="attendanceDate"> <g:message
					code="studentAttendance.attendanceDate.label"
					default="Attendance Date" /> <span class="required-indicator">*</span>
			</label> <input type="text" name="attendanceDate1" class="form-control"
				disabled id="datepicker1" value="${params?.attendanceDate1}" />
		</div>
	</div>

<div class="col-md-3">
		<div
			class="fieldcontain ${hasErrors(bean: studentAttendanceInstance, field: 'institue', 'error')} required">
			<label for="institue"> <g:message
					code="studentAttendance.institue.label" default="Institue" /> <span
				class="required-indicator">*</span>
			</label> <select name="institue" id="institue" class="form-control"
				disabled>
				<option value="${institue?.id}">
					${institue?.name}
				</option>
			</select>

		</div>
	</div>

	<div class="col-md-3">
		<div
			class="fieldcontain ${hasErrors(bean: studentAttendanceInstance, field: 'staffName', 'error')} required">
			<label for="staffName"> <g:message
					code="studentAttendance.staffName.label" default="Staff Name" /> <span
				class="required-indicator">*</span>
			</label> <select name="staffName" id="staffName" class="form-control"
				disabled>
				<option value="${staffName?.id}">
					${staffName?.staffName}
				</option>
			</select>
		</div>
	</div>
</div>
</div>