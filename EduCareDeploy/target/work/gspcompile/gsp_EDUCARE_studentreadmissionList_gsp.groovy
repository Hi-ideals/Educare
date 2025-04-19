import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_studentreadmissionList_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/student/readmissionList.gsp" }
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
invokeTag('captureHead','sitemesh',68,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',77,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',81,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',92,['template':("/header/leftSide"),'model':([activ:[readminssion:'start active open',readminssion:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',108,['action':("create"),'controller':("student")],2)
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(12)
invokeTag('submitButton','g',155,['name':("Search"),'class':("btn blue"),'style':("margin-top: 22px")],-1)
printHtmlPart(13)
})
invokeTag('formRemote','g',159,['name':("ss"),'url':([action:'aa']),'update':("Changedisplay")],2)
printHtmlPart(14)
createTagBody(2, {->
printHtmlPart(15)
for( cls in (studentInstanceList[0]?.instituite?.classes) ) {
printHtmlPart(16)
expressionOut.print(cls.id)
printHtmlPart(17)
expressionOut.print(cls.classname)
printHtmlPart(18)
}
printHtmlPart(19)
invokeTag('submitButton','g',192,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(13)
})
invokeTag('formRemote','g',196,['name':("ss"),'url':([action:'getByClass']),'update':("Changedisplay")],2)
printHtmlPart(20)
createTagBody(2, {->
printHtmlPart(21)
expressionOut.print(params.to)
printHtmlPart(22)
invokeTag('submitButton','g',216,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(13)
})
invokeTag('formRemote','g',220,['name':("ss"),'url':([action:'index']),'update':("Changedisplay")],2)
printHtmlPart(23)
createTagBody(2, {->
printHtmlPart(24)
invokeTag('submitButton','g',238,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(13)
})
invokeTag('formRemote','g',242,['name':("sscast"),'url':([action:'index']),'update':("Changedisplay")],2)
printHtmlPart(25)
createTagBody(2, {->
printHtmlPart(26)
for( cls in (studentInstanceList[0]?.instituite?.classes) ) {
printHtmlPart(16)
expressionOut.print(cls.id)
printHtmlPart(17)
expressionOut.print(cls.classname)
printHtmlPart(18)
}
printHtmlPart(27)
for( cls in (academicYearList) ) {
printHtmlPart(16)
expressionOut.print(cls)
printHtmlPart(17)
expressionOut.print(cls)
printHtmlPart(18)
}
printHtmlPart(28)
invokeTag('submitButton','g',282,['name':("Search"),'class':("btn blue"),'style':("margin-top: 22px")],-1)
printHtmlPart(13)
})
invokeTag('formRemote','g',286,['name':("kk"),'url':([action:'byYear']),'update':("Changedisplay")],2)
printHtmlPart(29)
invokeTag('render','g',306,['template':("/footer/footer")],-1)
printHtmlPart(30)
})
invokeTag('captureBody','sitemesh',448,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(31)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926000670L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
