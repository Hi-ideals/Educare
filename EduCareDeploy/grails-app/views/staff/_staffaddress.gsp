<%@ page import="com.hiideals.instituite.helper.Address"%>
<div class="form-body">
	<div class="row">
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: addressInstance, field: 'hsno', 'error')} required">
				<label for="hsno"> <g:message code="address.hsno.label"
						default="House Number" /> <span class="required-indicator">*</span>
				</label>
				<g:textField name="address.hsno" required="" class="form-control"
					value="${addressInstance?.hsno}" id="address" />
			</div>
			<div id="Saddress" style="display: none; color: red">Provide
				your House number</div>
		</div>


		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: addressInstance, field: 'street', 'error')} required">
				<label for="street"> <g:message code="address.street.label"
						default="Street" /> <span class="required-indicator">*</span>
				</label>
				<g:textField name="address.street" required="" class="form-control"
					value="${addressInstance?.street}" id="Street" />
			</div>
			<div id="SStreet" style="display: none; color: red">Provide
				your Street</div>
		</div>



		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: addressInstance, field: 'city', 'error')} required">
				<label for="city"> <g:message code="address.city.label"
						default="City" /> <span class="required-indicator">*</span>
				</label>
				<g:textField name="address.city" required="" class="form-control"
					value="${addressInstance?.city}" id="City" />
			</div>
			<div id="SCity" style="display: none; color: red">Provide your
				City</div>
		</div>


		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: addressInstance, field: 'state', 'error')} required">
				<label for="state"> <g:message code="address.state.label"
						default="State" /> <span class="required-indicator">*</span>
				</label>
				<g:textField name="address.state" required="" class="form-control"
					value="${addressInstance?.state}" id="State" />
			</div>
			<div id="SState" style="display: none; color: red">Provide your
				State</div>
		</div>
	</div>
</div>
<div class="form-body">
	<div class="row">
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: addressInstance, field: 'country', 'error')} required">
				<label for="country"> <g:message
						code="address.country.label" default="Country" /> <span
					class="required-indicator">*</span>
				</label>
				<g:textField name="address.country" required="" class="form-control"
					value="${addressInstance?.country}" id="Country" />
			</div>
			<div id="SCountry" style="display: none; color: red">Provide
				your Country</div>
		</div>


		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: addressInstance, field: 'phno', 'error')} ">
				<label for="phno"> <g:message code="address.phno.label"
						default="Phone Number" />

				</label>
				<g:textField name="address.phno" id="phone" class="form-control"
					value="${addressInstance?.phno}" />
			</div>
			<div id="Sphone" style="display: none; color: red">Provide your
				Phone Number</div>
		</div>

		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: addressInstance, field: 'mobileNumber', 'error')} ">
				<label for="mobileNumber"> <g:message
						code="address.mobileNumber.label" default="Mobile Number" />
				</label>
				<g:textField name="address.mobileNumber" class="form-control"
					value="${addressInstance?.mobileNumber}" />
			</div>
		</div>



