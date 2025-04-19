import com.hiideals.instituite.classcourses.IClass
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_staffAttendancegetStaffAttendanceSheet_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/staffAttendance/getStaffAttendanceSheet.gsp" }
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
invokeTag('captureHead','sitemesh',69,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',78,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',82,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',93,['template':("/header/leftSide"),'model':([activ:[studentAttendance:'start active open',stafftattendancecreate:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',109,['controller':("staffAttendance"),'action':("create")],2)
printHtmlPart(11)
if(true && (flash.message)) {
printHtmlPart(12)
expressionOut.print(flash.message)
printHtmlPart(13)
}
printHtmlPart(14)
createTagBody(2, {->
printHtmlPart(15)
createTagBody(3, {->
printHtmlPart(16)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(17)
expressionOut.print(error.field)
printHtmlPart(18)
}
printHtmlPart(19)
invokeTag('message','g',128,['error':(error)],-1)
printHtmlPart(20)
})
invokeTag('eachError','g',129,['bean':(studentAttendanceInstance),'var':("error")],3)
printHtmlPart(21)
})
invokeTag('hasErrors','g',131,['bean':(studentAttendanceInstance)],2)
printHtmlPart(14)
invokeTag('render','g',132,['template':("form1")],-1)
printHtmlPart(22)
createTagBody(2, {->
printHtmlPart(23)
loop:{
int i = 0
for( staff in (staffList) ) {
printHtmlPart(24)
expressionOut.print(staff?.staffName)
printHtmlPart(25)
expressionOut.print(i)
printHtmlPart(26)
expressionOut.print(i)
printHtmlPart(27)
invokeTag('hiddenField','g',158,['name':("staffID${i}"),'value':(staff?.id)],-1)
printHtmlPart(28)
i++
}
}
printHtmlPart(29)
invokeTag('hiddenField','g',161,['name':("loopSize"),'value':(staffList?.size())],-1)
printHtmlPart(29)
invokeTag('hiddenField','g',163,['name':("attendanceUpdatedBy"),'value':(attendUpdateBy?.id)],-1)
printHtmlPart(29)
invokeTag('hiddenField','g',165,['name':("attendanceDate1"),'value':(params?.attendanceDate1)],-1)
printHtmlPart(29)
invokeTag('hiddenField','g',166,['name':("staffName"),'value':(staffName?.id)],-1)
printHtmlPart(30)
invokeTag('submitButton','g',172,['class':("btn btn-success"),'name':("update attendance")],-1)
printHtmlPart(31)
})
invokeTag('form','g',176,['url':([resource:studentAttendanceInstance, action:'save'])],2)
printHtmlPart(32)
invokeTag('render','g',184,['template':("/footer/footer")],-1)
printHtmlPart(33)
})
invokeTag('captureBody','sitemesh',269,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(34)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926011411L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
