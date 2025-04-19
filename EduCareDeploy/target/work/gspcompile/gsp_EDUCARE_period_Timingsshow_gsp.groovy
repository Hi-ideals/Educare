import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.institute.payroll.PayHead
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_period_Timingsshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/period_Timings/show.gsp" }
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
invokeTag('captureHead','sitemesh',43,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',49,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',52,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',61,['template':("/header/leftSide"),'model':([activ:[tt:'start active open',ptCreate:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
invokeTag('message','g',73,['code':("default.home.label")],-1)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',75,['class':("list"),'action':("index")],2)
printHtmlPart(12)
createClosureForHtmlPart(13, 2)
invokeTag('link','g',77,['class':("create"),'action':("create")],2)
printHtmlPart(14)
if(true && (period_TimingsInstance?.from_time)) {
printHtmlPart(15)
invokeTag('message','g',96,['code':("period_Timings.from_time.label"),'default':("Fromtime")],-1)
printHtmlPart(16)
invokeTag('fieldValue','g',100,['bean':(period_TimingsInstance),'field':("from_time")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (period_TimingsInstance?.to_time)) {
printHtmlPart(19)
invokeTag('message','g',107,['code':("period_Timings.to_time.label"),'default':("Totime")],-1)
printHtmlPart(20)
invokeTag('fieldValue','g',112,['bean':(period_TimingsInstance),'field':("to_time")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (period_TimingsInstance?.from_H)) {
printHtmlPart(21)
invokeTag('message','g',119,['code':("period_Timings.from_H.label"),'default':("From H")],-1)
printHtmlPart(22)
invokeTag('fieldValue','g',124,['bean':(period_TimingsInstance),'field':("from_H")],-1)
printHtmlPart(17)
}
printHtmlPart(23)
if(true && (period_TimingsInstance?.from_M)) {
printHtmlPart(24)
invokeTag('message','g',132,['code':("period_Timings.from_M.label"),'default':("From M")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',137,['bean':(period_TimingsInstance),'field':("from_M")],-1)
printHtmlPart(17)
}
printHtmlPart(23)
if(true && (period_TimingsInstance?.periodName)) {
printHtmlPart(26)
invokeTag('message','g',147,['code':("period_Timings.periodName.label"),'default':("Period Name")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',151,['bean':(period_TimingsInstance),'field':("periodName")],-1)
printHtmlPart(28)
}
printHtmlPart(18)
if(true && (period_TimingsInstance?.to_H)) {
printHtmlPart(29)
invokeTag('message','g',158,['code':("period_Timings.to_H.label"),'default':("To H")],-1)
printHtmlPart(30)
invokeTag('fieldValue','g',162,['bean':(period_TimingsInstance),'field':("to_H")],-1)
printHtmlPart(17)
}
printHtmlPart(23)
if(true && (period_TimingsInstance?.to_M)) {
printHtmlPart(31)
invokeTag('message','g',170,['code':("period_Timings.to_M.label"),'default':("To M")],-1)
printHtmlPart(32)
invokeTag('fieldValue','g',174,['bean':(period_TimingsInstance),'field':("to_M")],-1)
printHtmlPart(17)
}
printHtmlPart(33)
createTagBody(2, {->
printHtmlPart(34)
createTagBody(3, {->
printHtmlPart(35)
invokeTag('message','g',188,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(36)
})
invokeTag('link','g',189,['class':("btn yellow"),'action':("edit"),'id':(LookUpED.encod(period_TimingsInstance?.id))],3)
printHtmlPart(37)
invokeTag('actionSubmit','g',193,['class':("btn red"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(38)
})
invokeTag('form','g',195,['url':([resource:period_TimingsInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(39)
invokeTag('render','g',208,['template':("/footer/footer")],-1)
printHtmlPart(40)
})
invokeTag('captureBody','sitemesh',235,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(41)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926016557L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
