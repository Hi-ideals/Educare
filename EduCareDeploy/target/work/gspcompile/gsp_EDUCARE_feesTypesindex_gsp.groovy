import com.hiideals.instituite.feemanagment.FeesTypes
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_feesTypesindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/feesTypes/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(0)
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'feesTypes.label', default: 'FeesTypes'))],-1)
printHtmlPart(0)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',9,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
printHtmlPart(0)
})
invokeTag('captureHead','sitemesh',10,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('message','g',13,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(3)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(4)
invokeTag('message','g',17,['code':("default.home.label")],-1)
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
invokeTag('message','g',19,['code':("default.new.label"),'args':([entityName])],-1)
printHtmlPart(7)
})
invokeTag('link','g',20,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('message','g',25,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
expressionOut.print(message(code: 'feesTypes.amountPaid.label', default: 'Amount Paid'))
printHtmlPart(13)
expressionOut.print(message(code: 'feesTypes.amountToBePaid.label', default: 'Amount To Be Paid'))
printHtmlPart(13)
expressionOut.print(message(code: 'feesTypes.due.label', default: 'Due'))
printHtmlPart(14)
invokeTag('message','g',48,['code':("feesTypes.fee.label"),'default':("Fee")],-1)
printHtmlPart(15)
invokeTag('message','g',51,['code':("feesTypes.instFeeType.label"),'default':("Inst Fee Type")],-1)
printHtmlPart(16)
loop:{
int i = 0
for( feesTypesInstance in (feesTypesInstanceList) ) {
printHtmlPart(17)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(18)
createTagBody(3, {->
printHtmlPart(19)
expressionOut.print(fieldValue(bean: feesTypesInstance, field: "amountPaid"))
printHtmlPart(20)
})
invokeTag('link','g',62,['action':("show"),'id':(feesTypesInstance.id)],3)
printHtmlPart(21)
expressionOut.print(fieldValue(bean: feesTypesInstance, field: "amountToBePaid"))
printHtmlPart(22)
expressionOut.print(fieldValue(bean: feesTypesInstance, field: "due"))
printHtmlPart(22)
expressionOut.print(fieldValue(bean: feesTypesInstance, field: "fee"))
printHtmlPart(22)
expressionOut.print(fieldValue(bean: feesTypesInstance, field: "instFeeType"))
printHtmlPart(23)
i++
}
}
printHtmlPart(24)
invokeTag('paginate','g',86,['total':(feesTypesInstanceCount ?: 0)],-1)
printHtmlPart(25)
})
invokeTag('captureBody','sitemesh',90,[:],1)
printHtmlPart(26)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926016071L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
