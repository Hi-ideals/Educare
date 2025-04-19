import com.hiideals.instituite.feemanagment.FeesTypes
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_feesTypes_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/feesTypes/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: feesTypesInstance, field: 'amountPaid', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("feesTypes.amountPaid.label"),'default':("Amount Paid")],-1)
printHtmlPart(2)
invokeTag('field','g',10,['name':("amountPaid"),'type':("number"),'value':(feesTypesInstance.amountPaid),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: feesTypesInstance, field: 'amountToBePaid', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("feesTypes.amountToBePaid.label"),'default':("Amount To Be Paid")],-1)
printHtmlPart(2)
invokeTag('field','g',19,['name':("amountToBePaid"),'type':("number"),'value':(feesTypesInstance.amountToBePaid),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: feesTypesInstance, field: 'due', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("feesTypes.due.label"),'default':("Due")],-1)
printHtmlPart(2)
invokeTag('field','g',28,['name':("due"),'type':("number"),'value':(feesTypesInstance.due),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: feesTypesInstance, field: 'fee', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("feesTypes.fee.label"),'default':("Fee")],-1)
printHtmlPart(2)
invokeTag('select','g',37,['id':("fee"),'name':("fee.id"),'from':(com.hiideals.instituite.feemanagment.Fee.list()),'optionKey':("id"),'required':(""),'value':(feesTypesInstance?.fee?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: feesTypesInstance, field: 'instFeeType', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("feesTypes.instFeeType.label"),'default':("Inst Fee Type")],-1)
printHtmlPart(2)
invokeTag('select','g',46,['id':("instFeeType"),'name':("instFeeType.id"),'from':(com.hiideals.instituite.feemanagment.InstFeeTypes.list()),'optionKey':("id"),'required':(""),'value':(feesTypesInstance?.instFeeType?.id),'class':("many-to-one")],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926015437L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
