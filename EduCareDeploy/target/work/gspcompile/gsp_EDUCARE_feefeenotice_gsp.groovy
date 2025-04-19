import com.hiideals.instituite.student.Student
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_feefeenotice_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/fee/feenotice.gsp" }
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
invokeTag('captureHead','sitemesh',65,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',74,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',77,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('getImage','images',99,['id':(instituite?.logo?.id),'width':("100px"),'height':("100px")],-1)
printHtmlPart(8)
expressionOut.print(instituite?.name)
printHtmlPart(9)
expressionOut.print(instituite?.affiliatedTo)
printHtmlPart(10)
expressionOut.print(stfeenotice.batchno)
printHtmlPart(11)
invokeTag('message','g',144,['code':("fee.studentId.label"),'default':("Student Name")],-1)
printHtmlPart(12)
invokeTag('message','g',147,['code':(message(code: 'fee.due.label', default: 'Due'))],-1)
printHtmlPart(12)
invokeTag('message','g',150,['code':(message(code: 'fee.totalFee.label', default: 'Total Fee'))],-1)
printHtmlPart(12)
invokeTag('message','g',153,['code':(message(code: 'fee.totalPaid.label', default: 'Total Paid'))],-1)
printHtmlPart(13)
loop:{
int i = 0
for( feeInstance in (stfeenotice.academicyear) ) {
printHtmlPart(14)
if(true && (feeInstance !=null)) {
printHtmlPart(15)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(16)
expressionOut.print(fieldValue(bean: stfeenotice, field: "studentName"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: feeInstance?.feeId, field: "due"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: feeInstance?.feeId, field: "totalFee"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: feeInstance?.feeId, field: "totalPaid"))
printHtmlPart(18)
expressionOut.print(feeInstance?.academicyear)
printHtmlPart(18)
expressionOut.print(feeInstance?.presentclass?.classname)
printHtmlPart(18)
expressionOut.print(feeInstance?.section?.sectionName)
printHtmlPart(19)
}
printHtmlPart(20)
i++
}
}
printHtmlPart(21)
invokeTag('render','g',214,['template':("/footer/footer")],-1)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',256,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926001620L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
