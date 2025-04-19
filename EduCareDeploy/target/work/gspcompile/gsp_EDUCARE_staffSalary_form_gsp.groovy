import com.hiideals.institute.payroll.StaffSalary
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_staffSalary_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/staffSalary/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: staffSalaryInstance, field: 'staffType', 'error'))
printHtmlPart(1)
invokeTag('message','g',11,['code':("staffSalary.staffType.label"),'default':("Staff Type")],-1)
printHtmlPart(2)
expressionOut.print(remoteFunction(controller:'staffSalary',action: 'getstafflist',
                       update: 'updatestaff',
                       params: '\'staff=\' + this.value'))
printHtmlPart(3)
loop:{
int i = 0
for( staffType in (staffSalaryInstance.constraints.staffType.inList) ) {
printHtmlPart(4)
expressionOut.print(staffType)
printHtmlPart(5)
expressionOut.print(staffType)
printHtmlPart(6)
i++
}
}
printHtmlPart(7)
invokeTag('render','g',29,['template':("staffList"),'model':([staffType:staffType])],-1)
printHtmlPart(8)
for( batch in (batchList) ) {
printHtmlPart(9)
expressionOut.print(batch.batchName)
printHtmlPart(10)
expressionOut.print(batch.batchName)
printHtmlPart(11)
}
printHtmlPart(12)
expressionOut.print(hasErrors(bean: staffSalaryInstance, field: 'month', 'error'))
printHtmlPart(13)
invokeTag('message','g',49,['code':("staffSalary.month.label"),'default':("Month")],-1)
printHtmlPart(14)
invokeTag('select','g',55,['name':("month"),'id':("month"),'class':("form-control"),'from':(staffSalaryInstance.constraints.month.inList),'required':(""),'value':(staffSalaryInstance?.month),'valueMessagePrefix':("staffSalary.month")],-1)
printHtmlPart(15)
invokeTag('render','g',88,['template':("staffpayhead"),'model':([staffId:staffId])],-1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926006219L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
