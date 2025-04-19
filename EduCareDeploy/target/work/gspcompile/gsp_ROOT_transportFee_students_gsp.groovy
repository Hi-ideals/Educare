import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_transportFee_students_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/transportFee/_students.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: transportFeeInstance, field: 'student', 'error'))
printHtmlPart(1)
invokeTag('message','g',4,['code':("transportFee.student.label"),'default':("Student")],-1)
printHtmlPart(2)
expressionOut.print(remoteFunction(
			          controller: 'transportFee', 
			          action: 'getFeeDetails',
					  update:'feedetails',
			          params: "\'studentId=\' + this.value+  \'&transportId=\' + document.getElementById('transport').value+  \'&student=\' + document.getElementById('student').value"))
printHtmlPart(3)
for( _it1204785709 in (students) ) {
changeItVariable(_it1204785709)
printHtmlPart(4)
expressionOut.print(it?.id)
printHtmlPart(5)
expressionOut.print(it?.studentName)
printHtmlPart(6)
}
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926005875L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
