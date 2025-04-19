import com.hiideals.institute.payroll.SalarySetting
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_salarySetting_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/salarySetting/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: salarySettingInstance, field: 'type', 'error'))
printHtmlPart(1)
invokeTag('message','g',10,['code':("salarySetting.type.label"),'default':("Type")],-1)
printHtmlPart(2)
invokeTag('select','g',16,['name':("type"),'class':("form-control"),'from':(salarySettingInstance.constraints.type.inList),'required':(""),'value':(salarySettingInstance?.type),'valueMessagePrefix':("salarySetting.type")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: salarySettingInstance, field: 'staff', 'error'))
printHtmlPart(4)
invokeTag('message','g',25,['code':("salarySetting.staff.label"),'default':("Staff")],-1)
printHtmlPart(5)
for( staffName in (staffs) ) {
printHtmlPart(6)
expressionOut.print(staffName?.id)
printHtmlPart(7)
expressionOut.print(staffName?.staffName)
printHtmlPart(8)
}
printHtmlPart(9)
expressionOut.print(hasErrors(bean: salarySettingInstance, field: 'payhead', 'error'))
printHtmlPart(10)
invokeTag('message','g',45,['code':("salarySetting.payhead.label"),'default':("Payhead")],-1)
printHtmlPart(11)
for( payhead in (payheadlist) ) {
printHtmlPart(6)
expressionOut.print(payhead?.id)
printHtmlPart(7)
expressionOut.print(payhead?.payHeadName)
printHtmlPart(8)
}
printHtmlPart(12)
expressionOut.print(hasErrors(bean: salarySettingInstance, field: 'aunit', 'error'))
printHtmlPart(13)
invokeTag('message','g',58,['code':("salarySetting.unit.label"),'default':("Unit")],-1)
printHtmlPart(14)
invokeTag('field','g',66,['name':("aunit"),'type':("number"),'id':("aunit"),'class':("form-control"),'value':(salarySettingInstance.aunit),'required':("")],-1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926010723L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
