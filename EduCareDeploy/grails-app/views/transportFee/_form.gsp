<%@ page import="com.hiideals.transport.TransportFee"%>
<div class="form-body">

	<div class="row">
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: transportFeeInstance, field: 'transport', 'error')} ">
				<label for="transport"> <g:message
						code="transportFee.transport.label" default="Transport" />
				</label> <select id="transport" class="form-control" name="transport.id"
					onchange="${remoteFunction(
			          controller: 'transportFee', 
			          action: 'getStudents',
					  update:'stu',
			          params: "\'value=\' + this.value")};${remoteFunction(
			          controller: 'transportFee', 
			          action: 'getStaffs',
					  update:'sta',
			          params: "\'value=\' + this.value")}">
					<option value="">Select Transport</option>
					<g:each in="${transprt}" class="many-to-one">
						<option value="${it?.id}">
							${it?.destination?.fromPlace} to
							${it?.destination?.toPlace} --
							${it?.destination?.acdemicyear?.batchName}
						</option>
					</g:each>
				</select>
			</div>
			<div id="Vtransport" style="display: none; color: red;">Select
				your Transport</div>
		</div>


		<div class="col-md-3">
			<label>Select Type</label> <select class="form-control" name="tt"
				id="TransportSelect">
				<option value="">Slect staff/student</option>
				<option value="student">Student</option>
				<option value="staff">Staff</option>
			</select>
			<div id="VTransportSelect" style="display: none; color: red;">Select
				your staff/student</div>
		</div>

		<div class="col-md-3">
			<div id="stu" hidden="true">
				<g:render template="students" />
			</div>
			<div id="sta" hidden="true">
				<g:render template="staffs" />
			</div>
		</div>



	</div>
	<br>
	<div class="row">
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: transportFeeInstance, field: 'paymentId', 'error')} "
				style="display: none;">
				<label for="paymentId"> <g:message
						code="transportFee.paymentId.label" default="Payment Id" />

				</label>
				<g:if test="${paymentId}">
					<g:textField name="paymentId" value="${paymentId}" />
				</g:if>
				<g:else>
					<g:textField name="paymentId"
						value="${transportFeeInstance?.paymentId}" />
				</g:else>
			</div>
		</div>
	</div>
	<div class="row">
		<div id="feedetails">
			<g:render template="feedetails" />
		</div>





	</div>

	<div class="col-md-3">
		<div
			class="fieldcontain ${hasErrors(bean: transportFeeInstance, field: 'fine', 'error')} required"
			style="display: none">
			<label for="fine"> <g:message code="transportFee.fine.label"
					default="Fine" /> <span class="required-indicator">*</span>
			</label>
			<g:field type="number" name="fine" class="form-control"
				value="${fieldValue(bean: transportFeeInstance, field: 'fine')}"
				required="" />
		</div>
	</div>
</div>

<script>


</script>
