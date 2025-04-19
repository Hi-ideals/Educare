<div class="panel">
	<div class="panel-body">
		<h2 class=" widget-title-color-blue " style="font-weight: 500">Please
			fill the details to get demo access</h2>

		<g:formRemote name="subForm"
			url="[controller:'home', action:'requesteddemo']"
			update="requestdemo">
			<fieldset>
				<div class="row" style="margin-bottom: 10px">
					<div class="col-md-6">
						<label>Name</label> <input type="text" class="form-control"
							name="name" placeholder="" />
					</div>
					<div class="col-md-6">
						<label>Email</label> <input type="text" class="form-control"
							name="email" placeholder="" />
					</div>
				</div>
				<div class="row" style="margin-bottom: 10px">
					<div class="col-md-6">
						<label>Mobile</label> <input type="text" class="form-control"
							name="mobile" placeholder="" />
					</div>
					<div class="col-md-6">
						<label>Phone</label> <input type="text" class="form-control"
							name="phNo" placeholder="" />
					</div>
				</div>
				<div class="row" style="margin-bottom: 10px">
					<div class="col-md-6">
						<label>School/College Name</label> <input type="text"
							class="form-control" name="sclclg" placeholder="" />
					</div>
					<div class="col-md-6">
						<label>Place</label> <input type="text" class="form-control"
							name="place" placeholder="" />
					</div>
				</div>
				<div class="row" style="margin-bottom: 10px">
					<div class="col-md-6">
						<label>Description</label>
						<textarea class="form-control" rows="3" name="description"></textarea>
					</div>

				</div>
			</fieldset>
			<fieldset>
				<div class="row" style="margin-bottom: 10px">
					<div class="col-md-6">
						<%--<g:actionSubmit value="Submit" class="btn btn-primary" action="requesteddemo"/>
                                		--%>
						<g:submitButton name="Submit" class="btn btn-primary" />

					</div>
				</div>
			</fieldset>

		</g:formRemote>
	</div>
</div>