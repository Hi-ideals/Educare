<br>
<br>
<g:if test="${staffAttendanceList}">
<div class="portlet box green">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-user"></i>List Of Staff Attendance
		</div>
	</div>
	<div class="portlet-body">
		<div class="table-scrollable">
			<table class="table  table-hover">
	<tr>
		<th>StaffName</th>
		<th>Date</th>
		<th>Status</th>
	</tr>

	<g:each in="${staffAttendanceList?.keySet()}" var="st1" status="k">
		<tr>
			<td>
				${st1?.staffName}
			</td>
			<g:set var="Atendancedates"
				value="${staffAttendanceList.getAt(st1)}"></g:set>
			<g:set var="date" value="1"></g:set>
			<g:set var="adMap" value="[:]"></g:set>
			<g:each in="${staffAttendanceList.getAt(st1).keySet() }" var="att">
				<g:if test="${date.toString() == att.getDate().toString() }">
					<td>
						${att}
					</td>
					<td><g:if test="${Atendancedates.getAt(att)=='P'}">
							<h6>
								<strong style="color: green"> ${Atendancedates.getAt(att)}
								</strong>
							</h6>
						</g:if> <g:else>
							<h6>
								<strong style="color: red"> ${Atendancedates.getAt(att)}
								</strong>
							</h6>
						</g:else></td>
				</g:if>
				<g:else>
					<td>
						${att}
					</td>
					<g:set var="date" value="${Integer.parseInt(date.toString())+1 }"></g:set>
					<td>
						<h6>
							<g:if test="${Atendancedates.getAt(att)=='P'}">
								<strong style="color: green"> ${Atendancedates.getAt(att)}
								</strong>
							</g:if>
							<g:else>
								<strong style="color: red"> ${Atendancedates.getAt(att)}
								</strong>
							</g:else>
						</h6>
					</td>
				</g:else>
				<g:set var="date" value="${Integer.parseInt(date.toString())+1 }"></g:set>
			</g:each>
		</tr>
	</g:each>
</table>
<div class="row">
	<div class="col-xs-6 text-right">
<g:form controller="staffAttendance" action="printattendencestaffdaily"
				target='_blank'>
				<g:hiddenField name="staffID" value="${params?.staffID}" />
				<g:hiddenField name="fromDate" value="${params?.fromDate}" />
				<g:hiddenField name="attendanceType" value="${params?.attendanceType}" />
				<g:hiddenField name="instituteID" value="${params?.instituteID}" />
				<g:hiddenField name="toDate" value="${params?.toDate}" />
				<g:hiddenField name="Search" value="Search" />
				<g:submitButton name="Get Print" />
			</g:form>
</div>
</div>
</div>
</div>
</div>
</g:if>