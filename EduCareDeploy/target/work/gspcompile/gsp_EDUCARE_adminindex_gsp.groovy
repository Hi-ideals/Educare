import com.hiideals.instituite.admin.Admin
import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_adminindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admin/index.gsp" }
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
invokeTag('captureHead','sitemesh',139,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',146,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',149,['template':("/header/topBar")],-1)
printHtmlPart(7)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('link','g',167,['action':("create")],2)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',171,['controller':("admin"),'action':("modulesList")],2)
printHtmlPart(12)
createTagBody(2, {->
printHtmlPart(13)
invokeTag('submitButton','g',227,['name':("Save Module"),'class':("btn blue btn-block uppercase")],-1)
printHtmlPart(14)
})
invokeTag('form','g',230,['controller':("admin"),'action':("addModules")],2)
printHtmlPart(15)
if(true && (flash.msg1)) {
printHtmlPart(16)
expressionOut.print(flash.msg1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (flash.msg2)) {
printHtmlPart(19)
expressionOut.print(flash.msg2)
printHtmlPart(17)
}
printHtmlPart(20)
if(true && (flash.message)) {
printHtmlPart(21)
expressionOut.print(flash.message)
printHtmlPart(22)
}
printHtmlPart(23)
loop:{
int i = 0
for( adminInstance in (adminInstanceList) ) {
printHtmlPart(24)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(25)
invokeTag('getImage','images',293,['id':(adminInstance?.profilePic?.id),'height':("50px"),'width':("50px"),'classs':("img-rounded")],-1)
printHtmlPart(26)
expressionOut.print(fieldValue(bean: adminInstance, field: "adminID"))
printHtmlPart(27)
expressionOut.print(fieldValue(bean: adminInstance, field: "adminName"))
printHtmlPart(28)
expressionOut.print(fieldValue(bean: adminInstance, field: "password"))
printHtmlPart(29)
expressionOut.print(fieldValue(bean: adminInstance.address, field: "hsno"))
printHtmlPart(30)
expressionOut.print(fieldValue(bean: adminInstance.address, field: "street"))
printHtmlPart(30)
expressionOut.print(fieldValue(bean: adminInstance.address, field: "city"))
printHtmlPart(30)
expressionOut.print(fieldValue(bean: adminInstance.address, field: "state"))
printHtmlPart(30)
expressionOut.print(fieldValue(bean: adminInstance.address, field: "country"))
printHtmlPart(30)
expressionOut.print(fieldValue(bean: adminInstance.address, field: "mobileNumber"))
printHtmlPart(31)
createClosureForHtmlPart(32, 3)
invokeTag('link','g',318,['action':("show"),'id':(LookUpED.encod(adminInstance.id))],3)
printHtmlPart(33)
i++
}
}
printHtmlPart(34)
invokeTag('paginate','g',325,['total':(adminInstanceCount ?: 0)],-1)
printHtmlPart(35)
invokeTag('render','g',333,['template':("/footer/footer")],-1)
printHtmlPart(36)
})
invokeTag('captureBody','sitemesh',389,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(37)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925996328L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
