import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.institute.payroll.PayHead
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_payHeadshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/payHead/show.gsp" }
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
invokeTag('render','g',52,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',56,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',67,['template':("/header/leftSide"),'model':([activ:[payroll:'start active open',payheadList:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
invokeTag('message','g',83,['code':("default.home.label")],-1)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',85,['class':("list"),'action':("index")],2)
printHtmlPart(12)
createClosureForHtmlPart(13, 2)
invokeTag('link','g',87,['class':("create"),'action':("create")],2)
printHtmlPart(14)
if(true && (flash.message)) {
printHtmlPart(15)
expressionOut.print(flash.message)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (payHeadInstance?.description)) {
printHtmlPart(18)
invokeTag('message','g',109,['code':("payHead.description.label"),'default':("Description")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',114,['bean':(payHeadInstance),'field':("description")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (payHeadInstance?.payHeadType)) {
printHtmlPart(22)
invokeTag('message','g',122,['code':("payHead.payHeadType.label"),'default':("Pay Head Type")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',127,['bean':(payHeadInstance),'field':("payHeadType")],-1)
printHtmlPart(24)
}
printHtmlPart(21)
if(true && (payHeadInstance?.payHeadName)) {
printHtmlPart(25)
invokeTag('message','g',136,['code':("payHead.payHeadName.label"),'default':("Pay Head Name")],-1)
printHtmlPart(26)
invokeTag('fieldValue','g',141,['bean':(payHeadInstance),'field':("payHeadName")],-1)
printHtmlPart(24)
}
printHtmlPart(27)
createTagBody(2, {->
printHtmlPart(28)
createTagBody(3, {->
printHtmlPart(29)
invokeTag('message','g',155,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(30)
})
invokeTag('link','g',156,['class':("btn yellow"),'action':("edit"),'id':(LookUpED.encod(payHeadInstance.id))],3)
printHtmlPart(31)
invokeTag('actionSubmit','g',160,['class':("btn red"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(32)
})
invokeTag('form','g',162,['url':([resource:payHeadInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(33)
invokeTag('render','g',175,['template':("/footer/footer")],-1)
printHtmlPart(34)
})
invokeTag('captureBody','sitemesh',213,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(35)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925998557L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
