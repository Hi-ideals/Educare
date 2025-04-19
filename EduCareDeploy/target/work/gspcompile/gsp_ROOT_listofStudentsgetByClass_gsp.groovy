import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.student.Student
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_listofStudentsgetByClass_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/listofStudents/getByClass.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(0)
createTagBody(2, {->
createTagBody(3, {->
printHtmlPart(2)
expressionOut.print(studentInstance?.studentName)
})
invokeTag('captureTitle','sitemesh',14,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',14,[:],2)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',18,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',73,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',82,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',85,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('getImage','images',110,['id':(instituite?.logo?.id),'width':("100px")],-1)
printHtmlPart(8)
expressionOut.print(instituite?.name)
printHtmlPart(9)
expressionOut.print(instituite?.affiliatedTo)
printHtmlPart(10)
expressionOut.print(instituite?.hsno)
printHtmlPart(11)
expressionOut.print(instituite?.street)
printHtmlPart(11)
expressionOut.print(instituite?.city)
printHtmlPart(12)
expressionOut.print(instituite?.pinCode)
printHtmlPart(13)
expressionOut.print(instituite?.state)
printHtmlPart(11)
expressionOut.print(instituite?.country)
printHtmlPart(14)
expressionOut.print(instituite?.phone)
printHtmlPart(15)
invokeTag('set','g',139,['var':("user"),'value':(sec.username())],-1)
printHtmlPart(16)
if(true && (user == "vidyashree")) {
printHtmlPart(17)
invokeTag('message','g',143,['code':("student.fatherDetails.label"),'default':("Registration Number")],-1)
printHtmlPart(18)
}
else {
printHtmlPart(19)
invokeTag('message','g',148,['code':("student.fatherDetails.label"),'default':("Registration Number")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
invokeTag('message','g',154,['code':("student.guardianDetails.label"),'default':("Student Name")],-1)
printHtmlPart(22)
loop:{
int i = 0
for( studentInstance in (studentInstanceList) ) {
printHtmlPart(23)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(24)
invokeTag('set','g',169,['var':("user"),'value':(sec.username())],-1)
printHtmlPart(16)
if(true && (user == "vidyashree")) {
printHtmlPart(25)
}
else {
printHtmlPart(26)
expressionOut.print(fieldValue(bean: studentInstance, field: "registrationNo"))
printHtmlPart(27)
}
printHtmlPart(28)
expressionOut.print(fieldValue(bean: studentInstance, field: "studentName"))
printHtmlPart(29)
expressionOut.print(fieldValue(bean: studentInstance, field: "fatherDetails.parentName"))
printHtmlPart(30)
invokeTag('set','g',186,['value':(IClass.findById(params?.iclass).classname),'var':("icalssname")],-1)
printHtmlPart(31)
if(true && (params?.academicyear=='all')) {
printHtmlPart(32)
for( _it2098356355 in (studentInstance?.academicyear) ) {
changeItVariable(_it2098356355)
printHtmlPart(33)
if(true && (it?.presentclass?.classname==icalssname)) {
printHtmlPart(34)
expressionOut.print(it?.academicyear)
printHtmlPart(35)
}
printHtmlPart(32)
}
printHtmlPart(36)
}
else {
printHtmlPart(37)
expressionOut.print(params?.academicyear)
printHtmlPart(38)
}
printHtmlPart(31)
if(true && (params?.iclass=='all')) {
printHtmlPart(39)
for( _it1996472700 in (studentInstance?.academicyear) ) {
changeItVariable(_it1996472700)
printHtmlPart(40)
if(true && (it?.academicyear==params?.academicyear)) {
printHtmlPart(34)
expressionOut.print(it?.presentclass?.classname)
printHtmlPart(35)
}
printHtmlPart(32)
}
printHtmlPart(36)
}
else {
printHtmlPart(41)
if(true && (icalssname)) {
printHtmlPart(42)
expressionOut.print(icalssname)
printHtmlPart(40)
}
else {
printHtmlPart(42)
expressionOut.print(IClass.findById(params?.iclass).classname)
printHtmlPart(40)
}
printHtmlPart(43)
}
printHtmlPart(44)
invokeTag('formatDate','g',225,['format':("dd-MMM-yyyy"),'date':(studentInstance.studentDOJ)],-1)
printHtmlPart(45)
i++
}
}
printHtmlPart(46)
invokeTag('render','g',266,['template':("/footer/footer")],-1)
printHtmlPart(47)
})
invokeTag('captureBody','sitemesh',317,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(48)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1650893112000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
