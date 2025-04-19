import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.institute.staff.Staff
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_examDetailsshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/examDetails/show.gsp" }
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
invokeTag('captureHead','sitemesh',43,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',49,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',53,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',62,['template':("/header/leftSide"),'model':([activ:[exams:'start active open',examDetails:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
invokeTag('message','g',76,['code':("default.home.label")],-1)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',78,['class':("list"),'action':("index")],2)
printHtmlPart(12)
createClosureForHtmlPart(13, 2)
invokeTag('link','g',80,['class':("create"),'action':("create")],2)
printHtmlPart(14)
if(true && (examDetailsInstance?.examDate)) {
printHtmlPart(15)
invokeTag('message','g',94,['code':("examDetails.examDate.label"),'default':("Exam Date")],-1)
printHtmlPart(16)
invokeTag('formatDate','g',98,['date':(examDetailsInstance?.examDate)],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (examDetailsInstance?.examDuration)) {
printHtmlPart(19)
invokeTag('message','g',108,['code':("examDetails.examDuration.label"),'default':("Exam Duration")],-1)
printHtmlPart(20)
invokeTag('fieldValue','g',113,['bean':(examDetailsInstance),'field':("examDuration")],-1)
printHtmlPart(17)
}
printHtmlPart(21)
if(true && (examDetailsInstance?.iclass)) {
printHtmlPart(22)
invokeTag('message','g',125,['code':("examDetails.iclass.label"),'default':("Iclass")],-1)
printHtmlPart(23)
createTagBody(3, {->
printHtmlPart(24)
expressionOut.print(examDetailsInstance?.iclass?.classname?.encodeAsHTML())
printHtmlPart(25)
})
invokeTag('link','g',132,['controller':("IClass"),'action':("show"),'id':(examDetailsInstance?.iclass?.id)],3)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (examDetailsInstance?.passMarks)) {
printHtmlPart(26)
invokeTag('message','g',141,['code':("examDetails.passMarks.label"),'default':("Pass Marks")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',145,['bean':(examDetailsInstance),'field':("passMarks")],-1)
printHtmlPart(17)
}
printHtmlPart(28)
if(true && (examDetailsInstance?.subject)) {
printHtmlPart(29)
invokeTag('message','g',158,['code':("examDetails.subject.label"),'default':("Subject")],-1)
printHtmlPart(30)
createTagBody(3, {->
printHtmlPart(24)
expressionOut.print(examDetailsInstance?.subject?.subjectName?.encodeAsHTML())
printHtmlPart(25)
})
invokeTag('link','g',165,['controller':("subject"),'action':("show"),'id':(examDetailsInstance?.subject?.id)],3)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (examDetailsInstance?.totalMarks)) {
printHtmlPart(31)
invokeTag('message','g',174,['code':("examDetails.totalMarks.label"),'default':("Total Marks")],-1)
printHtmlPart(32)
invokeTag('fieldValue','g',178,['bean':(examDetailsInstance),'field':("totalMarks")],-1)
printHtmlPart(17)
}
printHtmlPart(28)
if(true && (examDetailsInstance?.year)) {
printHtmlPart(33)
invokeTag('message','g',191,['code':("examDetails.year.label"),'default':("Year")],-1)
printHtmlPart(34)
createTagBody(3, {->
printHtmlPart(24)
expressionOut.print(examDetailsInstance?.year?.batchName?.encodeAsHTML())
printHtmlPart(25)
})
invokeTag('link','g',198,['controller':("batch"),'action':("show"),'id':(examDetailsInstance?.year?.id)],3)
printHtmlPart(17)
}
printHtmlPart(35)
createTagBody(2, {->
printHtmlPart(36)
createTagBody(3, {->
printHtmlPart(37)
invokeTag('message','g',211,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(38)
})
invokeTag('link','g',212,['class':("edit"),'action':("edit"),'id':(LookUpED.encod(examDetailsInstance.id))],3)
printHtmlPart(39)
invokeTag('actionSubmit','g',216,['class':("delete btn blue"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(40)
})
invokeTag('form','g',218,['url':([resource:examDetailsInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(41)
invokeTag('render','g',226,['template':("/footer/footer")],-1)
printHtmlPart(42)
})
invokeTag('captureBody','sitemesh',270,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(43)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926001884L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
