import com.hiideals.instituite.feemanagment.InstFeeTypes
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_instFeeTypes_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/instFeeTypes/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: instFeeTypesInstance, field: 'typeName', 'error'))
printHtmlPart(1)
invokeTag('message','g',10,['code':("instFeeTypes.typeName.label"),'default':("Fee Type Name ")],-1)
printHtmlPart(2)
invokeTag('textField','g',14,['name':("typeName"),'class':("form-control"),'required':(""),'id':("feetypename"),'value':(instFeeTypesInstance?.typeName)],-1)
printHtmlPart(3)
if(true && (instFeeTypesInstance.iclass !=null)) {
printHtmlPart(4)
expressionOut.print(instFeeTypesInstance.iclass?.id)
printHtmlPart(5)
expressionOut.print(instFeeTypesInstance.iclass?.classname)
printHtmlPart(6)
}
else {
printHtmlPart(7)
}
printHtmlPart(8)
for( cls in (instituite?.classes) ) {
printHtmlPart(4)
expressionOut.print(cls?.id)
printHtmlPart(5)
expressionOut.print(cls?.classname)
printHtmlPart(6)
}
printHtmlPart(9)
expressionOut.print(hasErrors(bean: instFeeTypesInstance, field: 'description', 'error'))
printHtmlPart(10)
invokeTag('message','g',50,['code':("instFeeTypes.description.label"),'default':("Description")],-1)
printHtmlPart(2)
invokeTag('textField','g',54,['name':("description"),'class':("form-control"),'required':(""),'id':("Description"),'value':(instFeeTypesInstance?.description)],-1)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: instFeeTypesInstance, field: 'totalAmount', 'error'))
printHtmlPart(12)
invokeTag('message','g',65,['code':("instFeeTypes.totalAmount.label"),'default':("Total Amount")],-1)
printHtmlPart(2)
invokeTag('field','g',70,['name':("totalAmount"),'class':("form-control"),'type':("number"),'value':(instFeeTypesInstance.totalAmount),'required':(""),'id':("totalamount")],-1)
printHtmlPart(13)
expressionOut.print(hasErrors(bean: sectionInstance, field: 'instituite', 'error'))
printHtmlPart(14)
invokeTag('message','g',81,['code':("instituite.admin.label"),'default':("instituite")],-1)
printHtmlPart(15)
expressionOut.print(instituite?.id)
printHtmlPart(16)
expressionOut.print(instituite?.name)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926008117L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
