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
<g:each in="${student?.academicyear}">
	<g:if test="${it.status == 'current'}">
	</g:if>
</g:each>
<g:set value="${it}" var="accInstance"></g:set>
<g:hiddenField name="academic" value="${accInstance?.id}" />
<div class="portlet light bordered">
	<table id="sum_table"
		class="table table-striped table-bordered table-hover">
		<tr>
			<td><a>Sl No. </a></td>
			<td><a>Fee Details</a></td>
			<td><a>Amount</a></td>
			<td><a>Paid Amount</a></td>
			<td><a>Due</a></td>
			<td><a>Amount Payable</a></td>
		</tr>
		<g:if test="${edit != 'true' }">

			<g:if test="${Instfeetypes.size()==0}">
				<g:hiddenField name="admisionfeeDec" value="${true}"
					id="admisionfeeDec" />
			</g:if>
			<g:each in="${Instfeetypes}" var="instFeeTypesInstance" status="j">
				<tr>
					<td>
						${j+1}
					</td>
					<td><g:field name="totalAmount_${j}"
							value="${instFeeTypesInstance?.totalAmount}"
							id="totalamount-${j}" type="hidden" /> <g:field
							name="FeeType_${j}" value="${instFeeTypesInstance?.id}"
							id="totalamount-${j}" type="hidden" /> ${instFeeTypesInstance?.typeName}</td>
					<td style="text-align: right">
						${instFeeTypesInstance?.totalAmount}
					</td>
					<td id="paid_${j}" style="text-align: right">0</td>
					<td id="result_${j}" style="text-align: right">0</td>
					<td style="text-align: right"><g:field
							style="text-align:right" name="amountToBePaid_${j}"
							id="payamount_${j}" type="text" value="0" onchange="doMath(this)" /></td>

				</tr>
			</g:each>
		</g:if>
		<g:else>


			<g:if test="${feeInstance.feetypes}">
				<g:each in="${feeInstance.feetypes}" status="k"
					var="feetypesInstance">
					<tr>
						<td>
							${k}
						</td>
						<td style="text-align: right"><g:field
								name="totalAmount_${k}"
								value="${feetypesInstance?.amountToBePaid}"
								id="totalamount-${k}" type="hidden" /> <g:field
								name="amountPaid_${k}" value="${feetypesInstance?.amountPaid}"
								id="amountPaid_${k}" type="hidden" /> ${feetypesInstance?.instFeeType?.typeName}</td>
						<td style="text-align: right">
							${feetypesInstance?.amountToBePaid}
						</td>
						<td id="paid_${k}" style="text-align: right">
							${feetypesInstance?.amountPaid}
						</td>
						<td id="result_${k}" style="text-align: right">
							${feetypesInstance?.due}
						</td>
						<td style="text-align: right"><g:if
								test="${feetypesInstance?.amountPaid == feetypesInstance?.instFeeType?.totalAmount}">
						Paid
						<g:field name="amountToBePaid_${k}" id="payamount_${k}"
									type="hidden" value="0" onchange="doMath(this)" />
							</g:if> <g:else>
								<g:field style="text-align:right" name="amountToBePaid_${k}"
									id="payamount_${k}" type="text" value="0"
									onchange="doMath(this)" />
							</g:else></td>
					</tr>
				</g:each>
			</g:if>
			<g:else>

				<g:each in="${Instfeetypes}" var="instFeeTypesInstance" status="j">
					<tr>
						<td>
							${j+1}
						</td>
						<td><g:field name="totalAmount_${j}"
								value="${instFeeTypesInstance?.totalAmount}"
								id="totalamount-${j}" type="hidden" /> <g:field
								name="FeeType_${j}" value="${instFeeTypesInstance?.id}"
								id="totalamount-${j}" type="hidden" /> ${instFeeTypesInstance?.typeName}</td>
						<td style="text-align: right">
							${instFeeTypesInstance?.totalAmount}
						</td>
						<td id="paid_${j}" style="text-align: right">0</td>
						<td id="result_${j}" style="text-align: right">0</td>
						<td style="text-align: right"><g:field
								style="text-align:right" name="amountToBePaid_${j}"
								id="payamount_${j}" type="text" value="0"
								onchange="doMath(this)" /></td>

					</tr>
				</g:each>
			</g:else>
		</g:else>

		<%--<tr class="totalColumn">
		<td class="totalCol"></td>
		<td class="totalCol"></td>
		<td class="totalCol">Total:</td>
		<td class="totalCol">Total:</td>
		<td class="totalCol">Total:</td>
		<td class="totalCol"></td>
	</tr>

