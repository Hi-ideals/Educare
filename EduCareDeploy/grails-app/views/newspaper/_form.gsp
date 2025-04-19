<%@ page import="com.hiideals.institute.library.Newspaper"%>


<div class="form-body">

	<div class="row">
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: newspaperInstance, field: 'name', 'error')} ">
				<label for="name"> <g:message code="newspaper.name.label"
						default="Name" />

				</label>
				<g:textField name="name" class="form-control" required="" id="name"
					value="${newspaperInstance?.name}" />

			</div>
			<div id="Nname" style="display: none; color: red">Provide
				your newspaper Name</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: newspaperInstance, field: 'dateofnewspaper', 'error')} ">
				<label for="dateofnewspaper"> <g:message
						code="newspaper.dateofnewspaper.label" default="Date of newspaper" />

				</label> <input name="dateofnewspaper1" precision="day" required="" id="dateofnewspaper1"
					class="form-control date-picker" value="${formatDate(format:'MM/dd/yyyy',date:newspaperInstance?.dateofnewspaper)}" default="none"
					noSelection="['': '']" />
			</div>
			<div id="Ndateofnewspaper1" style="display: none; color: red">Select
				your Date of newspaper</div>
			<div id="Ndateofnewspaper2" style="display: none; color: red">Date
				should be this format "mm/dd/yyyy"</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: newspaperInstance, field: 'cost', 'error')} required">
				<label for="cost"> <g:message code="newspaper.cost.label"
						default="Cost" /> <span class="required-indicator">*</span>
				</label>
				<g:field name="cost" class="form-control" required="" id="cost"
					value="${fieldValue(bean: newspaperInstance, field: 'cost')}"
					required="" />
			</div>
			<div id="Ncost" style="display: none; color: red">Provide
				your cost</div>
			<div id="Ncost1" style="display: none; color: red">cost
				Should be only for number</div>
		</div>
		
		<regId:getInstituite/>
		<div class="col-md-3" style="display: none;">
			<label for="accessionNumber"> <g:message
					code="newspaper.instituite.label" default="Instituite" /> <span
				class="required-indicator">*</span>
			</label>
			<div
				class="fieldcontain ${hasErrors(bean: newspaperInstance, field: 'instituite', 'error')} required">
				<g:textField name="instituite" required="" class="form-control" type="hidden"
					value="${instituite?.id}" />
			</div>
		</div>
	</div>
</div>
