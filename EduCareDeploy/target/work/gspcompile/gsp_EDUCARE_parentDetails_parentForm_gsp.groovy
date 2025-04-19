import com.hiideals.instituite.student.ParentDetails
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_parentDetails_parentForm_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/parentDetails/_parentForm.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
if(true && (!parent.equalsIgnoreCase('Guardian'))) {
printHtmlPart(1)
expressionOut.print(parent)
printHtmlPart(2)
}
else {
printHtmlPart(1)
expressionOut.print(parent)
printHtmlPart(3)
}
printHtmlPart(4)
expressionOut.print(hasErrors(bean: parentDetailsInstance, field: 'parentName', 'error'))
printHtmlPart(5)
invokeTag('textField','g',23,['name':("${petails}.parentName"),'class':("form-control"),'id':("parentName${petails}"),'pattern':(".{3,}"),'title':("Minmum Three letter guardian name"),'value':(parentDetailsInstance?.parentName),'onkeyup':("guardian()")],-1)
printHtmlPart(6)
expressionOut.print(petails)
printHtmlPart(7)
expressionOut.print(parent)
printHtmlPart(8)
expressionOut.print(petails)
printHtmlPart(9)
if(true && (!parent.equalsIgnoreCase('Guardian'))) {
printHtmlPart(10)
}
else {
printHtmlPart(10)
}
printHtmlPart(4)
expressionOut.print(hasErrors(bean: parentDetailsInstance, field: 'occupation', 'error'))
printHtmlPart(11)
invokeTag('textField','g',50,['name':("${petails}.occupation"),'class':("form-control"),'value':(parentDetailsInstance?.occupation),'pattern':(".{2,}"),'title':("Minmum Three letter guardian name"),'onkeyup':("Occupation()")],-1)
printHtmlPart(12)
if(true && (parent.equalsIgnoreCase('Guardian')||parent.equalsIgnoreCase('Mother'))) {
printHtmlPart(13)
}
else {
printHtmlPart(14)
}
printHtmlPart(4)
expressionOut.print(hasErrors(bean: parentDetailsInstance, field: 'mobileNumber', 'error'))
printHtmlPart(11)
invokeTag('textField','g',70,['name':("${petails}.mobileNumber"),'class':("form-control"),'maxlength':("10"),'value':(parentDetailsInstance?.mobileNumber),'id':("mobileNumber${petails}")],-1)
printHtmlPart(15)
expressionOut.print(petails)
printHtmlPart(16)
expressionOut.print(hasErrors(bean: parentDetailsInstance, field: 'parentAdharNo', 'error'))
printHtmlPart(11)
invokeTag('textField','g',80,['name':("${petails}.parentAdharNo"),'class':("form-control"),'maxlength':("12"),'value':(parentDetailsInstance?.parentAdharNo)],-1)
printHtmlPart(17)
expressionOut.print(hasErrors(bean: parentDetailsInstance, field: 'parentVoterId', 'error'))
printHtmlPart(11)
invokeTag('textField','g',96,['name':("${petails}.parentVoterId"),'class':("form-control"),'value':(parentDetailsInstance?.parentVoterId)],-1)
printHtmlPart(18)
expressionOut.print(hasErrors(bean: parentDetailsInstance, field: 'parentQualification', 'error'))
printHtmlPart(11)
invokeTag('textField','g',102,['name':("${petails}.parentQualification"),'class':("form-control"),'value':(parentDetailsInstance?.parentQualification)],-1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926001202L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
