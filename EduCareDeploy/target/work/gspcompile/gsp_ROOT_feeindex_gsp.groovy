import com.hiideals.instituite.feemanagment.Fee
import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_feeindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/fee/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',15,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',15,[:],2)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',18,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',19,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',58,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',64,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',67,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',76,['template':("/header/leftSide"),'model':([activ:[feeStructure:'start active open',fee:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
createClosureForHtmlPart(12, 3)
invokeTag('link','g',112,['class':("btn blue"),'controller':("student"),'action':("specificfeeprint"),'id':(LookUpED.decod(params.id)),'target':("_blank")],3)
printHtmlPart(13)
}
printHtmlPart(14)
createTagBody(2, {->
printHtmlPart(15)
invokeTag('field','g',174,['type':("text"),'name':("amount"),'class':("form-control")],-1)
printHtmlPart(16)
invokeTag('submitButton','g',183,['name':("submit"),'class':("btn btn blue btn-primary btn-block")],-1)
printHtmlPart(17)
})
invokeTag('form','g',187,['action':("index")],2)
printHtmlPart(18)
createTagBody(2, {->
printHtmlPart(19)
expressionOut.print(params.to)
printHtmlPart(20)
invokeTag('submitButton','g',207,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(21)
})
invokeTag('form','g',211,['name':("ss"),'url':([action:'index'])],2)
printHtmlPart(22)
invokeTag('getImage','images',231,['id':(institute?.logo?.id),'width':("100px"),'height':("100px")],-1)
printHtmlPart(23)
expressionOut.print(institute?.name)
printHtmlPart(24)
expressionOut.print(institute?.affiliatedTo)
printHtmlPart(25)
invokeTag('message','g',257,['code':("fee.studentId.label"),'default':("Student Name")],-1)
printHtmlPart(26)
invokeTag('message','g',262,['code':(message(code: 'fee.due.label', default: 'Due'))],-1)
printHtmlPart(27)
invokeTag('message','g',265,['code':(message(code: 'fee.totalFee.label', default: 'Total Fee'))],-1)
printHtmlPart(28)
invokeTag('message','g',269,['code':(message(code: 'fee.totalPaid.label', default: 'Total Paid'))],-1)
printHtmlPart(29)
expressionOut.print(message(code: 'fee.lastUpdated.label', default: 'Last Updated on'))
printHtmlPart(30)
if(true && (feeInstanceList)) {
printHtmlPart(31)
loop:{
int i = 0
for( feeInstance in (feeInstanceList) ) {
printHtmlPart(32)
if(true && (feeInstance !=null)) {
printHtmlPart(33)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(34)
expressionOut.print(fieldValue(bean: feeInstance?.studentId, field: "studentName"))
printHtmlPart(35)
expressionOut.print(feeInstance?.academic?.presentclass?.classname)
printHtmlPart(35)
expressionOut.print(feeInstance?.academic?.section?.sectionName)
printHtmlPart(36)
expressionOut.print(feeInstance?.totalFee-feeInstance?.totalPaid)
printHtmlPart(36)
expressionOut.print(fieldValue(bean: feeInstance, field: "totalFee"))
printHtmlPart(36)
expressionOut.print(fieldValue(bean: feeInstance, field: "discount"))
printHtmlPart(35)
expressionOut.print(fieldValue(bean: feeInstance, field: "totalPaid"))
printHtmlPart(35)
expressionOut.print(fieldValue(bean: feeInstance, field: "lastUpdated"))
printHtmlPart(35)
expressionOut.print(feeInstance?.academic?.academicyear)
printHtmlPart(37)
createClosureForHtmlPart(38, 5)
invokeTag('link','g',317,['controller':("fee"),'action':("edit"),'id':(LookUpED.encod(feeInstance?.id)),'title':("")],5)
printHtmlPart(39)
createClosureForHtmlPart(40, 5)
invokeTag('link','g',319,['controller':("student"),'action':("show"),'id':(LookUpED.encod(feeInstance?.studentId?.id))],5)
printHtmlPart(41)
if(true && (feeInstance.due==0)) {
printHtmlPart(41)
}
else {
printHtmlPart(42)
createClosureForHtmlPart(43, 6)
invokeTag('link','g',324,['controller':("fee"),'action':("feenotice"),'params':([id:feeInstance?.studentId?.id]),'target':("blank")],6)
printHtmlPart(41)
}
printHtmlPart(44)
}
printHtmlPart(31)
i++
}
}
printHtmlPart(45)
expressionOut.print(duesum)
printHtmlPart(46)
expressionOut.print(Totalsum)
printHtmlPart(46)
expressionOut.print(discountsum)
printHtmlPart(46)
expressionOut.print(Paidsum)
printHtmlPart(47)
}
else {
printHtmlPart(48)
}
printHtmlPart(49)
invokeTag('paginate','g',358,['total':(feeInstanceCount ?: 0),'params':(params)],-1)
printHtmlPart(50)
invokeTag('render','g',374,['template':("/footer/footer")],-1)
printHtmlPart(51)
})
invokeTag('captureBody','sitemesh',473,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(52)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1705990051774L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
