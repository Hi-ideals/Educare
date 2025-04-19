<%@ page import="com.hiideals.attendanceManagement.StudentAttendance"%>
<%@ page import="com.hiideals.institute.staff.Staff"%>


<div class="form-body">
	<div class="row">
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: studentAttendanceInstance, field: 'iclass', 'error')} required">
				<label for="iclass"> <g:message
						code="studentAttendance.iclass.label" default="Class" /> <span
					class="required-indicator">*</span>
				</label> <select name="iclass" id="iclass" class="form-control"
					required="required"
					onchange="${remoteFunction(controller:'studentAttendance',action: 'classSections',
                       update: 'updateSections',
                       params: '\'classId=\' + this.value')}">
					<option value="">Select Class</option>
					<g:each in="${classes}" var="iclassss">
						<option value="${iclassss?.id}">
							${iclassss?.classname}
						</option>
					</g:each>
				</select>
			</div>
		</div>

		<div id="updateSections">
			<g:render template="classSections"></g:render>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: studentAttendanceInstance, field: 'attendanceUpdatedBy', 'error')} ">
				<label for="attendanceUpdatedBy"> <g:message
						code="studentAttendance.attendanceUpdatedBy.label"
						default="Attendance Updated By" />

				</label> <select name="attendanceUpdatedBy" class="form-control"
					required="required" id="attendanceUpdatedBy">

					<option value="">Select Staff</option>
					<g:each in="${staffs}" var="attendanceUpdatedBy">
						<option value="${attendanceUpdatedBy.id}">
							${attendanceUpdatedBy?.staffName}
						</option>
					</g:each>
				</select>
			</div>
		</div>


		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: studentAttendanceInstance, field: 'attendanceDate', 'error')} required">
				<label for="attendanceDate"> <g:message
						code="studentAttendance.attendanceDate.label"
						default="Attendance Date" /> <span class="required-indicator">*</span>
				</label> <input type="text" name="attendanceDate1" class="form-control date-picker" 
					required="required" id="datepicker1"
					value="${studentAttendanceInstance?.attendanceDate}" />
			</div>
		</div>
	</div>
</div>
<div class="form-body">
	<div class="row">
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: studentAttendanceInstance, field: 'staffName', 'error')} required">
				<label for="staffName"> <g:message
						code="studentAttendance.staffName.label" default="Staff Name" />
					<span class="required-indicator">*</span>
				</label> <select name="staffName" id="staffName" class="form-control"
					required="required">
					<option value="">Select Staff</option>
					<g:each in="${staffs}" var="staffName">
						<option value="${staffName?.id}">
							${staffName?.staffName}
						</option>
					</g:each>
				</select>
			</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: studentAttendanceInstance, field: 'subject', 'error')} required">
				<label for="subject"> <g:message
						code="studentAttendance.subject.label" default="Subject" /> <span
					class="required-indicator">*</span>
				</label> <select name="subject" id="subject" class="form-control"
					required="required">
					<option value="">Select Subject</option>
					<g:each in="${subjects}" var="subject">
						<option value="${subject?.id}">
							${subject?.subjectName}
						</option>
					</g:each>
				</select>
			</div>
		</div>
	</div>
</div>




