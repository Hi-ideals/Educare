<div class="portlet box grey">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-user"></i>Lists of ExamDetails :
			${exams?.examName}
		</div>
	</div>
	<div class="portlet-body">
		<div class="table-scrollable">
			<table class="table table-bordered table-hover">
				<thead>
					<tr>

						<th><g:message code="examDetails.examDate.label"
								default="Exam Date" /></th>

						<th><g:message code="examDetails.examDuration.label"
								default="Exam Duration" /></th>

						<th><g:message code="examDetails.iclass.label"
								default="Class" /></th>

						<th><g:message code="examDetails.passMarks.label"
								default="Pass Marks" /></th>

						<th><g:message code="examDetails.subject.label"
								default="Subject" /></th>

						<th><g:message code="examDetails.totalMarks.label"
								default="Total Marks" /></th>

					</tr>
				</thead>
				<tbody>
					<g:each in="${examDetails}" status="i" var="examDetailsInstance">
						<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

							<td><g:formatDate date="${examDetailsInstance?.examDate}"
									type="date" style="LONG" timeStyle="SHORT" /></td>

							<td>
								${fieldValue(bean: examDetailsInstance, field: "examDuration")}
							</td>

							<td>
								${fieldValue(bean: examDetailsInstance, field: "iclass.classname")}
							</td>

							<td>
								${fieldValue(bean: examDetailsInstance, field: "passMarks")}
							</td>

							<td>
								${fieldValue(bean: examDetailsInstance, field: "subject.subjectName")}
							</td>

							<td>
								${fieldValue(bean: examDetailsInstance, field: "totalMarks")}
							</td>

						</tr>
					</g:each>
				</tbody>
			</table>

		</div>
	</div>
</div>
<div style="position: absolute; right: 48%">
	<g:link class="btn-u sm-margin-bottom-10 btn blue" controller="marks"
		action="getExamTTPrint" target='_blank'
		params="[iclass:params.iclass.id,year:params.year.id,exam:params.exam.id]">Get Print</g:link>
</div>
