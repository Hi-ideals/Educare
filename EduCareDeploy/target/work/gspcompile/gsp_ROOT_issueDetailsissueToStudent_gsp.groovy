import com.hiideals.institute.library.IssueDetails
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_issueDetailsissueToStudent_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/issueDetails/issueToStudent.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',15,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',15,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',18,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',19,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',54,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',63,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',67,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',78,['template':("/header/leftSide"),'model':([activ:[LibraryManagement:'start active open',issueDetails:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
invokeTag('message','g',91,['code':("default.home.label")],-1)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',93,['class':("list"),'action':("studentDetails")],2)
printHtmlPart(12)
if(true && (flash.message)) {
printHtmlPart(13)
expressionOut.print(flash.message)
printHtmlPart(14)
}
printHtmlPart(15)
createTagBody(2, {->
printHtmlPart(16)
createTagBody(3, {->
printHtmlPart(17)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(18)
expressionOut.print(error.field)
printHtmlPart(19)
}
printHtmlPart(20)
invokeTag('message','g',113,['error':(error)],-1)
printHtmlPart(21)
})
invokeTag('eachError','g',114,['bean':(issueDetailsInstance),'var':("error")],3)
printHtmlPart(22)
})
invokeTag('hasErrors','g',116,['bean':(issueDetailsInstance)],2)
printHtmlPart(23)
createTagBody(2, {->
printHtmlPart(24)
invokeTag('getInstituite','regId',129,[:],-1)
printHtmlPart(25)
expressionOut.print(hasErrors(bean: issueDetailsInstance, field: 'studentId', 'error'))
printHtmlPart(26)
invokeTag('message','g',139,['code':("issueDetails.studentId.label"),'default':("Select issueDetails")],-1)
printHtmlPart(27)
expressionOut.print(hasErrors(bean: issueDetailsInstance, field: 'studentId', 'error'))
printHtmlPart(28)
invokeTag('message','g',165,['code':("issueDetails.studentId.label"),'default':("Student Name")],-1)
printHtmlPart(29)
for( c in (com.hiideals.instituite.student.Student.findAllByInstituite(instituite)) ) {
printHtmlPart(30)
if(true && (issueDetailsInstance?.studentId?.id == c.id)) {
printHtmlPart(31)
expressionOut.print(c.id)
printHtmlPart(32)
expressionOut.print(c.studentName)
printHtmlPart(33)
}
else {
printHtmlPart(31)
expressionOut.print(c.id)
printHtmlPart(34)
expressionOut.print(c.studentName)
printHtmlPart(33)
}
printHtmlPart(35)
}
printHtmlPart(36)
expressionOut.print(hasErrors(bean: issueDetailsInstance, field: 'staffId', 'error'))
printHtmlPart(37)
invokeTag('message','g',196,['code':("issueDetails.staffId.label"),'default':("Staff Name")],-1)
printHtmlPart(38)
for( c in (com.hiideals.institute.staff.Staff.findAllByInstitute(instituite)) ) {
printHtmlPart(39)
if(true && (issueDetailsInstance?.staffId?.id == c.id)) {
printHtmlPart(31)
expressionOut.print(c.id)
printHtmlPart(32)
expressionOut.print(c.staffName)
printHtmlPart(33)
}
else {
printHtmlPart(31)
expressionOut.print(c.id)
printHtmlPart(34)
expressionOut.print(c.staffName)
printHtmlPart(33)
}
printHtmlPart(35)
}
printHtmlPart(40)
expressionOut.print(hasErrors(bean: issueDetailsInstance, field: 'studentId', 'error'))
printHtmlPart(26)
invokeTag('message','g',223,['code':("issueDetails.studentId.label"),'default':("Select category")],-1)
printHtmlPart(41)
expressionOut.print(null)
printHtmlPart(42)
expressionOut.print(hasErrors(bean: issueDetailsInstance, field: 'magazineId', 'error'))
printHtmlPart(43)
invokeTag('message','g',248,['code':("issueDetails.magazineId.label"),'default':("Magazine name")],-1)
printHtmlPart(44)
if(true && (issueDetailsInstance?.magazineId)) {
printHtmlPart(45)
expressionOut.print(issueDetailsInstance?.magazineId)
printHtmlPart(46)
expressionOut.print(issueDetailsInstance.magazineId?.magazineName)
printHtmlPart(47)
}
else {
printHtmlPart(45)
expressionOut.print(null)
printHtmlPart(48)
for( c in (com.hiideals.institute.library.Magazine.findAllByInstituite(instituite)) ) {
printHtmlPart(31)
expressionOut.print(c.id)
printHtmlPart(34)
expressionOut.print(c.magazineName)
printHtmlPart(33)
}
printHtmlPart(35)
}
printHtmlPart(49)
expressionOut.print(hasErrors(bean: issueDetailsInstance, field: 'booksId', 'error'))
printHtmlPart(50)
invokeTag('message','g',274,['code':("issueDetails.booksId.label"),'default':("Books name")],-1)
printHtmlPart(51)
for( c in (com.hiideals.institute.library.Books.findAllByInstituite(instituite)) ) {
printHtmlPart(30)
if(true && (issueDetailsInstance?.books?.contains(c))) {
printHtmlPart(31)
expressionOut.print(c.id)
printHtmlPart(32)
expressionOut.print(c. title)
printHtmlPart(33)
}
else {
printHtmlPart(31)
expressionOut.print(c.id)
printHtmlPart(34)
expressionOut.print(c. title)
printHtmlPart(33)
}
printHtmlPart(35)
}
printHtmlPart(52)
expressionOut.print(hasErrors(bean: issueDetailsInstance, field: 'newspaper', 'error'))
printHtmlPart(53)
invokeTag('message','g',307,['code':("issueDetails.newspaper.label"),'default':("Newspaper name")],-1)
printHtmlPart(54)
if(true && (issueDetailsInstance?.newspaper)) {
printHtmlPart(45)
expressionOut.print(issueDetailsInstance?.newspaper)
printHtmlPart(46)
expressionOut.print(issueDetailsInstance.newspaper?.name)
printHtmlPart(47)
}
else {
printHtmlPart(55)
for( c in (com.hiideals.institute.library.Newspaper.findAllByInstituite(instituite)) ) {
printHtmlPart(31)
expressionOut.print(c.id)
printHtmlPart(34)
expressionOut.print(c.name)
printHtmlPart(33)
}
printHtmlPart(35)
}
printHtmlPart(56)
expressionOut.print(hasErrors(bean: issueDetailsInstance, field: 'dateOfIssue', 'error'))
printHtmlPart(57)
invokeTag('message','g',339,['code':("issueDetails.dateOfIssue.label"),'default':("dateOfIssue")],-1)
printHtmlPart(58)
invokeTag('datePicker','g',343,['name':("dateOfIssue"),'precision':("day"),'value':(new Date())],-1)
printHtmlPart(59)
expressionOut.print(hasErrors(bean: issueDetailsInstance, field: 'numberOfDays', 'error'))
printHtmlPart(60)
invokeTag('message','g',349,['code':("issueDetails.numberOfDays.label"),'default':("Number Of Days")],-1)
printHtmlPart(61)
invokeTag('field','g',356,['name':("numberOfDays"),'class':("form-control"),'type':("number"),'id':("numberOfDays"),'value':(issueDetailsInstance?.numberOfDays),'required':("")],-1)
printHtmlPart(62)
invokeTag('message','g',372,['code':("issueDetails.instituite.label"),'default':("Instituite")],-1)
printHtmlPart(63)
expressionOut.print(hasErrors(bean: issueDetailsInstance, field: 'instituite', 'error'))
printHtmlPart(64)
invokeTag('textField','g',383,['name':("instituite"),'required':(""),'class':("form-control"),'type':("hidden"),'value':(instituite?.id)],-1)
printHtmlPart(65)
invokeTag('submitButton','g',396,['name':("create"),'class':("btn blue"),'id':("student1"),'value':(message(code: 'default.button.create.label', default: 'Create'))],-1)
printHtmlPart(66)
})
invokeTag('form','g',396,['url':([resource:issueDetailsInstance, action:'save'])],2)
printHtmlPart(67)
invokeTag('render','g',399,['template':("/footer/footer")],-1)
printHtmlPart(68)
})
invokeTag('captureBody','sitemesh',511,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(69)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925997750L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
