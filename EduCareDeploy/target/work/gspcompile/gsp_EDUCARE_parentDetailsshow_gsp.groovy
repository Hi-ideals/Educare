import com.hiideals.instituite.student.ParentDetails
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_parentDetailsshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/parentDetails/show.gsp" }
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
invokeTag('message','g',108,['code':("default.home.label")],-1)
printHtmlPart(10)
createTagBody(2, {->
invokeTag('message','g',109,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',109,['class':("list"),'action':("index")],2)
printHtmlPart(11)
createTagBody(2, {->
invokeTag('message','g',110,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',110,['class':("create"),'action':("create")],2)
printHtmlPart(12)
invokeTag('message','g',114,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(13)
if(true && (flash.message)) {
printHtmlPart(14)
expressionOut.print(flash.message)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (parentDetailsInstance?.mobileNumber)) {
printHtmlPart(17)
invokeTag('message','g',122,['code':("parentDetails.mobileNumber.label"),'default':("Mobile Number")],-1)
printHtmlPart(18)
invokeTag('fieldValue','g',124,['bean':(parentDetailsInstance),'field':("mobileNumber")],-1)
printHtmlPart(19)
}
printHtmlPart(20)
if(true && (parentDetailsInstance?.occupation)) {
printHtmlPart(21)
invokeTag('message','g',131,['code':("parentDetails.occupation.label"),'default':("Occupation")],-1)
printHtmlPart(22)
invokeTag('fieldValue','g',133,['bean':(parentDetailsInstance),'field':("occupation")],-1)
printHtmlPart(19)
}
printHtmlPart(20)
if(true && (parentDetailsInstance?.parentName)) {
printHtmlPart(23)
invokeTag('message','g',140,['code':("parentDetails.parentName.label"),'default':("Parent Name")],-1)
printHtmlPart(24)
invokeTag('fieldValue','g',142,['bean':(parentDetailsInstance),'field':("parentName")],-1)
printHtmlPart(19)
}
printHtmlPart(20)
if(true && (parentDetailsInstance?.relation)) {
printHtmlPart(25)
invokeTag('message','g',149,['code':("parentDetails.relation.label"),'default':("Relation")],-1)
printHtmlPart(26)
invokeTag('fieldValue','g',151,['bean':(parentDetailsInstance),'field':("relation")],-1)
printHtmlPart(19)
}
printHtmlPart(20)
if(true && (parentDetailsInstance?.student)) {
printHtmlPart(27)
invokeTag('message','g',158,['code':("parentDetails.student.label"),'default':("Student")],-1)
printHtmlPart(28)
createTagBody(3, {->
expressionOut.print(parentDetailsInstance?.student?.encodeAsHTML())
})
invokeTag('link','g',160,['controller':("student"),'action':("show"),'id':(parentDetailsInstance?.student?.id)],3)
printHtmlPart(19)
}
printHtmlPart(29)
createTagBody(2, {->
printHtmlPart(30)
createTagBody(3, {->
invokeTag('message','g',168,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',168,['class':("edit"),'action':("edit"),'resource':(parentDetailsInstance)],3)
printHtmlPart(31)
invokeTag('actionSubmit','g',169,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(32)
})
invokeTag('form','g',171,['url':([resource:parentDetailsInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(33)
invokeTag('render','g',179,['template':("/footer/footer")],-1)
printHtmlPart(34)
})
invokeTag('captureBody','sitemesh',217,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(35)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926001208L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
