import com.hiideals.transport.Transport
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_transport_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/transport/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: transportInstance, field: 'route', 'error'))
printHtmlPart(1)
invokeTag('message','g',10,['code':("transport.route.label"),'default':("Route")],-1)
printHtmlPart(2)
if(true && (transportInstance?.route)) {
printHtmlPart(3)
expressionOut.print(transportInstance?.route?.id)
printHtmlPart(4)
expressionOut.print(transportInstance?.route?.startPlace)
printHtmlPart(5)
expressionOut.print(transportInstance?.route?.stopPlace)
printHtmlPart(6)
expressionOut.print(transportInstance?.route?.routeCode)
printHtmlPart(7)
}
else {
printHtmlPart(8)
}
printHtmlPart(9)
for( _it443006437 in (rut) ) {
changeItVariable(_it443006437)
printHtmlPart(3)
expressionOut.print(it?.id)
printHtmlPart(10)
expressionOut.print(it?.startPlace)
printHtmlPart(5)
expressionOut.print(it?.stopPlace)
printHtmlPart(6)
expressionOut.print(it?.routeCode)
printHtmlPart(7)
}
printHtmlPart(11)
expressionOut.print(hasErrors(bean: transportInstance, field: 'destination', 'error'))
printHtmlPart(12)
invokeTag('message','g',41,['code':("transport.destination.label"),'default':("Destination")],-1)
printHtmlPart(13)
if(true && (transportInstance?.destination)) {
printHtmlPart(3)
expressionOut.print(transportInstance?.destination?.id)
printHtmlPart(4)
expressionOut.print(transportInstance?.destination?.fromPlace)
printHtmlPart(5)
expressionOut.print(transportInstance?.destination?.toPlace)
printHtmlPart(14)
expressionOut.print(transportInstance?.destination?.acdemicyear?.batchName)
printHtmlPart(7)
}
else {
printHtmlPart(15)
}
printHtmlPart(16)
for( _it1550093880 in (dst) ) {
changeItVariable(_it1550093880)
printHtmlPart(3)
expressionOut.print(it?.id)
printHtmlPart(10)
expressionOut.print(it?.fromPlace)
printHtmlPart(5)
expressionOut.print(it?.toPlace)
printHtmlPart(14)
expressionOut.print(it?.acdemicyear?.batchName)
printHtmlPart(7)
}
printHtmlPart(17)
expressionOut.print(hasErrors(bean: transportInstance, field: 'startDate', 'error'))
printHtmlPart(18)
invokeTag('message','g',73,['code':("transport.startDate.label"),'default':("Start Date")],-1)
printHtmlPart(19)
expressionOut.print(formatDate(format:'MM/dd/yyyy',date:transportInstance?.startDate))
printHtmlPart(20)
expressionOut.print(hasErrors(bean: transportInstance, field: 'endDate', 'error'))
printHtmlPart(21)
invokeTag('message','g',91,['code':("transport.endDate.label"),'default':("End Date")],-1)
printHtmlPart(22)
expressionOut.print(formatDate(format:'MM/dd/yyyy',date:transportInstance?.endDate))
printHtmlPart(23)
expressionOut.print(hasErrors(bean: transportInstance, field: 'type', 'error'))
printHtmlPart(24)
invokeTag('message','g',111,['code':("transport.type.label"),'default':("Type")],-1)
printHtmlPart(25)
for( _it1808324797 in (transportInstance.constraints.type.inList) ) {
changeItVariable(_it1808324797)
printHtmlPart(3)
expressionOut.print(it)
printHtmlPart(26)
expressionOut.print(it)
printHtmlPart(7)
}
printHtmlPart(27)
expressionOut.print(hasErrors(bean: transportInstance, field: 'student', 'error'))
printHtmlPart(28)
invokeTag('message','g',131,['code':("transport.student.label"),'default':("Classes")],-1)
printHtmlPart(29)
expressionOut.print(remoteFunction(
			          controller: 'transport', 
			          action: 'getSections',
					  update:'sec',
			          params: "\'value=\' + this.value"))
printHtmlPart(30)
for( _it962339310 in (classes) ) {
changeItVariable(_it962339310)
printHtmlPart(31)
expressionOut.print(it?.id)
printHtmlPart(32)
expressionOut.print(it?.classname)
printHtmlPart(33)
}
printHtmlPart(34)
invokeTag('render','g',152,['template':("sections")],-1)
printHtmlPart(35)
invokeTag('render','g',155,['template':("students")],-1)
printHtmlPart(36)
expressionOut.print(hasErrors(bean: transportInstance, field: 'employee', 'error'))
printHtmlPart(37)
invokeTag('message','g',168,['code':("transport.employee.label"),'default':("Employee")],-1)
printHtmlPart(38)
for( _it510868405 in (com.hiideals.institute.staff.Staff.list()) ) {
changeItVariable(_it510868405)
printHtmlPart(31)
expressionOut.print(it?.id)
printHtmlPart(32)
expressionOut.print(it?.staffName)
printHtmlPart(33)
}
printHtmlPart(39)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926011882L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
