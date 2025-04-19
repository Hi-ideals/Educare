import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_marksedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/marks/edit.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',14,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',14,[:],2)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',18,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',49,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',55,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',58,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',67,['template':("/header/leftSide"),'model':([activ:[exams:'start active open',marks:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
invokeTag('message','g',79,['code':("default.home.label")],-1)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',81,['class':("list"),'action':("index")],2)
printHtmlPart(12)
createClosureForHtmlPart(13, 2)
invokeTag('link','g',83,['class':("create"),'action':("create")],2)
printHtmlPart(14)
if(true && (flash.message)) {
printHtmlPart(15)
expressionOut.print(flash.message)
printHtmlPart(16)
}
printHtmlPart(17)
createTagBody(2, {->
printHtmlPart(18)
createTagBody(3, {->
printHtmlPart(19)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(20)
expressionOut.print(error.field)
printHtmlPart(21)
}
printHtmlPart(22)
invokeTag('message','g',100,['error':(error)],-1)
printHtmlPart(23)
})
invokeTag('eachError','g',101,['bean':(marksInstance),'var':("error")],3)
printHtmlPart(24)
})
invokeTag('hasErrors','g',103,['bean':(marksInstance)],2)
printHtmlPart(25)
createTagBody(2, {->
printHtmlPart(26)
invokeTag('hiddenField','g',117,['name':("version"),'value':(marksInstance?.version)],-1)
printHtmlPart(27)
invokeTag('render','g',119,['template':("form")],-1)
printHtmlPart(28)
invokeTag('actionSubmit','g',125,['class':("save btn blue"),'action':("update"),'id':("marks"),'value':(message(code: 'default.button.update.label', default: 'Update'))],-1)
printHtmlPart(29)
})
invokeTag('form','g',127,['url':([resource:marksInstance, action:'update']),'method':("PUT")],2)
printHtmlPart(30)
invokeTag('render','g',137,['template':("/footer/footer")],-1)
printHtmlPart(31)
})
invokeTag('captureBody','sitemesh',171,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(32)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925994207L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
