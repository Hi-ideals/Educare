import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.institute.payroll.SalarySetting
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_salarySettingshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/salarySetting/show.gsp" }
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
invokeTag('render','g',69,['template':("/header/leftSide"),'model':([activ:[staff:'start active open',salarysettingList:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
invokeTag('message','g',81,['code':("default.home.label")],-1)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',83,['class':("list"),'action':("index")],2)
printHtmlPart(12)
createClosureForHtmlPart(13, 2)
invokeTag('link','g',85,['class':("create"),'action':("create")],2)
printHtmlPart(14)
if(true && (flash.message)) {
printHtmlPart(15)
expressionOut.print(flash.message)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (salarySettingInstance?.type)) {
printHtmlPart(18)
invokeTag('message','g',107,['code':("salarySetting.type.label"),'default':("Type")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',111,['bean':(salarySettingInstance),'field':("type")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (salarySettingInstance?.payhead)) {
printHtmlPart(22)
invokeTag('message','g',118,['code':("salarySetting.payhead.label"),'default':("Payhead")],-1)
printHtmlPart(23)
createTagBody(3, {->
printHtmlPart(24)
expressionOut.print(salarySettingInstance?.payhead?.payHeadName)
printHtmlPart(25)
})
invokeTag('link','g',126,['controller':("payHead"),'action':("show"),'id':(salarySettingInstance?.payhead?.id)],3)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (salarySettingInstance?.staff)) {
printHtmlPart(26)
invokeTag('message','g',133,['code':("salarySetting.staff.label"),'default':("Staff")],-1)
printHtmlPart(27)
createTagBody(3, {->
printHtmlPart(24)
expressionOut.print(salarySettingInstance?.staff?.staffName)
printHtmlPart(25)
})
invokeTag('link','g',140,['controller':("staff"),'action':("show"),'id':(salarySettingInstance?.staff?.id)],3)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (salarySettingInstance?.aunit)) {
printHtmlPart(28)
invokeTag('message','g',147,['code':("salarySetting.unit.label"),'default':("Unit")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',151,['bean':(salarySettingInstance),'field':("aunit")],-1)
printHtmlPart(30)
}
printHtmlPart(31)
createTagBody(2, {->
printHtmlPart(32)
createTagBody(3, {->
printHtmlPart(24)
invokeTag('message','g',165,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(25)
})
invokeTag('link','g',166,['class':("edit"),'action':("edit"),'id':(LookUpED.encod(salarySettingInstance.id))],3)
printHtmlPart(33)
invokeTag('actionSubmit','g',170,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(34)
})
invokeTag('form','g',172,['url':([resource:salarySettingInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(35)
invokeTag('render','g',185,['template':("/footer/footer")],-1)
printHtmlPart(36)
})
invokeTag('captureBody','sitemesh',208,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(37)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926010717L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
