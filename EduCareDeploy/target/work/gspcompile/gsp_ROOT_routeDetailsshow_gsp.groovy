import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.institute.staff.Staff
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_routeDetailsshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/routeDetails/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',15,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',15,[:],2)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',18,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',19,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',44,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',52,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',56,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',66,['template':("/header/leftSide"),'model':([activ:[TransportManagement:'start active open',RouteDetails:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
invokeTag('message','g',83,['code':("default.home.label")],-1)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',85,['class':("list"),'action':("index")],2)
printHtmlPart(12)
createClosureForHtmlPart(13, 2)
invokeTag('link','g',87,['class':("create"),'action':("create")],2)
printHtmlPart(14)
if(true && (routeDetailsInstance?.vehicle)) {
printHtmlPart(15)
invokeTag('message','g',103,['code':("routeDetails.vehicle.label"),'default':("Vehicle")],-1)
printHtmlPart(16)
expressionOut.print(routeDetailsInstance?.vehicle?.vehicleNo)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (routeDetailsInstance?.routeCode)) {
printHtmlPart(19)
invokeTag('message','g',117,['code':("routeDetails.routeCode.label"),'default':("Route Code")],-1)
printHtmlPart(20)
invokeTag('fieldValue','g',121,['bean':(routeDetailsInstance),'field':("routeCode")],-1)
printHtmlPart(21)
}
printHtmlPart(18)
if(true && (routeDetailsInstance?.startPlace)) {
printHtmlPart(22)
invokeTag('message','g',130,['code':("routeDetails.startPlace.label"),'default':("Start Place")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',134,['bean':(routeDetailsInstance),'field':("startPlace")],-1)
printHtmlPart(24)
}
printHtmlPart(18)
if(true && (routeDetailsInstance?.stopPlace)) {
printHtmlPart(25)
invokeTag('message','g',141,['code':("routeDetails.stopPlace.label"),'default':("Stop Place")],-1)
printHtmlPart(26)
invokeTag('fieldValue','g',145,['bean':(routeDetailsInstance),'field':("stopPlace")],-1)
printHtmlPart(24)
}
printHtmlPart(27)
createTagBody(2, {->
printHtmlPart(28)
createTagBody(3, {->
printHtmlPart(29)
invokeTag('message','g',157,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(30)
})
invokeTag('link','g',158,['class':("btn yellow"),'action':("edit"),'id':(LookUpED.encod(routeDetailsInstance.id))],3)
printHtmlPart(31)
})
invokeTag('form','g',159,['url':([resource:routeDetailsInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(32)
invokeTag('render','g',161,['template':("/footer/footer")],-1)
printHtmlPart(33)
})
invokeTag('captureBody','sitemesh',198,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(34)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926003641L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
