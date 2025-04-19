import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_transportReport_tAllocation_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/transportReport/_tAllocation.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
if(true && (params.type == "all" && params.route.id == "all")) {
printHtmlPart(1)
loop:{
int i = 0
for( transportInstance in (transportInstanceList) ) {
printHtmlPart(2)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(3)
expressionOut.print(fieldValue(bean: transportInstance, field: "route.routeCode"))
printHtmlPart(4)
expressionOut.print(transportInstance?.destination?.fromPlace)
printHtmlPart(5)
expressionOut.print(transportInstance?.destination?.toPlace)
printHtmlPart(4)
expressionOut.print(fieldValue(bean: transportInstance, field: "type"))
printHtmlPart(6)
invokeTag('formatDate','g',40,['format':("MM-dd-yyyy"),'date':(transportInstance.startDate)],-1)
printHtmlPart(7)
invokeTag('formatDate','g',44,['format':("MM-dd-yyyy"),'date':(transportInstance.endDate)],-1)
printHtmlPart(8)
expressionOut.print(fieldValue(bean: transportInstance, field: "student.studentName"))
printHtmlPart(9)
expressionOut.print(fieldValue(bean: transportInstance, field: "employee.staffName"))
printHtmlPart(10)
i++
}
}
printHtmlPart(11)
}
else if(true && ((params.type == "Students" && params.route.id == "all")
		            ||(params.type == "Students" && params.route.id != "all"))) {
printHtmlPart(12)
loop:{
int i = 0
for( transportInstance in (transportInstanceList) ) {
printHtmlPart(2)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(3)
expressionOut.print(fieldValue(bean: transportInstance, field: "route.routeCode"))
printHtmlPart(4)
expressionOut.print(transportInstance?.destination?.fromPlace)
printHtmlPart(5)
expressionOut.print(transportInstance?.destination?.toPlace)
printHtmlPart(6)
invokeTag('formatDate','g',84,['format':("MM-dd-yyyy"),'date':(transportInstance.startDate)],-1)
printHtmlPart(7)
invokeTag('formatDate','g',88,['format':("MM-dd-yyyy"),'date':(transportInstance.endDate)],-1)
printHtmlPart(8)
expressionOut.print(fieldValue(bean: transportInstance, field: "student.studentName"))
printHtmlPart(13)
i++
}
}
printHtmlPart(11)
}
else if(true && ((params.type == "Staff" && params.route.id == "all")
		            ||(params.type == "Staff" && params.route.id != "all"))) {
printHtmlPart(14)
loop:{
int i = 0
for( transportInstance in (transportInstanceList) ) {
printHtmlPart(2)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(3)
expressionOut.print(fieldValue(bean: transportInstance, field: "route.routeCode"))
printHtmlPart(4)
expressionOut.print(transportInstance?.destination?.fromPlace)
printHtmlPart(5)
expressionOut.print(transportInstance?.destination?.toPlace)
printHtmlPart(6)
invokeTag('formatDate','g',125,['format':("MM-dd-yyyy"),'date':(transportInstance.startDate)],-1)
printHtmlPart(7)
invokeTag('formatDate','g',129,['format':("MM-dd-yyyy"),'date':(transportInstance.endDate)],-1)
printHtmlPart(8)
expressionOut.print(fieldValue(bean: transportInstance, field: "employee.staffName"))
printHtmlPart(13)
i++
}
}
printHtmlPart(15)
}
printHtmlPart(16)
createClosureForHtmlPart(17, 1)
invokeTag('link','g',146,['class':("btn-u sm-margin-bottom-10 btn blue"),'controller':("transportReport"),'action':("tAllocationPrint"),'target':("_blank"),'params':([routeNo:params.route.id,type:params.type])],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925995656L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
