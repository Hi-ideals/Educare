<%@ page import="com.hiideals.instituite.classcourses.Subject"%>


<div class="form-body">

	<div class="row">
		<div class="col-md-4">
			<div
				class="fieldcontain ${hasErrors(bean: subjectInstance, field: 'subjectDescription', 'error')} ">
				<label for="subjectDescription"> <g:message
						code="subject.subjectDescription.label"
						default="Subject Description" />
				</label>
				<g:textField name="subjectDescription" class="form-control"
					value="${subjectInstance?.subjectDescription}" />

			</div>
		</div>



		<div class="col-md-4">
			<div
				class="fieldcontain ${hasErrors(bean: subjectInstance, field: 'subjectName', 'error')} required">
				<label for="subjectName"> <g:message
						code="subject.subjectName.label" default="Subject Name" /> <span
					class="required-indicator">*</span>
				</label>
				<g:textField name="subjectName" required="" class="form-control"
					value="${subjectInstance?.subjectName}" id="subjectname" />

			</div>
			<div id="Ssubjectname" style="display: none; color: red">Provide
				your Subject Name</div>
		</div>

		<div class="col-md-4">
			<div
				class="fieldcontain ${hasErrors(bean: subjectInstance, field: 'iclass', 'error')} required">
				<label for="subjectName"> <g:message
						code="subject.iclass.label" default="Class" /> <span
					class="required-indicator">*</span>
				</label> <select name="iclass" class="form-control" id="iclass" multiple="multiple">
					<g:if test="${subjectInstance.iclass !=null }">
						<option value="${subjectInstance.iclass.id}" disabled="disabled">
							${subjectInstance?.iclass?.classname }
						</option>
					</g:if>
					<g:else>
						<option value="">Select a Class</option>
					</g:else>
					<g:each in="${iclass}" var="cls">
						<option value="${cls.id }">
							${cls.classname }
						</option>
					</g:each>
				</select>
			</div>
			<div id="Siclass" style="display: none; color: red">Select your
				class</div>
		</div>



		<div class="col-md-4" style="display: none">
			<div
				class="fieldcontain ${hasErrors(bean: subjectInstance, field: 'institute', 'error')} required">
				<label for="institute"> <g:message
						code="subject.institute.label" default="Institute" /> <span
					class="required-indicator">*</span>
				</label> <select id="institute" name="institute.id" class="form-control">
					<option value="${instituite?.id }">
						${instituite?.name }
					</option>
				</select>

			</div>
		</div>
	</div>
</div>
