import com.hiideals.instituite.classcourses.IClass
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_studentListindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/studentList/index.gsp" }
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
invokeTag('captureHead','sitemesh',64,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',70,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',73,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',83,['template':("/header/leftSide"),'model':([activ:[studentInfo:'start active open',studentList:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',95,['action':("create"),'controller':("student")],2)
printHtmlPart(11)
invokeTag('set','g',117,['var':("user"),'value':(sec.username())],-1)
printHtmlPart(12)
if(true && (user == "vidyashree")) {
printHtmlPart(13)
}
else {
printHtmlPart(14)
}
printHtmlPart(15)
createTagBody(2, {->
printHtmlPart(16)
for( batch in (batchList) ) {
printHtmlPart(17)
expressionOut.print(batch.batchName)
printHtmlPart(18)
expressionOut.print(batch.batchName)
printHtmlPart(19)
}
printHtmlPart(20)
invokeTag('submitButton','g',179,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(21)
})
invokeTag('formRemote','g',183,['name':("ss"),'url':([action:'aa']),'update':("Changedisplay")],2)
printHtmlPart(22)
createTagBody(2, {->
printHtmlPart(23)
for( cls in (studentInstanceList[0]?.instituite?.classes) ) {
printHtmlPart(17)
expressionOut.print(cls.id)
printHtmlPart(18)
expressionOut.print(cls.classname)
printHtmlPart(19)
}
printHtmlPart(24)
invokeTag('submitButton','g',216,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(21)
})
invokeTag('formRemote','g',220,['name':("ss"),'url':([action:'getByClass']),'update':("Changedisplay")],2)
printHtmlPart(25)
createTagBody(2, {->
printHtmlPart(26)
expressionOut.print(params.to)
printHtmlPart(27)
invokeTag('submitButton','g',240,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(21)
})
invokeTag('form','g',244,['name':("ss"),'url':([action:'index']),'update':("Changedisplay")],2)
printHtmlPart(28)
createTagBody(2, {->
printHtmlPart(29)
invokeTag('submitButton','g',262,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(21)
})
invokeTag('form','g',266,['name':("sscast"),'url':([action:'index']),'update':("Changedisplay")],2)
printHtmlPart(30)
createTagBody(2, {->
printHtmlPart(31)
for( cls in (studentInstanceList[0]?.instituite?.classes) ) {
printHtmlPart(17)
expressionOut.print(cls.id)
printHtmlPart(18)
expressionOut.print(cls.classname)
printHtmlPart(19)
}
printHtmlPart(32)
for( cls in (academicYearList) ) {
printHtmlPart(17)
expressionOut.print(cls.batchName)
printHtmlPart(18)
expressionOut.print(cls.batchName)
printHtmlPart(19)
}
printHtmlPart(33)
invokeTag('submitButton','g',306,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(34)
})
invokeTag('formRemote','g',309,['name':("kk"),'url':([action:'byYear']),'update':("Changedisplay")],2)
printHtmlPart(35)
createTagBody(2, {->
printHtmlPart(36)
invokeTag('submitButton','g',328,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(34)
})
invokeTag('formRemote','g',331,['name':("sst"),'url':([action:'byStudentId']),'update':("Changedisplay")],2)
printHtmlPart(37)
invokeTag('render','g',336,['template':("/student/studentlistable")],-1)
printHtmlPart(38)
invokeTag('render','g',341,['template':("/footer/footer")],-1)
printHtmlPart(39)
})
invokeTag('captureBody','sitemesh',492,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(40)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926019362L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
