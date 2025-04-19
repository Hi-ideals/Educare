<%@ page import="com.hiideals.institute.payroll.StaffSalary"%>



<div class="form-body">
	<div class="row">
		<div class="col-md-3 ">
			<div
				class="fieldcontain ${hasErrors(bean: staffSalaryInstance, field: 'staffType', 'error')} required">
				<label for="staffType"> <g:message
						code="staffSalary.staffType.label" default="Staff Type" /> <span
					class="required-indicator">*</span>
				</label> <select id="staffType" name="staffType" class="form-control"
					onchange="${remoteFunction(controller:'staffSalary',action: 'getstafflist',
                       update: 'updatestaff',
                       params: '\'staff=\' + this.value')};">
					<option value="">Select Staff Type</option>
					<g:each in="${staffSalaryInstance.constraints.staffType.inList}"
						var="staffType" status="i">
						<option value="${staffType}">
							${staffType}
						</option>
					</g:each>
				</select>
			</div>
		</div>

		<div id="updatestaff">
			<g:render template="staffList" model="[staffType:staffType]"></g:render>
		</div>
		<div class="col-md-3">
			<label>Academic Year</label> <select class="form-control"
				id="academicyear" name="academicyear">
				<option value="">Select Academic Year</option>
				<g:each in="${batchList}" var="batch">
					<option value="${batch.batchName}">
						${batch.batchName }
					</option>
				</g:each>
			</select>
			<div id="Sacademicyear" style="display: none; color: red;">Select
				your Academic year</div>
		</div>

		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: staffSalaryInstance, field: 'month', 'error')} required">
				<label for="month"> <g:message
						code="staffSalary.month.label" default="Month" /> <span
					class="required-indicator">*</span>
				</label>
				<g:select name="month" id="month" class="form-control"
					from="${staffSalaryInstance.constraints.month.inList}" required=""
					value="${staffSalaryInstance?.month}"
					valueMessagePrefix="staffSalary.month" />
			</div>
		</div>
	</div>
</div>

<div class="form-body">
	<div class="row">
		<div class="col-md-3">
			<input name="payhead1" id="payhead1" type="text" value=""
				class="form-control" placeholder="Pay Head" />
		</div>

		<div class="col-md-3">
			<input name="aunit1" id="aunit1" type="number" class="form-control"
				placeholder="Amount" />
		</div>


		<div class="col-md-1">
			<input name="addition" id="addition" type="button" class="btn blue"
				onclick="dototal(this)" value="+" />
		</div>

		<div class="col-md-0">
			<input name="deduction" id="deduction" type="button" class="btn blue"
				onclick="dototal1(this)" value="-" />
		</div>
	</div>
</div>
<br>
<br>
<div id="updatepayhead">
	<g:render template="staffpayhead" model="[staffId:staffId]"></g:render>
</div>



<script type="text/javascript">
var additionunit=0;
	function dototal(vv) {
		additionunit=parseInt($('#aunit1').val())
		//var unit = parseInt($('#aunit1').val())-additionunit
		var unit = parseInt($('#aunit1').val())
		var totalamount = parseInt($('#totalamount').val())
		var tt = parseInt(totalamount)+parseInt(unit)
		$('#totalamount').val(tt)
		$('#aunit1').val(0); 
		$('#payhead1').val(); 
		var val = $('#payhead1').val();
		var val1 = additionunit
		var val2 ="+"
	     $('table.list').append('<tr><td><input type="hidden" value="'+val+'" name="payheadname1">' + val + ' <td><input type="hidden" value="'+val2+'" name="payheadtype1">' + val2 +'<td><input type="hidden" value="'+val1+'" name="aunits">' + val1 + '</td></tr>')
		//$('table.list').append('<td><input type="hidden" value="'+val+'" name="payheadname1">' + val + '</td>');
	   // $('table.list').append('<td><input type="hidden" value="'+val2+'" name="payheadtype1">' + val2 + '</td>');
	   // $('table.list').append('<td><input type="hidden" value="'+val1+'" name="aunits">' + val1 + '</td>');
	}
	</script>
<script type="text/javascript">
   var additionunit=0;
	function dototal1(vv) {
		additionunit=parseInt($('#aunit1').val())
		//var unit = parseInt($('#aunit1').val())-additionunit
		var unit = parseInt($('#aunit1').val())
		var totalamount = parseInt($('#totalamount').val())
		var tt = parseInt(totalamount)-parseInt(unit )
		$('#totalamount').val(tt)
		$('#aunit1').val(0);
		$('#payhead1').val(); 
		var val = $('#payhead1').val();
		var val1 = unit
		var val2 ="-"
			  $('table.list').append('<tr><td><input type="hidden" value="'+val+'" name="payheadname1">' + val + ' <td><input type="hidden" value="'+val2+'" name="payheadtype1">' + val2 +'<td><input type="hidden" value="'+val1+'" name="aunits">' + val1 + '</td></tr>')
		//$('table.list').append('<td><input type="hidden" value="'+val+'" name="payheadname1">' + val + '</td>');
	   // $('table.list').append('<td><input type="hidden" value="'+val2+'" name="payheadtype1">' + val2 + '</td>');
	    //$('table.list').append('<td><input type="hidden" value="'+val1+'" name="aunits">' + val1 + '</td>');
		//additionunit=parseInt($('#aunit1').val())
	}
	</script>