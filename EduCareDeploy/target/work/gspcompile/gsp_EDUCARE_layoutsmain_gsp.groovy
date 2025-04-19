import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_layoutsmain_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/main.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('layoutTitle','g',6,['default':("Grails")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',49,['src':("application.css")],-1)
printHtmlPart(2)
invokeTag('javascript','asset',51,['src':("application.js")],-1)
printHtmlPart(3)
invokeTag('layoutHead','g',51,[:],-1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',58,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',62,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',70,['template':("/header/leftSide")],-1)
printHtmlPart(8)
invokeTag('layoutBody','g',78,[:],-1)
printHtmlPart(9)
invokeTag('render','g',80,['template':("/footer/footer")],-1)
printHtmlPart(10)
})
invokeTag('captureBody','sitemesh',138,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925993261L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
