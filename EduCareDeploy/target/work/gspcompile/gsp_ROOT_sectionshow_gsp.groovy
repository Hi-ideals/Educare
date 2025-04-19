import com.hiideals.instituite.classcourses.Section
import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_sectionshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/section/show.gsp" }
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
invokeTag('link','g',92,['action':("index")],2)
printHtmlPart(11)
createClosureForHtmlPart(12, 2)
invokeTag('link','g',93,['action':("create")],2)
printHtmlPart(13)
invokeTag('message','g',110,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(14)
if(true && (flash.message)) {
printHtmlPart(15)
expressionOut.print(flash.message)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (sectionInstance?.sectionStrength)) {
printHtmlPart(18)
invokeTag('message','g',118,['code':("section.sectionStrength.label"),'default':("Section Strength")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',120,['bean':(sectionInstance),'field':("sectionStrength")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (sectionInstance?.sectionClassTeacher)) {
printHtmlPart(22)
invokeTag('message','g',127,['code':("section.sectionClassTeacher.label"),'default':("Section Class Teacher")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',129,['bean':(sectionInstance),'field':("sectionClassTeacher")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (sectionInstance?.sectionID)) {
printHtmlPart(24)
invokeTag('message','g',136,['code':("section.sectionID.label"),'default':("Section ID")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',138,['bean':(sectionInstance),'field':("sectionID")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (sectionInstance?.sectionName)) {
printHtmlPart(26)
invokeTag('message','g',145,['code':("section.sectionName.label"),'default':("Section Name")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',147,['bean':(sectionInstance),'field':("sectionName")],-1)
printHtmlPart(20)
}
printHtmlPart(28)
createTagBody(2, {->
printHtmlPart(29)
createTagBody(3, {->
invokeTag('message','g',155,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',155,['class':("edit"),'action':("edit"),'id':(LookUpED.encod(sectionInstance))],3)
printHtmlPart(30)
invokeTag('actionSubmit','g',156,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(31)
})
invokeTag('form','g',158,['url':([resource:sectionInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(32)
invokeTag('render','g',165,['template':("/footer/footer")],-1)
printHtmlPart(33)
})
invokeTag('captureBody','sitemesh',203,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(34)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926013756L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
