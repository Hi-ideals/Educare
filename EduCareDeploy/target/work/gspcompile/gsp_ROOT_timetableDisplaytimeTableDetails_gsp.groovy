import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_timetableDisplaytimeTableDetails_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/timetableDisplay/timeTableDetails.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('set','g',4,['value':([tt:'start active open',ttList:'active']),'var':("activ"),'scope':("request")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=ISO-8859-1")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',8,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(3)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("default.home.label")],-1)
printHtmlPart(5)
for( _it998901309 in (hashset) ) {
changeItVariable(_it998901309)
printHtmlPart(6)
expressionOut.print(it)
printHtmlPart(7)
}
printHtmlPart(8)
for( Keyclass in (mapp?.keySet()) ) {
printHtmlPart(9)
expressionOut.print(Keyclass)
printHtmlPart(10)
invokeTag('set','g',44,['value':(mapp.getAt(Keyclass)),'var':("periodmap")],-1)
printHtmlPart(11)
for( periodStaff in (hashset) ) {
printHtmlPart(12)
expressionOut.print(periodmap.getAt(periodStaff))
printHtmlPart(13)
}
printHtmlPart(14)
}
printHtmlPart(15)
})
invokeTag('captureBody','sitemesh',61,[:],1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925997483L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
