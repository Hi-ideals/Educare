<%@page import="com.hiideals.instituite.main.Instituite"%>
<%@ page import="com.hiideals.instituite.classcourses.IClass"%>


<div class="form-body">

	<div class="row">
		<div class="col-md-4">
			<div
				class="fieldcontain ${hasErrors(bean: IClassInstance, field: 'classID', 'error')} required">
				<label for="classID"> <g:message code="IClass.classID.label"
						default="Class ID" /> <span class="required-indicator">*</span>
				</label>
				<g:if test="${IClassInstance?.classID !=null}">
					<g:textField name="classID" class="form-control" required=""
						id="classID" value="${IClassInstance?.classID}" />
				</g:if>
				<g:else>
					<regId:getIClsId inst="${instituite?.name}" />
				</g:else>
			</div>
			<div id="SclassID" style="display: none; color: red">provide
				your Registration number</div>
		</div>


		<div class="col-md-4">
			<div
				class="fieldcontain ${hasErrors(bean: IClassInstance, field: 'classname', 'error')} required">
				<label for="classname"> <g:message
						code="IClass.classname.label" default="Class" /> <span
					class="required-indicator">*</span>
				</label>
				<g:textField name="classname" class="form-control" required=""
					id="Classname" value="${IClassInstance?.classname}" />
			</div>
			<div id="SClassname" style="display: none; color: red">provide
				your Class name</div>
		</div>
		
			<div class="col-md-4">
			<div
				class="fieldcontain ${hasErrors(bean: IClassInstance, field: 'sections', 'error')} ">
				<label for="sections"> <g:message
						code="IClass.sections.label" default="Sections" />
				</label> <select name="sections" class="form-control" multiple="multiple">
					<g:each
						in="${com.hiideals.instituite.classcourses.Section.findAllByInstituite(instituite)}"
						var="${section}">
						<option value="${section.id}">
							${section.sectionName}
						</option>
					</g:each>
				</select>

			</div>
		</div>
		
		<%--
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: IClassInstance, field: 'classStrength', 'error')} ">
				<label for="classStrength"> <g:message
						code="IClass.classStrength.label" default="Class Strength" />
				</label>
				<g:field name="classStrength" class="form-control" type="number"
					value="${IClassInstance.classStrength}" />
			</div>
		</div>
		 --%>
		

		<%--
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: IClassInstance, field: 'classTeacherName', 'error')} ">
				<label for="classTeacherName"> <g:message
						code="IClass.classTeacherName.label" default="Class Teacher Name" />
				</label>
				<g:textField name="classTeacherName" class="form-control"
					value="${IClassInstance?.classTeacherName}" />
			</div>
		</div>
		 --%>
		


		<div class="col-md-4" style="display: none">
			<div
				class="fieldcontain ${hasErrors(bean: sectionInstance, field: 'instituite', 'error')} ">
				<label for="admin"> <g:message code="instituite.admin.label"
						default="instituite" />
				</label> <select id="instituite" class="form-control" name="instituite.id">
					<option value="${instituite?.id}">
						${instituite?.name}
					</option>
				</select>
			</div>
		</div>
	</div>
</div>

<%--
<div class="form-body">
	<div class="row">
		<div class="col-md-4">
			<div
				class="fieldcontain ${hasErrors(bean: IClassInstance, field: 'sections', 'error')} ">
				<label for="sections"> <g:message
						code="IClass.sections.label" default="Sections" />
				</label> <select name="sections" class="form-control" multiple="multiple">
					<g:each
						in="${com.hiideals.instituite.classcourses.Section.findAllByInstituite(instituite)}"
						var="${section}">
						<option value="${section.id}">
							${section.sectionName}
						</option>
					</g:each>
				</select>

			</div>
		</div>
	</div>
</div>
 --%>






