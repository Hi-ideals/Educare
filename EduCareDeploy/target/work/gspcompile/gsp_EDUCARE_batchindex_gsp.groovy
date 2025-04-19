import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.instituite.helper.Batch
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_batchindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/batch/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',12,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',12,[:],2)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',43,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('render','g',48,['template':("/header/logo")],-1)
printHtmlPart(5)
invokeTag('render','g',51,['template':("/header/topBar")],-1)
printHtmlPart(6)
invokeTag('render','g',59,['template':("/header/leftSide"),'model':([activ:[batch:'start active open',batchList:'active']])],-1)
printHtmlPart(7)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('link','g',71,['action':("create")],2)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
expressionOut.print(message(code: 'batch.batchName.label', default: 'Academic Year'))
printHtmlPart(14)
expressionOut.print(message(code: 'batch.description.label', default: 'Description'))
printHtmlPart(15)
expressionOut.print(message(code: 'batch.batchfrom.label', default: 'From'))
printHtmlPart(14)
expressionOut.print(message(code: 'batch.batchto.label', default: 'To'))
printHtmlPart(16)
loop:{
int i = 0
for( batchInstance in (batchInstanceList) ) {
printHtmlPart(17)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(18)
expressionOut.print(fieldValue(bean: batchInstance, field: "batchName"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: batchInstance, field: "description"))
printHtmlPart(20)
invokeTag('formatDate','g',137,['date':(batchInstance.batchfrom),'format':("dd-MMM-yyyy")],-1)
printHtmlPart(21)
invokeTag('formatDate','g',141,['date':(batchInstance.batchto),'format':("dd-MMM-yyyy")],-1)
printHtmlPart(22)
createTagBody(3, {->
printHtmlPart(23)
createTagBody(4, {->
printHtmlPart(24)
invokeTag('message','g',151,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(25)
})
invokeTag('link','g',152,['action':("edit"),'id':(LookUpED.encod(batchInstance.id))],4)
printHtmlPart(26)
})
invokeTag('form','g',154,['url':([resource:batchInstance, action:'delete']),'method':("DELETE")],3)
printHtmlPart(27)
i++
}
}
printHtmlPart(28)
invokeTag('paginate','g',158,['total':(batchInstanceCount ?: 0)],-1)
printHtmlPart(29)
invokeTag('render','g',165,['template':("/footer/footer")],-1)
printHtmlPart(30)
})
invokeTag('captureBody','sitemesh',207,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(31)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926018348L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
