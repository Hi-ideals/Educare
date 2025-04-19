import com.hiideals.instituite.student.Student
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_marksgetExamTTPrint_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/marks/getExamTTPrint.gsp" }
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
createTagBody(3, {->
printHtmlPart(2)
expressionOut.print(studentInstance?.studentName)
})
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
invokeTag('captureHead','sitemesh',67,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',73,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',75,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('getImage','images',98,['id':(instituite?.logo?.id),'width':("60px"),'height':("60px")],-1)
printHtmlPart(8)
expressionOut.print(instituite?.name)
printHtmlPart(9)
expressionOut.print(instituite?.affiliatedTo)
printHtmlPart(10)
expressionOut.print(instituite?.hsno)
printHtmlPart(11)
expressionOut.print(instituite?.street)
printHtmlPart(12)
expressionOut.print(instituite?.city)
printHtmlPart(13)
expressionOut.print(instituite?.pinCode)
printHtmlPart(11)
expressionOut.print(instituite?.state)
printHtmlPart(12)
expressionOut.print(instituite?.country)
printHtmlPart(14)
expressionOut.print(instituite?.phone)
printHtmlPart(15)
expressionOut.print(exams?.examName)
printHtmlPart(16)
invokeTag('message','g',132,['code':("examDetails.examDate.label"),'default':("Exam Date")],-1)
printHtmlPart(17)
invokeTag('message','g',136,['code':("examDetails.examDuration.label"),'default':("Exam Duration")],-1)
printHtmlPart(17)
invokeTag('message','g',139,['code':("examDetails.iclass.label"),'default':("Class")],-1)
printHtmlPart(17)
invokeTag('message','g',143,['code':("examDetails.passMarks.label"),'default':("Pass Marks")],-1)
printHtmlPart(17)
invokeTag('message','g',146,['code':("examDetails.subject.label"),'default':("Subject")],-1)
printHtmlPart(17)
invokeTag('message','g',150,['code':("examDetails.totalMarks.label"),'default':("Total Marks")],-1)
printHtmlPart(18)
loop:{
int i = 0
for( examDetailsInstance in (examDetails) ) {
printHtmlPart(19)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(20)
invokeTag('formatDate','g',161,['date':(examDetailsInstance?.examDate),'type':("date"),'style':("LONG"),'timeStyle':("SHORT")],-1)
printHtmlPart(21)
expressionOut.print(fieldValue(bean: examDetailsInstance, field: "examDuration"))
printHtmlPart(22)
expressionOut.print(fieldValue(bean: examDetailsInstance, field: "iclass.classname"))
printHtmlPart(22)
expressionOut.print(fieldValue(bean: examDetailsInstance, field: "passMarks"))
printHtmlPart(22)
expressionOut.print(fieldValue(bean: examDetailsInstance, field: "subject.subjectName"))
printHtmlPart(22)
expressionOut.print(fieldValue(bean: examDetailsInstance, field: "totalMarks"))
printHtmlPart(23)
i++
}
}
printHtmlPart(24)
invokeTag('render','g',235,['template':("/footer/footer")],-1)
printHtmlPart(25)
})
invokeTag('captureBody','sitemesh',263,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(26)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925994319L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
