<div class="col-md-3">
	<label>Student Id.<span class="required-indicator"
		style="color: red">*</span></label>
	<div
		class="fieldcontain ${hasErrors(bean: studentInstance, field: 'studentId', 'error')} required">
		<g:if test="${studentid}">
			<g:textField name="studentId" id="studentId" class="form-control"
				required="" value="${studentid}" />
		</g:if>
		<g:else>
			<g:textField name="studentId" id="studentId" class="form-control"
				required="" value="${studentInstance?.studentId}" />
		</g:else>
		<!-- <label for="studentId"> <g:message
								code="student.studentId.label" default="Student Id" /> <span
							class="required-indicator" style="color: red">*</span>
						</label>-->
	</div>
	<div id="SstudentId" style="display: none; color: red">Provide
		your student id</div>
</div>