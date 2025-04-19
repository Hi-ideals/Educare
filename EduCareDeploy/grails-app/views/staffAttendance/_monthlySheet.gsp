
<%@page import="java.lang.Integer"%>
<g:if test="${staffList}">
	<table class="table table-bordered" id="my_table">
		<thead>

			<tr>
				<td style="text-align: center;">Students <i
					class="entypo-down-thin"></i> | Date <i class="entypo-right-thin"></i>
				</td>
				<g:each in="${(1..31).toList()}" var="count1">
					<td style="text-align: center;">
						${count1}
					</td>
				</g:each>
				<td>Total Class</td>
				<td>Attended Class</td>
				<td>Not Attended Class</td>
			</tr>

		</thead>
		<tbody>
		
			<g:each in="${staffattendence?.keySet()}" var="st1" status="k">
				<tr>
				 <g:set var="total" value="0"></g:set>
		<g:set var="present" value="0"></g:set>
		<g:set var="absent" value="0"></g:set>
					<td style="text-align: center;">
						${st1?.staffName}
					</td>
					<g:each in="${staffattendence.get(st1).keySet()}" var="dates"
						status="n">
						<td><g:if test="${staffattendence.get(st1).get(dates)=='P'}">
								<strong style="color: green"> ${staffattendence.get(st1).get(dates)}
								</strong>
							<input type="hidden" value="${total++}"/>
							<input type="hidden" value="${present++}"/>
							</g:if> <g:elseif test="${staffattendence.get(st1).get(dates)=='A'}">
								<strong style="color: red"> ${staffattendence.get(st1).get(dates)}
								</strong>
								<input type="hidden" value="${total++}"/>
								<input type="hidden" value="${absent++}"/>
							</g:elseif> <g:else>
								${staffattendence.get(st1).get(dates)}
							</g:else></td>
					</g:each>
					<td>${total}</td>
					<td>${present}</td>
					<td>${absent}</td>

				</tr>
			</g:each>

		</tbody>
	</table>
	<g:form controller="staffAttendance"
		action="printattendencestaffmonthly" target='_blank'>
		<g:hiddenField name="staffID" value="${params?.staffID}" />
		<g:hiddenField name="fromDate" value="${params?.fromDate}" />
		<g:hiddenField name="attendanceType" value="${params?.attendanceType}" />
		<g:hiddenField name="instituteID" value="${params?.instituteID}" />
		<g:hiddenField name="toDate" value="${params?.toDate}" />
		<g:hiddenField name="Search" value="Search" />
		<g:submitButton name="Get Print" />

	</g:form>
</g:if>

