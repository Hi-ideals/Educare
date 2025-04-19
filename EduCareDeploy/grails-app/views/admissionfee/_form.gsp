<%@ page import="com.hiideals.instituite.feemanagment.Admissionfee"%>
<%@page import="com.hiideals.instituite.main.Instituite"%>
<%@ page import="com.hiideals.instituite.classcourses.IClass"%>
<div class="form-body">
	<div class="row">


		<div class="col-md-3">
			<div>
				<label for="name"> <g:message code="admissionfee.name.label"
						default="Name" /> <span class="required-indicator">*</span>
				</label>
			<g:if test= "${admissionfeeInstance?.name == "Admission Fee" || admissionfeeInstance?.name == null }">
				<g:textField name="name" required="" class="form-control"
					value="Admission Fee" /></g:if><g:else>
				<g:textField name="name" required="" class="form-control"
					value="${admissionfeeInstance?.name}" />
					</g:else>
				<div id="Aiclass" style="display: none; color: red">Select
					your Class</div>
			</div>
		</div>




		<div class="col-md-3">
			<div>
				<label for="admin"> Select Class </label> <select id="iclass"
					class="form-control" name="iclass">
					<g:if test="${admissionfeeInstance.iclass !=null}">
						<option value="${admissionfeeInstance.iclass?.id}">
							${admissionfeeInstance.iclass?.classname}
						</option>
					</g:if>
					<g:else>
						<option></option>
					</g:else>
					<g:each in="${IClass.findAllByInstituite(instituite)}" var="cls">
							<option value="${cls.id}">
								${cls.classname}
							</option>
						</g:each>
				</select>
				<div id="Aiclass" style="display: none; color: red">Select
					your Class</div>
			</div>
		</div>

		<%--<div class="col-md-3">
			<div class="form-group form-md-line-input form-md-floating-label">
				<div
					class="fieldcontain ${hasErrors(bean: admissionfeeInstance, field: 'iclass', 'error')} required">

					<g:select id="iclass" name="iclass.id" class="form-control"
						from="${com.hiideals.instituite.classcourses.IClass.list()}"
						optionKey="id" required=""
						value="${admissionfeeInstance?.iclass?.id}" class="many-to-one" />
					<label for="iclass"> <g:message
							code="admissionfee.iclass.label" default="Iclass" /> <span
						class="required-indicator">*</span>
					</label>
				</div>
			</div>
		</div>


		--%>
		<div class="col-md-3">
			<div>
				<label for="totalAmount"> <g:message
						code="admissionfee.totalAmount.label" default="Total Amount" /> <span
					class="required-indicator">*</span>
				</label>
				<g:field name="totalAmount" type="number" class="form-control"
					value="${admissionfeeInstance.totalAmount}" required="" />
				<div id="Aiclass" style="display: none; color: red">Select
					your Class</div>
			</div>
		</div>


		<div class="col-md-4" style="display: none">
			<div
				class="fieldcontain ${hasErrors(bean: admissionfeeInstance, field: 'instituite', 'error')} ">
				<label for="admin"> <g:message code="instituite.admin.label"
						default="instituite" />
				</label> <select id="instituite" class="form-control" name="instituite?.id">
					<option value="${instituite?.id}">
						${instituite?.name}
					</option>
				</select>

			</div>
		</div>
		<%--

		<div
			class="fieldcontain ${hasErrors(bean: admissionfeeInstance, field: 'instituite', 'error')} required">
			<label for="instituite"> <g:message
					code="admissionfee.instituite.label" default="Instituite" /> <span
				class="required-indicator">*</span>
			</label>
			<g:select id="instituite" name="instituite.id"
				from="${com.hiideals.instituite.main.Instituite.list()}"
				optionKey="id" required=""
				value="${admissionfeeInstance?.instituite?.id}" class="many-to-one" />

		</div>




		--%>
		<%--<div
			class="fieldcontain ${hasErrors(bean: admissionfeeInstance, field: 'name', 'error')} required">
			<label for="name"> <g:message code="admissionfee.name.label"
					default="Name" /> <span class="required-indicator">*</span>
			</label>
			<g:textField name="name" required=""
				value="${admissionfeeInstance?.name}" />

		</div>



		--%>
		<%--<div
			class="fieldcontain ${hasErrors(bean: admissionfeeInstance, field: 'totalAmount', 'error')} required">
			<label for="totalAmount"> <g:message
					code="admissionfee.totalAmount.label" default="Total Amount" /> <span
				class="required-indicator">*</span>
			</label>
			<g:field name="totalAmount" type="number"
				value="${admissionfeeInstance.totalAmount}" required="" />

		</div>

	--%>
	</div>
</div>