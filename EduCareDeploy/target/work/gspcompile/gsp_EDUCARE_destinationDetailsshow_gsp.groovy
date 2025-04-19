import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.institute.staff.Staff
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_destinationDetailsshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/destinationDetails/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',16,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',16,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',18,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',19,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',20,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',45,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',50,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',53,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',61,['template':("/header/leftSide"),'model':([activ:[TransportManagement:'start active open',DestinationDetails:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
invokeTag('message','g',72,['code':("default.home.label")],-1)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',74,['class':("list"),'action':("index")],2)
printHtmlPart(12)
createClosureForHtmlPart(13, 2)
invokeTag('link','g',76,['class':("create"),'action':("create")],2)
printHtmlPart(14)
if(true && (destinationDetailsInstance?.subscriptionType)) {
printHtmlPart(15)
invokeTag('message','g',93,['code':("destinationDetails.subscriptionType.label"),'default':("SubscriptionType")],-1)
printHtmlPart(16)
invokeTag('fieldValue','g',98,['bean':(destinationDetailsInstance),'field':("subscriptionType")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (destinationDetailsInstance?.route)) {
printHtmlPart(19)
invokeTag('message','g',105,['code':("destinationDetails.route.label"),'default':("Route")],-1)
printHtmlPart(20)
expressionOut.print(destinationDetailsInstance?.route?.vehicle?.vehicleNo)
printHtmlPart(21)
expressionOut.print(destinationDetailsInstance?.route?.routeCode)
printHtmlPart(22)
expressionOut.print(destinationDetailsInstance?.route?.startPlace)
printHtmlPart(21)
expressionOut.print(destinationDetailsInstance?.route?.stopPlace)
printHtmlPart(23)
}
printHtmlPart(18)
if(true && (destinationDetailsInstance?.fromPlace)) {
printHtmlPart(24)
invokeTag('message','g',118,['code':("destinationDetails.fromPlace.label"),'default':("From Place")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',122,['bean':(destinationDetailsInstance),'field':("fromPlace")],-1)
printHtmlPart(26)
}
printHtmlPart(18)
if(true && (destinationDetailsInstance?.toPlace)) {
printHtmlPart(27)
invokeTag('message','g',131,['code':("destinationDetails.toPlace.label"),'default':("To Place")],-1)
printHtmlPart(28)
invokeTag('fieldValue','g',135,['bean':(destinationDetailsInstance),'field':("toPlace")],-1)
printHtmlPart(26)
}
printHtmlPart(18)
if(true && (destinationDetailsInstance?.stopTime)) {
printHtmlPart(29)
invokeTag('message','g',144,['code':("destinationDetails.stopTime.label"),'default':("Stop Time")],-1)
printHtmlPart(30)
invokeTag('fieldValue','g',148,['bean':(destinationDetailsInstance),'field':("stopTime")],-1)
printHtmlPart(31)
}
printHtmlPart(32)
if(true && (destinationDetailsInstance?.amount)) {
printHtmlPart(33)
invokeTag('message','g',157,['code':("destinationDetails.amount.label"),'default':("Amount")],-1)
printHtmlPart(34)
invokeTag('fieldValue','g',162,['bean':(destinationDetailsInstance),'field':("amount")],-1)
printHtmlPart(31)
}
printHtmlPart(35)
createTagBody(2, {->
printHtmlPart(36)
createTagBody(3, {->
printHtmlPart(37)
invokeTag('message','g',176,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(21)
})
invokeTag('link','g',177,['class':("btn yellow"),'action':("edit"),'id':(LookUpED.encod(destinationDetailsInstance.id))],3)
printHtmlPart(38)
})
invokeTag('form','g',178,['url':([resource:destinationDetailsInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(39)
invokeTag('render','g',180,['template':("/footer/footer")],-1)
printHtmlPart(40)
})
invokeTag('captureBody','sitemesh',229,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(41)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925992842L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
