<%@page import="com.hiideals.instituite.helper.Address"%>
<%@ page import="com.hiideals.instituite.admin.Admin"%>

<div class="form-body">
	<div class="row">

		<div class="col-md-4">
			<div
				class="fieldcontain ${hasErrors(bean: adminInstance, field: 'adminID', 'error')} required">
				<label for="adminID"> <g:message code="admin.adminID.label"
						default="Admin ID" /> <span class="required-indicator">*</span>
				</label>

				<g:if test="${ID}">
					<g:textField name="adminID" class="form-control" required=""
						value="${ID}" />
				</g:if>
				<g:else>
					<g:textField name="adminID" class="form-control" required=""
						value="${adminInstance?.adminID}" />
				</g:else>

			</div>
		</div>

		<div class="col-md-4">
			<div
				class="fieldcontain ${hasErrors(bean: adminInstance, field: 'adminName', 'error')} required">
				<label for="adminName"> <g:message
						code="admin.adminName.label" default="Admin Name" /> <span
					class="required-indicator">*</span>
				</label>
				<g:textField name="adminName" class="form-control" required=""
					value="${adminInstance?.adminName}" />
			</div>
		</div>


		<div class="col-md-4">
			<div
				class="fieldcontain ${hasErrors(bean: adminInstance, field: 'password', 'error')} required">
				<label for="password"> <g:message
						code="admin.password.label" default="Password" /> <span
					class="required-indicator">*</span>
				</label>
				<g:textField name="password" class="form-control" required=""
					value="${adminInstance?.password}" />
			</div>
		</div>
	</div>
</div>


