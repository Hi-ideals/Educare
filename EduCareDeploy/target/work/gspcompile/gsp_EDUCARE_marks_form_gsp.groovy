import com.hiideals.exams.Marks
import com.hiideals.exams.Exam
import com.hiideals.instituite.classcourses.IClass
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_marks_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/marks/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(1)
expressionOut.print(hasErrors(bean: examDetailsInstance, field: 'year', 'error'))
printHtmlPart(2)
invokeTag('message','g',10,['code':("examDetails.year.label"),'default':("Year")],-1)
printHtmlPart(3)
for( batch in (batchList) ) {
printHtmlPart(4)
expressionOut.print(batch?.id)
printHtmlPart(5)
expressionOut.print(batch?.batchName)
printHtmlPart(6)
}
printHtmlPart(7)
expressionOut.print(hasErrors(bean: examDetailsInstance, field: 'year', 'error'))
printHtmlPart(8)
for( exam in (Exam.findAllByInstitute(instituite)) ) {
printHtmlPart(4)
expressionOut.print(exam?.id)
printHtmlPart(5)
expressionOut.print(exam?.examName)
printHtmlPart(6)
}
printHtmlPart(9)
expressionOut.print(hasErrors(bean: examDetailsInstance, field: 'iclass', 'error'))
printHtmlPart(10)
invokeTag('message','g',44,['code':("examDetails.iclass.label"),'default':("Iclass")],-1)
printHtmlPart(11)
expressionOut.print(remoteFunction(
			          controller: 'marks', 
			          action: 'getExamDetails',
					  update:'subjects',
			         params: "\'iclass=\' + this.value +  \'&examId=\' + document.getElementById('exam').value+ \'&yearId=\' + document.getElementById('year').value "))
printHtmlPart(12)
expressionOut.print(remoteFunction(
			          controller: 'marks', 
			          action: 'getStudents',
					  update:'getStudents',
			         params: "\'iclass=\' + this.value +  \'&examId=\' + document.getElementById('exam').value+ \'&yearId=\' + document.getElementById('year').value "))
printHtmlPart(13)
for( iclass in (IClass.findAllByInstituite(instituite)) ) {
printHtmlPart(4)
expressionOut.print(iclass?.id)
printHtmlPart(5)
expressionOut.print(iclass?.classname)
printHtmlPart(6)
}
printHtmlPart(14)
invokeTag('render','g',72,['template':("students")],-1)
printHtmlPart(15)
invokeTag('render','g',77,['template':("marksList")],-1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925994171L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
