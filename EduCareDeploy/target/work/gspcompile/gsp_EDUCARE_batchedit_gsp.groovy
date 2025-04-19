import com.hiideals.instituite.helper.Batch
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_batchedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/batch/edit.gsp" }
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
invokeTag('captureHead','sitemesh',49,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('render','g',54,['template':("/header/logo")],-1)
printHtmlPart(5)
invokeTag('render','g',57,['template':("/header/topBar")],-1)
printHtmlPart(6)
invokeTag('render','g',65,['template':("/header/leftSide"),'model':([activ:[Settings:'start active open',Batchcreate:'active']])],-1)
printHtmlPart(7)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('link','g',74,['action':("index")],2)
printHtmlPart(10)
createTagBody(2, {->
printHtmlPart(11)
invokeTag('hiddenField','g',96,['name':("version"),'value':(batchInstance?.version)],-1)
printHtmlPart(12)
invokeTag('render','g',98,['template':("form")],-1)
printHtmlPart(13)
invokeTag('actionSubmit','g',103,['class':("btn blue"),'action':("update"),'id':("Createbatch"),'value':(message(code: 'default.button.update.label', default: 'Update'))],-1)
printHtmlPart(14)
})
invokeTag('form','g',104,['url':([resource:batchInstance, action:'update']),'method':("PUT")],2)
printHtmlPart(15)
invokeTag('render','g',108,['template':("/footer/footer")],-1)
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',163,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926018075L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
