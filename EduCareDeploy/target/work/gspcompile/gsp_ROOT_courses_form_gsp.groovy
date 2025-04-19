import com.hiideals.instituite.classcourses.Courses
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_courses_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/courses/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: coursesInstance, field: 'courseDescription', 'error'))
printHtmlPart(1)
invokeTag('textField','g',9,['name':("courseDescription"),'class':("form-control"),'required':(""),'value':(coursesInstance?.courseDescription)],-1)
printHtmlPart(2)
invokeTag('message','g',11,['code':("courses.courseDescription.label"),'default':("Course Description")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: coursesInstance, field: 'courseName', 'error'))
printHtmlPart(1)
invokeTag('textField','g',21,['name':("courseName"),'class':("form-control"),'required':(""),'value':(coursesInstance?.courseName)],-1)
printHtmlPart(4)
invokeTag('message','g',23,['code':("courses.courseName.label"),'default':("Course Name")],-1)
printHtmlPart(5)
expressionOut.print(hasErrors(bean: coursesInstance, field: 'instituite', 'error'))
printHtmlPart(1)
invokeTag('select','g',34,['id':("instituite"),'class':("many-to-one"),'name':("instituite.id"),'from':(com.hiideals.instituite.main.Instituite.list()),'optionKey':("id"),'required':(""),'value':(coursesInstance?.instituite?.id)],-1)
printHtmlPart(6)
invokeTag('message','g',36,['code':("courses.instituite.label"),'default':("Instituite")],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925999322L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
