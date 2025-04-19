import com.hiideals.instituite.student.Student
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_studentspecificviewfeedetail_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/student/specificviewfeedetail.gsp" }
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
invokeTag('captureHead','sitemesh',110,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('getImage','images',124,['id':(instituite?.logo?.id),'width':("50px"),'height':("50px"),'alt':("Image"),'title':("Images")],-1)
printHtmlPart(6)
expressionOut.print(instituite?.name)
printHtmlPart(7)
expressionOut.print(instituite?.hsno)
printHtmlPart(8)
expressionOut.print(instituite?.street)
printHtmlPart(8)
expressionOut.print(instituite?.city)
printHtmlPart(9)
expressionOut.print(instituite?.pinCode)
printHtmlPart(10)
expressionOut.print(instituite?.state)
printHtmlPart(8)
expressionOut.print(instituite?.country)
printHtmlPart(11)
expressionOut.print(instituite?.phone)
printHtmlPart(12)
invokeTag('formatDate','g',146,['date':(tracker?.lastUpdated),'format':("dd-MMM-yyyy")],-1)
printHtmlPart(13)
expressionOut.print(tracker?.invoiceNo)
printHtmlPart(14)
expressionOut.print(stdetails?.studentName)
printHtmlPart(8)
expressionOut.print(stdetails?.lastName)
printHtmlPart(15)
expressionOut.print(stdetails?.studentId)
printHtmlPart(16)
for( _it1787830293 in (stdetails?.academicyear) ) {
changeItVariable(_it1787830293)
printHtmlPart(17)
if(true && (it.status == 'current')) {
printHtmlPart(17)
}
printHtmlPart(18)
}
printHtmlPart(8)
invokeTag('set','g',165,['value':(it?.presentclass),'var':("pclass")],-1)
printHtmlPart(8)
expressionOut.print(pclass?.classname)
printHtmlPart(19)
for( _it1440325059 in (studentInstance?.academicyear) ) {
changeItVariable(_it1440325059)
printHtmlPart(17)
if(true && (it.status == 'current')) {
printHtmlPart(17)
}
printHtmlPart(18)
}
printHtmlPart(8)
invokeTag('set','g',172,['value':(it?.section),'var':("pclass")],-1)
printHtmlPart(8)
expressionOut.print(pclass?.sectionName)
printHtmlPart(20)
expressionOut.print(stdetails?.fatherDetails?.parentName)
printHtmlPart(21)
for( _it1377456236 in (stdetails?.academicyear) ) {
changeItVariable(_it1377456236)
printHtmlPart(17)
if(true && (it.status == 'current')) {
printHtmlPart(17)
}
printHtmlPart(18)
}
printHtmlPart(8)
invokeTag('set','g',182,['value':(it),'var':("pclass")],-1)
printHtmlPart(8)
expressionOut.print(pclass?.academicyear)
printHtmlPart(22)
invokeTag('set','g',185,['var':("user"),'value':(sec.username())],-1)
printHtmlPart(18)
if(true && (user=="lkbed2011")) {
printHtmlPart(23)
expressionOut.print(tracker?.remarks.toString().replace('[', '').replace(']', ''))
printHtmlPart(24)
}
printHtmlPart(25)
if(true && (studentInstance?.profilePic !=null)) {
printHtmlPart(26)
invokeTag('getImage','images',196,['id':(studentInstance?.profilePic?.id),'width':("60"),'height':("60"),'alt':("Image"),'border':("0"),'title':("Images")],-1)
printHtmlPart(27)
}
else {
printHtmlPart(28)
}
printHtmlPart(29)
loop:{
int j = 0
for( trackerInstance in (fList) ) {
printHtmlPart(30)
expressionOut.print(j+1)
printHtmlPart(31)
expressionOut.print(trackerInstance?.instFeeTypeT)
printHtmlPart(32)
expressionOut.print(trackerInstance?.amountPaidT)
printHtmlPart(33)
j++
}
}
printHtmlPart(34)
})
invokeTag('captureBody','sitemesh',251,['class':("body_pop")],1)
printHtmlPart(35)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1706088897769L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
