import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_transportFee_feedetails_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/transportFee/_feedetails.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: transportFeeInstance, field: 'paidAmount', 'error'))
printHtmlPart(1)
invokeTag('message','g',6,['code':("transportFee.paidAmount.label"),'default':("Paid Amount")],-1)
printHtmlPart(2)
expressionOut.print(paid)
printHtmlPart(3)
invokeTag('field','g',10,['type':("number"),'name':("paidAmount"),'readOnly':("true"),'id':("paid"),'class':("form-control"),'value':(paid),'required':("")],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: transportFeeInstance, field: 'remainingAmount', 'error'))
printHtmlPart(5)
invokeTag('message','g',17,['code':("transportFee.remainingAmount.label"),'default':("Remaining Amount")],-1)
printHtmlPart(6)
expressionOut.print(remaining)
printHtmlPart(3)
invokeTag('field','g',21,['type':("number"),'name':("remainingAmount"),'readOnly':("true"),'class':("form-control"),'id':("remaining"),'value':(remaining),'required':("")],-1)
printHtmlPart(7)
expressionOut.print(hasErrors(bean: transportFeeInstance, field: 'payingAmount', 'error'))
printHtmlPart(1)
invokeTag('message','g',29,['code':("transportFee.payingAmount.label"),'default':("Paying Amount")],-1)
printHtmlPart(8)
invokeTag('field','g',35,['type':("number"),'name':("payingAmount"),'class':("form-control"),'value':(fieldValue(bean: transportFeeInstance, field: 'payingAmount')),'id':("paying"),'required':(""),'oninput':("myfunction(this)")],-1)
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926005842L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
