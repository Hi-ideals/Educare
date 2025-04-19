<%@page import="com.hiideals.enums.WeekdaysEnum"%>
<div class="portlet box grey">
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-bars"></i>Staff TimeTable List
		</div>
	</div>
	<div class="portlet-body">
		<div class="table-scrollable">
			<table class="table  table-hover">
  		<tr>
  			<th width="${(100/9)}%">Days\Periods</th>
  			<g:each in="${1..8}">
	  			<th width="${(100/9)}%"><div align="center">${it}</div></th>
  			</g:each>
  		</tr>
  		<g:each in="${weekdaysMap.keySet()}">
	  		<tr>
	  			<td width="${(100/9)}%">${WeekdaysEnum.get(it)}</td>
	  			<g:set value="${weekdaysMap.get(it)}" var="aaa"></g:set>
	  			<g:each in="${1..8}">
	  				<td width="${(100/9)}%" >
		  				<g:if test="${aaa.getAt(it.toString()) }">
			  				<div align="center">${aaa.getAt(it.toString())?.classname?.classname } : ${aaa.getAt(it.toString())?.section?.sectionName }<br> 
			  						${aaa.getAt(it.toString())?.subject?.subjectName }
			  					</div>
		  				</g:if>
		  				<g:else><div align="center"> -- </div> </g:else>
	  				</td>
	  			</g:each>
	  		</tr>
  		</g:each>
  	</table>
	</div>
	<div class="text-center">
<g:link class="btn-u sm-margin-bottom-10 btn blue" controller="timetableDisplay" action="staffTimeTablePrint" target='_blank' params="[staffId:params.staffId]">Get Print</g:link>
</div>
	</div>
	</div>