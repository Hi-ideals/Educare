import com.hiideals.instituite.student.ParentDetails
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_parentDetailsindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/parentDetails/index.gsp" }
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
invokeTag('render','g',76,['template':("/header/leftSide")],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
invokeTag('message','g',109,['code':("default.home.label")],-1)
printHtmlPart(10)
createTagBody(2, {->
printHtmlPart(11)
invokeTag('message','g',111,['code':("default.new.label"),'args':([entityName])],-1)
printHtmlPart(12)
})
invokeTag('link','g',112,['class':("create"),'action':("create")],2)
printHtmlPart(13)
if(true && (flash.message)) {
printHtmlPart(14)
expressionOut.print(flash.message)
printHtmlPart(15)
}
printHtmlPart(16)
invokeTag('sortableColumn','g',136,['property':("mobileNumber"),'title':(message(code: 'parentDetails.mobileNumber.label', default: 'Mobile Number'))],-1)
printHtmlPart(17)
invokeTag('sortableColumn','g',139,['property':("occupation"),'title':(message(code: 'parentDetails.occupation.label', default: 'Occupation'))],-1)
printHtmlPart(17)
invokeTag('sortableColumn','g',142,['property':("parentName"),'title':(message(code: 'parentDetails.parentName.label', default: 'Parent Name'))],-1)
printHtmlPart(17)
invokeTag('sortableColumn','g',145,['property':("relation"),'title':(message(code: 'parentDetails.relation.label', default: 'Relation'))],-1)
printHtmlPart(18)
invokeTag('message','g',148,['code':("parentDetails.student.label"),'default':("Student")],-1)
printHtmlPart(19)
loop:{
int i = 0
for( parentDetailsInstance in (parentDetailsInstanceList) ) {
printHtmlPart(20)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(21)
createTagBody(3, {->
printHtmlPart(22)
expressionOut.print(fieldValue(bean: parentDetailsInstance, field: "mobileNumber"))
printHtmlPart(23)
})
invokeTag('link','g',160,['action':("show"),'id':(parentDetailsInstance.id)],3)
printHtmlPart(24)
expressionOut.print(fieldValue(bean: parentDetailsInstance, field: "occupation"))
printHtmlPart(25)
expressionOut.print(fieldValue(bean: parentDetailsInstance, field: "parentName"))
printHtmlPart(25)
expressionOut.print(fieldValue(bean: parentDetailsInstance, field: "relation"))
printHtmlPart(25)
expressionOut.print(fieldValue(bean: parentDetailsInstance, field: "student"))
printHtmlPart(26)
i++
}
}
printHtmlPart(27)
invokeTag('paginate','g',188,['total':(parentDetailsInstanceCount ?: 0)],-1)
printHtmlPart(28)
invokeTag('render','g',198,['template':("/footer/footer")],-1)
printHtmlPart(29)
})
invokeTag('captureBody','sitemesh',236,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(30)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926001172L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
