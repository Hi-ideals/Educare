import com.hiideals.attendanceManagement.StaffAttendance
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_staffAttendance_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/staffAttendance/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: staffAttendanceInstance, field: 'attendanceUpdatedBy', 'error'))
printHtmlPart(1)
invokeTag('message','g',9,['code':("staffAttendance.attendanceUpdatedBy.label"),'default':("Attendance Updated By")],-1)
printHtmlPart(2)
for( staff in (staffs) ) {
printHtmlPart(3)
expressionOut.print(staff?.id)
printHtmlPart(4)
expressionOut.print(staff?.staffName)
printHtmlPart(5)
}
printHtmlPart(6)
expressionOut.print(hasErrors(bean: staffAttendanceInstance, field: 'attendanceDate', 'error'))
printHtmlPart(7)
invokeTag('message','g',29,['code':("staffAttendance.attendanceDate.label"),'default':("Attendance Date")],-1)
printHtmlPart(8)
expressionOut.print(staffAttendanceInstance?.attendanceDate)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: staffAttendanceInstance, field: 'staffName', 'error'))
printHtmlPart(10)
invokeTag('message','g',38,['code':("staffAttendance.staffName.label"),'default':("Staff Name")],-1)
printHtmlPart(11)
for( staff in (staffs) ) {
printHtmlPart(3)
expressionOut.print(staff?.id)
printHtmlPart(4)
expressionOut.print(staff?.staffName)
printHtmlPart(5)
}
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926011323L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
