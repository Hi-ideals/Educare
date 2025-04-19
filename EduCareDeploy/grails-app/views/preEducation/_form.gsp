<%@ page import="com.hiideals.instituite.student.PreEducation"%>

<div class="form-body">
	<div class="row">

		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: preEducationInstance, field: 'schoolname', 'error')} required">
				<label for="schoolname"> <g:message
						code="preEducation.schoolname.label" default="Schoolname" /> <span
					class="required-indicator">*</span>
				</label>
				<g:textField name="schoolname" required="" id="schoolname"
					value="${preEducationInstance?.schoolname}" class="form-control" />
			</div>
			<div id="Eschoolname" style="display: none; color: red">
				Provide your School Name</div>
		</div>


		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: preEducationInstance, field: 'qualification', 'error')} required">
				<label for="qualification"> <g:message
						code="preEducation.qualification.label" default="Qualification" />
					<span class="required-indicator">*</span>
				</label>
				<g:textField name="qualification" required="" id="qualification"
					value="${preEducationInstance?.qualification}" class="form-control" />
			</div>
			<div id="Equalification" style="display: none; color: red">
				Provide your Qualification</div>
		</div>


		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: preEducationInstance, field: 'marksPercentage', 'error')} required">
				<label for="marksPercentage"> <g:message
						code="preEducation.marksPercentage.label"
						default="Marks Percentage" /> <span class="required-indicator">*</span>
				</label>
				<g:field name="marksPercentage" type="number"
					value="${preEducationInstance.marksPercentage}"
					class="form-control" required="" id="marksPercentage" />
			</div>
			<div id="EmarksPercentage" style="display: none; color: red">
				Provide your MarksPercentage</div>
		</div>


		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: preEducationInstance, field: 'transferCertificatId', 'error')} required">
				<label for="transferCertificatId"> <g:message
						code="preEducation.transferCertificatId.label"
						default="Transfer Certificat Id" /> <span
					class="required-indicator">*</span>
				</label>
				<g:textField name="transferCertificatId" required=""
					value="${preEducationInstance?.transferCertificatId}"
					class="form-control" />
			</div>
		</div>
	</div>

	<div class="form-body">
		<div class="row">
			<div class="col-md-12">
				<g:render template="instituiteAddress"
					model="[schoolAddressInstance:preEducationInstance?.schoolAddress]"></g:render>


				<div>
					<ul class="list-inline">
						<li>Do you have Images to Upload??</li>
						<li><input type="radio" onclick="$('#openimg').show(500)"
							name="openimg" value="yes" /> Yes</li>
						<li><input type="radio" onclick="$('#openimg').hide(500)"
							name="openimg" value="no" checked="checked" /> No</li>
					</ul>

					<div id="openimg" style="display: none">
						<div class="portlet-body form">

							<div class="form-body">
								<div class="row">

									<div class="col-md-4">
										<div class="form-group  ">
											<div class="input_fields_wrap">
												<label>Choose Image </label> <input type="file" id="file_1"
													size="10" name="file_1" value="" placeholder="Input Value"
													class="form-control" /> <input type="hidden" value="1"
													id="ty" name="ty" class="ty"> <br>
											</div>
										</div>
									</div>
									<div class="col-md-4">
										<label>For Adding More Images Click Here</label>
										<button class="add_field_button btn btn-info">Add
											More Fields</button>

									</div>


								</div>
							</div>


						</div>
					</div>
				</div>

				<div>
					<ul class="list-inline">
						<li>Do you have Documents/Certificates to Upload??</li>
						<li><input type="radio" onclick="$('#openimg1').show(500)"
							name="openimg1" value="yes" /> Yes</li>
						<li><input type="radio" onclick="$('#openimg1').hide(500)"
							name="openimg1" value="no" checked="checked" /> No</li>
					</ul>

					<div id="openimg1" style="display: none">
						<div class="portlet-body form">

							<div class="form-body">
								<div class="row">
									<div class="col-md-4">
										<div class="form-group  ">

											<g:each in="${1..4}" var="documentFile" status="i">
												<input type="file" name="document${i}" class="form-control" />
												<br>
											</g:each>

										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>

			</div>

			<div class="row" style="display: none">

				<div class="col-md-4">
					<div class="form-group form-md-line-input form-md-floating-label">
						<div
							class="fieldcontain ${hasErrors(bean: preEducationInstance, field: 'studentpreEdu', 'error')} required">
							<select id="studentpreEdu" name="studentpreEdu.id"
								class="form-control">
								<option value="${studentInstance.id }">
									${studentInstance.studentName}
								</option>
							</select> <label for="studentpreEdu"> <g:message
									code="preEducation.studentpreEdu.label"
									default="Studentpre Edu" /> <span class="required-indicator">*</span>
							</label>

						</div>
					</div>
				</div>

			</div>
		</div>
	</div>
</div>

