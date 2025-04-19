import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.institute.staff.Staff
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_booksshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/books/show.gsp" }
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
invokeTag('captureHead','sitemesh',44,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',53,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',57,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',65,['template':("/header/leftSide"),'model':([activ:[LibraryManagement:'start active open',books:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
invokeTag('message','g',76,['code':("default.home.label")],-1)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',78,['class':("list"),'action':("index")],2)
printHtmlPart(12)
createClosureForHtmlPart(13, 2)
invokeTag('link','g',80,['class':("create"),'action':("create")],2)
printHtmlPart(14)
if(true && (booksInstance?.author)) {
printHtmlPart(15)
invokeTag('message','g',98,['code':("books.author.label"),'default':("Author")],-1)
printHtmlPart(16)
invokeTag('fieldValue','g',102,['bean':(booksInstance),'field':("author")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (booksInstance?.title)) {
printHtmlPart(19)
invokeTag('message','g',113,['code':("books.title.label"),'default':("Title")],-1)
printHtmlPart(20)
invokeTag('fieldValue','g',117,['bean':(booksInstance),'field':("title")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (booksInstance?.publisher)) {
printHtmlPart(21)
invokeTag('message','g',129,['code':("books.publisher.label"),'default':("Publisher")],-1)
printHtmlPart(22)
invokeTag('fieldValue','g',133,['bean':(booksInstance),'field':("publisher")],-1)
printHtmlPart(23)
}
printHtmlPart(24)
if(true && (booksInstance?.place)) {
printHtmlPart(25)
invokeTag('message','g',141,['code':("books.place.label"),'default':("Place")],-1)
printHtmlPart(26)
invokeTag('fieldValue','g',145,['bean':(booksInstance),'field':("place")],-1)
printHtmlPart(17)
}
printHtmlPart(24)
if(true && (booksInstance?.subject)) {
printHtmlPart(27)
invokeTag('message','g',153,['code':("books.subject.label"),'default':("Subject")],-1)
printHtmlPart(28)
invokeTag('fieldValue','g',157,['bean':(booksInstance),'field':("subject")],-1)
printHtmlPart(29)
}
printHtmlPart(30)
if(true && (booksInstance?.edition)) {
printHtmlPart(31)
invokeTag('message','g',166,['code':("books.edition.label"),'default':("Edition")],-1)
printHtmlPart(32)
invokeTag('fieldValue','g',170,['bean':(booksInstance),'field':("edition")],-1)
printHtmlPart(17)
}
printHtmlPart(24)
if(true && (booksInstance?.status)) {
printHtmlPart(33)
invokeTag('message','g',178,['code':("books.status.label"),'default':("Status")],-1)
printHtmlPart(34)
invokeTag('fieldValue','g',182,['bean':(booksInstance),'field':("status")],-1)
printHtmlPart(23)
}
printHtmlPart(24)
if(true && (booksInstance?.volume)) {
printHtmlPart(35)
invokeTag('message','g',190,['code':("books.volume.label"),'default':("Volume")],-1)
printHtmlPart(36)
invokeTag('fieldValue','g',194,['bean':(booksInstance),'field':("volume")],-1)
printHtmlPart(17)
}
printHtmlPart(24)
if(true && (booksInstance?.year)) {
printHtmlPart(37)
invokeTag('message','g',202,['code':("books.year.label"),'default':("Year")],-1)
printHtmlPart(38)
invokeTag('fieldValue','g',206,['bean':(booksInstance),'field':("year")],-1)
printHtmlPart(23)
}
printHtmlPart(24)
if(true && (booksInstance?.pages)) {
printHtmlPart(39)
invokeTag('message','g',214,['code':("books.pages.label"),'default':("Pages")],-1)
printHtmlPart(40)
invokeTag('fieldValue','g',218,['bean':(booksInstance),'field':("pages")],-1)
printHtmlPart(17)
}
printHtmlPart(24)
if(true && (booksInstance?.cost)) {
printHtmlPart(41)
invokeTag('message','g',226,['code':("books.cost.label"),'default':("Cost")],-1)
printHtmlPart(42)
invokeTag('fieldValue','g',230,['bean':(booksInstance),'field':("cost")],-1)
printHtmlPart(17)
}
printHtmlPart(24)
if(true && (booksInstance?.billNumber)) {
printHtmlPart(43)
invokeTag('message','g',239,['code':("books.billNumber.label"),'default':("Bill Number")],-1)
printHtmlPart(44)
invokeTag('fieldValue','g',243,['bean':(booksInstance),'field':("billNumber")],-1)
printHtmlPart(17)
}
printHtmlPart(24)
if(true && (booksInstance?.bookSource)) {
printHtmlPart(45)
invokeTag('message','g',252,['code':("books.bookSource.label"),'default':("Book Source")],-1)
printHtmlPart(46)
invokeTag('fieldValue','g',256,['bean':(booksInstance),'field':("bookSource")],-1)
printHtmlPart(17)
}
printHtmlPart(24)
if(true && (booksInstance?.moreInfo)) {
printHtmlPart(47)
invokeTag('message','g',264,['code':("books.moreInfo.label"),'default':("More Info")],-1)
printHtmlPart(48)
invokeTag('fieldValue','g',268,['bean':(booksInstance),'field':("moreInfo")],-1)
printHtmlPart(17)
}
printHtmlPart(24)
if(true && (booksInstance?.accessionNumber)) {
printHtmlPart(49)
invokeTag('message','g',278,['code':("books.accessionNumber.label"),'default':("AccessionNumber")],-1)
printHtmlPart(50)
invokeTag('fieldValue','g',282,['bean':(booksInstance),'field':("accessionNumber")],-1)
printHtmlPart(17)
}
printHtmlPart(24)
if(true && (booksInstance?.purchasedOn)) {
printHtmlPart(51)
invokeTag('message','g',291,['code':("books.purchasedOn.label"),'default':("PurchasedOn")],-1)
printHtmlPart(52)
invokeTag('formatDate','g',295,['date':(booksInstance?.purchasedOn)],-1)
printHtmlPart(23)
}
printHtmlPart(53)
createTagBody(2, {->
printHtmlPart(54)
createTagBody(3, {->
printHtmlPart(55)
invokeTag('message','g',311,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(56)
})
invokeTag('link','g',312,['class':("btn yellow"),'action':("edit"),'id':(LookUpED.encod(booksInstance.id))],3)
printHtmlPart(57)
})
invokeTag('form','g',314,['url':([resource:booksInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(58)
invokeTag('render','g',316,['template':("/footer/footer")],-1)
printHtmlPart(59)
})
invokeTag('captureBody','sitemesh',353,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(60)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925994035L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
