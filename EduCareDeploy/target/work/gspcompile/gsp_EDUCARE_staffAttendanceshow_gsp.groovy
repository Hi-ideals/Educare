import com.hiideals.attendanceManagement.StaffAttendance
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_staffAttendanceshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/staffAttendance/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'staffAttendance.label', default: 'StaffAttendance'))],-1)
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
if(true && (staffAttendanceInstance?.remarks)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("staffAttendance.remarks.label"),'default':("Remarks")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(staffAttendanceInstance),'field':("remarks")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (staffAttendanceInstance?.barCode)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("staffAttendance.barCode.label"),'default':("Bar Code")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(staffAttendanceInstance),'field':("barCode")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (staffAttendanceInstance?.attendanceUpdatedBy)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("staffAttendance.attendanceUpdatedBy.label"),'default':("Attendance Updated By")],-1)
printHtmlPart(21)
createTagBody(3, {->
expressionOut.print(staffAttendanceInstance?.attendanceUpdatedBy?.encodeAsHTML())
})
invokeTag('link','g',48,['controller':("staff"),'action':("show"),'id':(staffAttendanceInstance?.attendanceUpdatedBy?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (staffAttendanceInstance?.attendanceDate)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("staffAttendance.attendanceDate.label"),'default':("Attendance Date")],-1)
printHtmlPart(23)
invokeTag('formatDate','g',57,['date':(staffAttendanceInstance?.attendanceDate)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (staffAttendanceInstance?.inTime)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("staffAttendance.inTime.label"),'default':("In Time")],-1)
printHtmlPart(25)
invokeTag('formatDate','g',66,['date':(staffAttendanceInstance?.inTime)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (staffAttendanceInstance?.institue)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("staffAttendance.institue.label"),'default':("Institue")],-1)
printHtmlPart(27)
createTagBody(3, {->
expressionOut.print(staffAttendanceInstance?.institue?.encodeAsHTML())
})
invokeTag('link','g',75,['controller':("instituite"),'action':("show"),'id':(staffAttendanceInstance?.institue?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (staffAttendanceInstance?.staffName)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("staffAttendance.staffName.label"),'default':("Staff Name")],-1)
printHtmlPart(29)
createTagBody(3, {->
expressionOut.print(staffAttendanceInstance?.staffName?.encodeAsHTML())
})
invokeTag('link','g',84,['controller':("staff"),'action':("show"),'id':(staffAttendanceInstance?.staffName?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (staffAttendanceInstance?.status)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("staffAttendance.status.label"),'default':("Status")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',93,['bean':(staffAttendanceInstance),'field':("status")],-1)
printHtmlPart(16)
}
printHtmlPart(32)
createTagBody(2, {->
printHtmlPart(33)
createTagBody(3, {->
invokeTag('message','g',101,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',101,['class':("edit"),'action':("edit"),'resource':(staffAttendanceInstance)],3)
printHtmlPart(34)
invokeTag('actionSubmit','g',102,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(35)
})
invokeTag('form','g',104,['url':([resource:staffAttendanceInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(36)
})
invokeTag('captureBody','sitemesh',106,[:],1)
printHtmlPart(37)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926011316L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
