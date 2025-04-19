<%@ page import="com.hiideals.instituite.feemanagment.FeesTypes" %>



<div class="fieldcontain ${hasErrors(bean: feesTypesInstance, field: 'amountPaid', 'error')} required">
	<label for="amountPaid">
		<g:message code="feesTypes.amountPaid.label" default="Amount Paid" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="amountPaid" type="number" value="${feesTypesInstance.amountPaid}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: feesTypesInstance, field: 'amountToBePaid', 'error')} required">
	<label for="amountToBePaid">
		<g:message code="feesTypes.amountToBePaid.label" default="Amount To Be Paid" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="amountToBePaid" type="number" value="${feesTypesInstance.amountToBePaid}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: feesTypesInstance, field: 'due', 'error')} required">
	<label for="due">
		<g:message code="feesTypes.due.label" default="Due" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="due" type="number" value="${feesTypesInstance.due}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: feesTypesInstance, field: 'fee', 'error')} required">
	<label for="fee">
		<g:message code="feesTypes.fee.label" default="Fee" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="fee" name="fee.id" from="${com.hiideals.instituite.feemanagment.Fee.list()}" optionKey="id" required="" value="${feesTypesInstance?.fee?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: feesTypesInstance, field: 'instFeeType', 'error')} required">
	<label for="instFeeType">
		<g:message code="feesTypes.instFeeType.label" default="Inst Fee Type" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="instFeeType" name="instFeeType.id" from="${com.hiideals.instituite.feemanagment.InstFeeTypes.list()}" optionKey="id" required="" value="${feesTypesInstance?.instFeeType?.id}" class="many-to-one"/>

</div>

