<%@ page import="com.hiideals.institute.library.IssueDetails"%>

<regId:getInstituite />
<div class="form-body">
	<div class="row">


		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'studentId', 'error')} ">
				<label for="studentId"> <g:message
						code="issueDetails.studentId.label" default="Select issueDetails" />

				</label>
				<%--<g:select id="studentId" name="studentId.id" from="${com.hiideals.instituite.student.Student.list()}" optionKey="id" value="${issueDetailsInstance?.studentId?.id}" class="many-to-one" noSelection="['null': '']"/>--%>

				<%--${issueDetailsInstance?.studentId?.id }--%>

				<select class="form-control" name="student" id="studentId2">

					<g:if test="${issueDetailsInstance?.studentId}">
						<option value="issueDetailsStudent" selected="selected">Issue
							to Student</option>
					</g:if>
					<g:elseif test="${issueDetailsInstance?.staffId}">
						<option value="issueDetailsStaff" selected="selected">issueDetails
							Staff</option>
					</g:elseif>
					<g:else>
						<option value="${null}">Select any one</option>
					</g:else>

					<option value="issueDetailsStudent">Student</option>
					<option value="issueDetailsStaff">Staff</option>
				</select>
			</div>
			<div id="SstudentId" style="display: none; color: red">select
				any one issue Details name</div>
		</div>

		<div id="Returntype" hidden="true">
			<div class="col-md-3">
				<div
					class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'studentId', 'error')} ">
					<label for="studentId"> <g:message
							code="issueDetails.studentId.label" default="Student Name" />

					</label>
					<%--<g:select id="studentId" name="studentId.id" from="${com.hiideals.instituite.student.Student.list()}" optionKey="id" value="${issueDetailsInstance?.studentId?.id}" class="many-to-one" noSelection="['null': '']"/>--%>

					<%--${issueDetailsInstance?.studentId?.id }--%>
					<select name="studentId.id" class="form-control"
						class="many-to-many" id="studentId1">
						<option value=""></option>
						<g:each
							in="${com.hiideals.instituite.student.Student.findAllByInstituite(instituite)}"
							var="c">

							<g:if test="${issueDetailsInstance?.studentId?.id == c.id }">
								<option value="${c.id }" selected="selected">
									${c.studentName}
								</option>
							</g:if>
							<g:else>
								<option value="${c.id }">
									${c.studentName}
								</option>
							</g:else>
						</g:each>
					</select>
				</div>
				<div id="Sstudentname" style="display: none; color: red">select
					student name</div>
			</div>
		</div>
		<div id="Returntype1" hidden="true">
			<div class="col-md-3">
				<div
					class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'staffId', 'error')} ">
					<label for="staffId"> <g:message
							code="issueDetails.staffId.label" default="Staff Name" />

					</label>
					<%--<g:select id="staffId" name="staffId.id" from="${com.hiideals.institute.staff.Staff.list()}" optionKey="id" value="${issueDetailsInstance?.staffId?.id}" class="many-to-one" noSelection="['null': '']"/>--%>

					<select name="staffId.id" class="form-control" class="many-to-many"
						id="Staffname">
						<option value=""></option>
						<g:each
							in="${com.hiideals.institute.staff.Staff.findAllByInstitute(instituite)}"
							var="c">
							<g:if test="${issueDetailsInstance?.staffId?.id == c.id }">
								<option value="${c.id}" selected="selected">
									${c.staffName }
								</option>
							</g:if>
							<g:else>
								<option value="${c.id}">
									${c.staffName }
								</option>
							</g:else>
						</g:each>
					</select>
				</div>
				<div id="SStaffname" style="display: none; color: red">select
					Staff name</div>
			</div>
		</div>


		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'studentId', 'error')} ">
				<label for="studentId"> <g:message
						code="issueDetails.studentId.label" default="Select category" />

				</label>
				<%--<g:select id="studentId" name="studentId.id" from="${com.hiideals.instituite.student.Student.list()}" optionKey="id" value="${issueDetailsInstance?.studentId?.id}" class="many-to-one" noSelection="['null': '']"/>--%>

				<%--${issueDetailsInstance?.studentId?.id }--%>

				<select class="form-control" name="category" id="categorys">
					<option value="${null}">Select any one</option>
					<option value="Magazinename">Magazine name</option>
					<option value="Newspapername">Newspaper name</option>
					<option value="Booksname">Books name</option>
				</select>
			</div>
			<div id="SstudentId" style="display: none; color: red">select
				any one issue Details name</div>
		</div>



		<div id="category1" hidden="true">
			<div class="col-md-3">
				<div
					class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'magazineId', 'error')} ">
					<label for="magazineId"> <g:message
							code="issueDetails.magazineId.label" default="Magazine name" />

					</label>
					<%--<g:select id="magazineId" name="magazineId.id" from="${com.hiideals.institute.library.Magazine.list()}" optionKey="id" value="${issueDetailsInstance?.magazineId?.id}" class="many-to-one" noSelection="['null': '']"/>--%>
					<select name="magazineId.id" class="form-control"
						class="many-to-many">
						<g:if test="${issueDetailsInstance.magazineId }">
							<option value="${issueDetailsInstance.magazineId }">
								${issueDetailsInstance.magazineId.magazineName }
							</option>
						</g:if>
						<g:else>
							<option value="${null}">Select</option>
							<g:each
								in="${com.hiideals.institute.library.Magazine.findAllByInstituite(instituite)}"
								var="c">
								<option value="${c.id}">
									${c.magazineName }
								</option>
							</g:each>
						</g:else>
					</select>
				</div>
			</div>
		</div>


		<div id="category3" hidden="true">
			<div class="col-md-3">
				<div
					class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'booksId', 'error')} ">
					<label for="booksId"> <g:message
							code="issueDetails.booksId.label" default="Books name" />

					</label>
					<%--
	<g:select name="booksId" from="${com.hiideals.institute.library.Books.list()}" multiple="multiple" optionKey="id" size="5" value="${issueDetailsInstance?.booksId*.id}" class="many-to-many"/>--%>

					<select name="books" multiple="multiple" class="form-control"
						class="many-to-many" optionKey="id" size="5">
						<g:each
							in="${com.hiideals.institute.library.Books.findAllByInstituite(instituite)}"
							var="c">

							<g:if test="${issueDetailsInstance?.books?.contains(c) }">
								<option value="${c.id}" selected="selected">
									${c. title }
								</option>
							</g:if>
							<g:else>
								<option value="${c.id}">
									${c. title }
								</option>
							</g:else>
						</g:each>
					</select>
				</div>
			</div>
		</div>


		<div id="category2" hidden="true">
			<div class="col-md-3">
				<div
					class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'newspaper', 'error')} ">
					<label for="newspaper"> <g:message
							code="issueDetails.newspaper.label" default="Newspaper name" />

					</label>
					<%--<g:select id="newspaper" name="newspaper.id" from="${com.hiideals.institute.library.Newspaper.list()}" optionKey="id" value="${issueDetailsInstance?.newspaper?.id}" class="many-to-one" noSelection="['null': '']"/>--%>

					<select name="newspaper.id" class="form-control"
						class="many-to-many">

						<g:if test="${issueDetailsInstance.newspaper }">
							<option value="${issueDetailsInstance.newspaper }">
								${issueDetailsInstance.newspaper.name }
							</option>
						</g:if>
						<g:else>
							<option value="null"></option>
							<g:each
								in="${com.hiideals.institute.library.Newspaper.findAllByInstituite(instituite)}"
								var="c">
								<option value="${c.id}">
									${c.name }
								</option>
							</g:each>
						</g:else>
					</select>
				</div>
			</div>
		</div>


	</div>
