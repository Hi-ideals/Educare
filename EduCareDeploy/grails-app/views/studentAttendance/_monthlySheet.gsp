
<%@page import="java.lang.Integer"%>
<table class="table table-bordered" id="my_table">
	<thead>
		<g:if test="${studentList}">
			<tr>
				<td style="text-align: center;">Students <i
					class="entypo-down-thin"></i> | Date <i class="entypo-right-thin"></i>
				</td>

				<g:each in="${(1..31).toList()}" var="count1">
					<td style="text-align: center;">
						${count1}
					</td>

				</g:each>
				<td>Total</td>
				<td>Present</td>
				<td>Absent</td>
			</tr>
		</g:if>
	</thead>
	<tbody>
	  
		<g:each in="${studentattendence?.keySet()}" var="st1" status="k">
			<tr>
			 <g:set var="total" value="0"></g:set>
		<g:set var="present" value="0"></g:set>
		<g:set var="absent" value="0"></g:set>
				<td style="text-align: center;">
					${st1?.studentName}
				</td>
				
				<g:each in="${studentattendence.get(st1).keySet()}" var="dates" status="n">
				<td>
				<g:if test="${studentattendence.get(st1).get(dates)=='P'}">
				<strong style="color: green"> ${studentattendence.get(st1).get(dates)}
									</strong>
									<input type="hidden" value="${total++}"/>
							<input type="hidden" value="${present++}"/>
				</g:if>
				<g:elseif test="${studentattendence.get(st1).get(dates)=='A'}">
									<strong style="color: red"> ${studentattendence.get(st1).get(dates)}
									</strong>
									<input type="hidden" value="${total++}"/>
								<input type="hidden" value="${absent++}"/>
								</g:elseif>
								<g:else>
								 ${studentattendence.get(st1).get(dates)}
								</g:else>
				</td>
				</g:each>
				
				<td>${total}</td>
					<td>${present}</td>
					<td>${absent}</td>
			</tr>
		</g:each>
	</tbody>
</table>

<!--Invoice Footer-->
<div class="row">
	<div class="col-xs-6 text-right">
		<g:if test="${studentList}">

			<g:form controller="studentAttendance" action="printattendance"
				target='_blank'>
				<g:hiddenField name="classID" value="${params?.classID}" />
				<g:hiddenField name="section" value="${params?.secId}" />
				<g:hiddenField name="secId" value="${params?.secId}" />
				<g:hiddenField name="studentID" value="All Students" />
				<g:hiddenField name="academicyear[0].section.id" value="${params?.secId}" />
				<g:hiddenField name="attendanceType" value="${params?.attendanceType}" />
				<g:hiddenField name="fromDate" value="${params?.fromDate}" />
				<g:hiddenField name="toDate" value="${params?.toDate}" />
				<g:hiddenField name="Search" value="Search" />
				<g:submitButton name="Get Print" />
				
			</g:form>

		</g:if>
	</div>
</div>
<!--End Invoice Footer-->






