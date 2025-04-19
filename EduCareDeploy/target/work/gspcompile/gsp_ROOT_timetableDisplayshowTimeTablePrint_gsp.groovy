import com.hiideals.instituite.student.Student
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_timetableDisplayshowTimeTablePrint_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/timetableDisplay/showTimeTablePrint.gsp" }
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
invokeTag('getImage','images',105,['id':(instituite?.logo?.id),'width':("100px")],-1)
printHtmlPart(8)
expressionOut.print(instituite?.name)
printHtmlPart(9)
expressionOut.print(instituite?.affiliatedTo)
printHtmlPart(10)
expressionOut.print(instituite?.hsno)
printHtmlPart(11)
expressionOut.print(instituite?.street)
printHtmlPart(11)
expressionOut.print(instituite?.city)
printHtmlPart(12)
expressionOut.print(instituite?.pinCode)
printHtmlPart(13)
expressionOut.print(instituite?.state)
printHtmlPart(11)
expressionOut.print(instituite?.country)
printHtmlPart(14)
expressionOut.print(instituite?.phone)
printHtmlPart(15)
expressionOut.print(iclass?.classname)
printHtmlPart(16)
expressionOut.print(section?.sectionName)
printHtmlPart(17)
expressionOut.print(100/(noOfColumnsCount+1 ?: 1))
printHtmlPart(18)
loop:{
int i = 0
for( tim in (single?.timetables) ) {
printHtmlPart(19)
expressionOut.print(100/(noOfColumnsCount+1))
printHtmlPart(20)
expressionOut.print(tim.periodName)
printHtmlPart(21)
expressionOut.print(tim?.periodtimings)
printHtmlPart(22)
if(true && (single?.lunchAfterPeriod == (i+1))) {
printHtmlPart(23)
expressionOut.print(classTimeTable?.size()+1)
printHtmlPart(24)
}
printHtmlPart(25)
i++
}
}
printHtmlPart(26)
for( _it573207593 in (classTimeTable) ) {
changeItVariable(_it573207593)
printHtmlPart(27)
expressionOut.print(100/(noOfColumnsCount+1 ?: 1))
printHtmlPart(28)
expressionOut.print(it.availableFor)
printHtmlPart(29)
loop:{
int i = 0
for( tt in (it.timetables) ) {
printHtmlPart(30)
expressionOut.print(100/(noOfColumnsCount+1 ?: 1))
printHtmlPart(31)
expressionOut.print((i+1)+1)
printHtmlPart(32)
expressionOut.print(tt.subject?.subjectName)
printHtmlPart(33)
expressionOut.print(tt.staff?.staffName)
printHtmlPart(34)
i++
}
}
printHtmlPart(35)
}
printHtmlPart(36)
expressionOut.print(noOfColumnsCount+1)
printHtmlPart(37)
invokeTag('render','g',253,['template':("/footer/footer")],-1)
printHtmlPart(38)
})
invokeTag('captureBody','sitemesh',291,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(39)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925997420L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
