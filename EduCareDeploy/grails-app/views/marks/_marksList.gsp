<br>

<div class="portlet-body">
	<div class="table-scrollable">
		<table class="table table-bordered table-hover">
			<tr>
				<th>Sl.no</th>
				<th>Subjects</th>
				<th>Total Marks</th>
				<th>Pass Marks</th>
				<th>Marks Obtained</th>
			</tr>
			<g:each in="${exams}" status="i" var="examdetails">
				<tr>

					<td>
						<div class="fieldcontain">
							${i+1}
						</div>
					</td>

					<td>
						<div class="fieldcontain">
							${examdetails?.subject?.subjectName}
							<input name="examdetails" type="hidden"
								value="${examdetails?.id}" />
						</div>
					</td>



					<td>
						<div class="fieldcontain">
							<g:field name="totalMarks" type="number" class="form-control"
								value="${examdetails?.totalMarks}" required="" readOnly="true" />
						</div>
					</td>

					<td>
						<div class="fieldcontain">
							<g:field name="passMarks" type="number" class="form-control"
								value="${examdetails?.passMarks}" required="" readOnly="true" />
						</div>
					</td>

					<td>
						<div class="fieldcontain">
							<g:field name="obtainedMarks" type="number" class="form-control"
								id="obtainedMarks${i}" required="" />
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
		</table>
		<g:if test="${flash.msg}">
			<h4 style="color: red">Exams are not taken for this class.You
				will have to take exams to update marks.</h4>
		</g:if>
	</div>
</div>

