<%@ page import="com.hiideals.transport.VehicleDetails"%>

<div class="form-body">

	<div class="row">
		<div class="col-md-3">

			<div
				class="fieldcontain ${hasErrors(bean: vehicleDetailsInstance, field: 'vehicleNo', 'error')} ">
				<label for="vehicleNo"> <g:message
						code="vehicleDetails.vehicleNo.label" default="Vehicle No" />

				</label>
				<g:textField name="vehicleNo" class="form-control"
					required="required" id="vehicleNo"
					value="${vehicleDetailsInstance?.vehicleNo}" />
			</div>
			<div id="VvehicleNo" style="display: none; color: red;">Provide
				Your Vehicle Number</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: vehicleDetailsInstance, field: 'noOfSeats', 'error')} ">
				<label for="noOfSeats"> <g:message
						code="vehicleDetails.noOfSeats.label" default="No Of Seats" />

				</label>
				<g:textField name="noOfSeats" class="form-control" id="noOfSeats"
					value="${vehicleDetailsInstance?.noOfSeats}" />

			</div>
			<div id="VnoOfSeats" style="display: none; color: red">Provide
				your Number of Seats</div>
			<div id="VnoOfSeats1" style="display: none; color: red">Number
				of Seats should be allowed only number</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: vehicleDetailsInstance, field: 'maxiumAllowed', 'error')} ">
				<label for="maxiumAllowed"> <g:message
						code="vehicleDetails.maxiumAllowed.label" default="Maxium Allowed" />

				</label>
				<g:textField name="maxiumAllowed" class="form-control"
					required="required" id="maxiumAllowed"
					value="${vehicleDetailsInstance?.maxiumAllowed}" />

			</div>
			<div id="VmaxiumAllowed" style="display: none; color: red">
				Provide your maxium Allowed seats</div>
			<div id="VmaxiumAllowed1" style="display: none; color: red">should
				be allowed only number</div>
		</div>

		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: vehicleDetailsInstance, field: 'vehicleType', 'error')} ">
				<label for="vehicleType"> <g:message
						code="vehicleDetails.vehicleType.label" default="Vehicle Type" />

				</label>
				<g:textField name="vehicleType" class="form-control"
					required="required" id="vehicleType"
					value="${vehicleDetailsInstance?.vehicleType}" />

			</div>
			<div id="VvehicleType" style="display: none; color: red;">Provide
				Your Vehicle Type</div>
		</div>
	</div>
</div>
<div class="form-body">
	<div class="row">
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: vehicleDetailsInstance, field: 'contactPerson', 'error')} ">
				<label for="contactPerson"> <g:message
						code="vehicleDetails.contactPerson.label" default="Contact Person" />

				</label>
				<g:textField name="contactPerson" class="form-control"
					required="required" id="contactPerson"
					value="${vehicleDetailsInstance?.contactPerson}" />

			</div>
			<div id="VcontactPerson" style="display: none; color: red;">Provide
				Your contact Person name</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: vehicleDetailsInstance, field: 'insuranceRenewalDate', 'error')} ">
				<label for="insuranceRenewalDate"> <g:message
						code="vehicleDetails.insuranceRenewalDate.label"
						default="Insurance Renewal Date" />

				</label> <input name="insuranceRenewalDate1"
					class="form-control date-picker" id="insuranceRenewalDate1"
					value="${formatDate(format:'MM/dd/yyyy',date:vehicleDetailsInstance?.insuranceRenewalDate)}" />
			</div>
			<div id="VinsuranceRenewalDate1" style="display: none; color: red;">Select
				your Date</div>
			<div id="VinsuranceRenewalDate2" style="display: none; color: red;">Date
				should be this format "mm/dd/yyyy"</div>

		</div>
	</div>
</div>
