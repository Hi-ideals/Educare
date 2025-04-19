import com.hiideals.instituite.classcourses.IClass
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_student_admissionfee_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/student/_admissionfee.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
if(true && (sections1==null && studentInstance?.academicyear?.feeId ==null)) {
printHtmlPart(1)
for( section in ("") ) {
printHtmlPart(2)
}
printHtmlPart(3)
}
printHtmlPart(4)
if(true && (studentInstance?.academicyear?.feeId !=null)) {
printHtmlPart(5)
if(true && (studentInstance?.academicyear?.feeId?.totaladmissionfee)) {
printHtmlPart(6)
expressionOut.print(studentInstance?.academicyear?.feeId?.totaladmissionfee?.last())
printHtmlPart(6)
}
printHtmlPart(7)
}
printHtmlPart(4)
if(true && (sections1)) {
printHtmlPart(8)
for( section in (sections1) ) {
printHtmlPart(9)
expressionOut.print(section?.id)
printHtmlPart(10)
expressionOut.print(section?.totalAmount)
printHtmlPart(11)
}
printHtmlPart(3)
}
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926000649L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
