


<%@page import="com.hiideals.instituite.classcourses.IClass"%>
<%@page import="com.hiideals.instituite.classcourses.Subject"%>
<%@page import="com.hiideals.instituite.classcourses.Section"%>
<%@page import="com.hiideals.utils.APPConsumer"%>
<regId:getInstituite />
<g:set value="${IClass.findAllByInstituite(instituite)}" var="classList" />
<g:set value="${Section.findAllByInstituite(instituite)}"
	var="sectionList" />

<g:set value="${Subject.findAllByInstitute(instituite)}"
	var="subjectList" />
<div>
	<!-- TODO: Add a period selector for selecting periods (text box for selecting no:of periods):
     then seperate this table and place in a template here repear dynamicColumns based on the above point-->


	<div class="col-md-12">
	<div class="form-body">

	<div class="row margin-bottom-10">
	
	<div class="col-md-4">
	<label for="dateOfTimeTable" > Class </label>
		<select onchange="changeSection(this)" class="form-control" name="classname_1" required="required">
				<option value="${null }">Select Class</option>
				<g:each in="${classList}"  var="cls">
					<option value="${cls.id }">
						${cls.classname}
					</option>
				</g:each>
		</select>

			
	</div>
	
	<div class="col-md-4">
		<div class="fieldcontain">
			<label></label>
			<div id="ajax_section1"></div>
		</div>
	</div>
	
	
	
		<div class="col-md-4" style="display: none;">
	<div class="fieldcontain  ">
		
		<label for="dateOfTimeTable" > Select No:Of Periods </label>
		<input type="text"   class="form-control" name="numberofColumns" id="numberofColumns" value="8">
		
		</div>
	</div>
	
	
	<div class="col-md-4">
		<div class="fieldcontain  ">
			<label for="dateOfTimeTable" > Lunch Break after periods </label>
			<input type="number" value="0"  class="form-control" name="lunchAfterPeriod" id="lunckBreakAfter">
		</div>
	</div>
	
</div>
	<div class="row">
	<div class="col-md-4">
	<div class="fieldcontain ${hasErrors(bean: timeTableInstance, field: 'dateOfTimeTable', 'error')} ">
		<label for="dateOfTimeTable"> <g:message
				code="timeTable.dateOfTimeTable.label" default="Time Table Date" />
		</label>
		<input name="dateOfTimeTable321"  class="form-control date-picker" 
			value="${timeTableInstance?.dateOfTimeTable }" required="required"/>
	</div>
	<br>

	</div>
</div>
</div>
</div>
</div>
	<div id="pupolateTable">
<a href="#" onclick="changeForm()"><b>Generate Table</b></a>
<script>
	function changeSection(valu) {

		var updater = $('#ajax_section1')
		
		$.ajax({
			type : 'POST',
			data : {
				clsId : valu.value
			},
			url : '${APPConsumer.AJAX_NAME}/timeTable/populatesec',
			success : function(data, textStatus) {
				updater.html(data);
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
			}
		});

	}
	function changeStaff(valu) {

		var updater = $(valu).parent().find('#ajax_staff')

		$.ajax({
			type : 'POST',
			data : {
				subId : valu.value
			},
			url : '${APPConsumer.AJAX_NAME}/timeTable/populatestaff',
			success : function(data, textStatus) {
				updater.html(data);
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
			}
		});

	}

	function func2(staff){

		var mainTr = ($(staff).parent().parent().parent())
		var mainTd = ($(staff).parent().parent())

		var weekday = (mainTr.find("#weekday").text().trim())
		var periodName = parseInt(mainTd.prop("id"))-1
		var subject = mainTd.find( 'select[name=subjectname_1]').val()
		var staff = $(staff).val()
		var iclass = $('select[name=classname_1]').val() 
		var section = $('select[name=sectionname_1]').val() 

		$.ajax({
			type : 'POST',
			data : {
				weekday : weekday,
				periodName:periodName,
				iclass:iclass,
				section:section,
				subject:subject,
				staff:staff,
				iclass:iclass,
				section:section
				
			},
			url : '${APPConsumer.AJAX_NAME}/timetableDisplay/checkStaffPeriod',
			success : function(data, textStatus) {
				$('#scrp').html(data);
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
			}
		});

		

		}


	function changeForm() {
		var updater = $('#numberofColumns').val()
		var lunckBreakAfter = $("#lunckBreakAfter").val()
		var iclass = $('select[name=classname_1]').val() 
		var section = $('select[name=sectionname_1]').val() 
		$(".buttons").show();
		$.ajax({
			type : 'POST',
			data : {
				subId : updater,
				lunckBreakAfter:lunckBreakAfter,
				iclass:iclass,
				section:section
				
			},
			url : '${APPConsumer.AJAX_NAME}/timeTable/pupolateTable',
			success : function(data, textStatus) {
				
				$('#pupolateTable').html(data);

				$('#resetTime').show();
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
			}
		});
	}

//	func()
</script>