<%@ page import="com.hiideals.instituite.feemanagment.InstFeeTypes"%>

<div class="form-body">
	<div class="row">

		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: instFeeTypesInstance, field: 'typeName', 'error')} required">
				<label for="typeName"> <g:message
						code="instFeeTypes.typeName.label" default="Fee Type Name " /> <span
					class="required-indicator">*</span>
				</label>
				<g:textField name="typeName" class="form-control" required=""
					id="feetypename" value="${instFeeTypesInstance?.typeName}" />
			</div>
			<div id="Afeetypename" style="display: none; color: red">Provide
				your Fee Type Name</div>
		</div>


		<div class="col-md-3">
			<div>
				<label for="admin"> Select Class </label> <select id="iclass"
					class="form-control" name="iclass">
					<g:if test="${instFeeTypesInstance.iclass !=null}">
						<option value="${instFeeTypesInstance.iclass?.id}">
							${instFeeTypesInstance.iclass?.classname}
						</option>
					</g:if>
					<g:else>
						<option></option>
					</g:else>
					<g:each in="${instituite?.classes}" var="cls">
						<option value="${cls?.id}">
							${cls?.classname}
						</option>
					</g:each>
				</select>
				<div id="Aiclass" style="display: none; color: red">Select
					your Class</div>
			</div>
		</div>



		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: instFeeTypesInstance, field: 'description', 'error')} required">
				<label for="description"> <g:message
						code="instFeeTypes.description.label" default="Description" /> <span
					class="required-indicator">*</span>
				</label>
				<g:textField name="description" class="form-control" required=""
					id="Description" value="${instFeeTypesInstance?.description}" />
			</div>
			<div id="ADescription" style="display: none; color: red">Provide
				your Description</div>
		</div>


		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: instFeeTypesInstance, field: 'totalAmount', 'error')} required">
				<label for="totalAmount"> <g:message
						code="instFeeTypes.totalAmount.label" default="Total Amount" /> <span
					class="required-indicator">*</span>
				</label>
				<g:field name="totalAmount" class="form-control" type="number"
					value="${instFeeTypesInstance.totalAmount}" required=""
					id="totalamount" />
			</div>
			<div id="Atotalamount" style="display: none; color: red">Provide
				your Total Amount</div>
		</div>


		<div class="col-md-3" style="display: none">
			<div
				class="fieldcontain ${hasErrors(bean: sectionInstance, field: 'instituite', 'error')} ">
				<label for="admin"> <g:message code="instituite.admin.label"
						default="instituite" />
				</label> <select id="instituite" class="form-control" name="instituite?.id">
					<option value="${instituite?.id}">
						${instituite?.name}
					</option>
				</select>
			</div>
		</div>

	</div>
	
</div>


