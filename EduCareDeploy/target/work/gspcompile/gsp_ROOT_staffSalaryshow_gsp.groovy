import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.institute.payroll.SalarySetting
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_staffSalaryshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/staffSalary/show.gsp" }
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
createClosureForHtmlPart(2, 3)
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
invokeTag('captureHead','sitemesh',45,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',54,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',58,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',69,['template':("/header/leftSide"),'model':([activ:[payroll:'start active open',staffList:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
invokeTag('message','g',85,['code':("default.home.label")],-1)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',87,['class':("list"),'action':("index")],2)
printHtmlPart(12)
createClosureForHtmlPart(13, 2)
invokeTag('link','g',89,['class':("create"),'action':("create")],2)
printHtmlPart(14)
if(true && (flash.message)) {
printHtmlPart(15)
expressionOut.print(flash.message)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (staffSalaryInstance?.staff)) {
printHtmlPart(18)
invokeTag('message','g',109,['code':("staffSalary.staff.label"),'default':("Staff")],-1)
printHtmlPart(19)
createTagBody(3, {->
printHtmlPart(20)
expressionOut.print(staffSalaryInstance?.staff?.staffName)
printHtmlPart(21)
})
invokeTag('link','g',116,['controller':("staff"),'action':("show"),'id':(staffSalaryInstance?.staff?.id)],3)
printHtmlPart(22)
}
printHtmlPart(23)
if(true && (staffSalaryInstance?.academicyear)) {
printHtmlPart(24)
invokeTag('message','g',124,['code':("staffSalary.academicyear.label"),'default':("Academicyear")],-1)
printHtmlPart(25)
expressionOut.print(staffSalaryInstance?.academicyear)
printHtmlPart(26)
}
printHtmlPart(27)
if(true && (staffSalaryInstance?.month)) {
printHtmlPart(28)
invokeTag('message','g',136,['code':("staffSalary.month.label"),'default':("Month")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',140,['bean':(staffSalaryInstance),'field':("month")],-1)
printHtmlPart(22)
}
printHtmlPart(30)
if(true && (staffSalaryInstance?.totalPaid)) {
printHtmlPart(31)
invokeTag('message','g',149,['code':("staffSalary.totalPaid.label"),'default':("TotalPaid")],-1)
printHtmlPart(32)
expressionOut.print(staffSalaryInstance?.totalPaid)
printHtmlPart(26)
}
printHtmlPart(33)
createTagBody(2, {->
printHtmlPart(34)
createTagBody(3, {->
printHtmlPart(20)
invokeTag('message','g',167,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(21)
})
invokeTag('link','g',168,['class':("btn yellow"),'action':("edit"),'id':(LookUpED.encod(staffSalaryInstance.id))],3)
printHtmlPart(35)
invokeTag('actionSubmit','g',172,['class':("btn red"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(36)
})
invokeTag('form','g',174,['url':([resource:staffSalaryInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(37)
invokeTag('render','g',187,['template':("/footer/footer")],-1)
printHtmlPart(38)
})
invokeTag('captureBody','sitemesh',214,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(39)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926006214L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
