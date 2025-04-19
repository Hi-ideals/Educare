<%@ page import="com.hiideals.instituite.student.ParentDetails"%>


<div class="form-body">
	<div class="row">
		<div class="col-md-3">

			<g:if test="${!parent.equalsIgnoreCase('Guardian')}">
				<label> ${parent} Name<span class="required-indicator"
					style="color: red">*</span>
				</label>
			</g:if>
			<g:else>
				<label> ${parent} Name<span class="required-indicator"
					style="color: red"></span>
				</label>
			</g:else>
			<div
				class="fieldcontain ${hasErrors(bean: parentDetailsInstance, field: 'parentName', 'error')} required">
				<g:textField name="${petails}.parentName" class="form-control"
					id="parentName${petails}" pattern=".{3,}"
					title="Minmum Three letter guardian name"
					value="${parentDetailsInstance?.parentName}" onkeyup="guardian()" />
				<%--
				<label for="parentName"> <g:message
							code="parentDetails.parentName.label" default="${parent} Name" />
						<span class="required-indicator" style="color:red">*</span>
					</label>
				 --%>
			</div>
			<div id="SparentName${petails}" style="display: none; color: red">
				Provide your
				${parent}
				Name
			</div>
			<div id="error${petails}" style="color: red"></div>
		</div>



		<div class="col-md-3">
			<g:if test="${!parent.equalsIgnoreCase('Guardian')}">
				<label>Occupation</label>
			</g:if>
			<g:else>
				<label>Occupation</label>
			</g:else>
			<div
				class="fieldcontain ${hasErrors(bean: parentDetailsInstance, field: 'occupation', 'error')} ">
				<g:textField name="${petails}.occupation" class="form-control"
					value="${parentDetailsInstance?.occupation}" pattern=".{2,}"
					title="Minmum Three letter guardian name" 
					onkeyup="Occupation()" />
				<%--
				<label for="occupation"> <g:message
							code="parentDetails.occupation.label" default="Occupation" /> <span
						class="required-indicator" style="color:red">*</span>
					</label>
				 --%>
			</div>
			
		</div>


		<%--
		<div class="col-md-3">
			<label>Relation<span class="required-indicator"
				style="color: red">*</span></label>
			<div
				class="fieldcontain ${hasErrors(bean: parentDetailsInstance, field: 'relation', 'error')} required">
				<g:textField name="${petails}.relation" class="form-control"
					id="Relation${petails}" value="${parentDetailsInstance?.relation}" />
				<label for="relation"> <g:message
							code="parentDetails.relation.label" default="Relation" /> <span
						class="required-indicator" style="color:red">*</span>
					</label>
			</div>
			<div id="SRelation${petails}" style="display: none; color: red">Provide
				your Relation</div>
		</div>
		 --%>



		<div class="col-md-3">
			<g:if
				test="${parent.equalsIgnoreCase('Guardian')||parent.equalsIgnoreCase('Mother')}">
				<label>Mobile Number<span class="required-indicator"
					style="color: red"></span></label>
			</g:if>
			<g:else>
				<label>Mobile Number<span class="required-indicator"
					style="color: red">*</span></label>
			</g:else>
			<div
				class="fieldcontain ${hasErrors(bean: parentDetailsInstance, field: 'mobileNumber', 'error')} ">
				<g:textField name="${petails}.mobileNumber" class="form-control" maxlength="10"
					value="${parentDetailsInstance?.mobileNumber}"
					id="mobileNumber${petails}" />
				<%--
				<label for="mobileNumber"> <g:message
							code="parentDetails.mobileNumber.label" default="Mobile Number" />
					</label>
				 --%>
			</div>
			<div id="SmobileNumber${petails}" style="display: none; color: red">Provide
				your Mobile Number</div>
		</div>

		<div class="col-md-3">
			<label>Adhar Card Number</label>
			<div
				class="fieldcontain ${hasErrors(bean: parentDetailsInstance, field: 'parentAdharNo', 'error')} ">
				<g:textField name="${petails}.parentAdharNo" class="form-control" maxlength="12"
					value="${parentDetailsInstance?.parentAdharNo}" />
				<%--
				<label for="mobileNumber"> <g:message
							code="parentDetails.mobileNumber.label" default="Mobile Number" />
					</label>
				 --%>
			</div>
		</div>
	</div>
</div>
<div class="form-body">
	<div class="row">
		<div class="col-md-3">
			<label>Voter Id Number</label>
			<div
				class="fieldcontain ${hasErrors(bean: parentDetailsInstance, field: 'parentVoterId', 'error')} ">
				<g:textField name="${petails}.parentVoterId" class="form-control"
					value="${parentDetailsInstance?.parentVoterId}" />
				<%--
				<label for="mobileNumber"> <g:message
							code="parentDetails.mobileNumber.label" default="Mobile Number" />
					</label>
				 --%>
			</div>
		</div>

		<div class="col-md-3">
			<label>Qualification</label>
			<div
				class="fieldcontain ${hasErrors(bean: parentDetailsInstance, field: 'parentQualification', 'error')} ">
				<g:textField name="${petails}.parentQualification"
					class="form-control"
					value="${parentDetailsInstance?.parentQualification}" />
				<%--
				<label for="mobileNumber"> <g:message
							code="parentDetails.mobileNumber.label" default="Mobile Number" />
					</label>
				 --%>
			</div>
		</div>

	</div>
</div>

