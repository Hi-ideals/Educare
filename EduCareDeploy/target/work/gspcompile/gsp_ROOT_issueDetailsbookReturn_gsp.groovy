import com.hiideals.institute.library.IssueDetails
import com.hiideals.instituite.student.Student
import com.hiideals.institute.staff.Staff
import com.hiideals.instituite.student.Student
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_issueDetailsbookReturn_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/issueDetails/bookReturn.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',18,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',18,[:],2)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',19,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',20,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',21,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',22,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',57,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',66,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',70,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',81,['template':("/header/leftSide"),'model':([activ:[LibraryManagement:'start active open',Bookretuen:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
invokeTag('message','g',97,['code':("default.home.label")],-1)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',99,['class':("list"),'action':("index")],2)
printHtmlPart(12)
if(true && (flash.message)) {
printHtmlPart(13)
expressionOut.print(flash.message)
printHtmlPart(14)
}
printHtmlPart(15)
if(true && (flash.message)) {
printHtmlPart(16)
expressionOut.print(flash.message)
printHtmlPart(17)
}
printHtmlPart(18)
createTagBody(2, {->
printHtmlPart(19)
createTagBody(3, {->
printHtmlPart(20)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(21)
expressionOut.print(error.field)
printHtmlPart(22)
}
printHtmlPart(23)
invokeTag('message','g',130,['error':(error)],-1)
printHtmlPart(24)
})
invokeTag('eachError','g',130,['bean':(issueDetailsInstance),'var':("error")],3)
printHtmlPart(25)
})
invokeTag('hasErrors','g',131,['bean':(issueDetailsInstance)],2)
printHtmlPart(26)
createTagBody(2, {->
printHtmlPart(27)
invokeTag('message','g',145,['code':("issueDetails.studentId.label"),'default':("Student name")],-1)
printHtmlPart(28)
expressionOut.print(hasErrors(bean: issueDetailsInstance, field: 'studentId', 'error'))
printHtmlPart(29)
expressionOut.print(null)
printHtmlPart(30)
for( _it978105475 in (studentlist) ) {
changeItVariable(_it978105475)
printHtmlPart(31)
expressionOut.print(it.id)
printHtmlPart(32)
expressionOut.print(it.studentName)
printHtmlPart(33)
}
printHtmlPart(34)
expressionOut.print(hasErrors(bean: issueDetailsInstance, field: 'studentId', 'error'))
printHtmlPart(35)
invokeTag('message','g',168,['code':("issueDetails.studentId.label"),'default':("Select category")],-1)
printHtmlPart(36)
expressionOut.print(null)
printHtmlPart(37)
invokeTag('message','g',191,['code':("issueDetails.newspaper.label"),'default':("magazine Name")],-1)
printHtmlPart(38)
expressionOut.print(hasErrors(bean: issueDetailsInstance, field: 'magazineId', 'error'))
printHtmlPart(39)
for( _it1299647437 in (com.hiideals.institute.library.Magazine.list()) ) {
changeItVariable(_it1299647437)
printHtmlPart(40)
expressionOut.print(it.id)
printHtmlPart(41)
expressionOut.print(it.magazineName)
printHtmlPart(42)
}
printHtmlPart(43)
invokeTag('message','g',219,['code':("issueDetails.newspaper.label"),'default':("Newspaper name")],-1)
printHtmlPart(44)
expressionOut.print(hasErrors(bean: issueDetailsInstance, field: 'newspaper', 'error'))
printHtmlPart(45)
for( _it266426100 in (com.hiideals.institute.library.Newspaper.list()) ) {
changeItVariable(_it266426100)
printHtmlPart(40)
expressionOut.print(it.id)
printHtmlPart(41)
expressionOut.print(it.name)
printHtmlPart(42)
}
printHtmlPart(46)
invokeTag('message','g',242,['code':("issueDetails.booksId.label"),'default':("Books name")],-1)
printHtmlPart(47)
expressionOut.print(hasErrors(bean: issueDetailsInstance, field: 'booksId', 'error'))
printHtmlPart(48)
for( c in (com.hiideals.institute.library.Books.list()) ) {
printHtmlPart(40)
expressionOut.print(c.id)
printHtmlPart(41)
expressionOut.print(c.title)
printHtmlPart(49)
}
printHtmlPart(50)
invokeTag('message','g',266,['code':("issueDetails.fineAmount.label"),'default':("Fine Amount")],-1)
printHtmlPart(51)
expressionOut.print(hasErrors(bean: issueDetailsInstance, field: 'fineAmount', 'error'))
printHtmlPart(52)
invokeTag('submitButton','g',278,['name':("ReturnBoook"),'controller':("issueDetails"),'class':("btn blue"),'value':("Return Book")],-1)
printHtmlPart(53)
})
invokeTag('form','g',278,['url':([controller:issueDetails, action:'returnBook'])],2)
printHtmlPart(54)
invokeTag('render','g',284,['template':("/footer/footer")],-1)
printHtmlPart(55)
})
invokeTag('captureBody','sitemesh',371,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(56)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925997688L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
