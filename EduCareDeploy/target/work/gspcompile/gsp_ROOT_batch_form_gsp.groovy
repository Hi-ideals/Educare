import com.hiideals.instituite.helper.Batch
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_batch_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/batch/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: batchInstance, field: 'batchName', 'error'))
printHtmlPart(1)
invokeTag('message','g',12,['code':("batch.batchName.label"),'default':("Academic Year")],-1)
printHtmlPart(2)
invokeTag('textField','g',16,['name':("batchName"),'required':(""),'class':("form-control"),'id':("batchname"),'value':(batchInstance?.batchName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: batchInstance, field: 'description', 'error'))
printHtmlPart(4)
invokeTag('message','g',27,['code':("batch.description.label"),'default':("Description")],-1)
printHtmlPart(5)
invokeTag('textField','g',31,['name':("description"),'class':("form-control"),'value':(batchInstance?.description)],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: batchInstance, field: 'batchfrom', 'error'))
printHtmlPart(7)
invokeTag('message','g',42,['code':("batch.batchfrom.label"),'default':("From")],-1)
printHtmlPart(8)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:batchInstance?.batchfrom))
printHtmlPart(9)
expressionOut.print(hasErrors(bean: batchInstance, field: 'batchto', 'error'))
printHtmlPart(10)
invokeTag('message','g',55,['code':("batch.batchto.label"),'default':("To")],-1)
printHtmlPart(11)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:batchInstance?.batchto))
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926017551L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
