import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_listofFeesindividualstudentFees_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/listofFees/individualstudentFees.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',12,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',12,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',66,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',75,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',79,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',90,['template':("/header/leftSide"),'model':([activ:[reports:'start active open',feelist1:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',106,['action':("create"),'controller':("student")],2)
printHtmlPart(11)
invokeTag('getImage','images',122,['id':(institute?.logo?.id),'width':("100px"),'height':("100px")],-1)
printHtmlPart(12)
expressionOut.print(institute?.caption)
printHtmlPart(13)
expressionOut.print(institute?.name)
printHtmlPart(14)
expressionOut.print(institute?.affiliatedTo)
printHtmlPart(15)
expressionOut.print(params.from)
printHtmlPart(16)
expressionOut.print(params.to)
printHtmlPart(17)
loop:{
int i = 0
for( feetracker in (tracker) ) {
printHtmlPart(18)
for( _it1869116781 in (arryl[i]?.academicyear) ) {
changeItVariable(_it1869116781)
printHtmlPart(19)
if(true && (it.status == 'current')) {
printHtmlPart(19)
}
printHtmlPart(20)
}
printHtmlPart(21)
invokeTag('set','g',170,['value':(it?.presentclass),'var':("pclass")],-1)
printHtmlPart(21)
expressionOut.print(pclass.classname)
printHtmlPart(22)
for( _it899179938 in (arryl[i]?.academicyear) ) {
changeItVariable(_it899179938)
printHtmlPart(19)
if(true && (it.status == 'current')) {
printHtmlPart(19)
}
printHtmlPart(20)
}
printHtmlPart(21)
invokeTag('set','g',178,['value':(it?.section),'var':("pclass")],-1)
printHtmlPart(21)
expressionOut.print(pclass?.sectionName)
printHtmlPart(23)
expressionOut.print(feetracker?.studentName)
printHtmlPart(24)
expressionOut.print(arryl?.fatherDetails?.parentName[i])
printHtmlPart(24)
expressionOut.print((arryl?.studentId)[i])
printHtmlPart(25)
expressionOut.print(feetracker?.invoiceNo)
printHtmlPart(26)
expressionOut.print(feetracker?.paidadmissionfee)
printHtmlPart(27)
expressionOut.print(arl[i])
printHtmlPart(28)
invokeTag('formatDate','g',195,['format':("dd-MMM-yyyy"),'date':(feetracker?.dateCreated)],-1)
printHtmlPart(29)
i++
}
}
printHtmlPart(30)
expressionOut.print(Paidadmissionsum)
printHtmlPart(31)
expressionOut.print(Paidsum)
printHtmlPart(32)
expressionOut.print(bothfees)
printHtmlPart(33)
createTagBody(2, {->
printHtmlPart(20)
invokeTag('hiddenField','g',228,['name':("field"),'value':(params?.field)],-1)
printHtmlPart(20)
invokeTag('hiddenField','g',233,['name':("iclass"),'value':(params?.iclass)],-1)
printHtmlPart(20)
invokeTag('hiddenField','g',235,['name':("from"),'value':(params?.from)],-1)
printHtmlPart(20)
invokeTag('hiddenField','g',236,['name':("typ"),'value':(params?.typ)],-1)
printHtmlPart(20)
invokeTag('hiddenField','g',237,['name':("to"),'value':(params?.to)],-1)
printHtmlPart(20)
invokeTag('hiddenField','g',238,['name':("amount"),'value':(params?.amount)],-1)
printHtmlPart(20)
invokeTag('hiddenField','g',239,['name':("Search"),'value':("Search")],-1)
printHtmlPart(34)
invokeTag('submitButton','g',240,['class':("btn blue"),'name':("Get Print")],-1)
printHtmlPart(35)
})
invokeTag('form','g',241,['controller':("listofFees"),'action':("getOndatefeereportprint"),'target':("_blank")],2)
printHtmlPart(36)
invokeTag('render','g',243,['template':("/footer/footer")],-1)
printHtmlPart(37)
})
invokeTag('captureBody','sitemesh',295,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(38)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1706097593939L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
