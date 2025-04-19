import com.hiideals.instituite.helper.AcademicYear
import com.hiideals.instituite.student.ParentDetails
import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.student.Student
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_studentrepeate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/student/repeate.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',12,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',12,[:],2)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',51,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',57,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',61,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',70,['template':("/header/leftSide")],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',82,['action':("create")],2)
printHtmlPart(11)
if(true && (flash.msg)) {
printHtmlPart(12)
expressionOut.print(flash.msg)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (flash.msgfee)) {
printHtmlPart(12)
expressionOut.print(studentInstance?.studentName)
printHtmlPart(15)
expressionOut.print(flash.msgfee)
printHtmlPart(13)
}
printHtmlPart(16)
if(true && (flash.message)) {
printHtmlPart(17)
expressionOut.print(flash.message)
printHtmlPart(18)
}
printHtmlPart(19)
createTagBody(2, {->
printHtmlPart(20)
if(true && (studentInstance?.registrationNo !=null)) {
printHtmlPart(21)
invokeTag('textField','g',130,['name':("registrationNo"),'class':("form-control"),'id':("registrationNo"),'required':(""),'value':(studentInstance?.registrationNo)],-1)
printHtmlPart(22)
}
else {
printHtmlPart(21)
invokeTag('getRegId','regId',135,['Inst':(instituite)],-1)
printHtmlPart(23)
}
printHtmlPart(24)
for( _it1691481417 in (studentInstance?.academicyear) ) {
changeItVariable(_it1691481417)
printHtmlPart(23)
if(true && (it.status == 'current')) {
printHtmlPart(23)
}
printHtmlPart(25)
}
printHtmlPart(25)
invokeTag('set','g',147,['value':(it?.academicyear),'var':("pacademic")],-1)
printHtmlPart(26)
expressionOut.print(pacademic)
printHtmlPart(27)
for( batch in (batchList) ) {
printHtmlPart(28)
expressionOut.print(batch.batchName)
printHtmlPart(29)
expressionOut.print(batch.batchName)
printHtmlPart(30)
}
printHtmlPart(31)
for( _it532028852 in (studentInstance?.academicyear) ) {
changeItVariable(_it532028852)
printHtmlPart(25)
if(true && (it.status == 'current')) {
printHtmlPart(25)
}
printHtmlPart(32)
}
printHtmlPart(32)
invokeTag('set','g',182,['value':(it?.presentclass?.classname),'var':("pclass")],-1)
printHtmlPart(33)
expressionOut.print(pclass)
printHtmlPart(34)
expressionOut.print(it?.presentclass?.id)
printHtmlPart(35)
for( _it491652795 in (studentInstance?.academicyear) ) {
changeItVariable(_it491652795)
printHtmlPart(25)
if(true && (it.status == 'current')) {
printHtmlPart(25)
}
printHtmlPart(32)
}
printHtmlPart(32)
invokeTag('set','g',204,['value':(it?.section?.sectionName),'var':("psec")],-1)
printHtmlPart(36)
expressionOut.print(psec)
printHtmlPart(37)
if(true && (studentInstance?.stsSystem !=null)) {
printHtmlPart(21)
invokeTag('textField','g',218,['name':("stsSystem"),'class':("form-control"),'id':("stsSystem"),'value':(studentInstance?.stsSystem),'readonly':("readonly")],-1)
printHtmlPart(22)
}
else {
printHtmlPart(21)
invokeTag('textField','g',224,['name':("stsSystem"),'class':("form-control"),'id':("stsSystem"),'value':(studentInstance?.stsSystem)],-1)
printHtmlPart(23)
}
printHtmlPart(38)
expressionOut.print(it?.section?.id)
printHtmlPart(39)
expressionOut.print(hasErrors(bean: studentInstance, field: 'studentId', 'error'))
printHtmlPart(40)
invokeTag('textField','g',267,['name':("studentId"),'id':("studentId"),'class':("form-control"),'required':(""),'value':(studentInstance?.studentId)],-1)
printHtmlPart(41)
expressionOut.print(hasErrors(bean: studentInstance, field: 'studentName', 'error'))
printHtmlPart(40)
invokeTag('textField','g',281,['name':("studentName"),'class':("form-control"),'id':("studentName"),'required':(""),'value':(studentInstance?.studentName)],-1)
printHtmlPart(42)
expressionOut.print(hasErrors(bean: studentInstance, field: 'lastName', 'error'))
printHtmlPart(40)
invokeTag('textField','g',297,['name':("lastName"),'class':("form-control"),'id':("lastName"),'required':(""),'value':(studentInstance?.lastName)],-1)
printHtmlPart(43)
expressionOut.print(hasErrors(bean: studentInstance, field: 'studentDOB', 'error'))
printHtmlPart(44)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:studentInstance?.studentDOB))
printHtmlPart(45)
expressionOut.print(hasErrors(bean: studentInstance, field: 'studentDOJ', 'error'))
printHtmlPart(46)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:studentInstance?.studentDOJ))
printHtmlPart(47)
expressionOut.print(hasErrors(bean: studentInstance?.presentAddress, field: 'bloodgroup', 'error'))
printHtmlPart(48)
invokeTag('textField','g',352,['name':("bloodgroup"),'class':("form-control"),'value':(studentInstance?.bloodgroup)],-1)
printHtmlPart(49)
expressionOut.print(hasErrors(bean: studentInstance?.presentAddress, field: 'motherTongue', 'error'))
printHtmlPart(48)
invokeTag('textField','g',366,['name':("motherTongue"),'class':("form-control"),'value':(studentInstance?.motherTongue),'id':("motherTongue")],-1)
printHtmlPart(50)
expressionOut.print(hasErrors(bean: studentInstance?.presentAddress, field: 'religion', 'error'))
printHtmlPart(48)
invokeTag('textField','g',380,['name':("religion"),'class':("form-control"),'value':(studentInstance?.religion),'id':("religion")],-1)
printHtmlPart(51)
expressionOut.print(hasErrors(bean: studentInstance?.presentAddress, field: 'nationality', 'error'))
printHtmlPart(48)
invokeTag('textField','g',397,['name':("nationality"),'class':("form-control"),'value':(studentInstance?.nationality)],-1)
printHtmlPart(52)
expressionOut.print(hasErrors(bean: studentInstance, field: 'email', 'error'))
printHtmlPart(53)
invokeTag('textField','g',407,['name':("email"),'class':("form-control"),'value':(studentInstance?.email)],-1)
printHtmlPart(54)
expressionOut.print(hasErrors(bean: studentInstance, field: 'category', 'error'))
printHtmlPart(55)
invokeTag('textField','g',418,['name':("category"),'class':("form-control"),'value':(studentInstance?.category)],-1)
printHtmlPart(56)
expressionOut.print(hasErrors(bean: studentInstance, field: 'gender', 'error'))
printHtmlPart(57)
if(true && (studentInstance?.gender !=null)) {
printHtmlPart(28)
expressionOut.print(studentInstance?.gender)
printHtmlPart(29)
expressionOut.print(studentInstance?.gender)
printHtmlPart(30)
}
printHtmlPart(58)
for( gen in (studentInstance.constraints.gender.inList) ) {
printHtmlPart(28)
expressionOut.print(gen)
printHtmlPart(29)
expressionOut.print(gen)
printHtmlPart(30)
}
printHtmlPart(59)
invokeTag('message','g',448,['code':("student.gender.label"),'default':("Select Gender")],-1)
printHtmlPart(60)
expressionOut.print(hasErrors(bean: studentInstance, field: 'studentAdharNo', 'error'))
printHtmlPart(61)
invokeTag('textField','g',457,['name':("studentAdharNo"),'class':("form-control"),'value':(studentInstance?.studentAdharNo)],-1)
printHtmlPart(62)
invokeTag('message','g',459,['code':("student.gender.label"),'default':("Select Gender")],-1)
printHtmlPart(63)
invokeTag('render','g',482,['template':("presentaddress"),'model':([addr:'presentAddress',address:studentInstance?.presentAddress])],-1)
printHtmlPart(64)
invokeTag('checkBox','g',492,['name':("PPA"),'id':("ppa")],-1)
printHtmlPart(65)
invokeTag('render','g',506,['template':("presentaddress"),'model':([addr:'permenentAddres',address:studentInstance?.permenentAddres])],-1)
printHtmlPart(66)
invokeTag('render','g',524,['template':("/parentDetails/parentForm"),'model':([parentDetailsInstance:studentInstance?.fatherDetails,petails:'fatherDetails',parent:'Father'])],-1)
printHtmlPart(67)
invokeTag('render','g',540,['template':("/parentDetails/parentForm"),'model':([parentDetailsInstance:studentInstance?.motherDetails,petails:'motherDetails',parent:'Mother'])],-1)
printHtmlPart(68)
invokeTag('message','g',565,['code':("transport.route.label"),'default':("Bus Route")],-1)
printHtmlPart(69)
for( _it783927213 in (rut) ) {
changeItVariable(_it783927213)
printHtmlPart(70)
expressionOut.print(it?.id)
printHtmlPart(71)
expressionOut.print(it?.startPlace)
printHtmlPart(72)
expressionOut.print(it?.stopPlace)
printHtmlPart(73)
expressionOut.print(it?.routeCode)
printHtmlPart(74)
}
printHtmlPart(75)
invokeTag('message','g',584,['code':("transport.destination.label"),'default':("Student Route")],-1)
printHtmlPart(76)
for( _it1160316046 in (dst) ) {
changeItVariable(_it1160316046)
printHtmlPart(70)
expressionOut.print(it?.id)
printHtmlPart(71)
expressionOut.print(it?.fromPlace)
printHtmlPart(72)
expressionOut.print(it?.toPlace)
printHtmlPart(77)
expressionOut.print(it?.amount)
printHtmlPart(74)
}
printHtmlPart(78)
invokeTag('message','g',603,['code':("transport.startDate.label"),'default':("Start Date")],-1)
printHtmlPart(79)
expressionOut.print(transportInstance?.startDate)
printHtmlPart(80)
invokeTag('message','g',615,['code':("transport.endDate.label"),'default':("End Date")],-1)
printHtmlPart(81)
expressionOut.print(transportInstance?.endDate)
printHtmlPart(82)
if(true && (studentInstance?.profilePic != null)) {
printHtmlPart(83)
invokeTag('getImage','images',640,['id':(studentInstance?.profilePic?.id),'width':("150px")],-1)
printHtmlPart(84)
}
printHtmlPart(85)
expressionOut.print(hasErrors(bean: sectionInstance, field: 'instituite', 'error'))
printHtmlPart(86)
expressionOut.print(instituite?.id)
printHtmlPart(87)
expressionOut.print(instituite?.name)
printHtmlPart(88)
invokeTag('message','g',670,['code':("instituite.admin.label"),'default':("instituite")],-1)
printHtmlPart(89)
invokeTag('hiddenField','g',680,['name':("id"),'value':(params.id)],-1)
printHtmlPart(90)
invokeTag('actionSubmit','g',683,['value':("submit"),'action':("saverepeate"),'class':("btn blue"),'id':("student")],-1)
printHtmlPart(91)
})
invokeTag('form','g',685,['controller':("student"),'enctype':("multipart/form-data")],2)
printHtmlPart(92)
invokeTag('render','g',700,['template':("/footer/footer")],-1)
printHtmlPart(93)
})
invokeTag('captureBody','sitemesh',757,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(94)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926000479L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
