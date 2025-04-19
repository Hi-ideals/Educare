import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.institute.payroll.PayHead
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_bulkSMSindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bulkSMS/index.gsp" }
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
invokeTag('captureHead','sitemesh',53,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',62,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',66,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',77,['template':("/header/leftSide"),'model':([activ:[BulkSMS:'start active open',BulkSMS:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
invokeTag('message','g',93,['code':("default.home.label")],-1)
printHtmlPart(10)
if(true && (flash.msg1)) {
printHtmlPart(11)
expressionOut.print(flash.msg1)
printHtmlPart(12)
}
printHtmlPart(13)
createTagBody(2, {->
printHtmlPart(14)
expressionOut.print(remoteFunction(controller:'bulkSMS',action: 'getphonelist',
                                  update:'phn', params: '\'role1=\' + this.value'))
printHtmlPart(15)
expressionOut.print(remoteFunction(controller:'bulkSMS',action: 'getphonelist1',
                                                                   update:'phn', params: '\'iclass=\' + this.value'))
printHtmlPart(16)
for( clslist in (classList) ) {
printHtmlPart(17)
expressionOut.print(clslist?.id)
printHtmlPart(18)
expressionOut.print(clslist?.classname)
printHtmlPart(19)
}
printHtmlPart(20)
invokeTag('render','g',162,['template':("/bulkSMS/phoneList")],-1)
printHtmlPart(21)
invokeTag('submitButton','g',178,['name':("Send SMS"),'class':("btn blue")],-1)
printHtmlPart(22)
})
invokeTag('form','g',180,['controller':("bulkSMS"),'action':("sendSMS"),'class':("sky-form")],2)
printHtmlPart(23)
createTagBody(2, {->
printHtmlPart(24)
invokeTag('submitButton','g',219,['name':("Send SMS"),'class':("btn blue")],-1)
printHtmlPart(22)
})
invokeTag('form','g',221,['controller':("bulkSMS"),'action':("sendSMS1"),'class':("sky-form")],2)
printHtmlPart(25)
invokeTag('render','g',229,['template':("/footer/footer")],-1)
printHtmlPart(26)
})
invokeTag('captureBody','sitemesh',283,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(27)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925999068L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
