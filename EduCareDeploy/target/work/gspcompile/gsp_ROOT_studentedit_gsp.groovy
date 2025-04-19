import com.hiideals.instituite.student.Student
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_studentedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/student/edit.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',13,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',13,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
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
invokeTag('render','g',79,['template':("/header/leftSide")],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',95,['controller':("studentList"),'action':("index")],2)
printHtmlPart(11)
createClosureForHtmlPart(12, 2)
invokeTag('link','g',97,['action':("create")],2)
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
invokeTag('message','g',123,['error':(error)],-1)
printHtmlPart(22)
})
invokeTag('eachError','g',123,['bean':(studentInstance),'var':("error")],3)
printHtmlPart(23)
})
invokeTag('hasErrors','g',123,['bean':(studentInstance)],2)
printHtmlPart(16)
createTagBody(2, {->
printHtmlPart(24)
invokeTag('hiddenField','g',129,['name':("version"),'value':(studentInstance?.version)],-1)
printHtmlPart(25)
invokeTag('render','g',131,['template':("form"),'model':([edit:'none'])],-1)
printHtmlPart(26)
invokeTag('actionSubmit','g',136,['class':("btn blue"),'action':("update"),'id':("student"),'value':(message(code: 'default.button.update.label', default: 'Update'))],-1)
printHtmlPart(27)
})
invokeTag('form','g',137,['url':([resource:studentInstance, action:'update']),'enctype':("multipart/form-data")],2)
printHtmlPart(28)
invokeTag('render','g',140,['template':("/footer/footer")],-1)
printHtmlPart(29)
})
invokeTag('captureBody','sitemesh',392,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(30)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926000518L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
