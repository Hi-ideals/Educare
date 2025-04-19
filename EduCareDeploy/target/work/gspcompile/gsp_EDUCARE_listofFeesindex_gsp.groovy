import com.hiideals.instituite.classcourses.IClass
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_listofFeesindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/listofFees/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',13,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',13,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',69,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',78,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',82,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',93,['template':("/header/leftSide"),'model':([activ:[reports:'start active open',feelist1:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',109,['action':("create"),'controller':("student")],2)
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(12)
for( cls in (iclass) ) {
printHtmlPart(13)
expressionOut.print(cls.id)
printHtmlPart(14)
expressionOut.print(cls.classname)
printHtmlPart(15)
}
printHtmlPart(16)
for( cls in (academicYearList) ) {
printHtmlPart(13)
expressionOut.print(cls.batchName)
printHtmlPart(14)
expressionOut.print(cls.batchName)
printHtmlPart(15)
}
printHtmlPart(17)
invokeTag('submitButton','g',180,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(18)
})
invokeTag('formRemote','g',181,['name':("kk"),'url':([action:'byYear']),'update':("Changedisplay")],2)
printHtmlPart(19)
createTagBody(2, {->
printHtmlPart(20)
expressionOut.print(params.to)
printHtmlPart(21)
invokeTag('submitButton','g',206,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(18)
})
invokeTag('form','g',207,['action':("individualstudentFees"),'target':("_blank")],2)
printHtmlPart(22)
createTagBody(2, {->
printHtmlPart(23)
invokeTag('field','g',237,['type':("text"),'name':("amount"),'class':("form-control")],-1)
printHtmlPart(24)
invokeTag('submitButton','g',262,['name':("submit"),'class':("btn btn-primary btn-block")],-1)
printHtmlPart(25)
})
invokeTag('form','g',264,['action':("index")],2)
printHtmlPart(26)
createTagBody(2, {->
printHtmlPart(27)
expressionOut.print(params.to)
printHtmlPart(21)
invokeTag('submitButton','g',286,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(18)
})
invokeTag('form','g',289,['name':("ss"),'url':([action:'index']),'update':("Changedisplay")],2)
printHtmlPart(28)
invokeTag('message','g',306,['code':("fee.studentId.label"),'default':("Student Name")],-1)
printHtmlPart(29)
invokeTag('message','g',318,['code':(message(code: 'fee.totalFee.label', default: 'Total Fee'))],-1)
printHtmlPart(30)
invokeTag('message','g',321,['code':(message(code: 'fee.totalPaid.label', default: 'Total Paid'))],-1)
printHtmlPart(31)
invokeTag('message','g',323,['code':(message(code: 'fee.due.label', default: 'Due'))],-1)
printHtmlPart(32)
expressionOut.print(message(code: 'fee.lastUpdated.label', default: 'Updated Date'))
printHtmlPart(33)
loop:{
int i = 0
for( feeInstance in (feeInstanceList) ) {
printHtmlPart(34)
if(true && (feeInstance !=null)) {
printHtmlPart(35)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(36)
expressionOut.print(fieldValue(bean: feeInstance?.studentId, field: "studentName"))
printHtmlPart(37)
expressionOut.print(fieldValue(bean: feeInstance?.studentId?.fatherDetails, field: "parentName"))
printHtmlPart(38)
expressionOut.print(fieldValue(bean: feeInstance, field: "totalFee"))
printHtmlPart(39)
expressionOut.print(fieldValue(bean: feeInstance, field: "totalPaid"))
printHtmlPart(40)
expressionOut.print(fieldValue(bean: feeInstance, field: "due"))
printHtmlPart(41)
invokeTag('formatDate','g',367,['format':("dd-MMM-yyyy"),'date':(feeInstance.dateCreated)],-1)
printHtmlPart(42)
invokeTag('formatDate','g',369,['format':("dd-MMM-yyyy"),'date':(feeInstance.lastUpdated)],-1)
printHtmlPart(43)
expressionOut.print(feeInstance?.academic?.presentclass?.classname)
printHtmlPart(44)
expressionOut.print(feeInstance?.academic?.academicyear)
printHtmlPart(45)
}
printHtmlPart(46)
i++
}
}
printHtmlPart(47)
expressionOut.print(Totalsum)
printHtmlPart(48)
expressionOut.print(Paidsum)
printHtmlPart(49)
expressionOut.print(duesum)
printHtmlPart(50)
createTagBody(2, {->
printHtmlPart(51)
invokeTag('hiddenField','g',397,['name':("field"),'value':(params?.field)],-1)
printHtmlPart(51)
invokeTag('hiddenField','g',398,['name':("iclass"),'value':(params?.iclass)],-1)
printHtmlPart(51)
invokeTag('hiddenField','g',401,['name':("from"),'value':(params?.from)],-1)
printHtmlPart(51)
invokeTag('hiddenField','g',403,['name':("typ"),'value':(params?.typ)],-1)
printHtmlPart(51)
invokeTag('hiddenField','g',406,['name':("to"),'value':(params?.to)],-1)
printHtmlPart(51)
invokeTag('hiddenField','g',409,['name':("amount"),'value':(params?.amount)],-1)
printHtmlPart(51)
invokeTag('hiddenField','g',410,['name':("Search"),'value':("Search")],-1)
printHtmlPart(52)
invokeTag('submitButton','g',411,['class':("btn blue"),'name':("Get Print")],-1)
printHtmlPart(53)
})
invokeTag('form','g',411,['controller':("listofFees"),'action':("getfeelist"),'target':("_blank")],2)
printHtmlPart(54)
invokeTag('render','g',414,['template':("/footer/footer")],-1)
printHtmlPart(55)
})
invokeTag('captureBody','sitemesh',551,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(56)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1705991566239L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
