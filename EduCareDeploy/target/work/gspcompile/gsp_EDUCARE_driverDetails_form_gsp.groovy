import com.hiideals.transport.DriverDetails
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_driverDetails_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/driverDetails/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: driverDetailsInstance, field: 'vehicle', 'error'))
printHtmlPart(1)
invokeTag('message','g',10,['code':("driverDetails.vehicle.label"),'default':("Vehicle")],-1)
printHtmlPart(2)
if(true && (driverDetailsInstance?.vehicle)) {
printHtmlPart(3)
expressionOut.print(driverDetailsInstance?.vehicle?.id)
printHtmlPart(4)
expressionOut.print(driverDetailsInstance?.vehicle?.vehicleNo)
printHtmlPart(5)
}
else {
printHtmlPart(6)
}
printHtmlPart(7)
for( _it1652114818 in (vecal) ) {
changeItVariable(_it1652114818)
printHtmlPart(3)
expressionOut.print(it?.id)
printHtmlPart(4)
expressionOut.print(it?.vehicleNo)
printHtmlPart(5)
}
printHtmlPart(8)
expressionOut.print(hasErrors(bean: driverDetailsInstance, field: 'name', 'error'))
printHtmlPart(9)
invokeTag('message','g',37,['code':("driverDetails.name.label"),'default':("Name")],-1)
printHtmlPart(10)
invokeTag('textField','g',41,['name':("name"),'class':("form-control"),'id':("namedriver"),'value':(driverDetailsInstance?.name)],-1)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: driverDetailsInstance?.presentAddress?.hsno, field: 'hsno', 'error'))
printHtmlPart(9)
invokeTag('message','g',53,['code':("driverDetailsInstance?.presentAddress?.hsno.label"),'default':("Hs No")],-1)
printHtmlPart(10)
invokeTag('textField','g',57,['name':("hsno"),'class':("form-control"),'id':("hsno"),'value':(driverDetailsInstance?.presentAddress?.hsno)],-1)
printHtmlPart(12)
expressionOut.print(hasErrors(bean: driverDetailsInstance?.presentAddress?.street, field: 'street', 'error'))
printHtmlPart(9)
invokeTag('message','g',69,['code':("driverDetailsInstance?.presentAddress?.street.label"),'default':("Street")],-1)
printHtmlPart(10)
invokeTag('textField','g',73,['name':("street"),'class':("form-control"),'id':("street"),'value':(driverDetailsInstance?.presentAddress?.street)],-1)
printHtmlPart(13)
expressionOut.print(hasErrors(bean: driverDetailsInstance?.presentAddress?.city, field: 'city', 'error'))
printHtmlPart(9)
invokeTag('message','g',88,['code':("driverDetailsInstance?.presentAddress?.city.label"),'default':("City")],-1)
printHtmlPart(10)
invokeTag('textField','g',92,['name':("city"),'class':("form-control"),'id':("city"),'value':(driverDetailsInstance?.presentAddress?.city)],-1)
printHtmlPart(14)
expressionOut.print(hasErrors(bean: driverDetailsInstance?.presentAddress?.state, field: 'state', 'error'))
printHtmlPart(9)
invokeTag('message','g',104,['code':("driverDetailsInstance?.presentAddress?.state.label"),'default':("State")],-1)
printHtmlPart(10)
invokeTag('textField','g',108,['name':("state"),'class':("form-control"),'id':("state"),'value':(driverDetailsInstance?.presentAddress?.state)],-1)
printHtmlPart(15)
expressionOut.print(hasErrors(bean: driverDetailsInstance?.presentAddress?.country, field: 'country', 'error'))
printHtmlPart(9)
invokeTag('message','g',119,['code':("driverDetailsInstance?.presentAddress?.country.label"),'default':("Country")],-1)
printHtmlPart(10)
invokeTag('textField','g',123,['name':("country"),'class':("form-control"),'id':("country"),'value':(driverDetailsInstance?.presentAddress?.country)],-1)
printHtmlPart(16)
expressionOut.print(hasErrors(bean: driverDetailsInstance?.presentAddress?.phno, field: 'phno', 'error'))
printHtmlPart(9)
invokeTag('message','g',135,['code':("driverDetailsInstance?.presentAddress?.phno.label"),'default':("Ph No")],-1)
printHtmlPart(10)
invokeTag('textField','g',139,['name':("phone"),'class':("form-control"),'id':("phno"),'value':(driverDetailsInstance?.phone)],-1)
printHtmlPart(17)
expressionOut.print(hasErrors(bean: driverDetailsInstance, field: 'dob', 'error'))
printHtmlPart(18)
invokeTag('message','g',153,['code':("driverDetails.dob.label"),'default':("DoB")],-1)
printHtmlPart(19)
expressionOut.print(formatDate(format:'MM/dd/yyyy',date:driverDetailsInstance?.dob))
printHtmlPart(20)
expressionOut.print(hasErrors(bean: driverDetailsInstance, field: 'licenseNumber', 'error'))
printHtmlPart(21)
invokeTag('message','g',171,['code':("driverDetails.licenseNumber.label"),'default':("License Number")],-1)
printHtmlPart(10)
invokeTag('textField','g',175,['name':("licenseNumber"),'class':("form-control"),'id':("licenseNumber"),'value':(driverDetailsInstance?.licenseNumber)],-1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926002064L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
