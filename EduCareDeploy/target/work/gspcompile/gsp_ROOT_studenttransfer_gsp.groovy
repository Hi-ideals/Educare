import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_studenttransfer_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/student/transfer.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',13,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',13,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',69,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',78,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',82,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',93,['template':("/header/leftSide"),'model':([activ:[studentInfo:'start active open',studentList:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',109,['action':("create"),'controller':("student")],2)
printHtmlPart(11)
if(true && (flash.msgtcfee)) {
printHtmlPart(12)
expressionOut.print(flash.msgtcfee)
printHtmlPart(13)
}
printHtmlPart(14)
printHtmlPart(1)
createTagBody(2, {->
printHtmlPart(15)
expressionOut.print(student.instituite?.name)
printHtmlPart(16)
expressionOut.print(student?.registrationNo)
printHtmlPart(17)
expressionOut.print(student?.studentName)
printHtmlPart(18)
invokeTag('formatDate','g',161,['format':("dd-MMM-yyyy"),'date':(student?.studentDOB)],-1)
printHtmlPart(19)
expressionOut.print(student?.motherDetails?.parentName)
printHtmlPart(20)
expressionOut.print(student?.fatherDetails?.parentName)
printHtmlPart(21)
expressionOut.print(student?.religion)
printHtmlPart(22)
expressionOut.print(student?.nationality)
printHtmlPart(23)
expressionOut.print(student?.gender)
printHtmlPart(24)
expressionOut.print(student?.category)
printHtmlPart(25)
for( _it343688483 in (student?.academicyear) ) {
changeItVariable(_it343688483)
printHtmlPart(1)
if(true && (it.status == 'current')) {
printHtmlPart(1)
}
printHtmlPart(1)
}
printHtmlPart(1)
invokeTag('set','g',202,['value':(it?.presentclass),'var':("pclass")],-1)
printHtmlPart(26)
expressionOut.print(pclass?.classname)
printHtmlPart(27)
for( _it1427580388 in (student?.academicyear) ) {
changeItVariable(_it1427580388)
printHtmlPart(1)
if(true && (it.status == 'current')) {
printHtmlPart(1)
}
printHtmlPart(1)
}
printHtmlPart(1)
invokeTag('set','g',214,['value':(it?.section),'var':("pclass")],-1)
printHtmlPart(26)
expressionOut.print(pclass?.sectionName)
printHtmlPart(28)
expressionOut.print(student?.studentId)
printHtmlPart(29)
for( _it1980588880 in (student.academicyear) ) {
changeItVariable(_it1980588880)
printHtmlPart(30)
if(true && (it.status == 'current')) {
printHtmlPart(30)
}
printHtmlPart(31)
}
printHtmlPart(32)
expressionOut.print(it.academicyear)
printHtmlPart(33)
expressionOut.print(it.academicyear)
printHtmlPart(34)
invokeTag('formatDate','g',244,['format':("yyyy-MM-dd"),'date':(student?.studentDOJ)],-1)
printHtmlPart(35)
invokeTag('hiddenField','g',297,['name':("id"),'value':(student.id)],-1)
printHtmlPart(36)
invokeTag('actionSubmit','g',304,['class':("btn blue"),'action':("printtransfercertificate"),'params':([id:student.id]),'value':("submit")],-1)
printHtmlPart(37)
})
invokeTag('form','g',305,['controller':("transfercertificate"),'target':("_blank")],2)
printHtmlPart(38)
invokeTag('render','g',315,['template':("/footer/footer")],-1)
printHtmlPart(39)
})
invokeTag('captureBody','sitemesh',433,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(40)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926000469L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
