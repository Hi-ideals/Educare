import com.hiideals.instituite.helper.Batch
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_batchshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/batch/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'batch.label', default: 'Batch'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (batchInstance?.description)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("batch.description.label"),'default':("Description")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(batchInstance),'field':("description")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (batchInstance?.batchName)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("batch.batchName.label"),'default':("Batch Name")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(batchInstance),'field':("batchName")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (batchInstance?.batchfrom)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("batch.batchfrom.label"),'default':("From")],-1)
printHtmlPart(21)
invokeTag('formatDate','g',48,['date':(batchInstance?.batchfrom)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (batchInstance?.institute)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("batch.institute.label"),'default':("Institute")],-1)
printHtmlPart(23)
createTagBody(3, {->
expressionOut.print(batchInstance?.institute?.encodeAsHTML())
})
invokeTag('link','g',57,['controller':("instituite"),'action':("show"),'id':(batchInstance?.institute?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (batchInstance?.batchto)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("batch.batchto.label"),'default':("To")],-1)
printHtmlPart(25)
invokeTag('formatDate','g',66,['date':(batchInstance?.batchto)],-1)
printHtmlPart(16)
}
printHtmlPart(26)
createTagBody(2, {->
printHtmlPart(27)
createTagBody(3, {->
invokeTag('message','g',74,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',74,['class':("edit"),'action':("edit"),'resource':(batchInstance)],3)
printHtmlPart(28)
invokeTag('actionSubmit','g',75,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(29)
})
invokeTag('form','g',77,['url':([resource:batchInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(30)
})
invokeTag('captureBody','sitemesh',79,[:],1)
printHtmlPart(31)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926017423L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
