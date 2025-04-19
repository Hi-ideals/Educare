<select name="magazine" class="form-control" id="magazineId" multiple="multiple"
	class="many-to-many">

	<option>select</option>
	<g:each in="${magazinelist}" var="c">
		<option value="${c.id}">
			${c.magazineName}
		</option>

	</g:each>
	
</select>