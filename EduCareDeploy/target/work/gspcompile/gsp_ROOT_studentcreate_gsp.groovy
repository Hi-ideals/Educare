import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_studentcreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/student/create.gsp" }
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
invokeTag('captureHead','sitemesh',56,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',64,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',69,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',80,['template':("/header/leftSide"),'model':([activ:[adminssion:'start active open']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',96,['controller':("studentList"),'action':("index")],2)
printHtmlPart(11)
if(true && (flash.message)) {
printHtmlPart(12)
expressionOut.print(flash.message)
printHtmlPart(13)
}
printHtmlPart(14)
createTagBody(2, {->
printHtmlPart(15)
createTagBody(3, {->
printHtmlPart(16)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(17)
expressionOut.print(error.field)
printHtmlPart(18)
}
printHtmlPart(19)
invokeTag('message','g',121,['error':(error)],-1)
printHtmlPart(20)
})
invokeTag('eachError','g',121,['bean':(studentInstance),'var':("error")],3)
printHtmlPart(21)
})
invokeTag('hasErrors','g',121,['bean':(studentInstance)],2)
printHtmlPart(14)
createTagBody(2, {->
printHtmlPart(15)
createTagBody(3, {->
printHtmlPart(16)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(17)
expressionOut.print(error.field)
printHtmlPart(18)
}
printHtmlPart(19)
invokeTag('message','g',130,['error':(error)],-1)
printHtmlPart(20)
})
invokeTag('eachError','g',130,['bean':(secUserInstance),'var':("error")],3)
printHtmlPart(21)
})
invokeTag('hasErrors','g',130,['bean':(secUserInstance)],2)
printHtmlPart(22)
createTagBody(2, {->
printHtmlPart(23)
invokeTag('render','g',139,['template':("form")],-1)
printHtmlPart(24)
if(true && (instituite == null)) {
printHtmlPart(25)
invokeTag('username','sec',144,[:],-1)
printHtmlPart(26)
invokeTag('username','sec',146,[:],-1)
printHtmlPart(27)
invokeTag('submitButton','g',152,['name':("create"),'class':("btn blue"),'disabled':("true"),'value':("Save & Continue"),'id':("student")],-1)
printHtmlPart(28)
}
else {
printHtmlPart(29)
invokeTag('submitButton','g',155,['name':("create"),'class':("btn blue"),'value':("Save & Continue"),'id':("student")],-1)
printHtmlPart(28)
}
printHtmlPart(30)
})
invokeTag('form','g',156,['url':([resource:studentInstance, action:'save']),'enctype':("multipart/form-data")],2)
printHtmlPart(31)
invokeTag('render','g',165,['template':("/footer/footer")],-1)
printHtmlPart(32)
})
invokeTag('captureBody','sitemesh',408,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(33)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926000588L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
