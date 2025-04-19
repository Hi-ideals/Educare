<%@page import="com.hiideals.instituite.student.ParentDetails"%>
<%@page import="com.hiideals.instituite.main.Instituite"%>
<%@ page import="com.hiideals.instituite.student.Student"%>
<%@ page import="com.hiideals.instituite.classcourses.IClass"%>

<style>
.ui-autocomplete-input:focus {
	color: green;
	border: 2px outset green;
}
</style>
<div class="box box-info">
	<div class="portlet light bordered">
		<div class="portlet-title">
			<div class="caption font-blue">
				<i class="fa fa-building font-blue"></i> <span
					class="caption-subject bold uppercase"> Official Details</span>
			</div>

		</div>
		<div class="form-body">
			<div class="row">
				<div class="col-md-3">
					<label>Registration Number<span class="required-indicator"
						style="color: red">*</span></label>
					<g:if test="${studentInstance?.registrationNo !=null}">
						<g:textField name="registrationNo" class="form-control"
							id="registrationNo" required=""
							value="${studentInstance?.registrationNo}" />

					</g:if>

					<g:else>
						<regId:getRegId Inst="${instituite}" />
					</g:else>
					<!--  <label for="studentId"> <g:message
							code="student.studentId.label" default="Registration Number" />
						<span class="required-indicator" style="color: red">*</span>
					</label>-->
					<div id="SregistrationNo" style="display: none; color: red">Provide
						your Registration Number</div>
				</div>

				<div class="col-md-3">
					<label>Select Academic year <span
						class="required-indicator" style="color: red">*</span></label> <select
						name="academicyear[0].academicyear" class="form-control"
						id="batchno">

						<g:if
							test="${studentInstance?.academicyear && studentInstance?.academicyear[0].academicyear !=null }">
							<option value="${studentInstance?.academicyear[0]?.academicyear}">
								${studentInstance?.academicyear[0]?.academicyear}
							</option>
						</g:if>
						<g:else>
							<option></option>
						</g:else>
						<g:each in="${batchList}" var="batch">
							<option value="${batch?.batchName}">
								${batch?.batchName }
							</option>
						</g:each>
					</select>


					<div id="Sbatchno" style="display: none; color: red">Select
						your Academic year</div>

					<!--  <label for="studentId"> <g:message
							code="student.studentId.label" default="Select Batch" /> <span
						class="required-indicator" style="color: red">*</span>
					</label>-->

				</div>
				<g:if test="${params.action=='edit'}">
				<div class="col-md-3">
					<label>Select a Class<span class="required-indicator"
						style="color: red">*</span></label> <select
						name="academicyear[0].presentclass.id" id="presentclass"
						class="form-control"
						onchange="${remoteFunction(controller:'student',action: 'classSections',
                       update: 'updateSections',
                       params: '\'classId=\' + this.value')};
					   
					    ${remoteFunction(controller:'student',action:'admissionfee', 
	                params: '\'classId=\' + this.value',update:'updatefee')};">
						<g:if test="${studentInstance?.academicyear?.presentclass !=null }">
							<option value="${studentInstance?.academicyear?.presentclass.id.last() }">
								${studentInstance?.academicyear?.presentclass.classname.last() }<g:set var="classId"
									value="${studentInstance?.academicyear?.presentclass.id.last()}"></g:set>
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
					<div id="Spresentclass" style="display: none; color: red">Select
						your Class</div>
					<%--<g:textField name="studentId" class="form-control" required=""
						value="${studentInstance?.studentId}" />
					--%>
					<!-- <label for="studentId"> <g:message
							code="student.studentId.label" default="Select a Class" /> <span
						class="required-indicator" style="color: red">*</span>
					</label>-->
				</div>
				</g:if>
				<g:else>
				<div class="col-md-3">
					<label>Select a Class<span class="required-indicator"
						style="color: red">*</span></label> <select
						name="academicyear[0].presentclass.id" id="presentclass"
						class="form-control"
						onchange="${remoteFunction(controller:'student',action: 'classSections',
                       update: 'updateSections',
                       params: '\'classId=\' + this.value')};
					   
					    ${remoteFunction(controller:'student',action:'admissionfee', 
	                params: '\'classId=\' + this.value',update:'updatefee')};">
						<g:if test="${studentInstance?.academicyear?.presentclass !=null }">
							<option value="${studentInstance?.academicyear?.presentclass.id.last() }">
								${studentInstance?.academicyear?.presentclass.classname.last() }<g:set var="classId"
									value="${studentInstance?.academicyear?.presentclass.id.last()}"></g:set>
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
					<div id="Spresentclass" style="display: none; color: red">Select
						your Class</div>
					<%--<g:textField name="studentId" class="form-control" required=""
						value="${studentInstance?.studentId}" />
					--%>
					<!-- <label for="studentId"> <g:message
							code="student.studentId.label" default="Select a Class" /> <span
						class="required-indicator" style="color: red">*</span>
					</label>-->
				</div>
				</g:else>
				
				<div id="updateSections">
					<g:render template="classSections"
						model="[classId:classId,studentInstance:studentInstance]"></g:render>
				</div>
			</div>
		</div>

		<div class="form-body">
			<div class="row">
				<div id="updatefee">
					<g:render template="admissionfee"
						model="[classId:classId,studentInstance:studentInstance]"></g:render>
				</div>
				<div class="col-md-3">
					<label>Medium Of Instruction<span
						class="required-indicator" style="color: red">*</span></label>
					<g:textField name="mediumOfInstruction" class="form-control"
						id="mediumOfInstruction" required=""
						value="${studentInstance?.mediumOfInstruction}" />



					<!--  <label for="studentId"> <g:message
							code="student.studentId.label" default="Registration Number" />
						<span class="required-indicator" style="color: red">*</span>
					</label>-->
					<div id="mInstruction" style="display: none; color: red">Enter
						Medium Of Instruction</div>

					<!--<div class="col-md-3">
					<label>Add Academic year<span class="required-indicator"
						style="color: red">*</span></label>
					<div>
						<input type="text" name="academicyear[0].academicyear"
							class="form-control" id="academicyear"  />

						 <label for="studentName"> <g:message
								code="student.studentName.label" default="First Name" /> <span
							class="required-indicator" style="color: red">*</span>
						</label>

					</div>
					<div id="Sacademicyear" style="display: none; color: red">Provide
						your Academic year</div>
				</div>
			-->
				</div>
				<div class="col-md-3">
				<label>Student Tracking System(Number) <span class="required-indicator"
						style="color: red">*</span></label>
					<g:textField name="stsSystem" class="form-control"
						id="stsSystem"
						value="${studentInstance?.stsSystem}" />
				</div>
			</div>


			<div class="col-md-3">
				<div>
					<input name="academicyear[0].status" class="form-control"
						type="hidden" value="current" />

					<!-- <label for="studentName"> <g:message
								code="student.studentName.label" default="First Name" /> <span
							class="required-indicator" style="color: red">*</span>
						</label>-->

				</div>
			</div>
		</div>
	</div>
