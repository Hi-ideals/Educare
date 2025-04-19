import com.hiideals.instituite.feemanagment.Fee
import com.hiideals.instituite.feemanagment.FeesTypes
import com.hiideals.instituite.feemanagment.FeeTracker
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_fee_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/fee/_form.gsp" }
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
for( _it1117681940 in (student?.academicyear) ) {
changeItVariable(_it1117681940)
printHtmlPart(6)
if(true && (it.status == 'current')) {
printHtmlPart(6)
}
printHtmlPart(0)
}
printHtmlPart(0)
invokeTag('set','g',22,['value':(it),'var':("accInstance")],-1)
printHtmlPart(0)
invokeTag('hiddenField','g',23,['name':("academic"),'value':(accInstance?.id)],-1)
printHtmlPart(7)
if(true && (edit != 'true')) {
printHtmlPart(8)
if(true && (Instfeetypes.size()==0)) {
printHtmlPart(9)
invokeTag('hiddenField','g',39,['name':("admisionfeeDec"),'value':(true),'id':("admisionfeeDec")],-1)
printHtmlPart(10)
}
printHtmlPart(10)
loop:{
int j = 0
for( instFeeTypesInstance in (Instfeetypes) ) {
printHtmlPart(11)
expressionOut.print(j+1)
printHtmlPart(12)
invokeTag('field','g',48,['name':("totalAmount_${j}"),'value':(instFeeTypesInstance?.totalAmount),'id':("totalamount-${j}"),'type':("hidden")],-1)
printHtmlPart(13)
invokeTag('field','g',50,['name':("FeeType_${j}"),'value':(instFeeTypesInstance?.id),'id':("totalamount-${j}"),'type':("hidden")],-1)
printHtmlPart(13)
expressionOut.print(instFeeTypesInstance?.typeName)
printHtmlPart(14)
expressionOut.print(instFeeTypesInstance?.totalAmount)
printHtmlPart(15)
expressionOut.print(j)
printHtmlPart(16)
expressionOut.print(j)
printHtmlPart(17)
invokeTag('field','g',58,['style':("text-align:right"),'name':("amountToBePaid_${j}"),'id':("payamount_${j}"),'type':("text"),'value':("0"),'onchange':("doMath(this)")],-1)
printHtmlPart(18)
j++
}
}
printHtmlPart(19)
}
else {
printHtmlPart(20)
if(true && (feeInstance.feetypes)) {
printHtmlPart(9)
loop:{
int k = 0
for( feetypesInstance in (feeInstance.feetypes) ) {
printHtmlPart(21)
expressionOut.print(k)
printHtmlPart(22)
invokeTag('field','g',76,['name':("totalAmount_${k}"),'value':(feetypesInstance?.amountToBePaid),'id':("totalamount-${k}"),'type':("hidden")],-1)
printHtmlPart(13)
invokeTag('field','g',78,['name':("amountPaid_${k}"),'value':(feetypesInstance?.amountPaid),'id':("amountPaid_${k}"),'type':("hidden")],-1)
printHtmlPart(13)
expressionOut.print(feetypesInstance?.instFeeType?.typeName)
printHtmlPart(23)
expressionOut.print(feetypesInstance?.amountToBePaid)
printHtmlPart(24)
expressionOut.print(k)
printHtmlPart(25)
expressionOut.print(feetypesInstance?.amountPaid)
printHtmlPart(26)
expressionOut.print(k)
printHtmlPart(25)
expressionOut.print(feetypesInstance?.due)
printHtmlPart(22)
if(true && (feetypesInstance?.amountPaid == feetypesInstance?.instFeeType?.totalAmount)) {
printHtmlPart(27)
invokeTag('field','g',92,['name':("amountToBePaid_${k}"),'id':("payamount_${k}"),'type':("hidden"),'value':("0"),'onchange':("doMath(this)")],-1)
printHtmlPart(28)
}
else {
printHtmlPart(29)
invokeTag('field','g',96,['style':("text-align:right"),'name':("amountToBePaid_${k}"),'id':("payamount_${k}"),'type':("text"),'value':("0"),'onchange':("doMath(this)")],-1)
printHtmlPart(28)
}
printHtmlPart(30)
k++
}
}
printHtmlPart(10)
}
else {
printHtmlPart(31)
loop:{
int j = 0
for( instFeeTypesInstance in (Instfeetypes) ) {
printHtmlPart(21)
expressionOut.print(j+1)
printHtmlPart(32)
invokeTag('field','g',110,['name':("totalAmount_${j}"),'value':(instFeeTypesInstance?.totalAmount),'id':("totalamount-${j}"),'type':("hidden")],-1)
printHtmlPart(13)
invokeTag('field','g',112,['name':("FeeType_${j}"),'value':(instFeeTypesInstance?.id),'id':("totalamount-${j}"),'type':("hidden")],-1)
printHtmlPart(13)
expressionOut.print(instFeeTypesInstance?.typeName)
printHtmlPart(23)
expressionOut.print(instFeeTypesInstance?.totalAmount)
printHtmlPart(24)
expressionOut.print(j)
printHtmlPart(33)
expressionOut.print(j)
printHtmlPart(34)
invokeTag('field','g',121,['style':("text-align:right"),'name':("amountToBePaid_${j}"),'id':("payamount_${j}"),'type':("text"),'value':("0"),'onchange':("doMath(this)")],-1)
printHtmlPart(35)
j++
}
}
printHtmlPart(10)
}
printHtmlPart(19)
}
printHtmlPart(36)
if(true && (params.student=="Readmission" ||  student?.readmission)) {
printHtmlPart(37)
invokeTag('field','g',144,['style':("text-align:right"),'name':("admissionfee"),'id':("admissionfee"),'readonly':("readonly"),'type':("number"),'value':("0")],-1)
printHtmlPart(38)
invokeTag('hiddenField','g',148,['style':("text-align:right"),'name':("admissionfee1"),'id':("admissionfee1"),'readonly':("readonly"),'type':("number"),'value':("0")],-1)
printHtmlPart(39)
}
else {
printHtmlPart(37)
invokeTag('field','g',161,['style':("text-align:right"),'name':("admissionfee"),'id':("admissionfee"),'readonly':("readonly"),'type':("number"),'value':(student?.admissionfee?.totalAmount)],-1)
printHtmlPart(40)
if(true && (edit != 'true')) {
printHtmlPart(41)
if(true && (student?.admissionfee?.totalAmount == feeInstance?.admissionfeepaid)) {
printHtmlPart(42)
}
else {
printHtmlPart(28)
invokeTag('field','g',171,['style':("text-align:right"),'name':("admissionfee1"),'id':("admissionfee1"),'type':("number"),'value':("0"),'onchange':("dodiscount2(this)")],-1)
printHtmlPart(43)
}
printHtmlPart(44)
}
else {
printHtmlPart(45)
if(true && (student?.admissionfee?.totalAmount == feeInstance?.admissionfeepaid)) {
printHtmlPart(42)
}
else {
printHtmlPart(28)
invokeTag('field','g',184,['style':("text-align:right"),'name':("admissionfee1"),'id':("admissionfee1"),'type':("number"),'value':("0"),'onchange':("dodiscount1(this)")],-1)
printHtmlPart(43)
}
printHtmlPart(46)
}
printHtmlPart(47)
if(true && (feeInstance?.admissionfeepaid)) {
printHtmlPart(43)
invokeTag('field','g',194,['style':("text-align:right"),'name':("paidadmissionfee"),'id':("paidadmissionfee"),'readonly':("readonly"),'type':("number"),'value':(feeInstance?.admissionfeepaid)],-1)
printHtmlPart(48)
}
else {
printHtmlPart(43)
invokeTag('field','g',196,['style':("text-align:right"),'name':("paidadmissionfee"),'id':("paidadmissionfee"),'readonly':("readonly"),'type':("number"),'value':("0")],-1)
printHtmlPart(48)
}
printHtmlPart(38)
if(true && (feeInstance?.admissionfeepaid)) {
printHtmlPart(48)
invokeTag('hiddenField','g',205,['style':("text-align:right"),'name':("paidadmissionfee1"),'id':("paidadmissionfee1"),'readonly':("readonly"),'type':("number"),'value':(feeInstance?.admissionfeepaid)],-1)
printHtmlPart(9)
}
else {
printHtmlPart(48)
invokeTag('hiddenField','g',209,['style':("text-align:right"),'name':("paidadmissionfee1"),'id':("paidadmissionfee1"),'readonly':("readonly"),'type':("number"),'value':("0")],-1)
printHtmlPart(9)
}
printHtmlPart(49)
if(true && (feeInstance?.dueadmissionfee)) {
printHtmlPart(43)
invokeTag('field','g',221,['style':("text-align:right"),'name':("admissionfeedue"),'id':("admissionfeedue"),'readonly':("readonly"),'type':("number"),'value':(feeInstance?.dueadmissionfee)],-1)
printHtmlPart(48)
}
else {
printHtmlPart(43)
invokeTag('field','g',223,['style':("text-align:right"),'name':("admissionfeedue"),'id':("admissionfeedue"),'readonly':("readonly"),'type':("number"),'value':("0")],-1)
printHtmlPart(48)
}
printHtmlPart(50)
}
printHtmlPart(51)
if(true && (edit != 'true')) {
printHtmlPart(52)
invokeTag('field','g',233,['style':("text-align:right"),'name':("discount"),'id':("discount"),'type':("number"),'value':(feeInstance.discount),'onchange':("dodiscount(this)")],-1)
printHtmlPart(13)
invokeTag('hiddenField','g',235,['name':("discount1"),'id':("discount1")],-1)
printHtmlPart(50)
}
printHtmlPart(53)
if(true && (feeInstance.penalty >0)) {
printHtmlPart(54)
expressionOut.print(feeInstance.penalty)
printHtmlPart(55)
}
else {
printHtmlPart(56)
invokeTag('field','g',251,['style':("text-align:right"),'name':("penalty"),'id':("penalty"),'type':("number"),'value':(feeInstance.penalty),'onchange':("dopenalty(this)")],-1)
printHtmlPart(50)
}
printHtmlPart(19)
if(true && (params.student=="Readmission" || student?.readmission)) {
printHtmlPart(57)
invokeTag('field','g',260,['style':("text-align:right"),'name':("totalFee"),'id':("totalFee"),'type':("number"),'readonly':("readonly"),'value':(sum),'required':("")],-1)
printHtmlPart(58)
invokeTag('hiddenField','g',264,['style':("text-align:right"),'name':("paidadmissionfee"),'id':("paidadmissionfee"),'readonly':("readonly"),'type':("number"),'value':("0")],-1)
printHtmlPart(39)
}
else {
printHtmlPart(57)
invokeTag('field','g',273,['style':("text-align:right"),'name':("totalFee"),'id':("totalFee"),'type':("number"),'readonly':("readonly"),'value':(totalsum),'required':("")],-1)
printHtmlPart(59)
}
printHtmlPart(60)
if(true && (feeInstance.totalPaid)) {
printHtmlPart(48)
invokeTag('field','g',287,['style':("text-align:right"),'name':("totalPaid"),'id':("totalPaid"),'readonly':("readonly"),'type':("number"),'value':(feeInstance.totalPaid),'required':("")],-1)
printHtmlPart(9)
}
else {
printHtmlPart(48)
invokeTag('field','g',289,['style':("text-align:right"),'name':("totalPaid"),'id':("totalPaid"),'readonly':("readonly"),'type':("number"),'value':("0")],-1)
printHtmlPart(9)
}
printHtmlPart(61)
if(true && (params.student=="Readmission")) {
printHtmlPart(62)
}
else {
printHtmlPart(63)
}
printHtmlPart(64)
invokeTag('field','g',302,['style':("text-align:right"),'name':("due"),'id':("pending"),'type':("number"),'readonly':("readonly"),'value':(feeInstance.due ?: 0),'required':("")],-1)
printHtmlPart(65)
invokeTag('set','g',317,['var':("user"),'value':(sec.username())],-1)
printHtmlPart(29)
if(true && (user=="lkbed2011")) {
printHtmlPart(66)
}
printHtmlPart(67)
for( pl in (FeeTracker.constraints.paymentType.inList) ) {
printHtmlPart(68)
expressionOut.print(pl)
printHtmlPart(69)
expressionOut.print(pl)
printHtmlPart(70)
}
printHtmlPart(71)
invokeTag('textArea','g',396,['class':("form-control"),'name':("notes"),'id':("notes")],-1)
printHtmlPart(72)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1706012103602L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
