import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_staffSalary_staffList_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/staffSalary/_staffList.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: staffSalaryInstance, field: 'staff', 'error'))
printHtmlPart(1)
invokeTag('message','g',6,['code':("staffSalary.staff.label"),'default':("Staff")],-1)
printHtmlPart(2)
expressionOut.print(remoteFunction(controller:'staffSalary',action: 'getpayhead',
                       update: 'updatepayhead',
                       params: '\'staffId=\' + this.value'))
printHtmlPart(3)
for( staffName in (stfflist) ) {
printHtmlPart(4)
expressionOut.print(staffName?.id)
printHtmlPart(5)
expressionOut.print(staffName?.staffName)
printHtmlPart(6)
}
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926006158L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