</div>

<div class="form-body">
	<div class="row">


		<%--<div class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'returndate', 'error')} ">
	<label for="returndate">
		<g:message code="issueDetails.returndate.label" default="Returndate" />
		
	</label>
	<g:datePicker name="returndate" precision="day"  value="${issueDetailsInstance?.returndate}" default="none" noSelection="['': '']" />

</div>--%>

		<div
			class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'dateOfIssue', 'error')} required"
			style="display: none;">
			<label for="dateOfIssue"> <g:message
					code="issueDetails.dateOfIssue.label" default="dateOfIssue" /> <span
				class="required-indicator">*</span>
			</label>
			<g:datePicker name="dateOfIssue" precision="day"
				value="${new Date()}" />

		</div>




		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'numberOfDays', 'error')} required">
				<label for="numberOfDays"> <g:message
						code="issueDetails.numberOfDays.label" default="Number Of Days" />
					<span class="required-indicator">*</span>
				</label>
				<g:field name="numberOfDays" class="form-control" type="number"
					id="numberOfDays" value="${issueDetailsInstance.numberOfDays}"
					required="" />

			</div>
			<div id="SNumberOfDays" style="display: none; color: red">Provide
				Your number of day</div>
		</div>

		<div class="col-md-3" style="display: none;">
			<label for="accessionNumber"> <g:message
					code="issueDetails.instituite.label" default="Instituite" /> <span
				class="required-indicator">*</span>
			</label>
			<div
				class="fieldcontain ${hasErrors(bean: issueDetailsInstance, field: 'instituite', 'error')} required">
				<g:textField name="instituite" required="" class="form-control"
					type="hidden" value="${instituite?.id}" />
			</div>
		</div>

	</div>
</div>
