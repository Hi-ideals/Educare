import com.hiideals.enums.WeekdaysEnum
import com.hiideals.instituite.student.Student
import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_transportReporttransportFeedetailsPrint_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/transportReport/transportFeedetailsPrint.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(0)
createTagBody(2, {->
createTagBody(3, {->
printHtmlPart(2)
expressionOut.print(studentInstance?.studentName)
})
invokeTag('captureTitle','sitemesh',14,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',14,[:],2)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',18,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',73,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',82,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',85,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('getImage','images',110,['id':(instituite?.logo?.id),'width':("60px"),'height':("60px")],-1)
printHtmlPart(8)
expressionOut.print(instituite?.name)
printHtmlPart(9)
expressionOut.print(instituite?.affiliatedTo)
printHtmlPart(10)
expressionOut.print(instituite?.hsno)
printHtmlPart(11)
expressionOut.print(instituite?.street)
printHtmlPart(11)
expressionOut.print(instituite?.city)
printHtmlPart(12)
expressionOut.print(instituite?.pinCode)
printHtmlPart(13)
expressionOut.print(instituite?.state)
printHtmlPart(11)
expressionOut.print(instituite?.country)
printHtmlPart(14)
expressionOut.print(instituite?.phone)
printHtmlPart(15)
if(true && (params?.type == "student")) {
printHtmlPart(16)
printHtmlPart(17)
printHtmlPart(17)
loop:{
int i = 0
for( transportFeeInstance in (transportFeeInstanceList) ) {
printHtmlPart(18)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(19)
expressionOut.print(transportFeeInstance.transport.destination.fromPlace)
printHtmlPart(20)
expressionOut.print(transportFeeInstance.transport.destination.toPlace)
printHtmlPart(21)
expressionOut.print(fieldValue(bean: transportFeeInstance, field: "paymentId"))
printHtmlPart(22)
invokeTag('formatDate','g',170,['date':(transportFeeInstance.paymentDate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(23)
expressionOut.print(fieldValue(bean: transportFeeInstance, field: "paidAmount"))
printHtmlPart(24)
expressionOut.print(fieldValue(bean: transportFeeInstance, field: "remainingAmount"))
printHtmlPart(25)
expressionOut.print(fieldValue(bean: transportFeeInstance, field: "student.studentName"))
printHtmlPart(26)
if(true && (transportFeeInstance?.student)) {
printHtmlPart(27)
expressionOut.print(transportFeeInstance?.student?.academicyear[0]?.presentclass.classname)
printHtmlPart(25)
expressionOut.print(transportFeeInstance?.student?.academicyear[0]?.section?.sectionName)
printHtmlPart(28)
}
else {
printHtmlPart(29)
}
printHtmlPart(30)
i++
}
}
printHtmlPart(31)
}
else if(true && (params?.type == "staff")) {
printHtmlPart(32)
printHtmlPart(17)
printHtmlPart(17)
loop:{
int i = 0
for( transportFeeInstance in (transportFeeInstanceList) ) {
printHtmlPart(18)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(19)
expressionOut.print(transportFeeInstance.transport.destination.fromPlace)
printHtmlPart(20)
expressionOut.print(transportFeeInstance.transport.destination.toPlace)
printHtmlPart(21)
expressionOut.print(fieldValue(bean: transportFeeInstance, field: "paymentId"))
printHtmlPart(22)
invokeTag('formatDate','g',235,['date':(transportFeeInstance.paymentDate),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(23)
expressionOut.print(fieldValue(bean: transportFeeInstance, field: "paidAmount"))
printHtmlPart(24)
expressionOut.print(fieldValue(bean: transportFeeInstance, field: "remainingAmount"))
printHtmlPart(25)
expressionOut.print(fieldValue(bean: transportFeeInstance, field: "employee.staffName"))
printHtmlPart(33)
i++
}
}
printHtmlPart(31)
}
printHtmlPart(34)
invokeTag('render','g',306,['template':("/footer/footer")],-1)
printHtmlPart(35)
})
invokeTag('captureBody','sitemesh',344,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(36)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925995508L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
