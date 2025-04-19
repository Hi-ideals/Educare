import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.institute.staff.Staff
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_vehicleDetailsshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/vehicleDetails/show.gsp" }
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
invokeTag('render','g',72,['template':("/header/leftSide"),'model':([activ:[TransportManagement:'start active open',AddVechile:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
invokeTag('message','g',89,['code':("default.home.label")],-1)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',91,['class':("list"),'action':("index")],2)
printHtmlPart(12)
createClosureForHtmlPart(13, 2)
invokeTag('link','g',93,['class':("create"),'action':("create")],2)
printHtmlPart(14)
if(true && (vehicleDetailsInstance?.vehicleNo)) {
printHtmlPart(15)
invokeTag('message','g',111,['code':("vehicleDetails.vehicleNo.label"),'default':("Vehicle No")],-1)
printHtmlPart(16)
invokeTag('fieldValue','g',115,['bean':(vehicleDetailsInstance),'field':("vehicleNo")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (vehicleDetailsInstance?.noOfSeats)) {
printHtmlPart(19)
invokeTag('message','g',124,['code':("vehicleDetails.noOfSeats.label"),'default':("No Of Seats")],-1)
printHtmlPart(20)
invokeTag('fieldValue','g',128,['bean':(vehicleDetailsInstance),'field':("noOfSeats")],-1)
printHtmlPart(17)
}
printHtmlPart(21)
if(true && (vehicleDetailsInstance?.maxiumAllowed)) {
printHtmlPart(22)
invokeTag('message','g',139,['code':("vehicleDetails.maxiumAllowed.label"),'default':("Maxium Allowed")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',143,['bean':(vehicleDetailsInstance),'field':("maxiumAllowed")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (vehicleDetailsInstance?.vehicleType)) {
printHtmlPart(24)
invokeTag('message','g',152,['code':("vehicleDetails.vehicleType.label"),'default':("Vehicle Type")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',156,['bean':(vehicleDetailsInstance),'field':("vehicleType")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (vehicleDetailsInstance?.contactPerson)) {
printHtmlPart(26)
invokeTag('message','g',166,['code':("vehicleDetails.contactPerson.label"),'default':("ContactPerson")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',170,['bean':(vehicleDetailsInstance),'field':("contactPerson")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (vehicleDetailsInstance?.insuranceRenewalDate)) {
printHtmlPart(28)
invokeTag('message','g',180,['code':("vehicleDetails.insuranceRenewalDate.label"),'default':("InsuranceRenewalDate")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',185,['bean':(vehicleDetailsInstance),'field':("insuranceRenewalDate")],-1)
printHtmlPart(17)
}
printHtmlPart(30)
createTagBody(2, {->
printHtmlPart(31)
createTagBody(3, {->
printHtmlPart(32)
invokeTag('message','g',200,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(33)
})
invokeTag('link','g',201,['class':("btn yellow"),'action':("edit"),'id':(LookUpED.encod(vehicleDetailsInstance.id))],3)
printHtmlPart(34)
})
invokeTag('form','g',203,['url':([resource:vehicleDetailsInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(35)
invokeTag('render','g',205,['template':("/footer/footer")],-1)
printHtmlPart(36)
})
invokeTag('captureBody','sitemesh',253,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(37)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926019632L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
