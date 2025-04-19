<%@ page import="com.hiideals.transport.DestinationDetails"%>

<div class="form-body">
	<div class="row">
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: destinationDetailsInstance, field: 'subscriptionType', 'error')} required">
				<label for="subscriptionType"> <g:message
						code="destinationDetails.subscriptionType.label"
						default="Subscription Type" /> <span class="required-indicator">*</span>
				</label>
				<g:select name="subscriptionType" class="form-control"
					from="${destinationDetailsInstance.constraints.subscriptionType.inList}"
					required="" value="${destinationDetailsInstance?.subscriptionType}"
					valueMessagePrefix="destinationDetails.subscriptionType" />

			</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: destinationDetailsInstance, field: 'route', 'error')} ">
				<label for="route"> <g:message
						code="destinationDetails.route.label" default="Route" />
				</label> <select id="route" name="route.id" class="form-control"
					class="many-to-one">
					<g:if test="${destinationDetailsInstance?.route}">
						<option value="${destinationDetailsInstance?.route?.id}">
							From
							${destinationDetailsInstance?.route?.startPlace} to
							${destinationDetailsInstance?.route?.stopPlace}, Bus Route No
							${destinationDetailsInstance?.route?.routeCode}
						</option>
					</g:if>
					<g:else>
						<option value="">select route</option>
					</g:else>
					<g:each in="${rut}">
						<option value="${it?.id}">From
							${it?.startPlace} to
							${it?.stopPlace}, Bus Route No
							${it?.routeCode}
						</option>
					</g:each>
				</select>


			</div>
			<div id="Vroute" style="display: none; color:red;">Select your Route</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: destinationDetailsInstance, field: 'fromPlace', 'error')} ">
				<label for="fromPlace"> <g:message
						code="destinationDetails.fromPlace.label" default="From Place" />

				</label>
				<g:textField name="fromPlace" class="form-control" id="fromPlace"
					value="${destinationDetailsInstance?.fromPlace}" />

			</div>
			<div id="VfromPlace" style="display: none; color:red;">Provide your From Place</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: destinationDetailsInstance, field: 'toPlace', 'error')} ">
				<label for="toPlace"> <g:message
						code="destinationDetails.toPlace.label" default="To Place" />

				</label>
				<g:textField name="toPlace" class="form-control" id="toPlace"
					value="${destinationDetailsInstance?.toPlace}" />

			</div>
			<div id="VtoPlace" style="display: none; color:red;">Provide your To Place</div>
		</div>
		</div></div>
		<div class="form-body">
	<div class="row">
		
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: destinationDetailsInstance, field: 'stopTime', 'error')} ">
				<label for="stopTime"> <g:message
						code="destinationDetails.stopTime.label" default="Stop Time" />

				</label>
				<g:textField name="stopTime" class="form-control" id="stopTime"
					value="${destinationDetailsInstance?.stopTime}" />

			</div>
			<div id="VstopTime" style="display: none; color:red;">Provide your Stop Time</div>
		</div>
			<div class="col-md-3">
											<label>Academic Year</label> <select class="form-control"
												name="academicyear" id="academicyear" required="required">
												<option value="">Select Academic Year</option>
												<g:each in="${batchList}" var="batch">
													<option value="${batch.id}">
														${batch.batchName}
													</option>
												</g:each>
											</select>
											<div id="Bacademicyear" style="display: none; color: red;">Select
												your Academic Year</div>
										</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: destinationDetailsInstance, field: 'amount', 'error')} required">
				<label for="amount"> <g:message
						code="destinationDetails.amount.label" default="Amount" /> <span
					class="required-indicator">*</span>
				</label>
				<g:field name="amount" class="form-control" id="amount"
					value="${fieldValue(bean: destinationDetailsInstance, field: 'amount')}"
					required="" />
			</div>
			<div id="Vamount" style="display: none; color:red;">Provide your Amount</div>
		</div>
	</div>
</div>

