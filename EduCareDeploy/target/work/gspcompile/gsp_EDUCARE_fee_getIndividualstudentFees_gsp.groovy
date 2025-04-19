import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.instituite.helper.AcademicYear
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_fee_getIndividualstudentFees_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/fee/_getIndividualstudentFees.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
for( ss in (list1) ) {
printHtmlPart(2)
expressionOut.print(ss?.studentId?.registrationNo)
printHtmlPart(3)
expressionOut.print(ss?.studentId?.studentName)
printHtmlPart(4)
expressionOut.print(ss?.studentId?.fatherDetails?.parentName)
printHtmlPart(4)
expressionOut.print(ss?.academic?.academicyear)
printHtmlPart(5)
invokeTag('set','g',44,['var':("iclass"),'value':(AcademicYear.findById(ss?.academic?.id))],-1)
printHtmlPart(6)
expressionOut.print(iclass?.presentclass?.classname)
printHtmlPart(4)
expressionOut.print(iclass?.section?.sectionName)
printHtmlPart(7)
expressionOut.print(ss?.totalFee)
printHtmlPart(4)
expressionOut.print(ss?.totalPaid)
printHtmlPart(4)
expressionOut.print(ss?.due)
printHtmlPart(8)
if(true && (ss?.due==0)) {
printHtmlPart(9)
}
else {
printHtmlPart(10)
createClosureForHtmlPart(11, 3)
invokeTag('link','g',66,['controller':("fee"),'action':("edit"),'id':(LookUpED.encod(ss?.id)),'class':("btn yellow")],3)
printHtmlPart(12)
}
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (ss?.due==0)) {
printHtmlPart(15)
}
else {
}
printHtmlPart(16)
createClosureForHtmlPart(17, 1)
invokeTag('link','g',96,['controller':("fee"),'action':("edit"),'style':("color:#fff"),'id':(LookUpED.encod(feeInstance?.id)),'title':("")],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1647952240000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
