import com.hiideals.instituite.admin.Admin
import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_adminmodulesList_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admin/modulesList.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
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
invokeTag('render','g',51,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',54,['template':("/header/topBar")],-1)
printHtmlPart(7)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('link','g',71,['action':("create")],2)
printHtmlPart(10)
if(true && (flash.msg1)) {
printHtmlPart(11)
expressionOut.print(flash.msg1)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (flash.msg2)) {
printHtmlPart(14)
expressionOut.print(flash.msg2)
printHtmlPart(12)
}
printHtmlPart(15)
if(true && (flash.message)) {
printHtmlPart(16)
expressionOut.print(flash.message)
printHtmlPart(17)
}
printHtmlPart(18)
loop:{
int i = 0
for( module in (modules) ) {
printHtmlPart(19)
createTagBody(3, {->
printHtmlPart(20)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(21)
expressionOut.print(fieldValue(bean: module, field: "moduleName"))
printHtmlPart(22)
expressionOut.print(fieldValue(bean: module, field: "modulePrice"))
printHtmlPart(23)
expressionOut.print(module.id)
printHtmlPart(24)
invokeTag('submitButton','g',129,['class':("btn btn-link"),'name':("Update")],-1)
printHtmlPart(25)
})
invokeTag('form','g',130,['controller':("admin"),'action':("editmodules")],3)
printHtmlPart(26)
i++
}
}
printHtmlPart(27)
invokeTag('paginate','g',136,['total':(adminInstanceCount ?: 0)],-1)
printHtmlPart(28)
invokeTag('render','g',142,['template':("/footer/footer")],-1)
printHtmlPart(29)
})
invokeTag('captureBody','sitemesh',175,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(30)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925996286L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
