import com.hiideals.transport.RouteDetails
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_routeDetails_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/routeDetails/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: routeDetailsInstance, field: 'vehicle', 'error'))
printHtmlPart(1)
invokeTag('message','g',8,['code':("routeDetails.vehicle.label"),'default':("Vehicle")],-1)
printHtmlPart(2)
if(true && (routeDetailsInstance?.vehicle)) {
printHtmlPart(3)
expressionOut.print(routeDetailsInstance?.vehicle?.id)
printHtmlPart(4)
expressionOut.print(routeDetailsInstance?.vehicle?.vehicleNo)
printHtmlPart(5)
}
else {
printHtmlPart(6)
}
printHtmlPart(7)
for( _it1212147770 in (vecal) ) {
changeItVariable(_it1212147770)
printHtmlPart(3)
expressionOut.print(it?.id)
printHtmlPart(4)
expressionOut.print(it?.vehicleNo)
printHtmlPart(5)
}
printHtmlPart(8)
expressionOut.print(hasErrors(bean: routeDetailsInstance, field: 'routeCode', 'error'))
printHtmlPart(9)
invokeTag('message','g',33,['code':("routeDetails.routeCode.label"),'default':("Route Code")],-1)
printHtmlPart(10)
invokeTag('textField','g',37,['name':("routeCode"),'class':("form-control"),'id':("routeCode"),'value':(routeDetailsInstance?.routeCode)],-1)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: routeDetailsInstance, field: 'startPlace', 'error'))
printHtmlPart(12)
invokeTag('message','g',47,['code':("routeDetails.startPlace.label"),'default':("Start Place")],-1)
printHtmlPart(10)
invokeTag('textField','g',51,['name':("startPlace"),'class':("form-control"),'id':("startPlace"),'value':(routeDetailsInstance?.startPlace)],-1)
printHtmlPart(13)
expressionOut.print(hasErrors(bean: routeDetailsInstance, field: 'stopPlace', 'error'))
printHtmlPart(14)
invokeTag('message','g',61,['code':("routeDetails.stopPlace.label"),'default':("Stop Place")],-1)
printHtmlPart(10)
invokeTag('textField','g',65,['name':("stopPlace"),'class':("form-control"),'id':("stopPlace"),'value':(routeDetailsInstance?.stopPlace)],-1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926003646L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
