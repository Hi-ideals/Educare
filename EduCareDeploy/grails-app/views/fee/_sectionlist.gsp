<%@ page import="com.hiideals.instituite.classcourses.IClass"%>
<%@ page import="com.hiideals.instituite.classcourses.Section"%>


<div class="col-md-3">
	<label>Section<span class="required-indicator"
		style="color: red"></span></label> <select name="section1"
		class="form-control" id="section1">
		<option value="">Select</option>
		<g:each in="${sections}" var="sec">
			<option value="${sec?.id}">
				${sec.sectionName}
			</option>
		</g:each>
	</select>
	<div id="Ssection1" style="display: none; color: red">Select your
		Section</div>
</div>