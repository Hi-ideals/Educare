import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_transportReport_transportDriver_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/transportReport/_transportDriver.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
loop:{
int i = 0
for( driverDetailsInstance in (driverDetailsInstanceList) ) {
printHtmlPart(1)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(2)
expressionOut.print(fieldValue(bean: driverDetailsInstance, field: "vehicle.vehicleNo"))
printHtmlPart(3)
expressionOut.print(fieldValue(bean: driverDetailsInstance, field: "name"))
printHtmlPart(4)
expressionOut.print(driverDetailsInstance?.presentAddress?.hsno)
printHtmlPart(5)
expressionOut.print(driverDetailsInstance?.presentAddress?.street)
printHtmlPart(6)
expressionOut.print(driverDetailsInstance?.presentAddress?.city)
printHtmlPart(5)
expressionOut.print(driverDetailsInstance?.presentAddress?.state)
printHtmlPart(7)
invokeTag('formatDate','g',38,['format':("MMM-dd-yyyy"),'date':(driverDetailsInstance.dob)],-1)
printHtmlPart(8)
expressionOut.print(fieldValue(bean: driverDetailsInstance, field: "phone"))
printHtmlPart(9)
i++
}
}
printHtmlPart(10)
createClosureForHtmlPart(11, 1)
invokeTag('link','g',51,['class':("btn-u sm-margin-bottom-10 btn blue"),'controller':("transportReport"),'action':("availableDriversPrint"),'target':("_blank"),'params':([driverName:params.driver.id])],1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925995522L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
