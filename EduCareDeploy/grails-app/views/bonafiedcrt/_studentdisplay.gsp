<%@ page import="com.hiideals.instituite.EDcoding.LookUpED"%>
<g:form controller="bonafiedcrt" action="printbonafied">
	<g:if test="${student?.studentName==null}">
	<p style="color:#ff4900">Please enter register number and student name </p>
	</g:if>
	<g:else>

		<div class="portlet box grey">
			<div class="portlet-title">
				<div class="caption">
					<i class="fa fa-user"></i>Student Details
				</div>
			</div>
			<div class="portlet-body">

				<table class="table table-striped table-hover">
					<tr>
						<td width="15%">Name</td>
						<th>
							${student?.studentName}
						</th>
						<td width="15%">Father</td>
						<th>
							${student?.fatherDetails?.parentName }
						</th>
					</tr>
					<tr>
						<td>Class</td>
						<th><g:each in="${student?.academicyear}">
								<g:if test="${it.status == 'current'}">
								</g:if>
							</g:each> <g:set value="${it?.presentclass}" var="pclass"></g:set> ${pclass.classname }


						</th>
						<td>Section</td>
						<th><g:each in="${student?.academicyear}">
								<g:if test="${it.status == 'current'}">
								</g:if>
							</g:each> <g:set value="${it?.section}" var="pclass"></g:set> ${pclass?.sectionName}




						</th>
					</tr>
					<tr>

						<td>Academic year</td>
						<th>
							${student?.academicyear?.academicyear.toString().replace('[', '').replace(']', '')}
						</th>
						<td>date issued</td>
						<td><input type="text" id="dateissued" name="studentDOB1"
							class="form-control date-picker" required="required"></td>
					</tr>
					<tr>
						<td>Character</td>
						<th><input type="text" name="stcharacter"
							class="form-control" id="form_control_1" required="required">
						</th>
						<td></td>
						<th>
							<%--<g:link class="btn blue" controller="bonafiedcrt" action="printbonafied" target="blank"><i class="fa fa-print"></i>Get print</g:link>
				--%>
						</th>

					</tr>

				</table>
				<g:hiddenField name="id" value="${student.id }" />
				<g:actionSubmit class="btn blue" action="printbonafied"
					params="[id:student.id]" value="submit" />

				<script type="text/javascript">
					$(document).ready(function() {
						$("#dateissued").datepicker({
							changeMonth : true,
							changeYear : true,
							yearRange : "1800:3000",
						});
					});
				</script>

			</div>
		</div>



	</g:else>
</g:form>
