import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_destinationDetailsindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/destinationDetails/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',15,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',15,[:],2)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',18,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',19,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',47,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('render','g',52,['template':("/header/logo")],-1)
printHtmlPart(5)
invokeTag('render','g',55,['template':("/header/topBar")],-1)
printHtmlPart(6)
invokeTag('render','g',63,['template':("/header/leftSide"),'model':([activ:[TransportManagement:'start active open',DestinationDetails:'active']])],-1)
printHtmlPart(7)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(8)
invokeTag('message','g',77,['code':("default.home.label")],-1)
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',79,['class':("create"),'action':("create")],2)
printHtmlPart(11)
if(true && (flash.message)) {
printHtmlPart(12)
expressionOut.print(flash.message)
printHtmlPart(13)
}
printHtmlPart(14)
loop:{
int i = 0
for( destinationDetailsInstance in (destinationDetailsInstanceList) ) {
printHtmlPart(15)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(16)
expressionOut.print(fieldValue(bean: destinationDetailsInstance, field: "route.routeCode"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: destinationDetailsInstance, field: "fromPlace"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: destinationDetailsInstance, field: "toPlace"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: destinationDetailsInstance, field: "amount"))
printHtmlPart(19)
createClosureForHtmlPart(20, 3)
invokeTag('link','g',142,['action':("show"),'id':(LookUpED.encod(destinationDetailsInstance.id))],3)
printHtmlPart(21)
createTagBody(3, {->
printHtmlPart(22)
createTagBody(4, {->
printHtmlPart(23)
invokeTag('message','g',151,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(24)
})
invokeTag('link','g',152,['action':("edit"),'id':(LookUpED.encod(destinationDetailsInstance.id))],4)
printHtmlPart(25)
})
invokeTag('form','g',154,['url':([resource:destinationDetailsInstance, action:'delete']),'method':("DELETE")],3)
printHtmlPart(26)
i++
}
}
printHtmlPart(27)
invokeTag('paginate','g',160,['total':(destinationDetailsInstanceCount ?: 0)],-1)
printHtmlPart(28)
invokeTag('render','g',169,['template':("/footer/footer")],-1)
printHtmlPart(29)
})
invokeTag('captureBody','sitemesh',205,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(30)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925992816L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
