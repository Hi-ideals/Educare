import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_userList_addressForm_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/userList/_addressForm.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: userListInstance.address, field: 'hsno', 'error'))
printHtmlPart(1)
invokeTag('message','g',10,['code':("hsno.label"),'default':("Building No.")],-1)
printHtmlPart(2)
invokeTag('textField','g',13,['name':("hsno"),'required':(""),'class':("form-control"),'id':("hsno"),'value':(userListInstance.address?.hsno)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: userListInstance.address, field: 'street', 'error'))
printHtmlPart(4)
invokeTag('message','g',24,['code':("street.label"),'default':("Street")],-1)
printHtmlPart(2)
invokeTag('textField','g',27,['name':("street"),'required':(""),'class':("form-control"),'id':("street"),'value':(userListInstance.address?.street)],-1)
printHtmlPart(5)
expressionOut.print(hasErrors(bean: userListInstance.address, field: 'city', 'error'))
printHtmlPart(6)
invokeTag('message','g',37,['code':("city.label"),'default':("City")],-1)
printHtmlPart(2)
invokeTag('textField','g',40,['name':("city"),'required':(""),'class':("form-control"),'id':("city"),'value':(userListInstance.address?.city)],-1)
printHtmlPart(7)
expressionOut.print(hasErrors(bean: userListInstance.address, field: 'state', 'error'))
printHtmlPart(8)
invokeTag('message','g',54,['code':("state.label"),'default':("State")],-1)
printHtmlPart(2)
invokeTag('textField','g',57,['name':("state"),'required':(""),'class':("form-control"),'id':("state"),'value':(userListInstance.address?.state)],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: userListInstance.address, field: 'country', 'error'))
printHtmlPart(10)
invokeTag('message','g',67,['code':("country.label"),'default':("Country")],-1)
printHtmlPart(11)
invokeTag('textField','g',71,['name':("country"),'required':(""),'class':("form-control"),'id':("country"),'value':(userListInstance.address?.country)],-1)
printHtmlPart(12)
expressionOut.print(hasErrors(bean: userListInstance.address, field: 'mobileNumber', 'error'))
printHtmlPart(13)
invokeTag('message','g',82,['code':("mobileNumber.label"),'default':("Mobile Number")],-1)
printHtmlPart(14)
invokeTag('textField','g',85,['name':("mobileNumber"),'class':("form-control"),'id':("mobileNumber"),'value':(userListInstance.address?.mobileNumber)],-1)
printHtmlPart(15)
expressionOut.print(hasErrors(bean: userListInstance.address, field: 'pinCode', 'error'))
printHtmlPart(16)
invokeTag('message','g',98,['code':("pinCode.label"),'default':("Pincode")],-1)
printHtmlPart(14)
invokeTag('textField','g',101,['name':("pinCode"),'class':("form-control"),'id':("pinCode"),'required':("required"),'value':(userListInstance.address?.pinCode)],-1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926005319L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
