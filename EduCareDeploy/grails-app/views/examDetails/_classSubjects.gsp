
<div class="portlet-body">
	<div class="table-scrollable">
		<table class="table table-bordered table-hover">
			<tr>
				<th>Sl.no</th>
				<th>Subjects</th>
				<th>Exam Date</th>
				<th>Duration</th>
				<th>Total Marks</th>
				<th>Pass Marks</th>
			</tr>
			<g:each in="${subjects}" status="i" var="subject">
				<tr>
					<td>
						<div class="fieldcontain">
							${i+1}
						</div>
					</td>
					<td>
						<div class="fieldcontain">
							${subject?.subjectName}
							<input name="subject" type="hidden" value="${subject?.id}" />
						</div>
					</td>
					<td>
						<div
							class="fieldcontain ${hasErrors(bean: examDetailsInstance, field: 'examDate', 'error')} required">
							<input class="form-control date-picker${i}" name="examDate"
								precision="day" id="examDate${i}"
								value="${examDetailsInstance?.examDate}" />
							<script>
/*-----------validation for student-------------*/
$(document).ready(function() {
	$('#examDetails').click(function() {
		var input = $('#examDate${i}').val();
		if (input == '') {
			$('#DexamDate${i}').show();
			return false;
		} else if (!input.match(/^\d{2}\/\d{2}\/\d{4}$/)) {
			$('#DexamDate1${i}').show();
		} else {
			$('#DexamDate${i}').hide();
			$('#DexamDate1${i}').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="examDate${i}"]').on('change', function() {
		var input = $('#examDate${i}').val();
		if (input == '') {
			$('#DexamDate1${i}').hide();
			$('#DexamDate${i}').show();
		} else if (!input.match(/^\d{2}\/\d{2}\/\d{4}$/)) {
			$('#DexamDate1${i}').show();
			$('#DexamDate${i}').hide();
		} else {
			$('#DexamDate${i}').hide();
			$('#DexamDate1${i}').hide();
		}
	});
});
</script>
						</div> <script type="text/javascript">
		$(function() {
			$(".date-picker${i}").datepicker({
									changeMonth : true,
									changeYear : true,
									yearRange : "1800:3000",
								});
							});
						</script>
						<div id="DexamDate${i}" style="display: none; color: red">Provide
							your Exam date</div>
						<div id="DexamDate1${i}" style="display: none; color: red">Exam
							date should be this format mm/dd/yyyy</div>

					</td>

					<td>
						<div class="fieldcontain">
							<g:textField name="examDuration" type="text" required=""
								class="form-control timepicker timepicker-no-seconds"
								id="examDuration${i}"
								value="${examDetailsInstance?.examDuration}" />
							<script>
/*-----------validation for student-------------*/
$(document).ready(function() {
	$('#examDetails').click(function() {
		var date = $('#examDuration${i}').val();

		if ($.trim(date) == 0) {
			$('#DexamDuration${i}').show();
			return false;
		}

	});

	$('[id="examDuration${i}"]').on('change', function() {
		if ($(this).val() == "") {
			$('#DexamDuration${i}').show();
		} else {
			$('#DexamDuration${i}').hide();

		}
	});
});
</script>
						</div>
						<div id="DexamDuration${i}" style="display: none; color: red">Provide
							your ExamDuration</div>
					</td>

					<td>
						<div class="fieldcontain">
							<g:field name="totalMarks" class="form-control" type="number"
								id="totalMarks${i}" value="${examDetailsInstance?.totalMarks}"
								required="" />
							<script>
/*-----------validation for student-------------*/
$(document).ready(function() {
	$('#examDetails').click(function() {
		var input = $('#totalMarks${i}').val();
		if (input == '') {
			$('#DtotalMarks${i}').show();
			return false;
		} else if (!input.match(/^[0-9.,%]{1,}$/)) {
			$('#DtotalMarks1${i}').show();
		} else {
			$('#DtotalMarks${i}').hide();
			$('#DtotalMarks1${i}').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="totalMarks${i}"]').on('change', function() {
		var input = $('#totalMarks${i}').val();
		if (input == '') {
			$('#DtotalMarks1${i}').hide();
			$('#DtotalMarks${i}').show();
		} else if (!input.match(/^[0-9.,%]{1,}$/)) {
			$('#DtotalMarks1${i}').show();
			$('#DtotalMarks${i}').hide();
		} else {
			$('#DtotalMarks${i}').hide();
			$('#DtotalMarks1${i}').hide();
		}
	});
});
</script>
						</div>
						<div id="DtotalMarks${i}" style="display: none; color: red">Provide
							your Total Marks</div>
						<div id="DtotalMarks1${i}" style="display: none; color: red">Provide
							your Total Marks</div>
					</td>

					<td>
						<div class="fieldcontain">
							<g:field name="passMarks" type="number" class="form-control"
								id="passMarks${i}" value="${examDetailsInstance?.passMarks}"
								required="" />
							<script>
/*-----------validation for student-------------*/
$(document).ready(function() {
	$('#examDetails').click(function() {
		var input = $('#passMarks${i}').val();
		if (input == '') {
			$('#DpassMarks${i}').show();
			return false;
		} else if (!input.match(/^[0-9.,%]{1,}$/)) {
			$('#DpassMarks1${i}').show();
		} else {
			$('#DpassMarks${i}').hide();
			$('#DpassMarks1${i}').hide();
		}
	});
});
$(document).ready(function() {
	$('[id="passMarks${i}"]').on('change', function() {
		var input = $('#passMarks${i}').val();
		if (input == '') {
			$('#DpassMarks1${i}').hide();
			$('#DpassMarks${i}').show();
		} else if (!input.match(/^[0-9.,%]{1,}$/)) {
			$('#DpassMarks1${i}').show();
			$('#DpassMarks${i}').hide();
		} else {
			$('#DpassMarks${i}').hide();
			$('#DpassMarks1${i}
								')
																					.hide();
																		}
																	});
												});
							</script>
						</div>
						<div id="DpassMarks${i}" style="display: none; color: red">Provide
							your Pass Marks</div>
						<div id="DpassMarks1${i}" style="display: none; color: red">Marks
							should be only number</div>
					</td>
				</tr>
			</g:each>
		</table>
		<g:if test="${flash.msg}">
			<h4 style="color: red">Please check if there are subjects
				assigned to this class or not.</h4>
		</g:if>
	</div>
</div>


<link
	href="assets1/global/plugins/bootstrap-datepicker/css/bootstrap-timepicker.min.css"
	rel="stylesheet" type="text/css" />
<script
	src="assets1/global/plugins/bootstrap-datepicker/js/bootstrap-timepicker.min.js"
	type="text/javascript"></script>
<script
	src="assets1/global/plugins/bootstrap-datepicker/js/components-date-time-pickers.min.js"
	type="text/javascript"></script>

