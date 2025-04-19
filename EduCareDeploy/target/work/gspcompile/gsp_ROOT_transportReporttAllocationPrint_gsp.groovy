import com.hiideals.enums.WeekdaysEnum
import com.hiideals.instituite.student.Student
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_transportReporttAllocationPrint_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/transportReport/tAllocationPrint.gsp" }
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
invokeTag('getImage','images',110,['id':(instituite?.logo?.id),'width':("60px"),'height':("60px")],-1)
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
if(true && (params.type == "all" && params.routeNo == "all")) {
printHtmlPart(16)
loop:{
int i = 0
for( transportInstance in (transportInstanceList) ) {
printHtmlPart(17)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(18)
expressionOut.print(fieldValue(bean: transportInstance, field: "route.routeCode"))
printHtmlPart(19)
expressionOut.print(transportInstance?.destination?.fromPlace)
printHtmlPart(20)
expressionOut.print(transportInstance?.destination?.toPlace)
printHtmlPart(19)
expressionOut.print(fieldValue(bean: transportInstance, field: "type"))
printHtmlPart(21)
invokeTag('formatDate','g',167,['format':("MM-dd-yyyy"),'date':(transportInstance.startDate)],-1)
printHtmlPart(22)
invokeTag('formatDate','g',171,['format':("MM-dd-yyyy"),'date':(transportInstance.endDate)],-1)
printHtmlPart(23)
expressionOut.print(fieldValue(bean: transportInstance, field: "student.studentName"))
printHtmlPart(24)
expressionOut.print(fieldValue(bean: transportInstance, field: "employee.staffName"))
printHtmlPart(25)
i++
}
}
printHtmlPart(26)
}
else if(true && ((params.type == "Students" && params.routeNo == "all")
		            ||(params.type == "Students" && params.routeNo != "all"))) {
printHtmlPart(27)
loop:{
int i = 0
for( transportInstance in (transportInstanceList) ) {
printHtmlPart(17)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(18)
expressionOut.print(fieldValue(bean: transportInstance, field: "route.routeCode"))
printHtmlPart(19)
expressionOut.print(transportInstance?.destination?.fromPlace)
printHtmlPart(20)
expressionOut.print(transportInstance?.destination?.toPlace)
printHtmlPart(21)
invokeTag('formatDate','g',211,['format':("MM-dd-yyyy"),'date':(transportInstance.startDate)],-1)
printHtmlPart(22)
invokeTag('formatDate','g',215,['format':("MM-dd-yyyy"),'date':(transportInstance.endDate)],-1)
printHtmlPart(23)
expressionOut.print(fieldValue(bean: transportInstance, field: "student.studentName"))
printHtmlPart(28)
i++
}
}
printHtmlPart(26)
}
else if(true && ((params.type == "Staff" && params.routeNo == "all")
		            ||(params.type == "Staff" && params.routeNo != "all"))) {
printHtmlPart(29)
loop:{
int i = 0
for( transportInstance in (transportInstanceList) ) {
printHtmlPart(17)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(18)
expressionOut.print(fieldValue(bean: transportInstance, field: "route.routeCode"))
printHtmlPart(19)
expressionOut.print(transportInstance?.destination?.fromPlace)
printHtmlPart(20)
expressionOut.print(transportInstance?.destination?.toPlace)
printHtmlPart(21)
invokeTag('formatDate','g',252,['format':("MM-dd-yyyy"),'date':(transportInstance.startDate)],-1)
printHtmlPart(22)
invokeTag('formatDate','g',256,['format':("MM-dd-yyyy"),'date':(transportInstance.endDate)],-1)
printHtmlPart(23)
expressionOut.print(fieldValue(bean: transportInstance, field: "employee.staffName"))
printHtmlPart(28)
i++
}
}
printHtmlPart(30)
}
printHtmlPart(31)
invokeTag('render','g',321,['template':("/footer/footer")],-1)
printHtmlPart(32)
})
invokeTag('captureBody','sitemesh',359,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(33)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925995518L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
