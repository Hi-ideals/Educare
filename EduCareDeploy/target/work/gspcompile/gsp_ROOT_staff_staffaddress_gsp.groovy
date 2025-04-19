import com.hiideals.instituite.helper.Address
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_staff_staffaddress_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/staff/_staffaddress.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: addressInstance, field: 'hsno', 'error'))
printHtmlPart(1)
invokeTag('message','g',8,['code':("address.hsno.label"),'default':("House Number")],-1)
printHtmlPart(2)
invokeTag('textField','g',11,['name':("address.hsno"),'required':(""),'class':("form-control"),'value':(addressInstance?.hsno),'id':("address")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: addressInstance, field: 'street', 'error'))
printHtmlPart(4)
invokeTag('message','g',22,['code':("address.street.label"),'default':("Street")],-1)
printHtmlPart(2)
invokeTag('textField','g',25,['name':("address.street"),'required':(""),'class':("form-control"),'value':(addressInstance?.street),'id':("Street")],-1)
printHtmlPart(5)
expressionOut.print(hasErrors(bean: addressInstance, field: 'city', 'error'))
printHtmlPart(6)
invokeTag('message','g',37,['code':("address.city.label"),'default':("City")],-1)
printHtmlPart(2)
invokeTag('textField','g',40,['name':("address.city"),'required':(""),'class':("form-control"),'value':(addressInstance?.city),'id':("City")],-1)
printHtmlPart(7)
expressionOut.print(hasErrors(bean: addressInstance, field: 'state', 'error'))
printHtmlPart(8)
invokeTag('message','g',51,['code':("address.state.label"),'default':("State")],-1)
printHtmlPart(2)
invokeTag('textField','g',54,['name':("address.state"),'required':(""),'class':("form-control"),'value':(addressInstance?.state),'id':("State")],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: addressInstance, field: 'country', 'error'))
printHtmlPart(10)
invokeTag('message','g',67,['code':("address.country.label"),'default':("Country")],-1)
printHtmlPart(11)
invokeTag('textField','g',71,['name':("address.country"),'required':(""),'class':("form-control"),'value':(addressInstance?.country),'id':("Country")],-1)
printHtmlPart(12)
expressionOut.print(hasErrors(bean: addressInstance, field: 'phno', 'error'))
printHtmlPart(13)
invokeTag('message','g',82,['code':("address.phno.label"),'default':("Phone Number")],-1)
printHtmlPart(14)
invokeTag('textField','g',86,['name':("address.phno"),'id':("phone"),'class':("form-control"),'value':(addressInstance?.phno)],-1)
printHtmlPart(15)
expressionOut.print(hasErrors(bean: addressInstance, field: 'mobileNumber', 'error'))
printHtmlPart(16)
invokeTag('message','g',96,['code':("address.mobileNumber.label"),'default':("Mobile Number")],-1)
printHtmlPart(17)
invokeTag('textField','g',99,['name':("address.mobileNumber"),'class':("form-control"),'value':(addressInstance?.mobileNumber)],-1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926003451L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
