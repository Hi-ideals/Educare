<%@ page import="com.hiideals.instituite.helper.Address"%>



<div class="form-body">
	<div class="row">
		<div class="col-md-3">
			<label>House Number</label>
			<div
				class="fieldcontain ${hasErrors(bean: studentInstance.presentAddress, field: 'hsno', 'error')} ">

				<g:textField name="${addr}.hsno"  class="form-control"
					value="${address?.hsno}" />
				<!-- <label for="hsno"> <g:message code="address.hsno.label"
							default="House Number" /> <span class="required-indicator" style="color:red">*</span>
					</label>-->
			</div>
			
		</div>

		<div class="col-md-3">
			<label>Street</label>
			<div
				class="fieldcontain ${hasErrors(bean: studentInstance.presentAddress, field: 'street', 'error')} ">

				<g:textField name="${addr}.street" class="form-control"
					value="${address?.street}" />
				<!-- <label for="street"> <g:message code="address.street.label"
							default="Street" /> <span class="required-indicator" style="color:red">*</span>
					</label>-->
			</div>
			<%--<div id="St${addr}" style="display: none; color: red">Provide
				your Street</div>
		--%></div>


		<div class="col-md-3">
			<label>City</label>
			<div
				class="fieldcontain ${hasErrors(bean: studentInstance.presentAddress, field: 'city', 'error')} ">

				<g:textField name="${addr}.city"  class="form-control"
					value="${address?.city}" />
				<!-- <label for="city"> <g:message code="address.city.label"
							default="City" /> <span class="required-indicator" style="color:red">*</span>
					</label>-->
			</div>
			<%--<div id="C${addr}" style="display: none; color: red">Provide
				your City</div>
		--%></div>

		<div class="col-md-3">
			<label>State</label>
			<div
				class="fieldcontain ${hasErrors(bean: studentInstance.presentAddress, field: 'state', 'error')} ">

				<g:textField name="${addr}.state" class="form-control"
					 value="${address?.state}" />
				<!-- <label for="state"> <g:message code="address.state.label"
							default="State" /> <span class="required-indicator" style="color:red">*</span>
					</label>-->
			</div>
			<%--<div id="Stat${addr}" style="display: none; color: red">Provide
				your State</div>
		--%></div>
	</div>
</div>

<div class="form-body">
	<div class="row">
		<div class="col-md-3">

			<label>Country</label>
			<div
				class="fieldcontain ${hasErrors(bean: studentInstance.presentAddress, field: 'country', 'error')} ">

				<g:textField name="${addr}.country"  class="form-control"
					 value="${address?.country}" />
				<!-- <label for="country"> <g:message
							code="address.country.label" default="Country" /> <span
						class="required-indicator" style="color:red">*</span>
					</label>-->
			</div>
			<%--<div id="Cou${addr}" style="display: none; color: red">Provide
				your Country</div>
		--%></div>
		
		<div class="col-md-3">
			<label>Pin Code</label>
			<div
				class="fieldcontain ${hasErrors(bean: studentInstance.presentAddress, field: 'pinCode', 'error')} ">

				<g:textField name="${addr}.pinCode" class="form-control"
				value="${address?.pinCode}" />
				<!-- <label for="country"> <g:message
							code="address.country.label" default="Country" /> <span
						class="required-indicator" style="color:red">*</span>
					</label>-->
			</div>
			<%--<div id="pin${addr}" style="display: none; color: red">Provide
				your Pin Code</div>
		--%></div>


		<div class="col-md-3">
			<label>LandLine Number</label>
			<div
				class="fieldcontain ${hasErrors(bean: studentInstance.presentAddress, field: 'phno', 'error')} ">

				<g:textField name="${addr}.phno" class="form-control"
					value="${address?.phno}"  />
				<!-- <label for="phno"> <g:message code="address.phno.label"
							default="Phone Number" />

					</label>-->

			</div>
		</div>

		<div class="col-md-3">
			<label>Mobile Number</label>
			<div
				class="fieldcontain ${hasErrors(bean: studentInstance.presentAddress, field: 'mobileNumber', 'error')} ">

				<g:textField name="${addr}.mobileNumber" class="form-control"
					 value="${address?.mobileNumber}" maxlength="10"/>
				<!-- <label for="mobileNumber"> <g:message
							code="address.mobileNumber.label" default="Mobile Number" />

					</label>-->

			</div>
		</div>
	</div>
</div>

<div class="row"></div>
<div class="row"></div>
<div class="row"></div>



