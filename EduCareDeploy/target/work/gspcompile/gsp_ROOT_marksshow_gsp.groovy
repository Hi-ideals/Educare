import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.institute.staff.Staff
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_marksshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/marks/show.gsp" }
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
invokeTag('captureHead','sitemesh',45,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',54,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',58,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',69,['template':("/header/leftSide"),'model':([activ:[exams:'start active open',marks:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
invokeTag('message','g',81,['code':("default.home.label")],-1)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',83,['class':("list"),'action':("index")],2)
printHtmlPart(12)
createClosureForHtmlPart(13, 2)
invokeTag('link','g',85,['class':("create"),'action':("create")],2)
printHtmlPart(14)
if(true && (marksInstance?.student)) {
printHtmlPart(15)
expressionOut.print(marksInstance?.student?.studentName?.encodeAsHTML())
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (marksInstance?.examDetails?.iclass?.classname)) {
printHtmlPart(18)
expressionOut.print(marksInstance?.examDetails?.iclass?.classname)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (marksInstance?.examDetails)) {
printHtmlPart(19)
expressionOut.print(marksInstance?.examDetails?.exam?.examName?.encodeAsHTML())
printHtmlPart(16)
}
printHtmlPart(20)
if(true && (marksInstance?.examDetails?.subject?.subjectName)) {
printHtmlPart(21)
expressionOut.print(marksInstance?.examDetails?.subject?.subjectName)
printHtmlPart(16)
}
printHtmlPart(20)
if(true && (marksInstance?.examDetails?.totalMarks)) {
printHtmlPart(22)
expressionOut.print(marksInstance?.examDetails?.totalMarks)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (marksInstance?.examDetails?.passMarks)) {
printHtmlPart(23)
expressionOut.print(marksInstance?.examDetails?.passMarks)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (marksInstance?.obtainedMarks)) {
printHtmlPart(24)
invokeTag('fieldValue','g',149,['bean':(marksInstance),'field':("obtainedMarks")],-1)
printHtmlPart(25)
}
printHtmlPart(26)
createTagBody(2, {->
printHtmlPart(27)
createTagBody(3, {->
printHtmlPart(28)
invokeTag('message','g',164,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(29)
})
invokeTag('link','g',165,['class':("btn yellow"),'action':("edit"),'id':(LookUpED.encod(marksInstance?.id))],3)
printHtmlPart(30)
invokeTag('actionSubmit','g',169,['class':("delete btn blue"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(31)
})
invokeTag('form','g',171,['url':([resource:marksInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(32)
invokeTag('render','g',190,['template':("/footer/footer")],-1)
printHtmlPart(33)
})
invokeTag('captureBody','sitemesh',234,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(34)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925994323L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
