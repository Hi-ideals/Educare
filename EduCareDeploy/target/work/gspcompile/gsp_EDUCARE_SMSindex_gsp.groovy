import com.hiideals.instituite.classcourses.IClass
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_SMSindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/SMS/index.gsp" }
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
invokeTag('captureHead','sitemesh',67,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',76,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',80,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',91,['template':("/header/leftSide"),'model':([activ:[studentInfo:'start active open',studentList:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',107,['action':("create"),'controller':("student")],2)
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(12)
for( staff in (staffs) ) {
printHtmlPart(13)
expressionOut.print(staff?.id)
printHtmlPart(14)
expressionOut.print(staff?.staffName)
printHtmlPart(15)
}
printHtmlPart(16)
for( cls in (classes) ) {
printHtmlPart(13)
expressionOut.print(cls?.id)
printHtmlPart(14)
expressionOut.print(cls?.classname)
printHtmlPart(15)
}
printHtmlPart(17)
for( student in (students) ) {
printHtmlPart(13)
expressionOut.print(student?.id)
printHtmlPart(14)
expressionOut.print(student?.studentName)
printHtmlPart(15)
}
printHtmlPart(18)
invokeTag('submitButton','g',174,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(19)
})
invokeTag('formRemote','g',177,['name':("ssone"),'url':([action:'getStaffsAndStudents']),'update':("Changedisplay")],2)
printHtmlPart(20)
if(true && (params.student)) {
printHtmlPart(21)
invokeTag('render','g',184,['template':("listofstudenttable")],-1)
printHtmlPart(22)
}
printHtmlPart(22)
if(true && (params.staff)) {
printHtmlPart(21)
invokeTag('render','g',187,['template':("listofstafftable")],-1)
printHtmlPart(22)
}
printHtmlPart(23)
invokeTag('render','g',198,['template':("/footer/footer")],-1)
printHtmlPart(24)
})
invokeTag('captureBody','sitemesh',256,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(25)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926002163L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
