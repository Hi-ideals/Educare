


<div class="form-body">
	<div class="row">
		<div class="col-md-4">
			<div
				class="fieldcontain ${hasErrors(bean: userListInstance.address, field: 'hsno', 'error')} required">
				<label for="hsno"> <g:message code="hsno.label"
						default="Building No." /> <span class="required-indicator">*</span>
				</label>
				<g:textField name="hsno" required="" class="form-control" id="hsno"
					value="${userListInstance.address?.hsno}" />
			</div>
			<div id="Chsno" style="display: none; color: red">Provide your
				House Number</div>
		</div>


		<div class="col-md-4">
			<div
				class="fieldcontain ${hasErrors(bean: userListInstance.address, field: 'street', 'error')} required">
				<label for="street"> <g:message code="street.label"
						default="Street" /> <span class="required-indicator">*</span>
				</label>
				<g:textField name="street" required="" class="form-control" id="street"
					value="${userListInstance.address?.street}" />
			</div>
			<div id="Cstreet" style="display: none; color: red">Provide your
				Street</div>
		</div>

		<div class="col-md-4">
			<div
				class="fieldcontain ${hasErrors(bean: userListInstance.address, field: 'city', 'error')} required">
				<label for="city"> <g:message code="city.label"
						default="City" /> <span class="required-indicator">*</span>
				</label>
				<g:textField name="city" required="" class="form-control" id="city"
					value="${userListInstance.address?.city}" />
			</div>
			<div id="Ccity" style="display: none; color: red">Provide your
				City</div>
		</div>

	</div>
</div>
<div class="form-body">
	<div class="row">
		<div class="col-md-4">
			<div
				class="fieldcontain ${hasErrors(bean: userListInstance.address, field: 'state', 'error')} required">
				<label for="state"> <g:message code="state.label"
						default="State" /> <span class="required-indicator">*</span>
				</label>
				<g:textField name="state" required="" class="form-control" id="state"
					value="${userListInstance.address?.state}" />
			</div>
			<div id="Cstate" style="display: none; color: red">Provide your
				State</div>
		</div>

		<div class="col-md-4">
			<div
				class="fieldcontain ${hasErrors(bean: userListInstance.address, field: 'country', 'error')} required">
				<label for="country"> <g:message code="country.label"
						default="Country" /> <span class="required-indicator">*</span>
				</label>

				<g:textField name="country" required="" class="form-control" id="country"
					value="${userListInstance.address?.country}" />
			</div>
			<div id="Ccountry" style="display: none; color: red">Provide your
				country</div>
		</div>


		<div class="col-md-4">
			<div
				class="fieldcontain ${hasErrors(bean: userListInstance.address, field: 'mobileNumber', 'error')} ">
				<label for="mobileNumber"> <g:message
						code="mobileNumber.label" default="Mobile Number" />
				</label>
				<g:textField name="mobileNumber" class="form-control" id="mobileNumber"
					value="${userListInstance.address?.mobileNumber}" />
			</div>
			<div id="CmobileNumber" style="display: none; color: red">Provide your
				Mobile Number</div>
		</div>
	</div>
</div>
<div class="form-body">
	<div class="row">
<div class="col-md-4">
			<div
				class="fieldcontain ${hasErrors(bean: userListInstance.address, field: 'pinCode', 'error')} ">
				<label for="pinCode"> <g:message
						code="pinCode.label" default="Pincode" />
				</label>
				<g:textField name="pinCode" class="form-control" id="pinCode"  required="required"
					value="${userListInstance.address?.pinCode}" />
			</div>
		
		</div>
	</div>
	</div>
<br>