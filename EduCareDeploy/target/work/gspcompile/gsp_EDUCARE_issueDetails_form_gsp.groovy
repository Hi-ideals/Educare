import com.hiideals.institute.library.IssueDetails
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_issueDetails_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/issueDetails/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('getInstituite','regId',3,[:],-1)
printHtmlPart(1)
expressionOut.print(hasErrors(bean: issueDetailsInstance, field: 'studentId', 'error'))
printHtmlPart(2)
invokeTag('message','g',12,['code':("issueDetails.studentId.label"),'default':("Select issueDetails")],-1)
printHtmlPart(3)
if(true && (issueDetailsInstance?.studentId)) {
printHtmlPart(4)
}
else if(true && (issueDetailsInstance?.staffId)) {
printHtmlPart(5)
}
else {
printHtmlPart(6)
expressionOut.print(null)
printHtmlPart(7)
}
printHtmlPart(8)
expressionOut.print(hasErrors(bean: issueDetailsInstance, field: 'studentId', 'error'))
printHtmlPart(9)
invokeTag('message','g',41,['code':("issueDetails.studentId.label"),'default':("Student Name")],-1)
printHtmlPart(10)
for( c in (com.hiideals.instituite.student.Student.findAllByInstituite(instituite)) ) {
printHtmlPart(11)
if(true && (issueDetailsInstance?.studentId?.id == c.id)) {
printHtmlPart(12)
expressionOut.print(c.id)
printHtmlPart(13)
expressionOut.print(c.studentName)
printHtmlPart(14)
}
else {
printHtmlPart(12)
expressionOut.print(c.id)
printHtmlPart(15)
expressionOut.print(c.studentName)
printHtmlPart(14)
}
printHtmlPart(16)
}
printHtmlPart(17)
expressionOut.print(hasErrors(bean: issueDetailsInstance, field: 'staffId', 'error'))
printHtmlPart(18)
invokeTag('message','g',64,['code':("issueDetails.staffId.label"),'default':("Staff Name")],-1)
printHtmlPart(19)
for( c in (com.hiideals.institute.staff.Staff.findAllByInstitute(instituite)) ) {
printHtmlPart(20)
if(true && (issueDetailsInstance?.staffId?.id == c.id)) {
printHtmlPart(12)
expressionOut.print(c.id)
printHtmlPart(13)
expressionOut.print(c.staffName)
printHtmlPart(14)
}
else {
printHtmlPart(12)
expressionOut.print(c.id)
printHtmlPart(15)
expressionOut.print(c.staffName)
printHtmlPart(14)
}
printHtmlPart(16)
}
printHtmlPart(21)
expressionOut.print(hasErrors(bean: issueDetailsInstance, field: 'studentId', 'error'))
printHtmlPart(2)
invokeTag('message','g',90,['code':("issueDetails.studentId.label"),'default':("Select category")],-1)
printHtmlPart(22)
expressionOut.print(null)
printHtmlPart(23)
expressionOut.print(hasErrors(bean: issueDetailsInstance, field: 'magazineId', 'error'))
printHtmlPart(24)
invokeTag('message','g',115,['code':("issueDetails.magazineId.label"),'default':("Magazine name")],-1)
printHtmlPart(25)
if(true && (issueDetailsInstance.magazineId)) {
printHtmlPart(26)
expressionOut.print(issueDetailsInstance.magazineId)
printHtmlPart(27)
expressionOut.print(issueDetailsInstance.magazineId.magazineName)
printHtmlPart(28)
}
else {
printHtmlPart(26)
expressionOut.print(null)
printHtmlPart(29)
for( c in (com.hiideals.institute.library.Magazine.findAllByInstituite(instituite)) ) {
printHtmlPart(12)
expressionOut.print(c.id)
printHtmlPart(15)
expressionOut.print(c.magazineName)
printHtmlPart(14)
}
printHtmlPart(16)
}
printHtmlPart(30)
expressionOut.print(hasErrors(bean: issueDetailsInstance, field: 'booksId', 'error'))
printHtmlPart(31)
invokeTag('message','g',139,['code':("issueDetails.booksId.label"),'default':("Books name")],-1)
printHtmlPart(32)
for( c in (com.hiideals.institute.library.Books.findAllByInstituite(instituite)) ) {
printHtmlPart(11)
if(true && (issueDetailsInstance?.books?.contains(c))) {
printHtmlPart(12)
expressionOut.print(c.id)
printHtmlPart(13)
expressionOut.print(c. title)
printHtmlPart(14)
}
else {
printHtmlPart(12)
expressionOut.print(c.id)
printHtmlPart(15)
expressionOut.print(c. title)
printHtmlPart(14)
}
printHtmlPart(16)
}
printHtmlPart(33)
expressionOut.print(hasErrors(bean: issueDetailsInstance, field: 'newspaper', 'error'))
printHtmlPart(34)
invokeTag('message','g',158,['code':("issueDetails.newspaper.label"),'default':("Newspaper name")],-1)
printHtmlPart(35)
if(true && (issueDetailsInstance.newspaper)) {
printHtmlPart(26)
expressionOut.print(issueDetailsInstance.newspaper)
printHtmlPart(27)
expressionOut.print(issueDetailsInstance.newspaper.name)
printHtmlPart(28)
}
else {
printHtmlPart(36)
for( c in (com.hiideals.institute.library.Newspaper.findAllByInstituite(instituite)) ) {
printHtmlPart(12)
expressionOut.print(c.id)
printHtmlPart(15)
expressionOut.print(c.name)
printHtmlPart(14)
}
printHtmlPart(16)
}
printHtmlPart(37)
expressionOut.print(hasErrors(bean: issueDetailsInstance, field: 'dateOfIssue', 'error'))
printHtmlPart(38)
invokeTag('message','g',186,['code':("issueDetails.dateOfIssue.label"),'default':("dateOfIssue")],-1)
printHtmlPart(39)
invokeTag('datePicker','g',193,['name':("dateOfIssue"),'precision':("day"),'value':(new Date())],-1)
printHtmlPart(40)
expressionOut.print(hasErrors(bean: issueDetailsInstance, field: 'numberOfDays', 'error'))
printHtmlPart(41)
invokeTag('message','g',205,['code':("issueDetails.numberOfDays.label"),'default':("Number Of Days")],-1)
printHtmlPart(42)
invokeTag('field','g',209,['name':("numberOfDays"),'class':("form-control"),'type':("number"),'id':("numberOfDays"),'value':(issueDetailsInstance.numberOfDays),'required':("")],-1)
printHtmlPart(43)
invokeTag('message','g',215,['code':("issueDetails.instituite.label"),'default':("Instituite")],-1)
printHtmlPart(44)
expressionOut.print(hasErrors(bean: issueDetailsInstance, field: 'instituite', 'error'))
printHtmlPart(45)
invokeTag('textField','g',223,['name':("instituite"),'required':(""),'class':("form-control"),'type':("hidden"),'value':(instituite?.id)],-1)
printHtmlPart(46)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925997723L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
