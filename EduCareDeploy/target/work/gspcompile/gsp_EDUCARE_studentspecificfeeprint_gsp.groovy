import com.hiideals.instituite.student.Student
import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_studentspecificfeeprint_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/student/specificfeeprint.gsp" }
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
expressionOut.print(trackerone?.invoiceNo.toString().replace('[', '').replace(']', ''))
printHtmlPart(12)
invokeTag('formatDate','g',176,['date':(trackerone?.lastUpdated[0]),'format':("dd-MMM-yyyy")],-1)
printHtmlPart(13)
expressionOut.print(studentInstance?.studentName)
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
expressionOut.print(studentInstance?.registrationNo)
printHtmlPart(18)
for( _it223268272 in (studentInstance?.academicyear) ) {
changeItVariable(_it223268272)
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
for( _it1605650788 in (studentInstance?.academicyear) ) {
changeItVariable(_it1605650788)
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
expressionOut.print(studentInstance?.fatherDetails?.parentName)
printHtmlPart(23)
expressionOut.print(studentInstance?.presentAddress?.hsno)
printHtmlPart(19)
expressionOut.print(studentInstance?.presentAddress?.street)
printHtmlPart(24)
expressionOut.print(studentInstance?.presentAddress?.city)
printHtmlPart(25)
expressionOut.print(studentInstance?.presentAddress?.pinCode)
printHtmlPart(26)
expressionOut.print(studentInstance?.presentAddress?.state)
printHtmlPart(27)
expressionOut.print(studentInstance?.presentAddress?.country)
printHtmlPart(28)
for( _it2047966658 in (studentInstance?.academicyear) ) {
changeItVariable(_it2047966658)
printHtmlPart(9)
if(true && (it.status == 'current')) {
printHtmlPart(9)
}
printHtmlPart(19)
}
printHtmlPart(19)
invokeTag('set','g',246,['value':(it),'var':("pclass")],-1)
printHtmlPart(20)
expressionOut.print(pclass?.academicyear)
printHtmlPart(29)
invokeTag('set','g',251,['var':("user"),'value':(sec.username())],-1)
printHtmlPart(30)
if(true && (user=="lkbed2011")) {
printHtmlPart(31)
expressionOut.print(trackerone?.remarks.toString().replace('[', '').replace(']', ''))
printHtmlPart(32)
}
printHtmlPart(33)
printHtmlPart(1)
invokeTag('set','g',270,['value':(it.feeId),'var':("feeInstance")],-1)
printHtmlPart(34)
loop:{
int j = 0
for( FeeTypesInstance in (fList) ) {
printHtmlPart(35)
expressionOut.print(j+1)
printHtmlPart(36)
expressionOut.print(FeeTypesInstance?.instFeeTypeT)
printHtmlPart(37)
expressionOut.print(FeeTypesInstance?.amountPaidT)
printHtmlPart(38)
expressionOut.print(FeeTypesInstance?.dueT)
printHtmlPart(39)
j++
}
}
printHtmlPart(40)
expressionOut.print(sec.username())
printHtmlPart(41)
})
invokeTag('captureBody','sitemesh',341,['class':("body_pop")],1)
printHtmlPart(42)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1706090158809L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
