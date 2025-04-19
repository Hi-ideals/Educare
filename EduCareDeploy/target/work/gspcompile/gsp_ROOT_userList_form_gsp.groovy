import com.hiideals.instituite.admin.UserList
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_userList_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/userList/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: userListInstance, field: 'userName', 'error'))
printHtmlPart(1)
invokeTag('message','g',9,['code':("userList.userName.label"),'default':("User Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',12,['name':("userName"),'class':("form-control"),'id':("userName"),'value':(userListInstance?.userName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userListInstance, field: 'password', 'error'))
printHtmlPart(4)
invokeTag('message','g',22,['code':("userList.password.label"),'default':("Password")],-1)
printHtmlPart(5)
invokeTag('textField','g',26,['name':("password"),'class':("form-control"),'id':("Password"),'value':(userListInstance?.password)],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: userListInstance, field: 'secrole', 'error'))
printHtmlPart(7)
invokeTag('message','g',35,['code':("userList.secrole.label"),'default':("Secrole")],-1)
printHtmlPart(8)
expressionOut.print(userListInstance?.secrole?.id)
printHtmlPart(9)
for( _it667591046 in (roles) ) {
changeItVariable(_it667591046)
printHtmlPart(10)
expressionOut.print(it?.id)
printHtmlPart(11)
expressionOut.print(it?.roleName)
printHtmlPart(12)
}
printHtmlPart(13)
invokeTag('render','g',46,['template':("addressForm")],-1)
printHtmlPart(14)
if(true && (params?.action!='edit')) {
printHtmlPart(15)
invokeTag('message','g',57,['code':("admin.smsSenderId.label"),'default':("Student Management")],-1)
printHtmlPart(16)
if(true && (userListInstance?.modules?.moduleName?.contains('adminsion'))) {
printHtmlPart(17)
}
else {
printHtmlPart(18)
}
printHtmlPart(19)
invokeTag('getModule','regId',62,['name':("library")],-1)
printHtmlPart(20)
if(true && (module)) {
printHtmlPart(21)
invokeTag('message','g',74,['code':("admin.smsSenderId.label"),'default':("Library Management")],-1)
printHtmlPart(22)
if(true && (userListInstance?.modules?.moduleName?.contains('library'))) {
printHtmlPart(23)
}
else {
printHtmlPart(24)
}
printHtmlPart(25)
}
printHtmlPart(20)
invokeTag('getModule','regId',86,['name':("transport")],-1)
printHtmlPart(20)
if(true && (module)) {
printHtmlPart(21)
invokeTag('message','g',93,['code':("admin.smsSenderId.label"),'default':("Transport Management")],-1)
printHtmlPart(22)
if(true && (userListInstance?.modules?.moduleName?.contains('transport'))) {
printHtmlPart(26)
}
else {
printHtmlPart(27)
}
printHtmlPart(28)
}
printHtmlPart(29)
invokeTag('getModule','regId',105,['name':("payroll")],-1)
printHtmlPart(20)
if(true && (module)) {
printHtmlPart(21)
invokeTag('message','g',113,['code':("admin.smsSenderId.label"),'default':("HR")],-1)
printHtmlPart(22)
if(true && (userListInstance?.modules?.moduleName?.contains('payroll'))) {
printHtmlPart(30)
}
else {
printHtmlPart(31)
}
printHtmlPart(28)
}
printHtmlPart(20)
invokeTag('getModule','regId',124,['name':("Exams")],-1)
printHtmlPart(20)
if(true && (module)) {
printHtmlPart(21)
invokeTag('message','g',135,['code':("admin.smsSenderId.label"),'default':("Exam")],-1)
printHtmlPart(22)
if(true && (userListInstance?.modules?.moduleName?.contains('Exams'))) {
printHtmlPart(32)
}
else {
printHtmlPart(33)
}
printHtmlPart(28)
}
printHtmlPart(20)
invokeTag('getModule','regId',146,['name':("timetable")],-1)
printHtmlPart(20)
if(true && (module)) {
printHtmlPart(34)
invokeTag('message','g',157,['code':("admin.smsSenderId.label"),'default':("Time Table")],-1)
printHtmlPart(2)
if(true && (userListInstance?.modules?.moduleName?.contains('timetable'))) {
printHtmlPart(35)
}
else {
printHtmlPart(36)
}
printHtmlPart(25)
}
printHtmlPart(37)
invokeTag('getModule','regId',171,['name':("attendence")],-1)
printHtmlPart(20)
if(true && (module)) {
printHtmlPart(21)
invokeTag('message','g',182,['code':("admin.smsSenderId.label"),'default':("Attendance")],-1)
printHtmlPart(2)
if(true && (userListInstance?.modules?.moduleName?.contains('attendence'))) {
printHtmlPart(38)
}
else {
printHtmlPart(39)
}
printHtmlPart(25)
}
printHtmlPart(20)
invokeTag('getModule','regId',193,['name':("certificates")],-1)
printHtmlPart(20)
if(true && (module)) {
printHtmlPart(21)
invokeTag('message','g',202,['code':("admin.smsSenderId.label"),'default':("Certificates")],-1)
printHtmlPart(2)
if(true && (userListInstance?.modules?.moduleName?.contains('certificates'))) {
printHtmlPart(40)
}
else {
printHtmlPart(41)
}
printHtmlPart(25)
}
printHtmlPart(42)
}
printHtmlPart(43)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926005245L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
