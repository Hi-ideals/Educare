import com.hiideals.instituite.student.Student
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_studenttransferlist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/student/transferlist.gsp" }
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
createClosureForHtmlPart(2, 3)
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
invokeTag('captureHead','sitemesh',53,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',62,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',66,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',74,['template':("/header/leftSide")],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',86,['action':("create")],2)
printHtmlPart(11)
if(true && (flash.message)) {
printHtmlPart(12)
expressionOut.print(flash.message)
printHtmlPart(13)
}
printHtmlPart(14)
invokeTag('getImage','images',109,['id':(instituite?.logo?.id),'width':("100px"),'height':("100px")],-1)
printHtmlPart(15)
expressionOut.print(instituite?.name)
printHtmlPart(16)
expressionOut.print(instituite?.affiliatedTo)
printHtmlPart(17)
invokeTag('set','g',134,['var':("user"),'value':(sec.username())],-1)
printHtmlPart(18)
if(true && (user == "vidyashree")) {
printHtmlPart(19)
}
else {
printHtmlPart(20)
}
printHtmlPart(21)
for( T in (transer) ) {
printHtmlPart(22)
expressionOut.print(T.admissionnumber)
printHtmlPart(23)
expressionOut.print(T.stName)
printHtmlPart(23)
expressionOut.print(T.stfatherName)
printHtmlPart(23)
expressionOut.print(T.stClass)
printHtmlPart(23)
expressionOut.print(T.stSection)
printHtmlPart(23)
expressionOut.print(T.academicyear)
printHtmlPart(23)
expressionOut.print(T.stfeePaid)
printHtmlPart(23)
expressionOut.print(T.stadmissionDate)
printHtmlPart(23)
expressionOut.print(T.stTcissuedate)
printHtmlPart(24)
}
printHtmlPart(25)
invokeTag('paginate','g',182,['total':(studentInstanceCount ?: 0)],-1)
printHtmlPart(26)
invokeTag('render','g',193,['template':("/footer/footer")],-1)
printHtmlPart(27)
})
invokeTag('captureBody','sitemesh',231,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(28)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926000373L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
