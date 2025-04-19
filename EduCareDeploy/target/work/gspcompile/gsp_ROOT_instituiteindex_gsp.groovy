import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_instituiteindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/instituite/index.gsp" }
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
createClosureForHtmlPart(10, 2)
invokeTag('link','g',96,['action':("create")],2)
printHtmlPart(11)
if(true && (flash.message)) {
printHtmlPart(12)
expressionOut.print(flash.message)
printHtmlPart(13)
}
printHtmlPart(14)
invokeTag('message','g',133,['code':("instituite.name.label"),'default':("Name")],-1)
printHtmlPart(15)
expressionOut.print(message(code: 'instituite.affiliatedTo.label', default: 'Affiliated To'))
printHtmlPart(16)
expressionOut.print(message(code: 'instituite.caption.label', default: 'Caption'))
printHtmlPart(16)
expressionOut.print(message(code: 'instituite.description.label', default: 'Description'))
printHtmlPart(16)
expressionOut.print(message(code: 'instituite.institutionFax.label', default: 'Institution Fax'))
printHtmlPart(16)
expressionOut.print(message(code: 'instituite.institutionID.label', default: 'Institution ID'))
printHtmlPart(17)
loop:{
int i = 0
for( instituiteInstance in (instituiteInstanceList) ) {
printHtmlPart(18)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(19)
expressionOut.print(fieldValue(bean: instituiteInstance, field: "name"))
printHtmlPart(20)
expressionOut.print(fieldValue(bean: instituiteInstance, field: "affiliatedTo"))
printHtmlPart(20)
expressionOut.print(fieldValue(bean: instituiteInstance, field: "caption"))
printHtmlPart(20)
expressionOut.print(fieldValue(bean: instituiteInstance, field: "description"))
printHtmlPart(20)
expressionOut.print(fieldValue(bean: instituiteInstance, field: "institutionFax"))
printHtmlPart(20)
expressionOut.print(fieldValue(bean: instituiteInstance, field: "institutionID"))
printHtmlPart(21)
createClosureForHtmlPart(22, 3)
invokeTag('link','g',187,['action':("show"),'id':(LookUpED.encod(instituiteInstance.id))],3)
printHtmlPart(23)
i++
}
}
printHtmlPart(24)
invokeTag('paginate','g',199,['total':(instituiteInstanceCount ?: 0)],-1)
printHtmlPart(25)
invokeTag('render','g',208,['template':("/footer/footer")],-1)
printHtmlPart(26)
})
invokeTag('captureBody','sitemesh',246,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(27)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925998353L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
