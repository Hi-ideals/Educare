import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.institute.staff.Staff
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_examshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/exam/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',13,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',13,[:],2)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',41,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',47,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',50,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',59,['template':("/header/leftSide"),'model':([activ:[exams:'start active open',exam:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
invokeTag('message','g',73,['code':("default.home.label")],-1)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',77,['class':("list"),'action':("index")],2)
printHtmlPart(12)
createClosureForHtmlPart(13, 2)
invokeTag('link','g',81,['class':("create"),'action':("create")],2)
printHtmlPart(14)
if(true && (examInstance?.examName)) {
printHtmlPart(15)
invokeTag('message','g',106,['code':("exam.examName.label"),'default':("Exam Name")],-1)
printHtmlPart(16)
invokeTag('fieldValue','g',111,['bean':(examInstance),'field':("examName")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (examInstance?.examDetails)) {
printHtmlPart(19)
invokeTag('message','g',120,['code':("exam.examDetails.label"),'default':("Exam Details")],-1)
printHtmlPart(20)
for( e in (examInstance.examDetails) ) {
printHtmlPart(21)
createTagBody(4, {->
printHtmlPart(22)
expressionOut.print(e?.examDate?.encodeAsHTML())
printHtmlPart(23)
})
invokeTag('link','g',129,['controller':("examDetails"),'action':("show"),'id':(LookUpED.encod(e?.id))],4)
printHtmlPart(20)
}
printHtmlPart(24)
}
printHtmlPart(25)
createTagBody(2, {->
printHtmlPart(26)
createTagBody(3, {->
printHtmlPart(23)
invokeTag('message','g',145,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(27)
})
invokeTag('link','g',146,['class':("btn btn-warning"),'action':("edit"),'id':(LookUpED.encod(examInstance?.id))],3)
printHtmlPart(28)
invokeTag('actionSubmit','g',150,['class':("delete btn blue"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(29)
})
invokeTag('form','g',152,['url':([resource:examInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(30)
invokeTag('render','g',163,['template':("/footer/footer")],-1)
printHtmlPart(31)
})
invokeTag('captureBody','sitemesh',198,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(32)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926001004L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
