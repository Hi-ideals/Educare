<%@ page import="com.hiideals.transport.RouteDetails"%>
<div class="form-body">
	<div class="row">
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: routeDetailsInstance, field: 'vehicle', 'error')} ">
				<label for="vehicle"> <g:message
						code="routeDetails.vehicle.label" default="Vehicle" />
				</label> <select id="vehicle1" class="form-control" name="vehicle.id"
					class="many-to-one">
					<g:if test="${routeDetailsInstance?.vehicle}">
						<option value="${routeDetailsInstance?.vehicle?.id}">
							${routeDetailsInstance?.vehicle?.vehicleNo}
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
			<div id="Vvehicle1" style="display: none; color: red;">Select
				your Vehicle Number</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: routeDetailsInstance, field: 'routeCode', 'error')} ">
				<label for="routeCode"> <g:message
						code="routeDetails.routeCode.label" default="Route Code" />

				</label>
				<g:textField name="routeCode" class="form-control" id="routeCode"
					value="${routeDetailsInstance?.routeCode}" />

			</div>
			<div id="VrouteCode" style="display: none; color: red;">Provide
				your Route Code</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: routeDetailsInstance, field: 'startPlace', 'error')} ">
				<label for="startPlace"> <g:message
						code="routeDetails.startPlace.label" default="Start Place" />

				</label>
				<g:textField name="startPlace" class="form-control" id="startPlace"
					value="${routeDetailsInstance?.startPlace}" />

			</div>
			<div id="VstartPlace" style="display: none; color: red;">Provide
				your Start Place</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: routeDetailsInstance, field: 'stopPlace', 'error')} ">
				<label for="stopPlace"> <g:message
						code="routeDetails.stopPlace.label" default="Stop Place" />

				</label>
				<g:textField name="stopPlace" class="form-control" id="stopPlace"
					value="${routeDetailsInstance?.stopPlace}" />
			</div>
			<div id="VstopPlace" style="display: none; color: red;">Provide
				your Stop Place</div>
		</div>
	</div>
</div>

