import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.institute.staff.Staff
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_transportshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/transport/show.gsp" }
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
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',51,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',54,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',62,['template':("/header/leftSide"),'model':([activ:[TransportManagement:'start active open',Transport:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
invokeTag('message','g',73,['code':("default.home.label")],-1)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',75,['class':("list"),'action':("index")],2)
printHtmlPart(12)
createClosureForHtmlPart(13, 2)
invokeTag('link','g',77,['class':("create"),'action':("create")],2)
printHtmlPart(14)
if(true && (transportInstance?.route)) {
printHtmlPart(15)
invokeTag('message','g',92,['code':("transport.route.label"),'default':("Route")],-1)
printHtmlPart(16)
createTagBody(3, {->
printHtmlPart(17)
expressionOut.print(transportInstance?.route?.vehicle?.vehicleNo)
printHtmlPart(17)
expressionOut.print(transportInstance?.route?.routeCode)
printHtmlPart(17)
expressionOut.print(transportInstance?.route?.startPlace)
printHtmlPart(17)
expressionOut.print(transportInstance?.route?.stopPlace)
printHtmlPart(18)
})
invokeTag('link','g',102,['controller':("routeDetails"),'action':("show"),'id':(transportInstance?.route?.id)],3)
printHtmlPart(19)
}
printHtmlPart(20)
if(true && (transportInstance?.destination)) {
printHtmlPart(21)
invokeTag('message','g',108,['code':("transport.destination.label"),'default':("Destination")],-1)
printHtmlPart(22)
expressionOut.print(transportInstance?.destination?.fromPlace)
printHtmlPart(18)
expressionOut.print(transportInstance?.destination?.toPlace)
printHtmlPart(23)
expressionOut.print(transportInstance?.destination?.stopTime)
printHtmlPart(24)
}
printHtmlPart(20)
if(true && (transportInstance?.type)) {
printHtmlPart(25)
invokeTag('message','g',120,['code':("transport.type.label"),'default':("Type")],-1)
printHtmlPart(26)
invokeTag('fieldValue','g',124,['bean':(transportInstance),'field':("type")],-1)
printHtmlPart(19)
}
printHtmlPart(20)
if(true && (transportInstance?.startDate)) {
printHtmlPart(27)
invokeTag('message','g',130,['code':("transport.startDate.label"),'default':("Start Date")],-1)
printHtmlPart(28)
invokeTag('formatDate','g',134,['date':(transportInstance?.startDate)],-1)
printHtmlPart(19)
}
printHtmlPart(20)
if(true && (transportInstance?.endDate)) {
printHtmlPart(29)
invokeTag('message','g',140,['code':("transport.endDate.label"),'default':("End Date")],-1)
printHtmlPart(30)
invokeTag('formatDate','g',144,['date':(transportInstance?.endDate)],-1)
printHtmlPart(19)
}
printHtmlPart(20)
if(true && (transportInstance?.student)) {
printHtmlPart(31)
invokeTag('message','g',150,['code':("transport.student.label"),'default':("Student")],-1)
printHtmlPart(32)
expressionOut.print(transportInstance?.student?.studentName)
printHtmlPart(33)
}
printHtmlPart(20)
if(true && (transportInstance?.employee)) {
printHtmlPart(34)
invokeTag('message','g',161,['code':("transport.employee.label"),'default':("Employee")],-1)
printHtmlPart(35)
expressionOut.print(transportInstance?.employee?.encodeAsHTML())
printHtmlPart(24)
}
printHtmlPart(36)
createTagBody(2, {->
printHtmlPart(37)
createTagBody(3, {->
printHtmlPart(17)
invokeTag('message','g',178,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(18)
})
invokeTag('link','g',179,['class':("edit"),'action':("edit"),'id':(LookUpED.encod(transportInstance.id))],3)
printHtmlPart(38)
invokeTag('actionSubmit','g',183,['class':("delete btn blue"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(39)
})
invokeTag('form','g',185,['url':([resource:transportInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(40)
invokeTag('render','g',199,['template':("/footer/footer")],-1)
printHtmlPart(41)
})
invokeTag('captureBody','sitemesh',237,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(42)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926011731L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
