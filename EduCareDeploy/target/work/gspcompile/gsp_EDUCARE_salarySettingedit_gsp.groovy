import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.institute.payroll.SalarySetting
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_salarySettingedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/salarySetting/edit.gsp" }
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
invokeTag('captureHead','sitemesh',56,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',65,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',69,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',80,['template':("/header/leftSide"),'model':([activ:[payroll:'start active open',salarysettingcreate:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',96,['action':("index")],2)
printHtmlPart(11)
if(true && (flash.message)) {
printHtmlPart(12)
expressionOut.print(flash.message)
printHtmlPart(13)
}
printHtmlPart(14)
createTagBody(2, {->
printHtmlPart(15)
createTagBody(3, {->
printHtmlPart(16)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(17)
expressionOut.print(error.field)
printHtmlPart(18)
}
printHtmlPart(19)
invokeTag('message','g',119,['error':(error)],-1)
printHtmlPart(20)
})
invokeTag('eachError','g',120,['bean':(subjectInstance),'var':("error")],3)
printHtmlPart(21)
})
invokeTag('hasErrors','g',122,['bean':(subjectInstance)],2)
printHtmlPart(22)
createTagBody(2, {->
printHtmlPart(23)
invokeTag('hiddenField','g',138,['name':("version"),'value':(salarySettingInstance?.version)],-1)
printHtmlPart(24)
invokeTag('render','g',140,['template':("form")],-1)
printHtmlPart(25)
invokeTag('actionSubmit','g',146,['class':("save btn blue"),'action':("update"),'id':("salarySetting"),'value':(message(code: 'default.button.update.label', default: 'Update'))],-1)
printHtmlPart(26)
})
invokeTag('form','g',148,['url':([resource:salarySettingInstance, action:'update']),'method':("PUT")],2)
printHtmlPart(27)
invokeTag('render','g',162,['template':("/footer/footer")],-1)
printHtmlPart(28)
})
invokeTag('captureBody','sitemesh',212,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(29)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926010739L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
