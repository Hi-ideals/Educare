<%@ page import="com.hiideals.instituite.admin.UserList"%>

<div class="form-body">
	<div class="row">
		<div class="col-md-4">
			<div
				class="fieldcontain ${hasErrors(bean: userListInstance, field: 'userName', 'error')} ">
				<label for="userName"> <g:message
						code="userList.userName.label" default="User Name" />
				</label>
				<g:textField name="userName" class="form-control" id="userName"
					value="${userListInstance?.userName}" />
			</div>

			<div id="CuserName" style="display: none; color: red">Provide
				your User Name</div>
		</div>
		<div class="col-md-4">
			<div
				class="fieldcontain ${hasErrors(bean: userListInstance, field: 'password', 'error')} ">
				<label for="password"> <g:message
						code="userList.password.label" default="Password" />

				</label>
				<g:textField name="password" class="form-control" id="Password"
					value="${userListInstance?.password}" />
			</div>
			<div id="CPassword" style="display: none; color: red">Provide
				your Password</div>
		</div>
		<div class="col-md-4">
			<div
				class="fieldcontain ${hasErrors(bean: userListInstance, field: 'secrole', 'error')} ">
				<label for="secrole"> <g:message
						code="userList.secrole.label" default="Secrole" />

				</label> <select id="secrole" name="secrole.id" class="form-control">
					<option value="${userListInstance?.secrole?.id}">Select</option>
					<g:each in="${roles}">
						<option value="${it?.id}">
							${it?.roleName}
						</option>
					</g:each>
				</select>

				<%--<g:select id="secrole" name="secrole.id" from="${com.hiideals.instituite.admin.Roles.list()}" optionKey="id" value="${userListInstance?.secrole?.id}" class="many-to-one" noSelection="['null': '']"/>

--%>
			</div>
			<div id="Csecrole" style="display: none; color: red">Provide
				Select Role</div>
		</div>
	</div>
</div>
<g:render template="addressForm"></g:render>

<%--<div class="fieldcontain ${hasErrors(bean: userListInstance, field: 'createdUser', 'error')} ">
	<label for="createdUser">
		<g:message code="userList.createdUser.label" default="Created User" />
		
	</label>
	<g:select id="createdUser" name="createdUser.id" from="${com.hiideals.instituite.users.SecUser.list()}" optionKey="id" value="${userListInstance?.createdUser?.id}" class="many-to-one" noSelection="['null': '']"/>

</div>

--%>


