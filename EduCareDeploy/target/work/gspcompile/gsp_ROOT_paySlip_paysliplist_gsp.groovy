import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_paySlip_paysliplist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/paySlip/_paysliplist.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('getImage','images',38,['id':(instituite?.logo?.id),'width':("100px")],-1)
printHtmlPart(1)
expressionOut.print(instituite?.name)
printHtmlPart(2)
expressionOut.print(instituite?.affiliatedTo)
printHtmlPart(3)
expressionOut.print(instituite?.hsno)
printHtmlPart(4)
expressionOut.print(instituite?.street)
printHtmlPart(5)
expressionOut.print(instituite?.city)
printHtmlPart(6)
expressionOut.print(instituite?.pinCode)
printHtmlPart(4)
expressionOut.print(instituite?.state)
printHtmlPart(5)
expressionOut.print(instituite?.country)
printHtmlPart(7)
expressionOut.print(instituite?.phone)
printHtmlPart(8)
expressionOut.print(params?.month)
printHtmlPart(9)
expressionOut.print(params?.academicyear)
printHtmlPart(10)
invokeTag('formatDate','g',81,['date':(date),'format':("dd-MMM-yyyy")],-1)
printHtmlPart(11)
expressionOut.print(staffdetails?.staffName)
printHtmlPart(12)
expressionOut.print(staffdetails?.staffID)
printHtmlPart(13)
expressionOut.print(staffdetails?.staffType)
printHtmlPart(14)
for( payslip1 in (additionlist) ) {
printHtmlPart(15)
expressionOut.print(payslip1?.payHead)
printHtmlPart(16)
expressionOut.print(payslip1?.aunit)
printHtmlPart(17)
}
printHtmlPart(18)
for( payslip in (deductionlist) ) {
printHtmlPart(15)
expressionOut.print(payslip?.payHead)
printHtmlPart(16)
expressionOut.print(payslip?.aunit)
printHtmlPart(17)
}
printHtmlPart(19)
expressionOut.print(additionsum)
printHtmlPart(20)
expressionOut.print(deductionsum)
printHtmlPart(21)
expressionOut.print(total?.totalPaid)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925999145L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
