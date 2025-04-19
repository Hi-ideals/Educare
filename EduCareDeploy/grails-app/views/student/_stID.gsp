<%@ page import="com.hiideals.instituite.classcourses.IClass"%>
<%@ page import="com.hiideals.instituite.classcourses.Section"%>


<div class="col-md-3" >
	<label> Section<span class="required-indicator"
		style="color: red">*</span></label> <select name="section1"
		class="form-control" id="section1" style="margin-bottom:8px;"
		onchange="${remoteFunction(controller:'student',action: 'phoneList',
                       update: 'phn',
                       params: "'sectionId=' + this.value +'&&classId='+'${iclass} '")}">
                       
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
                                                    <div class="row" >
														

														<div id="phn" >
															<g:render template="phoneList"
																model="[sectionId:secionId,classId:classId]"></g:render>
														</div>
														</div>