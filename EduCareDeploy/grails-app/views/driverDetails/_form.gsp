<%@ page import="com.hiideals.transport.DriverDetails"%>


<div class="form-body">
	<div class="row">
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: driverDetailsInstance, field: 'vehicle', 'error')} ">
				<label for="vehicle"> <g:message
						code="driverDetails.vehicle.label" default="Vehicle" />

				</label> <select id="vehicle" class="form-control" name="vehicle.id"
					class="many-to-one">
					<g:if test="${driverDetailsInstance?.vehicle}">
						<option value="${driverDetailsInstance?.vehicle?.id}">
							${driverDetailsInstance?.vehicle?.vehicleNo}
						</option>
					</g:if>
					<g:else>
						<option value="">select vehicle</option>
					</g:else>
					<g:each in="${vecal}">
						<option value="${it?.id}">
							${it?.vehicleNo}
						</option>
					</g:each>
				</select>
			</div>
			<div id="Vvehicle" style="display: none; color: red;">Select
				your Vehicle Number</div>
		</div>

		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: driverDetailsInstance, field: 'name', 'error')} ">
				<label for="name"> <g:message
						code="driverDetails.name.label" default="Name" />

				</label>
				<g:textField name="name" class="form-control" id="namedriver"
					value="${driverDetailsInstance?.name}" />

			</div>
			<div id="Vnamedriver" style="display: none; color: red;">Provide
				your name</div>
		</div>

		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: driverDetailsInstance?.presentAddress?.hsno, field: 'hsno', 'error')} ">
				<label for="name"> <g:message
						code="driverDetailsInstance?.presentAddress?.hsno.label"
						default="Hs No" />

				</label>
				<g:textField name="hsno" class="form-control" id="hsno"
					value="${driverDetailsInstance?.presentAddress?.hsno}" />

			</div>
			<div id="Vhsno" style="display: none; color: red;">Provide your
				House Number</div>
		</div>

		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: driverDetailsInstance?.presentAddress?.street, field: 'street', 'error')} ">
				<label for="name"> <g:message
						code="driverDetailsInstance?.presentAddress?.street.label"
						default="Street" />

				</label>
				<g:textField name="street" class="form-control" id="street"
					value="${driverDetailsInstance?.presentAddress?.street}" />

			</div>
			<div id="Vstreet" style="display: none; color: red;">Provide
				your Street</div>
		</div>
	</div>
</div>
<div class="form-body">
	<div class="row">
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: driverDetailsInstance?.presentAddress?.city, field: 'city', 'error')} ">
				<label for="name"> <g:message
						code="driverDetailsInstance?.presentAddress?.city.label"
						default="City" />

				</label>
				<g:textField name="city" class="form-control" id="city"
					value="${driverDetailsInstance?.presentAddress?.city}" />

			</div>
			<div id="Vcity" style="display: none; color: red;">Provide your
				City</div>
		</div>

		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: driverDetailsInstance?.presentAddress?.state, field: 'state', 'error')} ">
				<label for="name"> <g:message
						code="driverDetailsInstance?.presentAddress?.state.label"
						default="State" />

				</label>
				<g:textField name="state" class="form-control" id="state"
					value="${driverDetailsInstance?.presentAddress?.state}" />
			</div>
			<div id="Vstate" style="display: none; color: red;">Provide
				your State</div>
		</div>

		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: driverDetailsInstance?.presentAddress?.country, field: 'country', 'error')} ">
				<label for="name"> <g:message
						code="driverDetailsInstance?.presentAddress?.country.label"
						default="Country" />

				</label>
				<g:textField name="country" class="form-control" id="country"
					value="${driverDetailsInstance?.presentAddress?.country}" />

			</div>
			<div id="Vcountry" style="display: none; color: red;">Provide
				your Country</div>
		</div>

		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: driverDetailsInstance?.presentAddress?.phno, field: 'phno', 'error')} ">
				<label for="name"> <g:message
						code="driverDetailsInstance?.presentAddress?.phno.label"
						default="Ph No" />

				</label>
				<g:textField name="phone" class="form-control" id="phno"
					value="${driverDetailsInstance?.phone}" />
			</div>
			<div id="Vphno" style="display: none; color: red;">Provide your
				Phone Number</div>
		</div>
	</div>
</div>

<div class="form-body">
	<div class="row">
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: driverDetailsInstance, field: 'dob', 'error')} ">
				<label for="dob"> <g:message code="driverDetails.dob.label"
						default="DoB" />

				</label> <input name="dob1" precision="day" class="form-control date-picker"
					id="dob1" default="none"
					value="${formatDate(format:'MM/dd/yyyy',date:driverDetailsInstance?.dob)}"
					noSelection="['': '']" />

			</div>
			<div id="Vdob1" style="display: none; color: red;">Provide your
				Date of Birth</div>
				<div id="Vdob2" style="display: none; color: red;">Date
				should be this format "mm/dd/yyyy"</div>
		</div>

		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: driverDetailsInstance, field: 'licenseNumber', 'error')} ">
				<label for="licenseNumber"> <g:message
						code="driverDetails.licenseNumber.label" default="License Number" />

				</label>
				<g:textField name="licenseNumber" class="form-control"
					id="licenseNumber" value="${driverDetailsInstance?.licenseNumber}" />
			</div>
			<div id="VlicenseNumber" style="display: none; color: red;">Provide
				your License Numbe</div>
		</div>
	</div>
</div>

