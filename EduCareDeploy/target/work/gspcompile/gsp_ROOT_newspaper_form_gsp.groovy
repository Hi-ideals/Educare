import com.hiideals.institute.library.Newspaper
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_newspaper_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/newspaper/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: newspaperInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',11,['code':("newspaper.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',15,['name':("name"),'class':("form-control"),'required':(""),'id':("name"),'value':(newspaperInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: newspaperInstance, field: 'dateofnewspaper', 'error'))
printHtmlPart(4)
invokeTag('message','g',25,['code':("newspaper.dateofnewspaper.label"),'default':("Date of newspaper")],-1)
printHtmlPart(5)
expressionOut.print(formatDate(format:'MM/dd/yyyy',date:newspaperInstance?.dateofnewspaper))
printHtmlPart(6)
expressionOut.print(hasErrors(bean: newspaperInstance, field: 'cost', 'error'))
printHtmlPart(7)
invokeTag('message','g',40,['code':("newspaper.cost.label"),'default':("Cost")],-1)
printHtmlPart(8)
invokeTag('field','g',44,['name':("cost"),'class':("form-control"),'required':(""),'id':("cost"),'value':(fieldValue(bean: newspaperInstance, field: 'cost'))],-1)
printHtmlPart(9)
invokeTag('getInstituite','regId',52,[:],-1)
printHtmlPart(10)
invokeTag('message','g',55,['code':("newspaper.instituite.label"),'default':("Instituite")],-1)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: newspaperInstance, field: 'instituite', 'error'))
printHtmlPart(12)
invokeTag('textField','g',61,['name':("instituite"),'required':(""),'class':("form-control"),'type':("hidden"),'value':(instituite?.id)],-1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925993974L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
