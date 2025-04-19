import com.hiideals.instituite.feemanagment.FeesTypes
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_feesTypesshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/feesTypes/show.gsp" }
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
invokeTag('message','g',9,['code':("default.show.label"),'args':([entityName])],-1)
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
invokeTag('message','g',19,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(7)
})
invokeTag('link','g',20,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(6)
invokeTag('message','g',22,['code':("default.new.label"),'args':([entityName])],-1)
printHtmlPart(7)
})
invokeTag('link','g',23,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',28,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (feesTypesInstance?.amountPaid)) {
printHtmlPart(14)
invokeTag('message','g',40,['code':("feesTypes.amountPaid.label"),'default':("Amount Paid")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',42,['bean':(feesTypesInstance),'field':("amountPaid")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (feesTypesInstance?.amountToBePaid)) {
printHtmlPart(18)
invokeTag('message','g',48,['code':("feesTypes.amountToBePaid.label"),'default':("Amount To Be Paid")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',51,['bean':(feesTypesInstance),'field':("amountToBePaid")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (feesTypesInstance?.due)) {
printHtmlPart(20)
invokeTag('message','g',57,['code':("feesTypes.due.label"),'default':("Due")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',59,['bean':(feesTypesInstance),'field':("due")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (feesTypesInstance?.fee)) {
printHtmlPart(22)
invokeTag('message','g',65,['code':("feesTypes.fee.label"),'default':("Fee")],-1)
printHtmlPart(23)
createTagBody(3, {->
printHtmlPart(24)
expressionOut.print(feesTypesInstance?.fee?.encodeAsHTML())
printHtmlPart(25)
})
invokeTag('link','g',69,['controller':("fee"),'action':("show"),'id':(feesTypesInstance?.fee?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (feesTypesInstance?.instFeeType)) {
printHtmlPart(26)
invokeTag('message','g',75,['code':("feesTypes.instFeeType.label"),'default':("Inst Fee Type")],-1)
printHtmlPart(27)
createTagBody(3, {->
printHtmlPart(24)
expressionOut.print(feesTypesInstance?.instFeeType?.encodeAsHTML())
printHtmlPart(25)
})
invokeTag('link','g',80,['controller':("instFeeTypes"),'action':("show"),'id':(feesTypesInstance?.instFeeType?.id)],3)
printHtmlPart(16)
}
printHtmlPart(28)
createTagBody(2, {->
printHtmlPart(29)
createTagBody(3, {->
printHtmlPart(6)
invokeTag('message','g',88,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(7)
})
invokeTag('link','g',89,['class':("edit"),'action':("edit"),'resource':(feesTypesInstance)],3)
printHtmlPart(7)
invokeTag('actionSubmit','g',92,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(30)
})
invokeTag('form','g',94,['url':([resource:feesTypesInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(31)
})
invokeTag('captureBody','sitemesh',96,[:],1)
printHtmlPart(32)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926015406L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
