<select name="books" class="form-control" id="books" multiple="multiple"
	class="many-to-many">

	<option>select</option>
	<g:each in="${booksList}" var="c">
		<option value="${c.id}">
			${c.title }
		</option>

	</g:each>
</select>