import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_issueDetailsStudentstudentnewsreport_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/issueDetailsStudent/studentnewsreport.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
printHtmlPart(1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',17,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',17,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',18,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',19,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',20,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',21,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',56,[:],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
invokeTag('render','g',65,['template':("/header/logo")],-1)
printHtmlPart(7)
invokeTag('render','g',69,['template':("/header/topBar")],-1)
printHtmlPart(8)
invokeTag('render','g',80,['template':("/header/leftSide"),'model':([activ:[BooksReport:'start active open',issueDetailsStudentNewspaper:'active']])],-1)
printHtmlPart(9)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(10)
invokeTag('message','g',91,['code':("default.home.label")],-1)
printHtmlPart(11)
loop:{
int j = 0
for( c in (issudetail) ) {
printHtmlPart(12)
expressionOut.print(c?.studentId?.studentId)
printHtmlPart(13)
expressionOut.print(c?.studentId?.studentName)
printHtmlPart(13)
expressionOut.print(c?.newspaper?.name)
printHtmlPart(14)
invokeTag('formatDate','g',128,['date':(c?.issuedate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(15)
invokeTag('formatDate','g',130,['date':(c?.returndate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(16)
j++
}
}
printHtmlPart(17)
invokeTag('render','g',152,['template':("/footer/footer")],-1)
printHtmlPart(18)
})
invokeTag('captureBody','sitemesh',198,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926004832L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
