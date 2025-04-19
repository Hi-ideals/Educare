<%@ page import="com.hiideals.institute.payroll.PayHead"%>
<div class="form-body">
	<div class="row">


		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: payHeadInstance, field: 'payHeadName', 'error')} ">
				<label for="payHeadName"> <g:message
						code="payHead.payHeadName.label" default="Pay Head Name" /> <span
					class="required-indicator">*</span>
				</label>
				<g:textField name="payHeadName" id="payHeadName"
					class="form-control" 
					value="${payHeadInstance?.payHeadName}" />

			</div>
			<div id="PpayHeadName" style="display: none; color: red;">Provide
				your Pay Head Name</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: payHeadInstance, field: 'description', 'error')} ">
				<label for="description"> <g:message
						code="payHead.description.label" default="Description" />

				</label>
				<g:textField name="description" class="form-control"
					value="${payHeadInstance?.description}" />

			</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: payHeadInstance, field: 'payHeadType', 'error')} ">
				<label for="payHeadType"> <g:message
						code="payHead.payHeadType.label" default="Pay Head Type" /> <span
					class="required-indicator">*</span>
				</label>
				<g:select name="payHeadType"
					from="${payHeadInstance.constraints.payHeadType.inList}"
					 class="form-control"
					value="${payHeadInstance?.payHeadType}"
					valueMessagePrefix="payHead.payHeadType" />
			</div>
		</div>
	</div>
</div>


