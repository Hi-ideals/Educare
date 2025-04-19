import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_studentAttendance_attendaceDetails_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/studentAttendance/_attendaceDetails.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: studentAttendanceInstance, field: 'section', 'error'))
printHtmlPart(1)
invokeTag('message','g',8,['code':("studentAttendance.section.label"),'default':("Class")],-1)
printHtmlPart(2)
expressionOut.print(remoteFunction(controller:'student',action: 'classSections',
                       update: 'updateclasssection',
                       params: '\'classId=\' + this.value'))
printHtmlPart(3)
for( cls in (classes) ) {
printHtmlPart(4)
expressionOut.print(cls?.id)
printHtmlPart(5)
expressionOut.print(cls?.classname)
printHtmlPart(6)
}
printHtmlPart(7)
invokeTag('render','g',24,['template':("classSections")],-1)
printHtmlPart(8)
invokeTag('render','g',29,['template':("classStudent")],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: studentAttendanceInstance, field: 'section', 'error'))
printHtmlPart(1)
invokeTag('message','g',37,['code':("studentAttendance.section.label"),'default':("Attendance Report Type")],-1)
printHtmlPart(10)
expressionOut.print(hasErrors(bean: studentAttendanceInstance, field: 'section', 'error'))
printHtmlPart(11)
expressionOut.print(hasErrors(bean: studentAttendanceInstance, field: 'section', 'error'))
printHtmlPart(12)
invokeTag('message','g',66,['code':("studentAttendance.section.label"),'default':("To Date")],-1)
printHtmlPart(13)
expressionOut.print(hasErrors(bean: studentAttendanceInstance, field: 'section', 'error'))
printHtmlPart(14)
invokeTag('submitButton','g',80,['onclick':("myfunction()"),'class':("btn btn-success btn blue"),'name':("Get Student Details")],-1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925994996L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
