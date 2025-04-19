import com.hiideals.instituite.student.Student
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_studentviewfeedetail_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/student/viewfeedetail.gsp" }
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
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',118,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('getImage','images',134,['id':(instituite?.logo?.id),'width':("47.635135135135"),'height':("50"),'alt':("Image"),'border':("0"),'title':("Images")],-1)
printHtmlPart(6)
expressionOut.print(instituite?.name)
printHtmlPart(7)
expressionOut.print(instituite?.hsno)
printHtmlPart(2)
expressionOut.print(instituite?.street)
printHtmlPart(2)
expressionOut.print(instituite?.city)
printHtmlPart(8)
expressionOut.print(instituite?.pinCode)
printHtmlPart(9)
expressionOut.print(instituite?.state)
printHtmlPart(2)
expressionOut.print(instituite?.country)
printHtmlPart(10)
expressionOut.print(instituite?.phone)
printHtmlPart(11)
invokeTag('formatDate','g',169,['date':(temptracker?.lastUpdated),'format':("dd-MMM-yyyy")],-1)
printHtmlPart(12)
expressionOut.print(temptracker?.invoiceNo)
printHtmlPart(13)
expressionOut.print(stdetails?.studentName)
printHtmlPart(2)
expressionOut.print(stdetails?.lastName)
printHtmlPart(14)
if(true && (studentInstance?.profilePic !=null)) {
printHtmlPart(15)
invokeTag('getImage','images',186,['id':(studentInstance?.profilePic?.id),'width':("127"),'height':("95.25"),'alt':("Image"),'border':("0"),'title':("Images")],-1)
printHtmlPart(15)
}
else {
printHtmlPart(16)
}
printHtmlPart(17)
expressionOut.print(stdetails?.studentId)
printHtmlPart(18)
for( _it1475804169 in (stdetails?.academicyear) ) {
changeItVariable(_it1475804169)
printHtmlPart(9)
if(true && (it.status == 'current')) {
printHtmlPart(9)
}
printHtmlPart(19)
}
printHtmlPart(19)
invokeTag('set','g',207,['value':(it?.presentclass),'var':("pclass")],-1)
printHtmlPart(20)
expressionOut.print(pclass?.classname)
printHtmlPart(21)
for( _it182834500 in (studentInstance?.academicyear) ) {
changeItVariable(_it182834500)
printHtmlPart(9)
if(true && (it.status == 'current')) {
printHtmlPart(9)
}
printHtmlPart(19)
}
printHtmlPart(19)
invokeTag('set','g',219,['value':(it?.section),'var':("pclass")],-1)
printHtmlPart(20)
expressionOut.print(pclass?.sectionName)
printHtmlPart(22)
expressionOut.print(stdetails?.fatherDetails?.parentName)
printHtmlPart(23)
for( _it1525421339 in (stdetails?.academicyear) ) {
changeItVariable(_it1525421339)
printHtmlPart(9)
if(true && (it.status == 'current')) {
printHtmlPart(9)
}
printHtmlPart(19)
}
printHtmlPart(19)
invokeTag('set','g',236,['value':(it),'var':("pclass")],-1)
printHtmlPart(20)
expressionOut.print(pclass?.academicyear)
printHtmlPart(24)
invokeTag('set','g',239,['var':("user"),'value':(sec.username())],-1)
printHtmlPart(25)
if(true && (user=="lkbed2011")) {
printHtmlPart(26)
expressionOut.print(tracker?.remarks.last().toString().replace('[', '').replace(']', ''))
printHtmlPart(27)
}
printHtmlPart(28)
if(true && (temptracker?.totaladmissionfee!='0')) {
printHtmlPart(29)
expressionOut.print(temptracker?.totaladmissionfee)
printHtmlPart(30)
if(true && (temptracker?.currentpaidadmissionfee>=0)) {
printHtmlPart(31)
expressionOut.print(temptracker?.currentpaidadmissionfee)
printHtmlPart(30)
}
else {
printHtmlPart(32)
expressionOut.print(temptracker?.paidadmissionfee)
printHtmlPart(30)
}
printHtmlPart(33)
if(true && (temptracker?.paidadmissionfee==0)) {
printHtmlPart(32)
expressionOut.print(temptracker?.totaladmissionfee)
printHtmlPart(30)
}
else {
printHtmlPart(32)
expressionOut.print(temptracker?.dueadmissionfee)
printHtmlPart(30)
}
printHtmlPart(34)
}
printHtmlPart(33)
loop:{
int j = 0
for( trackerInstance in (temptracker.feetypetracker) ) {
printHtmlPart(35)
expressionOut.print(trackerInstance?.instFeeTypeT)
printHtmlPart(36)
expressionOut.print(trackerInstance?.amountToBePaidT)
printHtmlPart(36)
expressionOut.print(trackerInstance?.amountPaidT)
printHtmlPart(36)
expressionOut.print(trackerInstance?.dueT)
printHtmlPart(37)
j++
}
}
printHtmlPart(33)
if(true && (temptracker?.discountT)) {
printHtmlPart(38)
expressionOut.print((temptracker?.feetypetracker?.sum { it?.amountToBePaidT } + temptracker?.totaladmissionfee))
printHtmlPart(39)
}
else {
}
printHtmlPart(33)
if(true && (temptracker?.penaltyT)) {
printHtmlPart(40)
expressionOut.print(temptracker?.penaltyT)
printHtmlPart(41)
}
else {
}
printHtmlPart(42)
if(true && (temptracker?.feetypetracker)) {
printHtmlPart(43)
if(true && (temptracker?.discountT)) {
printHtmlPart(44)
expressionOut.print((temptracker?.feetypetracker?.sum { it?.amountToBePaidT } + temptracker?.totaladmissionfee)-(temptracker?.discountT))
printHtmlPart(45)
}
else {
printHtmlPart(44)
expressionOut.print(temptracker?.feetypetracker?.sum { it?.amountToBePaidT } + temptracker?.totaladmissionfee)
printHtmlPart(45)
}
printHtmlPart(33)
if(true && (temptracker?.currentpaidadmissionfee)) {
printHtmlPart(44)
expressionOut.print(temptracker?.feetypetracker?.sum { it?.amountPaidT } + temptracker?.currentpaidadmissionfee)
printHtmlPart(45)
}
else {
printHtmlPart(44)
expressionOut.print(temptracker?.feetypetracker?.sum { it?.amountPaidT })
printHtmlPart(45)
}
printHtmlPart(46)
if(true && (temptracker?.paidadmissionfee==0)) {
printHtmlPart(44)
expressionOut.print((temptracker?.feetypetracker?.sum { it?.dueT }+temptracker?.totaladmissionfee-(temptracker?.discountT)))
printHtmlPart(45)
}
else {
printHtmlPart(44)
expressionOut.print((temptracker?.feetypetracker?.sum { it?.dueT }+temptracker?.dueadmissionfee-(temptracker?.discountT)))
printHtmlPart(45)
}
printHtmlPart(47)
}
printHtmlPart(48)
expressionOut.print(temptracker?.discountT)
printHtmlPart(49)
expressionOut.print(sec.username())
printHtmlPart(50)
})
invokeTag('captureBody','sitemesh',388,['class':("body_pop")],1)
printHtmlPart(51)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1706172870293L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
