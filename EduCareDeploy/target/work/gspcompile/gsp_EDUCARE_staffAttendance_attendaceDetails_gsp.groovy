import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_staffAttendance_attendaceDetails_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/staffAttendance/_attendaceDetails.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: studentAttendanceInstance, field: 'section', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("studentAttendance.section.label"),'default':("Staff Name")],-1)
printHtmlPart(2)
for( staff in (staffs) ) {
printHtmlPart(3)
expressionOut.print(staff?.id)
printHtmlPart(4)
expressionOut.print(staff?.staffName)
printHtmlPart(5)
}
printHtmlPart(6)
expressionOut.print(hasErrors(bean: studentAttendanceInstance, field: 'section', 'error'))
printHtmlPart(7)
invokeTag('message','g',23,['code':("studentAttendance.section.label"),'default':("Attendance Report Type")],-1)
printHtmlPart(8)
expressionOut.print(hasErrors(bean: studentAttendanceInstance, field: 'section', 'error'))
printHtmlPart(9)
invokeTag('message','g',38,['code':("studentAttendance.section.label"),'default':("From Date")],-1)
printHtmlPart(10)
expressionOut.print(hasErrors(bean: studentAttendanceInstance, field: 'section', 'error'))
printHtmlPart(11)
invokeTag('message','g',47,['code':("studentAttendance.section.label"),'default':("To Date")],-1)
printHtmlPart(12)
expressionOut.print(hasErrors(bean: studentAttendanceInstance, field: 'section', 'error'))
printHtmlPart(13)
invokeTag('submitButton','g',59,['class':("btn btn-success btn blue"),'name':("Get Staff Details")],-1)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926011452L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
