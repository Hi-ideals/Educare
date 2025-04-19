import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_libraryReports_staffWise_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/libraryReports/_staffWise.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(stffWise?.staffId?.staffName[0])
printHtmlPart(1)
loop:{
int i = 0
for( stfInstance in (stffWise) ) {
printHtmlPart(2)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(3)
expressionOut.print(stfInstance?.books?.title.toString().replace('[', '').replace(']', ''))
printHtmlPart(4)
expressionOut.print(stfInstance?.dateOfIssue)
printHtmlPart(4)
expressionOut.print(stfInstance?.dateOfReturn)
printHtmlPart(4)
expressionOut.print(stfInstance?.fineAmount)
printHtmlPart(4)
expressionOut.print(stfInstance?.returned)
printHtmlPart(5)
i++
}
}
printHtmlPart(6)
createClosureForHtmlPart(7, 1)
invokeTag('link','g',48,['class':("btn-u sm-margin-bottom-10 btn blue"),'controller':("libraryReports"),'action':("getBystaffWisePrint"),'target':("_blank"),'params':([staffName:params.staffName])],1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925999775L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
