import com.hiideals.instituite.classcourses.IClass
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_libraryReportsindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/libraryReports/index.gsp" }
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
invokeTag('render','g',93,['template':("/header/leftSide"),'model':([activ:[libraryInfo:'start active open',studentList:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',109,['action':("create"),'controller':("student")],2)
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(12)
invokeTag('submitButton','g',155,['name':("Click To Get Available Books"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(13)
})
invokeTag('formRemote','g',158,['name':("ss"),'url':([action:'availableBooks']),'update':("Changedisplay")],2)
printHtmlPart(14)
createTagBody(2, {->
printHtmlPart(12)
invokeTag('submitButton','g',164,['name':("Click To Get Available NewsPapers"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(13)
})
invokeTag('formRemote','g',167,['name':("ss"),'url':([action:'availableNewsPapers']),'update':("Changedisplay")],2)
printHtmlPart(14)
createTagBody(2, {->
printHtmlPart(12)
invokeTag('submitButton','g',173,['name':("Click To Get Available Magazines"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(13)
})
invokeTag('formRemote','g',176,['name':("ss"),'url':([action:'availableMagazines']),'update':("Changedisplay")],2)
printHtmlPart(15)
createTagBody(2, {->
printHtmlPart(16)
expressionOut.print(params.to)
printHtmlPart(17)
invokeTag('submitButton','g',201,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(18)
})
invokeTag('formRemote','g',205,['name':("ss"),'url':([action:'getByIssuedDate']),'update':("Changedisplay")],2)
printHtmlPart(19)
createTagBody(2, {->
printHtmlPart(20)
expressionOut.print(params.to)
printHtmlPart(17)
invokeTag('submitButton','g',230,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(13)
})
invokeTag('formRemote','g',233,['name':("ss"),'url':([action:'getByReturnDate']),'update':("Changedisplay")],2)
printHtmlPart(21)
createTagBody(2, {->
printHtmlPart(22)
invokeTag('submitButton','g',252,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(18)
})
invokeTag('formRemote','g',256,['name':("sscast"),'url':([action:'studentWise']),'update':("Changedisplay")],2)
printHtmlPart(23)
createTagBody(2, {->
printHtmlPart(24)
invokeTag('submitButton','g',275,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(13)
})
invokeTag('formRemote','g',278,['name':("kk"),'url':([action:'staffWise']),'update':("Changedisplay")],2)
printHtmlPart(25)
invokeTag('render','g',292,['template':("/footer/footer")],-1)
printHtmlPart(26)
})
invokeTag('captureBody','sitemesh',457,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(27)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925999696L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
