
<select name="phone" multiple="multiple" class="form-control">
	<option value="all">All</option>
	<g:if test="${params.role1=="Staff"|| params.iclass==""}">
		<g:each in="${staffphone}" var="phn">
			<option value="${phn?.address?.mobileNumber}">
				${phn?.address?.mobileNumber} ||
				${phn?.staffName}
			</option>
		</g:each>
	</g:if>
	<g:if test="${params.role1=="Student" || params.iclass!=""}">
		<g:each in="${phoneList}" var="phn">
			<option value="${phn?.fatherDetails?.mobileNumber}">
				${phn?.fatherDetails?.mobileNumber} ||
				${phn?.studentName}
			</option>
		</g:each>
	</g:if>

</select>

