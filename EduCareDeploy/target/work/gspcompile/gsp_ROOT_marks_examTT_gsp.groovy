import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_marks_examTT_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/marks/_examTT.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(exams?.examName)
printHtmlPart(1)
invokeTag('message','g',15,['code':("examDetails.examDate.label"),'default':("Exam Date")],-1)
printHtmlPart(2)
invokeTag('message','g',18,['code':("examDetails.examDuration.label"),'default':("Exam Duration")],-1)
printHtmlPart(2)
invokeTag('message','g',21,['code':("examDetails.iclass.label"),'default':("Class")],-1)
printHtmlPart(2)
invokeTag('message','g',24,['code':("examDetails.passMarks.label"),'default':("Pass Marks")],-1)
printHtmlPart(2)
invokeTag('message','g',27,['code':("examDetails.subject.label"),'default':("Subject")],-1)
printHtmlPart(2)
invokeTag('message','g',30,['code':("examDetails.totalMarks.label"),'default':("Total Marks")],-1)
printHtmlPart(3)
loop:{
int i = 0
for( examDetailsInstance in (examDetails) ) {
printHtmlPart(4)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(5)
invokeTag('formatDate','g',39,['date':(examDetailsInstance?.examDate),'type':("date"),'style':("LONG"),'timeStyle':("SHORT")],-1)
printHtmlPart(6)
expressionOut.print(fieldValue(bean: examDetailsInstance, field: "examDuration"))
printHtmlPart(7)
expressionOut.print(fieldValue(bean: examDetailsInstance, field: "iclass.classname"))
printHtmlPart(7)
expressionOut.print(fieldValue(bean: examDetailsInstance, field: "passMarks"))
printHtmlPart(7)
expressionOut.print(fieldValue(bean: examDetailsInstance, field: "subject.subjectName"))
printHtmlPart(7)
expressionOut.print(fieldValue(bean: examDetailsInstance, field: "totalMarks"))
printHtmlPart(8)
i++
}
}
printHtmlPart(9)
createClosureForHtmlPart(10, 1)
invokeTag('link','g',72,['class':("btn-u sm-margin-bottom-10 btn blue"),'controller':("marks"),'action':("getExamTTPrint"),'target':("_blank"),'params':([iclass:params.iclass.id,year:params.year.id,exam:params.exam.id])],1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925994329L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
