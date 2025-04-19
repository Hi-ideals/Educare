import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_IClassshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/IClass/show.gsp" }
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
invokeTag('render','g',77,['template':("/header/leftSide")],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',93,['action':("index")],2)
printHtmlPart(11)
createClosureForHtmlPart(12, 2)
invokeTag('link','g',96,['action':("create")],2)
printHtmlPart(13)
invokeTag('message','g',114,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(14)
if(true && (flash.message)) {
printHtmlPart(15)
expressionOut.print(flash.message)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (IClassInstance?.classStrength)) {
printHtmlPart(18)
invokeTag('message','g',126,['code':("IClass.classStrength.label"),'default':("Class Strength")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',130,['bean':(IClassInstance),'field':("classStrength")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (IClassInstance?.classTeacherName)) {
printHtmlPart(22)
invokeTag('message','g',137,['code':("IClass.classTeacherName.label"),'default':("Class Teacher Name")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',140,['bean':(IClassInstance),'field':("classTeacherName")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (IClassInstance?.sections)) {
printHtmlPart(24)
invokeTag('message','g',146,['code':("IClass.sections.label"),'default':("Sections")],-1)
printHtmlPart(25)
for( s in (IClassInstance.sections) ) {
printHtmlPart(26)
createTagBody(4, {->
printHtmlPart(27)
expressionOut.print(s?.encodeAsHTML())
printHtmlPart(28)
})
invokeTag('link','g',151,['controller':("section"),'action':("show"),'id':(s.id)],4)
printHtmlPart(29)
}
printHtmlPart(30)
}
printHtmlPart(21)
if(true && (IClassInstance?.classID)) {
printHtmlPart(31)
invokeTag('message','g',158,['code':("IClass.classID.label"),'default':("Class ID")],-1)
printHtmlPart(32)
invokeTag('fieldValue','g',160,['bean':(IClassInstance),'field':("classID")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (IClassInstance?.classname)) {
printHtmlPart(33)
invokeTag('message','g',166,['code':("IClass.classname.label"),'default':("Classname")],-1)
printHtmlPart(34)
invokeTag('fieldValue','g',168,['bean':(IClassInstance),'field':("classname")],-1)
printHtmlPart(20)
}
printHtmlPart(35)
createTagBody(2, {->
printHtmlPart(36)
createTagBody(3, {->
printHtmlPart(37)
invokeTag('message','g',177,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(38)
})
invokeTag('link','g',178,['class':("edit"),'action':("edit"),'id':(LookUpED.encod(IClassInstance.id))],3)
printHtmlPart(38)
invokeTag('actionSubmit','g',181,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(39)
})
invokeTag('form','g',183,['url':([resource:IClassInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(40)
invokeTag('render','g',191,['template':("/footer/footer")],-1)
printHtmlPart(41)
})
invokeTag('captureBody','sitemesh',229,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(42)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926005976L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
