import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_student_feePopup_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/student/_feePopup.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(i)
printHtmlPart(1)
loop:{
int j = 0
for( FeeTypesInstance in (feeInstance?.feetypetracker) ) {
printHtmlPart(2)
expressionOut.print(FeeTypesInstance.instFeeTypeT)
printHtmlPart(3)
expressionOut.print(FeeTypesInstance.amountToBePaidT)
printHtmlPart(3)
expressionOut.print(FeeTypesInstance.amountPaidT)
printHtmlPart(3)
expressionOut.print(FeeTypesInstance.dueT)
printHtmlPart(4)
j++
}
}
printHtmlPart(5)
if(true && (feeInstance?.totaladmissionfee!='0')) {
printHtmlPart(6)
expressionOut.print(feeInstance?.totaladmissionfee)
printHtmlPart(7)
if(true && (feeInstance?.currentpaidadmissionfee>=0)) {
printHtmlPart(8)
expressionOut.print(feeInstance?.currentpaidadmissionfee)
printHtmlPart(9)
}
else {
printHtmlPart(8)
expressionOut.print(feeInstance?.paidadmissionfee)
printHtmlPart(9)
}
printHtmlPart(10)
if(true && (feeInstance?.paidadmissionfee==0)) {
printHtmlPart(8)
expressionOut.print(feeInstance?.totaladmissionfee)
printHtmlPart(9)
}
else {
printHtmlPart(8)
expressionOut.print(feeInstance?.dueadmissionfee)
printHtmlPart(9)
}
printHtmlPart(11)
}
printHtmlPart(12)
if(true && (feeInstance?.feetypetracker)) {
printHtmlPart(13)
if(true && (feeInstance?.discountT)) {
printHtmlPart(14)
expressionOut.print((feeInstance?.feetypetracker?.sum { it?.amountToBePaidT } + feeInstance?.totaladmissionfee))
printHtmlPart(15)
expressionOut.print(feeInstance?.discountT)
printHtmlPart(16)
expressionOut.print((feeInstance?.feetypetracker?.sum { it?.amountToBePaidT } + feeInstance?.totaladmissionfee)-(feeInstance?.discountT))
printHtmlPart(17)
if(true && (feeInstance?.currentpaidadmissionfee)) {
printHtmlPart(18)
expressionOut.print(feeInstance?.feetypetracker?.sum { it?.amountPaidT } + feeInstance?.currentpaidadmissionfee)
printHtmlPart(19)
}
else {
printHtmlPart(18)
expressionOut.print(feeInstance?.feetypetracker?.sum { it?.amountPaidT })
printHtmlPart(19)
}
printHtmlPart(20)
expressionOut.print(feeInstance?.feetypetracker?.sum { it?.dueT } + (feeInstance?.totaladmissionfee - feeInstance?.paidadmissionfee)-(feeInstance?.discountT))
printHtmlPart(21)
}
else {
printHtmlPart(22)
expressionOut.print(feeInstance?.feetypetracker?.sum { it?.amountToBePaidT } + feeInstance?.totaladmissionfee)
printHtmlPart(17)
if(true && (feeInstance?.currentpaidadmissionfee)) {
printHtmlPart(18)
expressionOut.print(feeInstance?.feetypetracker?.sum { it?.amountPaidT } + feeInstance?.currentpaidadmissionfee)
printHtmlPart(19)
}
else {
printHtmlPart(18)
expressionOut.print(feeInstance?.feetypetracker?.sum { it?.amountPaidT })
printHtmlPart(19)
}
printHtmlPart(20)
expressionOut.print(feeInstance?.feetypetracker?.sum { it?.dueT } + (feeInstance?.totaladmissionfee - feeInstance?.paidadmissionfee))
printHtmlPart(21)
}
printHtmlPart(23)
}
printHtmlPart(24)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1705995811746L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
