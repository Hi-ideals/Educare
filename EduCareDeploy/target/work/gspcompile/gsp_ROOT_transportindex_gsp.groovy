import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_transportindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/transport/index.gsp" }
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
invokeTag('captureHead','sitemesh',54,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',63,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',67,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',78,['template':("/header/leftSide"),'model':([activ:[TransportManagement:'start active open',Transport:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
invokeTag('message','g',91,['code':("default.home.label")],-1)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',93,['class':("create"),'action':("create")],2)
printHtmlPart(12)
if(true && (flash.message)) {
printHtmlPart(13)
expressionOut.print(flash.message)
printHtmlPart(14)
}
printHtmlPart(15)
loop:{
int i = 0
for( transportInstance in (transportInstanceList) ) {
printHtmlPart(16)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(17)
expressionOut.print(fieldValue(bean: transportInstance, field: "route.routeCode"))
printHtmlPart(18)
expressionOut.print(transportInstance?.destination?.fromPlace)
printHtmlPart(19)
expressionOut.print(transportInstance?.destination?.toPlace)
printHtmlPart(20)
expressionOut.print(fieldValue(bean: transportInstance, field: "type"))
printHtmlPart(21)
invokeTag('formatDate','g',148,['format':("dd-MMM-yyyy"),'date':(transportInstance.startDate)],-1)
printHtmlPart(22)
invokeTag('formatDate','g',152,['format':("dd-MMM-yyyy"),'date':(transportInstance.endDate)],-1)
printHtmlPart(23)
expressionOut.print(fieldValue(bean: transportInstance, field: "student.studentName"))
printHtmlPart(24)
expressionOut.print(fieldValue(bean: transportInstance, field: "employee.staffName"))
printHtmlPart(25)
createClosureForHtmlPart(26, 3)
invokeTag('link','g',165,['action':("show"),'id':(LookUpED.encod(transportInstance.id))],3)
printHtmlPart(27)
createTagBody(3, {->
printHtmlPart(28)
createTagBody(4, {->
printHtmlPart(29)
invokeTag('message','g',175,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(30)
})
invokeTag('link','g',176,['action':("edit"),'id':(LookUpED.encod(transportInstance.id))],4)
printHtmlPart(30)
invokeTag('actionSubmit','g',181,['style':("background:none;border:none;color:red"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(31)
})
invokeTag('form','g',183,['url':([resource:transportInstance, action:'delete']),'method':("DELETE")],3)
printHtmlPart(32)
i++
}
}
printHtmlPart(33)
invokeTag('paginate','g',197,['total':(transportInstanceCount ?: 0)],-1)
printHtmlPart(34)
invokeTag('render','g',209,['template':("/footer/footer")],-1)
printHtmlPart(35)
})
invokeTag('captureBody','sitemesh',243,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(36)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926012514L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
