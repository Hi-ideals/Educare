import com.hiideals.attendanceManagement.StudentAttendance
import com.hiideals.institute.staff.Staff
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_studentAttendance_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/studentAttendance/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
expressionOut.print(hasErrors(bean: studentAttendanceInstance, field: 'iclass', 'error'))
printHtmlPart(2)
invokeTag('message','g',11,['code':("studentAttendance.iclass.label"),'default':("Class")],-1)
printHtmlPart(3)
expressionOut.print(remoteFunction(controller:'studentAttendance',action: 'classSections',
                       update: 'updateSections',
                       params: '\'classId=\' + this.value'))
printHtmlPart(4)
for( iclassss in (classes) ) {
printHtmlPart(5)
expressionOut.print(iclassss?.id)
printHtmlPart(6)
expressionOut.print(iclassss?.classname)
printHtmlPart(7)
}
printHtmlPart(8)
invokeTag('render','g',29,['template':("classSections")],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: studentAttendanceInstance, field: 'attendanceUpdatedBy', 'error'))
printHtmlPart(10)
invokeTag('message','g',36,['code':("studentAttendance.attendanceUpdatedBy.label"),'default':("Attendance Updated By")],-1)
printHtmlPart(11)
for( attendanceUpdatedBy in (staffs) ) {
printHtmlPart(5)
expressionOut.print(attendanceUpdatedBy.id)
printHtmlPart(6)
expressionOut.print(attendanceUpdatedBy?.staffName)
printHtmlPart(7)
}
printHtmlPart(12)
expressionOut.print(hasErrors(bean: studentAttendanceInstance, field: 'attendanceDate', 'error'))
printHtmlPart(13)
invokeTag('message','g',57,['code':("studentAttendance.attendanceDate.label"),'default':("Attendance Date")],-1)
printHtmlPart(14)
expressionOut.print(studentAttendanceInstance?.attendanceDate)
printHtmlPart(15)
expressionOut.print(hasErrors(bean: studentAttendanceInstance, field: 'staffName', 'error'))
printHtmlPart(16)
invokeTag('message','g',71,['code':("studentAttendance.staffName.label"),'default':("Staff Name")],-1)
printHtmlPart(17)
for( staffName in (staffs) ) {
printHtmlPart(5)
expressionOut.print(staffName?.id)
printHtmlPart(6)
expressionOut.print(staffName?.staffName)
printHtmlPart(7)
}
printHtmlPart(18)
expressionOut.print(hasErrors(bean: studentAttendanceInstance, field: 'subject', 'error'))
printHtmlPart(19)
invokeTag('message','g',88,['code':("studentAttendance.subject.label"),'default':("Subject")],-1)
printHtmlPart(20)
for( subject in (subjects) ) {
printHtmlPart(5)
expressionOut.print(subject?.id)
printHtmlPart(6)
expressionOut.print(subject?.subjectName)
printHtmlPart(7)
}
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925995012L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
