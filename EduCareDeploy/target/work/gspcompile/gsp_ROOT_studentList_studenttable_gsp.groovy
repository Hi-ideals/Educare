import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_studentList_studenttable_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/studentList/_studenttable.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
for( _it1902831987 in (academicyears) ) {
changeItVariable(_it1902831987)
printHtmlPart(1)
if(true && (it.status == 'current')) {
printHtmlPart(2)
invokeTag('set','g',4,['value':(it.feeId),'var':("feeInstance")],-1)
printHtmlPart(3)
if(true && (edit != 'true')) {
printHtmlPart(4)
loop:{
int j = 0
for( FeeTypesInstance in (feeInstance?.feetypes) ) {
printHtmlPart(5)
expressionOut.print(j+1)
printHtmlPart(6)
invokeTag('field','g',25,['name':("totalAmount_${j}"),'value':(FeeTypesInstance?.amountToBePaid),'id':("totalamount-${j}"),'type':("hidden")],-1)
printHtmlPart(7)
invokeTag('field','g',27,['name':("FeeType_${j}"),'value':(FeeTypesInstance?.instFeeType?.id),'id':("totalamount-${j}"),'type':("hidden")],-1)
printHtmlPart(7)
expressionOut.print(FeeTypesInstance?.amountToBePaid)
printHtmlPart(8)
expressionOut.print(FeeTypesInstance?.amountToBePaid)
printHtmlPart(9)
expressionOut.print(j)
printHtmlPart(10)
expressionOut.print(FeeTypesInstance.amountPaid)
printHtmlPart(11)
expressionOut.print(j)
printHtmlPart(10)
expressionOut.print(FeeTypesInstance.due)
printHtmlPart(12)
j++
}
}
printHtmlPart(13)
}
else {
printHtmlPart(4)
loop:{
int k = 0
for( feetypesInstance in (feeInstance.feetypes) ) {
printHtmlPart(5)
expressionOut.print(k)
printHtmlPart(6)
invokeTag('field','g',52,['name':("totalAmount_${k}"),'value':(feetypesInstance.instFeeType?.totalAmount),'id':("totalamount-${k}"),'type':("hidden")],-1)
printHtmlPart(7)
invokeTag('field','g',54,['name':("amountPaid_${k}"),'value':(feetypesInstance?.amountPaid),'id':("amountPaid_${k}"),'type':("hidden")],-1)
printHtmlPart(7)
expressionOut.print(feetypesInstance.instFeeType.typeName)
printHtmlPart(14)
expressionOut.print(feetypesInstance?.amountToBePaid)
printHtmlPart(9)
expressionOut.print(k)
printHtmlPart(15)
expressionOut.print(feetypesInstance.amountPaid)
printHtmlPart(16)
expressionOut.print(k)
printHtmlPart(17)
expressionOut.print(feetypesInstance.due)
printHtmlPart(18)
k++
}
}
printHtmlPart(13)
}
printHtmlPart(19)
if(true && (feeInstance?.totaladmissionfee)) {
printHtmlPart(20)
expressionOut.print(feeInstance?.totaladmissionfee)
printHtmlPart(21)
expressionOut.print(feeInstance?.admissionfeepaid)
printHtmlPart(22)
expressionOut.print(feeInstance?.totaladmissionfee-feeInstance?.admissionfeepaid)
printHtmlPart(23)
}
printHtmlPart(13)
if(true && (feeInstance?.totalPaid)) {
printHtmlPart(24)
expressionOut.print(feeInstance?.discount)
printHtmlPart(25)
expressionOut.print(feeInstance?.penalty)
printHtmlPart(26)
expressionOut.print(feeInstance?.totalFee)
printHtmlPart(27)
if(true && (feeInstance?.totaladmissionfee)) {
printHtmlPart(28)
expressionOut.print(feeInstance?.totalPaid)
printHtmlPart(29)
}
else {
printHtmlPart(30)
expressionOut.print(feeInstance?.totalPaid)
printHtmlPart(29)
}
printHtmlPart(31)
if(true && (feeInstance == null)) {
printHtmlPart(32)
expressionOut.print(feeInstance?.due)
printHtmlPart(33)
}
else {
printHtmlPart(32)
expressionOut.print(feeInstance?.totalFee-feeInstance?.totalPaid)
printHtmlPart(34)
}
printHtmlPart(35)
}
else {
printHtmlPart(36)
createClosureForHtmlPart(37, 4)
invokeTag('link','g',157,['controller':("fee"),'action':("edit"),'style':("color:#fff"),'id':(LookUpED.encod(student?.id)),'title':("")],4)
printHtmlPart(13)
}
printHtmlPart(38)
}
printHtmlPart(0)
}
printHtmlPart(39)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1706090789890L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
