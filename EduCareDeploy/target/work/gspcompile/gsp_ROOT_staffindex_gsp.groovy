import com.hiideals.institute.staff.Staff
import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.instituite.helper.Batch
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_staffindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/staff/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',16,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',16,[:],2)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',18,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',19,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',20,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',51,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',58,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',61,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',70,['template':("/header/leftSide"),'model':([activ:[staff:'start active open',staffList:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',85,['action':("create")],2)
printHtmlPart(11)
if(true && (flash.message)) {
printHtmlPart(12)
expressionOut.print(flash.message)
printHtmlPart(13)
}
printHtmlPart(14)
createTagBody(2, {->
printHtmlPart(15)
for( sub in (subjectList) ) {
printHtmlPart(16)
expressionOut.print(sub.id)
printHtmlPart(17)
expressionOut.print(sub.subjectName)
printHtmlPart(18)
}
printHtmlPart(19)
invokeTag('submitButton','g',143,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(20)
for( cls in (classList) ) {
printHtmlPart(16)
expressionOut.print(cls.id)
printHtmlPart(17)
expressionOut.print(cls.classname)
printHtmlPart(18)
}
printHtmlPart(21)
invokeTag('submitButton','g',170,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(22)
})
invokeTag('formRemote','g',171,['name':("ss"),'url':([action:'index']),'update':("body")],2)
printHtmlPart(23)
expressionOut.print(message(code: 'staff.staffName.label', default: 'Staff Name'))
printHtmlPart(24)
expressionOut.print(message(code: 'staff.qualification.label', default: 'Qualification'))
printHtmlPart(24)
expressionOut.print(message(code: 'staff.staffID.label', default: 'Staff ID'))
printHtmlPart(25)
invokeTag('message','g',207,['code':("staff.teachingSubject.label"),'default':("Teaching Subject")],-1)
printHtmlPart(26)
loop:{
int i = 0
for( staffInstance in (staffInstanceList) ) {
printHtmlPart(27)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(28)
expressionOut.print(fieldValue(bean: staffInstance, field: "staffName"))
printHtmlPart(29)
expressionOut.print(fieldValue(bean: staffInstance, field: "qualification"))
printHtmlPart(29)
expressionOut.print(fieldValue(bean: staffInstance, field: "staffID"))
printHtmlPart(29)
expressionOut.print(fieldValue(bean: staffInstance.teachingSubject, field: "subjectName"))
printHtmlPart(30)
createTagBody(3, {->
printHtmlPart(31)
createTagBody(4, {->
printHtmlPart(32)
invokeTag('message','g',246,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(33)
})
invokeTag('link','g',246,['action':("edit"),'id':(LookUpED.encod(staffInstance.id))],4)
printHtmlPart(34)
createClosureForHtmlPart(35, 4)
invokeTag('link','g',252,['action':("show"),'id':(LookUpED.encod(staffInstance.id))],4)
printHtmlPart(36)
})
invokeTag('form','g',254,['url':([resource:staffInstance, action:'delete']),'method':("DELETE")],3)
printHtmlPart(37)
i++
}
}
printHtmlPart(38)
invokeTag('paginate','g',261,['total':(staffInstanceCount ?: 0)],-1)
printHtmlPart(39)
invokeTag('render','g',264,['template':("/footer/footer")],-1)
printHtmlPart(40)
})
invokeTag('captureBody','sitemesh',316,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white"),'id':("body")],1)
printHtmlPart(41)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926002984L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
