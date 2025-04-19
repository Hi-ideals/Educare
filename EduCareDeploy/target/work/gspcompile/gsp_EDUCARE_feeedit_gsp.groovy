import com.hiideals.instituite.feemanagment.Fee
import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_feeedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/fee/edit.gsp" }
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
invokeTag('captureHead','sitemesh',65,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',74,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',78,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',89,['template':("/header/leftSide"),'model':([activ:[feeStructure:'start active open',fee:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
expressionOut.print(feeInstance?.studentId?.studentName)
printHtmlPart(10)
for( _it1453365852 in (feeInstance?.studentId?.academicyear) ) {
changeItVariable(_it1453365852)
printHtmlPart(11)
if(true && (it.status == 'current')) {
printHtmlPart(11)
}
printHtmlPart(12)
}
printHtmlPart(13)
invokeTag('set','g',117,['value':(it?.presentclass),'var':("pclass")],-1)
printHtmlPart(13)
expressionOut.print(pclass.classname)
printHtmlPart(14)
for( _it2002705120 in (feeInstance?.studentId?.academicyear) ) {
changeItVariable(_it2002705120)
printHtmlPart(11)
if(true && (it.status == 'current')) {
printHtmlPart(11)
}
printHtmlPart(12)
}
printHtmlPart(13)
invokeTag('set','g',124,['value':(it?.section),'var':("pclass")],-1)
printHtmlPart(13)
expressionOut.print(pclass?.sectionName)
printHtmlPart(15)
for( _it653557958 in (feeInstance?.studentId?.academicyear) ) {
changeItVariable(_it653557958)
printHtmlPart(11)
if(true && (it.status == 'current')) {
printHtmlPart(11)
}
printHtmlPart(12)
}
printHtmlPart(13)
invokeTag('set','g',131,['value':(it),'var':("pclass")],-1)
printHtmlPart(13)
expressionOut.print(pclass?.academicyear)
printHtmlPart(16)
if(true && (flash.message)) {
printHtmlPart(17)
expressionOut.print(flash.message)
printHtmlPart(18)
}
printHtmlPart(19)
if(true && (flash.msgtcfee)) {
printHtmlPart(20)
expressionOut.print(flash.msgtcfee)
printHtmlPart(21)
}
printHtmlPart(19)
createTagBody(2, {->
printHtmlPart(22)
createTagBody(3, {->
printHtmlPart(23)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(24)
expressionOut.print(error.field)
printHtmlPart(25)
}
printHtmlPart(26)
invokeTag('message','g',153,['error':(error)],-1)
printHtmlPart(27)
})
invokeTag('eachError','g',154,['bean':(feeInstance),'var':("error")],3)
printHtmlPart(28)
})
invokeTag('hasErrors','g',156,['bean':(feeInstance)],2)
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(29)
invokeTag('hiddenField','g',159,['name':("version"),'value':(feeInstance?.version)],-1)
printHtmlPart(30)
invokeTag('render','g',161,['template':("form"),'model':([edit:'true'])],-1)
printHtmlPart(31)
invokeTag('actionSubmit','g',165,['class':("btn blue"),'id':("paypal"),'action':("update"),'value':("Pay Fees")],-1)
printHtmlPart(32)
})
invokeTag('form','g',167,['url':([resource:feeInstance, action:'update']),'method':("PUT")],2)
printHtmlPart(33)
invokeTag('render','g',432,['template':("/footer/footer")],-1)
printHtmlPart(34)
})
invokeTag('captureBody','sitemesh',864,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(35)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926001540L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
