<%@ page import="com.hiideals.institute.staff.Staff"%>
<%@ page import="com.hiideals.instituite.classcourses.Subject"%>


<div class="form-body">

	<div class="row">

		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: staffInstance, field: 'staffID', 'error')} required">
				<label for="staffID"> <g:message code="staff.staffID.label"
						default="Staff ID" /> <span class="required-indicator">*</span>
				</label>
				<g:field name="staffID" type="number" class="form-control"
					value="${staffInstance.staffID}" required="" id="staffID" />

			</div>
			<div id="SstaffID" style="display: none; color: red">Provide
				your Staff id</div>
		</div>



		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: staffInstance, field: 'staffName', 'error')} required">
				<label for="staffName"> <g:message
						code="staff.staffName.label" default="Staff Name" /> <span
					class="required-indicator">*</span>
				</label>
				<g:textField name="staffName" required="" class="form-control"
					id="staffName" value="${staffInstance?.staffName}" />

			</div>
			<div id="SstaffName" style="display: none; color: red">Provide
				your Staff name (only characters)</div>
		</div>

		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: staffInstance, field: 'qualification', 'error')} required">
				<label for="qualification"> <g:message
						code="staff.qualification.label" default="Qualification" /> <span
					class="required-indicator">*</span>
				</label>
				<g:textField name="qualification" required="" class="form-control"
					value="${staffInstance?.qualification}" id="Qualification" />

			</div>
			<div id="SQualification" style="display: none; color: red">Provide
				your Qualification</div>
		</div>


		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: staffInstance, field: 'teachingSubject', 'error')} required">
				<label for="teachingSubject"> <g:message
						code="staff.teachingSubject.label" default="Select a Subject" />
					<span class="required-indicator">*</span>
				</label> <select id="teachingSubject" name="teachingSubject.id"
					class="form-control">
					<g:if test="${staffInstance?.teachingSubject !=null }">
						<option value="${staffInstance?.teachingSubject }">
							${staffInstance?.teachingSubject.subjectName }
						</option>
					</g:if>
					<g:else>
						<option value=""></option>
					</g:else>
					<g:each in="${Subject.findAllByInstitute(instituite)}"
						var="subject">
						<option value="${subject.id}">
							${subject.subjectName }
						</option>
					</g:each>
				</select>
			</div>
			<div id="SteachingSubject" style="display: none; color: red">Select
				your subject</div>
		</div>
	</div>
</div>

<div class="form-body">
	<div class="row">
		<div class="col-md-12">
			<g:render template="staffaddress"
				model="[addressInstance:staffInstance?.address]"></g:render>

			<!-- <div class="col-md-3">
			<div class="form-group form-md-line-input form-md-floating-label">
				<div
					class="fieldcontain ${hasErrors(bean: staffInstance, field: 'substutingSubjects', 'error')} ">
					<select name="substutingSubjects" multiple="multiple"
						class="form-control">
						<g:each
							in="${com.hiideals.instituite.classcourses.Subject.list()}"
							var="subjects">
							<option value="${subjects.id}">
								${subjects.subjectName }
							</option>
						</g:each>
					</select> <label for="substutingSubjects"> <g:message
							code="staff.substutingSubjects.label"
							default="Substuting Subjects" />

					</label>
				</div>

			</div>
		</div> -->


			<div class="col-md-3 ">
				<div
					class="fieldcontain ${hasErrors(bean: staffInstance, field: 'staffType', 'error')} required">
					<label for="institute"> <g:message
							code="staff.institute.label" default="Staff Type" /> <span
						class="required-indicator">*</span>
					</label> <select id="institute" name="staffType" class="form-control">
						<option value="">Select Staff Type</option>
						<g:each in="${staffInstance.constraints.staffType.inList}"
							var="staffType" status="i">
							<option value="${staffType}">
								${staffType}
							</option>
						</g:each>
					</select>
				</div>
				<div id="Sinstitute" style="display: none; color: red">Select
					your Staff type</div>
			</div>




			<div class="col-md-4" style="display: none">
				<div class="form-group form-md-line-input form-md-floating-label">
					<div
						class="fieldcontain ${hasErrors(bean: staffInstance, field: 'institute', 'error')} required">

						<select id="institute" name="institute.id" class="form-control">
							<option value="${instituite?.id}">
								${instituite?.name }
							</option>
						</select> <label for="institute"> <g:message
								code="staff.institute.label" default="Institute" /> <span
							class="required-indicator">*</span>
						</label>


					</div>
				</div>
			</div>
		</div>
	</div>
</div>