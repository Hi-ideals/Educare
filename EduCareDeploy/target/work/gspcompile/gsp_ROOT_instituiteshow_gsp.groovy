import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_instituiteshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/instituite/show.gsp" }
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
invokeTag('captureHead','sitemesh',54,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',63,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',67,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',78,['template':("/header/leftSide"),'model':([activ:[Settings:'start active open',instituiteList:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
createClosureForHtmlPart(11, 3)
invokeTag('link','g',95,['action':("index")],3)
printHtmlPart(12)
createClosureForHtmlPart(13, 3)
invokeTag('link','g',98,['action':("create")],3)
printHtmlPart(14)
})
invokeTag('ifAnyGranted','sec',99,['roles':("ROLE_SUPERADMIN")],2)
printHtmlPart(15)
if(true && (flash.message)) {
printHtmlPart(16)
expressionOut.print(flash.message)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (instituiteInstance?.logo !=null)) {
printHtmlPart(19)
invokeTag('getImage','images',121,['id':(instituiteInstance?.logo?.id),'width':("80px")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (instituiteInstance?.signature !=null)) {
printHtmlPart(19)
invokeTag('getImage','images',128,['id':(instituiteInstance?.signature?.id),'width':("80px")],-1)
printHtmlPart(20)
}
printHtmlPart(22)
invokeTag('fieldValue','g',134,['bean':(instituiteInstance),'field':("institutionID")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',139,['bean':(instituiteInstance),'field':("institutionPrefixName")],-1)
printHtmlPart(24)
expressionOut.print(instituiteInstance?.name?.encodeAsHTML())
printHtmlPart(25)
invokeTag('fieldValue','g',150,['bean':(instituiteInstance),'field':("affiliatedTo")],-1)
printHtmlPart(26)
invokeTag('fieldValue','g',155,['bean':(instituiteInstance),'field':("caption")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',160,['bean':(instituiteInstance),'field':("description")],-1)
printHtmlPart(28)
invokeTag('fieldValue','g',165,['bean':(instituiteInstance),'field':("institutionFax")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',170,['bean':(instituiteInstance),'field':("phone")],-1)
printHtmlPart(30)
invokeTag('fieldValue','g',175,['bean':(instituiteInstance),'field':("hsno")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',176,['bean':(instituiteInstance),'field':("street")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',177,['bean':(instituiteInstance),'field':("city")],-1)
printHtmlPart(32)
invokeTag('fieldValue','g',178,['bean':(instituiteInstance),'field':("pinCode")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',179,['bean':(instituiteInstance),'field':("state")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',180,['bean':(instituiteInstance),'field':("country")],-1)
printHtmlPart(33)
invokeTag('fieldValue','g',185,['bean':(instituiteInstance),'field':("alternatephno")],-1)
printHtmlPart(34)
createTagBody(2, {->
printHtmlPart(35)
createTagBody(3, {->
printHtmlPart(36)
invokeTag('message','g',196,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(37)
})
invokeTag('link','g',197,['class':("btn blue"),'action':("edit"),'id':(LookUpED.encod(instituiteInstance.id))],3)
printHtmlPart(38)
invokeTag('actionSubmit','g',201,['class':("btn red"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(39)
})
invokeTag('form','g',205,['url':([resource:instituiteInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(40)
invokeTag('render','g',218,['template':("/footer/footer")],-1)
printHtmlPart(41)
})
invokeTag('captureBody','sitemesh',256,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(42)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925998334L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
