import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_transportFee_transportFeeList_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/transportFee/_transportFeeList.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
printHtmlPart(1)
loop:{
int i = 0
for( transportFeeInstance in (transportFeeInstanceList) ) {
printHtmlPart(2)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(3)
expressionOut.print(transportFeeInstance.transport.destination.fromPlace)
printHtmlPart(4)
expressionOut.print(transportFeeInstance.transport.destination.toPlace)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: transportFeeInstance, field: "paymentId"))
printHtmlPart(6)
invokeTag('formatDate','g',43,['date':(transportFeeInstance.paymentDate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(7)
expressionOut.print(fieldValue(bean: transportFeeInstance, field: "payingAmount"))
printHtmlPart(8)
expressionOut.print(fieldValue(bean: transportFeeInstance, field: "remainingAmount"))
printHtmlPart(8)
expressionOut.print(fieldValue(bean: transportFeeInstance, field: "paidAmount"))
printHtmlPart(9)
expressionOut.print(fieldValue(bean: transportFeeInstance, field: "student.studentName"))
printHtmlPart(9)
expressionOut.print(fieldValue(bean: transportFeeInstance?.acdemicyear, field: "batchName"))
printHtmlPart(9)
expressionOut.print(fieldValue(bean: transportFeeInstance, field: "employee.staffName"))
printHtmlPart(10)
if(true && (transportFeeInstance?.student)) {
printHtmlPart(11)
expressionOut.print(transportFeeInstance?.student?.academicyear[0]?.presentclass.classname)
printHtmlPart(12)
expressionOut.print(transportFeeInstance?.student?.academicyear[0]?.section?.sectionName)
printHtmlPart(13)
}
else {
printHtmlPart(14)
}
printHtmlPart(15)
createTagBody(2, {->
printHtmlPart(16)
createTagBody(3, {->
printHtmlPart(17)
invokeTag('message','g',81,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(18)
})
invokeTag('link','g',82,['action':("edit"),'id':(LookUpED.encod(transportFeeInstance.id))],3)
printHtmlPart(19)
})
invokeTag('form','g',84,['url':([resource:transportFeeInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(20)
createClosureForHtmlPart(21, 2)
invokeTag('link','g',87,['controller':("transportFee"),'action':("transportBill"),'id':(transportFeeInstance.id),'target':("_blank")],2)
printHtmlPart(22)
i++
}
}
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926005865L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
