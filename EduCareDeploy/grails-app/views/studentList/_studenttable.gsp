<%@ page import="com.hiideals.instituite.EDcoding.LookUpED"%>
<g:each in="${academicyears}">
	<g:if test="${it.status == 'current'}">
		<g:set value="${it.feeId}" var="feeInstance"></g:set>
		<table id="sum_table" border="1"
			style="margin-left: 10px; width: 97%;"
			class="table table-striped table-bordered table-hover">
			<tr>
				<td><a>Sl No.</a></td>
				<td><a>Fee Details</a></td>
				<td><a>Amount</a></td>
				<td><a>Paid Amount</a></td>
				<td><a>Due</a></td>
			</tr>
			<g:if test="${edit != 'true' }">

				<g:each in="${feeInstance?.feetypes}" var="FeeTypesInstance"
					status="j">
					<tr>
						<td>
							${j+1}
						</td>
						<td><g:field name="totalAmount_${j}"
								value="${FeeTypesInstance?.amountToBePaid}"
								id="totalamount-${j}" type="hidden" /> <g:field
								name="FeeType_${j}" value="${FeeTypesInstance?.instFeeType?.id}"
								id="totalamount-${j}" type="hidden" /> ${FeeTypesInstance?.amountToBePaid}</td>
						<td style="text-align: right">
							${FeeTypesInstance?.amountToBePaid}
						</td>
						<td id="paid_${j}" style="text-align: right">
							${FeeTypesInstance.amountPaid }
						</td>
						<td id="result_${j}" style="text-align: right">
							${FeeTypesInstance.due}
						</td>
						<%--<td><g:field name="amountToBePaid_${j}" id="payamount_${j}"
						type="text" value="0" onchange="doMath(this)" /></td>

			--%>
					</tr>
				</g:each>
			</g:if>
			<g:else>

				<g:each in="${feeInstance.feetypes}" status="k"
					var="feetypesInstance">
					<tr>
						<td>
							${k}
						</td>
						<td><g:field name="totalAmount_${k}"
								value="${feetypesInstance.instFeeType?.totalAmount}"
								id="totalamount-${k}" type="hidden" /> <g:field
								name="amountPaid_${k}" value="${feetypesInstance?.amountPaid}"
								id="amountPaid_${k}" type="hidden" /> ${feetypesInstance.instFeeType.typeName}</td>
						<td>
							${feetypesInstance?.amountToBePaid}
						</td>
						<td id="paid_${k}">
							${feetypesInstance.amountPaid}
						</td>
						<td><td id="result_${k}"> 
							${feetypesInstance.due}</td>
						<%-- <td id="result_${k}"> 
							${feetypesInstance.due}
						</td> --%>

					</tr>
				</g:each>
			</g:else>
			<tr>
				<td colspan="5"></td>
			</tr>
			<g:if test="${feeInstance?.totaladmissionfee}">
				<tr>
					<td></td>
					<td colspan="2" align="right">Admission Fee</td>
					<td colspan="2" align="right">
						${feeInstance?.totaladmissionfee}.00
					</td>
				</tr>


				<tr>
					<td></td>
					<td colspan="2" align="right">Paid Admission Fee</td>
					<td colspan="2" align="right">
						${feeInstance?.admissionfeepaid}.00
					</td>
				</tr>

				<tr>
					<td></td>
					<td colspan="2" align="right">Due Admission Fee</td>
					<td colspan="2" align="right">
						${feeInstance?.totaladmissionfee-feeInstance?.admissionfeepaid}.00
					</td>
				</tr>
			</g:if>
			<g:if test="${feeInstance?.totalPaid}">
				<tr>
					<td></td>
					<td colspan="2" align="right">Final Settlement</td>
					<td colspan="2" align="right">
						${feeInstance?.discount}.00
					</td>
				</tr>
				<tr>
					<td></td>
					<td colspan="2" align="right">Penalty Fee</td>
					<td colspan="2" align="right">
						${feeInstance?.penalty}.00
					</td>
				</tr>
				<tr>
					<td></td>
					<td colspan="2" align="right">Total Fee</td>
					<td colspan="2" align="right">
						${feeInstance?.totalFee}.00
					</td>
				</tr>
				<g:if test="${feeInstance?.totaladmissionfee}">
					<tr>
						<td></td>
						<td colspan="2" align="right">Total Amount Paid (Including
							admission Fee)</td>
						<td colspan="2" align="right">
							${feeInstance?.totalPaid}.00
						</td>
					</tr>
				</g:if>
				<g:else>
					<tr>
						<td></td>
						<td colspan="2" align="right">Total Amount Paid</td>
						<td colspan="2" align="right">
							${feeInstance?.totalPaid}.00
						</td>
					</tr>
				</g:else>
				<tr>
					<td></td>

					<td colspan="2" align="right">Due</td>

					<g:if test="${feeInstance == null }">
						<td colspan="2" align="right">
							${feeInstance?.due}
						</td>
					</g:if>
					<g:else>
						<td colspan="2" align="right">
							${feeInstance?.totalFee-feeInstance?.totalPaid}.00
						</td>

					</g:else>
				</tr>
			</g:if>
			<g:else>
				<g:link controller="fee" action="edit" style="color:#fff"
					id="${LookUpED.encod(student?.id) }" title="">
					<i class="fa fa-pencil"></i> Edit Fees</g:link>
			</g:else>


			<tr>
			<tr>
		</table>
	</g:if>
</g:each>

<div class="col-xs-6 text-right">


	<script type="text/javascript">
		function test() {
			$("#hi").hide();
			$("#bye").hide();
			$("#bye1").hide();
			print();
			close();
			$("#hi").show();
			$("#sum_table").show();
			$("#bye").show();
			$("#bye1").show();
		}
	</script>
</div>



