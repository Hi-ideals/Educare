import com.hiideals.instituite.student.Student
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_issueDetailsprintissueDetailsList_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/issueDetails/printissueDetailsList.gsp" }
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
invokeTag('captureHead','sitemesh',73,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',82,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',85,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('getImage','images',110,['id':(instituite?.logo?.id),'width':("100px")],-1)
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
if(true && (params.books)) {
printHtmlPart(16)
}
else if(true && (params.newspaper)) {
printHtmlPart(17)
}
else if(true && (params.magazin)) {
printHtmlPart(18)
}
else {
printHtmlPart(13)
}
printHtmlPart(19)
if(true && (!params.staff)) {
printHtmlPart(20)
if(true && (params.books)) {
printHtmlPart(21)
invokeTag('message','g',156,['code':("issueDetails.studentId.label"),'default':("Student name")],-1)
printHtmlPart(22)
invokeTag('message','g',160,['code':("issueDetails.issuedate.label"),'default':("Issuedate")],-1)
printHtmlPart(23)
invokeTag('message','g',163,['code':("issueDetails.returndate.label"),'default':("Returndate")],-1)
printHtmlPart(24)
loop:{
int i = 0
for( issueDetailsInstance in (issueDetailsInstanceList) ) {
printHtmlPart(25)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(26)
expressionOut.print(fieldValue(bean: issueDetailsInstance, field: "studentId.studentName"))
printHtmlPart(27)
invokeTag('formatDate','g',179,['date':(issueDetailsInstance.issuedate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(28)
invokeTag('formatDate','g',182,['date':(issueDetailsInstance.returndate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(29)
expressionOut.print(issueDetailsInstance?.books?.title.toString().replace('[', '').replace(']', ''))
printHtmlPart(30)
expressionOut.print(issueDetailsInstance?.fineAmount)
printHtmlPart(31)
i++
}
}
printHtmlPart(32)
}
else if(true && (params.newspaper)) {
printHtmlPart(21)
invokeTag('message','g',202,['code':("issueDetails.studentId.label"),'default':("Student name")],-1)
printHtmlPart(22)
invokeTag('message','g',206,['code':("issueDetails.issuedate.label"),'default':("Issuedate")],-1)
printHtmlPart(23)
invokeTag('message','g',209,['code':("issueDetails.returndate.label"),'default':("Returndate")],-1)
printHtmlPart(33)
loop:{
int i = 0
for( issueDetailsInstance in (issueDetailsInstanceList) ) {
printHtmlPart(25)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(26)
expressionOut.print(fieldValue(bean: issueDetailsInstance, field: "studentId.studentName"))
printHtmlPart(27)
invokeTag('formatDate','g',225,['date':(issueDetailsInstance.issuedate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(28)
invokeTag('formatDate','g',228,['date':(issueDetailsInstance.returndate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(29)
expressionOut.print(issueDetailsInstance?.newspaper?.name.toString().replace('[', '').replace(']', ''))
printHtmlPart(30)
expressionOut.print(issueDetailsInstance?.fineAmount)
printHtmlPart(31)
i++
}
}
printHtmlPart(32)
}
else if(true && (params.magazin)) {
printHtmlPart(21)
invokeTag('message','g',248,['code':("issueDetails.studentId.label"),'default':("Student name")],-1)
printHtmlPart(22)
invokeTag('message','g',252,['code':("issueDetails.issuedate.label"),'default':("Issuedate")],-1)
printHtmlPart(23)
invokeTag('message','g',255,['code':("issueDetails.returndate.label"),'default':("Returndate")],-1)
printHtmlPart(34)
loop:{
int i = 0
for( issueDetailsInstance in (issueDetailsInstanceList) ) {
printHtmlPart(25)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(26)
expressionOut.print(fieldValue(bean: issueDetailsInstance, field: "studentId.studentName"))
printHtmlPart(27)
invokeTag('formatDate','g',271,['date':(issueDetailsInstance.issuedate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(28)
invokeTag('formatDate','g',274,['date':(issueDetailsInstance.returndate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(29)
expressionOut.print(issueDetailsInstance?.magazineId?.magazineName.toString().replace('[', '').replace(']', ''))
printHtmlPart(30)
expressionOut.print(issueDetailsInstance?.fineAmount)
printHtmlPart(31)
i++
}
}
printHtmlPart(32)
}
else {
printHtmlPart(20)
}
printHtmlPart(35)
}
else {
printHtmlPart(20)
if(true && (params.books)) {
printHtmlPart(21)
invokeTag('message','g',299,['code':("issueDetails.staffId.label"),'default':("Staff name")],-1)
printHtmlPart(22)
invokeTag('message','g',303,['code':("issueDetails.issuedate.label"),'default':("Issuedate")],-1)
printHtmlPart(23)
invokeTag('message','g',306,['code':("issueDetails.returndate.label"),'default':("Returndate")],-1)
printHtmlPart(24)
loop:{
int i = 0
for( issueDetailsInstance in (issueDetailsInstanceList) ) {
printHtmlPart(25)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(26)
expressionOut.print(fieldValue(bean: issueDetailsInstance, field: "staffId.staffName"))
printHtmlPart(27)
invokeTag('formatDate','g',322,['date':(issueDetailsInstance.issuedate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(28)
invokeTag('formatDate','g',325,['date':(issueDetailsInstance.returndate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(29)
expressionOut.print(issueDetailsInstance?.books?.title.toString().replace('[', '').replace(']', ''))
printHtmlPart(30)
expressionOut.print(issueDetailsInstance?.fineAmount)
printHtmlPart(31)
i++
}
}
printHtmlPart(32)
}
else if(true && (params.newspaper)) {
printHtmlPart(21)
invokeTag('message','g',345,['code':("issueDetails.staffId.label"),'default':("Staff Name")],-1)
printHtmlPart(22)
invokeTag('message','g',349,['code':("issueDetails.issuedate.label"),'default':("Issuedate")],-1)
printHtmlPart(23)
invokeTag('message','g',352,['code':("issueDetails.returndate.label"),'default':("Returndate")],-1)
printHtmlPart(33)
loop:{
int i = 0
for( issueDetailsInstance in (issueDetailsInstanceList) ) {
printHtmlPart(25)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(26)
expressionOut.print(fieldValue(bean: issueDetailsInstance, field: "staffId.staffName"))
printHtmlPart(27)
invokeTag('formatDate','g',368,['date':(issueDetailsInstance.issuedate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(28)
invokeTag('formatDate','g',371,['date':(issueDetailsInstance.returndate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(29)
expressionOut.print(issueDetailsInstance?.newspaper?.name.toString().replace('[', '').replace(']', ''))
printHtmlPart(30)
expressionOut.print(issueDetailsInstance?.fineAmount)
printHtmlPart(31)
i++
}
}
printHtmlPart(32)
}
else if(true && (params.magazin)) {
printHtmlPart(21)
invokeTag('message','g',391,['code':("issueDetails.staffId.label"),'default':("Staff Name")],-1)
printHtmlPart(22)
invokeTag('message','g',395,['code':("issueDetails.issuedate.label"),'default':("Issuedate")],-1)
printHtmlPart(23)
invokeTag('message','g',398,['code':("issueDetails.returndate.label"),'default':("Returndate")],-1)
printHtmlPart(34)
loop:{
int i = 0
for( issueDetailsInstance in (issueDetailsInstanceList) ) {
printHtmlPart(25)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(26)
expressionOut.print(fieldValue(bean: issueDetailsInstance, field: "staffId.staffName"))
printHtmlPart(27)
invokeTag('formatDate','g',414,['date':(issueDetailsInstance.issuedate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(28)
invokeTag('formatDate','g',417,['date':(issueDetailsInstance.returndate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(29)
expressionOut.print(issueDetailsInstance?.magazineId?.magazineName.toString().replace('[', '').replace(']', ''))
printHtmlPart(30)
expressionOut.print(issueDetailsInstance?.fineAmount)
printHtmlPart(31)
i++
}
}
printHtmlPart(32)
}
else {
printHtmlPart(20)
}
printHtmlPart(35)
}
printHtmlPart(36)
invokeTag('render','g',481,['template':("/footer/footer")],-1)
printHtmlPart(37)
})
invokeTag('captureBody','sitemesh',575,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(38)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925997796L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
