import com.hiideals.institute.staff.Staff
import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.instituite.helper.Batch
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_issueDetailsindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/issueDetails/index.gsp" }
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
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',16,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',16,[:],2)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',18,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',19,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',20,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',55,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',65,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',69,['template':("/header/topBar")],-1)
printHtmlPart(7)
if(true && (params.staff)) {
printHtmlPart(8)
invokeTag('render','g',82,['template':("/header/leftSide"),'model':([activ:[LibraryManagement:'start active open',staffissueDetails:'active']])],-1)
printHtmlPart(9)
}
else {
printHtmlPart(8)
invokeTag('render','g',86,['template':("/header/leftSide"),'model':([activ:[LibraryManagement:'start active open',issueDetails:'active']])],-1)
printHtmlPart(9)
}
printHtmlPart(10)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(11)
invokeTag('message','g',101,['code':("default.home.label")],-1)
printHtmlPart(12)
if(true && (params.staff)) {
printHtmlPart(13)
createClosureForHtmlPart(14, 3)
invokeTag('link','g',104,['class':("create"),'action':("create"),'params':([staff:params.staff])],3)
printHtmlPart(15)
}
else {
printHtmlPart(13)
createClosureForHtmlPart(16, 3)
invokeTag('link','g',106,['class':("create"),'action':("create")],3)
printHtmlPart(15)
}
printHtmlPart(17)
if(true && (flash.message)) {
printHtmlPart(18)
expressionOut.print(flash.message)
printHtmlPart(19)
}
printHtmlPart(20)
expressionOut.print(activeMap?.getAt('books'))
printHtmlPart(21)
expressionOut.print(activeMap?.getAt('newspaper'))
printHtmlPart(22)
expressionOut.print(activeMap?.getAt('magazin'))
printHtmlPart(23)
expressionOut.print(activeMap?.getAt('books'))
printHtmlPart(24)
if(true && (!params.staff)) {
printHtmlPart(25)
invokeTag('message','g',155,['code':("issueDetails.studentId.label"),'default':("Student name")],-1)
printHtmlPart(26)
}
else {
printHtmlPart(25)
invokeTag('message','g',159,['code':("issueDetails.staffId.label"),'default':("Staff name")],-1)
printHtmlPart(26)
}
printHtmlPart(27)
invokeTag('message','g',165,['code':("issueDetails.returndate.label"),'default':("Returndate")],-1)
printHtmlPart(28)
invokeTag('message','g',167,['code':("issueDetails.issuedate.label"),'default':("Issuedate")],-1)
printHtmlPart(29)
loop:{
int i = 0
for( issueDetailsInstance in (bookslist) ) {
printHtmlPart(30)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(31)
if(true && (!params.staff)) {
printHtmlPart(32)
createTagBody(4, {->
printHtmlPart(33)
expressionOut.print(fieldValue(bean: issueDetailsInstance, field: "studentId.studentName"))
printHtmlPart(34)
})
invokeTag('link','g',182,['action':("show"),'id':(LookUpED.encod(issueDetailsInstance.id))],4)
printHtmlPart(35)
}
else {
printHtmlPart(32)
createTagBody(4, {->
printHtmlPart(33)
expressionOut.print(fieldValue(bean: issueDetailsInstance, field: "staffId.staffName"))
printHtmlPart(34)
})
invokeTag('link','g',188,['action':("show"),'id':(LookUpED.encod(issueDetailsInstance.id))],4)
printHtmlPart(35)
}
printHtmlPart(36)
expressionOut.print(issueDetailsInstance?.books?.title.toString().replace('[', '').replace(']', ''))
printHtmlPart(37)
invokeTag('formatDate','g',198,['date':(issueDetailsInstance.returndate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(38)
invokeTag('formatDate','g',202,['date':(issueDetailsInstance.issuedate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(39)
expressionOut.print(issueDetailsInstance?.fineAmount)
printHtmlPart(40)
createTagBody(3, {->
printHtmlPart(41)
createTagBody(4, {->
printHtmlPart(42)
invokeTag('message','g',215,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(33)
})
invokeTag('link','g',216,['action':("edit"),'id':(LookUpED.encod(issueDetailsInstance.id))],4)
printHtmlPart(33)
invokeTag('actionSubmit','g',221,['style':("background:none;border:none;color:red"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(43)
})
invokeTag('form','g',223,['url':([resource:issueDetailsInstance, action:'delete']),'method':("DELETE")],3)
printHtmlPart(44)
i++
}
}
printHtmlPart(45)
invokeTag('paginate','g',232,['total':(bookslistCount ?: 0),'params':([paginateTo:'books'])],-1)
printHtmlPart(46)
expressionOut.print(activeMap?.getAt('newspaper'))
printHtmlPart(47)
if(true && (!params.staff)) {
printHtmlPart(25)
invokeTag('message','g',251,['code':("issueDetails.studentId.label"),'default':("Student name")],-1)
printHtmlPart(26)
}
else {
printHtmlPart(25)
invokeTag('message','g',255,['code':("issueDetails.staffId.label"),'default':("Staff name")],-1)
printHtmlPart(26)
}
printHtmlPart(48)
invokeTag('message','g',260,['code':("issueDetails.newspaper.label"),'default':("Newspaper name")],-1)
printHtmlPart(28)
invokeTag('message','g',263,['code':("issueDetails.returndate.label"),'default':("Returndate")],-1)
printHtmlPart(28)
invokeTag('message','g',265,['code':("issueDetails.issuedate.label"),'default':("Issuedate")],-1)
printHtmlPart(29)
loop:{
int i = 0
for( issueDetailsInstance in (newslist) ) {
printHtmlPart(30)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(31)
if(true && (!params.staff)) {
printHtmlPart(32)
createTagBody(4, {->
printHtmlPart(33)
expressionOut.print(fieldValue(bean: issueDetailsInstance, field: "studentId.studentName"))
printHtmlPart(34)
})
invokeTag('link','g',280,['action':("show"),'id':(LookUpED.encod(issueDetailsInstance.id))],4)
printHtmlPart(35)
}
else {
printHtmlPart(32)
createTagBody(4, {->
printHtmlPart(33)
expressionOut.print(fieldValue(bean: issueDetailsInstance, field: "staffId.staffName"))
printHtmlPart(34)
})
invokeTag('link','g',286,['action':("show"),'id':(LookUpED.encod(issueDetailsInstance.id))],4)
printHtmlPart(35)
}
printHtmlPart(49)
expressionOut.print(fieldValue(bean: issueDetailsInstance, field: "newspaper.name"))
printHtmlPart(37)
invokeTag('formatDate','g',297,['date':(issueDetailsInstance.returndate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(38)
invokeTag('formatDate','g',301,['date':(issueDetailsInstance.issuedate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(39)
expressionOut.print(issueDetailsInstance?.fineAmount)
printHtmlPart(40)
createTagBody(3, {->
printHtmlPart(41)
createTagBody(4, {->
printHtmlPart(42)
invokeTag('message','g',314,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(33)
})
invokeTag('link','g',315,['action':("edit"),'id':(LookUpED.encod(issueDetailsInstance.id))],4)
printHtmlPart(33)
invokeTag('actionSubmit','g',320,['style':("background:none;border:none;color:red"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(43)
})
invokeTag('form','g',322,['url':([resource:issueDetailsInstance, action:'delete']),'method':("DELETE")],3)
printHtmlPart(44)
i++
}
}
printHtmlPart(45)
invokeTag('paginate','g',331,['total':(newslistCount ?: 0),'params':([paginateTo:'newspaper'])],-1)
printHtmlPart(50)
expressionOut.print(activeMap?.getAt('magazin'))
printHtmlPart(51)
if(true && (!params.staff)) {
printHtmlPart(25)
invokeTag('message','g',347,['code':("issueDetails.studentId.label"),'default':("Student name")],-1)
printHtmlPart(26)
}
else {
printHtmlPart(25)
invokeTag('message','g',351,['code':("issueDetails.staffId.label"),'default':("Staff name")],-1)
printHtmlPart(26)
}
printHtmlPart(48)
invokeTag('message','g',356,['code':("issueDetails.newspaper.label"),'default':("Magazin name")],-1)
printHtmlPart(28)
invokeTag('message','g',359,['code':("issueDetails.returndate.label"),'default':("Returndate")],-1)
printHtmlPart(28)
invokeTag('message','g',361,['code':("issueDetails.issuedate.label"),'default':("Issuedate")],-1)
printHtmlPart(29)
loop:{
int i = 0
for( issueDetailsInstance in (magazinlist) ) {
printHtmlPart(30)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(31)
if(true && (!params.staff)) {
printHtmlPart(32)
createTagBody(4, {->
printHtmlPart(33)
expressionOut.print(fieldValue(bean: issueDetailsInstance, field: "studentId.studentName"))
printHtmlPart(34)
})
invokeTag('link','g',376,['action':("show"),'id':(LookUpED.encod(issueDetailsInstance.id))],4)
printHtmlPart(35)
}
else {
printHtmlPart(32)
createTagBody(4, {->
printHtmlPart(33)
expressionOut.print(fieldValue(bean: issueDetailsInstance, field: "staffId.staffName"))
printHtmlPart(34)
})
invokeTag('link','g',382,['action':("show"),'id':(LookUpED.encod(issueDetailsInstance.id))],4)
printHtmlPart(35)
}
printHtmlPart(49)
expressionOut.print(fieldValue(bean: issueDetailsInstance, field: "magazineId.magazineName"))
printHtmlPart(37)
invokeTag('formatDate','g',393,['date':(issueDetailsInstance.returndate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(38)
invokeTag('formatDate','g',397,['date':(issueDetailsInstance.issuedate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(39)
expressionOut.print(issueDetailsInstance?.fineAmount)
printHtmlPart(40)
createTagBody(3, {->
printHtmlPart(41)
createTagBody(4, {->
printHtmlPart(42)
invokeTag('message','g',410,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(33)
})
invokeTag('link','g',411,['action':("edit"),'id':(LookUpED.encod(issueDetailsInstance.id))],4)
printHtmlPart(33)
invokeTag('actionSubmit','g',416,['style':("background:none;border:none;color:red"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(43)
})
invokeTag('form','g',418,['url':([resource:issueDetailsInstance, action:'delete']),'method':("DELETE")],3)
printHtmlPart(44)
i++
}
}
printHtmlPart(52)
invokeTag('paginate','g',427,['total':(magazinlistCount ?: 0)],-1)
printHtmlPart(53)
createClosureForHtmlPart(54, 2)
invokeTag('link','g',440,['class':("btn blue"),'controller':("issueDetails"),'action':("printissueDetailsList"),'target':("_blank"),'params':([staff:params.staff])],2)
printHtmlPart(55)
invokeTag('render','g',450,['template':("/footer/footer")],-1)
printHtmlPart(56)
})
invokeTag('captureBody','sitemesh',508,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white"),'id':("body")],1)
printHtmlPart(57)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925997792L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