<div class="form-body">
	<div class="row">
		<div class="col-md-4">
			<div
				class="fieldcontain ${hasErrors(bean: adminInstance, field: 'smsUsername', 'error')}">
				<label for="smsUsername"> <g:message
						code="admin.smsUsername.label" default="smsUsername" />
				</label>
				<g:textField name="smsUsername" class="form-control"
					value="${adminInstance?.smsUsername}" />
			</div>
		</div>

		<div class="col-md-4">
			<div
				class="fieldcontain ${hasErrors(bean: adminInstance, field: 'smsPassword', 'error')}">
				<label for="smsPassword"> <g:message
						code="admin.smsPassword.label" default="smsPassword" />
				</label>

				<g:textField name="smsPassword" class="form-control"
					value="${adminInstance?.smsPassword}" />
			</div>
		</div>

		<div class="col-md-4">
			<div
				class="fieldcontain ${hasErrors(bean: adminInstance, field: 'smsSenderId', 'error')}">
				<label for="smsSenderId"> <g:message
						code="admin.smsSenderId.label" default="smsSenderId" />
				</label>
				<g:textField name="smsSenderId" class="form-control"
					value="${adminInstance?.smsSenderId}" />
			</div>
		</div>

	</div>

	<g:render template="addressForm"></g:render>

	<div class="row">
		<section class="col-md-8">
			<g:if test="${adminInstance?.profilePic != null }">
				<images:getImage id="${adminInstance?.profilePic?.id }"
					width="150px" />
				<ul class="list-inline">
					<li><h3>change Profile Pic??</h3></li>
					<li><input type="radio" onclick="$('#openimg').show(500)"
						name="openimg" value="yes" /> Yes</li>
					<li><input type="radio" onclick="$('#openimg').hide(500)"
						name="openimg" value="no" checked="checked" /> No</li>
				</ul>

			</g:if>

			<div id="openimg" style="display: ${edit}">
				Upload a Profile Pic:

				<div class="fileinput fileinput-new" data-provides="fileinput">
					<div>
						<span class="btn default btn-file"> <span
							class="fileinput-new"> Select Profile Picture </span> <input
							type="file" id="file_1" name="file_1" name="...">
						</span>
					</div>
				</div>
			</div>

		</section>
	</div>

	<br>
	<div class="portlet-title">
		<div class="caption font-green">
			<i class="icon-pin font-green"></i> <span
				class="caption-subject bold uppercase"> Choose modules</span>
		</div>

	</div>
	<br> <br>
	<div class="row">
		<section class="col-md-8">
			<div class="col-md-4">
				<div class="fieldcontain">
					<label for="smsSenderId"> <g:message
							code="admin.smsSenderId.label" default="1.Student Management" />
					</label> <input type="checkbox" name="module" checked="checked"
						readonly="readonly" value="Student Management" />
				</div>
			</div>

			<div class="col-md-4">
				<div class="fieldcontain">
					<label for="smsSenderId"> <g:message
							code="admin.smsSenderId.label" default="2.Library Management" />
					</label>

					<g:if
						test="${adminInstance?.modules?.moduleName?.contains('library')}">
						<input type="checkbox" name="module" class="form-control"
							checked="checked" value="Library Management" />
					</g:if>
					<g:else>
						<input type="checkbox" name="module" class="form-control"
							value="Library Management" />
					</g:else>
				</div>
			</div>


			<div class="col-md-4">
				<div class="fieldcontain">
					<label for="smsSenderId"> <g:message
							code="admin.smsSenderId.label" default="3.Transport Management" />
					</label>

					<g:if
						test="${adminInstance?.modules?.moduleName?.contains('transport')}">
						<input type="checkbox" name="module" class="form-control"
							checked="checked" value="Transport Management" />
					</g:if>
					<g:else>
						<input type="checkbox" name="module" class="form-control"
							value="Transport Management" />
					</g:else>


				</div>
			</div>

			<br> <br>
			<div class="col-md-4">
				<div class="fieldcontain">
					<label for="smsSenderId"> <g:message
							code="admin.smsSenderId.label" default="4.HR" />
					</label>

					<g:if
						test="${adminInstance?.modules?.moduleName?.contains('payroll')}">
						<input type="checkbox" name="module" class="form-control"
							checked="checked" value="HR" />
					</g:if>
					<g:else>
						<input type="checkbox" name="module" class="form-control"
							value="HR" />
					</g:else>


				</div>
			</div>

			<div class="col-md-4">
				<div class="fieldcontain">
					<label for="smsSenderId"> <g:message
							code="admin.smsSenderId.label" default="5.Exam" />
					</label>

					<g:if
						test="${adminInstance?.modules?.moduleName?.contains('Exams')}">
						<input type="checkbox" name="module" class="form-control"
							checked="checked" value="Exam" />
					</g:if>
					<g:else>
						<input type="checkbox" name="module" class="form-control"
							value="Exam" />
					</g:else>


				</div>
			</div>

			<div class="col-md-4">
				<div class="fieldcontain">
					<label for="smsSenderId"> <g:message
							code="admin.smsSenderId.label" default="6.Time Table" />
					</label>
					<g:if
						test="${adminInstance?.modules?.moduleName?.contains('timetable')}">
						<input type="checkbox" name="module" class="form-control"
							checked="checked" value="Time Table" />
					</g:if>
					<g:else>
						<input type="checkbox" name="module" class="form-control"
							value="Time Table" />
					</g:else>
				</div>
			</div>
			<br> <br>
			<div class="col-md-4">
				<div class="fieldcontain">
					<label for="smsSenderId"> <g:message
							code="admin.smsSenderId.label" default="7.Attendance" />
					</label>
					<g:if
						test="${adminInstance?.modules?.moduleName?.contains('attendence')}">
						<input type="checkbox" name="module" class="form-control"
							checked="checked" value="Attendance Management" />
					</g:if>
					<g:else>
						<input type="checkbox" name="module" class="form-control"
							value="Attendance Management" />
					</g:else>
				</div>
			</div>
			<div class="col-md-4">
				<div class="fieldcontain">
					<label for="smsSenderId"> <g:message
							code="admin.smsSenderId.label" default="8.Certificates" />
					</label>
					<g:if
						test="${adminInstance?.modules?.moduleName?.contains('certificates')}">
						<input type="checkbox" name="module" class="form-control"
							checked="checked" value="Certificates" />
					</g:if>
					<g:else>
						<input type="checkbox" name="module" class="form-control"
							value="Certificates" />
					</g:else>
				</div>
			</div>

		</section>
	</div>
	<br> <br>
	<div class="row">
		<div class="col-md-3">
			<div class="caption font-green">
				<i class="icon-pin font-green"></i> <span
					class="caption-subject bold uppercase"> Payment</span>
			</div>
			<br> <select name="payType" class="form-control"
				onchange="showDiv(this)">
				<option value="null">Select Payment Type</option>
				<option value="cash">By Cash</option>
				<option value="online">Online</option>
			</select>
		</div>

		<div class="col-md-3">
			<div class="caption font-green">
				<i class="icon-pin font-green"></i> <span
					class="caption-subject bold uppercase"> Amount</span>
			</div>
			<br> <input type="text" name="payamt" value=""
				placeholder="Amount" class="form-control">
		</div>


	</div>


</div>

<script>
	function showDiv(elem) {
		if (elem.value == 'online') {
			document.getElementById('online').style.display = "block";
			document.getElementById('cash').style.display = "none";
		} else {
			document.getElementById('online').style.display = "none";
			document.getElementById('cash').style.display = "block";
		}
	}
</script>