</div>
<div class="box box-info">
	<div class="portlet light bordered">
		<div class="portlet-title">
			<div class="caption font-blue">
				<i class="fa fa-user font-blue"></i> <span
					class="caption-subject bold uppercase"> Personal Info</span>
			</div>

		</div>

		<div class="form-body">
			<div class="row">
				<div id="studentIdTemp">
					<g:render template="studentIdtemp"></g:render>
				</div>

				<div class="col-md-3">
					<label>First Name<span class="required-indicator"
						style="color: red">*</span></label>
					<div
						class="fieldcontain ${hasErrors(bean: studentInstance, field: 'studentName', 'error')} required">
						<g:textField name="studentName" class="form-control"
							id="studentName" required=""
							value="${studentInstance?.studentName}" />

						<!-- <label for="studentName"> <g:message
								code="student.studentName.label" default="First Name" /> <span
							class="required-indicator" style="color: red">*</span>
						</label>-->

					</div>
					<div id="SstudentName" style="display: none; color: red">Provide
						your student name</div>
				</div>


				<div class="col-md-3">
					<label>Last Name<span class="required-indicator"
						style="color: red">*</span></label>
					<div
						class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lastName', 'error')} required">
						<g:textField name="lastName" class="form-control" id="lastName"
							required="" value="${studentInstance?.lastName}" />

						<!--<label for="studentName"> <g:message
								code="student.studentName.label" default="Last Name" /> <span
							class="required-indicator" style="color: red">*</span>
						</label>-->

					</div>
					<div id="SlastName" style="display: none; color: red">Provide
						your Last Name</div>
				</div>


				<div class="col-md-3">
					<label>Student DOB<span class="required-indicator"
						style="color: red">*</span></label>
					<div
						class="fieldcontain ${hasErrors(bean: studentInstance, field: 'studentDOB', 'error')} required">
						<input type="text" id="datepicker" name="studentDOB1"
							class="form-control date-picker"
							value="${formatDate(format:'dd/MM/yyyy',date:studentInstance?.studentDOB)}">

						<!-- <label for="studentDOB"> <g:message
								code="student.studentDOB.label" default="Student DOB" /> <span
							class="required-indicator" style="color: red">*</span>
						</label>-->
					</div>
						<div id="Sdatepickerdob" style="display: none; color: red">Provide
						your Student DOB</div>
					<div id="Sdatepickerdob1" style="display: none; color: red">DOB
						should be this format "dd/mm/yyyy"</div>
				</div>
			</div>
		</div>
		<div class="form-body">
			<div class="row">
				<div class="col-md-3">
					<label>Student DOJ<span class="required-indicator"
						style="color: red">*</span></label>
					<div
						class="fieldcontain ${hasErrors(bean: studentInstance, field: 'studentDOJ', 'error')} required">
						<input type="text" id="datepicker1" name="studentDOJ1"
							class="form-control date-picker"
							value="${formatDate(format:'dd/MM/yyyy',date:studentInstance?.studentDOJ)}">

						<!-- <label for="studentDOJ"> <g:message
								code="student.studentDOJ.label" default="Student DOJ" /> <span
							class="required-indicator" style="color: red">*</span>
						</label>-->
					</div>
					<div id="Sdatepickerdoj" style="display: none; color: red">Provide
						your Student DOJ</div>
					<div id="Sdatepickerdoj1" style="display: none; color: red">DOj
						should be this format "dd/mm/yyyy"</div>
				</div>


				<div class="col-md-3">
					<label>Blood group <span class="required-indicator"
						style="color: red">*</span></label>
					<div
						class="fieldcontain ${hasErrors(bean: studentInstance?.presentAddress, field: 'bloodgroup', 'error')} ">

						<g:textField name="bloodgroup" class="form-control"
							value="${studentInstance?.bloodgroup}" />
						<!-- <label for="bloodgroup"> <g:message
								code="address.bloodgroup.label" default="Bloodgroup" /> <span
							class="required-indicator" style="color: red">*</span>
						</label>-->
					</div>
					<%--
					<div id="Sbloodgroup" style="display: none; color: red">provide
						your Bloodgroup</div>
					 --%>
				</div>

				<div class="col-md-3">
					<label>Mother Tongue</label>
					<div
						class="fieldcontain ${hasErrors(bean: studentInstance?.presentAddress, field: 'motherTongue', 'error')} ">

						<g:textField name="motherTongue" class="form-control"
							value="${studentInstance?.motherTongue}"  />
						<!-- <label for="motherTongue"> <g:message
								code="address.motherTongue.label" default="Mother Tongue" /> <span
							class="required-indicator" style="color: red">*</span>
						</label>-->
					</div>
				
				</div>

				<div class="col-md-3">
					<label>Religion</label>
					<div
						class="fieldcontain ${hasErrors(bean: studentInstance?.presentAddress, field: 'religion', 'error')} ">

						<g:textField name="religion" class="form-control"
							value="${studentInstance?.religion}"  />

						<!-- <label for="religion"> <g:message
								code="address.religion.label" default="Religion" /> <span
							class="required-indicator" style="color: red">*</span>
						</label>-->
					</div>
				
				</div>
			</div>
		</div>
		<div class="form-body">
			<div class="row">
				<div class="col-md-3">
				<label>Select Gender <span class="required-indicator"
						style="color: red">*</span></label>
					
						<select name="gender" class="form-control" required>
						
							<g:if test="${studentInstance?.gender !=null}">
								<option value="${studentInstance?.gender}">
									${studentInstance?.gender}
								</option>
							</g:if>
							<option value=""></option>
							<g:each in="${studentInstance.constraints.gender.inList}"
								var="gen">
								<option value="${gen}">
									${gen}
								</option>
							</g:each>
						</select>
						<!--  <label for="Gender"> <g:message
								code="student.gender.label" default="Select Gender" /></label>-->
					
					<%--<div id="Sgender" style="display: none; color: red">Select
						your Gender</div>
				--%></div>
				<%--
				<div class="col-md-3">
					<label>Student Phone Number</label>
					<div
						class="fieldcontain ${hasErrors(bean: studentInstance, field: 'studentPhNumber', 'error')} ">
						<g:textField name="studentPhNumber" class="form-control" maxlength="10"
							value="${studentInstance?.studentPhNumber}" />
						<!-- <label for="studentPhNumber"> <g:message
								code="student.studentPhNumber.label"
								default="Student Phone Number" />
						</label>-->
					</div>
				</div>
				 --%>
				<div class="col-md-3">
					<label>Email</label>
					<div
						class="fieldcontain ${hasErrors(bean: studentInstance, field: 'email', 'error')} ">
						<g:textField name="email" class="form-control"
							value="${studentInstance?.email}" />
						<!-- <label for="email"> <g:message code="student.email.label"
								default="Email" />

						</label>-->
					</div>
				</div>

				<div class="col-md-3">
					<label>Category Name</label>
					<div
						class="fieldcontain ${hasErrors(bean: studentInstance, field: 'category', 'error')} required">

						<!--<select name="category" class="form-control">
						<g:if test="${studentInstance?.category !=null}">
							<option value="${studentInstance?.category}">
								${studentInstance?.category}
							</option>
						</g:if>
						<option></option>
						<g:each in="${studentInstance.constraints.category.inList}"
							var="cat">
							<option value="${cat}">
								${cat}
							</option>
						</g:each>
					</select>-->
						<g:textField name="category" class="form-control"
							value="${studentInstance?.category}" />
						<!-- <label for="Category"> <g:message
								code="student.category.label" default="Select Category" /></label>-->

					</div>
				</div>
			</div>
		</div>
		<div class="form-body">
			<div class="row">
				<div class="col-md-3">
					<label>Nationality</label>
					<div
						class="fieldcontain ${hasErrors(bean: studentInstance?.presentAddress, field: 'nationality', 'error')} ">

						<g:textField name="nationality" class="form-control"
							value="${studentInstance?.nationality}" />
						<!-- <label for="nationality"> <g:message
								code="address.nationality.label" default="Nationality" />

						</label>-->
					</div>
				</div>



				<div class="col-md-3">
					<label>Adhar Card Number</label>
					<div
						class="fieldcontain ${hasErrors(bean: studentInstance, field: 'studentAdharNo', 'error')}">
						<g:textField name="studentAdharNo" class="form-control"
							value="${studentInstance?.studentAdharNo}" maxlength="12"/>
						<!--  <label for="Gender"> <g:message
								code="student.gender.label" default="Select Gender" /></label>-->
					</div>
				</div>

				<div class="col-md-3">
					<label>Identification Mark</label>
					<div
						class="fieldcontain ${hasErrors(bean: studentInstance, field: 'identificationMark', 'error')}">
						<g:textField name="identificationMark" class="form-control"
							value="${studentInstance?.identificationMark}" />
						<!--  <label for="Gender"> <g:message
								code="student.gender.label" default="Select Gender" /></label>-->
					</div>
				</div>

			</div>

		</div>
	</div>
