import com.hiideals.instituite.student.Student
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_studentstudentIdss_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/student/studentIdss.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',203,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
if(true && (student)) {
printHtmlPart(5)
for( _it826733527 in (student) ) {
changeItVariable(_it826733527)
printHtmlPart(6)
if(true && (student?.profilePic !=null)) {
printHtmlPart(7)
invokeTag('getImage','images',224,['id':(instituite?.logo?.id),'width':(" 40"),'height':("40")],-1)
printHtmlPart(8)
}
else {
printHtmlPart(9)
}
printHtmlPart(10)
expressionOut.print(instituite?.name)
printHtmlPart(11)
expressionOut.print(instituite?.hsno)
printHtmlPart(12)
expressionOut.print(instituite?.street)
printHtmlPart(12)
expressionOut.print(instituite?.city)
printHtmlPart(13)
expressionOut.print(instituite?.pinCode)
printHtmlPart(12)
expressionOut.print(instituite?.state)
printHtmlPart(12)
expressionOut.print(instituite?.country)
printHtmlPart(14)
expressionOut.print(instituite?.phone)
printHtmlPart(15)
invokeTag('getImage','images',255,['id':(student?.profilePic?.id),'width':(" 100"),'height':("100")],-1)
printHtmlPart(16)
expressionOut.print(student?.studentId)
printHtmlPart(17)
expressionOut.print(student?.studentName)
printHtmlPart(18)
expressionOut.print(student?.lastName)
printHtmlPart(19)
expressionOut.print(student?.fatherDetails?.parentName)
printHtmlPart(20)
invokeTag('formatDate','g',281,['date':(student?.studentDOB),'format':("dd-MMM-yyyy")],-1)
printHtmlPart(21)
for( _it69338216 in (student?.academicyear) ) {
changeItVariable(_it69338216)
printHtmlPart(22)
if(true && (it.status == 'current')) {
printHtmlPart(22)
}
printHtmlPart(23)
}
printHtmlPart(18)
invokeTag('set','g',288,['value':(it?.presentclass),'var':("pclass")],-1)
printHtmlPart(24)
expressionOut.print(pclass.classname)
printHtmlPart(25)
for( _it1920885229 in (student?.academicyear) ) {
changeItVariable(_it1920885229)
printHtmlPart(22)
if(true && (it.status == 'current')) {
printHtmlPart(22)
}
printHtmlPart(23)
}
printHtmlPart(18)
invokeTag('set','g',297,['value':(it?.section),'var':("pclass")],-1)
printHtmlPart(24)
expressionOut.print(pclass.sectionName)
printHtmlPart(26)
expressionOut.print(student?.stsSystem)
printHtmlPart(27)
for( _it1039565260 in (student?.academicyear) ) {
changeItVariable(_it1039565260)
printHtmlPart(12)
if(true && (it.status == 'current')) {
printHtmlPart(12)
}
printHtmlPart(28)
}
printHtmlPart(29)
expressionOut.print(it?.academicyear)
printHtmlPart(30)
expressionOut.print(student?.bloodgroup)
printHtmlPart(31)
invokeTag('getImage','images',339,['id':(instituite?.signature?.id),'width':("40px"),'height':("30px")],-1)
printHtmlPart(32)
}
printHtmlPart(33)
}
else if(true && (studentList)) {
printHtmlPart(5)
for( p in (studentList) ) {
printHtmlPart(34)
if(true && (p?.profilePic !=null)) {
printHtmlPart(7)
invokeTag('getImage','images',363,['id':(instituite?.logo?.id),'width':(" 40"),'height':("40")],-1)
printHtmlPart(35)
}
else {
printHtmlPart(36)
}
printHtmlPart(10)
expressionOut.print(instituite?.name)
printHtmlPart(11)
expressionOut.print(instituite?.hsno)
printHtmlPart(12)
expressionOut.print(instituite?.street)
printHtmlPart(12)
expressionOut.print(instituite?.city)
printHtmlPart(13)
expressionOut.print(instituite?.pinCode)
printHtmlPart(12)
expressionOut.print(instituite?.state)
printHtmlPart(12)
expressionOut.print(instituite?.country)
printHtmlPart(14)
expressionOut.print(instituite?.phone)
printHtmlPart(15)
invokeTag('getImage','images',396,['id':(p?.profilePic?.id),'width':(" 100"),'height':("100")],-1)
printHtmlPart(16)
expressionOut.print(p?.studentId)
printHtmlPart(17)
expressionOut.print(p?.studentName)
printHtmlPart(18)
expressionOut.print(p?.lastName)
printHtmlPart(37)
expressionOut.print(p?.fatherDetails?.parentName)
printHtmlPart(20)
invokeTag('formatDate','g',422,['date':(p?.studentDOB),'format':("dd-MMM-yyyy")],-1)
printHtmlPart(21)
for( _it1000871406 in (p?.academicyear) ) {
changeItVariable(_it1000871406)
printHtmlPart(22)
if(true && (it.status == 'current')) {
printHtmlPart(22)
}
printHtmlPart(23)
}
printHtmlPart(18)
invokeTag('set','g',429,['value':(it?.presentclass),'var':("pclass")],-1)
printHtmlPart(24)
expressionOut.print(pclass.classname)
printHtmlPart(25)
for( _it800933815 in (p?.academicyear) ) {
changeItVariable(_it800933815)
printHtmlPart(22)
if(true && (it.status == 'current')) {
printHtmlPart(22)
}
printHtmlPart(23)
}
printHtmlPart(18)
invokeTag('set','g',438,['value':(it?.section),'var':("pclass")],-1)
printHtmlPart(24)
expressionOut.print(pclass.sectionName)
printHtmlPart(38)
expressionOut.print(p?.stsSystem)
printHtmlPart(27)
for( _it785197732 in (p?.academicyear) ) {
changeItVariable(_it785197732)
printHtmlPart(12)
if(true && (it.status == 'current')) {
printHtmlPart(12)
}
printHtmlPart(28)
}
printHtmlPart(39)
expressionOut.print(it?.academicyear)
printHtmlPart(40)
expressionOut.print(p?.bloodgroup)
printHtmlPart(41)
invokeTag('getImage','images',480,['id':(instituite?.signature?.id),'width':("40px"),'height':("30px")],-1)
printHtmlPart(42)
}
printHtmlPart(33)
}
printHtmlPart(43)
})
invokeTag('captureBody','sitemesh',503,[:],1)
printHtmlPart(44)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926000675L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
