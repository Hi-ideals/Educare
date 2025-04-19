import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.instituite.timetable.Period_Timings
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_period_Timingsindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/period_Timings/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',46,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',55,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',59,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',70,['template':("/header/leftSide"),'model':([activ:[tt:'start active open',ptList:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
invokeTag('message','g',87,['code':("default.home.label")],-1)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',89,['class':("create"),'action':("create")],2)
printHtmlPart(12)
if(true && (flash.message)) {
printHtmlPart(13)
expressionOut.print(flash.message)
printHtmlPart(14)
}
printHtmlPart(15)
loop:{
int i = 0
for( period_TimingsInstance in (period_TimingsInstanceList) ) {
printHtmlPart(16)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(17)
expressionOut.print(fieldValue(bean: period_TimingsInstance, field: "periodName"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: period_TimingsInstance, field: "from_H"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: period_TimingsInstance, field: "from_M"))
printHtmlPart(20)
expressionOut.print(fieldValue(bean: period_TimingsInstance, field: "to_H"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: period_TimingsInstance, field: "to_M"))
printHtmlPart(21)
createClosureForHtmlPart(22, 3)
invokeTag('link','g',142,['action':("show"),'id':(LookUpED.encod(period_TimingsInstance.id))],3)
printHtmlPart(23)
i++
}
}
printHtmlPart(24)
invokeTag('paginate','g',154,['total':(period_TimingsInstanceCount ?: 0)],-1)
printHtmlPart(25)
invokeTag('render','g',165,['template':("/footer/footer")],-1)
printHtmlPart(26)
})
invokeTag('captureBody','sitemesh',199,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(27)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926016756L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
