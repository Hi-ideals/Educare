import com.hiideals.instituite.helper.Address
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_student_presentaddress_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/student/_presentaddress.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: studentInstance.presentAddress, field: 'hsno', 'error'))
printHtmlPart(1)
invokeTag('textField','g',13,['name':("${addr}.hsno"),'class':("form-control"),'value':(address?.hsno)],-1)
printHtmlPart(2)
invokeTag('message','g',15,['code':("address.hsno.label"),'default':("House Number")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: studentInstance.presentAddress, field: 'street', 'error'))
printHtmlPart(1)
invokeTag('textField','g',27,['name':("${addr}.street"),'class':("form-control"),'value':(address?.street)],-1)
printHtmlPart(4)
invokeTag('message','g',29,['code':("address.street.label"),'default':("Street")],-1)
printHtmlPart(5)
expressionOut.print(hasErrors(bean: studentInstance.presentAddress, field: 'city', 'error'))
printHtmlPart(1)
invokeTag('textField','g',40,['name':("${addr}.city"),'class':("form-control"),'value':(address?.city)],-1)
printHtmlPart(6)
invokeTag('message','g',43,['code':("address.city.label"),'default':("City")],-1)
printHtmlPart(7)
expressionOut.print(hasErrors(bean: studentInstance.presentAddress, field: 'state', 'error'))
printHtmlPart(1)
invokeTag('textField','g',55,['name':("${addr}.state"),'class':("form-control"),'value':(address?.state)],-1)
printHtmlPart(8)
invokeTag('message','g',57,['code':("address.state.label"),'default':("State")],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: studentInstance.presentAddress, field: 'country', 'error'))
printHtmlPart(1)
invokeTag('textField','g',70,['name':("${addr}.country"),'class':("form-control"),'value':(address?.country)],-1)
printHtmlPart(10)
invokeTag('message','g',75,['code':("address.country.label"),'default':("Country")],-1)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: studentInstance.presentAddress, field: 'pinCode', 'error'))
printHtmlPart(1)
invokeTag('textField','g',83,['name':("${addr}.pinCode"),'class':("form-control"),'value':(address?.pinCode)],-1)
printHtmlPart(10)
invokeTag('message','g',85,['code':("address.country.label"),'default':("Country")],-1)
printHtmlPart(12)
expressionOut.print(hasErrors(bean: studentInstance.presentAddress, field: 'phno', 'error'))
printHtmlPart(1)
invokeTag('textField','g',96,['name':("${addr}.phno"),'class':("form-control"),'value':(address?.phno)],-1)
printHtmlPart(13)
invokeTag('message','g',99,['code':("address.phno.label"),'default':("Phone Number")],-1)
printHtmlPart(14)
expressionOut.print(hasErrors(bean: studentInstance.presentAddress, field: 'mobileNumber', 'error'))
printHtmlPart(1)
invokeTag('textField','g',110,['name':("${addr}.mobileNumber"),'class':("form-control"),'value':(address?.mobileNumber),'maxlength':("10")],-1)
printHtmlPart(15)
invokeTag('message','g',113,['code':("address.mobileNumber.label"),'default':("Mobile Number")],-1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926000484L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
