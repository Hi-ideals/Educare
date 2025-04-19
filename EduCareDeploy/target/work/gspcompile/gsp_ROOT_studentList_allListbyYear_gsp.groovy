import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.utils.APPConsumer
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_studentList_allListbyYear_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/studentList/_allListbyYear.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
invokeTag('getImage','images',11,['id':(instituite?.logo?.id),'width':("100px"),'height':("100px")],-1)
printHtmlPart(2)
expressionOut.print(instituite?.name)
printHtmlPart(3)
expressionOut.print(instituite?.affiliatedTo)
printHtmlPart(4)
invokeTag('set','g',39,['var':("user"),'value':(sec.username())],-1)
printHtmlPart(5)
if(true && (user == "vidyashree")) {
printHtmlPart(6)
invokeTag('message','g',42,['code':("student.fatherDetails.label"),'default':("Registration Number")],-1)
printHtmlPart(7)
}
else {
printHtmlPart(8)
invokeTag('message','g',47,['code':("student.fatherDetails.label"),'default':("Registration Number")],-1)
printHtmlPart(9)
}
printHtmlPart(10)
invokeTag('message','g',50,['code':("student.motherDetails.label"),'default':("Student Id")],-1)
printHtmlPart(11)
invokeTag('message','g',53,['code':("student.guardianDetails.label"),'default':("Student Name")],-1)
printHtmlPart(12)
invokeTag('message','g',58,['code':("student.guardianDetails.label"),'default':("Class ")],-1)
printHtmlPart(13)
loop:{
int i = 0
for( studentInstance in (studentInstanceList) ) {
printHtmlPart(14)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(15)
expressionOut.print(i+1)
printHtmlPart(16)
invokeTag('set','g',76,['var':("user"),'value':(sec.username())],-1)
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
printHtmlPart(21)
expressionOut.print(fieldValue(bean: studentInstance?.fatherDetails, field: "parentName"))
printHtmlPart(22)
if(true && (params?.iclass=="all" || params?.iclass=="" || params?.iclass==null)) {
printHtmlPart(23)
for( _it1834463844 in (studentInstance?.academicyear) ) {
changeItVariable(_it1834463844)
printHtmlPart(24)
if(true && (it.status == 'current')) {
printHtmlPart(24)
}
printHtmlPart(25)
}
printHtmlPart(26)
invokeTag('set','g',101,['value':(it?.presentclass),'var':("pclass")],-1)
printHtmlPart(26)
expressionOut.print(pclass.classname)
printHtmlPart(27)
}
else {
printHtmlPart(28)
expressionOut.print(clsname)
printHtmlPart(29)
}
printHtmlPart(30)
invokeTag('formatDate','g',112,['format':("dd-MMM-yyyy"),'date':(studentInstance.studentDOJ)],-1)
printHtmlPart(31)
createClosureForHtmlPart(32, 2)
invokeTag('link','g',117,['controller':("student"),'action':("show"),'id':(LookUpED.encod(studentInstance.id))],2)
printHtmlPart(33)
createClosureForHtmlPart(34, 2)
invokeTag('link','g',118,['controller':("student"),'action':("reAdmission"),'id':(studentInstance.id)],2)
printHtmlPart(35)
createClosureForHtmlPart(36, 2)
invokeTag('link','g',120,['controller':("student"),'action':("transfer"),'id':(studentInstance.id)],2)
printHtmlPart(37)
createClosureForHtmlPart(38, 2)
invokeTag('link','g',127,['controller':("student"),'action':("repeate"),'id':(studentInstance.id)],2)
printHtmlPart(39)
i++
}
}
printHtmlPart(40)
invokeTag('paginate','g',142,['total':(studentInstanceCount ?: 0),'params':(params)],-1)
printHtmlPart(41)
invokeTag('hiddenField','g',144,['type':("text"),'name':("act"),'id':("act"),'value':(params.action)],-1)
printHtmlPart(42)
expressionOut.print(APPConsumer.AJAX_NAME)
printHtmlPart(43)
expressionOut.print(APPConsumer.AJAX_NAME)
printHtmlPart(44)
expressionOut.print(APPConsumer.AJAX_NAME)
printHtmlPart(45)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926019391L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
