import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_listofFeesviewfeedetail_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/listofFees/viewfeedetail.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',12,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',12,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',66,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',75,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',79,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',90,['template':("/header/leftSide"),'model':([activ:[studentInfo:'start active open',studentList:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',106,['action':("create"),'controller':("student")],2)
printHtmlPart(11)
invokeTag('getImage','images',124,['id':(instituite?.logo?.id),'width':("100px"),'height':("100px")],-1)
printHtmlPart(12)
expressionOut.print(instituite?.caption)
printHtmlPart(13)
expressionOut.print(instituite?.name)
printHtmlPart(14)
expressionOut.print(instituite?.affiliatedTo)
printHtmlPart(15)
loop:{
int k = 0
for( tmptracker in (temptracker?.feetypetracker) ) {
printHtmlPart(16)
expressionOut.print(k)
printHtmlPart(17)
expressionOut.print(params.studentName)
printHtmlPart(18)
expressionOut.print(tmptracker?.instFeeTypeT)
printHtmlPart(17)
expressionOut.print(tmptracker?.amountToBePaidT)
printHtmlPart(17)
expressionOut.print(tmptracker?.amountPaidT)
printHtmlPart(17)
expressionOut.print(tmptracker?.dueT)
printHtmlPart(19)
k++
}
}
printHtmlPart(20)
invokeTag('render','g',198,['template':("/footer/footer")],-1)
printHtmlPart(21)
})
invokeTag('captureBody','sitemesh',244,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925993879L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
