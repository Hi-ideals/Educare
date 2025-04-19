import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_parentDetailscreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/parentDetails/create.gsp" }
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
invokeTag('captureHead','sitemesh',51,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',60,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',64,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',74,['template':("/header/leftSide")],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',90,['action':("index")],2)
printHtmlPart(11)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(12)
invokeTag('message','g',110,['code':("default.home.label")],-1)
printHtmlPart(13)
createTagBody(2, {->
printHtmlPart(14)
invokeTag('message','g',112,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(15)
})
invokeTag('link','g',113,['class':("list"),'action':("index")],2)
printHtmlPart(16)
invokeTag('message','g',119,['code':("default.create.label"),'args':([entityName])],-1)
printHtmlPart(17)
if(true && (flash.message)) {
printHtmlPart(18)
expressionOut.print(flash.message)
printHtmlPart(19)
}
printHtmlPart(20)
createTagBody(2, {->
printHtmlPart(21)
createTagBody(3, {->
printHtmlPart(22)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(23)
expressionOut.print(error.field)
printHtmlPart(24)
}
printHtmlPart(25)
invokeTag('message','g',131,['error':(error)],-1)
printHtmlPart(26)
})
invokeTag('eachError','g',132,['bean':(parentDetailsInstance),'var':("error")],3)
printHtmlPart(27)
})
invokeTag('hasErrors','g',134,['bean':(parentDetailsInstance)],2)
printHtmlPart(20)
createTagBody(2, {->
printHtmlPart(28)
invokeTag('render','g',137,['template':("form")],-1)
printHtmlPart(29)
invokeTag('submitButton','g',141,['name':("create"),'class':("save"),'value':(message(code: 'default.button.create.label', default: 'Create'))],-1)
printHtmlPart(30)
})
invokeTag('form','g',143,['url':([resource:parentDetailsInstance, action:'save'])],2)
printHtmlPart(31)
invokeTag('render','g',152,['template':("/footer/footer")],-1)
printHtmlPart(32)
})
invokeTag('captureBody','sitemesh',190,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(33)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926001157L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
