import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.instituite.admin.UserList
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_userListshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/userList/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',13,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',13,[:],2)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',47,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',54,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',57,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',66,['template':("/header/leftSide"),'model':([activ:[userlist:'start active open']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',81,['action':("index")],2)
printHtmlPart(11)
if(true && (flash.message)) {
printHtmlPart(12)
expressionOut.print(flash.message)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (userListInstance?.userName)) {
printHtmlPart(15)
invokeTag('fieldValue','g',104,['bean':(userListInstance),'field':("userName")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (userListInstance?.password)) {
printHtmlPart(18)
invokeTag('fieldValue','g',111,['bean':(userListInstance),'field':("password")],-1)
printHtmlPart(19)
}
printHtmlPart(17)
if(true && (userListInstance?.address)) {
printHtmlPart(20)
invokeTag('fieldValue','g',118,['bean':(userListInstance?.address),'field':("hsno")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',120,['bean':(userListInstance?.address),'field':("street")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',122,['bean':(userListInstance?.address),'field':("city")],-1)
printHtmlPart(22)
invokeTag('fieldValue','g',123,['bean':(userListInstance?.address),'field':("pinCode")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',125,['bean':(userListInstance?.address),'field':("state")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',127,['bean':(userListInstance?.address),'field':("country")],-1)
printHtmlPart(23)
}
printHtmlPart(17)
if(true && (userListInstance?.createdUser)) {
printHtmlPart(24)
expressionOut.print(userListInstance?.createdUser?.username)
printHtmlPart(25)
}
printHtmlPart(17)
if(true && (userListInstance?.secrole)) {
printHtmlPart(26)
expressionOut.print(userListInstance?.secrole?.roleName)
printHtmlPart(27)
}
printHtmlPart(17)
if(true && (userListInstance?.modules)) {
printHtmlPart(28)
for( m in (userListInstance.modules) ) {
printHtmlPart(29)
expressionOut.print(m?.moduleName)
printHtmlPart(30)
}
printHtmlPart(31)
}
printHtmlPart(17)
if(true && (userListInstance?.dateCreated)) {
printHtmlPart(32)
invokeTag('formatDate','g',164,['date':(userListInstance?.dateCreated),'format':("dd-MMM-yyyy")],-1)
printHtmlPart(16)
}
printHtmlPart(33)
createTagBody(2, {->
printHtmlPart(34)
createTagBody(3, {->
printHtmlPart(35)
invokeTag('message','g',179,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(36)
})
invokeTag('link','g',179,['class':("btn btn-warning"),'action':("edit"),'id':(LookUpED.encod(userListInstance?.id)),'resource':(userListInstance)],3)
printHtmlPart(37)
})
invokeTag('form','g',184,['url':([resource:userListInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(38)
invokeTag('render','g',189,['template':("/footer/footer")],-1)
printHtmlPart(39)
})
invokeTag('captureBody','sitemesh',226,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(40)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926005327L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
