import com.hiideals.instituite.student.Student
import java.lang.Integer
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_studentAttendanceprintattendance_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/studentAttendance/printattendance.gsp" }
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
expressionOut.print(params?.fromDate)
printHtmlPart(16)
expressionOut.print(params?.toDate)
printHtmlPart(17)
printHtmlPart(18)
if(true && (studentList)) {
printHtmlPart(19)
for( count1 in ((1..31).toList()) ) {
printHtmlPart(20)
expressionOut.print(count1)
printHtmlPart(21)
}
printHtmlPart(22)
}
printHtmlPart(23)
loop:{
int k = 0
for( st1 in (studentattendence?.keySet()) ) {
printHtmlPart(24)
invokeTag('set','g',164,['var':("total"),'value':("0")],-1)
printHtmlPart(25)
invokeTag('set','g',165,['var':("present"),'value':("0")],-1)
printHtmlPart(25)
invokeTag('set','g',166,['var':("absent"),'value':("0")],-1)
printHtmlPart(26)
expressionOut.print(st1?.studentName)
printHtmlPart(27)
loop:{
int n = 0
for( dates in (studentattendence.get(st1).keySet()) ) {
printHtmlPart(28)
if(true && (studentattendence.get(st1).get(dates)=='P')) {
printHtmlPart(29)
expressionOut.print(studentattendence.get(st1).get(dates))
printHtmlPart(30)
expressionOut.print(total++)
printHtmlPart(31)
expressionOut.print(present++)
printHtmlPart(32)
}
else if(true && (studentattendence.get(st1).get(dates)=='A')) {
printHtmlPart(33)
expressionOut.print(studentattendence.get(st1).get(dates))
printHtmlPart(30)
expressionOut.print(total++)
printHtmlPart(34)
expressionOut.print(absent++)
printHtmlPart(35)
}
else {
printHtmlPart(36)
expressionOut.print(studentattendence.get(st1).get(dates))
printHtmlPart(37)
}
printHtmlPart(38)
n++
}
}
printHtmlPart(39)
expressionOut.print(total)
printHtmlPart(40)
expressionOut.print(present)
printHtmlPart(40)
expressionOut.print(absent)
printHtmlPart(41)
k++
}
}
printHtmlPart(42)
invokeTag('render','g',251,['template':("/footer/footer")],-1)
printHtmlPart(43)
})
invokeTag('captureBody','sitemesh',289,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(44)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925995037L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
