import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_admin_addressForm_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admin/_addressForm.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: adminInstance.address, field: 'hsno', 'error'))
printHtmlPart(1)
invokeTag('message','g',10,['code':("address.hsno.label"),'default':("Building No.")],-1)
printHtmlPart(2)
invokeTag('textField','g',14,['name':("address.hsno"),'required':(""),'class':("form-control"),'value':(adminInstance.address?.hsno)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: adminInstance.address, field: 'street', 'error'))
printHtmlPart(4)
invokeTag('message','g',23,['code':("address.street.label"),'default':("Street")],-1)
printHtmlPart(5)
invokeTag('textField','g',26,['name':("address.street"),'required':(""),'class':("form-control"),'value':(adminInstance.address?.street)],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: adminInstance.address, field: 'city', 'error'))
printHtmlPart(7)
invokeTag('message','g',34,['code':("address.city.label"),'default':("City")],-1)
printHtmlPart(5)
invokeTag('textField','g',37,['name':("address.city"),'required':(""),'class':("form-control"),'value':(adminInstance.address?.city)],-1)
printHtmlPart(8)
expressionOut.print(hasErrors(bean: adminInstance.address, field: 'state', 'error'))
printHtmlPart(9)
invokeTag('message','g',49,['code':("address.state.label"),'default':("State")],-1)
printHtmlPart(5)
invokeTag('textField','g',52,['name':("address.state"),'required':(""),'class':("form-control"),'value':(adminInstance.address?.state)],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: adminInstance.address, field: 'country', 'error'))
printHtmlPart(10)
invokeTag('message','g',60,['code':("address.country.label"),'default':("Country")],-1)
printHtmlPart(11)
invokeTag('textField','g',65,['name':("address.country"),'required':(""),'class':("form-control"),'value':(adminInstance.address?.country)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: adminInstance.address, field: 'mobileNumber', 'error'))
printHtmlPart(12)
invokeTag('message','g',74,['code':("address.mobileNumber.label"),'default':("Mobile Number")],-1)
printHtmlPart(13)
invokeTag('textField','g',77,['name':("address.mobileNumber"),'class':("form-control"),'value':(adminInstance.address?.mobileNumber)],-1)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925996349L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
