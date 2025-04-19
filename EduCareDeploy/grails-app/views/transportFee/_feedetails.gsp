
<div class="col-md-3">
	<div
		class="fieldcontain ${hasErrors(bean: transportFeeInstance, field: 'paidAmount', 'error')} required">
		<label for="paidAmount"> <g:message
				code="transportFee.paidAmount.label" default="Paid Amount" /> <span
			class="required-indicator">*</span>
		</label> <input type="hidden" name="pd" id="pd" value="${paid}" />
		<g:field type="number" name="paidAmount" readOnly="true" id="paid"
			class="form-control" value="${paid}" required="" />
	</div>
</div>
<div class="col-md-3">
	<div
		class="fieldcontain ${hasErrors(bean: transportFeeInstance, field: 'remainingAmount', 'error')} required">
		<label for="remainingAmount"> <g:message
				code="transportFee.remainingAmount.label" default="Remaining Amount" />
			<span class="required-indicator">*</span>
		</label> <input type="hidden" name="rm" id="rm" value="${remaining}" />
		<g:field type="number" name="remainingAmount" readOnly="true"
			class="form-control" id="remaining" value="${remaining}" required="" />
	</div>
</div>

<div class="col-md-3">
	<div
		class="fieldcontain ${hasErrors(bean: transportFeeInstance, field: 'payingAmount', 'error')} required">
		<label for="paidAmount"> <g:message
				code="transportFee.payingAmount.label" default="Paying Amount" /> <span
			class="required-indicator">*</span>
		</label>

		<g:field type="number" name="payingAmount" class="form-control"
			value="${fieldValue(bean: transportFeeInstance, field: 'payingAmount')}"
			id="paying" required="" oninput="myfunction(this)" />
	</div>
	<div id="Vpaying" style="display: none; color: red;">Select your
		paying</div>
</div>

<script>
	function myfunction(va) {
		if (va.value == '') {
			document.getElementById('paid').value = document
					.getElementById('pd').value
			document.getElementById('remaining').value = document
					.getElementById('rm').value
		} else {
			var paying = document.getElementById('paying').value
			document.getElementById('paid').value = parseInt(document
					.getElementById('pd').value)
					+ parseInt(va.value);
			document.getElementById('remaining').value = parseInt(document
					.getElementById('rm').value)
					- parseInt(va.value)
		}
	}
</script>
