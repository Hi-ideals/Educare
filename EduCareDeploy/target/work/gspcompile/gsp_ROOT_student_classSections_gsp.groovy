import com.hiideals.instituite.classcourses.IClass
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_student_classSections_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/student/_classSections.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
if(true && (studentInstance?.academicyear?.section!=null)) {
printHtmlPart(1)
expressionOut.print(studentInstance?.academicyear?.section.id?.last())
printHtmlPart(2)
expressionOut.print(studentInstance?.academicyear?.section?.sectionName?.last())
printHtmlPart(3)
}
printHtmlPart(4)
if(true && ((classId!=null || classId!='') && sections==null && studentInstance?.academicyear?.section==null)) {
printHtmlPart(5)
for( section in (IClass.findById(classId)?.sections) ) {
printHtmlPart(6)
expressionOut.print(section.id)
printHtmlPart(7)
expressionOut.print(section.sectionName)
printHtmlPart(8)
}
printHtmlPart(9)
}
printHtmlPart(10)
if(true && (sections)) {
printHtmlPart(11)
expressionOut.print(remoteFunction(
			          controller: 'student', 
			          action: 'getStudentUniqueId',
					  update:'studentIdTemp',
			          params: "\'sectionId=\' + this.value +  \'&classId=\' + document.getElementById('presentclass').value"))
printHtmlPart(12)
for( section in (sections) ) {
printHtmlPart(6)
expressionOut.print(section.id)
printHtmlPart(7)
expressionOut.print(section.sectionName)
printHtmlPart(8)
}
printHtmlPart(9)
}
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926000324L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
