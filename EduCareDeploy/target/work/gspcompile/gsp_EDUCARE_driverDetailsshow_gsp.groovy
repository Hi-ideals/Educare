import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.institute.staff.Staff
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_driverDetailsshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/driverDetails/show.gsp" }
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
createClosureForHtmlPart(2, 3)
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
invokeTag('captureHead','sitemesh',48,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',57,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',61,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',72,['template':("/header/leftSide"),'model':([activ:[TransportManagement:'start active open',DriverDetails:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
invokeTag('message','g',90,['code':("default.home.label")],-1)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',92,['class':("list"),'action':("index")],2)
printHtmlPart(12)
createClosureForHtmlPart(13, 2)
invokeTag('link','g',94,['class':("create"),'action':("create")],2)
printHtmlPart(14)
if(true && (driverDetailsInstance?.vehicle)) {
printHtmlPart(15)
invokeTag('message','g',111,['code':("driverDetails.vehicle.label"),'default':("Vehicle")],-1)
printHtmlPart(16)
createTagBody(3, {->
printHtmlPart(17)
expressionOut.print(driverDetailsInstance?.vehicle?.vehicleNo)
printHtmlPart(18)
})
invokeTag('link','g',119,['controller':("vehicleDetails"),'action':("show"),'id':(driverDetailsInstance?.vehicle?.id)],3)
printHtmlPart(19)
}
printHtmlPart(20)
if(true && (driverDetailsInstance?.name)) {
printHtmlPart(21)
invokeTag('message','g',127,['code':("driverDetails.name.label"),'default':("Name")],-1)
printHtmlPart(22)
invokeTag('fieldValue','g',131,['bean':(driverDetailsInstance),'field':("name")],-1)
printHtmlPart(23)
}
printHtmlPart(20)
if(true && (driverDetailsInstance?.presentAddress)) {
printHtmlPart(24)
invokeTag('message','g',139,['code':("driverDetails.presentAddress.label"),'default':("Present Address")],-1)
printHtmlPart(25)
expressionOut.print(driverDetailsInstance?.presentAddress?.hsno)
printHtmlPart(26)
expressionOut.print(driverDetailsInstance?.presentAddress?.street)
printHtmlPart(27)
expressionOut.print(driverDetailsInstance?.presentAddress?.city)
printHtmlPart(17)
expressionOut.print(driverDetailsInstance?.presentAddress?.state)
printHtmlPart(27)
expressionOut.print(driverDetailsInstance?.presentAddress?.country)
printHtmlPart(17)
expressionOut.print(driverDetailsInstance?.presentAddress?.mobileNumber)
printHtmlPart(28)
}
printHtmlPart(20)
if(true && (driverDetailsInstance?.permanentAddress)) {
printHtmlPart(29)
invokeTag('message','g',157,['code':("driverDetails.permanentAddress.label"),'default':("Permanent Address")],-1)
printHtmlPart(30)
createTagBody(3, {->
printHtmlPart(17)
expressionOut.print(driverDetailsInstance?.permanentAddress?.encodeAsHTML())
printHtmlPart(18)
})
invokeTag('link','g',164,['controller':("address"),'action':("show"),'id':(driverDetailsInstance?.permanentAddress?.id)],3)
printHtmlPart(31)
}
printHtmlPart(32)
if(true && (driverDetailsInstance?.dob)) {
printHtmlPart(33)
invokeTag('message','g',172,['code':("driverDetails.dob.label"),'default':("Dob")],-1)
printHtmlPart(34)
invokeTag('formatDate','g',177,['date':(driverDetailsInstance?.dob),'format':("dd-MMM-yyyy")],-1)
printHtmlPart(35)
}
printHtmlPart(20)
if(true && (driverDetailsInstance?.phone)) {
printHtmlPart(36)
invokeTag('message','g',183,['code':("driverDetails.phone.label"),'default':("Phone")],-1)
printHtmlPart(37)
invokeTag('fieldValue','g',187,['bean':(driverDetailsInstance),'field':("phone")],-1)
printHtmlPart(31)
}
printHtmlPart(20)
if(true && (driverDetailsInstance?.licenseNumber)) {
printHtmlPart(38)
invokeTag('message','g',196,['code':("driverDetails.licenseNumber.label"),'default':("License Number")],-1)
printHtmlPart(39)
invokeTag('fieldValue','g',200,['bean':(driverDetailsInstance),'field':("licenseNumber")],-1)
printHtmlPart(40)
}
printHtmlPart(41)
createTagBody(2, {->
printHtmlPart(42)
createTagBody(3, {->
printHtmlPart(17)
invokeTag('message','g',215,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(18)
})
invokeTag('link','g',216,['class':("btn yellow"),'action':("edit"),'id':(LookUpED.encod(driverDetailsInstance.id))],3)
printHtmlPart(43)
invokeTag('actionSubmit','g',220,['class':("btn red"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(44)
})
invokeTag('form','g',222,['url':([resource:driverDetailsInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(45)
invokeTag('render','g',236,['template':("/footer/footer")],-1)
printHtmlPart(46)
})
invokeTag('captureBody','sitemesh',259,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(47)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926002042L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
