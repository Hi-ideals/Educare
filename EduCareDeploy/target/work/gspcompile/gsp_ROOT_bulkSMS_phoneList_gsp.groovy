import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_bulkSMS_phoneList_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bulkSMS/_phoneList.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
if(true && (params.role1=="Staff"|| params.iclass=="")) {
printHtmlPart(1)
for( phn in (staffphone) ) {
printHtmlPart(2)
expressionOut.print(phn?.address?.mobileNumber)
printHtmlPart(3)
expressionOut.print(phn?.address?.mobileNumber)
printHtmlPart(4)
expressionOut.print(phn?.staffName)
printHtmlPart(5)
}
printHtmlPart(6)
}
printHtmlPart(6)
if(true && (params.role1=="Student" || params.iclass!="")) {
printHtmlPart(1)
for( phn in (phoneList) ) {
printHtmlPart(2)
expressionOut.print(phn?.fatherDetails?.mobileNumber)
printHtmlPart(3)
expressionOut.print(phn?.fatherDetails?.mobileNumber)
printHtmlPart(4)
expressionOut.print(phn?.studentName)
printHtmlPart(5)
}
printHtmlPart(6)
}
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925999033L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
