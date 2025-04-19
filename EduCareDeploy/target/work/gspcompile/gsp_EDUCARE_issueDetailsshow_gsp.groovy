import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.institute.staff.Staff
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_issueDetailsshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/issueDetails/show.gsp" }
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
invokeTag('captureHead','sitemesh',44,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',53,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',57,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',68,['template':("/header/leftSide"),'model':([activ:[LibraryManagement:'start active open',issueDetails:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
invokeTag('message','g',81,['code':("default.home.label")],-1)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',83,['class':("list"),'action':("index")],2)
printHtmlPart(12)
createClosureForHtmlPart(13, 2)
invokeTag('link','g',85,['class':("create"),'action':("create")],2)
printHtmlPart(14)
if(true && (flash.message)) {
printHtmlPart(15)
expressionOut.print(flash.message)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (issueDetailsInstance?.studentId)) {
printHtmlPart(18)
invokeTag('message','g',109,['code':("issueDetails.studentId.label"),'default':("Student Id")],-1)
printHtmlPart(19)
createTagBody(3, {->
printHtmlPart(20)
expressionOut.print(issueDetailsInstance?.studentId?.studentName?.encodeAsHTML())
printHtmlPart(21)
})
invokeTag('link','g',117,['controller':("student"),'action':("show"),'id':(LookUpED.encod(issueDetailsInstance?.studentId?.id))],3)
printHtmlPart(22)
}
printHtmlPart(23)
if(true && (issueDetailsInstance?.staffId)) {
printHtmlPart(24)
invokeTag('message','g',125,['code':("issueDetails.staffId.label"),'default':("Staff Id")],-1)
printHtmlPart(25)
createTagBody(3, {->
printHtmlPart(20)
expressionOut.print(issueDetailsInstance?.staffId?.staffName?.encodeAsHTML())
printHtmlPart(21)
})
invokeTag('link','g',133,['controller':("staff"),'action':("show"),'id':(issueDetailsInstance?.staffId?.id)],3)
printHtmlPart(22)
}
printHtmlPart(26)
if(true && (issueDetailsInstance?.books)) {
printHtmlPart(27)
invokeTag('message','g',140,['code':("issueDetails.booksId.label"),'default':("Books")],-1)
printHtmlPart(28)
for( b in (issueDetailsInstance.books) ) {
printHtmlPart(29)
createTagBody(4, {->
printHtmlPart(30)
expressionOut.print(b?.title?.encodeAsHTML())
printHtmlPart(31)
})
invokeTag('link','g',148,['controller':("books"),'action':("show"),'id':(b.id)],4)
printHtmlPart(32)
}
printHtmlPart(33)
}
printHtmlPart(23)
if(true && (issueDetailsInstance?.magazineId)) {
printHtmlPart(34)
invokeTag('message','g',158,['code':("issueDetails.magazineId.label"),'default':("Magazine Id")],-1)
printHtmlPart(35)
createTagBody(3, {->
printHtmlPart(20)
expressionOut.print(issueDetailsInstance?.magazineId?.magazineName?.encodeAsHTML())
printHtmlPart(21)
})
invokeTag('link','g',165,['controller':("magazine"),'action':("show"),'id':(issueDetailsInstance?.magazineId?.id)],3)
printHtmlPart(22)
}
printHtmlPart(23)
if(true && (issueDetailsInstance?.newspaper)) {
printHtmlPart(36)
invokeTag('message','g',173,['code':("issueDetails.newspaper.label"),'default':("Newspaper")],-1)
printHtmlPart(37)
createTagBody(3, {->
printHtmlPart(20)
expressionOut.print(issueDetailsInstance?.newspaper?.name?.encodeAsHTML())
printHtmlPart(21)
})
invokeTag('link','g',181,['controller':("newspaper"),'action':("show"),'id':(issueDetailsInstance?.newspaper?.id)],3)
printHtmlPart(22)
}
printHtmlPart(23)
if(true && (issueDetailsInstance?.returndate)) {
printHtmlPart(38)
invokeTag('message','g',190,['code':("issueDetails.returndate.label"),'default':("Return date")],-1)
printHtmlPart(39)
invokeTag('formatDate','g',194,['date':(issueDetailsInstance?.returndate)],-1)
printHtmlPart(40)
}
printHtmlPart(23)
if(true && (issueDetailsInstance?.issuedate)) {
printHtmlPart(41)
invokeTag('message','g',205,['code':("issueDetails.issuedate.label"),'default':("Issue Date")],-1)
printHtmlPart(42)
invokeTag('formatDate','g',210,['date':(issueDetailsInstance?.issuedate)],-1)
printHtmlPart(22)
}
printHtmlPart(23)
if(true && (issueDetailsInstance?.numberOfDays)) {
printHtmlPart(43)
invokeTag('message','g',219,['code':("issueDetails.numberOfDays.label"),'default':("NoOfDays")],-1)
printHtmlPart(44)
invokeTag('fieldValue','g',223,['bean':(issueDetailsInstance),'field':("numberOfDays")],-1)
printHtmlPart(45)
}
printHtmlPart(46)
createTagBody(2, {->
printHtmlPart(47)
createTagBody(3, {->
printHtmlPart(21)
invokeTag('message','g',238,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(48)
})
invokeTag('link','g',239,['class':("btn yellow"),'action':("edit"),'id':(LookUpED.encod(issueDetailsInstance.id))],3)
printHtmlPart(49)
invokeTag('actionSubmit','g',243,['class':("btn red"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(50)
})
invokeTag('form','g',245,['url':([resource:issueDetailsInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(51)
invokeTag('render','g',257,['template':("/footer/footer")],-1)
printHtmlPart(52)
})
invokeTag('captureBody','sitemesh',295,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(53)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925997717L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
