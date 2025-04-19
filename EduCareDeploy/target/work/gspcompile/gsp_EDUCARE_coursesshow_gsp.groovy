import com.hiideals.instituite.classcourses.Courses
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_coursesshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/courses/show.gsp" }
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
createClosureForHtmlPart(10, 2)
invokeTag('link','g',91,['action':("index")],2)
printHtmlPart(11)
createClosureForHtmlPart(12, 2)
invokeTag('link','g',92,['action':("create")],2)
printHtmlPart(13)
invokeTag('message','g',109,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(14)
if(true && (flash.message)) {
printHtmlPart(15)
expressionOut.print(flash.message)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (coursesInstance?.courseDescription)) {
printHtmlPart(18)
invokeTag('message','g',117,['code':("courses.courseDescription.label"),'default':("Course Description")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',119,['bean':(coursesInstance),'field':("courseDescription")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (coursesInstance?.courseName)) {
printHtmlPart(22)
invokeTag('message','g',126,['code':("courses.courseName.label"),'default':("Course Name")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',128,['bean':(coursesInstance),'field':("courseName")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (coursesInstance?.instituite)) {
printHtmlPart(24)
invokeTag('message','g',135,['code':("courses.instituite.label"),'default':("Instituite")],-1)
printHtmlPart(25)
createTagBody(3, {->
expressionOut.print(coursesInstance?.instituite?.encodeAsHTML())
})
invokeTag('link','g',137,['controller':("instituite"),'action':("show"),'id':(coursesInstance?.instituite?.id)],3)
printHtmlPart(20)
}
printHtmlPart(26)
createTagBody(2, {->
printHtmlPart(27)
createTagBody(3, {->
invokeTag('message','g',145,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',145,['class':("edit"),'action':("edit"),'resource':(coursesInstance)],3)
printHtmlPart(28)
invokeTag('actionSubmit','g',146,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(29)
})
invokeTag('form','g',148,['url':([resource:coursesInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(30)
invokeTag('render','g',156,['template':("/footer/footer")],-1)
printHtmlPart(31)
})
invokeTag('captureBody','sitemesh',194,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(32)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925999356L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
