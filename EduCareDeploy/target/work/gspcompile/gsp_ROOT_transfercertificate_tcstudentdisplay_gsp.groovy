import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_transfercertificate_tcstudentdisplay_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/transfercertificate/_tcstudentdisplay.gsp" }
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
expressionOut.print(student.instituite?.name)
printHtmlPart(4)
expressionOut.print(student?.registrationNo)
printHtmlPart(5)
expressionOut.print(student?.studentName)
printHtmlPart(6)
invokeTag('formatDate','g',36,['format':("dd-MMM-yyyy"),'date':(student?.studentDOB)],-1)
printHtmlPart(7)
expressionOut.print(student?.motherDetails?.parentName)
printHtmlPart(8)
expressionOut.print(student?.fatherDetails?.parentName)
printHtmlPart(9)
expressionOut.print(student?.religion)
printHtmlPart(10)
expressionOut.print(student?.nationality)
printHtmlPart(11)
expressionOut.print(student?.gender)
printHtmlPart(12)
expressionOut.print(student?.category)
printHtmlPart(13)
for( _it1297259456 in (student?.academicyear) ) {
changeItVariable(_it1297259456)
printHtmlPart(0)
if(true && (it.status == 'current')) {
printHtmlPart(0)
}
printHtmlPart(0)
}
printHtmlPart(0)
invokeTag('set','g',77,['value':(it?.presentclass),'var':("pclass")],-1)
printHtmlPart(14)
expressionOut.print(pclass?.classname)
printHtmlPart(15)
for( _it1117642317 in (student?.academicyear) ) {
changeItVariable(_it1117642317)
printHtmlPart(0)
if(true && (it.status == 'current')) {
printHtmlPart(0)
}
printHtmlPart(0)
}
printHtmlPart(0)
invokeTag('set','g',89,['value':(it?.section),'var':("pclass")],-1)
printHtmlPart(14)
expressionOut.print(pclass?.sectionName)
printHtmlPart(16)
expressionOut.print(student?.studentId)
printHtmlPart(17)
expressionOut.print(student?.stsSystem)
printHtmlPart(18)
invokeTag('formatDate','g',113,['format':("yyyy-MM-dd"),'date':(student?.studentDOJ)],-1)
printHtmlPart(19)
invokeTag('hiddenField','g',166,['name':("id"),'value':(student.id)],-1)
printHtmlPart(20)
invokeTag('actionSubmit','g',173,['class':("btn blue"),'action':("printtransfercertificate"),'params':([id:student.id]),'value':("submit")],-1)
printHtmlPart(21)
}
printHtmlPart(0)
})
invokeTag('form','g',189,['controller':("transfercertificate"),'target':("_blank")],1)
printHtmlPart(0)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926009700L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
