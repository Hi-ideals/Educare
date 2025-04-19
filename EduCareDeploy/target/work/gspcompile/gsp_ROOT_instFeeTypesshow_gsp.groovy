import com.hiideals.instituite.feemanagment.InstFeeTypes
import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_instFeeTypesshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/instFeeTypes/show.gsp" }
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
invokeTag('captureHead','sitemesh',48,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',57,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',61,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',72,['template':("/header/leftSide"),'model':([activ:[staff:'start active open',staffList:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
invokeTag('message','g',88,['code':("default.home.label")],-1)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',89,['action':("index")],2)
printHtmlPart(12)
createClosureForHtmlPart(13, 2)
invokeTag('link','g',91,['action':("create")],2)
printHtmlPart(14)
if(true && (flash.message)) {
printHtmlPart(15)
expressionOut.print(flash.message)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (instFeeTypesInstance?.description)) {
printHtmlPart(18)
invokeTag('message','g',108,['code':("instFeeTypes.description.label"),'default':("Description")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',112,['bean':(instFeeTypesInstance),'field':("description")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (instFeeTypesInstance?.instituite)) {
printHtmlPart(22)
invokeTag('message','g',118,['code':("instFeeTypes.instituite.label"),'default':("Instituite")],-1)
printHtmlPart(23)
createTagBody(3, {->
printHtmlPart(24)
expressionOut.print(instFeeTypesInstance?.instituite?.name)
printHtmlPart(25)
})
invokeTag('link','g',124,['controller':("instituite"),'action':("show"),'id':(instFeeTypesInstance?.instituite?.id)],3)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (instFeeTypesInstance?.totalAmount)) {
printHtmlPart(26)
invokeTag('message','g',130,['code':("instFeeTypes.totalAmount.label"),'default':("Total Amount")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',134,['bean':(instFeeTypesInstance),'field':("totalAmount")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (instFeeTypesInstance?.typeName)) {
printHtmlPart(28)
invokeTag('message','g',140,['code':("instFeeTypes.typeName.label"),'default':("Type Name")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',142,['bean':(instFeeTypesInstance),'field':("typeName")],-1)
printHtmlPart(20)
}
printHtmlPart(30)
createTagBody(2, {->
printHtmlPart(31)
createTagBody(3, {->
printHtmlPart(32)
invokeTag('message','g',153,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(33)
})
invokeTag('link','g',154,['class':("edit"),'action':("edit"),'id':(LookUpED.encod(instFeeTypesInstance.id))],3)
printHtmlPart(34)
invokeTag('actionSubmit','g',158,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(35)
})
invokeTag('form','g',161,['url':([resource:instFeeTypesInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(36)
invokeTag('render','g',168,['template':("/footer/footer")],-1)
printHtmlPart(37)
})
invokeTag('captureBody','sitemesh',206,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(38)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926008053L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
