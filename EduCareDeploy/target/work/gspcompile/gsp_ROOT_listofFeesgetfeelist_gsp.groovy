import com.hiideals.instituite.student.Student
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_listofFeesgetfeelist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/listofFees/getfeelist.gsp" }
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
invokeTag('getImage','images',110,['id':(institute?.logo?.id),'width':("110px")],-1)
printHtmlPart(8)
expressionOut.print(institute?.name)
printHtmlPart(9)
expressionOut.print(institute?.affiliatedTo)
printHtmlPart(10)
expressionOut.print(institute?.hsno)
printHtmlPart(11)
expressionOut.print(institute?.street)
printHtmlPart(11)
expressionOut.print(institute?.city)
printHtmlPart(12)
expressionOut.print(institute?.pinCode)
printHtmlPart(13)
expressionOut.print(institute?.state)
printHtmlPart(11)
expressionOut.print(institute?.country)
printHtmlPart(14)
expressionOut.print(institute?.phone)
printHtmlPart(15)
invokeTag('message','g',144,['code':("fee.studentId.label"),'default':("Student Name")],-1)
printHtmlPart(16)
invokeTag('message','g',148,['code':(message(code: 'fee.totalFee.label', default: 'Total Fee'))],-1)
printHtmlPart(17)
invokeTag('message','g',151,['code':(message(code: 'fee.totalPaid.label', default: 'Total Paid'))],-1)
printHtmlPart(18)
invokeTag('message','g',153,['code':(message(code: 'fee.due.label', default: 'Due'))],-1)
printHtmlPart(19)
expressionOut.print(message(code: 'fee.lastUpdated.label', default: 'Updated Date'))
printHtmlPart(20)
loop:{
int i = 0
for( feeInstance in (feeInstanceList) ) {
printHtmlPart(21)
if(true && (feeInstance !=null)) {
printHtmlPart(22)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(23)
expressionOut.print(fieldValue(bean: feeInstance?.studentId, field: "studentName"))
printHtmlPart(24)
expressionOut.print(feeInstance?.academic?.presentclass?.classname)
printHtmlPart(25)
expressionOut.print(fieldValue(bean: feeInstance, field: "totalFee"))
printHtmlPart(26)
expressionOut.print(fieldValue(bean: feeInstance, field: "totalPaid"))
printHtmlPart(27)
expressionOut.print(fieldValue(bean: feeInstance, field: "due"))
printHtmlPart(28)
invokeTag('formatDate','g',192,['format':("dd-MMM-yyyy"),'date':(feeInstance.dateCreated)],-1)
printHtmlPart(29)
invokeTag('formatDate','g',194,['format':("dd-MMM-yyyy"),'date':(feeInstance.lastUpdated)],-1)
printHtmlPart(30)
expressionOut.print(feeInstance?.academic?.academicyear)
printHtmlPart(31)
}
printHtmlPart(32)
i++
}
}
printHtmlPart(33)
expressionOut.print(Totalsum)
printHtmlPart(34)
expressionOut.print(Paidsum)
printHtmlPart(35)
expressionOut.print(duesum)
printHtmlPart(36)
expressionOut.print(sec.username())
printHtmlPart(37)
invokeTag('render','g',261,['template':("/footer/footer")],-1)
printHtmlPart(38)
})
invokeTag('captureBody','sitemesh',306,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(39)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1705991939472L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
