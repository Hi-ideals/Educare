import com.hiideals.instituite.feemanagment.Admissionfee
import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.classcourses.IClass
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_admissionfee_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admissionfee/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(1)
invokeTag('message','g',11,['code':("admissionfee.name.label"),'default':("Name")],-1)
printHtmlPart(2)
if(true && (admissionfeeInstance?.name == "Admission Fee" || admissionfeeInstance?.name == null)) {
printHtmlPart(3)
invokeTag('textField','g',15,['name':("name"),'required':(""),'class':("form-control"),'value':("Admission Fee")],-1)
}
else {
printHtmlPart(3)
invokeTag('textField','g',17,['name':("name"),'required':(""),'class':("form-control"),'value':(admissionfeeInstance?.name)],-1)
printHtmlPart(4)
}
printHtmlPart(5)
if(true && (admissionfeeInstance.iclass !=null)) {
printHtmlPart(6)
expressionOut.print(admissionfeeInstance.iclass?.id)
printHtmlPart(7)
expressionOut.print(admissionfeeInstance.iclass?.classname)
printHtmlPart(8)
}
else {
printHtmlPart(9)
}
printHtmlPart(4)
for( cls in (IClass.findAllByInstituite(instituite)) ) {
printHtmlPart(10)
expressionOut.print(cls.id)
printHtmlPart(11)
expressionOut.print(cls.classname)
printHtmlPart(12)
}
printHtmlPart(13)
invokeTag('message','g',53,['code':("admissionfee.totalAmount.label"),'default':("Total Amount")],-1)
printHtmlPart(14)
invokeTag('field','g',56,['name':("totalAmount"),'type':("number"),'class':("form-control"),'value':(admissionfeeInstance.totalAmount),'required':("")],-1)
printHtmlPart(15)
expressionOut.print(hasErrors(bean: admissionfeeInstance, field: 'instituite', 'error'))
printHtmlPart(16)
invokeTag('message','g',71,['code':("instituite.admin.label"),'default':("instituite")],-1)
printHtmlPart(17)
expressionOut.print(instituite?.id)
printHtmlPart(18)
expressionOut.print(instituite?.name)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926014502L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
