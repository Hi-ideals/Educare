import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_birthday_bdayList_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/birthday/_bdayList.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
loop:{
int j = 0
for( c in (bdays) ) {
printHtmlPart(1)
expressionOut.print(c?.studentName)
printHtmlPart(2)
invokeTag('formatDate','g',26,['date':(c?.studentDOB),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(3)
createTagBody(2, {->
printHtmlPart(4)
expressionOut.print(c?.id)
printHtmlPart(5)
invokeTag('actionSubmit','g',32,['value':("send "),'action':("stubday")],-1)
printHtmlPart(6)
})
invokeTag('form','g',33,['controller':("birthday")],2)
printHtmlPart(7)
j++
}
}
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926004969L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
