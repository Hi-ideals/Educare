import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_libraryReports_staffReturnDate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/libraryReports/_staffReturnDate.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
loop:{
int i = 0
for( returnInstance in (staffreturnDate) ) {
printHtmlPart(1)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(2)
expressionOut.print(returnInstance?.staffId?.staffName)
printHtmlPart(3)
expressionOut.print(returnInstance?.books?.title.toString().replace('[', '').replace(']', ''))
printHtmlPart(4)
expressionOut.print(returnInstance?.dateOfReturn)
printHtmlPart(5)
i++
}
}
printHtmlPart(6)
createClosureForHtmlPart(7, 1)
invokeTag('link','g',40,['class':("btn-u sm-margin-bottom-10 btn blue"),'controller':("libraryReports"),'action':("getByReturnDatePrint"),'target':("_blank"),'params':([type:params.type,from:params.from,to:params.to])],1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925999652L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
