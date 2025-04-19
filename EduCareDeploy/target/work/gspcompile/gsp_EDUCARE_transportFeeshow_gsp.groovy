import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.institute.staff.Staff
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_transportFeeshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/transportFee/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',16,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',16,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',18,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',19,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',20,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',50,[:],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
invokeTag('render','g',59,['template':("/header/logo")],-1)
printHtmlPart(7)
invokeTag('render','g',63,['template':("/header/topBar")],-1)
printHtmlPart(8)
invokeTag('render','g',74,['template':("/header/leftSide"),'model':([activ:[TransportManagement:'start active open',TransportFee:'active']])],-1)
printHtmlPart(9)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(10)
invokeTag('message','g',91,['code':("default.home.label")],-1)
printHtmlPart(11)
createClosureForHtmlPart(12, 2)
invokeTag('link','g',93,['class':("list"),'action':("index")],2)
printHtmlPart(13)
createClosureForHtmlPart(14, 2)
invokeTag('link','g',95,['class':("create"),'action':("create")],2)
printHtmlPart(15)
if(true && (transportFeeInstance?.transport)) {
printHtmlPart(16)
invokeTag('message','g',108,['code':("transportFee.transport.label"),'default':("Transport")],-1)
printHtmlPart(17)
expressionOut.print(transportFeeInstance?.transport?.encodeAsHTML())
printHtmlPart(18)
}
printHtmlPart(19)
if(true && (transportFeeInstance?.paymentId)) {
printHtmlPart(20)
invokeTag('message','g',119,['code':("transportFee.paymentId.label"),'default':("Payment Id")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',126,['bean':(transportFeeInstance),'field':("paymentId")],-1)
printHtmlPart(22)
}
printHtmlPart(23)
if(true && (transportFeeInstance?.paymentDate)) {
printHtmlPart(24)
invokeTag('message','g',131,['code':("transportFee.paymentDate.label"),'default':("Payment Date")],-1)
printHtmlPart(25)
invokeTag('formatDate','g',137,['date':(transportFeeInstance?.paymentDate)],-1)
printHtmlPart(26)
}
printHtmlPart(23)
if(true && (transportFeeInstance?.paidAmount)) {
printHtmlPart(27)
invokeTag('message','g',144,['code':("transportFee.paidAmount.label"),'default':("Paid Amount")],-1)
printHtmlPart(28)
invokeTag('fieldValue','g',149,['bean':(transportFeeInstance),'field':("paidAmount")],-1)
printHtmlPart(22)
}
printHtmlPart(23)
if(true && (transportFeeInstance?.remainingAmount)) {
printHtmlPart(29)
invokeTag('message','g',156,['code':("transportFee.remainingAmount.label"),'default':("Remaining Amount")],-1)
printHtmlPart(30)
invokeTag('fieldValue','g',161,['bean':(transportFeeInstance),'field':("remainingAmount")],-1)
printHtmlPart(31)
}
printHtmlPart(23)
if(true && (transportFeeInstance?.fine)) {
printHtmlPart(32)
invokeTag('message','g',168,['code':("transportFee.fine.label"),'default':("Fine")],-1)
printHtmlPart(33)
invokeTag('fieldValue','g',171,['bean':(transportFeeInstance),'field':("fine")],-1)
printHtmlPart(22)
}
printHtmlPart(23)
if(true && (transportFeeInstance?.institute)) {
printHtmlPart(34)
invokeTag('message','g',177,['code':("transportFee.institute.label"),'default':("Institute")],-1)
printHtmlPart(35)
createTagBody(3, {->
printHtmlPart(36)
expressionOut.print(transportFeeInstance?.institute?.encodeAsHTML())
printHtmlPart(37)
})
invokeTag('link','g',186,['controller':("instituite"),'action':("show"),'id':(transportFeeInstance?.institute?.id)],3)
printHtmlPart(26)
}
printHtmlPart(23)
if(true && (transportFeeInstance?.student)) {
printHtmlPart(38)
invokeTag('message','g',191,['code':("transportFee.student.label"),'default':("Student")],-1)
printHtmlPart(39)
createTagBody(3, {->
printHtmlPart(36)
expressionOut.print(transportFeeInstance?.student?.encodeAsHTML())
printHtmlPart(37)
})
invokeTag('link','g',199,['controller':("student"),'action':("show"),'id':(transportFeeInstance?.student?.id)],3)
printHtmlPart(22)
}
printHtmlPart(23)
if(true && (transportFeeInstance?.employee)) {
printHtmlPart(40)
invokeTag('message','g',203,['code':("transportFee.employee.label"),'default':("Employee")],-1)
printHtmlPart(41)
createTagBody(3, {->
printHtmlPart(36)
expressionOut.print(transportFeeInstance?.employee?.encodeAsHTML())
printHtmlPart(37)
})
invokeTag('link','g',214,['controller':("staff"),'action':("show"),'id':(transportFeeInstance?.employee?.id)],3)
printHtmlPart(22)
}
printHtmlPart(42)
createTagBody(2, {->
printHtmlPart(43)
createTagBody(3, {->
printHtmlPart(36)
invokeTag('message','g',223,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(37)
})
invokeTag('link','g',223,['class':("edit"),'action':("edit"),'id':(LookUpED.encod(transportFeeInstance.id))],3)
printHtmlPart(44)
invokeTag('actionSubmit','g',239,['class':("delete btn blue"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(45)
})
invokeTag('form','g',241,['url':([resource:transportFeeInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(46)
invokeTag('render','g',245,['template':("/footer/footer")],-1)
printHtmlPart(47)
})
invokeTag('captureBody','sitemesh',268,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(48)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926005825L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
