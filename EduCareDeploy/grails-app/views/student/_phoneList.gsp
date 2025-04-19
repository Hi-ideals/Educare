<select name="phone" multiple="multiple" class="form-control">
	<option value="all">All</option>
	
	
		<g:each in="${phone}" var="phn">
			<option value="${phn?.id}">
				${phn?.studentName} ||
				${phn?.fatherDetails?.parentName}
			</option>
		</g:each>
	

</select>