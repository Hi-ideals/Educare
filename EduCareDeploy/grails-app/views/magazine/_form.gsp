<%@ page import="com.hiideals.institute.library.Magazine"%>


<div class="form-body">

	<div class="row">
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: magazineInstance, field: 'magazineName', 'error')} ">
				<label for="magazineName"> <g:message
						code="magazine.magazineName.label" default="Magazine Name" /><span
					class="required-indicator">*</span>

				</label>
				<g:textField name="magazineName" class="form-control" required=""
					id="magazineName" value="${magazineInstance?.magazineName}" />

			</div>
			<div id="MmagazineName" style="display: none; color: red">Provide
				your Magazine Name</div>

		</div>


		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: magazineInstance, field: 'catagory', 'error')} ">
				<label for="catagory"> <g:message
						code="magazine.catagory.label" default="Catagory" /><span
					class="required-indicator">*</span>

				</label>
				<g:textField name="catagory" class="form-control" required=""
					id="catagory" value="${magazineInstance?.catagory}" />

			</div>
			<div id="Mcatagory" style="display: none; color: red">Provide
				your Catagory</div>

		</div>


		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: magazineInstance, field: 'volume', 'error')} ">
				<label for="volume"> <g:message code="magazine.volume.label"
						default="Volume" /><span class="required-indicator">*</span>

				</label>
				<g:textField name="volume" class="form-control" required=""
					id="volume" value="${magazineInstance?.volume}" />
			</div>
			<div id="Mvolume" style="display: none; color: red">Provide
				your volume</div>
			<div id="Mvolume1" style="display: none; color: red">volume
				Should be only for number</div>
		</div>




		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: magazineInstance, field: 'cost', 'error')} required">
				<label for="cost"> <g:message code="magazine.cost.label"
						default="Cost" /> <span class="required-indicator">*</span>
				</label>
				<g:field type="number" name="cost" class="form-control" required=""
					id="cost"
					value="${fieldValue(bean: magazineInstance, field: 'cost')}"
					required="" />
			</div>
			<div id="Mcost" style="display: none; color: red">Provide your
				cost</div>
			<div id="Mcost1" style="display: none; color: red">cost Should
				be only for number</div>
		</div>
	</div>
	<br>
	<div class="row">
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: magazineInstance, field: 'cddvd', 'error')} ">
				<label for="cddvd"> <g:message code="magazine.cddvd.label"
						default="Cddvd" />

				</label>
				<g:checkBox name="cddvd" class="form-control"
					value="${magazineInstance?.cddvd}" />

			</div>
		</div>

		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: magazineInstance, field: 'purchasedOn', 'error')} ">
				<label for="purchasedOn"> <g:message
						code="magazine.purchasedOn.label" default="Purchased On" /><span
					class="required-indicator">*</span>

				</label> <input name="purchasedOn1" precision="day" required=""
					id="purchasedOn1"
					value="${formatDate(format:'MM/dd/yyyy',date:magazineInstance?.purchasedOn)}"
					default="none" class="form-control date-picker"
					noSelection="['': '']" />
			</div>
			<div id="MpurchasedOn1" style="display: none; color: red">Select
				your Purchased On date</div>
			<div id="MpurchasedOn2" style="display: none; color: red">Date
				should be this format "mm/dd/yyyy"</div>
		</div>

		<%--<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: magazineInstance, field: 'nummagazine', 'error')} required">
				<label for="nummagazine"> <g:message
						code="magazine.nummagazine.label" default="Nummagazine" /> <span
					class="required-indicator">*</span>
				</label>
				<g:field type="number" name="nummagazine" class="form-control"
					required="" id="nummagazine"
					value="${fieldValue(bean: magazineInstance, field: 'nummagazine')}"
					required="" />
			</div>
			<div id="Mnummagazine" style="display: none; color: red">Provide
				your Nummagazine</div>
			<div id="Mnummagazine1" style="display: none; color: red">Nummagazine
				Should be only for number</div>
		</div>

		--%><regId:getInstituite />
		<div class="col-md-3" style="display: none;">
			<label for="accessionNumber"> <g:message
					code="magazine.instituite.label" default="Instituite" /> <span
				class="required-indicator">*</span>
			</label>
			<div
				class="fieldcontain ${hasErrors(bean: magazineInstance, field: 'instituite', 'error')} required">
				<g:textField name="instituite" required="" class="form-control"
					type="hidden" value="${instituite?.id}" />
			</div>
		</div>

	</div>
</div>