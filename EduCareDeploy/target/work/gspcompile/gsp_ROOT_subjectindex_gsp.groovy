import com.hiideals.instituite.classcourses.Subject
import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_subjectindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/subject/index.gsp" }
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
invokeTag('captureHead','sitemesh',50,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',57,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',60,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',69,['template':("/header/leftSide"),'model':([activ:[subject:'start active open',subjectList:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',83,['action':("create")],2)
printHtmlPart(11)
if(true && (flash.message)) {
printHtmlPart(12)
expressionOut.print(flash.message)
printHtmlPart(13)
}
printHtmlPart(14)
createTagBody(2, {->
printHtmlPart(15)
for( cls in (classList) ) {
printHtmlPart(16)
expressionOut.print(cls.id)
printHtmlPart(17)
expressionOut.print(cls.classname)
printHtmlPart(18)
}
printHtmlPart(19)
invokeTag('submitButton','g',143,['name':("Search"),'class':("btn blue"),'style':("margin-top: 22px")],-1)
printHtmlPart(20)
})
invokeTag('formRemote','g',148,['name':("ss"),'url':([action:'index']),'update':("body")],2)
printHtmlPart(21)
expressionOut.print(message(code: 'subject.subjectName.label', default: 'Subject'))
printHtmlPart(22)
expressionOut.print(message(code: 'subject.subjectDescription.label', default: 'Subject Description'))
printHtmlPart(23)
invokeTag('message','g',181,['code':("subject.iclass.classname.label"),'default':("Class ")],-1)
printHtmlPart(24)
loop:{
int i = 0
for( subjectInstance in (subjectInstanceList) ) {
printHtmlPart(25)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(26)
expressionOut.print(fieldValue(bean: subjectInstance, field: "subjectName"))
printHtmlPart(27)
expressionOut.print(fieldValue(bean: subjectInstance, field: "subjectDescription"))
printHtmlPart(28)
loop:{
int a = 0
for( className in (subjectInstance?.iclass) ) {
printHtmlPart(29)
expressionOut.print(fieldValue(bean: className, field: "classname"))
printHtmlPart(30)
a++
}
}
printHtmlPart(31)
createTagBody(3, {->
printHtmlPart(32)
createTagBody(4, {->
printHtmlPart(33)
invokeTag('message','g',218,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(34)
})
invokeTag('link','g',219,['action':("edit"),'id':(LookUpED.encod(subjectInstance.id))],4)
printHtmlPart(35)
})
invokeTag('form','g',222,['url':([resource:subjectInstance, action:'delete']),'method':("DELETE")],3)
printHtmlPart(36)
i++
}
}
printHtmlPart(37)
invokeTag('paginate','g',235,['total':(subjectInstanceCount ?: 0)],-1)
printHtmlPart(38)
invokeTag('render','g',246,['template':("/footer/footer")],-1)
printHtmlPart(39)
})
invokeTag('captureBody','sitemesh',300,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white"),'id':("body")],1)
printHtmlPart(40)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925997986L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
