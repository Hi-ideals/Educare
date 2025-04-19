import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_transportReport_transportFees_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/transportReport/_transportFees.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
if(true && (params?.type == "student")) {
printHtmlPart(1)
printHtmlPart(2)
printHtmlPart(2)
loop:{
int i = 0
for( transportFeeInstance in (transportFeeInstanceList) ) {
printHtmlPart(3)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(4)
expressionOut.print(transportFeeInstance.transport.destination.fromPlace)
printHtmlPart(5)
expressionOut.print(transportFeeInstance.transport.destination.toPlace)
printHtmlPart(6)
expressionOut.print(fieldValue(bean: transportFeeInstance, field: "paymentId"))
printHtmlPart(7)
invokeTag('formatDate','g',43,['date':(transportFeeInstance.paymentDate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(8)
expressionOut.print(fieldValue(bean: transportFeeInstance, field: "paidAmount"))
printHtmlPart(9)
expressionOut.print(fieldValue(bean: transportFeeInstance, field: "remainingAmount"))
printHtmlPart(10)
expressionOut.print(fieldValue(bean: transportFeeInstance, field: "student.studentName"))
printHtmlPart(11)
if(true && (transportFeeInstance?.student)) {
printHtmlPart(12)
expressionOut.print(transportFeeInstance?.student?.academicyear[0]?.presentclass.classname)
printHtmlPart(10)
expressionOut.print(transportFeeInstance?.student?.academicyear[0]?.section?.sectionName)
printHtmlPart(13)
}
else {
printHtmlPart(14)
}
printHtmlPart(15)
i++
}
}
printHtmlPart(16)
}
else if(true && (params?.type == "staff")) {
printHtmlPart(17)
printHtmlPart(2)
printHtmlPart(2)
loop:{
int i = 0
for( transportFeeInstance in (transportFeeInstanceList) ) {
printHtmlPart(3)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(4)
expressionOut.print(transportFeeInstance.transport.destination.fromPlace)
printHtmlPart(5)
expressionOut.print(transportFeeInstance.transport.destination.toPlace)
printHtmlPart(6)
expressionOut.print(fieldValue(bean: transportFeeInstance, field: "paymentId"))
printHtmlPart(7)
invokeTag('formatDate','g',108,['date':(transportFeeInstance.paymentDate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(8)
expressionOut.print(fieldValue(bean: transportFeeInstance, field: "paidAmount"))
printHtmlPart(9)
expressionOut.print(fieldValue(bean: transportFeeInstance, field: "remainingAmount"))
printHtmlPart(10)
expressionOut.print(fieldValue(bean: transportFeeInstance, field: "employee.staffName"))
printHtmlPart(18)
i++
}
}
printHtmlPart(16)
}
printHtmlPart(19)
createClosureForHtmlPart(20, 1)
invokeTag('link','g',131,['class':("btn-u sm-margin-bottom-10 btn blue"),'controller':("transportReport"),'action':("transportFeedetailsPrint"),'target':("_blank"),'params':([type:params.type,name:params.Name,academicyear:params.academicyear])],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925995471L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
