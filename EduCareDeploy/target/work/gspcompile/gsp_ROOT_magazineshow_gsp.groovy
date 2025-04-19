import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.institute.staff.Staff
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_magazineshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/magazine/show.gsp" }
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
invokeTag('captureHead','sitemesh',45,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',54,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',58,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',69,['template':("/header/leftSide"),'model':([activ:[LibraryManagement:'start active open',magazine:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
invokeTag('message','g',82,['code':("default.home.label")],-1)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',84,['class':("list"),'action':("index")],2)
printHtmlPart(12)
createClosureForHtmlPart(13, 2)
invokeTag('link','g',86,['class':("create"),'action':("create")],2)
printHtmlPart(14)
if(true && (magazineInstance?.magazineName)) {
printHtmlPart(15)
invokeTag('message','g',103,['code':("magazine.magazineName.label"),'default':("MagazineName")],-1)
printHtmlPart(16)
invokeTag('fieldValue','g',107,['bean':(magazineInstance),'field':("magazineName")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (magazineInstance?.catagory)) {
printHtmlPart(19)
invokeTag('message','g',116,['code':("magazine.catagory.label"),'default':("Catagory")],-1)
printHtmlPart(20)
invokeTag('fieldValue','g',119,['bean':(magazineInstance),'field':("catagory")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (magazineInstance?.volume)) {
printHtmlPart(21)
invokeTag('message','g',128,['code':("magazine.volume.label"),'default':("Volume")],-1)
printHtmlPart(22)
invokeTag('fieldValue','g',131,['bean':(magazineInstance),'field':("volume")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (magazineInstance?.cddvd)) {
printHtmlPart(23)
invokeTag('message','g',140,['code':("magazine.cddvd.label"),'default':("Cddvd")],-1)
printHtmlPart(24)
invokeTag('formatBoolean','g',143,['boolean':(magazineInstance?.cddvd)],-1)
printHtmlPart(25)
}
printHtmlPart(18)
if(true && (magazineInstance?.cost)) {
printHtmlPart(26)
invokeTag('message','g',153,['code':("magazine.cost.label"),'default':("Cost")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',156,['bean':(magazineInstance),'field':("cost")],-1)
printHtmlPart(25)
}
printHtmlPart(18)
if(true && (magazineInstance?.purchasedOn)) {
printHtmlPart(28)
invokeTag('message','g',166,['code':("magazine.purchasedOn.label"),'default':("PurchasedOn")],-1)
printHtmlPart(29)
invokeTag('formatDate','g',170,['date':(magazineInstance?.purchasedOn)],-1)
printHtmlPart(25)
}
printHtmlPart(30)
createTagBody(2, {->
printHtmlPart(31)
createTagBody(3, {->
printHtmlPart(32)
invokeTag('message','g',186,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(33)
})
invokeTag('link','g',187,['class':("btn yellow"),'action':("edit"),'id':(LookUpED.encod(magazineInstance.id))],3)
printHtmlPart(34)
})
invokeTag('form','g',189,['url':([resource:magazineInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(35)
invokeTag('render','g',189,['template':("/footer/footer")],-1)
printHtmlPart(36)
})
invokeTag('captureBody','sitemesh',230,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(37)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925996534L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
