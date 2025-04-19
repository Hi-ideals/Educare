import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_transportReport_transportVehicles_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/transportReport/_transportVehicles.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
loop:{
int i = 0
for( vehicleDetailsInstance in (vehicleDetailsInstanceList) ) {
printHtmlPart(1)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(2)
expressionOut.print(fieldValue(bean: vehicleDetailsInstance, field: "vehicleNo"))
printHtmlPart(3)
expressionOut.print(fieldValue(bean: vehicleDetailsInstance, field: "noOfSeats"))
printHtmlPart(3)
expressionOut.print(fieldValue(bean: vehicleDetailsInstance, field: "maxiumAllowed"))
printHtmlPart(3)
expressionOut.print(fieldValue(bean: vehicleDetailsInstance, field: "vehicleType"))
printHtmlPart(3)
expressionOut.print(fieldValue(bean: vehicleDetailsInstance, field: "contactPerson"))
printHtmlPart(4)
invokeTag('formatDate','g',50,['format':("MMM-dd-yyyy"),'date':(vehicleDetailsInstance.insuranceRenewalDate)],-1)
printHtmlPart(5)
i++
}
}
printHtmlPart(6)
createClosureForHtmlPart(7, 1)
invokeTag('link','g',61,['class':("btn-u sm-margin-bottom-10 btn blue"),'controller':("transportReport"),'action':("availableVehiclesPrint"),'target':("_blank"),'params':([vehicleNo:params.vehicle.id])],1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925995475L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
