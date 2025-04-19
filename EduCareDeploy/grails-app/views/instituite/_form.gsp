<%@ page import="com.hiideals.instituite.main.Instituite"%>

<div class="form-body">
	<div class="row">
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: instituiteInstance, field: 'name', 'error')} required">
				<label for="name"> <g:message code="instituite.name.label"
						default="Name" /> <span class="required-indicator">*</span>
				</label>
				<g:textField name="name" class="form-control" required=""
					value="${instituiteInstance?.name}" />
			</div>
		</div>


		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: instituiteInstance, field: 'caption', 'error')} required">
				<label for="caption"> <g:message
						code="instituite.caption.label" default="Caption" /> <span
					class="required-indicator">*</span>
				</label>
				<g:textField name="caption" class="form-control" required=""
					value="${instituiteInstance?.caption}" />
			</div>
		</div>


		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: instituiteInstance, field: 'affiliatedTo', 'error')} required">
				<label for="affiliatedTo"> <g:message
						code="instituite.affiliatedTo.label" default="Affiliated To" /> <span
					class="required-indicator">*</span>
				</label>
				<g:textField name="affiliatedTo" class="form-control" required=""
					value="${instituiteInstance?.affiliatedTo}" />
			</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: instituiteInstance, field: 'description', 'error')} required">
				<label for="description"> <g:message
						code="instituite.description.label" default="Description" /> <span
					class="required-indicator">*</span>
				</label>
				<g:textField name="description" class="form-control" required=""
					value="${instituiteInstance?.description}" />
			</div>
		</div>
	</div>
</div>

<div class="form-body margin-bottom-10">
	<div class="row">
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: instituiteInstance, field: 'institutionFax', 'error')}">
				<label for="institutionFax"> <g:message
						code="instituite.institutionFax.label" default="Institution Fax" />

				</label>
				<g:textField name="institutionFax" class="form-control"
					value="${instituiteInstance?.institutionFax}" />
			</div>
		</div>


		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: instituiteInstance, field: 'phone', 'error')} required">
				<label for="phone"> <g:message code="instituite.phone.label"
						default="Institution Phone Number " /> <span
					class="required-indicator">*</span>
				</label>
				<g:textField name="phone" class="form-control" required=""
					value="${instituiteInstance?.phone}" />
			</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: instituiteInstance, field: 'institutionID', 'error')} required">
				<label for="institutionID"> <g:message
						code="instituite.institutionID.label" default="Institution ID" />
					<span class="required-indicator">*</span>
				</label>
				<g:if test="${instituiteInstance?.institutionID !=null}">
					<g:textField name="institutionID" class="form-control" required=""
						value="${instituiteInstance?.institutionID}" />
				</g:if>
				<g:else>
					<regId:getInstId admin="${admin}" />
				</g:else>
			</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: instituiteInstance, field: 'institutionPrefixName', 'error')} required">
				<label for="institutionPrefixName"> <g:message
						code="instituite.institutionPrefixName.label"
						default="Set Institute Prefix Name" /> <span
					class="required-indicator">*</span>
				</label>
				<g:textField name="institutionPrefixName" class="form-control"
					min="3" maxlength="4" required="" id="institutionPrefixName"
					value="${instituiteInstance?.institutionPrefixName}" />

			</div>
			<div id="IinstitutionPrefixName" style="display: none; color: red">
				Provide your prefix name</div>
			<div id="IinstitutionPrefixName1" style="display: none; color: red">Prefix
				name should be min 3 character</div>
		</div>
	</div>
</div>

