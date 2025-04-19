import com.hiideals.instituite.helper.Address
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_addressshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/address/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',13,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',13,[:],2)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',44,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('render','g',49,['template':("/header/logo")],-1)
printHtmlPart(5)
invokeTag('render','g',52,['template':("/header/topBar")],-1)
printHtmlPart(6)
invokeTag('render','g',59,['template':("/header/leftSide")],-1)
printHtmlPart(7)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(8)
invokeTag('message','g',78,['code':("default.home.label")],-1)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
invokeTag('message','g',80,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(11)
})
invokeTag('link','g',81,['class':("list"),'action':("index")],2)
printHtmlPart(12)
createTagBody(2, {->
printHtmlPart(10)
invokeTag('message','g',83,['code':("default.new.label"),'args':([entityName])],-1)
printHtmlPart(11)
})
invokeTag('link','g',84,['class':("create"),'action':("create")],2)
printHtmlPart(13)
invokeTag('message','g',89,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(14)
if(true && (flash.message)) {
printHtmlPart(15)
expressionOut.print(flash.message)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (addressInstance?.phno)) {
printHtmlPart(18)
invokeTag('message','g',101,['code':("address.phno.label"),'default':("Phno")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',103,['bean':(addressInstance),'field':("phno")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (addressInstance?.mobileNumber)) {
printHtmlPart(22)
invokeTag('message','g',109,['code':("address.mobileNumber.label"),'default':("Mobile Number")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',113,['bean':(addressInstance),'field':("mobileNumber")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (addressInstance?.nationality)) {
printHtmlPart(24)
invokeTag('message','g',119,['code':("address.nationality.label"),'default':("Nationality")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',121,['bean':(addressInstance),'field':("nationality")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (addressInstance?.bloodgroup)) {
printHtmlPart(26)
invokeTag('message','g',127,['code':("address.bloodgroup.label"),'default':("Bloodgroup")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',129,['bean':(addressInstance),'field':("bloodgroup")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (addressInstance?.motherTongue)) {
printHtmlPart(28)
invokeTag('message','g',135,['code':("address.motherTongue.label"),'default':("Mother Tongue")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',139,['bean':(addressInstance),'field':("motherTongue")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (addressInstance?.religion)) {
printHtmlPart(30)
invokeTag('message','g',145,['code':("address.religion.label"),'default':("Religion")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',147,['bean':(addressInstance),'field':("religion")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (addressInstance?.city)) {
printHtmlPart(32)
invokeTag('message','g',153,['code':("address.city.label"),'default':("City")],-1)
printHtmlPart(33)
invokeTag('fieldValue','g',155,['bean':(addressInstance),'field':("city")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (addressInstance?.country)) {
printHtmlPart(34)
invokeTag('message','g',161,['code':("address.country.label"),'default':("Country")],-1)
printHtmlPart(35)
invokeTag('fieldValue','g',163,['bean':(addressInstance),'field':("country")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (addressInstance?.hsno)) {
printHtmlPart(36)
invokeTag('message','g',169,['code':("address.hsno.label"),'default':("Hsno")],-1)
printHtmlPart(37)
invokeTag('fieldValue','g',171,['bean':(addressInstance),'field':("hsno")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (addressInstance?.state)) {
printHtmlPart(38)
invokeTag('message','g',177,['code':("address.state.label"),'default':("State")],-1)
printHtmlPart(39)
invokeTag('fieldValue','g',179,['bean':(addressInstance),'field':("state")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
if(true && (addressInstance?.street)) {
printHtmlPart(40)
invokeTag('message','g',185,['code':("address.street.label"),'default':("Street")],-1)
printHtmlPart(41)
invokeTag('fieldValue','g',187,['bean':(addressInstance),'field':("street")],-1)
printHtmlPart(20)
}
printHtmlPart(42)
createTagBody(2, {->
printHtmlPart(43)
createTagBody(3, {->
printHtmlPart(10)
invokeTag('message','g',196,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(11)
})
invokeTag('link','g',197,['class':("edit"),'action':("edit"),'resource':(addressInstance)],3)
printHtmlPart(11)
invokeTag('actionSubmit','g',200,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(44)
})
invokeTag('form','g',202,['url':([resource:addressInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(45)
invokeTag('render','g',211,['template':("/footer/footer")],-1)
printHtmlPart(46)
})
invokeTag('captureBody','sitemesh',238,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(47)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926020373L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
