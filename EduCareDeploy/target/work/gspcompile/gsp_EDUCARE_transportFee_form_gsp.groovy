import com.hiideals.transport.TransportFee
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_transportFee_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/transportFee/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: transportFeeInstance, field: 'transport', 'error'))
printHtmlPart(1)
invokeTag('message','g',9,['code':("transportFee.transport.label"),'default':("Transport")],-1)
printHtmlPart(2)
expressionOut.print(remoteFunction(
			          controller: 'transportFee', 
			          action: 'getStudents',
					  update:'stu',
			          params: "\'value=\' + this.value"))
printHtmlPart(3)
expressionOut.print(remoteFunction(
			          controller: 'transportFee', 
			          action: 'getStaffs',
					  update:'sta',
			          params: "\'value=\' + this.value"))
printHtmlPart(4)
for( _it1987377620 in (transprt) ) {
changeItVariable(_it1987377620)
printHtmlPart(5)
expressionOut.print(it?.id)
printHtmlPart(6)
expressionOut.print(it?.destination?.fromPlace)
printHtmlPart(7)
expressionOut.print(it?.destination?.toPlace)
printHtmlPart(8)
expressionOut.print(it?.destination?.acdemicyear?.batchName)
printHtmlPart(9)
}
printHtmlPart(10)
invokeTag('render','g',48,['template':("students")],-1)
printHtmlPart(11)
invokeTag('render','g',51,['template':("staffs")],-1)
printHtmlPart(12)
expressionOut.print(hasErrors(bean: transportFeeInstance, field: 'paymentId', 'error'))
printHtmlPart(13)
invokeTag('message','g',65,['code':("transportFee.paymentId.label"),'default':("Payment Id")],-1)
printHtmlPart(14)
if(true && (paymentId)) {
printHtmlPart(15)
invokeTag('textField','g',69,['name':("paymentId"),'value':(paymentId)],-1)
printHtmlPart(16)
}
else {
printHtmlPart(15)
invokeTag('textField','g',73,['name':("paymentId"),'value':(transportFeeInstance?.paymentId)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
invokeTag('render','g',80,['template':("feedetails")],-1)
printHtmlPart(18)
expressionOut.print(hasErrors(bean: transportFeeInstance, field: 'fine', 'error'))
printHtmlPart(19)
invokeTag('message','g',94,['code':("transportFee.fine.label"),'default':("Fine")],-1)
printHtmlPart(20)
invokeTag('field','g',98,['type':("number"),'name':("fine"),'class':("form-control"),'value':(fieldValue(bean: transportFeeInstance, field: 'fine')),'required':("")],-1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926005830L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
