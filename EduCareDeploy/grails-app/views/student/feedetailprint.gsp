<%@ page import="com.hiideals.instituite.student.Student"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<meta name="description" content="School Management 	" />
<meta name="keywords" content="School Management   " />
<title> ${instituite?.name} :  Fee Payment</title>
<style type="text/css">
@font-face
{
font-family: Belwec;
src: url('includes/fonts/Belwec.ttf');
}
.narmal {
	font-family: tahoma;
	padding:2px;
	font-size: 14px;
	font-weight: normal;
	text-decoration: none;
	color: #000000;
}
txt_01 {
font-family:verdaba;
font-size:14px;
font-weight:400;
}
.style1 {
	font-size: 22px;
	/*font-family: Verdana, Arial, Helvetica, sans-serif;*/
	font-family:Belwec;
	font-weight: bold;
}
.style2 {font-family: Verdana, Arial, Helvetica, sans-serif}
.style3 {
	font-size: 11px;
	font-family: Verdana, Arial, Helvetica, sans-serif;
}
.style4 {
	font-size: 12px;
	font-family: Verdana, Arial, Helvetica, sans-serif;
	font-weight:bold;
}
.style5 {font-family: Verdana, Arial, Helvetica, sans-serif; font-weight: bold; }
.border1{
border-bottom:#000000;
border-top:#000000;
}
.admin {
	font-family: tahoma;
	font-size: 14px;
	font-weight: bold;
	color: #333333;
	text-decoration: none;
}
.bgcolor_2{
	background-color: #CCCCCC;
	color:#333333;
	text-align:left;
	font-weight:normal;
	font-family: Tahoma;
	font-size: 12px;
	text-decoration: none;
}
</style>
<link href="includes/css/blue.css" rel="stylesheet" type="text/css" />
<link
	href="assets1/global/plugins/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="assets1/global/plugins/simple-line-icons/simple-line-icons.min.css"
	rel="stylesheet" type="text/css" />
<link href="assets1/global/plugins/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<link href="assets1/global/plugins/uniform/css/uniform.default.css"
	rel="stylesheet" type="text/css" />
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<link
	href="assets1/global/plugins/bootstrap-fileinput/bootstrap-fileinput.css"
	rel="stylesheet" type="text/css" />
<link href="assets1/pages/css/profile-2.min.css" rel="stylesheet"
	type="text/css" />
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN THEME GLOBAL STYLES -->
<link href="assets1/global/css/components.min.css" rel="stylesheet"
	id="style_components" type="text/css" />
<link href="assets1/global/css/plugins.min.css" rel="stylesheet"
	type="text/css" />
<!-- END THEME GLOBAL STYLES -->
<!-- BEGIN THEME LAYOUT STYLES -->
<link href="assets1/layouts/layout/css/layout.min.css" rel="stylesheet"
	type="text/css" />
<link href="assets1/layouts/layout/css/themes/darkblue.min.css"
	rel="stylesheet" type="text/css" id="style_color" />
<link href="assets1/layouts/layout/css/custom.min.css" rel="stylesheet"
	type="text/css" />
<link href="assets1/layouts/layout/css/custom.css" rel="stylesheet"
	type="text/css" />
<!-- END THEME LAYOUT STYLES -->
<link rel="shortcut icon" href="assets1/layouts/layout/img/favicon.png" />
<style type="text/css">
@media print {
	#printPageButton {
		display: none;
	}
	#printlogoButton {
		display: inline;
	}
}
@media ( min-width : 992px) {
	.page-content {
		margin-left: 0px !important;
	}
}

</style>
</head>
<body class="body_pop"  >

						<div class="portlet light">

							

<table width="645" border="0" align="center" class="tb2_grid" style="border-top:1px solid black;border-right:1px solid black;border-bottom:1px solid black;border-left:1px solid black;">
  <tr>
    <td width="635"><table width="100%" border="0">
     <tr>
        <td align="right" valign="top" colspan="3"><table width="100%" border="0">
          <tr>
            <td colspan="2" align="center" valign="top" >&nbsp;</td>
          </tr>
          <tr>
            <td width="8%" rowspan="4" align="center" valign="top" ><images:getImage id="${instituite?.logo?.id}" width="47.635135135135" height="50" alt="Image" border="0" title="Images" />&nbsp;</td>
            <td width="92%" align="center" valign="top" ><span class="style1">${instituite?.name}</span></td>
          </tr>
          <tr>
            <td align="center" valign="top" ><strong>H.No:${instituite?.hsno} ${instituite?.street} ${instituite?.city}-${instituite?.pinCode}
														${instituite?.state} ${instituite?.country} Ph:${instituite?.phone}</strong></td>
          </tr>
          
          <tr>
            <td align="center" valign="top" ></td>
          </tr>
          
           <tr>
            <td colspan="2" align="center" valign="top" style="font-family:Verdana, Arial, Helvetica, sans-serif; font-size:16px;" ><strong></strong></td>
          </tr>
        
        </table>        
      </tr>
      <tr>
        <td height="93" colspan="3">

