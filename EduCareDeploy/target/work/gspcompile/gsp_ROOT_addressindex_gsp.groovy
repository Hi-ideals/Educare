import com.hiideals.instituite.helper.Address
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_addressindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/address/index.gsp" }
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
invokeTag('render','g',51,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',54,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',61,['template':("/header/leftSide")],-1)
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('link','g',78,['class':("btn btn-warning"),'action':("create")],2)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
invokeTag('sortableColumn','g',100,['property':("phno"),'title':(message(code: 'address.phno.label', default: 'Phno'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',103,['property':("mobileNumber"),'title':(message(code: 'address.mobileNumber.label', default: 'Mobile Number'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',106,['property':("nationality"),'title':(message(code: 'address.nationality.label', default: 'Nationality'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',109,['property':("bloodgroup"),'title':(message(code: 'address.bloodgroup.label', default: 'Bloodgroup'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',112,['property':("motherTongue"),'title':(message(code: 'address.motherTongue.label', default: 'Mother Tongue'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',115,['property':("religion"),'title':(message(code: 'address.religion.label', default: 'Religion'))],-1)
printHtmlPart(15)
loop:{
int i = 0
for( addressInstance in (addressInstanceList) ) {
printHtmlPart(16)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(17)
createTagBody(3, {->
printHtmlPart(18)
expressionOut.print(fieldValue(bean: addressInstance, field: "phno"))
printHtmlPart(19)
})
invokeTag('link','g',126,['action':("show"),'id':(addressInstance.id)],3)
printHtmlPart(20)
expressionOut.print(fieldValue(bean: addressInstance, field: "mobileNumber"))
printHtmlPart(21)
expressionOut.print(fieldValue(bean: addressInstance, field: "nationality"))
printHtmlPart(21)
expressionOut.print(fieldValue(bean: addressInstance, field: "bloodgroup"))
printHtmlPart(21)
expressionOut.print(fieldValue(bean: addressInstance, field: "motherTongue"))
printHtmlPart(21)
expressionOut.print(fieldValue(bean: addressInstance, field: "religion"))
printHtmlPart(22)
i++
}
}
printHtmlPart(23)
invokeTag('paginate','g',158,['total':(addressInstanceCount ?: 0)],-1)
printHtmlPart(24)
invokeTag('render','g',167,['template':("/footer/footer")],-1)
printHtmlPart(25)
})
invokeTag('captureBody','sitemesh',194,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(26)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926020367L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
