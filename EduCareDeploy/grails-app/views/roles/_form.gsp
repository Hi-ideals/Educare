<%@ page import="com.hiideals.instituite.admin.Roles"%>


<div class="row">
	<div class="col-md-4">

		<div
			class="fieldcontain ${hasErrors(bean: rolesInstance, field: 'roleName', 'error')} ">
			<label for="roleName"> <g:message code="roles.roleName.label"
					default="Role Name" />

			</label>
			<g:textField name="roleName" id="roleName"
				value="${rolesInstance?.roleName?.drop(5)}" class="form-control" />

		</div>
		<div id="CroleName" style="display: none; color: red">Provide
				Role</div>
	</div>
</div>
<%--<div class="fieldcontain ${hasErrors(bean: rolesInstance, field: 'createdUser', 'error')} required">
	<label for="createdUser">
		<g:message code="roles.createdUser.label" default="Created User" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="createdUser" name="createdUser.id" from="${com.hiideals.instituite.users.SecUser.list()}" optionKey="id" required="" value="${rolesInstance?.createdUser?.id}" class="many-to-one"/>

</div>

--%>
<%--<div class="fieldcontain ${hasErrors(bean: rolesInstance, field: 'instituite', 'error')} required">
	<label for="instituite">
		<g:message code="roles.instituite.label" default="Instituite" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="instituite" name="instituite.id" from="${com.hiideals.instituite.main.Instituite.list()}" optionKey="id" required="" value="${rolesInstance?.instituite?.id}" class="many-to-one"/>

</div>

--%>