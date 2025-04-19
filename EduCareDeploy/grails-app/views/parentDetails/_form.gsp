<%@ page import="com.hiideals.instituite.student.ParentDetails"%>


<div class="form-body">
	<div class="row">
	
	<div class="col-md-4">
			<div class="form-group form-md-line-input form-md-floating-label">

				<div
					class="fieldcontain ${hasErrors(bean: parentDetailsInstance, field: 'parentName', 'error')} required">
					<g:textField name="${petails}.parentName" class="form-control" required=""
						value="${parentDetailsInstance?.parentName}" />
					<label for="parentName"> <g:message
							code="parentDetails.parentName.label" default="${parent} Name" /> <span
						class="required-indicator">*</span>
					</label>

				</div>
			</div>
		</div>
		
		<div class="col-md-4">
			<div class="form-group form-md-line-input form-md-floating-label">

				<div
					class="fieldcontain ${hasErrors(bean: parentDetailsInstance, field: 'occupation', 'error')} required">
					<g:textField name="${petails}.occupation" class="form-control" required=""
						value="${parentDetailsInstance?.occupation}" />
					<label for="occupation"> <g:message
							code="parentDetails.occupation.label" default="Occupation" /> <span
						class="required-indicator">*</span>
					</label>

				</div>
			</div>
		</div>
	
		<div class="col-md-4">
			<div class="form-group form-md-line-input form-md-floating-label">
				<div
					class="fieldcontain ${hasErrors(bean: parentDetailsInstance, field: 'mobileNumber', 'error')} ">
					<g:textField name="${petails}.mobileNumber" class="form-control"
						value="${parentDetailsInstance?.mobileNumber}" />
					<label for="mobileNumber"> <g:message
							code="parentDetails.mobileNumber.label" default="Mobile Number" />

					</label>

				</div>
			</div>
		</div>
		
		
	</div>
	<div class="row">
		<div class="col-md-4">
			<div class="form-group form-md-line-input form-md-floating-label">
				<div
					class="fieldcontain ${hasErrors(bean: parentDetailsInstance, field: 'relation', 'error')} required">
					<g:textField name="${petails}.relation" class="form-control" required=""
						value="${parentDetailsInstance?.relation}" />
					<label for="relation"> <g:message
							code="parentDetails.relation.label" default="Relation" /> <span
						class="required-indicator">*</span>
					</label>

				</div>
			</div>
		</div>
		
</div>

	</div>
