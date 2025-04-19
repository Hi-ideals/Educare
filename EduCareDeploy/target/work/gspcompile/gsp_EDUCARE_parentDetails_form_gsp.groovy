import com.hiideals.instituite.student.ParentDetails
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_parentDetails_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/parentDetails/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: parentDetailsInstance, field: 'parentName', 'error'))
printHtmlPart(1)
invokeTag('textField','g',13,['name':("${petails}.parentName"),'class':("form-control"),'required':(""),'value':(parentDetailsInstance?.parentName)],-1)
printHtmlPart(2)
invokeTag('message','g',15,['code':("parentDetails.parentName.label"),'default':("${parent} Name")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: parentDetailsInstance, field: 'occupation', 'error'))
printHtmlPart(1)
invokeTag('textField','g',29,['name':("${petails}.occupation"),'class':("form-control"),'required':(""),'value':(parentDetailsInstance?.occupation)],-1)
printHtmlPart(4)
invokeTag('message','g',31,['code':("parentDetails.occupation.label"),'default':("Occupation")],-1)
printHtmlPart(5)
expressionOut.print(hasErrors(bean: parentDetailsInstance, field: 'mobileNumber', 'error'))
printHtmlPart(6)
invokeTag('textField','g',44,['name':("${petails}.mobileNumber"),'class':("form-control"),'value':(parentDetailsInstance?.mobileNumber)],-1)
printHtmlPart(7)
invokeTag('message','g',46,['code':("parentDetails.mobileNumber.label"),'default':("Mobile Number")],-1)
printHtmlPart(8)
expressionOut.print(hasErrors(bean: parentDetailsInstance, field: 'relation', 'error'))
printHtmlPart(1)
invokeTag('textField','g',62,['name':("${petails}.relation"),'class':("form-control"),'required':(""),'value':(parentDetailsInstance?.relation)],-1)
printHtmlPart(9)
invokeTag('message','g',64,['code':("parentDetails.relation.label"),'default':("Relation")],-1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926001150L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
