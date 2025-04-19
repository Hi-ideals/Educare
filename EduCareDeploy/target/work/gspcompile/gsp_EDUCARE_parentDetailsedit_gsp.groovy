import com.hiideals.instituite.student.ParentDetails
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_parentDetailsedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/parentDetails/edit.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',13,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',13,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',52,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',61,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',65,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',75,['template':("/header/leftSide")],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',90,['action':("index")],2)
printHtmlPart(11)
createClosureForHtmlPart(12, 2)
invokeTag('link','g',92,['action':("create")],2)
printHtmlPart(13)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(14)
invokeTag('message','g',109,['code':("default.home.label")],-1)
printHtmlPart(15)
createTagBody(2, {->
invokeTag('message','g',110,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',110,['class':("list"),'action':("index")],2)
printHtmlPart(16)
createTagBody(2, {->
invokeTag('message','g',111,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',111,['class':("create"),'action':("create")],2)
printHtmlPart(17)
invokeTag('message','g',115,['code':("default.edit.label"),'args':([entityName])],-1)
printHtmlPart(18)
if(true && (flash.message)) {
printHtmlPart(19)
expressionOut.print(flash.message)
printHtmlPart(20)
}
printHtmlPart(21)
createTagBody(2, {->
printHtmlPart(22)
createTagBody(3, {->
printHtmlPart(23)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(24)
expressionOut.print(error.field)
printHtmlPart(25)
}
printHtmlPart(26)
invokeTag('message','g',122,['error':(error)],-1)
printHtmlPart(27)
})
invokeTag('eachError','g',123,['bean':(parentDetailsInstance),'var':("error")],3)
printHtmlPart(28)
})
invokeTag('hasErrors','g',125,['bean':(parentDetailsInstance)],2)
printHtmlPart(21)
createTagBody(2, {->
printHtmlPart(29)
invokeTag('hiddenField','g',127,['name':("version"),'value':(parentDetailsInstance?.version)],-1)
printHtmlPart(30)
invokeTag('render','g',129,['template':("form")],-1)
printHtmlPart(31)
invokeTag('actionSubmit','g',132,['class':("save"),'action':("update"),'value':(message(code: 'default.button.update.label', default: 'Update'))],-1)
printHtmlPart(32)
})
invokeTag('form','g',134,['url':([resource:parentDetailsInstance, action:'update']),'method':("PUT")],2)
printHtmlPart(33)
invokeTag('render','g',142,['template':("/footer/footer")],-1)
printHtmlPart(34)
})
invokeTag('captureBody','sitemesh',180,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(35)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926001160L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
