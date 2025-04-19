import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_feecreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/fee/create.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',12,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',12,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',45,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',54,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',58,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',68,['template':("/header/leftSide"),'model':([activ:[feeStructure:'start active open',fee:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
expressionOut.print(student?.studentName)
printHtmlPart(10)
for( _it2108125957 in (student?.academicyear) ) {
changeItVariable(_it2108125957)
printHtmlPart(11)
if(true && (it.status == 'current')) {
printHtmlPart(11)
}
printHtmlPart(12)
}
printHtmlPart(13)
invokeTag('set','g',95,['value':(it?.presentclass),'var':("pclass")],-1)
printHtmlPart(13)
expressionOut.print(pclass.classname)
printHtmlPart(14)
for( _it1021295599 in (student?.academicyear) ) {
changeItVariable(_it1021295599)
printHtmlPart(11)
if(true && (it.status == 'current')) {
printHtmlPart(11)
}
printHtmlPart(12)
}
printHtmlPart(13)
invokeTag('set','g',101,['value':(it?.section),'var':("pclass")],-1)
printHtmlPart(13)
expressionOut.print(pclass?.sectionName)
printHtmlPart(15)
for( _it2048777201 in (student?.academicyear) ) {
changeItVariable(_it2048777201)
printHtmlPart(11)
if(true && (it.status == 'current')) {
printHtmlPart(11)
}
printHtmlPart(12)
}
printHtmlPart(13)
invokeTag('set','g',107,['value':(it),'var':("pclass")],-1)
printHtmlPart(13)
expressionOut.print(pclass?.academicyear)
printHtmlPart(16)
if(true && (flash.message)) {
printHtmlPart(17)
expressionOut.print(flash.message)
printHtmlPart(18)
}
printHtmlPart(12)
if(true && (flash.msg)) {
printHtmlPart(19)
expressionOut.print(flash.msg)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (flash.msgtcfee)) {
printHtmlPart(19)
expressionOut.print(tcDetails?.studentName)
printHtmlPart(22)
expressionOut.print(flash.msgtcfee)
printHtmlPart(20)
}
printHtmlPart(12)
createTagBody(2, {->
printHtmlPart(23)
createTagBody(3, {->
printHtmlPart(24)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(25)
expressionOut.print(error.field)
printHtmlPart(26)
}
printHtmlPart(27)
invokeTag('message','g',135,['error':(error)],-1)
printHtmlPart(28)
})
invokeTag('eachError','g',136,['bean':(feeInstance),'var':("error")],3)
printHtmlPart(29)
})
invokeTag('hasErrors','g',138,['bean':(feeInstance)],2)
printHtmlPart(12)
createTagBody(2, {->
printHtmlPart(30)
invokeTag('render','g',141,['template':("form")],-1)
printHtmlPart(31)
invokeTag('submitButton','g',145,['name':("create"),'class':("btn blue"),'id':("paypal"),'value':(message(code: 'default.button.Add Fees .label', default: 'Pay Fees'))],-1)
printHtmlPart(32)
invokeTag('submitButton','g',146,['name':("Skip"),'value':("skip"),'class':("btn green")],-1)
printHtmlPart(33)
})
invokeTag('form','g',148,['url':([resource:feeInstance, action:'save']),'name':("myform")],2)
printHtmlPart(34)
invokeTag('render','g',159,['template':("/footer/footer")],-1)
printHtmlPart(35)
})
invokeTag('captureBody','sitemesh',689,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(36)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1644500056000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
