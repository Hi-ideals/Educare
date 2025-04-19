import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_student_studentlistable_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/student/_studentlistable.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('getImage','images',9,['id':(instituite?.logo?.id),'width':("100px"),'height':("100px")],-1)
printHtmlPart(1)
expressionOut.print(instituite?.name)
printHtmlPart(2)
expressionOut.print(instituite?.affiliatedTo)
printHtmlPart(3)
invokeTag('set','g',34,['var':("user"),'value':(sec.username())],-1)
printHtmlPart(4)
if(true && (user == "vidyashree")) {
printHtmlPart(5)
invokeTag('message','g',38,['code':("student.fatherDetails.label"),'default':("Registration Number")],-1)
printHtmlPart(6)
}
else {
printHtmlPart(7)
invokeTag('message','g',43,['code':("student.fatherDetails.label"),'default':("Registration Number")],-1)
printHtmlPart(8)
}
printHtmlPart(9)
invokeTag('message','g',47,['code':("student.motherDetails.label"),'default':("Student Id")],-1)
printHtmlPart(10)
invokeTag('message','g',50,['code':("student.guardianDetails.label"),'default':("Student Name")],-1)
printHtmlPart(11)
invokeTag('message','g',55,['code':("student.guardianDetails.label"),'default':("Class ")],-1)
printHtmlPart(12)
loop:{
int i = 0
for( studentInstance in (studentInstanceList) ) {
printHtmlPart(13)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(14)
expressionOut.print(i+1)
printHtmlPart(15)
invokeTag('set','g',72,['var':("user"),'value':(sec.username())],-1)
printHtmlPart(4)
if(true && (user == "vidyashree")) {
printHtmlPart(16)
}
else {
printHtmlPart(17)
expressionOut.print(fieldValue(bean: studentInstance, field: "registrationNo"))
printHtmlPart(18)
}
printHtmlPart(19)
expressionOut.print(fieldValue(bean: studentInstance, field: "studentId"))
printHtmlPart(20)
expressionOut.print(fieldValue(bean: studentInstance, field: "studentName"))
printHtmlPart(20)
expressionOut.print(fieldValue(bean: studentInstance?.fatherDetails, field: "parentName"))
printHtmlPart(21)
for( _it777790557 in (studentInstance?.academicyear) ) {
changeItVariable(_it777790557)
printHtmlPart(22)
if(true && (it.status == 'current')) {
printHtmlPart(22)
}
printHtmlPart(23)
}
printHtmlPart(24)
invokeTag('set','g',94,['value':(it?.presentclass),'var':("pclass")],-1)
printHtmlPart(24)
expressionOut.print(pclass.classname)
printHtmlPart(25)
for( _it1015424290 in (studentInstance?.academicyear) ) {
changeItVariable(_it1015424290)
printHtmlPart(22)
if(true && (it.status == 'current')) {
printHtmlPart(22)
}
printHtmlPart(23)
}
printHtmlPart(24)
invokeTag('set','g',99,['value':(it?.section),'var':("pclass")],-1)
printHtmlPart(24)
expressionOut.print(pclass?.sectionName)
printHtmlPart(21)
invokeTag('formatDate','g',103,['format':("dd-MMM-yyyy"),'date':(studentInstance.studentDOJ)],-1)
printHtmlPart(26)
createClosureForHtmlPart(27, 2)
invokeTag('link','g',117,['controller':("student"),'action':("show"),'id':(LookUpED.encod(studentInstance.id))],2)
printHtmlPart(28)
createClosureForHtmlPart(29, 2)
invokeTag('link','g',120,['controller':("student"),'action':("reAdmission"),'id':(studentInstance.id)],2)
printHtmlPart(30)
createClosureForHtmlPart(31, 2)
invokeTag('link','g',124,['controller':("student"),'action':("transfer"),'id':(studentInstance.id)],2)
printHtmlPart(32)
createClosureForHtmlPart(33, 2)
invokeTag('link','g',131,['controller':("student"),'action':("repeate"),'id':(studentInstance.id)],2)
printHtmlPart(34)
i++
}
}
printHtmlPart(35)
invokeTag('paginate','g',146,['total':(studentInstanceCount ?: 0),'params':(params)],-1)
printHtmlPart(36)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926000623L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
