import com.hiideals.instituite.student.Student
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_bonafiedcrtprintbonafied_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bonafiedcrt/printbonafied.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(0)
createTagBody(2, {->
createTagBody(3, {->
printHtmlPart(2)
expressionOut.print(studentInstance?.studentName)
})
invokeTag('captureTitle','sitemesh',12,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',12,[:],2)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',63,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('render','g',68,['template':("/header/logo")],-1)
printHtmlPart(5)
invokeTag('render','g',69,['template':("/header/topBar")],-1)
printHtmlPart(6)
invokeTag('getImage','images',90,['id':(instituite?.logo?.id),'width':("100px")],-1)
printHtmlPart(7)
expressionOut.print(instituite?.name)
printHtmlPart(8)
expressionOut.print(instituite?.affiliatedTo)
printHtmlPart(9)
expressionOut.print(bncert.id)
printHtmlPart(10)
expressionOut.print(stbonafieddetails?.registrationNo)
printHtmlPart(11)
expressionOut.print(bncert?.stname)
printHtmlPart(12)
expressionOut.print(bncert?.stfathername)
printHtmlPart(13)
expressionOut.print(instituite?.name)
printHtmlPart(14)
expressionOut.print(bncert?.stclass)
printHtmlPart(15)
expressionOut.print(bncert?.stcharacter)
printHtmlPart(16)
expressionOut.print(instituite?.name)
printHtmlPart(17)
expressionOut.print(bncert.academicyr)
printHtmlPart(18)
expressionOut.print(bncert?.issueddate)
printHtmlPart(19)
createClosureForHtmlPart(20, 2)
invokeTag('link','g',178,['class':("btn blue"),'controller':("bonafiedcrt"),'action':("index")],2)
printHtmlPart(21)
invokeTag('render','g',188,['template':("/footer/footer")],-1)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',215,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926006407L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
