<%@ page import="com.hiideals.instituite.helper.Address"%>



<div class="form-body">
	<div class="row">
<div class="col-md-3">
	<div
		class="fieldcontain ${hasErrors(bean: schoolAddressInstance, field: 'hsno', 'error')} required">
		<label for="hsno"> <g:message code="address.hsno.label"
				default="House number" /> <span class="required-indicator">*</span>
		</label>
		<g:textField name="schoolAddress.hsno" required="" id="schoolAddress"
			class="form-control" value="${schoolAddressInstance?.hsno}" />
	</div>
	<div id="EschoolAddress" style="display: none; color: red">
		Provide your House number</div>
</div>


<div class="col-md-3">
	<div
		class="fieldcontain ${hasErrors(bean: schoolAddressInstance, field: 'street', 'error')} required">
		<label for="street"> <g:message code="address.street.label"
				default="Street" /> <span class="required-indicator">*</span>
		</label>
		<g:textField name="schoolAddress.street" required="" id="SStreet"
			class="form-control" value="${schoolAddressInstance?.street}" />
	</div>
	<div id="ESStreet" style="display: none; color: red">Provide your
		Street</div>
</div>



<div class="col-md-3">
	<div
		class="fieldcontain ${hasErrors(bean: schoolAddressInstance, field: 'city', 'error')} required">
		<label for="city"> <g:message code="address.city.label"
				default="City" /> <span class="required-indicator">*</span>
		</label>
		<g:textField name="schoolAddress.city" required="" id="SCity"
			class="form-control" value="${schoolAddressInstance?.city}" />
	</div>
	<div id="ESCity" style="display: none; color: red">Provide your
		City</div>
</div>


<div class="col-md-3">
	<div
		class="fieldcontain ${hasErrors(bean: schoolAddressInstance, field: 'state', 'error')} required">
		<label for="state"> <g:message code="address.state.label"
				default="State" /> <span class="required-indicator">*</span>
		</label>
		<g:textField name="schoolAddress.state" required="" id="SState"
			class="form-control" value="${schoolAddressInstance?.state}" />
	</div>
	<div id="ESState" style="display: none; color: red">Provide your
		State</div>
</div>
</div>
</div>
<div class="form-body">
<div class="row">
<div class="col-md-3">
	<div
		class="fieldcontain ${hasErrors(bean: schoolAddressInstance, field: 'country', 'error')} required">
		<label for="country"> <g:message code="address.country.label"
				default="Country" /> <span class="required-indicator">*</span>
		</label>
		<g:textField name="schoolAddress.country" required="" id="Scountry"
			class="form-control" value="${schoolAddressInstance?.country}" />
	</div>
	<div id="EScountry" style="display: none; color: red">Provide
		your country</div>
</div>


<div class="col-md-3">
	<div
		class="fieldcontain ${hasErrors(bean: schoolAddressInstance, field: 'phno', 'error')} ">
		<label for="phno"> <g:message code="address.phno.label"
				default="Phone Number" />
		</label>
		<g:textField name="schoolAddress.phno" class="form-control"
			value="${schoolAddressInstance?.phno}" />
	</div>
</div>


<div class="col-md-3">
	<div
		class="fieldcontain ${hasErrors(bean: schoolAddressInstance, field: 'mobileNumber', 'error')} ">
		<label for="mobileNumber"> <g:message
				code="address.mobileNumber.label" default="Mobile Number" />
		</label>
		<g:textField name="schoolAddress.mobileNumber" class="form-control"
			value="${schoolAddressInstance?.mobileNumber}" />
	</div>
</div>
</div>
</div>


