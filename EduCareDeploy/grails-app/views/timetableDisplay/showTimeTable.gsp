<%@page import="com.hiideals.utils.APPConsumer"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@page import="com.hiideals.instituite.classcourses.Subject"%>
<%@page import="com.hiideals.instituite.classcourses.Section"%>
<%@page import="com.hiideals.instituite.classcourses.IClass"%>
<%@page import="com.hiideals.instituite.timetable.Period_Timings"%>
<%@ page import="com.hiideals.instituite.timetable.TimeTable"%>

<html>
<head>
<g:set value="[tt:'start active open',ttList:'active']" var="activ"
	scope="request" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="layout" content="main" />
<title>Hi-Educare</title>
</head>
<body>
	<regId:getInstituite />
	<g:set value="${IClass.findAllByInstituite(instituite)}"
		var="classList" />
	<g:set value="${Section.findAllByInstituite(instituite)}"
		var="sectionList" />

	<g:set value="${Subject.findAllByInstitute(instituite)}"
		var="subjectList" />


	<div class="page-bar">
		<ul class="page-breadcrumb">
			<li><i class="fa fa-circle"></i><a class="home"
				href="${createLink(uri: '/')}"><g:message
						code="default.home.label" /></a></li>
		</ul>
	</div>

	<div class="panel">
		<div class="panel-body">
			<div class="row">
				<div class="col-md-12">
					<div class="box box-info">
						<div class="portlet light bordered">
							<div class="portlet-body form">
								<g:form action="UpdateTimeTable">

									<fieldset class="form">
										<div class="form-body">

											<div class="row">

												<div class="col-md-4">
													<div class="  ">
														<label for="class"> Class </label> <input type="text"
															value="${single?.classname?.classname}" name=""
															readonly="readonly" class="form-control"> <input
															type="hidden" value="${single?.id}" name="classname">
													</div>

												</div>

												<div class="col-md-4">
													<div class="  ">
														<label for="dateOfTimeTable"> section </label> <input
															type="text" value="${single?.section?.sectionName}"
															name="" readonly="readonly" class="form-control">
														<input type="hidden" value="${single?.section?.id}"
															name="section">
													</div>
												</div>

												<div class="col-md-4">
													<div class="  ">
														<label for="dateOfTimeTable"> Periods </label> <input
															type="text" class="form-control" name="numberofColumns"
															id="numberofColumns" value="${noOfColumnsCount }"
															readonly="readonly">
													</div>
												</div>


												<div class="col-md-4">
													<div class="  ">
														<label for="dateOfTimeTable"> Lunch Break after
															periods </label> <input type="number" class="form-control"
															name="lunckBreakAfter" id="lunckBreakAfter"
															value="${single?.lunchAfterPeriod }">
													</div>
												</div>



												<div class="col-md-4">
													<div
														class=" ${hasErrors(bean: timeTableInstance, field: 'dateOfTimeTable', 'error')} ">
														<label for="dateOfTimeTable"> <g:message
																code="timeTable.dateOfTimeTable.label"
																default="Time Table Date" />
														</label> <input name="dateOfTimeTable321"
															class="form-control date-picker"
															value="${single?.timetables?.getAt(0)?.dateOfTimeTable }"
															required="required" />
													</div>
													<br>

												</div>
											</div>
										</div>


										<div>

											<div class="row">
												<div class="col-md-12">
													<div class="portlet box grey">
														<div class="portlet-title">
															<div class="caption">
																<i class="fa fa-bell"></i>List Periods
															</div>
														</div>
														<div class="portlet-body">
															<div class="table-responsive">
																<table id="MyTable" class="table table-hover">

																	<!-- Table header for periods -->
																	<tr id="dynamicColumns">



																		<th width="${100/(noOfColumnsCount+1 ?: 1)}%">Days\Periods</th>


																		<g:each in="${single?.timetables}" var="tim"
																			status="i">


																			<th width="${100/(noOfColumnsCount+1)}%">
																				<div align="center">
																					${tim.periodName}
																					<br>
																					${tim?.periodtimings}
																				</div>
																			</th>
																			<g:if test="${single?.lunchAfterPeriod == (i+1) }">
																				<th rowspan="${classTimeTable?.size()+1 }"
																					style="vertical-align: middle;">
																					<div align="center">
																						L<br>u<br>n<br>c<br>h<br>
																						<br> B<br>r<br>e<br>a<br>k
																					</div>
																				</th>
																			</g:if>
																		</g:each>

																	</tr>
																	<!-- Table header for periods -->

																	<!-- Table body for class & subjects -->
																	<g:each in="${classTimeTable}">
																		<tr id="dynamicRows"
																			style="line-height: 0em; border-bottom: 1px solid">

																			<td width="${100/(noOfColumnsCount+1 ?: 1)}%" id='1'>
																				<br> ${it.availableFor }
																			</td>
																			<g:each in="${it.timetables}" var="tt" status="i">

																				<td width="${100/(noOfColumnsCount+1 ?: 1)}%"
																					id='${(i+1)+1 }'>Subject : <br> <select
																					onchange="changeStaff(this)" class="form-control"
																					name="subjectname_1">

																						<g:if test="${!tt.subject?.id}">
																							<option value="${null}"></option>
																						</g:if>

																						<g:each in="${subjectList}" var="sub">
																							<g:if test="${tt.subject?.id == sub?.id }">
																								<option value="${sub?.id }" selected="selected">
																									${sub?.subjectName}
																								</option>
																							</g:if>
																							<g:else>
																								<option value="${sub?.id }">
																									${sub?.subjectName}
																								</option>
																							</g:else>
																						</g:each>
																				</select> <br>Staff : <br>

																					<div id="ajax_staff">
																						<select name="staffname_1" class="form-control"
																							id="staffname_1" onchange="func1(this)">
																							<option value="${tt.staff?.id }"
																								selected="selected">
																								${tt.staff?.staffName}
																							</option>

																						</select>

																					</div>
																				</td>

																			</g:each>

																		</tr>
																	</g:each>
																	<!-- Table body for class & subjects -->

																	<tr id="add" style="display: none;">
																		<td colspan="${noOfColumnsCount+1 }"
																			style="background-color: #3c8dbc;"><a
																			id="addbtn" style="color: #fff">
																				<div align="center">Add</div>
																		</a></td>
																	</tr>

																</table>
															</div>
														</div>
													</div>
												</div>
											</div>

										</div>

									</fieldset>
									<table>

									</table>
								</g:form>
								<div class="text-center">
									<g:link class="btn-u sm-margin-bottom-10 btn blue"
										controller="timetableDisplay" action="showTimeTablePrint"
										target='_blank' params="[cid:params.cid,sid:params.sid]">Get Print</g:link>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="assets1/global/plugins/jquery.min.js"
		type="text/javascript"></script>
	<script type="text/javascript">

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
			url : '${APPConsumer.AJAX_NAME}
		/timeTable/pupolateTable',
				success : function(data, textStatus) {
					$('#pupolateTable').html(data);
				},
				error : function(XMLHttpRequest, textStatus, errorThrown) {
				}
			});
		}

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

							var selectedSubject = selectedColumn.find(
									'select[name=subjectname_1]').val()
							var currentSubject = ($(vv).parent().parent())
									.find('select[name=subjectname_1]').val()

							var selectedstaff = selectedColumn.find(
									'select[name=staffname_1]').val()
							var currentstaff = currentselectedvalue

							if ($("#MyTable tr").length - 2 == 1) {
								return;
							}

							if (typeof selectedColumn.html() != "undefined") {

								if (selectedSubject == currentSubject) {
									//alert(((selectedstaff == currentstaff))+"same subjects : "+ data.length)
									if ((selectedstaff == currentstaff)
											&& data.length > 0) {
										//alert("same staff throw error : ")
									} else {
										//alert("add to list during same subjects")
										data.push(selectedColumn.find(
												'select[name=staffname_1]')
												.val())
									}
								} else {
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
			if (!jQuery.inArray(currentselectedvalue, data)) {
				$("#erroMsg").show().fadeOut(2000)
			}
			$("#Console").html(data.join("<br />"));
			//});
		}
	</script>
</body>
</html>