import com.hiideals.instituite.student.Student
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_studentfeeinstallmentdetails_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/student/feeinstallmentdetails.gsp" }
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
invokeTag('getImage','images',110,['id':(instituite?.logo?.id),'width':("60px"),'height':("60px")],-1)
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
if(true && (studentInstance?.profilePic !=null)) {
printHtmlPart(16)
invokeTag('getImage','images',129,['id':(studentInstance?.profilePic?.id),'width':("180px"),'height':("180px"),'class':("img-responsive")],-1)
printHtmlPart(17)
}
else {
printHtmlPart(18)
}
printHtmlPart(19)
expressionOut.print(studentInstance?.studentName)
printHtmlPart(20)
expressionOut.print(studentInstance?.lastName)
printHtmlPart(21)
expressionOut.print(studentInstance?.fatherDetails?.parentName)
printHtmlPart(22)
expressionOut.print(studentInstance?.registrationNo)
printHtmlPart(23)
for( _it309534943 in (studentInstance?.academicyear) ) {
changeItVariable(_it309534943)
printHtmlPart(13)
if(true && (it.status == 'current')) {
printHtmlPart(13)
}
printHtmlPart(20)
}
printHtmlPart(20)
invokeTag('set','g',167,['value':(it?.presentclass),'var':("pclass")],-1)
printHtmlPart(24)
expressionOut.print(pclass.classname)
printHtmlPart(25)
expressionOut.print(studentInstance?.presentAddress?.hsno)
printHtmlPart(20)
expressionOut.print(studentInstance?.presentAddress?.street)
printHtmlPart(26)
expressionOut.print(studentInstance?.presentAddress?.city)
printHtmlPart(27)
expressionOut.print(studentInstance?.presentAddress?.pinCode)
printHtmlPart(28)
expressionOut.print(studentInstance?.presentAddress?.state)
printHtmlPart(29)
expressionOut.print(studentInstance?.presentAddress?.country)
printHtmlPart(30)
loop:{
int k = 0
for( tr in (tracker) ) {
printHtmlPart(31)
expressionOut.print(tr.instalment)
printHtmlPart(32)
expressionOut.print(tr?.invoiceNo)
printHtmlPart(33)
expressionOut.print(tr.paymentType)
printHtmlPart(34)
if(true && (tr.paymentType=='CHECK' || tr.paymentType=='DD')) {
printHtmlPart(35)
expressionOut.print(tr?.paymentType)
printHtmlPart(36)
expressionOut.print(tr?.ddNumber)
printHtmlPart(37)
expressionOut.print(tr?.accNo)
printHtmlPart(38)
expressionOut.print(tr?.ddNumber)
printHtmlPart(39)
expressionOut.print(tr?.ddNumber)
printHtmlPart(40)
expressionOut.print(tr?.ddNumber)
printHtmlPart(41)
}
else {
printHtmlPart(42)
}
printHtmlPart(43)
invokeTag('formatDate','g',226,['format':("dd-MMM-yyyy"),'date':(tr.dateCreated)],-1)
printHtmlPart(33)
expressionOut.print(totalMap.get(tr))
printHtmlPart(44)
k++
}
}
printHtmlPart(45)
invokeTag('render','g',286,['template':("/footer/footer")],-1)
printHtmlPart(46)
})
invokeTag('captureBody','sitemesh',324,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(47)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926000393L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
