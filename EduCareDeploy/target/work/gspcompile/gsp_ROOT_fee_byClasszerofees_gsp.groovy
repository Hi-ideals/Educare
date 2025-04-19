import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_fee_byClasszerofees_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/fee/_byClasszerofees.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('message','g',18,['code':("fee.studentId.label"),'default':("Student Name")],-1)
printHtmlPart(1)
loop:{
int i = 0
for( st in (ss) ) {
printHtmlPart(2)
expressionOut.print(st?.registrationNo)
printHtmlPart(3)
expressionOut.print(st?.studentName)
printHtmlPart(3)
expressionOut.print(st?.fatherDetails?.parentName)
printHtmlPart(4)
for( _it1049295917 in (st?.academicyear) ) {
changeItVariable(_it1049295917)
printHtmlPart(5)
if(true && (it.status == 'current')) {
printHtmlPart(5)
}
printHtmlPart(6)
}
printHtmlPart(7)
invokeTag('set','g',41,['value':(it?.presentclass),'var':("pclass")],-1)
printHtmlPart(7)
expressionOut.print(pclass.classname)
printHtmlPart(4)
for( _it47280839 in (st?.academicyear) ) {
changeItVariable(_it47280839)
printHtmlPart(5)
if(true && (it.status == 'current')) {
printHtmlPart(5)
}
printHtmlPart(6)
}
printHtmlPart(7)
invokeTag('set','g',46,['value':(it),'var':("pclass")],-1)
printHtmlPart(7)
expressionOut.print(pclass.academicyear)
printHtmlPart(4)
createClosureForHtmlPart(8, 2)
invokeTag('link','g',51,['controller':("fee"),'action':("create"),'id':(LookUpED.encod(st?.id)),'class':("btn yellow")],2)
printHtmlPart(9)
i++
}
}
printHtmlPart(10)
invokeTag('paginate','g',60,['total':(feeInstanceCount ?: 0),'params':(params)],-1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926001625L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