<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
         <td height="3" colspan="3"></td>
  </tr>
	<tr><td height="25" colspan="3" class="bgcolor_02">&nbsp;&nbsp;<span class="admin">Student Payment Details</span></td></tr>
	<tr>
		<td width="1" class="bgcolor_02"></td>
		<td align="left" valign="top">
        <table width="100%">
  
<tr>
    <td><table width="95%" border="0" cellspacing="2" cellpadding="0" align="center">
<tr>
					<td align="left" class="narmal">Invoice No</td>
					<td align="left" class="narmal">:</td>
					<td align="left" class="narmal">${trackerone?.invoiceNo.toString().replace('[', '').replace(']', '')}</td>
					<td align="left" class="narmal">&nbsp;</td>
				</tr>
				<tr>
					<td align="left" class="narmal">Date</td>
					<td align="left" class="narmal">:</td>
					<td align="left" class="narmal"><g:formatDate date="${trackerone?.lastUpdated[0]}" format="dd-MMM-yyyy"/></td>
					<td align="left" class="narmal">&nbsp;</td>
				</tr>	
               
				<tr>
					<td align="left" class="narmal" width="31%">Student Name </td>
					<td align="left" class="narmal" width="1%">:</td>
					<td align="left" class="narmal" width="27%">${studentInstance?.studentName}</td>
					<td align="left" class="narmal" width="41%" rowspan="11">
					<g:if test="${studentInstance?.profilePic !=null }">
					<images:getImage id="${studentInstance?.profilePic?.id}" width="127" height="95.25" alt="Image" border="0" title="Images" />
					</g:if>
					<g:else>
					<img src="assets1/layouts/layout/img/user.jpg"
													class="img-responsive pic-bordered" alt="" />
					</g:else>
					
					</td>
				</tr>
				<tr>
					<td align="left" class="narmal">Registration No</td>
					<td align="left" class="narmal">:</td>
					<td align="left" class="narmal">${studentInstance?.registrationNo}</td>
				</tr>
				 <tr>
					<td align="left" class="narmal">Class</td>
					<td align="left" class="narmal">:</td>
					<td align="left" class="narmal"><g:each in="${studentInstance?.academicyear}">
														<g:if test="${it.status == 'current'}">
														</g:if>
													</g:each>
													<g:set value="${it?.presentclass}" var="pclass"></g:set>


													${pclass?.classname }</td>
				</tr>
				<tr>
					<td align="left" class="narmal" width="31%">Section </td>
					<td align="left" class="narmal" width="1%">:</td>
					<td align="left" class="narmal" width="27%"><g:each in="${studentInstance?.academicyear}">
														<g:if test="${it.status == 'current'}">
														</g:if>
													</g:each>
													<g:set value="${it?.section}" var="pclass"></g:set>


													${pclass?.sectionName}</td>	
				</tr>
				
				<tr>
					<td align="left" class="narmal">Father/Guardian Name </td>
					<td align="left" class="narmal">:</td>
					<td align="left" class="narmal">${studentInstance?.fatherDetails?.parentName}</td>
				</tr>
				<tr>
					<td align="left" class="narmal">Address</td>
					<td align="left" class="narmal">:</td>
					<td align="left" class="narmal">${studentInstance?.presentAddress?.hsno}
													${studentInstance?.presentAddress?.street},
													${studentInstance?.presentAddress?.city} - ${studentInstance?.presentAddress?.pinCode}, <br><br>
													${studentInstance?.presentAddress?.state}, -
													${studentInstance?.presentAddress?.country}</td>
				</tr>
                <tr>
					<td align="left" class="narmal">Academic Session</td>
					<td align="left" class="narmal">:</td>
					<td align="left" class="narmal"><g:each in="${studentInstance?.academicyear}">
														<g:if test="${it.status == 'current'}">
														</g:if>
													</g:each>
													<g:set value="${it}" var="pclass"></g:set>


													${pclass?.academicyear}</td>
				</tr>
				
							 
			</table></td>
  </tr>
  
  <tr>
  <td>
  <g:render template="/studentList/studenttable"
													model="[academicyears:studentInstance?.academicyear]"></g:render>
  </td>
  </tr>
  
</table>

		
	  	
		</td>
		<td width="1" class="bgcolor_02"></td>
	</tr>
	<tr>
		<td width="1" class="bgcolor_02"></td>
		<td height="10" >&nbsp;</td>
		<td width="1" class="bgcolor_02"></td>
	</tr>
	<tr><td height="1" colspan="3" class="bgcolor_02"></td></tr>
</table>
<style>
.fee_card{font-family:Verdana, Arial, Helvetica, sans-serif;
font-size:9px;
}
</style>

		  </td>
        </tr>
		
		<tr>
				<td colspan="3" align="right"><b>Received with Thanks,<br><span style="margin-right:15px;">${sec.username()}</span></b></td>
				
		</tr>
		<tr>
				<td colspan="3" align="right"><input type="button" id="printbutton" value="&nbsp;PRINT" onclick="return printing();" class="btn blue"  /></td>
				
		</tr>
		
     </table></td>
  </tr>
  <script type="text/javaScript">
  function printing(){
	  document.getElementById("printbutton").style.display = "none";
	  window.print();
	  window.close();
	 }

  </script>
  				
</table></div>
</body>
</html>
