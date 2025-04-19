<%@ page import="com.hiideals.transport.Transport"%>


<div class="form-body">
	<div class="row">
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: transportInstance, field: 'route', 'error')} ">
				<label for="route"> <g:message code="transport.route.label"
						default="Route" />

				</label> <select id="route" class="form-control" name="route.id"
					class="many-to-one">
					<g:if test="${transportInstance?.route}">
						<option value="${transportInstance?.route?.id}">
							From
							${transportInstance?.route?.startPlace} to
							${transportInstance?.route?.stopPlace}, Bus Route No
							${transportInstance?.route?.routeCode}
						</option>
					</g:if>
					<g:else>
						<option value="">select route</option>
					</g:else>
					<g:each in="${rut}">
						<option value="${it?.id}">From
							${it?.startPlace} to
							${it?.stopPlace}, Bus Route No
							${it?.routeCode}
						</option>
					</g:each>
				</select>
			</div>
			<div id="Vroute" style="display: none; color: red;">Select your
				route</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: transportInstance, field: 'destination', 'error')} ">
				<label for="destination"> <g:message
						code="transport.destination.label" default="Destination" />
				</label> <select id="destination" class="form-control" name="destination.id"
					class="many-to-one">
					<g:if test="${transportInstance?.destination}">
						<option value="${transportInstance?.destination?.id}">
							From
							${transportInstance?.destination?.fromPlace} to
							${transportInstance?.destination?.toPlace} -- ${transportInstance?.destination?.acdemicyear?.batchName}
						</option>
					</g:if>
					<g:else>
						<option value="">select student route</option>
					</g:else>
					
					<g:each in="${dst}">
						<option value="${it?.id}">From
							${it?.fromPlace} to
							${it?.toPlace} -- ${it?.acdemicyear?.batchName}
						</option>
					</g:each>
				</select>
			</div>
			<div id="Vdestination" style="display: none; color: red;">Select
				your Destination</div>
		</div>



		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: transportInstance, field: 'startDate', 'error')} ">
				<label for="startDate"> <g:message
						code="transport.startDate.label" default="Start Date" />

				</label> <input name="startDate1" class="form-control date-picker"
					id="startDate1" precision="day"
					value="${formatDate(format:'MM/dd/yyyy',date:transportInstance?.startDate)}"  default="none"
					noSelection="['': '']" />

			</div>
			<div id="VstartDate1" style="display: none; color: red;">Provide
				your startDate</div>
				<div id="VstartDate2" style="display: none; color: red;">Date
				should be this format "mm/dd/yyyy</div>
		</div>

		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: transportInstance, field: 'endDate', 'error')} ">
				<label for="endDate"> <g:message
						code="transport.endDate.label" default="End Date" />

				</label> <input name="endDate1" precision="day" id="endDate1"
					class="form-control date-picker" value="${formatDate(format:'MM/dd/yyyy',date:transportInstance?.endDate)}"  default="none"
					noSelection="['': '']" />

			</div>
			<div id="VendDate1" style="display: none; color: red;">Provide
				your End Date</div>
				<div id="VendDate2" style="display: none; color: red;">Date
				should be this format "mm/dd/yyyy</div>
		</div>
	</div>
</div>
<div class="form-body">
	<div class="row">
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: transportInstance, field: 'type', 'error')} required">
				<label for="type"> <g:message code="transport.type.label"
						default="Type" /> <span class="required-indicator">*</span>
				</label> <select name="type" class="form-control" id="type"
					onchange="func(this.value)">
					<option value="">Select type</option>
					<g:each in="${transportInstance.constraints.type.inList}">
						<option value="${it}">
							${it}
						</option>
					</g:each>
				</select>

			</div>
			<div id="Vtype" style="display: none; color: red;">Select your
				type</div>
		</div>
		<div id="Returntype" hidden="true">
			<div class="col-md-3">
				<div
					class="fieldcontain ${hasErrors(bean: transportInstance, field: 'student', 'error')} ">
					<label for="student"> <g:message
							code="transport.student.label" default="Classes" />

					</label> <select id="classes" name="classes" class="form-control"
						onchange="${remoteFunction(
			          controller: 'transport', 
			          action: 'getSections',
					  update:'sec',
			          params: "\'value=\' + this.value")}">
						<option value="">Select classes</option>
						<g:each in="${classes}">
							<option value="${it?.id}">
								${it?.classname}
							</option>
						</g:each>
					</select>

				</div>
				<div id="Vclasses" style="display: none; color: red;">Select
					your classes</div>
			</div>
			<div id="sec">
			<g:render template="sections"></g:render>
			</div>
			<div id="stu">
			<g:render template="students"></g:render>
			</div>

		</div>
	</div>
</div>
<div id="Returntype1" hidden="true">
	<div class="form-body">
		<div class="row">
			<div class="col-md-3">
				<div
					class="fieldcontain ${hasErrors(bean: transportInstance, field: 'employee', 'error')} ">
					<label for="employee"> <g:message
							code="transport.employee.label" default="Employee" />
					</label> <select id="employee" name="employee.id" class="form-control">
						<option value="">Select classes</option>
						<g:each in="${com.hiideals.institute.staff.Staff.list()}">
							<option value="${it?.id}">
								${it?.staffName}
							</option>
						</g:each>
					</select>

				</div>
				<div id="Vemployee" style="display: none; color: red;">Select
					your Employee</div>
			</div>
		</div>
	</div>
</div>
<%--<script>--%>
<%--	function func(va) {--%>
<%--		if (va == 'Student') {--%>
<%--			document.getElementById('cls').style.display = "block"--%>
<%--			document.getElementById('sec').style.display = "block"--%>
<%--			document.getElementById('stu').style.display = "block"--%>
<%--			document.getElementById('emp').style.display = "none"--%>
<%--		} else {--%>
<%--			document.getElementById('cls').style.display = "none"--%>
<%--			document.getElementById('sec').style.display = "none"--%>
<%--			document.getElementById('stu').style.display = "none"--%>
<%--			document.getElementById('emp').style.display = "block"--%>
<%--		}--%>
<%--	}--%>
<%--</script>--%>
