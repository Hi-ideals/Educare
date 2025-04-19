import com.hiideals.transport.VehicleDetails
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_vehicleDetails_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/vehicleDetails/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: vehicleDetailsInstance, field: 'vehicleNo', 'error'))
printHtmlPart(1)
invokeTag('message','g',11,['code':("vehicleDetails.vehicleNo.label"),'default':("Vehicle No")],-1)
printHtmlPart(2)
invokeTag('textField','g',16,['name':("vehicleNo"),'class':("form-control"),'required':("required"),'id':("vehicleNo"),'value':(vehicleDetailsInstance?.vehicleNo)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: vehicleDetailsInstance, field: 'noOfSeats', 'error'))
printHtmlPart(4)
invokeTag('message','g',25,['code':("vehicleDetails.noOfSeats.label"),'default':("No Of Seats")],-1)
printHtmlPart(2)
invokeTag('textField','g',29,['name':("noOfSeats"),'class':("form-control"),'id':("noOfSeats"),'value':(vehicleDetailsInstance?.noOfSeats)],-1)
printHtmlPart(5)
expressionOut.print(hasErrors(bean: vehicleDetailsInstance, field: 'maxiumAllowed', 'error'))
printHtmlPart(6)
invokeTag('message','g',41,['code':("vehicleDetails.maxiumAllowed.label"),'default':("Maxium Allowed")],-1)
printHtmlPart(2)
invokeTag('textField','g',46,['name':("maxiumAllowed"),'class':("form-control"),'required':("required"),'id':("maxiumAllowed"),'value':(vehicleDetailsInstance?.maxiumAllowed)],-1)
printHtmlPart(7)
expressionOut.print(hasErrors(bean: vehicleDetailsInstance, field: 'vehicleType', 'error'))
printHtmlPart(8)
invokeTag('message','g',59,['code':("vehicleDetails.vehicleType.label"),'default':("Vehicle Type")],-1)
printHtmlPart(2)
invokeTag('textField','g',64,['name':("vehicleType"),'class':("form-control"),'required':("required"),'id':("vehicleType"),'value':(vehicleDetailsInstance?.vehicleType)],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: vehicleDetailsInstance, field: 'contactPerson', 'error'))
printHtmlPart(10)
invokeTag('message','g',78,['code':("vehicleDetails.contactPerson.label"),'default':("Contact Person")],-1)
printHtmlPart(2)
invokeTag('textField','g',83,['name':("contactPerson"),'class':("form-control"),'required':("required"),'id':("contactPerson"),'value':(vehicleDetailsInstance?.contactPerson)],-1)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: vehicleDetailsInstance, field: 'insuranceRenewalDate', 'error'))
printHtmlPart(12)
invokeTag('message','g',94,['code':("vehicleDetails.insuranceRenewalDate.label"),'default':("Insurance Renewal Date")],-1)
printHtmlPart(13)
expressionOut.print(formatDate(format:'MM/dd/yyyy',date:vehicleDetailsInstance?.insuranceRenewalDate))
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926019579L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
