
<table class="table  table-hover list">
	<tr>
		<th>Pay Head</th>
		<th>Action</th>
		<th>Amount</th>
	</tr>

	<g:each in="${staffpayhead}" var="payhead" status="j">
		<tr>
			<td><g:field name="payHeadName_${j}" value="${payhead?.id}"
					id="payHeadName_${j}" type="hidden" /> ${payhead?.payhead?.payHeadName}</td>
			<g:if test="${payhead?.payhead?.payHeadType=="Addition"}">
				<td>+</td>
			</g:if>
			<g:if test="${payhead?.payhead?.payHeadType=="Deduction"}">
				<td>-</td>
			</g:if>
			<td>
				${payhead?.aunit}
			</td>
		</tr>
	</g:each>
</table>
<%--<div class="results">
    <table class="list">
 
   </table>
</div>
--%>


<div class="form-body">
	<div class="row">
		<div class="col-md-4">
			<label>Total:</label><input name="totalamount" id="totalamount"
				readonly="readonly" class="form-control" type="number"
				value="${total}" />
		</div>
	</div>
</div>