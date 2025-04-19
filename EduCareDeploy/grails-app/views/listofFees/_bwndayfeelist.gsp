<%@page import="com.hiideals.instituite.helper.AcademicYear"%>
<%@ page import="com.hiideals.instituite.classcourses.IClass"%>
<%@ page import="com.hiideals.instituite.student.Student"%>
<%@ page import="com.hiideals.instituite.feemanagment.Fee"%>



<div class="col-md-12" id="Changedisplay">
	<div id="printableArea">
		<%--
						<g:render template="/listofStudents/listofstudenttable"></g:render>
						--%>
		<div class="portlet box green">
			<div class="portlet-title">
				<div class="caption">
					<i class="fa fa-user"></i> List of Fee with student Name
				</div>
			</div>
			<div class="portlet-body">
				<div class="table-scrollable">
					<div id='printarea'>
						<table border="1" class="table table-bordered table-hover"
							id="res">
							<thead>
								<tr style="color: #337ab7;">

									<th><g:message code="fee.studentId.label"
											default="Student Name" /></th>

									
									<th>Total fee</th>

									<th>Invoice No</th>
									<th><g:message
											code="${message(code: 'fee.totalPaid.label', default: 'Total Paid')}" /></th>
<th><g:message
											code="${message(code: 'fee.due.label', default: 'Due')}" /></th>

									<th>
										${message(code: 'fee.lastUpdated.label', default: 'Updated Date	')}
									</th>

									<th>Class</th>

									<th>Academic Year</th>

								</tr>
							</thead>
							<tbody>

								<g:each in="${feeInstanceList}" status="i" var="feeInstance">
									<g:if test="${feeInstance !=null }">
										<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
											<g:set value="${Student.findById(feeInstance?.studentId)}"
												var="student"></g:set>
											<td>
												${feeInstance?.studentName}
											</td>


											<g:set value="${student?.academicyear}" var="aca"></g:set>

											<g:set value="${Fee.findByAcademic(aca[0])}" var="aca1"></g:set>




											<td class="countable2">
												${ aca1?.totalFee}
											</td>
											<td>
												${feeInstance?.invoiceNo}
											</td>
											<td class="countable">
											<g:if test="${feeInstance?.feetypetracker?.amountPaidT[3]}">
											${feeInstance?.feetypetracker?.amountPaidT[3]}
											</g:if>
											<g:elseif
													test="${feeInstance?.feetypetracker?.amountPaidT[3]==0 && feeInstance?.feetypetracker?.amountPaidT[2]}">
													${feeInstance?.feetypetracker?.amountPaidT[2]}
												</g:elseif> <g:elseif
													test="${feeInstance?.feetypetracker?.amountPaidT[2]==0 && feeInstance?.feetypetracker?.amountPaidT[3]==0 && feeInstance?.feetypetracker?.amountPaidT[1]}">
													${feeInstance?.feetypetracker?.amountPaidT[1]}
												</g:elseif> <g:elseif
													test="${feeInstance?.feetypetracker?.amountPaidT[1]==0 && feeInstance?.feetypetracker?.amountPaidT[2]==0 && feeInstance?.feetypetracker?.amountPaidT[0]}">
													${feeInstance?.feetypetracker?.amountPaidT[0]}
												</g:elseif>
												
												</td>
												
												<td>0</td>
											<%--<td class="countable1">
												${feeInstance?.feetypetracker?.sum { it?.dueT }}
											</td> --%>
												
											<td>
												<g:formatDate date="${feeInstance?.dateCreated}" format="dd-MM-yyyy"/>  
											</td>





											<td>
												${(student?.academicyear?.presentclass?.classname).toString().replace('[', '').replace(']', '')}
											</td>
											<td>
												${(student?.academicyear?.academicyear).toString().replace('[', '').replace(']', '')}
											</td>


											<%--<td>
																${fieldValue(bean: feeInstance, field: "totalFee")}
															</td>
															<td>
																${fieldValue(bean: feeInstance, field: "discount")}
															</td>

															<td class="countable">
															${feeInstance?.feetypes?.amountPaid}
															
															
															
															
															<g:if test="${feeInstance?.feetypes?.amountPaid[3]==0 && feeInstance?.feetypes?.amountPaid[2]}"> 
															${feeInstance?.feetypes?.amountPaid[2]}
															</g:if>
															<g:if test="${feeInstance?.feetypes?.amountPaid[2]==0 && feeInstance?.feetypes?.amountPaid[3]==0 && feeInstance?.feetypes?.amountPaid[1]}"> 
															${feeInstance?.feetypes?.amountPaid[1]}
															</g:if>
															<g:if test="${feeInstance?.feetypes?.amountPaid[1]==0 && feeInstance?.feetypes?.amountPaid[2]==0 && feeInstance?.feetypes?.amountPaid[0]}"> 
															${feeInstance?.feetypes?.amountPaid[0]}
															</g:if>
														
															</td>
															
															<td>
																${fieldValue(bean: feeInstance?.studentId?.academicyear?.presentclass, field: "classname").toString().replace('[', '').replace(']', '')}
															</td>
															<td>
																${fieldValue(bean: feeInstance?.studentId?.academicyear, field: "academicyear").toString().replace('[', '').replace(']', '')}
															</td>
														--%>
										</tr>
									</g:if>

								</g:each>
								<tr style="color: #337ab7">
									<td><b>Total : </b></td>
									<td><b id="result1"></b></td>
									<td><b id="result2"></b></td>
									<td><b></b></td>
									<td><b id="result"> </b></td>
									<td colspan="1"></td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>

			</div>
		</div>

	</div>

	<div class="text-center">
		<%--<g:form controller="listofFees" action="getfeelist" target='_blank'>
