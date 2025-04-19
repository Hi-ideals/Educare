import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_listofFeeTypes_classfeetypelist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/listofFeeTypes/_classfeetypelist.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(message(code: 'instFeeTypes.typeName.label', default: 'Type Name'))
printHtmlPart(1)
expressionOut.print(message(code: 'instFeeTypes.totalAmount.label', default: 'Total Amount'))
printHtmlPart(2)
expressionOut.print(iClassList?.classname)
printHtmlPart(3)
if(true && (admfee != null)) {
printHtmlPart(4)
expressionOut.print(admfee?.totalAmount)
printHtmlPart(5)
}
else {
printHtmlPart(6)
}
printHtmlPart(7)
loop:{
int i = 0
for( instFeeTypesInstance in (instfeetypes) ) {
printHtmlPart(8)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(9)
expressionOut.print(fieldValue(bean: instFeeTypesInstance, field: "typeName"))
printHtmlPart(10)
expressionOut.print(fieldValue(bean: instFeeTypesInstance.iclass, field: "classname"))
printHtmlPart(10)
expressionOut.print(fieldValue(bean: instFeeTypesInstance, field: "totalAmount"))
printHtmlPart(11)
i++
}
}
printHtmlPart(12)
expressionOut.print(Totalsum)
printHtmlPart(13)
createTagBody(1, {->
printHtmlPart(14)
invokeTag('hiddenField','g',62,['name':("iclass"),'value':(params?.iclass)],-1)
printHtmlPart(14)
invokeTag('hiddenField','g',63,['name':("Search"),'value':("Search")],-1)
printHtmlPart(15)
invokeTag('submitButton','g',65,['class':("btn blue"),'name':("Get Print")],-1)
printHtmlPart(16)
})
invokeTag('form','g',66,['controller':("listofFeeTypes"),'action':("classgetfeelistprint"),'target':("_blank")],1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925998452L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
