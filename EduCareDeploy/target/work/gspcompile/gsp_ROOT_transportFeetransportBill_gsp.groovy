import com.hiideals.instituite.student.Student
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_transportFeetransportBill_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/transportFee/transportBill.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=iso-8859-1")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("description"),'content':("School Management 	")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("keywords"),'content':("School Management   ")],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
printHtmlPart(2)
expressionOut.print(instituite?.name)
printHtmlPart(3)
})
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',10,[:],2)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',134,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('getImage','images',154,['id':(instituite?.logo?.id),'width':("47.635135135135"),'height':("50"),'alt':("Image"),'border':("0"),'title':("Images")],-1)
printHtmlPart(6)
expressionOut.print(instituite?.name)
printHtmlPart(7)
expressionOut.print(instituite?.hsno)
printHtmlPart(8)
expressionOut.print(instituite?.street)
printHtmlPart(9)
expressionOut.print(instituite?.city)
printHtmlPart(10)
expressionOut.print(instituite?.pinCode)
printHtmlPart(9)
expressionOut.print(instituite?.state)
printHtmlPart(8)
expressionOut.print(instituite?.country)
printHtmlPart(11)
expressionOut.print(instituite?.phone)
printHtmlPart(12)
expressionOut.print(transportFeeInstanceList?.id[0])
printHtmlPart(13)
expressionOut.print(transportFeeInstanceList?.transport?.destination?.fromPlace[0])
printHtmlPart(14)
expressionOut.print(transportFeeInstanceList?.transport?.destination?.toPlace[0])
printHtmlPart(15)
expressionOut.print(transportFeeInstanceList?.paymentId[0])
printHtmlPart(16)
invokeTag('formatDate','g',227,['date':(transportFeeInstanceList?.paymentDate[0]),'format':("dd-MMM-yyyy")],-1)
printHtmlPart(17)
if(true && (transportFeeInstanceList?.student?.studentName[0] != null)) {
printHtmlPart(18)
expressionOut.print(transportFeeInstanceList?.student?.studentName[0])
printHtmlPart(19)
if(true && (transportFeeInstanceList?.student?.profilePic[0] !=null)) {
printHtmlPart(20)
invokeTag('getImage','images',246,['id':(transportFeeInstanceList?.student?.profilePic?.id[0]),'width':("127"),'height':("95.25"),'alt':("Image"),'border':("0"),'title':("Images")],-1)
printHtmlPart(21)
}
else {
printHtmlPart(22)
}
printHtmlPart(23)
expressionOut.print(transportFeeInstanceList?.student?.registrationNo[0])
printHtmlPart(24)
for( _it164806893 in (transportFeeInstanceList?.student?.academicyear[0]) ) {
changeItVariable(_it164806893)
printHtmlPart(20)
if(true && (it.status == 'current')) {
printHtmlPart(20)
}
printHtmlPart(21)
}
printHtmlPart(9)
invokeTag('set','g',268,['value':(it?.presentclass),'var':("pclass")],-1)
printHtmlPart(25)
expressionOut.print(pclass?.classname)
printHtmlPart(26)
for( _it656704934 in (transportFeeInstanceList?.student?.academicyear[0]) ) {
changeItVariable(_it656704934)
printHtmlPart(20)
if(true && (it.status == 'current')) {
printHtmlPart(20)
}
printHtmlPart(21)
}
printHtmlPart(9)
invokeTag('set','g',281,['value':(it?.section),'var':("pclass")],-1)
printHtmlPart(9)
expressionOut.print(pclass?.sectionName)
printHtmlPart(27)
expressionOut.print(transportFeeInstanceList?.student?.fatherDetails?.parentName[0])
printHtmlPart(28)
expressionOut.print(transportFeeInstanceList?.student?.presentAddress?.hsno[0])
printHtmlPart(21)
expressionOut.print(transportFeeInstanceList?.student?.presentAddress?.street[0])
printHtmlPart(29)
expressionOut.print(transportFeeInstanceList?.student?.presentAddress?.city[0])
printHtmlPart(30)
expressionOut.print(transportFeeInstanceList?.student?.presentAddress?.pinCode[0])
printHtmlPart(31)
expressionOut.print(transportFeeInstanceList?.student?.presentAddress?.state[0])
printHtmlPart(32)
expressionOut.print(transportFeeInstanceList?.student?.presentAddress?.country[0])
printHtmlPart(33)
for( _it1793935907 in (transportFeeInstanceList?.student?.academicyear[0]) ) {
changeItVariable(_it1793935907)
printHtmlPart(20)
if(true && (it.status == 'current')) {
printHtmlPart(20)
}
printHtmlPart(21)
}
printHtmlPart(9)
invokeTag('set','g',311,['value':(it),'var':("pclass")],-1)
printHtmlPart(9)
expressionOut.print(pclass?.academicyear)
printHtmlPart(34)
expressionOut.print(transportFeeInstanceList?.transport?.destination?.amount[0])
printHtmlPart(35)
expressionOut.print(transportFeeInstanceList?.payingAmount[0])
printHtmlPart(36)
expressionOut.print(transportFeeInstanceList?.remainingAmount[0])
printHtmlPart(37)
expressionOut.print(transportFeeInstanceList?.paidAmount[0])
printHtmlPart(38)
}
else if(true && (transportFeeInstanceList?.employee?.staffName[0] != null)) {
printHtmlPart(39)
expressionOut.print(transportFeeInstanceList?.employee?.staffName[0])
printHtmlPart(40)
expressionOut.print(transportFeeInstanceList?.employee.staffID[0])
printHtmlPart(41)
expressionOut.print(transportFeeInstanceList?.employee?.address?.hsno[0])
printHtmlPart(21)
expressionOut.print(transportFeeInstanceList?.employee?.address?.street[0])
printHtmlPart(29)
expressionOut.print(transportFeeInstanceList?.employee?.address?.city[0])
printHtmlPart(30)
expressionOut.print(transportFeeInstanceList?.employee?.address?.pinCode[0])
printHtmlPart(31)
expressionOut.print(transportFeeInstanceList?.employee?.address?.state[0])
printHtmlPart(32)
expressionOut.print(transportFeeInstanceList?.employee?.address?.country[0])
printHtmlPart(42)
expressionOut.print(transportFeeInstanceList?.employee?.mobileNumber[0])
printHtmlPart(43)
expressionOut.print(transportFeeInstanceList?.transport?.destination?.amount[0])
printHtmlPart(35)
expressionOut.print(transportFeeInstanceList?.paiyingAmount[0])
printHtmlPart(36)
expressionOut.print(transportFeeInstanceList?.remainingAmount[0])
printHtmlPart(37)
expressionOut.print(transportFeeInstanceList?.paidAmount[0])
printHtmlPart(44)
}
printHtmlPart(45)
})
invokeTag('captureBody','sitemesh',468,['class':("body_pop")],1)
printHtmlPart(46)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926005879L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