<g:hiddenField name="field" value="${params?.field}"/>
<g:hiddenField name="iclass" value="${params?.iclass}"/>
<g:hiddenField name="from" value="${params?.from}"/>
<g:hiddenField name="typ" value="${params?.typ}"/>
<g:hiddenField name="to" value="${params?.to}"/>
<g:hiddenField name="amount" value="${params?.amount}"/>
<g:hiddenField name="Search" value="Search"/><br>
<g:submitButton class="btn blue" name="Get Print"/>
</g:form>--%>
		<input type='button' id='btn' value='Take Print'
			class="btn btn-primary" onclick='printFunc();'>
	</div>
</div>




<script type="text/javascript">
var cls = document.getElementById("res").getElementsByTagName("td");
var sum = 0;
for (var i = 0; i < cls.length; i++){
    if(cls[i].className == "countable"){
        sum += isNaN(cls[i].innerHTML) ? 0 : parseInt(cls[i].innerHTML);
    }
}
document.getElementById('result').innerHTML = sum;




var sum = 0;
for (var i = 0; i < cls.length; i++){
    if(cls[i].className == "countable1"){
        sum += isNaN(cls[i].innerHTML) ? 0 : parseInt(cls[i].innerHTML);
    }
}
document.getElementById('result1').innerHTML = sum;


var sum = 0;
for (var i = 0; i < cls.length; i++){
    if(cls[i].className == "countable2"){
        sum += isNaN(cls[i].innerHTML) ? 0 : parseInt(cls[i].innerHTML);
    }
}
document.getElementById('result2').innerHTML = sum;

function printFunc() {
    var divToPrint = document.getElementById('printarea');
    var htmlToPrint = '' +
        '<style type="text/css">' +
        'table th, table td {' +
        'border:1px solid #ddd;' +
        'padding;0.5em;' +
        '}' +
        '</style>';
    htmlToPrint += divToPrint.outerHTML;
    newWin = window.open("");
    newWin.document.write("<h3 align='center'>Fee List</h3>");
    newWin.document.write(htmlToPrint);
    newWin.print();
    newWin.close();
    }
</script>


