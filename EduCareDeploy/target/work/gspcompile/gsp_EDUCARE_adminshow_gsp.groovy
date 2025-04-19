import com.hiideals.instituite.admin.Admin
import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_adminshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admin/show.gsp" }
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
invokeTag('captureHead','sitemesh',46,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('render','g',51,['template':("/header/logo")],-1)
printHtmlPart(5)
invokeTag('render','g',54,['template':("/header/topBar")],-1)
printHtmlPart(6)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(7)
createClosureForHtmlPart(8, 2)
invokeTag('link','g',72,['action':("index")],2)
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',74,['action':("create")],2)
printHtmlPart(11)
if(true && (flash.message)) {
printHtmlPart(12)
expressionOut.print(flash.message)
printHtmlPart(13)
}
printHtmlPart(14)
invokeTag('getImage','images',100,['id':(adminInstance?.profilePic?.id),'height':("80px"),'width':("80px")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',107,['bean':(adminInstance),'field':("adminID")],-1)
printHtmlPart(16)
invokeTag('fieldValue','g',113,['bean':(adminInstance),'field':("adminName")],-1)
printHtmlPart(17)
invokeTag('fieldValue','g',119,['bean':(adminInstance),'field':("password")],-1)
printHtmlPart(18)
expressionOut.print(adminInstitute?.name)
printHtmlPart(19)
if(true && (adminInstance?.address)) {
printHtmlPart(20)
expressionOut.print(fieldValue(bean: adminInstance.address, field: "hsno"))
printHtmlPart(21)
expressionOut.print(fieldValue(bean: adminInstance.address, field: "street"))
printHtmlPart(21)
expressionOut.print(fieldValue(bean: adminInstance.address, field: "city"))
printHtmlPart(21)
expressionOut.print(fieldValue(bean: adminInstance.address, field: "state"))
printHtmlPart(21)
expressionOut.print(fieldValue(bean: adminInstance.address, field: "country"))
printHtmlPart(21)
expressionOut.print(fieldValue(bean: adminInstance.address, field: "mobileNumber"))
printHtmlPart(22)
}
printHtmlPart(23)
createTagBody(2, {->
printHtmlPart(24)
createTagBody(3, {->
printHtmlPart(25)
invokeTag('message','g',150,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(26)
})
invokeTag('link','g',150,['class':("btn green"),'action':("edit"),'id':(LookUpED.encod(adminInstance.id))],3)
printHtmlPart(27)
invokeTag('actionSubmit','g',156,['class':("btn btn-danger"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(28)
})
invokeTag('form','g',156,['url':([resource:adminInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(29)
invokeTag('render','g',170,['template':("/footer/footer")],-1)
printHtmlPart(30)
})
invokeTag('captureBody','sitemesh',197,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(31)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925996217L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
