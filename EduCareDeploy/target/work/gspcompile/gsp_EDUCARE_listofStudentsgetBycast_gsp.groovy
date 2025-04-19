import com.hiideals.instituite.student.Student
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_listofStudentsgetBycast_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/listofStudents/getBycast.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(0)
createTagBody(2, {->
createTagBody(3, {->
printHtmlPart(2)
expressionOut.print(studentInstance?.studentName)
})
invokeTag('captureTitle','sitemesh',14,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',14,[:],2)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',18,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',73,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',82,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',85,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('getImage','images',110,['id':(instituite?.logo?.id),'width':("100px")],-1)
printHtmlPart(8)
expressionOut.print(instituite?.name)
printHtmlPart(9)
expressionOut.print(instituite?.affiliatedTo)
printHtmlPart(10)
expressionOut.print(instituite?.hsno)
printHtmlPart(11)
expressionOut.print(instituite?.street)
printHtmlPart(11)
expressionOut.print(instituite?.city)
printHtmlPart(12)
expressionOut.print(instituite?.pinCode)
printHtmlPart(13)
expressionOut.print(instituite?.state)
printHtmlPart(11)
expressionOut.print(instituite?.country)
printHtmlPart(14)
expressionOut.print(instituite?.phone)
printHtmlPart(15)
expressionOut.print(params?.catone)
printHtmlPart(16)
invokeTag('set','g',141,['var':("user"),'value':(sec.username())],-1)
printHtmlPart(17)
if(true && (user == "vidyashree")) {
printHtmlPart(18)
invokeTag('message','g',145,['code':("student.fatherDetails.label"),'default':("Registration Number")],-1)
printHtmlPart(19)
}
else {
printHtmlPart(20)
invokeTag('message','g',150,['code':("student.fatherDetails.label"),'default':("Registration Number")],-1)
printHtmlPart(21)
}
printHtmlPart(22)
invokeTag('message','g',157,['code':("student.guardianDetails.label"),'default':("Student Name")],-1)
printHtmlPart(23)
invokeTag('message','g',162,['code':("student.guardianDetails.label"),'default':("Class ")],-1)
printHtmlPart(24)
loop:{
int i = 0
for( studentInstance in (studentInstanceList) ) {
printHtmlPart(25)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(26)
invokeTag('set','g',174,['var':("user"),'value':(sec.username())],-1)
printHtmlPart(17)
if(true && (user == "vidyashree")) {
printHtmlPart(27)
}
else {
printHtmlPart(28)
expressionOut.print(fieldValue(bean: studentInstance, field: "registrationNo"))
printHtmlPart(29)
}
printHtmlPart(30)
expressionOut.print(fieldValue(bean: studentInstance, field: "studentName"))
printHtmlPart(31)
expressionOut.print(fieldValue(bean: studentInstance, field: "fatherDetails.parentName"))
printHtmlPart(32)
for( _it713961699 in (studentInstance?.academicyear) ) {
changeItVariable(_it713961699)
printHtmlPart(33)
if(true && (it.status == 'current')) {
printHtmlPart(33)
}
printHtmlPart(34)
}
printHtmlPart(11)
invokeTag('set','g',194,['value':(it?.presentclass),'var':("pclass")],-1)
printHtmlPart(34)
expressionOut.print(pclass.classname)
printHtmlPart(35)
for( _it835020577 in (studentInstance?.academicyear) ) {
changeItVariable(_it835020577)
printHtmlPart(33)
if(true && (it.status == 'current')) {
printHtmlPart(33)
}
printHtmlPart(34)
}
printHtmlPart(11)
invokeTag('set','g',199,['value':(it?.section),'var':("pclass")],-1)
printHtmlPart(34)
expressionOut.print(pclass.sectionName)
printHtmlPart(36)
expressionOut.print(fieldValue(bean: studentInstance, field: "category"))
printHtmlPart(37)
invokeTag('formatDate','g',205,['format':("dd-MMM-yyyy"),'date':(studentInstance.studentDOJ)],-1)
printHtmlPart(38)
i++
}
}
printHtmlPart(39)
invokeTag('render','g',262,['template':("/footer/footer")],-1)
printHtmlPart(40)
})
invokeTag('captureBody','sitemesh',300,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(41)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926011048L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
