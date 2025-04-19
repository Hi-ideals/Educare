import com.hiideals.instituite.feemanagment.Fee
import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_paySlipindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/paySlip/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',15,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',15,[:],2)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',18,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',19,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',69,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',78,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',82,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',93,['template':("/header/leftSide"),'model':([activ:[payroll:'start active open',paySlip:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
for( staffName in (staffs) ) {
printHtmlPart(11)
expressionOut.print(staffName?.id)
printHtmlPart(12)
expressionOut.print(staffName?.staffName)
printHtmlPart(13)
}
printHtmlPart(14)
invokeTag('select','g',169,['name':("month"),'id':("month"),'class':("form-control"),'from':(com.hiideals.institute.payroll.StaffSalary.constraints.month.inList),'required':(""),'value':(staffSalaryInstance?.month),'valueMessagePrefix':("staffSalary.month")],-1)
printHtmlPart(15)
for( batch in (batchList) ) {
printHtmlPart(11)
expressionOut.print(batch.batchName)
printHtmlPart(12)
expressionOut.print(batch.batchName)
printHtmlPart(13)
}
printHtmlPart(16)
invokeTag('submitButton','g',190,['name':("Search"),'class':("btn blue"),'id':("staffSalary"),'style':("margin-top: 22px")],-1)
printHtmlPart(17)
})
invokeTag('formRemote','g',191,['name':("payslip"),'url':([action:'generatepayslip']),'update':("update1")],2)
printHtmlPart(18)
invokeTag('render','g',199,['template':("/footer/footer")],-1)
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',350,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925999140L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