<g:if test="${params?.action!='edit'}">
<div class="row">
	<div class="col-md-4">
		<div class="fieldcontain">
			<label for="smsSenderId"> <g:message
					code="admin.smsSenderId.label" default="Student Management" />
			</label>
			<g:if
				test="${userListInstance?.modules?.moduleName?.contains('adminsion')}">
				<input type="checkbox" name="module" class="form-control"
					checked="checked" value="Student Management" />
			</g:if>
			<g:else>
				<input type="checkbox" name="module" class="form-control"
					value="Student Management" />
			</g:else>

			<%--<input type="checkbox" name="module" 
						readonly="readonly" value="Student Management" />
				--%>
		</div>
	</div>
	<regId:getModule name="library" />
	<g:if test="${module}">
		<div class="col-md-4">
			<div class="fieldcontain">
				<label for="smsSenderId"> <g:message
						code="admin.smsSenderId.label" default="Library Management" />
				</label>

				<g:if
					test="${userListInstance?.modules?.moduleName?.contains('library')}">
					<input type="checkbox" name="module" class="form-control"
						checked="checked" value="Library Management" />
				</g:if>
				<g:else>
					<input type="checkbox" name="module" class="form-control"
						value="Library Management" />
				</g:else>
			</div>
		</div>
	</g:if>
	<regId:getModule name="transport" />
	<g:if test="${module}">
		<div class="col-md-4">
			<div class="fieldcontain">
				<label for="smsSenderId"> <g:message
						code="admin.smsSenderId.label" default="Transport Management" />
				</label>

				<g:if
					test="${userListInstance?.modules?.moduleName?.contains('transport')}">
					<input type="checkbox" name="module" class="form-control"
						checked="checked" value="Transport Management" />
				</g:if>
				<g:else>
					<input type="checkbox" name="module" class="form-control"
						value="Transport Management" />
				</g:else>


			</div>
		</div>
	</g:if>

	<br> <br>
	<regId:getModule name="payroll" />
	<g:if test="${module}">
		<div class="col-md-4">
			<div class="fieldcontain">
				<label for="smsSenderId"> <g:message
						code="admin.smsSenderId.label" default="HR" />
				</label>

				<g:if
					test="${userListInstance?.modules?.moduleName?.contains('payroll')}">
					<input type="checkbox" name="module" class="form-control"
						checked="checked" value="HR" />
				</g:if>
				<g:else>
					<input type="checkbox" name="module" class="form-control"
						value="HR" />
				</g:else>


			</div>
		</div>
	</g:if>
	<regId:getModule name="Exams" />
	<g:if test="${module}">
		<div class="col-md-4">
			<div class="fieldcontain">
				<label for="smsSenderId"> <g:message
						code="admin.smsSenderId.label" default="Exam" />
				</label>

				<g:if
					test="${userListInstance?.modules?.moduleName?.contains('Exams')}">
					<input type="checkbox" name="module" class="form-control"
						checked="checked" value="Exam" />
				</g:if>
				<g:else>
					<input type="checkbox" name="module" class="form-control"
						value="Exam" />
				</g:else>


			</div>
		</div>
	</g:if>
	<regId:getModule name="timetable" />
	<g:if test="${module}">

		<div class="col-md-4">
			<div class="fieldcontain">
				<label for="smsSenderId"> <g:message
						code="admin.smsSenderId.label" default="Time Table" />
				</label>
				<g:if
					test="${userListInstance?.modules?.moduleName?.contains('timetable')}">
					<input type="checkbox" name="module" class="form-control"
						checked="checked" value="Time Table" />
				</g:if>
				<g:else>
					<input type="checkbox" name="module" class="form-control"
						value="Time Table" />
				</g:else>
			</div>
		</div>
	</g:if>
	<br> <br>
	<regId:getModule name="attendence" />
	<g:if test="${module}">
		<div class="col-md-4">
			<div class="fieldcontain">
				<label for="smsSenderId"> <g:message
						code="admin.smsSenderId.label" default="Attendance" />
				</label>
				<g:if
					test="${userListInstance?.modules?.moduleName?.contains('attendence')}">
					<input type="checkbox" name="module" class="form-control"
						checked="checked" value="Attendance Management" />
				</g:if>
				<g:else>
					<input type="checkbox" name="module" class="form-control"
						value="Attendance Management" />
				</g:else>
			</div>
		</div>
	</g:if>
	<regId:getModule name="certificates" />
	<g:if test="${module}">
		<div class="col-md-4">
			<div class="fieldcontain">
				<label for="smsSenderId"> <g:message
						code="admin.smsSenderId.label" default="Certificates" />
				</label>
				<g:if
					test="${userListInstance?.modules?.moduleName?.contains('certificates')}">
					<input type="checkbox" name="module" class="form-control"
						checked="checked" value="Certificates" />
				</g:if>
				<g:else>
					<input type="checkbox" name="module" class="form-control"
						value="Certificates" />
				</g:else>
			</div>
		</div>
	</g:if>
</div>
</g:if>




<%--<div class="fieldcontain ${hasErrors(bean: userListInstance, field: 'modules', 'error')} ">
	<label for="modules">
		<g:message code="userList.modules.label" default="Modules" />
		
	</label>
	<g:select name="modules" from="${com.hiideals.instituite.helper.UserModules.list()}" multiple="multiple" optionKey="id" size="5" value="${userListInstance?.modules*.id}" class="many-to-many"/>

</div>

--%>
<%--<div class="fieldcontain ${hasErrors(bean: userListInstance, field: 'institute', 'error')} required">
	<label for="institute">
		<g:message code="userList.institute.label" default="Institute" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="institute" name="institute.id" from="${com.hiideals.instituite.main.Instituite.list()}" optionKey="id" required="" value="${userListInstance?.institute?.id}" class="many-to-one"/>

</div>

--%>