--%>
	</table>


	<table class="table  table-hover">


		<g:if test="${params.student=="Readmission" ||  student?.readmission}">
			<tr>
				<td colspan="5" align="right">Admission Fee</td>
				<td align="right"><g:field style="text-align:right"
						name="admissionfee" id="admissionfee" readonly="readonly"
						type="number" value="0" /></td>
			</tr>

			<tr>

				<g:hiddenField style="text-align:right" name="admissionfee1"
					id="admissionfee1" readonly="readonly" type="number" value="0" />
			</tr>

		</g:if>
		<g:else>
			<tr>
				<td colspan="5" align="right">Admission Fee</td>
				<td align="right"><g:field style="text-align:right"
						name="admissionfee" id="admissionfee" readonly="readonly"
						type="number" value="${student?.admissionfee?.totalAmount}" /></td>
			</tr>
			<g:if test="${edit != 'true' }">

				<tr>
					<td colspan="5" align="right">Pay Admission Fee</td>
					<td align="right"><g:if
							test="${student?.admissionfee?.totalAmount == feeInstance?.admissionfeepaid}">Paid</g:if>
						<g:else>
							<g:field style="text-align:right" name="admissionfee1"
								id="admissionfee1" type="number" value="0"
								onchange="dodiscount2(this)" />
						</g:else></td>
				</tr>

			</g:if>
			<g:else>
				<tr>
					<td colspan="5" align="right">Pay Admission Fee</td>
					<td align="right"><g:if
							test="${student?.admissionfee?.totalAmount == feeInstance?.admissionfeepaid}">Paid</g:if>
						<g:else>
							<g:field style="text-align:right" name="admissionfee1"
								id="admissionfee1" type="number" value="0"
								onchange="dodiscount1(this)" />
						</g:else></td>
				</tr>
			</g:else>
			<tr>
				<td colspan="5" align="right">Paid Admission Fee</td>
				<td align="right"><g:if test="${feeInstance?.admissionfeepaid}">
						<g:field style="text-align:right" name="paidadmissionfee"
							id="paidadmissionfee" readonly="readonly" type="number"
							value="${feeInstance?.admissionfeepaid}" />
					</g:if>
					<g:else>
						<g:field style="text-align:right" name="paidadmissionfee"
							id="paidadmissionfee" readonly="readonly" type="number" value="0" />
					</g:else></td>
			</tr>

			<tr>

				<g:if test="${feeInstance?.admissionfeepaid}">
					<g:hiddenField style="text-align:right" name="paidadmissionfee1"
						id="paidadmissionfee1" readonly="readonly" type="number"
						value="${feeInstance?.admissionfeepaid}" />
				</g:if>
				<g:else>
					<g:hiddenField style="text-align:right" name="paidadmissionfee1"
						id="paidadmissionfee1" readonly="readonly" type="number" value="0" />
				</g:else>
			</tr>


			<tr>
				<td colspan="5" align="right">Due Admission Fee</td>
				<td align="right"><g:if test="${feeInstance?.dueadmissionfee}">
						<g:field style="text-align:right" name="admissionfeedue"
							id="admissionfeedue" readonly="readonly" type="number"
							value="${feeInstance?.dueadmissionfee}" />
					</g:if>
					<g:else>
						<g:field style="text-align:right" name="admissionfeedue"
							id="admissionfeedue" readonly="readonly" type="number" value="0" />
					</g:else></td>
			</tr>
		</g:else>

		<g:if test="${edit != 'true' }">
			<tr>
				<td colspan="5" align="right">Final Settlement</td>
				<td align="right"><g:field style="text-align:right"
						name="discount" id="discount" type="number"
						value="${feeInstance.discount}" onchange="dodiscount(this)" /> <g:hiddenField
						name="discount1" id="discount1" /></td>
			</tr>
		</g:if>


		<g:if test="${feeInstance.penalty >0 }">
			<tr>
				<td colspan="5" align="right">Penalty</td>
				<td style="text-align: right">
					${feeInstance.penalty}
				</td>
			</tr>
		</g:if>
		<g:else>
			<tr>
				<td colspan="5" align="right">Penalty</td>
				<td align="right"><g:field style="text-align:right"
						name="penalty" id="penalty" type="number"
						value="${feeInstance.penalty}" onchange="dopenalty(this)" /></td>
			</tr>
		</g:else>
		<g:if test="${params.student=="Readmission" || student?.readmission}">
			<tr>
				<td colspan="5" align="right">Total Fee</td>
				<td><g:field style="text-align:right" name="totalFee"
						id="totalFee" type="number" readonly="readonly" value="${sum}"
						required="" /></td>

			</tr>

			<tr>

				<g:hiddenField style="text-align:right" name="paidadmissionfee"
					id="paidadmissionfee" readonly="readonly" type="number" value="0" />
			</tr>

		</g:if>
		<g:else>
			<tr>
				<td colspan="5" align="right">Total Fee</td>
				<td><g:field style="text-align:right" name="totalFee"
						id="totalFee" type="number" readonly="readonly"
						value="${totalsum}" required="" /></td>

			</tr>
		</g:else>
		<tr>

			<td colspan="5" align="right">Total Amount Paid</td>
			<td width="10%"><g:if test="${feeInstance.totalPaid}">
					<g:field style="text-align:right" name="totalPaid" id="totalPaid"
						readonly="readonly" type="number" value="${feeInstance.totalPaid}"
						required="" />
				</g:if> <g:else>
					<g:field style="text-align:right" name="totalPaid" id="totalPaid"
						readonly="readonly" type="number" value="0" />
				</g:else>
				<div id="ss" style="display: none; color: red">Total Amount
					Paid cannot be 0</div></td>
		</tr>
		<tr>
			<g:if test="${params.student=="Readmission"}">
				<td colspan="5" align="right">Due</td>
			</g:if>
			<g:else>
				<td colspan="5" align="right">Due Amount</td>
			</g:else>
			<td><g:field style="text-align:right" name="due" id="pending"
					type="number" readonly="readonly" value="${feeInstance.due ?: 0}"
					required="" /></td>
		</tr>
	</table>


	<table class="table  table-hover">


		<tr>
			<td colspan="5" align="center">Payment Date</td>
			<td align="right"><input type="text" id="datepicker"
				name="paydate" class="form-control date-picker" required="required"
				value=""></td>
		</tr>

