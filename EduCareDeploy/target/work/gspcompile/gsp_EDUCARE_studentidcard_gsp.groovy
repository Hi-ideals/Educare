import com.hiideals.instituite.helper.AcademicYear
import com.hiideals.instituite.student.ParentDetails
import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.student.Student
import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.classcourses.Section
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_studentidcard_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/student/idcard.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',13,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',13,[:],2)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',52,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',58,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',62,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',71,['template':("/header/leftSide")],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',83,['action':("create")],2)
printHtmlPart(11)
if(true && (flash.msg)) {
printHtmlPart(12)
expressionOut.print(flash.msg)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (flash.msgfee)) {
printHtmlPart(12)
expressionOut.print(studentInstance?.studentName)
printHtmlPart(15)
expressionOut.print(flash.msgfee)
printHtmlPart(13)
}
printHtmlPart(16)
if(true && (flash.message)) {
printHtmlPart(17)
expressionOut.print(flash.message)
printHtmlPart(18)
}
printHtmlPart(19)
createTagBody(2, {->
printHtmlPart(20)
for( batch in (batchList) ) {
printHtmlPart(21)
expressionOut.print(batch.batchName)
printHtmlPart(22)
expressionOut.print(batch.batchName)
printHtmlPart(23)
}
printHtmlPart(24)
expressionOut.print(remoteFunction(controller:'student',action: 'stID',
                       update: 'updateSections',
                       params: '\'classId=\' + this.value'))
printHtmlPart(25)
for( cls in (iclass) ) {
printHtmlPart(26)
expressionOut.print(cls.id)
printHtmlPart(27)
expressionOut.print(cls.classname)
printHtmlPart(28)
}
printHtmlPart(29)
invokeTag('render','g',184,['template':("stID"),'model':([classId:classId])],-1)
printHtmlPart(30)
invokeTag('submitButton','g',194,['name':("Search"),'class':("btn blue"),'style':("margin-top: 22px")],-1)
printHtmlPart(31)
})
invokeTag('form','g',197,['url':([controller:'student',action:'studentIdss']),'update':("Changedisplay")],2)
printHtmlPart(32)
invokeTag('render','g',215,['template':("/footer/footer")],-1)
printHtmlPart(33)
})
invokeTag('captureBody','sitemesh',308,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(34)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926000525L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
