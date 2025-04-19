import com.hiideals.instituite.helper.Address
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_address_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/address/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: addressInstance, field: 'phno', 'error'))
printHtmlPart(1)
invokeTag('textField','g',12,['name':("phno"),'class':("form-control"),'value':(addressInstance?.phno)],-1)
printHtmlPart(2)
invokeTag('message','g',14,['code':("address.phno.label"),'default':("Phno")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: addressInstance, field: 'mobileNumber', 'error'))
printHtmlPart(1)
invokeTag('textField','g',27,['name':("mobileNumber"),'class':("form-control"),'value':(addressInstance?.mobileNumber)],-1)
printHtmlPart(4)
invokeTag('message','g',29,['code':("address.mobileNumber.label"),'default':("Mobile Number")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: addressInstance, field: 'nationality', 'error'))
printHtmlPart(1)
invokeTag('textField','g',42,['name':("nationality"),'class':("form-control"),'value':(addressInstance?.nationality)],-1)
printHtmlPart(5)
invokeTag('message','g',44,['code':("address.nationality.label"),'default':("Nationality")],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: addressInstance, field: 'bloodgroup', 'error'))
printHtmlPart(1)
invokeTag('textField','g',59,['name':("bloodgroup"),'class':("form-control"),'value':(addressInstance?.bloodgroup)],-1)
printHtmlPart(7)
invokeTag('message','g',61,['code':("address.bloodgroup.label"),'default':("Bloodgroup")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: addressInstance, field: 'motherTongue', 'error'))
printHtmlPart(1)
invokeTag('textField','g',74,['name':("motherTongue"),'class':("form-control"),'value':(addressInstance?.motherTongue)],-1)
printHtmlPart(8)
invokeTag('message','g',76,['code':("address.motherTongue.label"),'default':("Mother Tongue")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: addressInstance, field: 'religion', 'error'))
printHtmlPart(1)
invokeTag('textField','g',88,['name':("religion"),'class':("form-control"),'value':(addressInstance?.religion)],-1)
printHtmlPart(9)
invokeTag('message','g',90,['code':("address.religion.label"),'default':("Religion")],-1)
printHtmlPart(10)
expressionOut.print(hasErrors(bean: addressInstance, field: 'city', 'error'))
printHtmlPart(11)
invokeTag('textField','g',104,['name':("city"),'required':(""),'class':("form-control"),'value':(addressInstance?.city)],-1)
printHtmlPart(12)
invokeTag('message','g',106,['code':("address.city.label"),'default':("City")],-1)
printHtmlPart(13)
expressionOut.print(hasErrors(bean: addressInstance, field: 'country', 'error'))
printHtmlPart(11)
invokeTag('textField','g',118,['name':("country"),'required':(""),'class':("form-control"),'value':(addressInstance?.country)],-1)
printHtmlPart(14)
invokeTag('message','g',120,['code':("address.country.label"),'default':("Country")],-1)
printHtmlPart(15)
expressionOut.print(hasErrors(bean: addressInstance, field: 'hsno', 'error'))
printHtmlPart(11)
invokeTag('textField','g',133,['name':("hsno"),'required':(""),'class':("form-control"),'value':(addressInstance?.hsno)],-1)
printHtmlPart(16)
invokeTag('message','g',135,['code':("address.hsno.label"),'default':("Hsno")],-1)
printHtmlPart(17)
expressionOut.print(hasErrors(bean: addressInstance, field: 'state', 'error'))
printHtmlPart(11)
invokeTag('textField','g',149,['name':("state"),'required':(""),'class':("form-control"),'value':(addressInstance?.state)],-1)
printHtmlPart(18)
invokeTag('message','g',151,['code':("address.state.label"),'default':("State")],-1)
printHtmlPart(13)
expressionOut.print(hasErrors(bean: addressInstance, field: 'street', 'error'))
printHtmlPart(11)
invokeTag('textField','g',163,['name':("street"),'required':(""),'class':("form-control"),'value':(addressInstance?.street)],-1)
printHtmlPart(19)
invokeTag('message','g',165,['code':("address.street.label"),'default':("Street")],-1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926019876L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
