import com.hiideals.instituite.classcourses.IClass
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_admissionfeeedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admissionfee/edit.gsp" }
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
invokeTag('captureHead','sitemesh',44,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('render','g',49,['template':("/header/logo")],-1)
printHtmlPart(5)
invokeTag('render','g',52,['template':("/header/topBar")],-1)
printHtmlPart(6)
invokeTag('render','g',59,['template':("/header/leftSide")],-1)
printHtmlPart(7)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('link','g',69,['action':("index")],2)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',72,['action':("create")],2)
printHtmlPart(12)
if(true && (flash.message)) {
printHtmlPart(13)
expressionOut.print(flash.message)
printHtmlPart(14)
}
printHtmlPart(15)
createTagBody(2, {->
printHtmlPart(16)
createTagBody(3, {->
printHtmlPart(17)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(18)
expressionOut.print(error.field)
printHtmlPart(19)
}
printHtmlPart(20)
invokeTag('message','g',93,['error':(error)],-1)
printHtmlPart(21)
})
invokeTag('eachError','g',94,['bean':(admissionfeeInstance),'var':("error")],3)
printHtmlPart(22)
})
invokeTag('hasErrors','g',96,['bean':(admissionfeeInstance)],2)
printHtmlPart(23)
createTagBody(2, {->
printHtmlPart(24)
invokeTag('hiddenField','g',112,['name':("version"),'value':(admissionfeeInstance?.version)],-1)
printHtmlPart(25)
invokeTag('render','g',114,['template':("form")],-1)
printHtmlPart(26)
invokeTag('actionSubmit','g',119,['class':("btn blue"),'action':("update"),'id':("createclass"),'value':(message(code: 'default.button.update.label', default: 'Update'))],-1)
printHtmlPart(27)
})
invokeTag('form','g',121,['url':([resource:admissionfeeInstance, action:'update']),'method':("PUT")],2)
printHtmlPart(28)
invokeTag('render','g',134,['template':("/footer/footer")],-1)
printHtmlPart(29)
})
invokeTag('captureBody','sitemesh',166,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(30)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926014224L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
