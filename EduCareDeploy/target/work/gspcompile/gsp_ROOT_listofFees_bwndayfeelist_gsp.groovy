import com.hiideals.instituite.helper.AcademicYear
import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.student.Student
import com.hiideals.instituite.feemanagment.Fee
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_listofFees_bwndayfeelist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/listofFees/_bwndayfeelist.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(1)
invokeTag('message','g',25,['code':("fee.studentId.label"),'default':("Student Name")],-1)
printHtmlPart(2)
invokeTag('message','g',34,['code':(message(code: 'fee.totalPaid.label', default: 'Total Paid'))],-1)
printHtmlPart(3)
invokeTag('message','g',35,['code':(message(code: 'fee.due.label', default: 'Due'))],-1)
printHtmlPart(4)
expressionOut.print(message(code: 'fee.lastUpdated.label', default: 'Updated Date	'))
printHtmlPart(5)
loop:{
int i = 0
for( feeInstance in (feeInstanceList) ) {
printHtmlPart(6)
if(true && (feeInstance !=null)) {
printHtmlPart(7)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(8)
invokeTag('set','g',54,['value':(Student.findById(feeInstance?.studentId)),'var':("student")],-1)
printHtmlPart(9)
expressionOut.print(feeInstance?.studentName)
printHtmlPart(10)
invokeTag('set','g',57,['value':(student?.academicyear),'var':("aca")],-1)
printHtmlPart(11)
invokeTag('set','g',61,['value':(Fee.findByAcademic(aca[0])),'var':("aca1")],-1)
printHtmlPart(12)
expressionOut.print(aca1?.totalFee)
printHtmlPart(13)
expressionOut.print(feeInstance?.invoiceNo)
printHtmlPart(14)
if(true && (feeInstance?.feetypetracker?.amountPaidT[3])) {
printHtmlPart(15)
expressionOut.print(feeInstance?.feetypetracker?.amountPaidT[3])
printHtmlPart(15)
}
else if(true && (feeInstance?.feetypetracker?.amountPaidT[3]==0 && feeInstance?.feetypetracker?.amountPaidT[2])) {
printHtmlPart(16)
expressionOut.print(feeInstance?.feetypetracker?.amountPaidT[2])
printHtmlPart(17)
}
else if(true && (feeInstance?.feetypetracker?.amountPaidT[2]==0 && feeInstance?.feetypetracker?.amountPaidT[3]==0 && feeInstance?.feetypetracker?.amountPaidT[1])) {
printHtmlPart(16)
expressionOut.print(feeInstance?.feetypetracker?.amountPaidT[1])
printHtmlPart(17)
}
else if(true && (feeInstance?.feetypetracker?.amountPaidT[1]==0 && feeInstance?.feetypetracker?.amountPaidT[2]==0 && feeInstance?.feetypetracker?.amountPaidT[0])) {
printHtmlPart(16)
expressionOut.print(feeInstance?.feetypetracker?.amountPaidT[0])
printHtmlPart(17)
}
printHtmlPart(18)
invokeTag('formatDate','g',92,['date':(feeInstance?.dateCreated),'format':("dd-MM-yyyy")],-1)
printHtmlPart(19)
expressionOut.print((student?.academicyear?.presentclass?.classname).toString().replace('[', '').replace(']', ''))
printHtmlPart(13)
expressionOut.print((student?.academicyear?.academicyear).toString().replace('[', '').replace(']', ''))
printHtmlPart(20)
}
printHtmlPart(21)
i++
}
}
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1706091072307L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
