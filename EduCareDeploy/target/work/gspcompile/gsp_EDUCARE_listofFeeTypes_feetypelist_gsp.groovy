import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_listofFeeTypes_feetypelist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/listofFeeTypes/_feetypelist.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(message(code: 'instFeeTypes.typeName.label', default: 'Type Name'))
printHtmlPart(1)
expressionOut.print(message(code: 'instFeeTypes.totalAmount.label', default: 'Total Amount'))
printHtmlPart(2)
loop:{
int i = 0
for( instFeeTypesInstance in (instfeetypes) ) {
printHtmlPart(3)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(4)
expressionOut.print(fieldValue(bean: instFeeTypesInstance, field: "typeName"))
printHtmlPart(5)
expressionOut.print(fieldValue(bean: instFeeTypesInstance.iclass, field: "classname"))
printHtmlPart(5)
expressionOut.print(fieldValue(bean: instFeeTypesInstance, field: "totalAmount"))
printHtmlPart(6)
i++
}
}
printHtmlPart(7)
expressionOut.print(Totalsum)
printHtmlPart(8)
createTagBody(1, {->
printHtmlPart(9)
invokeTag('hiddenField','g',50,['name':("iclass"),'value':(params?.iclass)],-1)
printHtmlPart(9)
invokeTag('hiddenField','g',51,['name':("Search"),'value':("Search")],-1)
printHtmlPart(10)
invokeTag('submitButton','g',53,['class':("btn blue"),'name':("Get Print")],-1)
printHtmlPart(11)
})
invokeTag('form','g',54,['controller':("listofFeeTypes"),'action':("getfeelistprint"),'target':("_blank")],1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925998442L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
