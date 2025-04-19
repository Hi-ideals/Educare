<%@ page import="com.hiideals.instituite.EDcoding.LookUpED"%>
<g:form controller="transfercertificate"  target='_blank'>
	<g:if test="${student?.studentName==null}">
	
		<p style="color: #ff4900">Please enter register number and student name .</p>
	</g:if>
	<g:else>

		<div class="portlet box grey">
			<div class="portlet-title">
				<div class="caption">
					<i class="fa fa-user"></i>Transfer certificate Student Details
				</div>
			</div>
			<div class="portlet-body">

				<table class="table table-striped table-hover">
					<tr>
						<td width="15%">Institute Name:</td>
						<th>
							${student.instituite?.name}
						</th>
						
						<td width="15%">Registration Number:</td>
						<th>
							${student?.registrationNo}
						</th>
					</tr>
					<tr>
						<td width="15%">Name</td>
						<th>
							${student?.studentName}
						</th>
						<td width="15%">Date Of Birth</td>
						<th>
							<g:formatDate format="dd-MMM-yyyy" date="${student?.studentDOB}"/>
						</th>
					</tr>
					<tr>
						<td width="15%">Mother</td>
						<th>
							${student?.motherDetails?.parentName}
						</th>
						<td width="15%">Father</td>
						<th>
							${student?.fatherDetails?.parentName }
						</th>
					</tr>
					<tr>
						<td width="15%">Religion</td>
						<th>
							${student?.religion}
						</th>
						<td width="15%">Nationality</td>
						<th>
							${student?.nationality}
						</th>
					</tr>
					<tr>
						<td width="15%">Gender</td>
						<th>
							${student?.gender}
						</th>
						<td width="15%">Category</td>
						<th>
							${student?.category}
						</th>
					</tr>
					<tr>
						<td>Class</td>
						<th>
							
				<g:each in="${student?.academicyear}">
<g:if test="${it.status == 'current'}">
</g:if>
</g:each>
<g:set value="${it?.presentclass}" var="pclass"></g:set>
							
								
							${pclass?.classname }	
						</th>
						<td>Section</td>
						<th>
							
				<g:each in="${student?.academicyear}">
<g:if test="${it.status == 'current'}">
</g:if>
</g:each>
<g:set value="${it?.section}" var="pclass"></g:set>
							
								
							${pclass?.sectionName}	
						</th>
					</tr>
					<tr>
					<td>Studen Id</td>
					<th>
					${student?.studentId }
					</th>
					<td>STS Number</td>
					<th>
					${student?.stsSystem}
					</th>
					</tr>
					<tr>
					<td>Medium of Instruction</td>
					<th>
					<input type="text" name="mediumofInstruction"
					class="form-control" id="mediumofInstruction" required="required">
					</th>
					<td>Admission Date</td>
					<th>
					<g:formatDate format="yyyy-MM-dd" date="${student?.studentDOJ}"/>
					</th>
					</tr>
					<tr>
					<td>Whether Qualified for promotion to higher standard ?</td>
					<th>
					<select name="stPromotion">
  					<option value="yes">Yes</option>
  					<option value="no">No</option>
					</select></th>
					<td>Whether Candidate has paid all the fee ?</td>
					<th>
					<select name="stfeePaid">
  					<option value="yes">Yes</option>
  					<option value="no">No</option>
					</select></th>
					</tr>
					<tr>
					<td>Scholarship if any</td>
					<th><select name="stScholarship">
  					<option value="yes">Yes</option>
  					<option value="no">No</option>
					</select></th>
					<td>Medically Examined or not</td>
					<th><select name="stmedicalExamine">
  					<option value="yes">Yes</option>
  					<option value="no">No</option>
					</select></th>
					</tr>
					<tr>
					<td>TC Issued date</td>
						<td><input type="text" id="dateissued" name="stTcissuedate"
							class="form-control" required="required"></td>
					<td>Date of candidate's last attendance</td>
					<th><input type="text" id="dateissuedone" name="stlastattendancedate"
							class="form-control" required="required"></th>
					</tr>
					<tr>
					<td>Number of school days up to the date of leaving</td>
					<th><input type="text" name="noOfschoolDays"
					class="form-control" id="noOfschoolDays" required="required"></th>
					<td>Number of school days the candidates attendant</td>
					<th><input type="text" name="noOfstattendanceDays"
					class="form-control" id="noOfstattendanceDays" required="required"></th>
					</tr>
					
					<tr>
						<td>Character & Conduct</td>
						<th><input type="text" name="stCharacterconduct"
							class="form-control" id="stCharacterconduct" required="required">
						</th>
						<td></td>
						<th>
							<%--<g:link class="btn blue" controller="bonafiedcrt" action="printbonafied" target="blank"><i class="fa fa-print"></i>Get print</g:link>
				--%>
						</th>

					</tr>

				</table>
				<g:hiddenField name="id" value="${student.id }" />
				<g:actionSubmit class="btn blue" action="printtransfercertificate"
					params="[id:student.id]" value="submit" />

				<script type="text/javascript">
		$(document).ready(function() {
			$("#dateissued").datepicker({
				changeMonth : true,
				changeYear : true,

				onSelect : function() {
					$("#dateissued").focusout();
				}
			});
			$("#dateissuedone").datepicker({
				changeMonth : true,
				changeYear : true,

				onSelect : function() {
					$("#dateissuedone").focusout();
				}
			});
		});
	</script>
				
				<%--
				<script type="text/javascript">
					$(document).ready(function() {
						$("#dateissued").datepicker({
							changeMonth : true,
							changeYear : true,
							yearRange : "1800:3000",
						});
					});
				</script>
			--%>
			</div>
		</div>



	</g:else>
</g:form>
