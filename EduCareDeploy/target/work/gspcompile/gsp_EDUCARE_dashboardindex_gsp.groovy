import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_dashboardindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dashboard/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',10,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',41,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('render','g',47,['template':("/header/logo")],-1)
printHtmlPart(5)
invokeTag('render','g',50,['template':("/header/topBar")],-1)
printHtmlPart(6)
invokeTag('render','g',58,['template':("/header/leftSide"),'model':([activ:[dashboard:'start active open']])],-1)
printHtmlPart(7)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(8)
if(true && (pendings.size() >0)) {
printHtmlPart(9)
}
printHtmlPart(10)
loop:{
int j = 0
for( key in (pendings.keySet()) ) {
printHtmlPart(11)
if(true && (pendings.get(key))) {
printHtmlPart(12)
createTagBody(4, {->
printHtmlPart(13)
expressionOut.print(pendingsdisplay.get(key))
printHtmlPart(14)
})
invokeTag('link','g',93,['controller':(key),'action':("create"),'class':("btn ${colors.getAt(j)} purple uppercase")],4)
printHtmlPart(15)
}
printHtmlPart(16)
j++
}
}
printHtmlPart(17)
if(true && (pendings.size() ==0)) {
printHtmlPart(18)
invokeTag('getDashboardLogo','images',105,['id':(inst?.logo?.id)],-1)
printHtmlPart(19)
expressionOut.print(inst?.name)
printHtmlPart(20)
expressionOut.print(inst?.affiliatedTo)
printHtmlPart(21)
expressionOut.print(inst?.hsno)
printHtmlPart(22)
expressionOut.print(inst?.street)
printHtmlPart(22)
expressionOut.print(inst?.city)
printHtmlPart(23)
expressionOut.print(inst?.pinCode)
printHtmlPart(24)
expressionOut.print(inst?.state)
printHtmlPart(22)
expressionOut.print(inst?.country)
printHtmlPart(25)
expressionOut.print(inst?.phone)
printHtmlPart(26)
}
printHtmlPart(27)
expressionOut.print(staffList)
printHtmlPart(28)
createClosureForHtmlPart(29, 2)
invokeTag('link','g',134,['controller':("staff"),'class':("more"),'action':("index")],2)
printHtmlPart(30)
expressionOut.print(batches)
printHtmlPart(31)
createClosureForHtmlPart(29, 2)
invokeTag('link','g',151,['controller':("batch"),'class':("more"),'action':("index")],2)
printHtmlPart(32)
expressionOut.print(StudentListSize)
printHtmlPart(33)
createClosureForHtmlPart(34, 2)
invokeTag('link','g',169,['controller':("studentList"),'class':("more"),'action':("index")],2)
printHtmlPart(35)
expressionOut.print(chart.keySet())
printHtmlPart(36)
expressionOut.print(chart.values())
printHtmlPart(37)
invokeTag('render','g',205,['template':("/footer/footer")],-1)
printHtmlPart(38)
})
invokeTag('captureBody','sitemesh',265,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(39)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925995364L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
