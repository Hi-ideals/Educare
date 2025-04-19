<%@ page import="com.hiideals.instituite.feemanagment.Fee"%>
<%@ page import="com.hiideals.instituite.feemanagment.FeesTypes"%>
<%@ page import="com.hiideals.instituite.feemanagment.FeeTracker"%>


<div
	class="fieldcontain ${hasErrors(bean: feeInstance, field: 'studentId', 'error')} "
	style="display: none">
	<label for="studentId"> <g:message code="fee.studentId.label"
			default="Student Id" />

	</label> <select id="studentId" name="studentId.id" class="form-control">
		<option value="${student?.id }">
			${student?.studentName}
		</option>
	</select>
</div>

<table id="sum_table"
	class="table table-striped table-bordered table-hover">
	<tr>
		<td><a>Sl No.</a></td>
		<td><a>Fee Details</a></td>
		<td style="display: none"><a>Amount</a></td>
		<td style="display: none"><a>Paid Amount</a></td>
		<td><a>Due</a></td>
		<td><a>Amount Payable</a></td>
	</tr>
	<g:if test="${edit != 'true' }">
		<g:each in="${Instfeetypes}" var="instFeeTypesInstance" status="j">
			<tr>
				<td>
					${j}
				</td>
				<td><g:field name="totalAmount_${j}"
						value="${instFeeTypesInstance?.totalAmount}" id="totalamount-${j}"
						type="hidden" /> <g:field name="FeeType_${j}"
						value="${instFeeTypesInstance?.id}" id="totalamount-${j}"
						type="hidden" /> ${instFeeTypesInstance?.typeName}</td>
				<td>
					${instFeeTypesInstance.totalAmount}
				</td>
				<td id="paid_${j}">0</td>
				<td id="result_${j}">0</td>
				<td><g:field name="amountToBePaid_${j}" id="payamount_${j}"
						type="text" value="0" onchange="doMath(this)" /></td>

			</tr>
		</g:each>
	</g:if>
	<g:else>
		<g:each in="${feeInstance.feetypes}" status="k" var="feetypesInstance">
			<tr>
				<td>
					${k}
				</td>
				<td><g:field name="totalAmount_${k}"
						value="${feetypesInstance.instFeeType?.totalAmount}"
						id="totalamount-${k}" type="hidden" /> <g:field
						name="amountPaid_${k}" value="${feetypesInstance?.amountPaid}"
						id="amountPaid_${k}" type="hidden" /> ${feetypesInstance.instFeeType.typeName}</td>
				<td style="display: none">
					${feetypesInstance.instFeeType.totalAmount}
				</td>
				<td id="paid_${k}" style="display: none">
					${feetypesInstance.amountPaid}
				</td>
				<td id="result_${k}">
					${feetypesInstance.due}
				</td>
				<td><g:if
						test="${feetypesInstance.amountPaid == feetypesInstance.instFeeType.totalAmount}">
						Paid
						<g:field name="amountToBePaid_${k}" id="payamount_${k}"
							type="hidden" value="0" onchange="doMath(this)" />
					</g:if> <g:else>
						<g:field name="amountToBePaid_${k}" class="hope"
							id="payamount_${k}" type="text" value="0" onchange="doMath(this)" />
					</g:else></td>
			</tr>
		</g:each>
	</g:else>



</table>


<table class="table table-bordered table-hover">

	<tr>
		<td colspan="5" align="right" style="display: none">Final Settlement in
			Rs</td>
		<td align="right" style="display: none"><g:field name="discount"
				id="discount" type="number" value="${feeInstance.discount}"
				onchange="dodiscount(this)" /></td>
	</tr>

	<g:if test="${feeInstance.penalty >0 }">
		<tr>
			<td colspan="5" align="right" style="display: none">Penalty</td>
			<td align="right" style="display: none">
				${feeInstance.penalty}
			</td>
		</tr>
	</g:if>
	<g:else>
		<tr>
			<td colspan="5" align="right" style="display: none">Penalty</td>
			<td align="right" style="display: none"><g:field name="penalty"
					id="penalty" type="number" value="${feeInstance.penalty}"
					onchange="dopenalty(this)" /></td>
		</tr>
	</g:else>
	<tr style="display: none">
		<td colspan="5" align="right">Total Fee</td>
		<td><g:field name="totalFee" id="totalFee" type="number"
				readonly="readonly" value="${feeInstance.totalFee}" required="" /></td>

	</tr>
	<tr>

		<td colspan="5" align="right">Total paid Now</td>
		<td width="10%"><g:field name="Paidnow" id="Paidnow"
				readonly="readonly" type="number" required="" /></td>
	</tr>
	<tr>

		<td colspan="5" align="right">Total Amount Paid Till today</td>
		<td width="10%"><g:field name="totalPaid" id="totalPaid"
				readonly="readonly" type="number" value="${feeInstance.totalPaid}"
				required="" /></td>
	</tr>
	<tr>
		<td colspan="5" align="right">Due</td>
		<td><g:field name="due" id="pending" type="number"
				readonly="readonly" value="${feeInstance.due}" required="" /></td>
	</tr>
</table>


<table class="table  table-hover">

	<tr>
		<td colspan="5" align="center">Payment Type</td>
		<td align="right"><select name="paymentType" class="form-control"
			id="paypels">
				<option value="">Select Payment Type</option>
				<g:each in="${FeeTracker.constraints.paymentType.inList }" var="pl">
					<option value="${pl}">
						${pl}
					</option>
				</g:each>
		</select>
			<div id="selectpayment" style="display: none; color: red">select
				payment mode</div></td>
	</tr>


</table>

<script src="assets1/global/plugins/jquery.min.js"
	type="text/javascript"></script>
<script type="text/javascript">
	$(function() {

		$(".hope").each(function() {

			$(this).keyup(function() {

				calculateSum();
			});
		});

		function calculateSum() {
			var sum = 0;
			$(".hope").each(function() {
				if (!isNaN(this.value) && this.value.length != 0) {
					sum += parseFloat(this.value);
				}
			});
			$("#Paidnow").val(sum.toFixed(2));
		}
		;
	});

	function dopenalty(vv) {

		var pen = parseInt($('#penalty').val())
		var pend = parseInt($('#pending').val())
		var dis = parseInt($('#discount').val())
		var tot = parseInt($('#totalFee').val())
		var tt = pen + (tot)

		$('#totalFee').val(tt)

		$('#pending').val(pend + pen)
	}
</script>

<script type="text/javascript">
	function dodiscount(vv) {

		var dis = parseInt($('#discount').val())
		var tot = $('#totalFee').val()
		var totalPaid = parseInt($('#totalPaid').val())
		var tt = (tot - dis)

		$('#totalFee').val(tt)

		$('#pending').val(tt - totalPaid)
	}
</script>




<%--

<div style="display:none">
<td><g:field name="amountPaid_${j}" type="number" value="" /></td>
			<td><g:field name="amountToBePaid_${j}" type="number" value="" /></td>
			<td><g:field name="due_${j}" type="number" value="" /></td>
</div>



--%>


