import com.hiideals.attendanceManagement.StudentAttendance
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_studentAttendanceshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/studentAttendance/show.gsp" }
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
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
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
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (studentAttendanceInstance?.leisureClass)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("studentAttendance.leisureClass.label"),'default':("Leisure Class")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(studentAttendanceInstance),'field':("leisureClass")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (studentAttendanceInstance?.remarks)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("studentAttendance.remarks.label"),'default':("Remarks")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(studentAttendanceInstance),'field':("remarks")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (studentAttendanceInstance?.barCode)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("studentAttendance.barCode.label"),'default':("Bar Code")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(studentAttendanceInstance),'field':("barCode")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (studentAttendanceInstance?.section)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("studentAttendance.section.label"),'default':("Section")],-1)
printHtmlPart(23)
createTagBody(3, {->
expressionOut.print(studentAttendanceInstance?.section?.encodeAsHTML())
})
invokeTag('link','g',57,['controller':("section"),'action':("show"),'id':(studentAttendanceInstance?.section?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (studentAttendanceInstance?.attendanceUpdatedBy)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("studentAttendance.attendanceUpdatedBy.label"),'default':("Attendance Updated By")],-1)
printHtmlPart(25)
createTagBody(3, {->
expressionOut.print(studentAttendanceInstance?.attendanceUpdatedBy?.encodeAsHTML())
})
invokeTag('link','g',66,['controller':("staff"),'action':("show"),'id':(studentAttendanceInstance?.attendanceUpdatedBy?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (studentAttendanceInstance?.attendanceDate)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("studentAttendance.attendanceDate.label"),'default':("Attendance Date")],-1)
printHtmlPart(27)
invokeTag('formatDate','g',75,['date':(studentAttendanceInstance?.attendanceDate)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (studentAttendanceInstance?.iclass)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("studentAttendance.iclass.label"),'default':("Iclass")],-1)
printHtmlPart(29)
createTagBody(3, {->
expressionOut.print(studentAttendanceInstance?.iclass?.encodeAsHTML())
})
invokeTag('link','g',84,['controller':("IClass"),'action':("show"),'id':(studentAttendanceInstance?.iclass?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (studentAttendanceInstance?.inTime)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("studentAttendance.inTime.label"),'default':("In Time")],-1)
printHtmlPart(31)
invokeTag('formatDate','g',93,['date':(studentAttendanceInstance?.inTime)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (studentAttendanceInstance?.institue)) {
printHtmlPart(32)
invokeTag('message','g',100,['code':("studentAttendance.institue.label"),'default':("Institue")],-1)
printHtmlPart(33)
createTagBody(3, {->
expressionOut.print(studentAttendanceInstance?.institue?.encodeAsHTML())
})
invokeTag('link','g',102,['controller':("instituite"),'action':("show"),'id':(studentAttendanceInstance?.institue?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (studentAttendanceInstance?.staffName)) {
printHtmlPart(34)
invokeTag('message','g',109,['code':("studentAttendance.staffName.label"),'default':("Staff Name")],-1)
printHtmlPart(35)
createTagBody(3, {->
expressionOut.print(studentAttendanceInstance?.staffName?.encodeAsHTML())
})
invokeTag('link','g',111,['controller':("staff"),'action':("show"),'id':(studentAttendanceInstance?.staffName?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (studentAttendanceInstance?.status)) {
printHtmlPart(36)
invokeTag('message','g',118,['code':("studentAttendance.status.label"),'default':("Status")],-1)
printHtmlPart(37)
invokeTag('fieldValue','g',120,['bean':(studentAttendanceInstance),'field':("status")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (studentAttendanceInstance?.student)) {
printHtmlPart(38)
invokeTag('message','g',127,['code':("studentAttendance.student.label"),'default':("Student")],-1)
printHtmlPart(39)
createTagBody(3, {->
expressionOut.print(studentAttendanceInstance?.student?.encodeAsHTML())
})
invokeTag('link','g',129,['controller':("student"),'action':("show"),'id':(studentAttendanceInstance?.student?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (studentAttendanceInstance?.subject)) {
printHtmlPart(40)
invokeTag('message','g',136,['code':("studentAttendance.subject.label"),'default':("Subject")],-1)
printHtmlPart(41)
createTagBody(3, {->
expressionOut.print(studentAttendanceInstance?.subject?.encodeAsHTML())
})
invokeTag('link','g',138,['controller':("subject"),'action':("show"),'id':(studentAttendanceInstance?.subject?.id)],3)
printHtmlPart(16)
}
printHtmlPart(42)
createTagBody(2, {->
printHtmlPart(43)
createTagBody(3, {->
invokeTag('message','g',146,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',146,['class':("edit"),'action':("edit"),'resource':(studentAttendanceInstance)],3)
printHtmlPart(44)
invokeTag('actionSubmit','g',147,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(45)
})
invokeTag('form','g',149,['url':([resource:studentAttendanceInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(46)
})
invokeTag('captureBody','sitemesh',151,[:],1)
printHtmlPart(47)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925995004L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
