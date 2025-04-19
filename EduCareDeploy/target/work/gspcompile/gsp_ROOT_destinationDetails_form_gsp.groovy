import com.hiideals.transport.DestinationDetails
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_destinationDetails_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/destinationDetails/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: destinationDetailsInstance, field: 'subscriptionType', 'error'))
printHtmlPart(1)
invokeTag('message','g',10,['code':("destinationDetails.subscriptionType.label"),'default':("Subscription Type")],-1)
printHtmlPart(2)
invokeTag('select','g',15,['name':("subscriptionType"),'class':("form-control"),'from':(destinationDetailsInstance.constraints.subscriptionType.inList),'required':(""),'value':(destinationDetailsInstance?.subscriptionType),'valueMessagePrefix':("destinationDetails.subscriptionType")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: destinationDetailsInstance, field: 'route', 'error'))
printHtmlPart(4)
invokeTag('message','g',23,['code':("destinationDetails.route.label"),'default':("Route")],-1)
printHtmlPart(5)
if(true && (destinationDetailsInstance?.route)) {
printHtmlPart(6)
expressionOut.print(destinationDetailsInstance?.route?.id)
printHtmlPart(7)
expressionOut.print(destinationDetailsInstance?.route?.startPlace)
printHtmlPart(8)
expressionOut.print(destinationDetailsInstance?.route?.stopPlace)
printHtmlPart(9)
expressionOut.print(destinationDetailsInstance?.route?.routeCode)
printHtmlPart(10)
}
else {
printHtmlPart(11)
}
printHtmlPart(12)
for( _it429018901 in (rut) ) {
changeItVariable(_it429018901)
printHtmlPart(6)
expressionOut.print(it?.id)
printHtmlPart(13)
expressionOut.print(it?.startPlace)
printHtmlPart(8)
expressionOut.print(it?.stopPlace)
printHtmlPart(9)
expressionOut.print(it?.routeCode)
printHtmlPart(10)
}
printHtmlPart(14)
expressionOut.print(hasErrors(bean: destinationDetailsInstance, field: 'fromPlace', 'error'))
printHtmlPart(15)
invokeTag('message','g',54,['code':("destinationDetails.fromPlace.label"),'default':("From Place")],-1)
printHtmlPart(16)
invokeTag('textField','g',58,['name':("fromPlace"),'class':("form-control"),'id':("fromPlace"),'value':(destinationDetailsInstance?.fromPlace)],-1)
printHtmlPart(17)
expressionOut.print(hasErrors(bean: destinationDetailsInstance, field: 'toPlace', 'error'))
printHtmlPart(18)
invokeTag('message','g',67,['code':("destinationDetails.toPlace.label"),'default':("To Place")],-1)
printHtmlPart(16)
invokeTag('textField','g',71,['name':("toPlace"),'class':("form-control"),'id':("toPlace"),'value':(destinationDetailsInstance?.toPlace)],-1)
printHtmlPart(19)
expressionOut.print(hasErrors(bean: destinationDetailsInstance, field: 'stopTime', 'error'))
printHtmlPart(20)
invokeTag('message','g',84,['code':("destinationDetails.stopTime.label"),'default':("Stop Time")],-1)
printHtmlPart(16)
invokeTag('textField','g',88,['name':("stopTime"),'class':("form-control"),'id':("stopTime"),'value':(destinationDetailsInstance?.stopTime)],-1)
printHtmlPart(21)
for( batch in (batchList) ) {
printHtmlPart(22)
expressionOut.print(batch.id)
printHtmlPart(23)
expressionOut.print(batch.batchName)
printHtmlPart(24)
}
printHtmlPart(25)
expressionOut.print(hasErrors(bean: destinationDetailsInstance, field: 'amount', 'error'))
printHtmlPart(26)
invokeTag('message','g',110,['code':("destinationDetails.amount.label"),'default':("Amount")],-1)
printHtmlPart(27)
invokeTag('field','g',115,['name':("amount"),'class':("form-control"),'id':("amount"),'value':(fieldValue(bean: destinationDetailsInstance, field: 'amount')),'required':("")],-1)
printHtmlPart(28)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925992743L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
