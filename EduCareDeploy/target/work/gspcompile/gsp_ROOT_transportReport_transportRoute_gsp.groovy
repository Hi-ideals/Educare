import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_transportReport_transportRoute_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/transportReport/_transportRoute.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
loop:{
int i = 0
for( routeDetailsInstance in (routeDetailsInstanceList) ) {
printHtmlPart(1)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(2)
expressionOut.print(fieldValue(bean: routeDetailsInstance, field: "vehicle.vehicleNo"))
printHtmlPart(3)
expressionOut.print(fieldValue(bean: routeDetailsInstance, field: "routeCode"))
printHtmlPart(3)
expressionOut.print(fieldValue(bean: routeDetailsInstance, field: "startPlace"))
printHtmlPart(3)
expressionOut.print(fieldValue(bean: routeDetailsInstance, field: "stopPlace"))
printHtmlPart(4)
i++
}
}
printHtmlPart(5)
createClosureForHtmlPart(6, 1)
invokeTag('link','g',47,['class':("btn-u sm-margin-bottom-10 btn blue"),'controller':("transportReport"),'action':("availableRoutesPrint"),'target':("_blank"),'params':([routeNo:params.route.id])],1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925995439L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
