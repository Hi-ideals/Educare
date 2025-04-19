import com.hiideals.exams.ExamDetails
import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.helper.Batch
import com.hiideals.exams.Exam
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_examDetails_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/examDetails/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(1)
expressionOut.print(hasErrors(bean: examDetailsInstance, field: 'iclass', 'error'))
printHtmlPart(2)
invokeTag('message','g',13,['code':("examDetails.iclass.label"),'default':("class")],-1)
printHtmlPart(3)
expressionOut.print(remoteFunction(
			          controller: 'examDetails', 
			          action: 'getSubjects',
					  update:'subjects',
			          params: "\'value=\' + this.value"))
printHtmlPart(4)
for( iclass in (IClass.findAllByInstituite(instituite)) ) {
printHtmlPart(5)
expressionOut.print(iclass?.id)
printHtmlPart(6)
expressionOut.print(iclass?.classname)
printHtmlPart(7)
}
printHtmlPart(8)
expressionOut.print(hasErrors(bean: examDetailsInstance, field: 'year', 'error'))
printHtmlPart(9)
invokeTag('message','g',38,['code':("examDetails.year.label"),'default':("Year")],-1)
printHtmlPart(10)
for( batch in (batchList) ) {
printHtmlPart(5)
expressionOut.print(batch?.id)
printHtmlPart(6)
expressionOut.print(batch?.batchName)
printHtmlPart(7)
}
printHtmlPart(11)
for( exam in (exams) ) {
printHtmlPart(5)
expressionOut.print(exam?.id)
printHtmlPart(6)
expressionOut.print(exam?.examName)
printHtmlPart(7)
}
printHtmlPart(12)
invokeTag('render','g',76,['template':("classSubjects")],-1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926001911L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