<g:set var="user" value="${sec.username()}" />
								<g:if test="${user=="lkbed2011"}">
	<tr>
<td colspan="5" align="center">Remarks</td>
<td align="right"><input type="text"  name="remarks1" maxlength="10"
							class="form-control" 
							value="">
		
		</td>
</tr>
</g:if>

		<tr>
			<td colspan="5" align="center">Payment Type</td>
			<td align="right"><select name="paymentType"
				class="form-control" id="paypels" onchange="funnew(this)">
					<option value="CASH">CASH</option>
					<g:each in="${FeeTracker.constraints.paymentType.inList }" var="pl">
						<option value="${pl}">
							${pl}
						</option>
					</g:each>
			</select>
				<div id="selectpayment" style="display: none; color: red">select
					payment mode</div></td>
		</tr>



		<tr id="Returntype" hidden="true">
			<td colspan="5" align="center">DD Number</td>
			<td align="right"><input type="text" class="form-control"
				name="ddNumber" id="ddNumber">
				<div id="PddNumber" style="display: none; color: red">Provide
					your DD number</div></td>
		</tr>


		<tr id="Returntype1" hidden="true">
			<td colspan="5" align="center">Check Number</td>
			<td align="right"><input type="text" class="form-control"
				name="checkNumber" id="checkNumber" />
				<div id="PcheckNumber" style="display: none; color: red">Provide
					your Check number</div></td>
		</tr>


		<tr id="ReturntypeA" hidden="true">
			<td colspan="5" align="center">Account Number</td>
			<td align="right"><input type="text" class="form-control"
				id="accNo" name="accNo" id="accNo">
				<div id="PaccNo" style="display: none; color: red">Provide
					your Account number</div></td>
		</tr>

		<tr id="ReturntypeB" hidden="true">
			<td colspan="5" align="center">Bank Name</td>
			<td align="right"><input type="text" class="form-control"
				name="bankName" id="bankName">
				<div id="PbankName" style="display: none; color: red">Provide
					your Bank Name</div></td>
		</tr>

		<tr id="ReturntypeC" hidden="true">
			<td colspan="5" align="center">Teller Number</td>
			<td align="right"><input type="text" class="form-control"
				name="tellerNo" id="tellerNo"></td>
		</tr>

		<tr id="ReturntypeD" hidden="true">
			<td colspan="5" align="center">Pin Code Number</td>
			<td align="right"><input type="text" class="form-control"
				name="pinCode" id="pinCode">
				<div id="PpinCode" style="display: none; color: red">Provide
					your Pincode number</div></td>
		</tr>

		<tr id="ReturntypeE" hidden="true">
			<td colspan="5" align="center">Notes</td>
			<td align="right"><g:textArea class="form-control" name="notes"
					id="notes"></g:textArea></td>
		</tr>


	</table>
