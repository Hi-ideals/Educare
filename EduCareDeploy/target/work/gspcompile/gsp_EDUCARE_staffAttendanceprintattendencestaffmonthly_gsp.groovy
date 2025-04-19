import com.hiideals.instituite.student.Student
import java.lang.Integer
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_staffAttendanceprintattendencestaffmonthly_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/staffAttendance/printattendencestaffmonthly.gsp" }
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
printHtmlPart(13)
if(true && (staffList)) {
printHtmlPart(18)
for( count1 in ((1..31).toList()) ) {
printHtmlPart(19)
expressionOut.print(count1)
printHtmlPart(20)
}
printHtmlPart(21)
loop:{
int k = 0
for( st1 in (staffattendence?.keySet()) ) {
printHtmlPart(22)
invokeTag('set','g',166,['var':("total"),'value':("0")],-1)
printHtmlPart(23)
invokeTag('set','g',167,['var':("present"),'value':("0")],-1)
printHtmlPart(23)
invokeTag('set','g',168,['var':("absent"),'value':("0")],-1)
printHtmlPart(19)
expressionOut.print(st1?.staffName)
printHtmlPart(24)
loop:{
int n = 0
for( dates in (staffattendence.get(st1).keySet()) ) {
printHtmlPart(25)
if(true && (staffattendence.get(st1).get(dates)=='P')) {
printHtmlPart(26)
expressionOut.print(staffattendence.get(st1).get(dates))
printHtmlPart(27)
expressionOut.print(total++)
printHtmlPart(28)
expressionOut.print(present++)
printHtmlPart(29)
}
else if(true && (staffattendence.get(st1).get(dates)=='A')) {
printHtmlPart(30)
expressionOut.print(staffattendence.get(st1).get(dates))
printHtmlPart(27)
expressionOut.print(total++)
printHtmlPart(28)
expressionOut.print(absent++)
printHtmlPart(29)
}
else {
printHtmlPart(31)
expressionOut.print(staffattendence.get(st1).get(dates))
printHtmlPart(32)
}
printHtmlPart(33)
n++
}
}
printHtmlPart(34)
expressionOut.print(total)
printHtmlPart(35)
expressionOut.print(present)
printHtmlPart(35)
expressionOut.print(absent)
printHtmlPart(36)
k++
}
}
printHtmlPart(37)
}
printHtmlPart(38)
invokeTag('render','g',250,['template':("/footer/footer")],-1)
printHtmlPart(39)
})
invokeTag('captureBody','sitemesh',274,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(40)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926011425L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
