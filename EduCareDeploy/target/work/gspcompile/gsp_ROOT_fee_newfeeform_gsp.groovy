import com.hiideals.instituite.feemanagment.Fee
import com.hiideals.instituite.feemanagment.FeesTypes
import com.hiideals.instituite.feemanagment.FeeTracker
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_fee_newfeeform_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/fee/_newfeeform.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(1)
expressionOut.print(hasErrors(bean: feeInstance, field: 'studentId', 'error'))
printHtmlPart(2)
invokeTag('message','g',10,['code':("fee.studentId.label"),'default':("Student Id")],-1)
printHtmlPart(3)
expressionOut.print(student?.id)
printHtmlPart(4)
expressionOut.print(student?.studentName)
printHtmlPart(5)
if(true && (edit != 'true')) {
printHtmlPart(6)
loop:{
int j = 0
for( instFeeTypesInstance in (Instfeetypes) ) {
printHtmlPart(7)
expressionOut.print(j)
printHtmlPart(8)
invokeTag('field','g',37,['name':("totalAmount_${j}"),'value':(instFeeTypesInstance?.totalAmount),'id':("totalamount-${j}"),'type':("hidden")],-1)
printHtmlPart(9)
invokeTag('field','g',39,['name':("FeeType_${j}"),'value':(instFeeTypesInstance?.id),'id':("totalamount-${j}"),'type':("hidden")],-1)
printHtmlPart(9)
expressionOut.print(instFeeTypesInstance?.typeName)
printHtmlPart(10)
expressionOut.print(instFeeTypesInstance.totalAmount)
printHtmlPart(11)
expressionOut.print(j)
printHtmlPart(12)
expressionOut.print(j)
printHtmlPart(13)
invokeTag('field','g',46,['name':("amountToBePaid_${j}"),'id':("payamount_${j}"),'type':("text"),'value':("0"),'onchange':("doMath(this)")],-1)
printHtmlPart(14)
j++
}
}
printHtmlPart(15)
}
else {
printHtmlPart(6)
loop:{
int k = 0
for( feetypesInstance in (feeInstance.feetypes) ) {
printHtmlPart(7)
expressionOut.print(k)
printHtmlPart(8)
invokeTag('field','g',59,['name':("totalAmount_${k}"),'value':(feetypesInstance.instFeeType?.totalAmount),'id':("totalamount-${k}"),'type':("hidden")],-1)
printHtmlPart(9)
invokeTag('field','g',61,['name':("amountPaid_${k}"),'value':(feetypesInstance?.amountPaid),'id':("amountPaid_${k}"),'type':("hidden")],-1)
printHtmlPart(9)
expressionOut.print(feetypesInstance.instFeeType.typeName)
printHtmlPart(16)
expressionOut.print(feetypesInstance.instFeeType.totalAmount)
printHtmlPart(11)
expressionOut.print(k)
printHtmlPart(17)
expressionOut.print(feetypesInstance.amountPaid)
printHtmlPart(18)
expressionOut.print(k)
printHtmlPart(19)
expressionOut.print(feetypesInstance.due)
printHtmlPart(8)
if(true && (feetypesInstance.amountPaid == feetypesInstance.instFeeType.totalAmount)) {
printHtmlPart(20)
invokeTag('field','g',75,['name':("amountToBePaid_${k}"),'id':("payamount_${k}"),'type':("hidden"),'value':("0"),'onchange':("doMath(this)")],-1)
printHtmlPart(21)
}
else {
printHtmlPart(22)
invokeTag('field','g',78,['name':("amountToBePaid_${k}"),'class':("hope"),'id':("payamount_${k}"),'type':("text"),'value':("0"),'onchange':("doMath(this)")],-1)
printHtmlPart(21)
}
printHtmlPart(23)
k++
}
}
printHtmlPart(15)
}
printHtmlPart(24)
invokeTag('field','g',96,['name':("discount"),'id':("discount"),'type':("number"),'value':(feeInstance.discount),'onchange':("dodiscount(this)")],-1)
printHtmlPart(25)
if(true && (feeInstance.penalty >0)) {
printHtmlPart(26)
expressionOut.print(feeInstance.penalty)
printHtmlPart(27)
}
else {
printHtmlPart(28)
invokeTag('field','g',112,['name':("penalty"),'id':("penalty"),'type':("number"),'value':(feeInstance.penalty),'onchange':("dopenalty(this)")],-1)
printHtmlPart(29)
}
printHtmlPart(30)
invokeTag('field','g',118,['name':("totalFee"),'id':("totalFee"),'type':("number"),'readonly':("readonly"),'value':(feeInstance.totalFee),'required':("")],-1)
printHtmlPart(31)
invokeTag('field','g',125,['name':("Paidnow"),'id':("Paidnow"),'readonly':("readonly"),'type':("number"),'required':("")],-1)
printHtmlPart(32)
invokeTag('field','g',132,['name':("totalPaid"),'id':("totalPaid"),'readonly':("readonly"),'type':("number"),'value':(feeInstance.totalPaid),'required':("")],-1)
printHtmlPart(33)
invokeTag('field','g',137,['name':("due"),'id':("pending"),'type':("number"),'readonly':("readonly"),'value':(feeInstance.due),'required':("")],-1)
printHtmlPart(34)
for( pl in (FeeTracker.constraints.paymentType.inList) ) {
printHtmlPart(35)
expressionOut.print(pl)
printHtmlPart(36)
expressionOut.print(pl)
printHtmlPart(37)
}
printHtmlPart(38)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1705989835772L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
