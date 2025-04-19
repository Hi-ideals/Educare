<div class="portlet box grey">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-user"></i>Birthdays
		</div>
	</div>
	<div class="portlet-body">
		<div class="table-scrollable">
			<table class="table table-bordered table-hover">
				<tr>

					<th>Student Name</th>
					<th>Date Of Birth</th>
					<th>Send Message</th>

				</tr>


				<g:each in="${bdays}" var="c" status="j">
					<tr>
						<td>
							${c?.studentName}
						</td>

						<td><g:formatDate date="${c?.studentDOB}" type="date"
								style="SHORT" /></td>

						<td><g:form controller="birthday">
								<input type="hidden" name="id" value="${c?.id }">
								<input type="text" name="messgae" value=""
									placeholder="        Write a msg ">
								<g:actionSubmit value="send " action="stubday" />
							</g:form></td>
					</tr>
				</g:each>
			</table>
		</div>
	</div>
</div>