<div class="form-body margin-bottom-10">
	<div class="row">

		<section class="col-md-12">
			<g:if test="${instituiteInstance?.logo != null }">
				<ul class="list-inline">
					<li><h4>Do you want to change logo..</h4>
					<h6>(Upload only PNG image)</h6>
					
					</li>
					<li><input type="radio" onclick="$('#openimg').show(500)"
						name="openimg" value="yes" /> Yes</li>
					<li><input type="radio" onclick="$('#openimg').hide(500)"
						name="openimg" value="no" checked="checked" /> No</li>
					<li><images:getImage id="${instituiteInstance?.logo?.id }" width="150px" /></li>
				</ul>
				
			</g:if>

			<div id="openimg" style="display: ${edit}">
				Upload a new Logo:

				<div class="fileinput fileinput-new" data-provides="fileinput">
					<div>
					<span class="btn default btn-file" style="margin-left:26px;"> <span
							class="fileinput-new"> Select Image </span> <input type="file"
							id="file_1" name="file_1" name="..." accept=".png">
						</span>
					</div>
				</div>
			</div>

			<%-- 
			Upload a Logo:
			<p>
				<label for="p_scnts"><input type="file" id="file_1"
					size="10" name="file_1" value="" placeholder="Input Value"
					class="form-control" /></label>

				<g:if test="${instituiteInstance?.logo != null }">
					<images:getImage id="${instituiteInstance?.logo?.id }" height="100px" width="100px"/>
				</g:if>
			</p>
			 --%>

		</section>

	</div>
	
	<div class="row">

		<section class="col-md-12" style="margin-top:15px;">
			<g:if test="${instituiteInstance?.signature != null }">
				<ul class="list-inline">
					<li><h4>Do you want to change signature..</h4>
				
					<h6>(Upload only PNG image)</h6>
					
					</li>
					
					<li><input type="radio" onclick="$('#openimgg').show(500)"
						name="openimgg" value="yes"  /> Yes</li>
						
					<li><input type="radio" onclick="$('#openimgg').hide(500)"
						name="openimgg" value="no" checked="checked"  /> No</li>
					<li><images:getImage id="${instituiteInstance?.signature?.id }" width="150px" /></li>
				</ul>
				
			</g:if>

			<div id="openimgg" style="display: ${edit}">
				Upload a new Signature:

				<div class="fileinput fileinput-new" data-provides="fileinput">
					<div>
						<span class="btn default btn-file"> <span
							class="fileinput-new"> Select Image </span> <input type="file"
							id="file" name="file" name="..." accept=".png">
						</span>
					</div>
				</div>
			</div>

			<%-- 
			Upload a Logo:
			<p>
				<label for="p_scnts"><input type="file" id="file_1"
					size="10" name="file_1" value="" placeholder="Input Value"
					class="form-control" /></label>

				<g:if test="${instituiteInstance?.logo != null }">
					<images:getImage id="${instituiteInstance?.logo?.id }" height="100px" width="100px"/>
				</g:if>
			</p>
			 --%>

		</section>

	</div>
	
	
	<div class="row">
		<div class="col-md-3" style="display: none">
			<div class="form-group form-md-line-input form-md-floating-label">
				<div
					class="fieldcontain ${hasErrors(bean: instituiteInstance, field: 'admin', 'error')} ">
					<select id="admin" class="form-control" name="admin.id">
						<option value="${admin?.id}">
							${admin?.adminName}
						</option>
					</select> <label for="admin"> <g:message
							code="instituite.admin.label" default="Admin" />
					</label>
				</div>
			</div>
		</div>
	</div>
</div>
<div class="portlet-title">
	<div class="caption font-blue">
		<i class="fa fa-home font-blue"></i> <span
			class="caption-subject bold uppercase" style="font-family:roboto"> Add Institute Address</span>
	</div>

</div>


<div class="form-body margin-bottom-10">
	<div class="row">
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: instituiteInstance, field: 'hsno', 'error')} required">
				<label for="hsno"> <g:message code="instituite.hsno.label"
						default="Building No." /> <span class="required-indicator">*</span>
				</label>
				<g:textField name="hsno" class="form-control" required=""
					value="${instituiteInstance?.hsno}" />
			</div>
		</div>

		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: instituiteInstance, field: 'street', 'error')} required">
				<label for="street"> <g:message
						code="instituite.street.label" default="Street" /> <span
					class="required-indicator">*</span>
				</label>
				<g:textField name="street" class="form-control" required=""
					value="${instituiteInstance?.street}" />
			</div>
		</div>

		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: instituiteInstance, field: 'city', 'error')} required">
				<label for="city"> <g:message code="instituite.city.label"
						default="City" /> <span class="required-indicator">*</span>
				</label>
				<g:textField name="city" class="form-control" required=""
					value="${instituiteInstance?.city}" />
			</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: instituiteInstance, field: 'state', 'error')} required">
				<label for="state"> <g:message code="instituite.state.label"
						default="State" /> <span class="required-indicator">*</span>
				</label>
				<g:textField name="state" class="form-control" required=""
					value="${instituiteInstance?.state}" />
			</div>
		</div>

	</div>
</div>

<div class="form-body margin-bottom-10">
	<div class="row">
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: instituiteInstance, field: 'country', 'error')} required">
				<label for="country"> <g:message
						code="instituite.country.label" default="Country" /> <span
					class="required-indicator">*</span>
				</label>
				<g:textField name="country" class="form-control" required=""
					value="${instituiteInstance?.country}" />
			</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: instituiteInstance, field: 'alternatephno', 'error')}">
				<label for="alternatephno"> <g:message
						code="instituite.alternatephno.label"
						default="Alternate Phone No." /> <span class="required-indicator">*</span>
				</label>
				<g:textField name="alternatephno" class="form-control"
					value="${instituiteInstance?.alternatephno}" />
			</div>
		</div>

		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: instituiteInstance, field: 'pinCode', 'error')} required">
				<label for="pinCode"> <g:message
						code="instituite.pinCode.label" default="Pin code" /> <span
					class="required-indicator">*</span>
				</label>
				<g:textField name="pinCode" class="form-control" required=""
					value="${instituiteInstance?.pinCode}" />
			</div>
		</div>

	</div>
</div>


