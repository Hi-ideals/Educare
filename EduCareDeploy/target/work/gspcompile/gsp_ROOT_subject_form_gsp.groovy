import com.hiideals.instituite.classcourses.Subject
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_subject_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/subject/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: subjectInstance, field: 'subjectDescription', 'error'))
printHtmlPart(1)
invokeTag('message','g',12,['code':("subject.subjectDescription.label"),'default':("Subject Description")],-1)
printHtmlPart(2)
invokeTag('textField','g',15,['name':("subjectDescription"),'class':("form-control"),'value':(subjectInstance?.subjectDescription)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: subjectInstance, field: 'subjectName', 'error'))
printHtmlPart(4)
invokeTag('message','g',26,['code':("subject.subjectName.label"),'default':("Subject Name")],-1)
printHtmlPart(5)
invokeTag('textField','g',30,['name':("subjectName"),'required':(""),'class':("form-control"),'value':(subjectInstance?.subjectName),'id':("subjectname")],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: subjectInstance, field: 'iclass', 'error'))
printHtmlPart(4)
invokeTag('message','g',41,['code':("subject.iclass.label"),'default':("Class")],-1)
printHtmlPart(7)
if(true && (subjectInstance.iclass !=null)) {
printHtmlPart(8)
expressionOut.print(subjectInstance.iclass.id)
printHtmlPart(9)
expressionOut.print(subjectInstance?.iclass?.classname)
printHtmlPart(10)
}
else {
printHtmlPart(11)
}
printHtmlPart(12)
for( cls in (iclass) ) {
printHtmlPart(8)
expressionOut.print(cls.id)
printHtmlPart(13)
expressionOut.print(cls.classname)
printHtmlPart(10)
}
printHtmlPart(14)
expressionOut.print(hasErrors(bean: subjectInstance, field: 'institute', 'error'))
printHtmlPart(15)
invokeTag('message','g',69,['code':("subject.institute.label"),'default':("Institute")],-1)
printHtmlPart(16)
expressionOut.print(instituite?.id)
printHtmlPart(17)
expressionOut.print(instituite?.name)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925997872L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
