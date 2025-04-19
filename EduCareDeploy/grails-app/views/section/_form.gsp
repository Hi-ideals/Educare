<%@ page import="com.hiideals.instituite.classcourses.Section"%>


<div class="form-body">
	<div class="row margin-bottom-10">

		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: sectionInstance, field: 'sectionName', 'error')} required">
				<label for="sectionName"> <g:message
						code="section.sectionName.label" default="Section Name" /> <span
					class="required-indicator">*</span>
				</label>
				<g:textField name="sectionName" required="" class="form-control"
					value="${sectionInstance?.sectionName}" id="SectionName" />
			</div>
			<div id="SSectionName" style="display: none; color: red">provide
				your Section Name</div>
		</div>


		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: sectionInstance, field: 'sectionID', 'error')} required">
				<label for="sectionID"> <g:message
						code="section.sectionID.label" default="Section ID" /> <span
					class="required-indicator">*</span>
				</label>
				<g:if test="${sectionInstance?.sectionID !=null}">
					<g:textField name="sectionID" required="" class="form-control"
						value="${sectionInstance?.sectionID}" id="sec" />
				</g:if>
				<g:else>
					<regId:getSecId />
				</g:else>
			</div>
			<div id="Ssec" style="display: none; color: red">provide your
				Section ID</div>
		</div>


		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: sectionInstance, field: 'sectionStrength', 'error')} ">
				<label for="sectionStrength"> <g:message
						code="section.sectionStrength.label" default="Section Strength" />
				</label>
				<g:field name="sectionStrength" type="number" class="form-control"
					value="${sectionInstance.sectionStrength}" />
			</div>
		</div>

		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: sectionInstance, field: 'sectionClassTeacher', 'error')} ">
				<label for="sectionStrength"> <g:message
						code="section.sectionStrength.label"
						default="Section Class Teacher" />
				</label>
				<g:field name="sectionClassTeacher" type="text" class="form-control"
					value="${sectionInstance.sectionClassTeacher}" />
			</div>
		</div>

		<%--
		<div class="col-md-3">
			<div class="form-group form-md-line-input form-md-floating-label">

				<div
					class="fieldcontain ${hasErrors(bean: sectionInstance, field: 'sectionClassTeacher', 'error')} ">
						<select name="sectionClassTeacher" class="form-control">
						<option value="${sectionInstance?.sectionClassTeacher}"></option>
						<g:each in="${staffs}" var="staff" status="i">
						<option value="${staff?.staffName}">${staff?.staffName}</option>
						</g:each>
						</select>
						
                     <label for="sectionClassTeacher"> <g:message
							code="section.sectionClassTeacher.label"
							default="Section Class Teacher" />

					</label>

				</div>
			</div>
		</div>
		 --%>
	</div>
	<div class="row margin-bottom-10">
		<div class="col-md-3" style="display: none1">
			<div
				class="fieldcontain ${hasErrors(bean: sectionInstance, field: 'instituite', 'error')} ">
				<label for="admin"> <g:message code="instituite.admin.label"
						default="instituite" />
				</label> <select id="instituite" class="form-control" name="instituite?.id">
					<option value="${instituite?.id}">
						${instituite?.name}
					</option>
				</select>

			</div>
		</div>
	</div>

</div>







