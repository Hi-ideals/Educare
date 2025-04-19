import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_timeTable_staffListDropdown_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/timeTable/_staffListDropdown.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(null)
printHtmlPart(1)
for( cls in (staffList) ) {
printHtmlPart(2)
expressionOut.print(cls.id)
printHtmlPart(3)
expressionOut.print(cls.staffName)
printHtmlPart(4)
}
printHtmlPart(5)
if(true && (staffList.size()<=0)) {
printHtmlPart(2)
expressionOut.print(null)
printHtmlPart(6)
}
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926014852L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
