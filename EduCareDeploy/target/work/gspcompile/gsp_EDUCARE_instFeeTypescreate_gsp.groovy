import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_instFeeTypescreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/instFeeTypes/create.gsp" }
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
invokeTag('captureHead','sitemesh',46,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',55,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',59,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',70,['template':("/header/leftSide"),'model':([activ:[feeStructure:'start active open',instFeeTypes:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',86,['action':("index")],2)
printHtmlPart(11)
createClosureForHtmlPart(12, 2)
invokeTag('link','g',88,['action':("create")],2)
printHtmlPart(13)
if(true && (flash.message)) {
printHtmlPart(14)
expressionOut.print(flash.message)
printHtmlPart(15)
}
printHtmlPart(16)
createTagBody(2, {->
printHtmlPart(17)
createTagBody(3, {->
printHtmlPart(18)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(19)
expressionOut.print(error.field)
printHtmlPart(20)
}
printHtmlPart(21)
invokeTag('message','g',108,['error':(error)],-1)
printHtmlPart(22)
})
invokeTag('eachError','g',109,['bean':(instFeeTypesInstance),'var':("error")],3)
printHtmlPart(23)
})
invokeTag('hasErrors','g',111,['bean':(instFeeTypesInstance)],2)
printHtmlPart(24)
createTagBody(2, {->
printHtmlPart(25)
invokeTag('render','g',125,['template':("form")],-1)
printHtmlPart(26)
if(true && (instituite == null)) {
printHtmlPart(27)
invokeTag('username','sec',130,[:],-1)
printHtmlPart(28)
invokeTag('submitButton','g',135,['name':("create"),'class':("btn blue"),'disabled':("true"),'id':("createnewfee"),'value':(message(code: 'default.button.create.label', default: 'Create'))],-1)
printHtmlPart(29)
}
else {
printHtmlPart(30)
invokeTag('submitButton','g',142,['name':("create"),'class':("btn blue"),'id':("createnewfee"),'value':(message(code: 'default.button.create.label', default: 'Create'))],-1)
printHtmlPart(31)
}
printHtmlPart(32)
})
invokeTag('form','g',145,['url':([resource:instFeeTypesInstance, action:'save'])],2)
printHtmlPart(33)
invokeTag('render','g',159,['template':("/footer/footer")],-1)
printHtmlPart(34)
})
invokeTag('captureBody','sitemesh',198,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(35)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926008179L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
