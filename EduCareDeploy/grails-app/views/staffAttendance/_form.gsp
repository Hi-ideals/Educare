<%@ page import="com.hiideals.attendanceManagement.StaffAttendance"%>

<div class="row">
	<div class="col-md-4">
		<div
			class="fieldcontain ${hasErrors(bean: staffAttendanceInstance, field: 'attendanceUpdatedBy', 'error')} ">
			<label for="attendanceUpdatedBy"> <g:message
					code="staffAttendance.attendanceUpdatedBy.label"
					default="Attendance Updated By" />

			</label>
	
				<select name="attendanceUpdatedBy" id="attendanceUpdatedBy"  class="form-control" required="required">
				<option value="">select staff</option>
				<g:each in="${staffs}" var="staff">
				<option value="${staff?.id}">${staff?.staffName}</option>
				</g:each>
				
				</select>
				
				
		</div>
	</div>
	<div class="col-md-4">
		<div
			class="fieldcontain ${hasErrors(bean: staffAttendanceInstance, field: 'attendanceDate', 'error')} required">
			<label for="attendanceDate"> <g:message
					code="staffAttendance.attendanceDate.label"
					default="Attendance Date" /> <span class="required-indicator">*</span>
			</label> <input class="form-control date-picker"  type="text" name="attendanceDate1" required="required"
				id="datepicker" value="${staffAttendanceInstance?.attendanceDate}" />
		</div>
	</div>
	<div class="col-md-4">
		<div
			class="fieldcontain ${hasErrors(bean: staffAttendanceInstance, field: 'staffName', 'error')} required">
			<label for="staffName"> <g:message
					code="staffAttendance.staffName.label" default="Staff Name" /> <span
				class="required-indicator">*</span>
			</label>
				 
				<select name="staffName" id="staffName" class="form-control" required="required">
				<option value="">select staff</option>
				<g:each in="${staffs}" var="staff"  >
				<option value="${staff?.id}">${staff?.staffName}</option>
				</g:each>
				
				</select>
		</div>
	</div>
</div>


