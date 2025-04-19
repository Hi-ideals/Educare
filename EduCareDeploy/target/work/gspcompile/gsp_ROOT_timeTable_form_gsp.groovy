import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.classcourses.Subject
import com.hiideals.instituite.classcourses.Section
import com.hiideals.utils.APPConsumer
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_timeTable_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/timeTable/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
printHtmlPart(1)
printHtmlPart(1)
printHtmlPart(1)
invokeTag('getInstituite','regId',8,[:],-1)
printHtmlPart(1)
invokeTag('set','g',9,['value':(IClass.findAllByInstituite(instituite)),'var':("classList")],-1)
printHtmlPart(1)
invokeTag('set','g',11,['value':(Section.findAllByInstituite(instituite)),'var':("sectionList")],-1)
printHtmlPart(2)
invokeTag('set','g',14,['value':(Subject.findAllByInstitute(instituite)),'var':("subjectList")],-1)
printHtmlPart(3)
expressionOut.print(null)
printHtmlPart(4)
for( cls in (classList) ) {
printHtmlPart(5)
expressionOut.print(cls.id)
printHtmlPart(6)
expressionOut.print(cls.classname)
printHtmlPart(7)
}
printHtmlPart(8)
expressionOut.print(hasErrors(bean: timeTableInstance, field: 'dateOfTimeTable', 'error'))
printHtmlPart(9)
invokeTag('message','g',70,['code':("timeTable.dateOfTimeTable.label"),'default':("Time Table Date")],-1)
printHtmlPart(10)
expressionOut.print(timeTableInstance?.dateOfTimeTable)
printHtmlPart(11)
expressionOut.print(APPConsumer.AJAX_NAME)
printHtmlPart(12)
expressionOut.print(APPConsumer.AJAX_NAME)
printHtmlPart(13)
expressionOut.print(APPConsumer.AJAX_NAME)
printHtmlPart(14)
expressionOut.print(APPConsumer.AJAX_NAME)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926015061L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
