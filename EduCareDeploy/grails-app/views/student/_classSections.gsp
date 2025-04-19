<%@ page import="com.hiideals.instituite.classcourses.IClass"%>

<div class="col-md-3">
	<label>Select a Section<span class="required-indicator"
		style="color: red">*</span></label>
		<g:if test="${studentInstance?.academicyear?.section!=null }">
			<select name="academicyear[0].section" id="section" class="form-control">
				<option value="${studentInstance?.academicyear?.section.id?.last()}">
					${studentInstance?.academicyear?.section?.sectionName?.last()}
				</option>
			</select>
		</g:if>
		<g:if test="${ (classId!=null || classId!='') && sections==null && studentInstance?.academicyear?.section==null  }">
			<select name="academicyear[0].section" id="section" class="form-control">
				<option>Select section</option>
				<g:each in="${IClass.findById(classId)?.sections}" var="section">
					<option value="${section.id}">
						${section.sectionName}
					</option>
				</g:each>
			</select>
		</g:if>
		
		
		
		<g:if test="${sections}">
			<select name="academicyear[0].section.id" id="section" class="form-control" onchange="${remoteFunction(
			          controller: 'student', 
			          action: 'getStudentUniqueId',
					  update:'studentIdTemp',
			          params: "\'sectionId=\' + this.value +  \'&classId=\' + document.getElementById('presentclass').value")}"">
			<option>Select section</option>
				<g:each in="${sections}" var="section">
					<option value="${section.id}">
						${section.sectionName}
					</option>
				</g:each>
			</select>
		</g:if>
</div>