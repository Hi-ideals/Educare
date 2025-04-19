<%@ page import="com.hiideals.instituite.helper.Address"%>



<div class="form-body">
	<div class="row">
		<div class="col-md-4">
			<div class="form-group form-md-line-input form-md-floating-label">
				<div
					class="fieldcontain ${hasErrors(bean: addressInstance, field: 'phno', 'error')} ">
					
					<g:textField name="phno" class="form-control" value="${addressInstance?.phno}" />
					<label for="phno"> <g:message code="address.phno.label"
							default="Phno" />

					</label>

				</div>
			</div>
		</div>
		<div class="col-md-4">
			<div class="form-group form-md-line-input form-md-floating-label">
				<div
					class="fieldcontain ${hasErrors(bean: addressInstance, field: 'mobileNumber', 'error')} ">
					
					<g:textField name="mobileNumber" class="form-control"
						value="${addressInstance?.mobileNumber}" />
						<label for="mobileNumber"> <g:message
							code="address.mobileNumber.label" default="Mobile Number" />

					</label>

				</div>
			</div>
		</div>
		<div class="col-md-4">
			<div class="form-group form-md-line-input form-md-floating-label">
				<div
					class="fieldcontain ${hasErrors(bean: addressInstance, field: 'nationality', 'error')} ">
					
					<g:textField name="nationality" class="form-control"
						value="${addressInstance?.nationality}" />
						<label for="nationality"> <g:message
							code="address.nationality.label" default="Nationality" />

					</label>

				</div>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-md-4">
			<div class="form-group form-md-line-input form-md-floating-label">
				<div
					class="fieldcontain ${hasErrors(bean: addressInstance, field: 'bloodgroup', 'error')} ">
					
					<g:textField name="bloodgroup" class="form-control"
						value="${addressInstance?.bloodgroup}" />
						<label for="bloodgroup"> <g:message
							code="address.bloodgroup.label" default="Bloodgroup" />

					</label>

				</div>
			</div>
		</div>
		<div class="col-md-4">
			<div class="form-group form-md-line-input form-md-floating-label">
				<div
					class="fieldcontain ${hasErrors(bean: addressInstance, field: 'motherTongue', 'error')} ">
					
					<g:textField name="motherTongue" class="form-control"
						value="${addressInstance?.motherTongue}" />
						<label for="motherTongue"> <g:message
							code="address.motherTongue.label" default="Mother Tongue" />

					</label>

				</div>
			</div>
		</div>
		<div class="col-md-4">
			<div class="form-group form-md-line-input form-md-floating-label">
				<div
					class="fieldcontain ${hasErrors(bean: addressInstance, field: 'religion', 'error')} ">
					
					<g:textField name="religion" class="form-control" value="${addressInstance?.religion}" />
						<label for="religion"> <g:message
							code="address.religion.label" default="Religion" />

					</label>
				</div>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-md-4">
			<div class="form-group form-md-line-input form-md-floating-label">
				<div
					class="fieldcontain ${hasErrors(bean: addressInstance, field: 'city', 'error')} required">
					
					<g:textField name="city" required="" class="form-control"
						value="${addressInstance?.city}" />
						<label for="city"> <g:message code="address.city.label"
							default="City" /> <span class="required-indicator">*</span>
					</label>

				</div>
			</div>
		</div>
		<div class="col-md-4">
			<div class="form-group form-md-line-input form-md-floating-label">
				<div
					class="fieldcontain ${hasErrors(bean: addressInstance, field: 'country', 'error')} required">
					
					<g:textField name="country" required="" class="form-control"
						value="${addressInstance?.country}" />
						<label for="country"> <g:message
							code="address.country.label" default="Country" /> <span
						class="required-indicator">*</span>
					</label>

				</div>
			</div>
		</div>
		<div class="col-md-4">
			<div class="form-group form-md-line-input form-md-floating-label">
				<div
					class="fieldcontain ${hasErrors(bean: addressInstance, field: 'hsno', 'error')} required">
					
					<g:textField name="hsno" required="" class="form-control"
						value="${addressInstance?.hsno}" />
						<label for="hsno"> <g:message code="address.hsno.label"
							default="Hsno" /> <span class="required-indicator">*</span>
					</label>

				</div>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-md-4">
			<div class="form-group form-md-line-input form-md-floating-label">
				<div
					class="fieldcontain ${hasErrors(bean: addressInstance, field: 'state', 'error')} required">
					
					<g:textField name="state" required="" class="form-control"
						value="${addressInstance?.state}" />
						<label for="state"> <g:message code="address.state.label"
							default="State" /> <span class="required-indicator">*</span>
					</label>

				</div>
			</div>
		</div>
		<div class="col-md-4">
			<div class="form-group form-md-line-input form-md-floating-label">
				<div
					class="fieldcontain ${hasErrors(bean: addressInstance, field: 'street', 'error')} required">
					
					<g:textField name="street" required="" class="form-control"
						value="${addressInstance?.street}" />
						<label for="street"> <g:message code="address.street.label"
							default="Street" /> <span class="required-indicator">*</span>
					</label>

				</div>
			</div>

		</div>
	</div>
</div>
