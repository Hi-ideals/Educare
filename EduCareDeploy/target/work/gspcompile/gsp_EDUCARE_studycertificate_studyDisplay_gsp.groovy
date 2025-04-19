import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_studycertificate_studyDisplay_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/studycertificate/_studyDisplay.gsp" }
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
for( _it824425077 in (student?.academicyear) ) {
changeItVariable(_it824425077)
printHtmlPart(6)
if(true && (it.status == 'current')) {
printHtmlPart(6)
}
printHtmlPart(7)
}
printHtmlPart(8)
invokeTag('set','g',32,['value':(it?.presentclass),'var':("pclass")],-1)
printHtmlPart(8)
expressionOut.print(pclass.classname)
printHtmlPart(9)
for( _it1032724390 in (student?.academicyear) ) {
changeItVariable(_it1032724390)
printHtmlPart(6)
if(true && (it.status == 'current')) {
printHtmlPart(6)
}
printHtmlPart(7)
}
printHtmlPart(8)
invokeTag('set','g',39,['value':(it?.presentclass),'var':("pclass")],-1)
printHtmlPart(8)
expressionOut.print(pclass.classname)
printHtmlPart(10)
expressionOut.print(student?.academicyear?.academicyear.toString().replace('[', '').replace(']', ''))
printHtmlPart(11)
invokeTag('hiddenField','g',64,['name':("id"),'value':(student.id)],-1)
printHtmlPart(12)
invokeTag('actionSubmit','g',67,['class':("btn blue"),'action':("printstudycertificate"),'params':([id:student.id]),'value':("submit")],-1)
printHtmlPart(13)
}
printHtmlPart(0)
})
invokeTag('form','g',87,['controller':("studycertificate"),'action':("printstudycertificate")],1)
printHtmlPart(0)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925998989L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