</div>

<div class="row">
	<div class="col-md-12">
		<div class="box box-info">
			<div class="portlet light bordered">
				<div class="portlet-title">
					<div class="caption font-blue">
						<i class="fa fa-home font-blue"></i> <span
							class="caption-subject bold uppercase"> Present Address</span>
					</div>

				</div>
				<g:render template="presentaddress"
					model="[addr:'presentAddress',address:studentInstance?.presentAddress]"></g:render>

			</div>
		</div>


		<div class="form-group form-md-line-input form-md-floating-label">
			<label>If Permanent address is same as Present address please
				check here</label>
			<g:checkBox name="PPA" id="ppa" />
		</div>

		<div class="box box-info">
			<div class="portlet light bordered">
				<div class="portlet-title">
					<div class="caption font-blue">
						<i class="fa fa-home font-blue"></i> <span
							class="caption-subject bold uppercase"> Permanent Address</span>
					</div>

				</div>
				<g:render template="presentaddress"
					model="[addr:'permenentAddres',address:studentInstance?.permenentAddres]"></g:render>


			</div>
		</div>
	</div>
</div>

<div class="box box-info">
	<div class="portlet light bordered">
		<div class="portlet-title">
			<div class="caption font-blue">
				<i class="icon-user font-blue"></i> <span
					class="caption-subject bold uppercase"> Father Details</span>
			</div>

		</div>
		<g:render template="/parentDetails/parentForm"
			model="[parentDetailsInstance:studentInstance?.fatherDetails,petails:'fatherDetails',parent:'Father']"></g:render>
	</div>
