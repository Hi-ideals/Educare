import com.hiideals.attendanceManagement.StudentAttendance
import com.hiideals.institute.staff.Staff
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_staffAttendance_form1_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/staffAttendance/_form1.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
expressionOut.print(hasErrors(bean: studentAttendanceInstance, field: 'attendanceUpdatedBy', 'error'))
printHtmlPart(2)
invokeTag('message','g',10,['code':("studentAttendance.attendanceUpdatedBy.label"),'default':("Attendance Updated By")],-1)
printHtmlPart(3)
expressionOut.print(attendUpdateBy?.id)
printHtmlPart(4)
expressionOut.print(attendUpdateBy?.staffName)
printHtmlPart(5)
expressionOut.print(hasErrors(bean: studentAttendanceInstance, field: 'attendanceDate', 'error'))
printHtmlPart(6)
invokeTag('message','g',26,['code':("studentAttendance.attendanceDate.label"),'default':("Attendance Date")],-1)
printHtmlPart(7)
expressionOut.print(params?.attendanceDate1)
printHtmlPart(8)
expressionOut.print(hasErrors(bean: studentAttendanceInstance, field: 'institue', 'error'))
printHtmlPart(9)
invokeTag('message','g',36,['code':("studentAttendance.institue.label"),'default':("Institue")],-1)
printHtmlPart(10)
expressionOut.print(institue?.id)
printHtmlPart(4)
expressionOut.print(institue?.name)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: studentAttendanceInstance, field: 'staffName', 'error'))
printHtmlPart(12)
invokeTag('message','g',52,['code':("studentAttendance.staffName.label"),'default':("Staff Name")],-1)
printHtmlPart(13)
expressionOut.print(staffName?.id)
printHtmlPart(4)
expressionOut.print(staffName?.staffName)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926011343L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
