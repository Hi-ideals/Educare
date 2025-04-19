

<div class="portlet box grey" id="printableArea">

	<div class="row" id="printlogoButton">
		<div class="col-sm-12">
			<div class="panel panel-white">
				<div class="panel-body">
					<div class="form-group" id="salarydetails">
						<style>
@media print {
	#main_content, #main_content_outer {
		page-break-inside: avoid;
	}
	.borderless table {
		border-top-style: none;
		border-left-style: none;
		border-right-style: none;
		border-bottom-style: none;
	}
	.borderless>tbody>tr>td {
		border: none;
	}
}
</style>
						<div class="content">
							<div class="row">
								<div class="col-sm-12">
									<table class="table table-responsive"
										style="border-color: white;">
										<tbody>
											<tr style="border-color: white;">
												<td width="60%" style="border-color: white;">
													<div
														style="-webkit-region-break-inside: avoid; margin-left: 200px;">
														<h3 align="center">
															<images:getImage id="${instituite?.logo?.id}"
																width="100px"  />
														</h3>

														<h3 align="center">
															${instituite?.name }
														</h3>
														<h5 align="center">
															<small>Affiliated to: ${instituite?.affiliatedTo }</small>
														</h5>
														<h5 align="center">
															<small>H.No:${instituite?.hsno} ${instituite?.street}
																${instituite?.city}-${instituite?.pinCode} ${instituite?.state}
																${instituite?.country} Ph:${instituite?.phone}
															</small>
														</h5>
														<h4 align="center">
															Pay Slip for the period of
															${params?.month }&nbsp;
															${params?.academicyear}
														</h4>
													</div>
												</td>
												<td width="20%" style="border-color: white;">
													&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>

											</tr>
										</tbody>
									</table>
								</div>

								<div class="col-sm-12">
									<table class="table table-striped invoice_table">
										<thead>
											<tr>
												<th style="border-color: #92CD82;"></th>
												<th style="border-color: #92CD82;"></th>
												<th style="border-color: #92CD82;"></th>
											</tr>
										</thead>
										<tbody>
										<tr>
										<td>
										
										<div>Date : <g:formatDate date="${date}" format="dd-MMM-yyyy"/>   <div id="console-log"></div></div>
										
										</td>
										</tr>
											<tr>
												<td>Staff Name : ${staffdetails?.staffName }</td>
												<%--                        <td>Payslip No : 251893365</td>--%>
											</tr>
											<tr>
												<td>Staff Id: ${staffdetails?.staffID }</td>
												<%--                                                <td>Bank : </td>--%>
												<%--                        <td>A/C No : </td>--%>

											</tr>
											<tr>
												<td>Staff Type: ${staffdetails?.staffType }</td>
												<%--                        <td>Designation : Primary Teacher</td>							--%>
												<%--                        <td>Joining Date : 2017-Apr-14</td>--%>
											</tr>
										</tbody>
									</table>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-12">
									<div class="table-responsive">

										<table class="table borderless" style="border-color: white;">
											<tbody>

												<tr style="border-color: white;">
													<td style="border-color: white;">
														<h3>Earnings</h3>
														<table class="table table-striped invoice_table">
															<thead>
																<tr>
																	<th style="border-color: #92CD82;">PayHead name</th>
																	<th style="border-color: #92CD82;">Amount</th>
																</tr>
															</thead>
															<tbody>
																<g:each in="${additionlist}" var="payslip1">
																	<tr>
																		<td>
																			${payslip1?.payHead}
																		</td>
																		<td>
																			${payslip1?.aunit}
																		</td>
																	</tr>
																</g:each>
															</tbody>
														</table>
													</td>

													<td style="border-color: white;">
														<h3>Deductions</h3>
														<table class="table table-striped invoice_table">
															<thead>
																<tr>
																	<th style="border-color: #92CD82;">PayHead name</th>
																	<th style="border-color: #92CD82;">Amount</th>
																</tr>
															</thead>
															<tbody>
																<g:each in="${deductionlist}" var="payslip">
																	<tr>
																		<td>
																			${payslip?.payHead}
																		</td>
																		<td>
																			${payslip?.aunit}
																		</td>
																	</tr>
																</g:each>
															</tbody>
														</table>
													</td>
												</tr>
												<tr style="border-color: white;">
													<td width="50%" style="border-color: white;"></td>
													<td width="50%" style="border-color: white;">

														<table class="table table-striped invoice_table">
															<tfoot>
																<tr>
																	<td colspan="6"></td>
																	<td class="col_total text-right">Gross Salary</td>
																	<td class="col_total"><strong> ${additionsum}
																	</strong></td>
																</tr>
																<tr>
																	<td colspan="6"></td>
																	<td class="col_total text-right">Total Deduction</td>
																	<td class="col_total"><strong> ${deductionsum}
																	</strong></td>
																</tr>
																<tr class="grand_total">
																	<td colspan="6"></td>
																	<td class="col_total text-right">Net Salary</td>
																	<td class="col_total"><strong> ${total?.totalPaid}
																	</strong></td>
																</tr>

															</tfoot>
														</table>
													</td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-6">
								<div class="pull-left">
									<ul class="list-unstyled">

										<li>Place: <strong>Bidar</strong></li>
									</ul>
								</div>

							</div>
							<div class="col-md-6">
								<div class="pull-right">
									<ul class="list-unstyled">
										<li>Office Seal</li>
									</ul>
								</div>
							</div>
						</div>


					</div>
				</div>
			</div>
		</div>
	</div>
</div>


<div class="text-center">
	<a onclick="printDiv('printableArea')"
		style="background: #00c0ef; border:#00c0ef" class="btn btn-primary"><i
		class="fa fa-print"></i> Take Print</a>
</div>

