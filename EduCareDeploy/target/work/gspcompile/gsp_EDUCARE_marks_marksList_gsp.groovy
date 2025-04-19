import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_marks_marksList_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/marks/_marksList.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
loop:{
int i = 0
for( examdetails in (exams) ) {
printHtmlPart(1)
expressionOut.print(i+1)
printHtmlPart(2)
expressionOut.print(examdetails?.subject?.subjectName)
printHtmlPart(3)
expressionOut.print(examdetails?.id)
printHtmlPart(4)
invokeTag('field','g',35,['name':("totalMarks"),'type':("number"),'class':("form-control"),'value':(examdetails?.totalMarks),'required':(""),'readOnly':("true")],-1)
printHtmlPart(2)
invokeTag('field','g',42,['name':("passMarks"),'type':("number"),'class':("form-control"),'value':(examdetails?.passMarks),'required':(""),'readOnly':("true")],-1)
printHtmlPart(2)
invokeTag('field','g',49,['name':("obtainedMarks"),'type':("number"),'class':("form-control"),'id':("obtainedMarks${i}"),'required':("")],-1)
printHtmlPart(5)
expressionOut.print(i)
printHtmlPart(6)
expressionOut.print(i)
printHtmlPart(7)
expressionOut.print(i)
printHtmlPart(8)
expressionOut.print(i)
printHtmlPart(9)
expressionOut.print(i)
printHtmlPart(10)
expressionOut.print(i)
printHtmlPart(11)
expressionOut.print(i)
printHtmlPart(12)
expressionOut.print(i)
printHtmlPart(13)
expressionOut.print(i)
printHtmlPart(7)
expressionOut.print(i)
printHtmlPart(14)
expressionOut.print(i)
printHtmlPart(15)
expressionOut.print(i)
printHtmlPart(9)
expressionOut.print(i)
printHtmlPart(16)
expressionOut.print(i)
printHtmlPart(17)
expressionOut.print(i)
printHtmlPart(18)
i++
}
}
printHtmlPart(19)
if(true && (flash.msg)) {
printHtmlPart(20)
}
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925994311L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
