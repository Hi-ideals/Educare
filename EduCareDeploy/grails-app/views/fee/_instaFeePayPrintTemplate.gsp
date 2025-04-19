
<div class="row">
	<div class="col-md-12">
		<div class="table">
			<table width="100%" border="0" cellpadding="0" cellspacing="0"
				align="center">
				<tr style="border: 1px solid #eee">
					<td width="100%" valign="top" bgcolor="#ffffff"
						style="padding-top: 20px">
						<!--Start Header-->
						<table width="700" bgcolor="#fff" border="0" cellpadding="0"
							cellspacing="0" align="center" class="deviceWidth">
							<tr>
								<td style="padding: 6px 0px 0px">
									<table width="650" border="0" cellpadding="0" cellspacing="0"
										align="center" class="deviceWidth">
										<tr>
											<td width="100%">
												<!--Start logo-->
												<table border="0" cellpadding="0" cellspacing="0"
													align="left" class="deviceWidth">
													<tr>
														<td class="center" style="padding: 20px 0px 10px 0px">
															<a href="#"><images:getImage
																	id="${institute?.logo?.id}" width="80px" height="80px" /></a>
														</td>
													</tr>
												</table> <!--End logo--> <!--Start nav-->
												<table border="0" cellpadding="0" cellspacing="0"
													align="center" class="deviceWidth">
													<tr>
														<td class="center"
															style="font-size: 13px; color: #272727; font-weight: light; text-align: center; font-family: Arial, Helvetica, sans-serif; line-height: 25px; vertical-align: middle;">
															<h2>
																${institute?.name }
															</h2>
															<p>
																Affiliated to:
																${institute?.affiliatedTo }
															</p>
														</td>
													</tr>
												</table> <!--End nav-->
											</td>
										</tr>
									</table>
								</td>
							</tr>
						</table> <!--End Header--> <!-- Start Headliner--> <!-- End Headliner--> <!--Start Discount-->
						<table width="700" border="0" cellpadding="0" cellspacing="0"
							align="center" class="deviceWidth" style="margin-bottom: 10px">
							<tr>
								<td width="50%" style="padding: 10px 0; border: 1px solid #000;"
									align="center" bgcolor="#eee">
									<!--Left Box-->
									<table border="0" cellpadding="0" cellspacing="0"
										align="center" class="deviceWidth">
										<tr>
											<td valign="top" class="left"
												style="font-size: 16px; color: #000; font-weight: bold; text-align: center; font-family: Arial, Helvetica, sans-serif; line-height: 25px; vertical-align: middle; padding: 0 20px 10px 20px;">
												Fee Receipt/Invoice</td>
										</tr>
									</table> <!--End Left Box-->

								</td>
							</tr>
						</table> <!--End Discount--> <!--Start Left Picture-->
						<table width="700" border="0" cellpadding="0" cellspacing="0"
							align="center"
							style="border-bottom: 1px solid #555; margin-bottom: 10px"
							class="deviceWidth">
							<tr>
								<td width="100%" bgcolor="#fff">
									<!-- Left box  -->
									<table width="45%" align="left" border="0" cellpadding="0"
										cellspacing="0" class="deviceWidth"
										style="margin-bottom: 10px">
										<tr>
											<td valign="top"
												style="padding: 20px 0px 0px 0px; font-size: 14px; color: #303030; font-weight: bold;">
												Registration Number: ${studentdetails.registrationNo}
											</td>
										</tr>
										<tr>
											<td valign="top"
												style="padding: 2px 0px; font-size: 14px; color: #303030; font-weight: bold;">
												Student Name: ${feeTracker?.studentName}
											</td>
										</tr>
										<tr>
											<td valign="top"
												style="padding: 2px 0px; font-size: 14px; color: #303030; font-weight: bold;">
												Father Name: ${studentdetails?.fatherDetails?.parentName}
											</td>
										</tr>
									</table> <!--End left box--> <!--Right box-->
									<table width="55%" align="left" border="0" cellpadding="0"
										cellspacing="0" class="deviceWidth">
										<tr>
											<td
												style="font-size: 14px; color: #303030; font-weight: bold; text-align: right; font-family: Arial, Helvetica, sans-serif; line-height: 25px; vertical-align: middle; padding: 20px 0px 0px 0px">
												Class:${studentdetails?.presentclass?.classname}
											</td>
										</tr>
										<tr>
											<td
												style="font-size: 14px; color: #303030; font-weight: bold; text-align: right; font-family: Arial, Helvetica, sans-serif; line-height: 25px; vertical-align: middle; padding: 2px 0px">
												Date: <g:formatDate format="dd-MMM-yyyy"
													date="${feeTracker?.lastUpdated}" />


											</td>
										</tr>


									</table> <!--End right box-->
								</td>
							</tr>
						</table> <!--Start Support-->
						<table width="700" border="0" cellpadding="0" cellspacing="0"
							align="center" class="deviceWidth">
							<tr>
								<td width="100%" class="center">
									<table class="table table-striped" border="0" cellpadding="10"
										cellspacing="10" align="left">
										<tr>
											<th>Particulars</th>
											<th>Paid Amount</th>
											<%--
									<th>Due Amount</th>
									--%>
										</tr>
										<g:each in="${b}" var="fInstance" status="i">
											<tr>
												<td>
													${fInstance.instFeeTypeT}
												</td>
												<td>
													${fInstance.amountPaidT}
												</td>
												<%--<td>
											${fInstance.dueT}
										</td>
										--%>
											</tr>
										</g:each>
									</table>

								</td>
							</tr>
						</table> <!--End Support--> <!-- Footer -->
						<table width="700" border="0" cellpadding="0" cellspacing="0"
							align="center" class="deviceWidth">
							<tr>
								<td class="right"
									style="font-size: 15px; font-weight: bold; color: #687074; border-top: 1px solid #555; border-bottom: 1px solid #555; font-weight: bold; text-align: right; font-family: Arial, Helvetica, sans-serif; line-height: 25px; vertical-align: middle; padding: 20px 0px 10px 0px;">
									Total Amount Paid: ${sum}
								</td>
							</tr>

						</table> <!--End Footer-->

						<div style="height: 15px">&nbsp;</div> <!-- divider-->


					</td>
				</tr>
			</table>



		</div>
	</div>
</div>








<div class="row">
	<div class=" text-center">
		<button class="btn btn-primary" onclick="javascript:window.print();">
			<i class="fa fa-print"></i> Print
		</button>
	</div>
</div>


