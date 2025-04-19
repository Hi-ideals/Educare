<%@page import="com.hiideals.instituite.classcourses.Subject"%>
<%@page import="com.hiideals.instituite.classcourses.Section"%>
<%@page import="com.hiideals.instituite.classcourses.IClass"%>
<%@page import="com.hiideals.instituite.timetable.Period_Timings"%>
<%@ page import="com.hiideals.instituite.timetable.TimeTable"%><regId:getInstituite />

<g:set value="${IClass.findAllByInstituite(instituite)}" var="classList" />
<g:set value="${Section.findAllByInstituite(instituite)}"
	var="sectionList" />
<g:set value="${subList}"
	var="subjectList" />

<g:set value="${Period_Timings.findAllByInstitute(instituite) }"
	var="PT" />

<input type="hidden" value="${noOfColumnsCount}"
	name="dynamicColumnCount">
	
<div id="erroMsg" style="display: none; color: red;">Staff already assigned to another class</div>
<div id="scrp"></div>
<g:if test="${message}">
	<div style="color: red;"><h5>${message}</h5></div>
</g:if>

<div class="row">
	<div class="col-md-12">
<div class="portlet box blue">
						<div class="portlet-title">
							<div class="caption">
								<i class="fa fa-user"></i>Add Periods
							</div>
						</div>
<div class="portlet-body">
							<div class="table-scrollable">
<table id="MyTable"  class="table table-hover" style="overflow:x;overflow:y;">

	<!-- Table header for periods -->
	<tr id="dynamicColumns" >
	
		

		<th width="${100/(noOfColumnsCount+1 ?: 1)}%">Days\Periods</th>
		

		<g:each in="${1..noOfColumnsCount}">
			<th width="${100/(noOfColumnsCount+1)}%"><select class="form-control"
				name="periodname_1" required="required">
					<option value="${null }">Select Period</option>
					<g:each in="${PT}">
						<option value="${it.periodName}">
							${it.periodName} :
							${(it.from_H+":"+it.from_M)+"-"+(it.to_H+":"+it.to_M)}
						</option>
					</g:each>
			</select></th>
		</g:each>

	</tr>
	<!-- Table header for periods -->

	<!-- Table body for class & subjects -->
	<g:set value="['Monday','Tuesday','Wednesday','Thursday','Friday','Satuarday']" var="days"></g:set>
	<g:each in="${days }">
	<tr id="dynamicRows" style="line-height: 0em; border-bottom: 1px solid" class="dynamicRows">

		<td width="${100/(noOfColumnsCount+1 ?: 1)}%" id='weekday'> <br>
			${it}
		</td>
		<g:each in="${1..noOfColumnsCount}" >

			<td width="${100/(noOfColumnsCount+1 ?: 1)}%" id='${it+1 }'>Subject
				: <br> <select onchange="changeStaff(this)" class="form-control"
				name="subjectname_1">
					<option value="${null }">Select Subject</option>
					<g:each in="${subjectList}" var="sub">
						<option value="${sub.id }">
							${sub.subjectName}
						</option>
					</g:each>
			</select> <br>Staff : <br>

				<div id="ajax_staff"></div>
			</td>

		</g:each>

	</tr>
	</g:each>
	<!-- Table body for class & subjects -->
	
	<tr id="add" style="display: none;">
		<td colspan="${noOfColumnsCount+1 }"
			style="background-color: #3c8dbc;"><a id="addbtn"
			style="color: #fff">
				<div align="center">Add</div>
		</a></td>
	</tr>

</table>
</div>
</div>
</div>
</div>
</div>

<script>
	$("#addbtn").click(
			function() {
				var add = $("#dynamicRows");
				$('#add').before(
						'<tr style="line-height: 0em; border-bottom: 1px solid">'
								+ add.html() + '</tr>');
				//func();
			});
	//func();
	function func(vv) {
		//alert("called : "+$(vv).val())
		var currentselectedvalue = $(vv).val();
		//$('#staffname_1').change(function() {
		//alert($(vv).parent().parent().html())
		var selectedv = parseInt($(vv).parent().parent().attr("id"));
		
		//var cellIndexMapping = { selectedv: true};
		var data = [];

		$("#MyTable tr").each(
				function(rowIndex) {

					if ($(this).attr("id") != "dynamicColumns") {
						var selectedColumn = $(this).find("td").eq(
								selectedv - 1)
						//alert("Subjects repeating : "+selectedColumn.find('select[name=subjectname_1]').val()+" selected : "+($(vv).parent().parent()).find( 'select[name=subjectname_1]').val())
						//alert("Subjects staff  : "+selectedColumn.find('select[name=staffname_1]').val()+" current :  "+currentselectedvalue)
						//alert("cccccccccccc : "+currentselectedvalue+"	:	"+(typeof selectedColumn.html() != "undefined"))
						
						var selectedSubject = selectedColumn.find('select[name=subjectname_1]').val()
						var currentSubject = ($(vv).parent().parent()).find( 'select[name=subjectname_1]').val()
						
						var selectedstaff = selectedColumn.find('select[name=staffname_1]').val()
						var currentstaff = currentselectedvalue

						if($("#MyTable tr").length-2 == 1){
							return;}
						
						if (typeof selectedColumn.html() != "undefined"){

							if(selectedSubject == currentSubject){
								//alert(((selectedstaff == currentstaff))+"same subjects : "+ data.length)
								if((selectedstaff == currentstaff) && data.length>0){
									//alert("same staff throw error : ")
								}else{
									//alert("add to list during same subjects")
									data.push(selectedColumn.find(
								'select[name=staffname_1]').val())
								}
							}else{
								//alert("add to list during diff subjects")
								data.push(selectedColumn.find(
								'select[name=staffname_1]').val())
							}

						//if(selectedColumn.find('select[name=staffname_1]').val() != currentselectedvalue){
							//alert(data+"  contains " + jQuery.inArray( currentselectedvalue , data ))
						//data.push(selectedColumn.find(
						//		'select[name=staffname_1]').val())//}
						}
					}

				});
		//alert(data+"  dataaaaaaaaaa " + jQuery.inArray( currentselectedvalue , data ))
		if(!jQuery.inArray( currentselectedvalue , data )){
			$("#erroMsg").show().fadeOut( 2000 )
			}
		$("#Console").html(data.join("<br />"));
		//});
	}
</script>