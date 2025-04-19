<select name="staffname_1" class="form-control" id="staffname_1" onchange="func2(this)">
	
	<option value="${null}" >
			Select Staff
		</option>
	<g:each in="${staffList}" var="cls">
		<option value="${cls.id}">
			${cls.staffName}
		</option>
	</g:each>
	<g:if test="${staffList.size()<=0 }">
		<option value="${null }">
			No Staff available
		</option>
	</g:if>
</select>

<script type="text/javascript">
//func()
	</script>