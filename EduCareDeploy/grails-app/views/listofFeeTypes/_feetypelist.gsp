<div class="portlet-body">
	<div class="table-scrollable">
		<table class="table table-hover">
			<thead>
				<tr>

					<th>
						${message(code: 'instFeeTypes.typeName.label', default: 'Type Name')}
					</th>
					<th>Class</th>
					<th>
						${message(code: 'instFeeTypes.totalAmount.label', default: 'Total Amount')}
					</th>
				</tr>
			</thead>
			<tbody>
				<g:each in="${instfeetypes}" status="i" var="instFeeTypesInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

						<td>
							${fieldValue(bean: instFeeTypesInstance, field: "typeName")}
						</td>

						<td>
							${fieldValue(bean: instFeeTypesInstance.iclass, field: "classname")}
						</td>

						<td>
							${fieldValue(bean: instFeeTypesInstance, field: "totalAmount")}
						</td>
						<td></td>

					</tr>
				</g:each>
				<tr style="color: #337ab7">
					<td><b>Total : </b></td>
					<td><b></b></td>
					<td><b>
							${Totalsum}
					</b></td>
					<td colspan="1"></td>
				</tr>
			</tbody>
		</table>
	</div>
</div>
<div class="text-center">
	<g:form controller="listofFeeTypes" action="getfeelistprint"
		target='_blank'>
		<g:hiddenField name="iclass" value="${params?.iclass}" />
		<g:hiddenField name="Search" value="Search" />
		<br>
		<g:submitButton class="btn blue" name="Get Print" />
	</g:form>
</div>