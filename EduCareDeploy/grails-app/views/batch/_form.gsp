<%@ page import="com.hiideals.instituite.helper.Batch"%>


<div class="form-body">

	<div class="row">
	
		<div class="col-md-3">
				<div
					class="fieldcontain ${hasErrors(bean: batchInstance, field: 'batchName', 'error')} required">
					<label for="batchName"> <g:message
							code="batch.batchName.label" default="Academic Year" /> <span
						class="required-indicator">*</span>
					</label>
					<g:textField name="batchName" required="" class="form-control" id="batchname"
						value="${batchInstance?.batchName}" />
					
				</div>
				<div id="Sbatchname" style="display:none; color:red">Provide your Academic Year (Only numbers & Special characters)</div>
			</div>
		
	
		<div class="col-md-3">
				<div
					class="fieldcontain ${hasErrors(bean: batchInstance, field: 'description', 'error')} ">
						<label for="description"> <g:message
							code="batch.description.label" default="Description" />

					</label>
					<g:textField name="description" class="form-control"
						value="${batchInstance?.description}" />
				
				</div>
			</div>
	


		<div class="col-md-3">
				<div
					class="fieldcontain ${hasErrors(bean: batchInstance, field: 'batchfrom', 'error')} required">
					<label for="from"> <g:message code="batch.batchfrom.label"
							default="From" /> <span class="required-indicator">*</span>
					</label>
 					<input type="text" name="batchfrom1"  class="form-control date-picker" id="datepicker" value="${formatDate(format:'dd/MM/yyyy',date:batchInstance?.batchfrom)}">
					
				</div>
				<div id="Sdatepicker" style="display:none; color:red">Select your date</div>
			</div>
	

		<div class="col-md-3">
				<div
					class="fieldcontain ${hasErrors(bean: batchInstance, field: 'batchto', 'error')} required">
						<label for="to"> <g:message code="batch.batchto.label"
							default="To" /> <span class="required-indicator">*</span>
					</label>	
					<input type="text" name="batchto1"  class="form-control date-picker" id="datepicker1" value="${formatDate(format:'dd/MM/yyyy',date:batchInstance?.batchto)}" >
								
				</div>
				<div id="Sdatepicker1" style="display:none; color:red">Select your date</div>
			</div>
		</div>
	</div>

