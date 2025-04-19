import com.hiideals.instituite.classcourses.IClass
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_issuedBooksissuedStudents_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/issuedBooks/issuedStudents.gsp" }
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
invokeTag('captureHead','sitemesh',62,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',70,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',73,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',83,['template':("/header/leftSide"),'model':([activ:[BooksReport:'start active open',issuedStudentss:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
for( _it1474657733 in (issuedToStudents) ) {
changeItVariable(_it1474657733)
printHtmlPart(10)
expressionOut.print(it.books?.accessionNumber.toString().replace('[', '').replace(']', ''))
printHtmlPart(11)
expressionOut.print(it.studentId.studentId)
printHtmlPart(11)
expressionOut.print(it.studentId?.presentclass?.classID)
printHtmlPart(11)
expressionOut.print(it.studentId.studentName)
printHtmlPart(12)
expressionOut.print(it.books?.title.toString().replace('[', '').replace(']', ''))
printHtmlPart(11)
expressionOut.print(it.dateOfIssue)
printHtmlPart(11)
expressionOut.print(it.dateOfReturn)
printHtmlPart(13)
}
printHtmlPart(14)
createClosureForHtmlPart(15, 2)
invokeTag('link','g',155,['class':("btn blue"),'controller':("issuedBooks"),'action':("booksIssuedstudents"),'target':("_blank")],2)
printHtmlPart(16)
invokeTag('render','g',165,['template':("/footer/footer")],-1)
printHtmlPart(17)
})
invokeTag('captureBody','sitemesh',285,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925993070L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
