import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_staffSalary_staffpayhead_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/staffSalary/_staffpayhead.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
loop:{
int j = 0
for( payhead in (staffpayhead) ) {
printHtmlPart(1)
invokeTag('field','g',12,['name':("payHeadName_${j}"),'value':(payhead?.id),'id':("payHeadName_${j}"),'type':("hidden")],-1)
printHtmlPart(2)
expressionOut.print(payhead?.payhead?.payHeadName)
printHtmlPart(3)
if(true && (payhead?.payhead?.payHeadType=="Addition")) {
printHtmlPart(4)
}
printHtmlPart(5)
if(true && (payhead?.payhead?.payHeadType=="Deduction")) {
printHtmlPart(6)
}
printHtmlPart(7)
expressionOut.print(payhead?.aunit)
printHtmlPart(8)
j++
}
}
printHtmlPart(9)
expressionOut.print(total)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926006179L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