</div>
<div class="box box-info">
	<div class="portlet light bordered">
		<div class="portlet-title">
			<div class="caption font-blue">
				<i class="icon-user-female font-blue"></i> <span
					class="caption-subject bold uppercase"> Mother Details</span>
			</div>

		</div>
		<g:render template="/parentDetails/parentForm"
			model="[parentDetailsInstance:studentInstance?.motherDetails,petails:'motherDetails',parent:'Mother']"></g:render>
	</div>
</div>
<div class="box box-info">
	<div class="portlet light bordered">
		<div class="portlet-title">
			<div class="caption font-blue">
				<i class="icon-users font-blue"></i> <span
					class="caption-subject bold uppercase"> Guardian Details</span>
			</div>

		</div>
		<g:render template="/parentDetails/parentForm"
			model="[parentDetailsInstance:studentInstance?.guardianDetails,petails:'guardianDetails',parent:'Guardian']"></g:render>


	</div>
</div>

<div class="form-group form-md-line-input form-md-floating-label">
	<label>Do you want to add bus transportation:</label> <input
		type="checkbox" id="tcheck" name="transport" onclick="myfunction()" />
</div>

<div class="portlet light bordered" id="trans" style="display: none">
	<div class="portlet-title">
		<div class="caption font-blue">
			<i class="icon-bus font-blue"></i> <span
				class="caption-subject bold uppercase">Transportation Details</span>
		</div>

	</div>
	<div class="form-body">
		<div class="row">
			<div class="col-md-3">
				<label for="route"> <g:message code="transport.route.label"
						default="Bus Route" />

				</label> <select id="route" name="route.id" class="form-control">
					<option value="">select</option>
					<g:each in="${rut}">
						<option value="${it?.id}">From
							${it?.startPlace} to
							${it?.stopPlace}, Bus Route No
							${it?.routeCode}
						</option>
					</g:each>
				</select>
				<div id="Troute" style="display: none; color:red;"> select your Bus Route </div>
			</div>

			<div class="col-md-3">
				<label for="destination"> <g:message
						code="transport.destination.label" default="Student Route" />
				</label> <select id="destination" name="destination.id" class="form-control">
					<option value="">select</option>
					<g:each in="${dst}">
						<option value="${it?.id}">From
							${it?.fromPlace} to
							${it?.toPlace} Rs
							${it?.amount}
						</option>
					</g:each>
				</select>
				<div id="Tdestination" style="display: none; color:red;"> select your Student Route</div>
			</div>


			<div class="col-md-3">
				<label for="startDate"> <g:message
						code="transport.startDate.label" default="Start Date" />

				</label> <input name="startDate1" precision="day" id="startDate1"
					class="form-control date-picker"
					value="${transportInstance?.startDate}" default="none"
					noSelection="['': '']" />
					<div id="TstartDate1" style="display: none; color:red;"> select your Start Date</div>				
			</div>
			
			<div class="col-md-3">
				<label for="endDate"> <g:message
						code="transport.endDate.label" default="End Date" />

				</label> <input name="endDate1" precision="day" id="endDate1"
					class="form-control date-picker"
					value="${transportInstance?.endDate}" default="none"
					noSelection="['': '']" />
					<div id="TendDate1" style="display: none; color:red;"> select your End Date</div>
			</div>
			
		</div>
	</div>
