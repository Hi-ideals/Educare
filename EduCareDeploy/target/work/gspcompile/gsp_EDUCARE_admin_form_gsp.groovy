import com.hiideals.instituite.helper.Address
import com.hiideals.instituite.admin.Admin
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_admin_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admin/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
expressionOut.print(hasErrors(bean: adminInstance, field: 'adminID', 'error'))
printHtmlPart(2)
invokeTag('message','g',11,['code':("admin.adminID.label"),'default':("Admin ID")],-1)
printHtmlPart(3)
if(true && (ID)) {
printHtmlPart(4)
invokeTag('textField','g',16,['name':("adminID"),'class':("form-control"),'required':(""),'value':(ID)],-1)
printHtmlPart(5)
}
else {
printHtmlPart(4)
invokeTag('textField','g',20,['name':("adminID"),'class':("form-control"),'required':(""),'value':(adminInstance?.adminID)],-1)
printHtmlPart(5)
}
printHtmlPart(6)
expressionOut.print(hasErrors(bean: adminInstance, field: 'adminName', 'error'))
printHtmlPart(7)
invokeTag('message','g',30,['code':("admin.adminName.label"),'default':("Admin Name")],-1)
printHtmlPart(8)
invokeTag('textField','g',34,['name':("adminName"),'class':("form-control"),'required':(""),'value':(adminInstance?.adminName)],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: adminInstance, field: 'password', 'error'))
printHtmlPart(10)
invokeTag('message','g',43,['code':("admin.password.label"),'default':("Password")],-1)
printHtmlPart(8)
invokeTag('textField','g',47,['name':("password"),'class':("form-control"),'required':(""),'value':(adminInstance?.password)],-1)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: adminInstance, field: 'smsUsername', 'error'))
printHtmlPart(12)
invokeTag('message','g',60,['code':("admin.smsUsername.label"),'default':("smsUsername")],-1)
printHtmlPart(13)
invokeTag('textField','g',63,['name':("smsUsername"),'class':("form-control"),'value':(adminInstance?.smsUsername)],-1)
printHtmlPart(14)
expressionOut.print(hasErrors(bean: adminInstance, field: 'smsPassword', 'error'))
printHtmlPart(15)
invokeTag('message','g',71,['code':("admin.smsPassword.label"),'default':("smsPassword")],-1)
printHtmlPart(16)
invokeTag('textField','g',75,['name':("smsPassword"),'class':("form-control"),'value':(adminInstance?.smsPassword)],-1)
printHtmlPart(14)
expressionOut.print(hasErrors(bean: adminInstance, field: 'smsSenderId', 'error'))
printHtmlPart(17)
invokeTag('message','g',83,['code':("admin.smsSenderId.label"),'default':("smsSenderId")],-1)
printHtmlPart(13)
invokeTag('textField','g',86,['name':("smsSenderId"),'class':("form-control"),'value':(adminInstance?.smsSenderId)],-1)
printHtmlPart(18)
invokeTag('render','g',92,['template':("addressForm")],-1)
printHtmlPart(19)
if(true && (adminInstance?.profilePic != null)) {
printHtmlPart(5)
invokeTag('getImage','images',98,['id':(adminInstance?.profilePic?.id),'width':("150px")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
expressionOut.print(edit)
printHtmlPart(22)
invokeTag('message','g',139,['code':("admin.smsSenderId.label"),'default':("1.Student Management")],-1)
printHtmlPart(23)
invokeTag('message','g',148,['code':("admin.smsSenderId.label"),'default':("2.Library Management")],-1)
printHtmlPart(24)
if(true && (adminInstance?.modules?.moduleName?.contains('library'))) {
printHtmlPart(25)
}
else {
printHtmlPart(26)
}
printHtmlPart(27)
invokeTag('message','g',167,['code':("admin.smsSenderId.label"),'default':("3.Transport Management")],-1)
printHtmlPart(24)
if(true && (adminInstance?.modules?.moduleName?.contains('transport'))) {
printHtmlPart(28)
}
else {
printHtmlPart(29)
}
printHtmlPart(30)
invokeTag('message','g',188,['code':("admin.smsSenderId.label"),'default':("4.HR")],-1)
printHtmlPart(24)
if(true && (adminInstance?.modules?.moduleName?.contains('payroll'))) {
printHtmlPart(31)
}
else {
printHtmlPart(32)
}
printHtmlPart(33)
invokeTag('message','g',208,['code':("admin.smsSenderId.label"),'default':("5.Exam")],-1)
printHtmlPart(24)
if(true && (adminInstance?.modules?.moduleName?.contains('Exams'))) {
printHtmlPart(34)
}
else {
printHtmlPart(35)
}
printHtmlPart(33)
invokeTag('message','g',228,['code':("admin.smsSenderId.label"),'default':("6.Time Table")],-1)
printHtmlPart(36)
if(true && (adminInstance?.modules?.moduleName?.contains('timetable'))) {
printHtmlPart(37)
}
else {
printHtmlPart(38)
}
printHtmlPart(39)
invokeTag('message','g',245,['code':("admin.smsSenderId.label"),'default':("7.Attendance")],-1)
printHtmlPart(36)
if(true && (adminInstance?.modules?.moduleName?.contains('attendence'))) {
printHtmlPart(40)
}
else {
printHtmlPart(41)
}
printHtmlPart(42)
invokeTag('message','g',261,['code':("admin.smsSenderId.label"),'default':("8.Certificates")],-1)
printHtmlPart(36)
if(true && (adminInstance?.modules?.moduleName?.contains('certificates'))) {
printHtmlPart(43)
}
else {
printHtmlPart(44)
}
printHtmlPart(45)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925996238L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
