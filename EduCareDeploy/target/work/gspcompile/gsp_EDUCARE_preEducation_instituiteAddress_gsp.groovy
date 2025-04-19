import com.hiideals.instituite.helper.Address
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_preEducation_instituiteAddress_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/preEducation/_instituiteAddress.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: schoolAddressInstance, field: 'hsno', 'error'))
printHtmlPart(1)
invokeTag('message','g',11,['code':("address.hsno.label"),'default':("House number")],-1)
printHtmlPart(2)
invokeTag('textField','g',14,['name':("schoolAddress.hsno"),'required':(""),'id':("schoolAddress"),'class':("form-control"),'value':(schoolAddressInstance?.hsno)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: schoolAddressInstance, field: 'street', 'error'))
printHtmlPart(4)
invokeTag('message','g',25,['code':("address.street.label"),'default':("Street")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("schoolAddress.street"),'required':(""),'id':("SStreet"),'class':("form-control"),'value':(schoolAddressInstance?.street)],-1)
printHtmlPart(5)
expressionOut.print(hasErrors(bean: schoolAddressInstance, field: 'city', 'error'))
printHtmlPart(6)
invokeTag('message','g',40,['code':("address.city.label"),'default':("City")],-1)
printHtmlPart(2)
invokeTag('textField','g',43,['name':("schoolAddress.city"),'required':(""),'id':("SCity"),'class':("form-control"),'value':(schoolAddressInstance?.city)],-1)
printHtmlPart(7)
expressionOut.print(hasErrors(bean: schoolAddressInstance, field: 'state', 'error'))
printHtmlPart(8)
invokeTag('message','g',54,['code':("address.state.label"),'default':("State")],-1)
printHtmlPart(2)
invokeTag('textField','g',57,['name':("schoolAddress.state"),'required':(""),'id':("SState"),'class':("form-control"),'value':(schoolAddressInstance?.state)],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: schoolAddressInstance, field: 'country', 'error'))
printHtmlPart(10)
invokeTag('message','g',70,['code':("address.country.label"),'default':("Country")],-1)
printHtmlPart(2)
invokeTag('textField','g',73,['name':("schoolAddress.country"),'required':(""),'id':("Scountry"),'class':("form-control"),'value':(schoolAddressInstance?.country)],-1)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: schoolAddressInstance, field: 'phno', 'error'))
printHtmlPart(12)
invokeTag('message','g',84,['code':("address.phno.label"),'default':("Phone Number")],-1)
printHtmlPart(13)
invokeTag('textField','g',87,['name':("schoolAddress.phno"),'class':("form-control"),'value':(schoolAddressInstance?.phno)],-1)
printHtmlPart(14)
expressionOut.print(hasErrors(bean: schoolAddressInstance, field: 'mobileNumber', 'error'))
printHtmlPart(15)
invokeTag('message','g',96,['code':("address.mobileNumber.label"),'default':("Mobile Number")],-1)
printHtmlPart(13)
invokeTag('textField','g',99,['name':("schoolAddress.mobileNumber"),'class':("form-control"),'value':(schoolAddressInstance?.mobileNumber)],-1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926008535L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
