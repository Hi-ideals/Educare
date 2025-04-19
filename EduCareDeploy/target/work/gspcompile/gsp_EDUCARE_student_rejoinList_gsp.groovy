import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.instituite.classcourses.IClass
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_student_rejoinList_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/student/_rejoinList.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(1)
invokeTag('getImage','images',12,['id':(instituite?.logo?.id),'width':("100px"),'height':("100px")],-1)
printHtmlPart(2)
expressionOut.print(instituite?.name)
printHtmlPart(3)
expressionOut.print(instituite?.affiliatedTo)
printHtmlPart(4)
invokeTag('message','g',38,['code':("student.fatherDetails.label"),'default':("Registration Number")],-1)
printHtmlPart(5)
invokeTag('message','g',41,['code':("student.motherDetails.label"),'default':("Roll Number")],-1)
printHtmlPart(5)
invokeTag('message','g',44,['code':("student.guardianDetails.label"),'default':("Student Name")],-1)
printHtmlPart(6)
loop:{
int i = 0
for( studentInstance in (studentInstanceList) ) {
printHtmlPart(7)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(8)
expressionOut.print(fieldValue(bean: studentInstance, field: "registrationNo"))
printHtmlPart(9)
expressionOut.print(fieldValue(bean: studentInstance, field: "studentId"))
printHtmlPart(9)
expressionOut.print(fieldValue(bean: studentInstance, field: "studentName"))
printHtmlPart(10)
expressionOut.print(fieldValue(bean: studentInstance, field: "fatherDetails.parentName"))
printHtmlPart(11)
if(true && (params?.iyear=='all')) {
printHtmlPart(12)
for( _it1246299416 in (studentInstance?.academicyear) ) {
changeItVariable(_it1246299416)
printHtmlPart(13)
invokeTag('set','g',83,['value':(IClass.findById(params?.iclass).classname),'var':("icalssname")],-1)
printHtmlPart(13)
if(true && (it?.presentclass?.classname==icalssname)) {
printHtmlPart(14)
expressionOut.print(it?.academicyear)
printHtmlPart(15)
}
printHtmlPart(16)
}
printHtmlPart(17)
}
else {
printHtmlPart(18)
expressionOut.print(params?.iyear)
printHtmlPart(19)
}
printHtmlPart(20)
if(true && (params?.iclass=='all')) {
printHtmlPart(16)
for( _it2022767609 in (studentInstance?.academicyear) ) {
changeItVariable(_it2022767609)
printHtmlPart(13)
if(true && (it?.academicyear==params?.iyear)) {
printHtmlPart(14)
expressionOut.print(it?.presentclass?.classname)
printHtmlPart(15)
}
printHtmlPart(16)
}
printHtmlPart(17)
}
else {
printHtmlPart(21)
if(true && (icalssname)) {
printHtmlPart(22)
expressionOut.print(icalssname)
printHtmlPart(13)
}
else {
printHtmlPart(22)
expressionOut.print(IClass.findById(params?.iclass).classname)
printHtmlPart(13)
}
printHtmlPart(23)
}
printHtmlPart(24)
createClosureForHtmlPart(25, 2)
invokeTag('link','g',114,['controller':("student"),'action':("reAdmission"),'id':(studentInstance.id)],2)
printHtmlPart(26)
createClosureForHtmlPart(27, 2)
invokeTag('link','g',119,['controller':("student"),'action':("show"),'id':(LookUpED.encod(studentInstance.id))],2)
printHtmlPart(28)
i++
}
}
printHtmlPart(29)
invokeTag('paginate','g',124,['total':(studentInstanceCount ?: 0),'params':(params)],-1)
printHtmlPart(30)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926000410L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
