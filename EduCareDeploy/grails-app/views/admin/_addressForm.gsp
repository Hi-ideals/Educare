


<div class="form-body">
	<div class="row">
		<div class="col-md-4">
			<div
				class="fieldcontain ${hasErrors(bean: adminInstance.address, field: 'hsno', 'error')} required">
				<label for="hsno"> <g:message code="address.hsno.label"
						default="Building No." /> <span class="required-indicator">*</span>
				</label>

				<g:textField name="address.hsno" required="" class="form-control"
					value="${adminInstance.address?.hsno}" />
			</div>
		</div>


		<div class="col-md-4">
			<div
				class="fieldcontain ${hasErrors(bean: adminInstance.address, field: 'street', 'error')} required">
				<label for="street"> <g:message code="address.street.label"
						default="Street" /> <span class="required-indicator">*</span>
				</label>
				<g:textField name="address.street" required="" class="form-control"
					value="${adminInstance.address?.street}" />
			</div>
		</div>

		<div class="col-md-4">
			<div
				class="fieldcontain ${hasErrors(bean: adminInstance.address, field: 'city', 'error')} required">
				<label for="city"> <g:message code="address.city.label"
						default="City" /> <span class="required-indicator">*</span>
				</label>
				<g:textField name="address.city" required="" class="form-control"
					value="${adminInstance.address?.city}" />
			</div>
		</div>

	</div>
</div>
<div class="form-body">
	<div class="row">
		<div class="col-md-4">
			<div
				class="fieldcontain ${hasErrors(bean: adminInstance.address, field: 'state', 'error')} required">
				<label for="state"> <g:message code="address.state.label"
						default="State" /> <span class="required-indicator">*</span>
				</label>
				<g:textField name="address.state" required="" class="form-control"
					value="${adminInstance.address?.state}" />
			</div>
		</div>

		<div class="col-md-4">
			<div
				class="fieldcontain ${hasErrors(bean: adminInstance.address, field: 'country', 'error')} required">
				<label for="country"> <g:message
						code="address.country.label" default="Country" /> <span
					class="required-indicator">*</span>
				</label>

				<g:textField name="address.country" required="" class="form-control"
					value="${adminInstance.address?.country}" />
			</div>
		</div>


		<div class="col-md-4">
			<div
				class="fieldcontain ${hasErrors(bean: adminInstance.address, field: 'mobileNumber', 'error')} ">
				<label for="mobileNumber"> <g:message
						code="address.mobileNumber.label" default="Mobile Number" />
				</label>
				<g:textField name="address.mobileNumber" class="form-control"
					value="${adminInstance.address?.mobileNumber}" />
			</div>
		</div>
	</div>
</div>
