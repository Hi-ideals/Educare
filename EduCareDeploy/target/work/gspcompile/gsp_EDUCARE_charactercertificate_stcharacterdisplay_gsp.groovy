import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_charactercertificate_stcharacterdisplay_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/charactercertificate/_stcharacterdisplay.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
if(true && (student?.studentName==null)) {
printHtmlPart(2)
}
else {
printHtmlPart(3)
expressionOut.print(student?.studentName)
printHtmlPart(4)
expressionOut.print(student?.fatherDetails?.parentName)
printHtmlPart(5)
for( _it1126853225 in (student?.academicyear) ) {
changeItVariable(_it1126853225)
printHtmlPart(6)
if(true && (it.status == 'current')) {
printHtmlPart(6)
}
printHtmlPart(7)
}
printHtmlPart(8)
invokeTag('set','g',33,['value':(it?.presentclass),'var':("pclass")],-1)
printHtmlPart(8)
expressionOut.print(pclass.classname)
printHtmlPart(9)
for( _it1867686441 in (student?.academicyear) ) {
changeItVariable(_it1867686441)
printHtmlPart(6)
if(true && (it.status == 'current')) {
printHtmlPart(6)
}
printHtmlPart(7)
}
printHtmlPart(8)
invokeTag('set','g',40,['value':(it?.section),'var':("pclass")],-1)
printHtmlPart(8)
expressionOut.print(pclass.sectionName)
printHtmlPart(10)
expressionOut.print(student?.academicyear?.academicyear.toString().replace('[', '').replace(']', ''))
printHtmlPart(11)
invokeTag('hiddenField','g',61,['name':("id"),'value':(student.id)],-1)
printHtmlPart(12)
invokeTag('actionSubmit','g',68,['class':("btn blue"),'action':("printcharactercrt"),'params':([id:student.id]),'value':("submit")],-1)
printHtmlPart(13)
}
printHtmlPart(0)
})
invokeTag('form','g',75,['controller':("charactercertificate"),'action':("printcharactercrt")],1)
printHtmlPart(0)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925998091L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
