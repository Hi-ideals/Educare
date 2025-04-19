import com.hiideals.instituite.student.Student
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_studycertificateprintstudycertificate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/studycertificate/printstudycertificate.gsp" }
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
invokeTag('captureHead','sitemesh',74,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',83,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',86,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('getImage','images',111,['id':(instituite?.logo?.id),'width':("100px")],-1)
printHtmlPart(8)
expressionOut.print(instituite?.name)
printHtmlPart(9)
expressionOut.print(instituite?.affiliatedTo)
printHtmlPart(10)
expressionOut.print(studyobj.id)
printHtmlPart(11)
expressionOut.print(studyobj.stregistrationnumber)
printHtmlPart(12)
expressionOut.print(studyobj?.stname)
printHtmlPart(13)
expressionOut.print(studyobj?.ftname)
printHtmlPart(14)
expressionOut.print(studyobj.stregistrationnumber)
printHtmlPart(15)
expressionOut.print(studyobj?.fromclass)
printHtmlPart(16)
expressionOut.print(studyobj?.toclass)
printHtmlPart(17)
expressionOut.print(studyobj?.fromdate)
printHtmlPart(18)
expressionOut.print(studyobj?.todate)
printHtmlPart(19)
expressionOut.print(instituite?.name)
printHtmlPart(20)
expressionOut.print(studyobj.stdate)
printHtmlPart(21)
createClosureForHtmlPart(22, 2)
invokeTag('link','g',175,['class':("btn blue"),'controller':("studycertificate"),'action':("index")],2)
printHtmlPart(23)
invokeTag('render','g',189,['template':("/footer/footer")],-1)
printHtmlPart(24)
})
invokeTag('captureBody','sitemesh',227,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(25)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925998982L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
