<%@ page import="com.hiideals.institute.library.Books"%>

<div class="form-body">

	<div class="row">
		<div class="col-md-3">
			<label for="author"> <g:message code="books.author.label"
					default="Author" /> <span class="required-indicator">*</span>
			</label>
			<div
				class="fieldcontain ${hasErrors(bean: booksInstance, field: 'author', 'error')} ">
				<g:textField name="author" class="form-control" required=""
					id="author" value="${booksInstance?.author}" />
			</div>
			<div id="Bauthor" style="display: none; color: red">Provide
				your Author</div>
		</div>


		<div class="col-md-3">
			<label for="title"> <g:message code="books.title.label"
					default="Title" /><span class="required-indicator">*</span>
			</label>
			<div
				class="fieldcontain ${hasErrors(bean: booksInstance, field: 'title', 'error')} ">
				<g:textField name="title" class="form-control" required=""
					id="title" value="${booksInstance?.title}" />
			</div>
			<div id="Btitle" style="display: none; color: red">Provide your
				book Title</div>
		</div>


		<div class="col-md-3">
			<label for="publisher"> <g:message
					code="books.publisher.label" default="Publisher" /><span
				class="required-indicator">*</span>
			</label>
			<div
				class="fieldcontain ${hasErrors(bean: booksInstance, field: 'publisher', 'error')} ">
				<g:textField name="publisher" class="form-control" required=""
					id="publisher" value="${booksInstance?.publisher}" />
			</div>
			<div id="Bpublisher" style="display: none; color: red">Provide
				your Publisher</div>
		</div>




		<div class="col-md-3">
			<label for="place"> <g:message code="books.place.label"
					default="Place" /><span class="required-indicator">*</span>
			</label>
			<div
				class="fieldcontain ${hasErrors(bean: booksInstance, field: 'place', 'error')} ">
				<g:textField name="place" class="form-control" required=""
					id="place" value="${booksInstance?.place}" />

			</div>
			<div id="Bplace" style="display: none; color: red">Provide your
				Place</div>
		</div>
	</div>

</div>
<div class="form-body">
	<div class="row">
		<div class="col-md-3">
			<label for="subject"> <g:message code="books.subject.label"
					default="Subject" /><span class="required-indicator">*</span>
			</label>
			<div
				class="fieldcontain ${hasErrors(bean: booksInstance, field: 'subject', 'error')} ">
				<g:textField name="subject" class="form-control" required=""
					id="subject" value="${booksInstance?.subject}" />
			</div>
			<div id="Bsubject" style="display: none; color: red">Provide
				your Subject</div>
		</div>

		<div class="col-md-3">
			<label for="edition"> <g:message code="books.edition.label"
					default="Edition" /><span class="required-indicator">*</span>
			</label>
			<div
				class="fieldcontain ${hasErrors(bean: booksInstance, field: 'edition', 'error')} ">
				<g:textField name="edition" class="form-control" required=""
					id="edition" value="${booksInstance?.edition}" />
			</div>
			<div id="Bedition" style="display: none; color: red">Provide
				your Edition</div>
		</div>

		<div class="col-md-3">
			<label for="status"> <g:message code="books.status.label"
					default="Status" /><span class="required-indicator">*</span>

			</label>
			<div
				class="fieldcontain ${hasErrors(bean: booksInstance, field: 'status', 'error')} ">
				<g:textField name="status" class="form-control" required=""
					id="status" value="${booksInstance?.status}" />
			</div>
			<div id="Bstatus" style="display: none; color: red">Provide
				your Status</div>
		</div>

		<div class="col-md-3">
			<label for="volume"> <g:message code="books.volume.label"
					default="Volume" /><span class="required-indicator">*</span>
			</label>
			<div
				class="fieldcontain ${hasErrors(bean: booksInstance, field: 'volume', 'error')} ">
				<g:textField name="volume" class="form-control" required=""
					id="volume" value="${booksInstance?.volume}" />
			</div>
			<div id="Bvolume" style="display: none; color: red">Provide
				your volume</div>
			<div id="Bvolume1" style="display: none; color: red">volume
				Should be only for number</div>
		</div>

	</div>
</div>


