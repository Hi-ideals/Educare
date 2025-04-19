import com.hiideals.institute.library.Magazine
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_magazine_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/magazine/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: magazineInstance, field: 'magazineName', 'error'))
printHtmlPart(1)
invokeTag('message','g',11,['code':("magazine.magazineName.label"),'default':("Magazine Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',16,['name':("magazineName"),'class':("form-control"),'required':(""),'id':("magazineName"),'value':(magazineInstance?.magazineName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: magazineInstance, field: 'catagory', 'error'))
printHtmlPart(4)
invokeTag('message','g',29,['code':("magazine.catagory.label"),'default':("Catagory")],-1)
printHtmlPart(2)
invokeTag('textField','g',34,['name':("catagory"),'class':("form-control"),'required':(""),'id':("catagory"),'value':(magazineInstance?.catagory)],-1)
printHtmlPart(5)
expressionOut.print(hasErrors(bean: magazineInstance, field: 'volume', 'error'))
printHtmlPart(6)
invokeTag('message','g',47,['code':("magazine.volume.label"),'default':("Volume")],-1)
printHtmlPart(7)
invokeTag('textField','g',51,['name':("volume"),'class':("form-control"),'required':(""),'id':("volume"),'value':(magazineInstance?.volume)],-1)
printHtmlPart(8)
expressionOut.print(hasErrors(bean: magazineInstance, field: 'cost', 'error'))
printHtmlPart(9)
invokeTag('message','g',66,['code':("magazine.cost.label"),'default':("Cost")],-1)
printHtmlPart(10)
invokeTag('field','g',71,['type':("number"),'name':("cost"),'class':("form-control"),'required':(""),'id':("cost"),'value':(fieldValue(bean: magazineInstance, field: 'cost'))],-1)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: magazineInstance, field: 'cddvd', 'error'))
printHtmlPart(12)
invokeTag('message','g',85,['code':("magazine.cddvd.label"),'default':("Cddvd")],-1)
printHtmlPart(13)
invokeTag('checkBox','g',89,['name':("cddvd"),'class':("form-control"),'value':(magazineInstance?.cddvd)],-1)
printHtmlPart(14)
expressionOut.print(hasErrors(bean: magazineInstance, field: 'purchasedOn', 'error'))
printHtmlPart(15)
invokeTag('message','g',98,['code':("magazine.purchasedOn.label"),'default':("Purchased On")],-1)
printHtmlPart(16)
expressionOut.print(formatDate(format:'MM/dd/yyyy',date:magazineInstance?.purchasedOn))
printHtmlPart(17)
invokeTag('getInstituite','regId',113,[:],-1)
printHtmlPart(18)
invokeTag('message','g',116,['code':("magazine.instituite.label"),'default':("Instituite")],-1)
printHtmlPart(19)
expressionOut.print(hasErrors(bean: magazineInstance, field: 'instituite', 'error'))
printHtmlPart(20)
invokeTag('textField','g',122,['name':("instituite"),'required':(""),'class':("form-control"),'type':("hidden"),'value':(instituite?.id)],-1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925996555L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
