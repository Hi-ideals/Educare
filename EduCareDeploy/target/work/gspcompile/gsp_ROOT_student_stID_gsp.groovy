import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.classcourses.Section
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_student_stID_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/student/_stID.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
expressionOut.print(remoteFunction(controller:'student',action: 'phoneList',
                       update: 'phn',
                       params: "'sectionId=' + this.value +'&&classId='+'${iclass} '"))
printHtmlPart(2)
for( sec in (sections) ) {
printHtmlPart(3)
expressionOut.print(sec?.id)
printHtmlPart(4)
expressionOut.print(sec.sectionName)
printHtmlPart(5)
}
printHtmlPart(6)
invokeTag('render','g',29,['template':("phoneList"),'model':([sectionId:secionId,classId:classId])],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926000575L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
