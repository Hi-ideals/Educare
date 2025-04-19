import com.hiideals.instituite.feemanagment.Fee
import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_feeshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/fee/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
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
invokeTag('captureHead','sitemesh',45,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',52,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',55,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',65,['template':("/header/leftSide"),'model':([activ:[feeStructure:'start active open',fee:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',77,['action':("index")],2)
printHtmlPart(11)
if(true && (flash.message)) {
printHtmlPart(12)
expressionOut.print(flash.message)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (feeInstance?.feetypes)) {
printHtmlPart(15)
invokeTag('message','g',96,['code':("fee.feetypes.label"),'default':("Feetypes")],-1)
printHtmlPart(16)
for( f in (feeInstance.feetypes) ) {
printHtmlPart(17)
createTagBody(4, {->
printHtmlPart(18)
expressionOut.print(f?.encodeAsHTML())
printHtmlPart(19)
})
invokeTag('link','g',102,['controller':("feesTypes"),'action':("show"),'id':(f.id)],4)
printHtmlPart(20)
}
printHtmlPart(21)
}
printHtmlPart(22)
if(true && (feeInstance?.studentId)) {
printHtmlPart(23)
invokeTag('message','g',109,['code':("fee.studentId.label"),'default':("Student Id")],-1)
printHtmlPart(24)
createTagBody(3, {->
printHtmlPart(19)
expressionOut.print(feeInstance?.studentId?.encodeAsHTML())
printHtmlPart(25)
})
invokeTag('link','g',114,['controller':("student"),'action':("show"),'id':(feeInstance?.studentId?.id)],3)
printHtmlPart(26)
}
printHtmlPart(22)
if(true && (feeInstance?.due)) {
printHtmlPart(27)
invokeTag('message','g',120,['code':("fee.due.label"),'default':("Due")],-1)
printHtmlPart(28)
invokeTag('fieldValue','g',122,['bean':(feeInstance),'field':("due")],-1)
printHtmlPart(26)
}
printHtmlPart(22)
if(true && (feeInstance?.totalFee)) {
printHtmlPart(29)
invokeTag('message','g',128,['code':("fee.totalFee.label"),'default':("Total Fee")],-1)
printHtmlPart(30)
invokeTag('fieldValue','g',130,['bean':(feeInstance),'field':("totalFee")],-1)
printHtmlPart(26)
}
printHtmlPart(22)
if(true && (feeInstance?.totalPaid)) {
printHtmlPart(31)
invokeTag('message','g',136,['code':("fee.totalPaid.label"),'default':("Total Paid")],-1)
printHtmlPart(32)
invokeTag('fieldValue','g',138,['bean':(feeInstance),'field':("totalPaid")],-1)
printHtmlPart(26)
}
printHtmlPart(22)
if(true && (feeInstance?.discount)) {
printHtmlPart(33)
invokeTag('message','g',144,['code':("fee.discount.label"),'default':("Discount")],-1)
printHtmlPart(34)
invokeTag('fieldValue','g',146,['bean':(feeInstance),'field':("discount")],-1)
printHtmlPart(26)
}
printHtmlPart(22)
if(true && (feeInstance?.penalty)) {
printHtmlPart(35)
invokeTag('message','g',152,['code':("fee.penalty.label"),'default':("Penalty")],-1)
printHtmlPart(32)
invokeTag('fieldValue','g',154,['bean':(feeInstance),'field':("penalty")],-1)
printHtmlPart(26)
}
printHtmlPart(36)
createTagBody(2, {->
printHtmlPart(37)
createTagBody(3, {->
printHtmlPart(38)
invokeTag('message','g',163,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(39)
})
invokeTag('link','g',164,['class':("edit"),'action':("edit"),'id':(LookUpED.encod(feeInstance?.id))],3)
printHtmlPart(39)
invokeTag('actionSubmit','g',167,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(40)
})
invokeTag('form','g',169,['url':([resource:feeInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(41)
loop:{
int j = 0
for( feet in (trackerList) ) {
printHtmlPart(42)
loop:{
int i = 0
for( ty in (feet.feetypetracker) ) {
printHtmlPart(43)
if(true && (i==0)) {
printHtmlPart(44)
expressionOut.print(feet.feetypetracker.size())
printHtmlPart(45)
expressionOut.print(feet.instalment)
printHtmlPart(46)
expressionOut.print(feet.feetypetracker.size())
printHtmlPart(47)
expressionOut.print(feet.paymentType)
printHtmlPart(48)
}
printHtmlPart(49)
expressionOut.print(ty.instFeeTypeT)
printHtmlPart(50)
expressionOut.print(ty.amountPaidT)
printHtmlPart(50)
expressionOut.print(ty.dueT)
printHtmlPart(51)
i++
}
}
printHtmlPart(52)
j++
}
}
printHtmlPart(53)
invokeTag('render','g',221,['template':("/footer/footer")],-1)
printHtmlPart(54)
})
invokeTag('captureBody','sitemesh',249,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(55)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926001678L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
