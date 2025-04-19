import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.utils.APPConsumer
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_studentList_listbystudentId_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/studentList/_listbystudentId.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
invokeTag('getImage','images',9,['id':(instituite?.logo?.id),'width':("100px"),'height':("100px")],-1)
printHtmlPart(2)
expressionOut.print(instituite?.name)
printHtmlPart(3)
expressionOut.print(instituite?.affiliatedTo)
printHtmlPart(4)
invokeTag('set','g',35,['var':("user"),'value':(sec.username())],-1)
printHtmlPart(5)
if(true && (user == "vidyashree")) {
printHtmlPart(6)
invokeTag('message','g',38,['code':("student.fatherDetails.label"),'default':("Registration Number")],-1)
printHtmlPart(7)
}
else {
printHtmlPart(8)
invokeTag('message','g',43,['code':("student.fatherDetails.label"),'default':("Registration Number")],-1)
printHtmlPart(9)
}
printHtmlPart(10)
invokeTag('message','g',47,['code':("student.motherDetails.label"),'default':("Student Id")],-1)
printHtmlPart(11)
invokeTag('message','g',50,['code':("student.guardianDetails.label"),'default':("Student Name")],-1)
printHtmlPart(12)
invokeTag('message','g',53,['code':("student.guardianDetails.label"),'default':("Class ")],-1)
printHtmlPart(13)
loop:{
int i = 0
for( studentInstance in (studentInstanceList) ) {
printHtmlPart(14)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(15)
expressionOut.print(i+1)
printHtmlPart(16)
invokeTag('set','g',69,['var':("user"),'value':(sec.username())],-1)
printHtmlPart(5)
if(true && (user == "vidyashree")) {
printHtmlPart(17)
}
else {
printHtmlPart(18)
expressionOut.print(fieldValue(bean: studentInstance, field: "registrationNo"))
printHtmlPart(19)
}
printHtmlPart(20)
expressionOut.print(fieldValue(bean: studentInstance, field: "studentId"))
printHtmlPart(21)
expressionOut.print(fieldValue(bean: studentInstance, field: "studentName"))
printHtmlPart(22)
expressionOut.print(fieldValue(bean: studentInstance?.fatherDetails, field: "parentName"))
printHtmlPart(23)
for( _it2022767609 in (studentInstance?.academicyear) ) {
changeItVariable(_it2022767609)
printHtmlPart(24)
if(true && (it.status == 'current')) {
printHtmlPart(24)
}
printHtmlPart(25)
}
printHtmlPart(26)
invokeTag('set','g',90,['value':(it?.presentclass),'var':("pclass")],-1)
printHtmlPart(26)
expressionOut.print(pclass.classname)
printHtmlPart(27)
for( _it850268617 in (studentInstance?.academicyear) ) {
changeItVariable(_it850268617)
printHtmlPart(24)
if(true && (it.status == 'current')) {
printHtmlPart(24)
}
printHtmlPart(25)
}
printHtmlPart(26)
invokeTag('set','g',95,['value':(it?.section),'var':("pclass")],-1)
printHtmlPart(26)
expressionOut.print(pclass?.sectionName)
printHtmlPart(28)
invokeTag('formatDate','g',98,['format':("dd-MMM-yyyy"),'date':(studentInstance.studentDOJ)],-1)
printHtmlPart(29)
createClosureForHtmlPart(30, 2)
invokeTag('link','g',112,['controller':("student"),'action':("show"),'id':(LookUpED.encod(studentInstance.id))],2)
printHtmlPart(31)
createClosureForHtmlPart(32, 2)
invokeTag('link','g',114,['controller':("student"),'action':("reAdmission"),'id':(studentInstance.id)],2)
printHtmlPart(33)
createClosureForHtmlPart(34, 2)
invokeTag('link','g',117,['controller':("student"),'action':("transfer"),'id':(studentInstance.id)],2)
printHtmlPart(35)
createClosureForHtmlPart(36, 2)
invokeTag('link','g',124,['controller':("student"),'action':("repeate"),'id':(studentInstance.id)],2)
printHtmlPart(37)
i++
}
}
printHtmlPart(38)
invokeTag('paginate','g',141,['total':(studentInstanceCount ?: 0),'params':(params)],-1)
printHtmlPart(39)
expressionOut.print(APPConsumer.AJAX_NAME)
printHtmlPart(40)
expressionOut.print(APPConsumer.AJAX_NAME)
printHtmlPart(41)
expressionOut.print(APPConsumer.AJAX_NAME)
printHtmlPart(42)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926019372L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
