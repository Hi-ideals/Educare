<select name="sectionname_1"  class="form-control" required="required">

	<option value="${null}">
			Select Section
		</option>
	<g:each in="${sections}" var="cls">
		<option value="${cls.id }">
			${cls.sectionName}
		</option>
	</g:each>
	<g:if test="${sections?.size()<=0 }">
		<option value="${null }">
			No Sections available
		</option>
	</g:if>
</select>