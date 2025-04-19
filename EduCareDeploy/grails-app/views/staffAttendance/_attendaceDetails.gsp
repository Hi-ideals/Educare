<div class="form-body">
	<div class="row">
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: studentAttendanceInstance, field: 'section', 'error')} ">
				<label for="section"> <g:message
						code="studentAttendance.section.label" default="Staff Name" />
				</label> <select name="staffID" class="form-control">
					<option value='All staff'>All staff</option>
					<g:each in="${staffs}" var="staff">
						<option value="${staff?.id}">
							${staff?.staffName}
						</option>
					</g:each>
				</select>
			</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: studentAttendanceInstance, field: 'section', 'error')} " >
				<label for="section"> <g:message
						code="studentAttendance.section.label"
						default="Attendance Report Type" />
				</label>
				<fieldset>
					<select name="attendanceType" class="form-control" id="attendanceType" onchange="myfunction()">
					    <option value="null">Select Type</option>
						<option value="Daily">Daily</option>
						<option value="Monthly">Monthly</option>
					</select>
				</fieldset>
			</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: studentAttendanceInstance, field: 'section', 'error')} ">
				<label id="labelvalue" for="section"> <g:message
						code="studentAttendance.section.label" default="From Date" />
				</label> <input type="text" name="fromDate" id="datepicker"
					class="form-control date-picker" " />
			</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: studentAttendanceInstance, field: 'section', 'error')} " id="todatepicker1">
				<label for="section"> <g:message
						code="studentAttendance.section.label" default="To Date" />
				</label> <input type="text" id="datepicker1" name="toDate"
					class="form-control date-picker"  />
			</div>
		</div>
	</div>
	<div class="form-body">
		<div class="row">
			<div class="col-md-3">
				<div
					class="fieldcontain ${hasErrors(bean: studentAttendanceInstance, field: 'section', 'error')} ">
					<fieldset>
						<g:submitButton class="btn btn-success btn blue" name="Get Staff Details" />
					</fieldset>
				</div>
			</div>
		</div>
	</div>
</div>
<script>

function myfunction(){

	var value=document.getElementById('attendanceType').value
		if(value=='Daily'){
			document.getElementById('todatepicker1').style.display='none'
			document.getElementById('labelvalue').innerHTML='Attendance Date'
			}

			if(value=='Monthly')	{
				document.getElementById('labelvalue').innerHTML='From Date'
				document.getElementById('todatepicker1').style.display='block'
				}
		
	}

</script>