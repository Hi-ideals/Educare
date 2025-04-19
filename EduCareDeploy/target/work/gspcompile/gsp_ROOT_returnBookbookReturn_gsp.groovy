import com.hiideals.institute.library.IssueDetails
import com.hiideals.instituite.student.Student
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_returnBookbookReturn_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/returnBook/bookReturn.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',5,['var':("entityName"),'value':(message(code: 'issueDetails.label', default: 'IssueDetails'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',6,['code':("default.create.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',7,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('message','g',9,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(4)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(5)
invokeTag('message','g',12,['code':("default.home.label")],-1)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',13,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',13,['class':("list"),'action':("index")],2)
printHtmlPart(7)
invokeTag('message','g',17,['code':("default.create.label"),'args':([entityName])],-1)
printHtmlPart(8)
if(true && (flash.message)) {
printHtmlPart(9)
expressionOut.print(flash.message)
printHtmlPart(10)
}
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(12)
createTagBody(3, {->
printHtmlPart(13)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(14)
expressionOut.print(error.field)
printHtmlPart(15)
}
printHtmlPart(16)
invokeTag('message','g',24,['error':(error)],-1)
printHtmlPart(17)
})
invokeTag('eachError','g',25,['bean':(issueDetailsInstance),'var':("error")],3)
printHtmlPart(18)
})
invokeTag('hasErrors','g',27,['bean':(issueDetailsInstance)],2)
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(19)
printHtmlPart(20)
printHtmlPart(21)
expressionOut.print(hasErrors(bean: issueDetailsInstance, field: 'studentId', 'error'))
printHtmlPart(22)
invokeTag('message','g',44,['code':("issueDetails.studentId.label"),'default':("Student Id")],-1)
printHtmlPart(23)
expressionOut.print(null)
printHtmlPart(24)
for( _it1610869600 in (Student.list()) ) {
changeItVariable(_it1610869600)
printHtmlPart(25)
expressionOut.print(it.id)
printHtmlPart(26)
expressionOut.print(it.studentName)
printHtmlPart(27)
}
printHtmlPart(28)
expressionOut.print(hasErrors(bean: issueDetailsInstance, field: 'staffId', 'error'))
printHtmlPart(29)
invokeTag('message','g',60,['code':("issueDetails.staffId.label"),'default':("Staff Id")],-1)
printHtmlPart(30)
expressionOut.print(null)
printHtmlPart(24)
for( _it1461595925 in (com.hiideals.institute.staff.Staff.list()) ) {
changeItVariable(_it1461595925)
printHtmlPart(25)
expressionOut.print(it.id)
printHtmlPart(26)
expressionOut.print(it.staffName)
printHtmlPart(31)
}
printHtmlPart(32)
expressionOut.print(hasErrors(bean: issueDetailsInstance, field: 'booksId', 'error'))
printHtmlPart(33)
invokeTag('message','g',78,['code':("issueDetails.booksId.label"),'default':("Books Id")],-1)
printHtmlPart(34)
for( c in (com.hiideals.institute.library.Books.list()) ) {
printHtmlPart(25)
expressionOut.print(c.id)
printHtmlPart(26)
expressionOut.print(c.title)
printHtmlPart(31)
}
printHtmlPart(28)
expressionOut.print(hasErrors(bean: issueDetailsInstance, field: 'magazineId', 'error'))
printHtmlPart(35)
invokeTag('message','g',95,['code':("issueDetails.newspaper.label"),'default':("magazineId")],-1)
printHtmlPart(36)
for( _it626137117 in (com.hiideals.institute.library.Magazine.list()) ) {
changeItVariable(_it626137117)
printHtmlPart(25)
expressionOut.print(it.id)
printHtmlPart(26)
expressionOut.print(it.magazineName)
printHtmlPart(27)
}
printHtmlPart(32)
expressionOut.print(hasErrors(bean: issueDetailsInstance, field: 'newspaper', 'error'))
printHtmlPart(37)
invokeTag('message','g',112,['code':("issueDetails.newspaper.label"),'default':("Newspaper")],-1)
printHtmlPart(38)
for( _it1373240624 in (com.hiideals.institute.library.Newspaper.list()) ) {
changeItVariable(_it1373240624)
printHtmlPart(25)
expressionOut.print(it.id)
printHtmlPart(26)
expressionOut.print(it.name)
printHtmlPart(27)
}
printHtmlPart(39)
invokeTag('submitButton','g',128,['name':("ReturnBoook"),'class':("save"),'value':("Return Book")],-1)
printHtmlPart(40)
})
invokeTag('form','g',130,['url':([resource:issueDetailsInstance, action:'save'])],2)
printHtmlPart(41)
})
invokeTag('captureBody','sitemesh',132,[:],1)
printHtmlPart(42)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925996478L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
