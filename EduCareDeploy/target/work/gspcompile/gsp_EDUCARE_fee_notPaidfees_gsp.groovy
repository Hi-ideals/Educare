import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_fee_notPaidfees_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/fee/_notPaidfees.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('set','g',15,['var':("user"),'value':(sec.username())],-1)
printHtmlPart(1)
if(true && (user == "vidyashree")) {
printHtmlPart(2)
invokeTag('message','g',19,['code':("student.fatherDetails.label"),'default':("Registration Number")],-1)
printHtmlPart(3)
}
else {
printHtmlPart(4)
invokeTag('message','g',24,['code':("student.fatherDetails.label"),'default':("Registration Number")],-1)
printHtmlPart(5)
}
printHtmlPart(6)
invokeTag('message','g',28,['code':("fee.studentId.label"),'default':("Student Name")],-1)
printHtmlPart(7)
loop:{
int i = 0
for( st in (ss) ) {
printHtmlPart(8)
invokeTag('set','g',42,['var':("user"),'value':(sec.username())],-1)
printHtmlPart(1)
if(true && (user == "vidyashree")) {
printHtmlPart(9)
}
else {
printHtmlPart(10)
expressionOut.print(st?.registrationNo)
printHtmlPart(11)
}
printHtmlPart(12)
expressionOut.print(st?.studentName)
printHtmlPart(13)
expressionOut.print(st?.fatherDetails?.parentName)
printHtmlPart(14)
for( _it798259 in (st?.academicyear) ) {
changeItVariable(_it798259)
printHtmlPart(15)
if(true && (it.status == 'current')) {
printHtmlPart(15)
}
printHtmlPart(16)
}
printHtmlPart(17)
invokeTag('set','g',60,['value':(it?.presentclass),'var':("pclass")],-1)
printHtmlPart(17)
expressionOut.print(pclass.classname)
printHtmlPart(18)
for( _it823672546 in (st?.academicyear) ) {
changeItVariable(_it823672546)
printHtmlPart(15)
if(true && (it.status == 'current')) {
printHtmlPart(15)
}
printHtmlPart(16)
}
printHtmlPart(17)
invokeTag('set','g',65,['value':(it),'var':("pclass")],-1)
printHtmlPart(17)
expressionOut.print(pclass.academicyear)
printHtmlPart(18)
createClosureForHtmlPart(19, 2)
invokeTag('link','g',70,['controller':("fee"),'action':("create"),'id':(LookUpED.encod(st?.id)),'class':("btn yellow")],2)
printHtmlPart(20)
i++
}
}
printHtmlPart(21)
invokeTag('paginate','g',79,['total':(feeInstanceCount ?: 0),'params':(params)],-1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926001595L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
