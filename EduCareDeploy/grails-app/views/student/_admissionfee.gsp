<%@ page import="com.hiideals.instituite.classcourses.IClass"%>

<div class="col-md-3">
<label>Admission fee<span class="required-indicator"
		style="color: red">*</span></label>
		<g:if test="${sections1==null && studentInstance?.academicyear?.feeId ==null}">
			<select name="fee" id="section" class="form-control" required="required">
				<g:each in="" var="section">
					<option value="null">
						
					</option>
				</g:each>
			</select>
		</g:if>
		<g:if test="${studentInstance?.academicyear?.feeId !=null}">
			<select name="fee" id="section" class="form-control" >
					<option value="">
					<g:if test="${studentInstance?.academicyear?.feeId?.totaladmissionfee}">
					${studentInstance?.academicyear?.feeId?.totaladmissionfee?.last()}
					</g:if>
				</option>
			</select>
		</g:if>
		<g:if test="${sections1}">
			<select name="admissionfee" id="section" class="form-control" required="required">
				<g:each in="${sections1}" var="section">
					<option value="${section?.id}">
						${section?.totalAmount}
					</option>
				</g:each>
			</select>
		</g:if>
</div>