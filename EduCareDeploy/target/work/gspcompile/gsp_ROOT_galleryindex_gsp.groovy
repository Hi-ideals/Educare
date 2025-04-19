import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_galleryindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/gallery/index.gsp" }
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
invokeTag('captureHead','sitemesh',55,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',64,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',68,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',79,['template':("/header/leftSide"),'model':([activ:[gallery:'start active open',galleryList:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',95,['action':("index")],2)
printHtmlPart(11)
if(true && (flash.message)) {
printHtmlPart(12)
expressionOut.print(flash.message)
printHtmlPart(13)
}
printHtmlPart(14)
createTagBody(2, {->
printHtmlPart(15)
if(true && (instituiteInstance)) {
printHtmlPart(16)
invokeTag('submitButton','g',172,['name':("create"),'class':("btn blue"),'value':(message(code: 'default.button.create.label', default: 'Create'))],-1)
printHtmlPart(17)
}
else {
printHtmlPart(18)
invokeTag('submitButton','g',180,['name':("create"),'class':("btn blue"),'disabled':("true"),'value':(message(code: 'default.button.create.label', default: 'Create'))],-1)
printHtmlPart(17)
}
printHtmlPart(19)
})
invokeTag('form','g',184,['controller':("gallery"),'action':("save"),'enctype':("multipart/form-data")],2)
printHtmlPart(20)
for( g in (instituiteInstance?.gallery) ) {
printHtmlPart(21)
expressionOut.print(createLink(controller:'home', action:'displaySingleImage', id:g.id))
printHtmlPart(22)
expressionOut.print(createLink(controller:'home', action:'displaySingleImage', id:g.id))
printHtmlPart(23)
}
printHtmlPart(24)
invokeTag('render','g',236,['template':("/footer/footer")],-1)
printHtmlPart(25)
})
invokeTag('captureBody','sitemesh',332,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(26)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926001749L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
