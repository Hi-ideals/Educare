import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_IClassindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/IClass/index.gsp" }
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
invokeTag('render','g',78,['template':("/header/leftSide"),'model':([activ:[Settings:'start active open',IClassList:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',97,['action':("create")],2)
printHtmlPart(11)
if(true && (flash.msg)) {
printHtmlPart(12)
expressionOut.print(flash.msg)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (flash.message)) {
printHtmlPart(15)
expressionOut.print(flash.message)
printHtmlPart(16)
}
printHtmlPart(17)
expressionOut.print(message(code: 'IClass.classID.label', default: 'Class ID'))
printHtmlPart(18)
expressionOut.print(message(code: 'IClass.classname.label', default: 'Classname'))
printHtmlPart(18)
expressionOut.print(message(code: 'IClass.classname.label', default: 'Class Section'))
printHtmlPart(18)
expressionOut.print(message(code: 'IClass.classStrength.label', default: 'Class Strength'))
printHtmlPart(18)
expressionOut.print(message(code: 'IClass.classTeacherName.label', default: 'Class Teacher Name'))
printHtmlPart(19)
loop:{
int i = 0
for( IClassInstance in (IClassInstanceList) ) {
printHtmlPart(20)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(21)
expressionOut.print(fieldValue(bean: IClassInstance, field: "classID"))
printHtmlPart(22)
expressionOut.print(fieldValue(bean: IClassInstance, field: "classname"))
printHtmlPart(23)
loop:{
int a = 0
for( sName in (IClassInstance?.sections) ) {
printHtmlPart(24)
expressionOut.print(fieldValue(bean: sName, field: "sectionName"))
printHtmlPart(25)
a++
}
}
printHtmlPart(26)
loop:{
int a = 0
for( sName in (IClassInstance?.sections) ) {
printHtmlPart(24)
expressionOut.print(fieldValue(bean: sName, field: "sectionStrength"))
printHtmlPart(25)
a++
}
}
printHtmlPart(27)
loop:{
int a = 0
for( sName in (IClassInstance?.sections) ) {
printHtmlPart(24)
expressionOut.print(fieldValue(bean: sName, field: "sectionClassTeacher"))
printHtmlPart(25)
a++
}
}
printHtmlPart(27)
createTagBody(3, {->
printHtmlPart(28)
createTagBody(4, {->
printHtmlPart(29)
invokeTag('message','g',208,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(30)
})
invokeTag('link','g',209,['class':("edit"),'action':("edit"),'id':(LookUpED.encod(IClassInstance.id))],4)
printHtmlPart(31)
invokeTag('actionSubmit','g',212,['style':("background:none;border:none;color:red"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(32)
})
invokeTag('form','g',214,['url':([resource:IClassInstance, action:'delete']),'method':("DELETE")],3)
printHtmlPart(33)
i++
}
}
printHtmlPart(34)
invokeTag('paginate','g',227,['total':(IClassInstanceCount ?: 0)],-1)
printHtmlPart(35)
invokeTag('render','g',239,['template':("/footer/footer")],-1)
printHtmlPart(36)
})
invokeTag('captureBody','sitemesh',273,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(37)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926006067L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
