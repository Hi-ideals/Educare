import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_transportFee_staffs_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/transportFee/_staffs.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: transportFeeInstance, field: 'student', 'error'))
printHtmlPart(1)
invokeTag('message','g',5,['code':("transportFee.student.label"),'default':("Staff")],-1)
printHtmlPart(2)
expressionOut.print(remoteFunction(
			          controller: 'transportFee', 
			          action: 'getFeeDetails',
					  update:'feedetails',
			          params: "\'staffId=\' + this.value+  \'&transportId=\' + document.getElementById('transport').value+  \'&staff=\' + document.getElementById('staff').value"))
printHtmlPart(3)
for( _it1980883605 in (staffs) ) {
changeItVariable(_it1980883605)
printHtmlPart(4)
expressionOut.print(it?.id)
printHtmlPart(5)
expressionOut.print(it?.staffName)
printHtmlPart(6)
}
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926005847L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