<div class="form-body">
	<div class="row">
		<div class="col-md-3">
			<label for="year"> <g:message code="books.year.label"
					default="Year" /><span class="required-indicator">*</span>
			</label>
			<div
				class="fieldcontain ${hasErrors(bean: booksInstance, field: 'year', 'error')} ">
				<g:textField name="year" class="form-control" required="" id="year"
					value="${booksInstance?.year}" />
			</div>
			<div id="Byear" style="display: none; color: red">Provide your
				Year</div>
			<div id="Byear1" style="display: none; color: red">Year should
				be only number</div>
		</div>

		<div class="col-md-3">
			<label for="pages"> <g:message code="books.pages.label"
					default="Pages" /> <span class="required-indicator">*</span>
			</label>
			<div
				class="fieldcontain ${hasErrors(bean: booksInstance, field: 'pages', 'error')} required">
				<g:field name="pages" type="number" class="form-control" required=""
					id="pages" value="${booksInstance.pages}" required="" />
			</div>
			<div id="Bpages" style="display: none; color: red">Provide your
				pages</div>
			<div id="Bpages1" style="display: none; color: red">pages
				should be only number</div>
		</div>

		<div class="col-md-3">
			<label for="cost"> <g:message code="books.cost.label"
					default="Cost" /> <span class="required-indicator">*</span>
			</label>
			<div
				class="fieldcontain ${hasErrors(bean: booksInstance, field: 'cost', 'error')} required">
				<g:field name="cost" class="form-control" required="" id="cost"
					value="${fieldValue(bean: booksInstance, field: 'cost')}"
					required="" />
			</div>
			<div id="Bcost" style="display: none; color: red">Provide your
				cost</div>
			<div id="Bcost1" style="display: none; color: red">cost should
				be only number</div>
		</div>

		<div class="col-md-3">
			<label for="billNumber"> <g:message
					code="books.billNumber.label" default="Bill Number" /><span
				class="required-indicator">*</span>
			</label>
			<div
				class="fieldcontain ${hasErrors(bean: booksInstance, field: 'billNumber', 'error')} ">
				<g:textField name="billNumber" class="form-control" required=""
					id="billNumber" value="${booksInstance?.billNumber}" />
			</div>
			<div id="BbillNumber" style="display: none; color: red">Provide
				your billNumber</div>
			<div id="BbillNumber1" style="display: none; color: red">billNumber
				should be only number</div>
		</div>

	</div>
</div>



<div class="form-body">
	<div class="row">
		<div class="col-md-3">
			<label for="bookSource"> <g:message
					code="books.bookSource.label" default="Book Source" /><span
				class="required-indicator">*</span>
			</label>
			<div
				class="fieldcontain ${hasErrors(bean: booksInstance, field: 'bookSource', 'error')} ">
				<g:textField name="bookSource" class="form-control" required=""
					id="bookSource" value="${booksInstance?.bookSource}" />
			</div>
			<div id="BbookSource" style="display: none; color: red">Provide
				your bookSource</div>
		</div>

		<div class="col-md-3">
			<label for="moreInfo"> <g:message code="books.moreInfo.label"
					default="More Info" /><span class="required-indicator">*</span>
			</label>
			<div
				class="fieldcontain ${hasErrors(bean: booksInstance, field: 'moreInfo', 'error')} ">
				<g:textField name="moreInfo" class="form-control" required=""
					id="moreInfo" value="${booksInstance?.moreInfo}" />
			</div>
			<div id="BmoreInfo" style="display: none; color: red">Provide
				your More Info</div>
		</div>

		<div class="col-md-3">
			<label for="accessionNumber"> <g:message
					code="books.accessionNumber.label" default="Accession Number" /> <span
				class="required-indicator">*</span>
			</label>
			<div
				class="fieldcontain ${hasErrors(bean: booksInstance, field: 'accessionNumber', 'error')} required">
				<g:textField name="accessionNumber" required="" class="form-control"
					id="accessionNumber" value="${booksInstance?.accessionNumber}" />
			</div>
			<div id="BaccessionNumber" style="display: none; color: red">Provide
				your Accession Number</div>
			<div id="BaccessionNumber1" style="display: none; color: red">Accession
				Number should be number only</div>
		</div>

		<div class="col-md-3">
			<label for="purchasedOn"> <g:message
					code="books.purchasedOn.label" default="Purchased On" /> <span
				class="required-indicator">*</span>
			</label>
			<div
				class="fieldcontain ${hasErrors(bean: booksInstance, field: 'purchasedOn', 'error')} required">
				<input name="purchasedOn1" precision="day" required=""
					id="purchasedOn1" class="form-control date-picker"
					value="${formatDate(format:'MM/dd/yyyy',date:booksInstance?.purchasedOn)}">
			</div>
			<div id="BpurchasedOn1" style="display: none; color: red">Select
				Purchased On Date</div>
			<div id="BpurchasedOn2" style="display: none; color: red">Date should be this format "dd/mm/yyyy"</div>	
		</div>

		<regId:getInstituite />
		<div class="col-md-3" style="display: none;">
			<label for="accessionNumber"> <g:message
					code="books.instituite.label" default="Instituite" /> <span
				class="required-indicator">*</span>
			</label>
			<div
				class="fieldcontain ${hasErrors(bean: booksInstance, field: 'instituite', 'error')} required">
				<g:textField name="instituite" required="" class="form-control"
					type="hidden" value="${instituite?.id}" />
			</div>
		</div>

	</div>
</div>