</div>



<div class="box box-info">
	<div class="portlet light bordered">
		<div class="portlet-title">
			<div class="caption font-blue">
				<i class="fa fa-image font-blue"></i> <span
					class="caption-subject bold uppercase"> Profile Picture</span>
			</div>

		</div>
				<g:if test="${studentInstance?.profilePic != null }">
					<ul class="list-inline">
						<li><h3>Do you have Images to Upload??</h3></li>
						<li><input type="radio" onclick="$('#openimg').show(500)"
							name="openimg" value="yes" /> Yes</li>
						<li><input type="radio" onclick="$('#openimg').hide(500)"
							name="openimg" value="no" checked="checked" /> No</li>
					</ul>
					<images:getImage id="${studentInstance?.profilePic?.id }"
						width="150px" />
				</g:if>
				<g:else>
				
					<div class="form-group form-md-line-input form-md-floating-label">
						<ul class="list-inline">
							<li><h5> Upload profile picture..??</h5></li>
							<li><input type="radio" onclick="$('.fileinput-new1').show(500)"
								name="openimg" value="yes" /> Yes</li>
							<li><input type="radio" onclick="$('.fileinput-new1').hide(500)"
								name="openimg" value="no" checked="checked" /> No</li>
						</ul>
					</div>
				</g:else>
			<div  style="display: none;" class="fileinput-new1" id="openimg" >
						Upload a Profile Pic:
						<div class="fileinput fileinput-new" data-provides="fileinput">
							<div>
								<span class="btn default btn-file"> <span
									class="fileinput-new"> Select Profile Picture </span> <input
									type="file" id="file_1" name="file_1" name="...">
								</span>
							</div>
						</div>
					</div>
			</div>
</div>
<div class="col-md-4" style="display: none">
	<div class="form-group form-md-line-input form-md-floating-label">
		<div
			class="fieldcontain ${hasErrors(bean: sectionInstance, field: 'instituite', 'error')} ">
			<select id="instituite" class="form-control" name="instituite.id">
				<option value="${instituite?.id}">
					${instituite?.name}
				</option>
			</select> <label for="admin"> <g:message code="instituite.admin.label"
					default="instituite" />

			</label>

		</div>
	</div>
</div>

<script>
function myfunction(){

	var value=document.getElementById('tcheck').checked
	if(value==true){
		document.getElementById('trans').style.display='block'
			
		
		}else{
			document.getElementById('trans').style.display='none'
				
			}
	
}
</script>
