import com.hiideals.instituite.student.Student
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_listofFeesgetOndatefeereportprint_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/listofFees/getOndatefeereportprint.gsp" }
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
createTagBody(3, {->
printHtmlPart(2)
expressionOut.print(studentInstance?.studentName)
})
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
invokeTag('captureHead','sitemesh',73,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',82,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',85,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('getImage','images',109,['id':(institute?.logo?.id),'width':("110px")],-1)
printHtmlPart(8)
expressionOut.print(institute?.name)
printHtmlPart(9)
expressionOut.print(institute?.affiliatedTo)
printHtmlPart(10)
expressionOut.print(institute?.hsno)
printHtmlPart(11)
expressionOut.print(institute?.street)
printHtmlPart(11)
expressionOut.print(institute?.city)
printHtmlPart(12)
expressionOut.print(institute?.pinCode)
printHtmlPart(13)
expressionOut.print(institute?.state)
printHtmlPart(11)
expressionOut.print(institute?.country)
printHtmlPart(14)
expressionOut.print(institute?.phone)
printHtmlPart(15)
expressionOut.print(params.from)
printHtmlPart(16)
expressionOut.print(params.to)
printHtmlPart(17)
loop:{
int i = 0
for( feetracker in (tracker) ) {
printHtmlPart(18)
for( _it124017533 in (arryl[i]?.academicyear) ) {
changeItVariable(_it124017533)
printHtmlPart(19)
if(true && (it.status == 'current')) {
printHtmlPart(19)
}
printHtmlPart(20)
}
printHtmlPart(11)
invokeTag('set','g',161,['value':(it?.presentclass),'var':("pclass")],-1)
printHtmlPart(11)
expressionOut.print(pclass.classname)
printHtmlPart(21)
for( _it1280363901 in (arryl[i]?.academicyear) ) {
changeItVariable(_it1280363901)
printHtmlPart(19)
if(true && (it.status == 'current')) {
printHtmlPart(19)
}
printHtmlPart(20)
}
printHtmlPart(11)
invokeTag('set','g',169,['value':(it?.section),'var':("pclass")],-1)
printHtmlPart(11)
expressionOut.print(pclass?.sectionName)
printHtmlPart(22)
expressionOut.print(feetracker?.studentName)
printHtmlPart(23)
expressionOut.print(arryl?.fatherDetails?.parentName[i])
printHtmlPart(23)
expressionOut.print((arryl?.studentId)[i])
printHtmlPart(24)
expressionOut.print(feetracker?.invoiceNo)
printHtmlPart(25)
expressionOut.print(feetracker?.paidadmissionfee)
printHtmlPart(26)
expressionOut.print(arl[i])
printHtmlPart(27)
invokeTag('formatDate','g',188,['format':("dd-MMM-yyyy"),'date':(feetracker?.dateCreated)],-1)
printHtmlPart(28)
i++
}
}
printHtmlPart(29)
expressionOut.print(Paidadmissionsum)
printHtmlPart(30)
expressionOut.print(Paidsum)
printHtmlPart(31)
expressionOut.print(bothfees)
printHtmlPart(32)
expressionOut.print(sec.username())
printHtmlPart(33)
invokeTag('render','g',259,['template':("/footer/footer")],-1)
printHtmlPart(34)
})
invokeTag('captureBody','sitemesh',305,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(35)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1706097158907L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
