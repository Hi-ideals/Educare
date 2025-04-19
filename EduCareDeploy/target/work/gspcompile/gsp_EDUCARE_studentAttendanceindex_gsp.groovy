import com.hiideals.attendanceManagement.StudentAttendance
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_studentAttendanceindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/studentAttendance/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'studentAttendance.label', default: 'StudentAttendance'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('message','g',19,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('sortableColumn','g',27,['property':("leisureClass"),'title':(message(code: 'studentAttendance.leisureClass.label', default: 'Leisure Class'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',29,['property':("remarks"),'title':(message(code: 'studentAttendance.remarks.label', default: 'Remarks'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',31,['property':("barCode"),'title':(message(code: 'studentAttendance.barCode.label', default: 'Bar Code'))],-1)
printHtmlPart(14)
invokeTag('message','g',33,['code':("studentAttendance.section.label"),'default':("Section")],-1)
printHtmlPart(15)
invokeTag('message','g',35,['code':("studentAttendance.attendanceUpdatedBy.label"),'default':("Attendance Updated By")],-1)
printHtmlPart(16)
invokeTag('sortableColumn','g',37,['property':("attendanceDate"),'title':(message(code: 'studentAttendance.attendanceDate.label', default: 'Attendance Date'))],-1)
printHtmlPart(17)
loop:{
int i = 0
for( studentAttendanceInstance in (studentAttendanceInstanceList) ) {
printHtmlPart(18)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(19)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: studentAttendanceInstance, field: "leisureClass"))
})
invokeTag('link','g',45,['action':("show"),'id':(studentAttendanceInstance.id)],3)
printHtmlPart(20)
expressionOut.print(fieldValue(bean: studentAttendanceInstance, field: "remarks"))
printHtmlPart(20)
expressionOut.print(fieldValue(bean: studentAttendanceInstance, field: "barCode"))
printHtmlPart(20)
expressionOut.print(fieldValue(bean: studentAttendanceInstance, field: "section"))
printHtmlPart(20)
expressionOut.print(fieldValue(bean: studentAttendanceInstance, field: "attendanceUpdatedBy"))
printHtmlPart(20)
invokeTag('formatDate','g',55,['date':(studentAttendanceInstance.attendanceDate)],-1)
printHtmlPart(21)
i++
}
}
printHtmlPart(22)
invokeTag('paginate','g',63,['total':(studentAttendanceInstanceCount ?: 0)],-1)
printHtmlPart(23)
})
invokeTag('captureBody','sitemesh',67,[:],1)
printHtmlPart(24)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925995054L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
