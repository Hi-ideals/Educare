import com.hiideals.attendanceManagement.StudentAttendance
import com.hiideals.institute.staff.Staff
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_studentAttendance_form1_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/studentAttendance/_form1.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
expressionOut.print(hasErrors(bean: studentAttendanceInstance, field: 'section', 'error'))
printHtmlPart(2)
invokeTag('message','g',10,['code':("studentAttendance.section.label"),'default':("Section")],-1)
printHtmlPart(3)
expressionOut.print(section?.id)
printHtmlPart(4)
expressionOut.print(section?.sectionName)
printHtmlPart(5)
expressionOut.print(hasErrors(bean: studentAttendanceInstance, field: 'attendanceUpdatedBy', 'error'))
printHtmlPart(6)
invokeTag('message','g',25,['code':("studentAttendance.attendanceUpdatedBy.label"),'default':("Attendance Updated By")],-1)
printHtmlPart(7)
expressionOut.print(attendUpdateBy.id)
printHtmlPart(4)
expressionOut.print(attendUpdateBy?.staffName)
printHtmlPart(8)
expressionOut.print(hasErrors(bean: studentAttendanceInstance, field: 'attendanceDate', 'error'))
printHtmlPart(9)
invokeTag('message','g',41,['code':("studentAttendance.attendanceDate.label"),'default':("Attendance Date")],-1)
printHtmlPart(10)
expressionOut.print(params?.attendanceDate1)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: studentAttendanceInstance, field: 'iclass', 'error'))
printHtmlPart(12)
invokeTag('message','g',51,['code':("studentAttendance.iclass.label"),'default':("Iclass")],-1)
printHtmlPart(13)
invokeTag('select','g',57,['id':("iclass"),'name':("iclass.id"),'class':("form-control"),'readOnly':("true"),'from':(com.hiideals.instituite.classcourses.IClass.list()),'optionKey':("id"),'required':(""),'value':(studentAttendanceInstance?.iclass?.id)],-1)
printHtmlPart(14)
expressionOut.print(iclass?.id)
printHtmlPart(4)
expressionOut.print(iclass?.classname)
printHtmlPart(15)
expressionOut.print(hasErrors(bean: studentAttendanceInstance, field: 'inTime', 'error'))
printHtmlPart(16)
invokeTag('message','g',77,['code':("studentAttendance.inTime.label"),'default':("In Time")],-1)
printHtmlPart(17)
expressionOut.print(params?.inTime1)
printHtmlPart(18)
expressionOut.print(hasErrors(bean: studentAttendanceInstance, field: 'institue', 'error'))
printHtmlPart(19)
invokeTag('message','g',88,['code':("studentAttendance.institue.label"),'default':("Institue")],-1)
printHtmlPart(20)
expressionOut.print(institue?.id)
printHtmlPart(4)
expressionOut.print(institue?.name)
printHtmlPart(21)
expressionOut.print(hasErrors(bean: studentAttendanceInstance, field: 'staffName', 'error'))
printHtmlPart(22)
invokeTag('message','g',103,['code':("studentAttendance.staffName.label"),'default':("Staff Name")],-1)
printHtmlPart(23)
expressionOut.print(staffName?.id)
printHtmlPart(4)
expressionOut.print(staffName?.staffName)
printHtmlPart(24)
expressionOut.print(hasErrors(bean: studentAttendanceInstance, field: 'subject', 'error'))
printHtmlPart(25)
invokeTag('message','g',117,['code':("studentAttendance.subject.label"),'default':("Subject")],-1)
printHtmlPart(26)
expressionOut.print(subject?.id)
printHtmlPart(4)
expressionOut.print(subject?.subjectName)
printHtmlPart(27)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925995025L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
