import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_admincreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admin/create.gsp" }
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
invokeTag('captureHead','sitemesh',43,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',49,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',52,['template':("/header/topBar")],-1)
printHtmlPart(7)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('link','g',69,['action':("index")],2)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
createTagBody(2, {->
printHtmlPart(14)
createTagBody(3, {->
printHtmlPart(15)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(16)
expressionOut.print(error.field)
printHtmlPart(17)
}
printHtmlPart(18)
invokeTag('message','g',90,['error':(error)],-1)
printHtmlPart(19)
})
invokeTag('eachError','g',90,['bean':(adminInstance),'var':("error")],3)
printHtmlPart(20)
})
invokeTag('hasErrors','g',90,['bean':(adminInstance)],2)
printHtmlPart(13)
createTagBody(2, {->
printHtmlPart(14)
createTagBody(3, {->
printHtmlPart(15)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(16)
expressionOut.print(error.field)
printHtmlPart(17)
}
printHtmlPart(18)
invokeTag('message','g',99,['error':(error)],-1)
printHtmlPart(19)
})
invokeTag('eachError','g',99,['bean':(secUserInstance),'var':("error")],3)
printHtmlPart(20)
})
invokeTag('hasErrors','g',99,['bean':(secUserInstance)],2)
printHtmlPart(21)
createTagBody(2, {->
printHtmlPart(22)
invokeTag('render','g',114,['template':("form")],-1)
printHtmlPart(23)
invokeTag('actionSubmit','g',120,['action':("save"),'value':(message(code: 'default.button.create.label', default: 'Create')),'class':("btn blue"),'id':("cash"),'style':("display:none")],-1)
printHtmlPart(24)
invokeTag('actionSubmit','g',121,['action':("makepayment"),'value':("Make Payment"),'class':("btn blue"),'id':("online"),'style':("display:none")],-1)
printHtmlPart(25)
})
invokeTag('form','g',122,['controller':("admin"),'enctype':("multipart/form-data")],2)
printHtmlPart(26)
invokeTag('render','g',126,['template':("/footer/footer")],-1)
printHtmlPart(27)
})
invokeTag('captureBody','sitemesh',160,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(28)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925996276L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
