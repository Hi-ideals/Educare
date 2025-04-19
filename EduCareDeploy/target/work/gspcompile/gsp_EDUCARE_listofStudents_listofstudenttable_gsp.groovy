import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_listofStudents_listofstudenttable_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/listofStudents/_listofstudenttable.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('getImage','images',8,['id':(instituite?.logo?.id),'width':("100px"),'height':("100px")],-1)
printHtmlPart(1)
expressionOut.print(instituite?.name)
printHtmlPart(2)
expressionOut.print(instituite?.affiliatedTo)
printHtmlPart(3)
invokeTag('set','g',33,['var':("user"),'value':(sec.username())],-1)
printHtmlPart(4)
if(true && (user == "vidyashree")) {
printHtmlPart(5)
invokeTag('message','g',37,['code':("student.fatherDetails.label"),'default':("Registration Number")],-1)
printHtmlPart(6)
}
else {
printHtmlPart(7)
invokeTag('message','g',42,['code':("student.fatherDetails.label"),'default':("Registration Number")],-1)
printHtmlPart(8)
}
printHtmlPart(9)
invokeTag('message','g',48,['code':("student.guardianDetails.label"),'default':("Student Name")],-1)
printHtmlPart(10)
invokeTag('message','g',53,['code':("student.guardianDetails.label"),'default':("Class ")],-1)
printHtmlPart(11)
loop:{
int i = 0
for( studentInstance in (studentInstanceList) ) {
printHtmlPart(12)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(13)
invokeTag('set','g',66,['var':("user"),'value':(sec.username())],-1)
printHtmlPart(4)
if(true && (user == "vidyashree")) {
printHtmlPart(14)
}
else {
printHtmlPart(15)
expressionOut.print(fieldValue(bean: studentInstance, field: "registrationNo"))
printHtmlPart(16)
}
printHtmlPart(17)
expressionOut.print(fieldValue(bean: studentInstance, field: "studentName"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: studentInstance, field: "fatherDetails.parentName"))
printHtmlPart(19)
for( _it2025644484 in (studentInstance?.academicyear) ) {
changeItVariable(_it2025644484)
printHtmlPart(20)
if(true && (it.status == 'current')) {
printHtmlPart(20)
}
printHtmlPart(21)
}
printHtmlPart(22)
invokeTag('set','g',84,['value':(it?.presentclass),'var':("pclass")],-1)
printHtmlPart(22)
expressionOut.print(pclass.classname)
printHtmlPart(23)
for( _it413046447 in (studentInstance?.academicyear) ) {
changeItVariable(_it413046447)
printHtmlPart(20)
if(true && (it.status == 'current')) {
printHtmlPart(20)
}
printHtmlPart(21)
}
printHtmlPart(22)
invokeTag('set','g',89,['value':(it?.section),'var':("pclass")],-1)
printHtmlPart(22)
expressionOut.print(pclass.sectionName)
printHtmlPart(24)
invokeTag('formatDate','g',91,['format':("dd-MMM-yyyy"),'date':(studentInstance.studentDOJ)],-1)
printHtmlPart(25)
i++
}
}
printHtmlPart(26)
invokeTag('paginate','g',102,['total':(studentInstanceCount ?: 0),'params':(params)],-1)
printHtmlPart(27)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926010895L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
