import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_fee_instaFeePayPrintTemplate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/fee/_instaFeePayPrintTemplate.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('getImage','images',25,['id':(institute?.logo?.id),'width':("80px"),'height':("80px")],-1)
printHtmlPart(1)
expressionOut.print(institute?.name)
printHtmlPart(2)
expressionOut.print(institute?.affiliatedTo)
printHtmlPart(3)
expressionOut.print(studentdetails.registrationNo)
printHtmlPart(4)
expressionOut.print(feeTracker?.studentName)
printHtmlPart(5)
expressionOut.print(studentdetails?.fatherDetails?.parentName)
printHtmlPart(6)
expressionOut.print(studentdetails?.presentclass?.classname)
printHtmlPart(7)
invokeTag('formatDate','g',109,['format':("dd-MMM-yyyy"),'date':(feeTracker?.lastUpdated)],-1)
printHtmlPart(8)
loop:{
int i = 0
for( fInstance in (b) ) {
printHtmlPart(9)
expressionOut.print(fInstance.instFeeTypeT)
printHtmlPart(10)
expressionOut.print(fInstance.amountPaidT)
printHtmlPart(11)
i++
}
}
printHtmlPart(12)
expressionOut.print(sum)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926001683L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
