import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.transport.VehicleDetails
import com.hiideals.transport.RouteDetails
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_transportReportindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/transportReport/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',16,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',16,[:],2)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',18,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',19,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',20,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',72,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',81,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',85,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',96,['template':("/header/leftSide"),'model':([activ:[TransportManagement:'start active open',TransportFeer:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',112,['action':("create"),'controller':("student")],2)
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(12)
for( veh in (com.hiideals.transport.VehicleDetails.list()) ) {
printHtmlPart(13)
expressionOut.print(veh?.vehicleNo)
printHtmlPart(14)
expressionOut.print(veh?.vehicleNo)
printHtmlPart(15)
}
printHtmlPart(16)
invokeTag('submitButton','g',176,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(17)
})
invokeTag('formRemote','g',179,['name':("ss"),'url':([action:'availableVehicles']),'update':("Changedisplay")],2)
printHtmlPart(18)
createTagBody(2, {->
printHtmlPart(19)
for( driver in (com.hiideals.transport.DriverDetails.list()) ) {
printHtmlPart(13)
expressionOut.print(driver?.name)
printHtmlPart(14)
expressionOut.print(driver?.name)
printHtmlPart(15)
}
printHtmlPart(16)
invokeTag('submitButton','g',200,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(20)
})
invokeTag('formRemote','g',204,['name':("ss"),'url':([action:'availableDrivers']),'update':("Changedisplay")],2)
printHtmlPart(21)
createTagBody(2, {->
printHtmlPart(22)
for( route in (com.hiideals.transport.RouteDetails.list()) ) {
printHtmlPart(13)
expressionOut.print(route?.routeCode)
printHtmlPart(14)
expressionOut.print(route?.routeCode)
printHtmlPart(15)
}
printHtmlPart(23)
invokeTag('submitButton','g',226,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(17)
})
invokeTag('formRemote','g',229,['name':("ss"),'url':([action:'availableRoutes']),'update':("Changedisplay")],2)
printHtmlPart(24)
createTagBody(2, {->
printHtmlPart(25)
for( route in (com.hiideals.transport.RouteDetails.list()) ) {
printHtmlPart(13)
expressionOut.print(route?.routeCode)
printHtmlPart(14)
expressionOut.print(route?.routeCode)
printHtmlPart(15)
}
printHtmlPart(26)
invokeTag('submitButton','g',265,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(20)
})
invokeTag('formRemote','g',269,['name':("sscast"),'url':([action:'transportAllocation']),'update':("Changedisplay")],2)
printHtmlPart(27)
createTagBody(2, {->
printHtmlPart(28)
for( batch in (batchList) ) {
printHtmlPart(13)
expressionOut.print(batch.id)
printHtmlPart(14)
expressionOut.print(batch.batchName)
printHtmlPart(15)
}
printHtmlPart(29)
invokeTag('submitButton','g',313,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(17)
})
invokeTag('formRemote','g',316,['name':("kk"),'url':([action:'transportFeedetails']),'update':("Changedisplay")],2)
printHtmlPart(30)
invokeTag('render','g',333,['template':("/footer/footer")],-1)
printHtmlPart(31)
})
invokeTag('captureBody','sitemesh',508,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(32)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925995595L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
