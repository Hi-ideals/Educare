<br>
<br>
<g:if test="${studentAttendanceList}">
<div class="portlet box green">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-user"></i>List Of Daily Student Attendance
		</div>
	</div>
	<div class="portlet-body">
		<div class="table-scrollable">
			<table class="table  table-hover">
	<tr>
		<th>StudentName</th>
		<th>Date</th>
		<th>Status</th>
	</tr>
	<g:each in="${studentAttendanceList?.keySet()}" var="st1" status="k">
		<tr>
			<td>
				${st1?.studentName}
			</td>
			<g:set var="Atendancedates"
				value="${studentAttendanceList.getAt(st1)}"></g:set>
			<g:set var="date" value="1"></g:set>
			<g:set var="adMap" value="[:]"></g:set>
			<g:each in="${studentAttendanceList.getAt(st1).keySet() }" var="att">
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
</div>
<!--Invoice Footer-->
<div class="row">
	<div class="col-xs-6 text-right">
<g:form controller="studentAttendance" action="printattendencedaily"
				target='_blank'>
				
				<g:hiddenField name="classID" value="${params?.classID}" />
				<g:hiddenField name="section" value="${params?.secId}" />
				<g:hiddenField name="secId" value="${params?.secId}" />
				<g:hiddenField name="studentID" value="All Students" />
				<g:hiddenField name="academicyear[0].section.id" value="${params?.secId}" />
				<g:hiddenField name="attendanceType" value="${params?.attendanceType}" />
				<g:hiddenField name="fromDate" value="${params?.fromDate}" />
				<g:hiddenField name="Search" value="Search" />
				<g:submitButton name="Get Print" />
			</g:form>
</div>
</div>
</div>
</g:if>
