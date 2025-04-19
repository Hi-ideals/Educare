<div id="feeDetails_${i}" class="modal fade" tabindex="-1">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal"
			aria-hidden="true"></button>
		<h4 class="modal-title">Fee Paid Details</h4>
	</div>
	<div class="modal-body">
		<table id="sum_table" border="1"
			class="table table-striped table-bordered table-hover">
			<tr>
				<%--
				<td><a>Sl No.</a></td>
				--%>
				<td><a>Fee Details</a></td>
				<td><a>Amount</a></td>
				<td><a>Paid Amount</a></td>
				<td><a>Due</a></td>
			</tr>
			<g:each in="${feeInstance?.feetypetracker}" var="FeeTypesInstance"
				status="j">
				<tr>
					<%--<td>
						${j+1}
					</td>
					--%>
					<td>
						${FeeTypesInstance.instFeeTypeT}
					</td>
					<td>
						${FeeTypesInstance.amountToBePaidT}
					</td>
					<td>
						${FeeTypesInstance.amountPaidT}
					</td>
					<td>
						${FeeTypesInstance.dueT}
					</td>
				</tr>
			</g:each>
			<g:if test="${feeInstance?.totaladmissionfee!='0'}">
				<tr>
					<td>Admission Fee</td>
					<td>
						${feeInstance?.totaladmissionfee}
					</td>

					<g:if test="${feeInstance?.currentpaidadmissionfee>=0}">
						<td>
							${feeInstance?.currentpaidadmissionfee}
						</td>
					</g:if>
					<g:else>
						<td>
							${feeInstance?.paidadmissionfee}
						</td>
					</g:else>
					<g:if test="${feeInstance?.paidadmissionfee==0}">
						<td>
							${feeInstance?.totaladmissionfee}
						</td>
					</g:if>
					<g:else>
						<td>
							${feeInstance?.dueadmissionfee}
						</td>
					</g:else>
				</tr>
			</g:if>
			<tr>
				<td colspan="5"></td>
			</tr>
			<g:if test="${feeInstance?.feetypetracker}">
				<g:if test="${feeInstance?.discountT}">

					<tr>
						<td>Total</td>
						<td><b>
								${(feeInstance?.feetypetracker?.sum { it?.amountToBePaidT } + feeInstance?.totaladmissionfee)}
						</b></td>
					</tr>
					<tr>
						<td><b>Final Settlement</b></td>
						<td>
							${feeInstance?.discountT}
						</td>
					</tr>
					<tr>
						<td><b>Grand Total</b></td>

						<td><b>
								${(feeInstance?.feetypetracker?.sum { it?.amountToBePaidT } + feeInstance?.totaladmissionfee)-(feeInstance?.discountT)}
						</b></td>
						<g:if test="${feeInstance?.currentpaidadmissionfee}">
							<td><b>
									${feeInstance?.feetypetracker?.sum { it?.amountPaidT } + feeInstance?.currentpaidadmissionfee}
							</b></td>
						</g:if>
						<g:else>
							<td><b>
									${feeInstance?.feetypetracker?.sum { it?.amountPaidT }}
							</b></td>
						</g:else>
						<%--<td><b>${feeInstance?.feetypetracker?.sum { it?.amountPaidT } + feeInstance?.currentpaidadmissionfee}</b></td>
				--%>
						<td><b>
								${feeInstance?.feetypetracker?.sum { it?.dueT } + (feeInstance?.totaladmissionfee - feeInstance?.paidadmissionfee)-(feeInstance?.discountT)}
						</b></td>
					</tr>
				</g:if>
				<g:else>
					<tr>
						<td><b>Total</b></td>

						<td><b>
								${feeInstance?.feetypetracker?.sum { it?.amountToBePaidT } + feeInstance?.totaladmissionfee}
						</b></td>
						<g:if test="${feeInstance?.currentpaidadmissionfee}">
							<td><b>
									${feeInstance?.feetypetracker?.sum { it?.amountPaidT } + feeInstance?.currentpaidadmissionfee}
							</b></td>
						</g:if>
						<g:else>
							<td><b>
									${feeInstance?.feetypetracker?.sum { it?.amountPaidT }}
							</b></td>
						</g:else>
						<%--<td><b>${feeInstance?.feetypetracker?.sum { it?.amountPaidT } + feeInstance?.currentpaidadmissionfee}</b></td>
			--%>
						<td><b>
								${feeInstance?.feetypetracker?.sum { it?.dueT } + (feeInstance?.totaladmissionfee - feeInstance?.paidadmissionfee)}
						</b></td>
					</tr>
				</g:else>

			</g:if>
		</table>
	</div>
	<div class="modal-footer">
		<button type="button" data-dismiss="modal"
			class="btn btn-outline dark">Close</button>
	</div>
</div>
