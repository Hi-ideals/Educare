import com.hiideals.institute.staff.Staff
import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.instituite.helper.Batch
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_issueDetailsstudentDetails_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/issueDetails/studentDetails.gsp" }
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
invokeTag('message','g',104,['code':("default.home.label")],-1)
printHtmlPart(12)
createClosureForHtmlPart(13, 2)
invokeTag('link','g',106,['class':("create"),'action':("issueToStudent")],2)
printHtmlPart(14)
if(true && (flash.message)) {
printHtmlPart(15)
expressionOut.print(flash.message)
printHtmlPart(16)
}
printHtmlPart(17)
expressionOut.print(activeMap?.getAt('books'))
printHtmlPart(18)
expressionOut.print(activeMap?.getAt('newspaper'))
printHtmlPart(19)
expressionOut.print(activeMap?.getAt('magazin'))
printHtmlPart(20)
expressionOut.print(activeMap?.getAt('books'))
printHtmlPart(21)
if(true && (!params.staff)) {
printHtmlPart(22)
invokeTag('message','g',154,['code':("issueDetails.studentId.label"),'default':("Student name")],-1)
printHtmlPart(23)
}
else {
printHtmlPart(22)
invokeTag('message','g',158,['code':("issueDetails.staffId.label"),'default':("Staff name")],-1)
printHtmlPart(23)
}
printHtmlPart(24)
invokeTag('message','g',164,['code':("issueDetails.returndate.label"),'default':("Returndate")],-1)
printHtmlPart(25)
invokeTag('message','g',166,['code':("issueDetails.issuedate.label"),'default':("Issuedate")],-1)
printHtmlPart(26)
loop:{
int i = 0
for( issueDetailsInstance in (bookslist) ) {
printHtmlPart(27)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(28)
if(true && (!params.staff)) {
printHtmlPart(29)
createTagBody(4, {->
printHtmlPart(30)
expressionOut.print(fieldValue(bean: issueDetailsInstance, field: "studentId.studentName"))
printHtmlPart(31)
})
invokeTag('link','g',181,['action':("show"),'id':(LookUpED.encod(issueDetailsInstance.id))],4)
printHtmlPart(32)
}
printHtmlPart(33)
expressionOut.print(issueDetailsInstance?.books?.title.toString().replace('[', '').replace(']', ''))
printHtmlPart(34)
invokeTag('formatDate','g',192,['date':(issueDetailsInstance.returndate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(35)
invokeTag('formatDate','g',196,['date':(issueDetailsInstance.issuedate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(36)
expressionOut.print(issueDetailsInstance?.fineAmount)
printHtmlPart(37)
createTagBody(3, {->
printHtmlPart(38)
createTagBody(4, {->
printHtmlPart(39)
invokeTag('message','g',209,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(30)
})
invokeTag('link','g',210,['action':("edit"),'id':(LookUpED.encod(issueDetailsInstance.id))],4)
printHtmlPart(30)
invokeTag('actionSubmit','g',215,['style':("background:none;border:none;color:red"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(40)
})
invokeTag('form','g',217,['url':([resource:issueDetailsInstance, action:'delete']),'method':("DELETE")],3)
printHtmlPart(41)
i++
}
}
printHtmlPart(42)
invokeTag('paginate','g',226,['total':(bookslistCount ?: 0),'params':([paginateTo:'books'])],-1)
printHtmlPart(43)
createClosureForHtmlPart(44, 2)
invokeTag('link','g',231,['class':("btn blue"),'controller':("issueDetails"),'action':("printissueDetailsList"),'target':("_blank"),'params':([staff:params.staff,books:true])],2)
printHtmlPart(45)
expressionOut.print(activeMap?.getAt('newspaper'))
printHtmlPart(46)
if(true && (!params.staff)) {
printHtmlPart(22)
invokeTag('message','g',249,['code':("issueDetails.studentId.label"),'default':("Student name")],-1)
printHtmlPart(23)
}
else {
printHtmlPart(22)
invokeTag('message','g',253,['code':("issueDetails.staffId.label"),'default':("Staff name")],-1)
printHtmlPart(23)
}
printHtmlPart(47)
invokeTag('message','g',258,['code':("issueDetails.newspaper.label"),'default':("Newspaper name")],-1)
printHtmlPart(25)
invokeTag('message','g',261,['code':("issueDetails.returndate.label"),'default':("Returndate")],-1)
printHtmlPart(25)
invokeTag('message','g',263,['code':("issueDetails.issuedate.label"),'default':("Issuedate")],-1)
printHtmlPart(26)
loop:{
int i = 0
for( issueDetailsInstance in (newslist) ) {
printHtmlPart(27)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(28)
if(true && (!params.staff)) {
printHtmlPart(29)
createTagBody(4, {->
printHtmlPart(30)
expressionOut.print(fieldValue(bean: issueDetailsInstance, field: "studentId.studentName"))
printHtmlPart(31)
})
invokeTag('link','g',278,['action':("show"),'id':(LookUpED.encod(issueDetailsInstance.id))],4)
printHtmlPart(32)
}
else {
printHtmlPart(29)
createTagBody(4, {->
printHtmlPart(30)
expressionOut.print(fieldValue(bean: issueDetailsInstance, field: "staffId.staffName"))
printHtmlPart(31)
})
invokeTag('link','g',284,['action':("show"),'id':(LookUpED.encod(issueDetailsInstance.id))],4)
printHtmlPart(32)
}
printHtmlPart(33)
expressionOut.print(fieldValue(bean: issueDetailsInstance, field: "newspaper.name"))
printHtmlPart(34)
invokeTag('formatDate','g',295,['date':(issueDetailsInstance.returndate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(35)
invokeTag('formatDate','g',299,['date':(issueDetailsInstance.issuedate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(36)
expressionOut.print(issueDetailsInstance?.fineAmount)
printHtmlPart(37)
createTagBody(3, {->
printHtmlPart(38)
createTagBody(4, {->
printHtmlPart(39)
invokeTag('message','g',312,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(30)
})
invokeTag('link','g',313,['action':("edit"),'id':(LookUpED.encod(issueDetailsInstance.id))],4)
printHtmlPart(30)
invokeTag('actionSubmit','g',318,['style':("background:none;border:none;color:red"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(40)
})
invokeTag('form','g',320,['url':([resource:issueDetailsInstance, action:'delete']),'method':("DELETE")],3)
printHtmlPart(41)
i++
}
}
printHtmlPart(42)
invokeTag('paginate','g',329,['total':(newslistCount ?: 0),'params':([paginateTo:'newspaper'])],-1)
printHtmlPart(43)
createClosureForHtmlPart(44, 2)
invokeTag('link','g',334,['class':("btn blue"),'controller':("issueDetails"),'action':("printissueDetailsList"),'target':("_blank"),'params':([staff:params.staff,newspaper:true])],2)
printHtmlPart(48)
expressionOut.print(activeMap?.getAt('magazin'))
printHtmlPart(49)
if(true && (!params.staff)) {
printHtmlPart(22)
invokeTag('message','g',349,['code':("issueDetails.studentId.label"),'default':("Student name")],-1)
printHtmlPart(23)
}
else {
printHtmlPart(22)
invokeTag('message','g',353,['code':("issueDetails.staffId.label"),'default':("Staff name")],-1)
printHtmlPart(23)
}
printHtmlPart(47)
invokeTag('message','g',358,['code':("issueDetails.newspaper.label"),'default':("Magazine name")],-1)
printHtmlPart(25)
invokeTag('message','g',361,['code':("issueDetails.returndate.label"),'default':("Returndate")],-1)
printHtmlPart(25)
invokeTag('message','g',363,['code':("issueDetails.issuedate.label"),'default':("Issuedate")],-1)
printHtmlPart(26)
loop:{
int i = 0
for( issueDetailsInstance in (magazinlist) ) {
printHtmlPart(27)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(28)
if(true && (!params.staff)) {
printHtmlPart(29)
createTagBody(4, {->
printHtmlPart(30)
expressionOut.print(fieldValue(bean: issueDetailsInstance, field: "studentId.studentName"))
printHtmlPart(31)
})
invokeTag('link','g',378,['action':("show"),'id':(LookUpED.encod(issueDetailsInstance.id))],4)
printHtmlPart(32)
}
else {
printHtmlPart(29)
createTagBody(4, {->
printHtmlPart(30)
expressionOut.print(fieldValue(bean: issueDetailsInstance, field: "staffId.staffName"))
printHtmlPart(31)
})
invokeTag('link','g',384,['action':("show"),'id':(LookUpED.encod(issueDetailsInstance.id))],4)
printHtmlPart(32)
}
printHtmlPart(33)
expressionOut.print(fieldValue(bean: issueDetailsInstance, field: "magazineId.magazineName"))
printHtmlPart(34)
invokeTag('formatDate','g',395,['date':(issueDetailsInstance.returndate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(35)
invokeTag('formatDate','g',399,['date':(issueDetailsInstance.issuedate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(36)
expressionOut.print(issueDetailsInstance?.fineAmount)
printHtmlPart(37)
createTagBody(3, {->
printHtmlPart(38)
createTagBody(4, {->
printHtmlPart(39)
invokeTag('message','g',412,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(30)
})
invokeTag('link','g',413,['action':("edit"),'id':(LookUpED.encod(issueDetailsInstance.id))],4)
printHtmlPart(30)
invokeTag('actionSubmit','g',418,['style':("background:none;border:none;color:red"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(40)
})
invokeTag('form','g',420,['url':([resource:issueDetailsInstance, action:'delete']),'method':("DELETE")],3)
printHtmlPart(41)
i++
}
}
printHtmlPart(50)
invokeTag('paginate','g',429,['total':(magazinlistCount ?: 0)],-1)
printHtmlPart(51)
createClosureForHtmlPart(44, 2)
invokeTag('link','g',434,['class':("btn blue"),'controller':("issueDetails"),'action':("printissueDetailsList"),'target':("_blank"),'params':([staff:params.staff,magazin:true])],2)
printHtmlPart(52)
invokeTag('render','g',455,['template':("/footer/footer")],-1)
printHtmlPart(53)
})
invokeTag('captureBody','sitemesh',514,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white"),'id':("body")],1)
printHtmlPart(54)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925997698L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
