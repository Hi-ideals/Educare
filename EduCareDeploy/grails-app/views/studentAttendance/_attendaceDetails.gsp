
<div class="form-body">
	<div class="row">
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: studentAttendanceInstance, field: 'section', 'error')} ">
				<label for="section"> <g:message
						code="studentAttendance.section.label" default="Class" />
				</label> <select class="form-control" name="classID"
					onchange="${remoteFunction(controller:'student',action: 'classSections',
                       update: 'updateclasssection',
                       params: '\'classId=\' + this.value')}">
					<option>Select Class</option>
					<g:each in="${classes}" var="cls">
						<option value="${cls?.id}">
							${cls?.classname}
						</option>
					</g:each>
				</select>

			</div>
		</div>
		<div id="updateclasssection">
			<g:render template="classSections"></g:render>
		</div>


		<div id="updateclassstudent">
			<g:render template="classStudent"></g:render>
		</div>

		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: studentAttendanceInstance, field: 'section', 'error')} ">
				<label for="section"> <g:message
						code="studentAttendance.section.label"
						default="Attendance Report Type" />
				</label>
				<fieldset>
					<select name="attendanceType" class="form-control"
						id="attendanceType" onchange="myfunction()">
						<option>select type</option>
						<option value="Daily">Daily</option>
						<option value="Monthly">Monthly</option>
					</select>
				</fieldset>
			</div>
		</div>

		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: studentAttendanceInstance, field: 'section', 'error')} ">
				<label id="labelvalue">From date</label> <input type="text" name="fromDate"
					id="datepicker" class="form-control date-picker" />
			</div>
		</div>
	</div>

	<div class="form-body">
		<div class="row">
			<div class="col-md-3">
				<div
					class="fieldcontain ${hasErrors(bean: studentAttendanceInstance, field: 'section', 'error')} "
					id="todatepicker1">
					<label for="section"> <g:message
							code="studentAttendance.section.label" default="To Date" />
					</label> <input type="text" id="datepicker1" name="toDate"
						class="form-control date-picker"  />
				</div>
			</div>
		</div>

	</div>
</div>
<br>
<input type="hidden" name="secId" value="" id="dd">
<div
	class="fieldcontain ${hasErrors(bean: studentAttendanceInstance, field: 'section', 'error')} ">
	<fieldset align="center">
		<g:submitButton onclick="myfunction()" class="btn btn-success btn blue" name="Get Student Details" />
	</fieldset>
</div>

<script>


function myfunction(){

var value=document.getElementById('attendanceType').value
document.getElementById('dd').value=document.getElementById('section').value

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
