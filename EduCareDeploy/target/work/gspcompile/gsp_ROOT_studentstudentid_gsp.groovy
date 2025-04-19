import com.hiideals.instituite.helper.AcademicYear
import com.hiideals.instituite.student.ParentDetails
import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.student.Student
import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.classcourses.Section
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_studentstudentid_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/student/studentid.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',13,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',13,[:],2)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',52,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',58,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',62,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',71,['template':("/header/leftSide")],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',83,['action':("create")],2)
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
invokeTag('textField','g',131,['name':("registrationNo"),'class':("form-control"),'id':("registrationNo"),'required':(""),'value':(studentInstance?.registrationNo)],-1)
printHtmlPart(22)
}
else {
printHtmlPart(21)
invokeTag('getRegId','regId',136,['Inst':(instituite)],-1)
printHtmlPart(23)
}
printHtmlPart(24)
for( _it1393726189 in (studentInstance?.academicyear) ) {
changeItVariable(_it1393726189)
printHtmlPart(23)
if(true && (it.status == 'current')) {
printHtmlPart(23)
}
printHtmlPart(25)
}
printHtmlPart(25)
invokeTag('set','g',148,['value':(it?.academicyear),'var':("pacademic")],-1)
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
for( _it1095991632 in (studentInstance?.academicyear) ) {
changeItVariable(_it1095991632)
printHtmlPart(25)
if(true && (it.status == 'current')) {
printHtmlPart(25)
}
printHtmlPart(32)
}
printHtmlPart(32)
invokeTag('set','g',183,['value':(it?.presentclass?.classname),'var':("pclass")],-1)
printHtmlPart(33)
expressionOut.print(pclass)
printHtmlPart(34)
expressionOut.print(remoteFunction(controller:'student',action: 'reclassSections',
                       update: 'updateSections',
                       params: '\'classId=\' + this.value'))
