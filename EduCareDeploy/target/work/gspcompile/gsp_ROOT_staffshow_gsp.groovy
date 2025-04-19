import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.institute.staff.Staff
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_staffshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/staff/show.gsp" }
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
invokeTag('captureHead','sitemesh',48,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',57,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',61,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',72,['template':("/header/leftSide"),'model':([activ:[staff:'start active open',staffList:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',84,['action':("index")],2)
printHtmlPart(11)
if(true && (staffInstance?.institute)) {
printHtmlPart(12)
invokeTag('message','g',100,['code':("staff.institute.label"),'default':("Institute")],-1)
printHtmlPart(13)
expressionOut.print(staffInstance?.institute?.name)
printHtmlPart(14)
}
printHtmlPart(15)
if(true && (staffInstance?.address)) {
printHtmlPart(16)
invokeTag('message','g',111,['code':("staff.address.label"),'default':("Address")],-1)
printHtmlPart(17)
expressionOut.print(staffInstance?.address?.hsno)
printHtmlPart(18)
expressionOut.print(staffInstance?.address?.street)
printHtmlPart(19)
expressionOut.print(staffInstance?.address?.city)
printHtmlPart(20)
expressionOut.print(staffInstance?.address?.state)
printHtmlPart(21)
expressionOut.print(staffInstance?.address?.country)
printHtmlPart(14)
}
printHtmlPart(22)
if(true && (staffInstance?.teachingSubject)) {
printHtmlPart(23)
invokeTag('message','g',126,['code':("staff.teachingSubject.label"),'default':("TeachingSubject")],-1)
printHtmlPart(24)
expressionOut.print(staffInstance?.teachingSubject?.subjectName)
printHtmlPart(25)
}
printHtmlPart(22)
if(true && (staffInstance?.qualification)) {
printHtmlPart(26)
invokeTag('message','g',138,['code':("staff.qualification.label"),'default':("Qualification")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',142,['bean':(staffInstance),'field':("qualification")],-1)
printHtmlPart(28)
}
printHtmlPart(15)
if(true && (staffInstance?.staffID)) {
printHtmlPart(29)
invokeTag('message','g',150,['code':("staff.staffID.label"),'default':("Staff ID")],-1)
printHtmlPart(30)
invokeTag('fieldValue','g',155,['bean':(staffInstance),'field':("staffID")],-1)
printHtmlPart(28)
}
printHtmlPart(22)
if(true && (staffInstance?.staffName)) {
printHtmlPart(31)
invokeTag('message','g',163,['code':("staff.staffName.label"),'default':("Staff Name")],-1)
printHtmlPart(32)
invokeTag('fieldValue','g',167,['bean':(staffInstance),'field':("staffName")],-1)
printHtmlPart(28)
}
printHtmlPart(33)
createTagBody(2, {->
printHtmlPart(34)
createTagBody(3, {->
printHtmlPart(35)
invokeTag('message','g',177,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(18)
})
invokeTag('link','g',177,['class':("btn yellow"),'action':("edit"),'id':(LookUpED.encod(staffInstance.id))],3)
printHtmlPart(18)
invokeTag('actionSubmit','g',186,['class':(" btn red"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(36)
})
invokeTag('form','g',188,['url':([resource:staffInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(37)
invokeTag('render','g',191,['template':("/footer/footer")],-1)
printHtmlPart(38)
})
invokeTag('captureBody','sitemesh',225,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(39)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926002622L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
