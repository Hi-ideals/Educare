import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.instituite.timetable.TimeTable
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_timeTableindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/timeTable/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',10,[:],2)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',49,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',58,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',62,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',73,['template':("/header/leftSide"),'model':([activ:[tt:'start active open',ttList:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
invokeTag('message','g',90,['code':("default.home.label")],-1)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',92,['class':("create"),'action':("create")],2)
printHtmlPart(12)
if(true && (flash.message)) {
printHtmlPart(13)
expressionOut.print(flash.message)
printHtmlPart(14)
}
printHtmlPart(15)
invokeTag('message','g',121,['code':("timeTable.classname.label"),'default':("Classname")],-1)
printHtmlPart(16)
invokeTag('message','g',124,['code':("timeTable.section.label"),'default':("Section")],-1)
printHtmlPart(16)
invokeTag('message','g',127,['code':("timeTable.subject.label"),'default':("Subject")],-1)
printHtmlPart(16)
invokeTag('message','g',130,['code':("timeTable.staff.label"),'default':("Staff")],-1)
printHtmlPart(17)
invokeTag('sortableColumn','g',133,['property':("periodName"),'title':(message(code: 'timeTable.periodName.label', default: 'Period Name'))],-1)
printHtmlPart(18)
invokeTag('sortableColumn','g',136,['property':("periodtimings"),'title':(message(code: 'timeTable.periodtimings.label', default: 'Periodtimings'))],-1)
printHtmlPart(19)
invokeTag('message','g',140,['code':("timeTable.dateOfTimeTable.label"),'default':("dateOfTimeTable")],-1)
printHtmlPart(20)
loop:{
int i = 0
for( timeTableInstance in (timeTableInstanceList) ) {
printHtmlPart(21)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(22)
createTagBody(3, {->
printHtmlPart(23)
expressionOut.print(fieldValue(bean: timeTableInstance, field: "classname.classname"))
printHtmlPart(24)
})
invokeTag('link','g',152,['action':("show"),'id':(LookUpED.encod(timeTableInstance.id))],3)
printHtmlPart(25)
expressionOut.print(fieldValue(bean: timeTableInstance, field: "section.sectionName"))
printHtmlPart(26)
expressionOut.print(fieldValue(bean: timeTableInstance, field: "subject.subjectName"))
printHtmlPart(26)
expressionOut.print(fieldValue(bean: timeTableInstance, field: "staff.staffName"))
printHtmlPart(26)
expressionOut.print(fieldValue(bean: timeTableInstance, field: "periodName"))
printHtmlPart(26)
expressionOut.print(fieldValue(bean: timeTableInstance, field: "periodtimings"))
printHtmlPart(27)
invokeTag('formatDate','g',176,['date':(timeTableInstance?.dateOfTimeTable),'format':("dd-MM-yyyy")],-1)
printHtmlPart(28)
i++
}
}
printHtmlPart(29)
invokeTag('paginate','g',186,['total':(timeTableInstanceCount ?: 0)],-1)
printHtmlPart(30)
invokeTag('render','g',200,['template':("/footer/footer")],-1)
printHtmlPart(31)
})
invokeTag('captureBody','sitemesh',244,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(32)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926014678L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
