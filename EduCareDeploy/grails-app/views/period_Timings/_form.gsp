<%@ page import="com.hiideals.instituite.timetable.Period_Timings"%>


<div class="form-body">

	<div class="row">

		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: period_TimingsInstance, field: 'from_H', 'error')} required">
				<label for="from_H"> <g:message
						code="period_Timings.from_H.label" default="From H" /> <span
					class="required-indicator">*</span>
				</label>
				<g:field name="from_H" type="number" class="form-control"
					value="${period_TimingsInstance.from_H}" required="" />

			</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: period_TimingsInstance, field: 'from_M', 'error')} required">
				<label for="from_M"> <g:message
						code="period_Timings.from_M.label" default="From M" /> <span
					class="required-indicator">*</span>
				</label>
				<g:field name="from_M" type="number" class="form-control"
					value="${period_TimingsInstance.from_M}" required="" />

			</div>
		</div>

		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: period_TimingsInstance, field: 'to_H', 'error')} required">
				<label for="to_H"> <g:message
						code="period_Timings.to_H.label" default="To H" /> <span
					class="required-indicator">*</span>
				</label>
				<g:field name="to_H" type="number" class="form-control"
					value="${period_TimingsInstance.to_H}" required="" />

			</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: period_TimingsInstance, field: 'to_M', 'error')} required">
				<label for="to_M"> <g:message
						code="period_Timings.to_M.label" default="To M" /> <span
					class="required-indicator">*</span>
				</label>
				<g:field name="to_M" type="number" class="form-control"
					value="${period_TimingsInstance.to_M}" required="" />

			</div>
		</div>

	</div>
	<br>
	<div class="row">
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: period_TimingsInstance, field: 'periodName', 'error')} required">
				<label for="periodName"> <g:message
						code="period_Timings.periodName.label" default="Period Name" /> <span
					class="required-indicator">*</span>
				</label>
				<g:textField name="periodName" required="" class="form-control"
					value="${period_TimingsInstance?.periodName}" />

			</div>
		</div>

	</div>
</div>