</div>
<%--<div id="Returntype" hidden="true">--%>
<%--	<div class="row margin-bottom-10">--%>
<%--		<section class="col-md-6">--%>
<%--			<label>DD Number</label> <input type="text" class="form-control"--%>
<%--				name="ddNumber" id="ddNumber" />--%>
<%--		</section>		--%>
<%--		<div style="display: none; color:red;" id="EddNumber">Provide your DD number</div>--%>
<%--	</div>--%>
<%--</div>--%>
<%----%>
<%--<div id="Returntype1" hidden="true">--%>
<%--<div class="row margin-bottom-10">--%>
<%--	<section class="col-md-6">--%>
<%--		<label>Check Number</label> <input type="text" class="form-control"--%>
<%--			name="checkNumber"  />--%>
<%--	</section>--%>
<%--</div></div>--%>


<script type="text/javascript">
	var input = $('#paypels').val();

	function funnew(sel) {
		if (sel.value == 'DD') {
			$('#Returntype').show();
			$('#ReturntypeA').show();
			$('#ReturntypeB').show();
			$('#ReturntypeC').show();
			$('#ReturntypeD').show();
			$('#ReturntypeE').show();
			$('#Returntype1').hide();
		} else if (sel.value == 'CHECK') {
			$('#Returntype').hide();
			$('#ReturntypeA').show();
			$('#ReturntypeB').show();
			$('#ReturntypeC').show();
			$('#ReturntypeD').show();
			$('#ReturntypeE').show();
		} else {
			$('#Returntype').hide();
			$('#Returntype1').hide();

			$('#ReturntypeA').hide();
			$('#ReturntypeB').hide();
			$('#ReturntypeC').hide();
			$('#ReturntypeD').hide();
			$('#ReturntypeE').hide();
		}
	}
</script>



<script type="text/javascript">
	var discountvariable = 0;
	var penalaultyvalue = 0;

	function dopenalty(vv) {
		if (isNaN(penalaultyvalue)) {
			penalaultyvalue = 0;
		}
		if (isNaN(parseInt($('#penalty').val()))) {
			$('#penalty').val(0)
		}
		var pen = parseInt($('#penalty').val()) - penalaultyvalue
		var pend = parseInt($('#pending').val())
		var dis = parseInt($('#discount').val())
		var tot = parseInt($('#totalFee').val())
		var tt = parseInt(pen) + parseInt(tot)
		penalaultyvalue = parseInt($('#penalty').val())
		$('#totalFee').val(tt)

		if (pend <= 0) {
			pend = tot
		}
		$('#pending').val(parseInt(pend) + parseInt(pen))

		//alert("Pendiingg"+(parseInt(pend))+";"+(parseInt(pen)))
	}

	function dodiscount(vv) {
		if (isNaN(discountvariable)) {
			discountvariable = 0;
		}
		if (isNaN(parseInt($('#discount').val()))) {
			$('#discount').val(0)
		}
		var tt = 0;
		var dis = parseInt($('#discount').val()) - (discountvariable)

		if ($("#admisionfeeDec").val()) {
			var due = parseInt($(vv).val())
			var adm1 = parseInt($("#admissionfee1").val())
			var admfee = parseInt($("#admissionfee").val())

			var totals = ((admfee - adm1) - due)

			$('#admissionfeedue').val(totals)
		}
		var tot = $('#totalFee').val()

		var totalPaid = parseInt($('#totalPaid').val())
		tt = (parseInt(tot) - parseInt(dis))
		$('#totalFee').val(tt)
		$('#pending').val(tt - totalPaid)
		discountvariable = parseInt($('#discount').val())
	}
</script>


