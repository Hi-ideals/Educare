import com.hiideals.exams.Exam
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_exam_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/exam/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: examInstance, field: 'examDetails', 'error'))
printHtmlPart(1)
invokeTag('message','g',10,['code':("exam.examDetails.label"),'default':("Exam Details")],-1)
printHtmlPart(2)
invokeTag('select','g',13,['name':("examDetails"),'class':("many-to-many"),'from':(com.hiideals.exams.ExamDetails.list()),'multiple':("multiple"),'optionKey':("id"),'size':("5"),'value':(examInstance?.examDetails*.id)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: examInstance, field: 'examName', 'error'))
printHtmlPart(4)
invokeTag('textField','g',23,['name':("examName"),'class':("form-control"),'required':(""),'id':("examName"),'value':(examInstance?.examName)],-1)
printHtmlPart(5)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926000945L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
