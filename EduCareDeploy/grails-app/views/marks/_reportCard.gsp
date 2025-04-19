<div class="portlet box grey">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-book"></i>Report Card
		</div>
	</div>
	<div class="portlet-body">
		Registration Number :
		${exams?.student?.registrationNo[0]}<br> Student Name :
		${exams?.student?.studentName[0]}<br> Class :
		${academicyr?.presentclass?.classname}
		Section :
		${academicyr?.section?.sectionName}
		<br> Student ID :
		${exams?.student?.studentId[0]}<br> Father Name :
		${exams?.student?.fatherDetails?.parentName[0]}
		<br> Academic Year :
		${exams?.examDetails.year.batchName[0]}
		<br> Exam :
		${exams?.examDetails?.exam?.examName[0]}
		<div class="table-scrollable">
			<table class="table  table-hover">
				<tr>
					<th>Subjects</th>
					<th>Date</th>
					<th>Total Marks</th>
					<th>Pass Marks</th>
					<th>Marks Obtained</th>
				</tr>
				<g:each in="${exams}" status="i" var="examdetails">
					<tr>

						<td>
							<div class="fieldcontain">
								${examdetails?.examDetails?.subject?.subjectName}
								<input name="examdetails" type="hidden"
									value="${examdetails?.id}" />
							</div>
						</td>

						<td>
							<div class="fieldcontain">
								<g:formatDate date="${examdetails?.examDetails?.examDate}"
									type="date" style="LONG" timeStyle="SHORT" />
							</div>
						</td>


						<td>
							<div class="fieldcontain">
								${examdetails?.examDetails?.totalMarks}
							</div>
						</td>

						<td>
							<div class="fieldcontain">
								${examdetails?.examDetails?.passMarks}
							</div>
						</td>

						<td>
							<div class="fieldcontain">
								${examdetails?.obtainedMarks}
								<script>
/*-----------validation for student-------------*/
 $(document).ready(function() {
	$('#marks').click(function() {
		var input = $('#obtainedMarks${i}').val();
		if (input == '') {
			$('#MobtainedMarks${i}').show();
		} else if (!input.match(/^[0-9.,%]{1,}$/)) {
			$('#MobtainedMarks1${i}').show();
			return false;
		} else {
			$('#MobtainedMarks${i}').hide();
			$('#MobtainedMarks1${i}').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="obtainedMarks${i}"]').on('change', function() {
		var input = $('#obtainedMarks${i}').val();
		if (input == '') {
			$('#MobtainedMarks1${i}').hide();
			$('#MobtainedMarks${i}').show();
		} else if (!input.match(/^[0-9.,%]{1,}$/)) {
			$('#MobtainedMarks1${i}').show();
			$('#MobtainedMarks${i}').hide();
		} else {
			$('#MobtainedMarks${i}').hide();
			$('#MobtainedMarks1${i}
									')
																						.hide();
																			}
																		});
													});
								</script>
								<div id="MobtainedMarks${i}" style="display: none; color: red">Provide
									your Obtained Marks</div>
								<div id="MobtainedMarks1${i}" style="display: none; color: red">Obtained
									Marks should be only number</div>
							</div>
						</td>
					</tr>
				</g:each>
				<tr>
					<td><b></b></td>
					<td><b>Total :</b></td>
					<td><b> ${exams.sum{it.examDetails?.totalMarks}}</b></td>
					<td><b> ${exams.sum{it.examDetails?.passMarks}}</b></td>
					<td><b> ${exams.sum{it.obtainedMarks}}</b></td>
					<td colspan="1"></td>
				</tr>
			</table>
		</div>
	</div>
</div>
<div style="position: absolute; right: 48%">
	<g:link class="btn-u sm-margin-bottom-10 btn blue" controller="marks"
		action="getreportCardPrint" target='_blank'
		params="[iclass:params.iclass.id,year:params.year.id,exam:params.exam.id,student:params.student.id]">Get Print</g:link>
</div>