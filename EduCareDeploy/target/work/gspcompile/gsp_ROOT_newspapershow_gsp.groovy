import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.institute.staff.Staff
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_newspapershow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/newspaper/show.gsp" }
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
invokeTag('captureHead','sitemesh',42,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('render','g',47,['template':("/header/logo")],-1)
printHtmlPart(5)
invokeTag('render','g',50,['template':("/header/topBar")],-1)
printHtmlPart(6)
invokeTag('render','g',61,['template':("/header/leftSide"),'model':([activ:[LibraryManagement:'start active open',newspaper:'active']])],-1)
printHtmlPart(7)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(8)
invokeTag('message','g',72,['code':("default.home.label")],-1)
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',74,['class':("list"),'action':("index")],2)
printHtmlPart(11)
createClosureForHtmlPart(12, 2)
invokeTag('link','g',76,['class':("create"),'action':("create")],2)
printHtmlPart(13)
if(true && (newspaperInstance?.name)) {
printHtmlPart(14)
invokeTag('message','g',91,['code':("newspaper.name.label"),'default':("Name")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',95,['bean':(newspaperInstance),'field':("name")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (newspaperInstance?.dateofnewspaper)) {
printHtmlPart(18)
invokeTag('message','g',105,['code':("newspaper.dateofnewspaper.label"),'default':("Dateofnewspaper")],-1)
printHtmlPart(19)
invokeTag('formatDate','g',109,['date':(newspaperInstance?.dateofnewspaper)],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (newspaperInstance?.cost)) {
printHtmlPart(22)
invokeTag('message','g',118,['code':("newspaper.cost.label"),'default':("Cost")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',122,['bean':(newspaperInstance),'field':("cost")],-1)
printHtmlPart(16)
}
printHtmlPart(24)
createTagBody(2, {->
printHtmlPart(25)
createTagBody(3, {->
printHtmlPart(26)
invokeTag('message','g',137,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(27)
})
invokeTag('link','g',138,['class':("btn yellow"),'action':("edit"),'id':(LookUpED.encod(newspaperInstance.id))],3)
printHtmlPart(28)
invokeTag('actionSubmit','g',142,['class':(" btn red"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(29)
})
invokeTag('form','g',144,['url':([resource:newspaperInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(30)
invokeTag('render','g',157,['template':("/footer/footer")],-1)
printHtmlPart(31)
})
invokeTag('captureBody','sitemesh',184,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(32)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925993965L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
