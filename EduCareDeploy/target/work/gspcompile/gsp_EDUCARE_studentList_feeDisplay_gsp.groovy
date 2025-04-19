import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.utils.APPConsumer
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_studentList_feeDisplay_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/studentList/_feeDisplay.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
expressionOut.print(student.studentName)
printHtmlPart(2)
expressionOut.print(student.fatherDetails?.parentName)
printHtmlPart(3)
for( _it1074791118 in (student?.academicyear) ) {
changeItVariable(_it1074791118)
printHtmlPart(4)
if(true && (it.status == 'current')) {
printHtmlPart(4)
}
printHtmlPart(5)
}
printHtmlPart(6)
invokeTag('set','g',27,['value':(it?.presentclass),'var':("pclass")],-1)
printHtmlPart(6)
expressionOut.print(pclass.classname)
printHtmlPart(7)
invokeTag('formatDate','g',33,['format':("dd-MMM-yyyy"),'date':(student.studentDOJ)],-1)
printHtmlPart(8)
for( _it1752213359 in (student?.academicyear) ) {
changeItVariable(_it1752213359)
printHtmlPart(4)
if(true && (it.status == 'current')) {
printHtmlPart(4)
}
printHtmlPart(5)
}
printHtmlPart(6)
invokeTag('set','g',40,['value':(it?.section),'var':("pclass")],-1)
printHtmlPart(6)
expressionOut.print(pclass.sectionName)
printHtmlPart(9)
expressionOut.print(student?.academicyear?.academicyear.toString().replace('[', '').replace(']', ''))
printHtmlPart(10)
createClosureForHtmlPart(11, 1)
invokeTag('link','g',52,['controller':("student"),'action':("show"),'id':(LookUpED.encod(student?.id)),'class':("btn blue")],1)
printHtmlPart(12)
createClosureForHtmlPart(13, 1)
invokeTag('link','g',56,['controller':("fee"),'action':("edit"),'style':("color:#fff"),'id':(LookUpED.encod(feeInstance?.id)),'class':("btn yellow")],1)
printHtmlPart(14)
createClosureForHtmlPart(15, 1)
invokeTag('link','g',74,['controller':("fee"),'action':("edit"),'style':("color:#fff"),'id':(LookUpED.encod(student?.id)),'title':("")],1)
printHtmlPart(16)
invokeTag('render','g',82,['template':("studenttable"),'model':([academicyears:student?.academicyear])],-1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926019344L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
