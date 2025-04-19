import com.hiideals.instituite.student.Student
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_issueDetailsStudentstudentnewspaperprint_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/issueDetailsStudent/studentnewspaperprint.gsp" }
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
invokeTag('captureHead','sitemesh',66,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',75,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',78,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('getImage','images',98,['id':(instituite?.logo?.id),'width':("100px")],-1)
printHtmlPart(8)
expressionOut.print(instituite?.name)
printHtmlPart(9)
expressionOut.print(instituite?.affiliatedTo)
printHtmlPart(10)
expressionOut.print(instituite?.hsno)
printHtmlPart(11)
expressionOut.print(instituite?.street)
printHtmlPart(11)
expressionOut.print(instituite?.city)
printHtmlPart(12)
expressionOut.print(instituite?.pinCode)
printHtmlPart(13)
expressionOut.print(instituite?.state)
printHtmlPart(11)
expressionOut.print(instituite?.country)
printHtmlPart(14)
expressionOut.print(instituite?.phone)
printHtmlPart(15)
loop:{
int j = 0
for( c in (issudetail) ) {
printHtmlPart(16)
expressionOut.print(c?.studentId?.studentId)
printHtmlPart(17)
expressionOut.print(c?.studentId?.studentName)
printHtmlPart(17)
expressionOut.print(c?.newspaper?.name)
printHtmlPart(18)
invokeTag('formatDate','g',150,['date':(c?.issuedate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(19)
invokeTag('formatDate','g',152,['date':(c?.returndate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(20)
expressionOut.print(c?.returned)
printHtmlPart(21)
j++
}
}
printHtmlPart(22)
invokeTag('render','g',204,['template':("/footer/footer")],-1)
printHtmlPart(23)
})
invokeTag('captureBody','sitemesh',231,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(24)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926004793L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