printHtmlPart(35)
for( cls in (iclass) ) {
printHtmlPart(36)
expressionOut.print(cls.id)
printHtmlPart(37)
expressionOut.print(cls.classname)
printHtmlPart(38)
}
printHtmlPart(39)
for( _it325119885 in (studentInstance?.academicyear) ) {
changeItVariable(_it325119885)
printHtmlPart(25)
if(true && (it.status == 'current')) {
printHtmlPart(25)
}
printHtmlPart(32)
}
printHtmlPart(32)
invokeTag('set','g',221,['value':(it?.section?.sectionName),'var':("psec")],-1)
printHtmlPart(40)
expressionOut.print(psec)
printHtmlPart(41)
invokeTag('render','g',234,['template':("reclassSections"),'model':([classId:classId])],-1)
printHtmlPart(42)
if(true && (studentInstance?.stsSystem !=null)) {
printHtmlPart(21)
invokeTag('textField','g',241,['name':("stsSystem"),'class':("form-control"),'id':("stsSystem"),'value':(studentInstance?.stsSystem),'readonly':("readonly")],-1)
printHtmlPart(22)
}
else {
printHtmlPart(21)
invokeTag('textField','g',247,['name':("stsSystem"),'class':("form-control"),'id':("stsSystem"),'value':(studentInstance?.stsSystem)],-1)
printHtmlPart(23)
}
printHtmlPart(43)
expressionOut.print(hasErrors(bean: studentInstance, field: 'studentId', 'error'))
printHtmlPart(44)
invokeTag('textField','g',283,['name':("studentId"),'id':("studentId"),'class':("form-control"),'required':(""),'value':(studentInstance?.studentId)],-1)
printHtmlPart(45)
expressionOut.print(hasErrors(bean: studentInstance, field: 'studentName', 'error'))
printHtmlPart(44)
invokeTag('textField','g',297,['name':("studentName"),'class':("form-control"),'id':("studentName"),'required':(""),'value':(studentInstance?.studentName)],-1)
printHtmlPart(46)
expressionOut.print(hasErrors(bean: studentInstance, field: 'lastName', 'error'))
printHtmlPart(44)
invokeTag('textField','g',313,['name':("lastName"),'class':("form-control"),'id':("lastName"),'required':(""),'value':(studentInstance?.lastName)],-1)
printHtmlPart(47)
expressionOut.print(hasErrors(bean: studentInstance, field: 'studentDOB', 'error'))
printHtmlPart(48)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:studentInstance?.studentDOB))
printHtmlPart(49)
expressionOut.print(hasErrors(bean: studentInstance, field: 'studentDOJ', 'error'))
printHtmlPart(50)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:studentInstance?.studentDOJ))
printHtmlPart(51)
expressionOut.print(hasErrors(bean: studentInstance?.presentAddress, field: 'bloodgroup', 'error'))
printHtmlPart(52)
invokeTag('textField','g',368,['name':("bloodgroup"),'class':("form-control"),'value':(studentInstance?.bloodgroup)],-1)
printHtmlPart(53)
expressionOut.print(hasErrors(bean: studentInstance?.presentAddress, field: 'motherTongue', 'error'))
printHtmlPart(52)
invokeTag('textField','g',382,['name':("motherTongue"),'class':("form-control"),'value':(studentInstance?.motherTongue),'id':("motherTongue")],-1)
printHtmlPart(54)
expressionOut.print(hasErrors(bean: studentInstance?.presentAddress, field: 'religion', 'error'))
printHtmlPart(52)
invokeTag('textField','g',396,['name':("religion"),'class':("form-control"),'value':(studentInstance?.religion),'id':("religion")],-1)
printHtmlPart(55)
expressionOut.print(hasErrors(bean: studentInstance?.presentAddress, field: 'nationality', 'error'))
printHtmlPart(52)
invokeTag('textField','g',413,['name':("nationality"),'class':("form-control"),'value':(studentInstance?.nationality)],-1)
printHtmlPart(56)
expressionOut.print(hasErrors(bean: studentInstance, field: 'email', 'error'))
printHtmlPart(57)
invokeTag('textField','g',423,['name':("email"),'class':("form-control"),'value':(studentInstance?.email)],-1)
printHtmlPart(58)
expressionOut.print(hasErrors(bean: studentInstance, field: 'category', 'error'))
printHtmlPart(59)
invokeTag('textField','g',434,['name':("category"),'class':("form-control"),'value':(studentInstance?.category)],-1)
printHtmlPart(60)
expressionOut.print(hasErrors(bean: studentInstance, field: 'gender', 'error'))
printHtmlPart(61)
if(true && (studentInstance?.gender !=null)) {
printHtmlPart(28)
expressionOut.print(studentInstance?.gender)
printHtmlPart(29)
expressionOut.print(studentInstance?.gender)
printHtmlPart(30)
}
printHtmlPart(62)
for( gen in (studentInstance.constraints.gender.inList) ) {
printHtmlPart(28)
expressionOut.print(gen)
printHtmlPart(29)
expressionOut.print(gen)
printHtmlPart(30)
}
printHtmlPart(63)
invokeTag('message','g',464,['code':("student.gender.label"),'default':("Select Gender")],-1)
printHtmlPart(64)
expressionOut.print(hasErrors(bean: studentInstance, field: 'studentAdharNo', 'error'))
printHtmlPart(65)
invokeTag('textField','g',473,['name':("studentAdharNo"),'class':("form-control"),'value':(studentInstance?.studentAdharNo)],-1)
printHtmlPart(66)
invokeTag('message','g',475,['code':("student.gender.label"),'default':("Select Gender")],-1)
printHtmlPart(67)
invokeTag('render','g',498,['template':("presentaddress"),'model':([addr:'presentAddress',address:studentInstance?.presentAddress])],-1)
printHtmlPart(68)
invokeTag('checkBox','g',508,['name':("PPA"),'id':("ppa")],-1)
printHtmlPart(69)
invokeTag('render','g',522,['template':("presentaddress"),'model':([addr:'permenentAddres',address:studentInstance?.permenentAddres])],-1)
printHtmlPart(70)
invokeTag('render','g',540,['template':("/parentDetails/parentForm"),'model':([parentDetailsInstance:studentInstance?.fatherDetails,petails:'fatherDetails',parent:'Father'])],-1)
printHtmlPart(71)
invokeTag('render','g',556,['template':("/parentDetails/parentForm"),'model':([parentDetailsInstance:studentInstance?.motherDetails,petails:'motherDetails',parent:'Mother'])],-1)
printHtmlPart(72)
invokeTag('message','g',581,['code':("transport.route.label"),'default':("Bus Route")],-1)
printHtmlPart(73)
for( _it1154661312 in (rut) ) {
changeItVariable(_it1154661312)
printHtmlPart(74)
expressionOut.print(it?.id)
printHtmlPart(75)
expressionOut.print(it?.startPlace)
printHtmlPart(76)
expressionOut.print(it?.stopPlace)
printHtmlPart(77)
expressionOut.print(it?.routeCode)
printHtmlPart(78)
}
printHtmlPart(79)
invokeTag('message','g',600,['code':("transport.destination.label"),'default':("Student Route")],-1)
printHtmlPart(80)
for( _it51432525 in (dst) ) {
changeItVariable(_it51432525)
printHtmlPart(74)
expressionOut.print(it?.id)
printHtmlPart(75)
expressionOut.print(it?.fromPlace)
printHtmlPart(76)
expressionOut.print(it?.toPlace)
printHtmlPart(81)
expressionOut.print(it?.amount)
printHtmlPart(78)
}
printHtmlPart(82)
invokeTag('message','g',619,['code':("transport.startDate.label"),'default':("Start Date")],-1)
printHtmlPart(83)
expressionOut.print(transportInstance?.startDate)
printHtmlPart(84)
invokeTag('message','g',631,['code':("transport.endDate.label"),'default':("End Date")],-1)
printHtmlPart(85)
expressionOut.print(transportInstance?.endDate)
printHtmlPart(86)
if(true && (studentInstance?.profilePic != null)) {
printHtmlPart(87)
invokeTag('getImage','images',656,['id':(studentInstance?.profilePic?.id),'width':("150px")],-1)
printHtmlPart(88)
}
printHtmlPart(89)
expressionOut.print(hasErrors(bean: sectionInstance, field: 'instituite', 'error'))
printHtmlPart(90)
expressionOut.print(instituite?.id)
printHtmlPart(91)
expressionOut.print(instituite?.name)
printHtmlPart(92)
invokeTag('message','g',686,['code':("instituite.admin.label"),'default':("instituite")],-1)
printHtmlPart(93)
invokeTag('hiddenField','g',696,['name':("id"),'value':(params.id)],-1)
printHtmlPart(94)
invokeTag('actionSubmit','g',699,['value':("submit"),'action':("savereadmission"),'class':("btn blue"),'id':("student")],-1)
printHtmlPart(95)
})
invokeTag('form','g',701,['controller':("student"),'enctype':("multipart/form-data")],2)
printHtmlPart(96)
invokeTag('render','g',716,['template':("/footer/footer")],-1)
printHtmlPart(97)
})
invokeTag('captureBody','sitemesh',808,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(98)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926000612L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
