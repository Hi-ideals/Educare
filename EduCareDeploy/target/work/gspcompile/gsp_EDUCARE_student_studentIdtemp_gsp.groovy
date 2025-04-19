import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_student_studentIdtemp_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/student/_studentIdtemp.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: studentInstance, field: 'studentId', 'error'))
printHtmlPart(1)
if(true && (studentid)) {
printHtmlPart(2)
invokeTag('textField','g',8,['name':("studentId"),'id':("studentId"),'class':("form-control"),'required':(""),'value':(studentid)],-1)
printHtmlPart(3)
}
else {
printHtmlPart(2)
invokeTag('textField','g',12,['name':("studentId"),'id':("studentId"),'class':("form-control"),'required':(""),'value':(studentInstance?.studentId)],-1)
printHtmlPart(3)
}
printHtmlPart(4)
invokeTag('message','g',15,['code':("student.studentId.label"),'default':("Student Id")],-1)
printHtmlPart(5)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926000537L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
