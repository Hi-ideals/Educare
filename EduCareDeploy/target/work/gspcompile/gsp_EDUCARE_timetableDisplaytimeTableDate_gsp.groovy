import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_timetableDisplaytimeTableDate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/timetableDisplay/timeTableDate.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('set','g',7,['value':([tt:'start active open',ttList:'active']),'var':("activ"),'scope':("request")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=ISO-8859-1")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',10,[:],2)
printHtmlPart(0)
})
invokeTag('captureHead','sitemesh',11,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(3)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(4)
invokeTag('message','g',18,['code':("default.home.label")],-1)
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
invokeTag('datePicker','g',29,['name':("date"),'precision':("day")],-1)
printHtmlPart(7)
invokeTag('submitButton','g',31,['class':("btn blue"),'name':("Get Time Table")],-1)
printHtmlPart(8)
})
invokeTag('form','g',33,['action':("timeTableDetails")],2)
printHtmlPart(9)
for( iclass in (iclassList) ) {
printHtmlPart(10)
for( section in (iclass.sections) ) {
printHtmlPart(11)
expressionOut.print(iclass.classname)
printHtmlPart(12)
expressionOut.print(section.sectionName)
printHtmlPart(13)
createClosureForHtmlPart(14, 4)
invokeTag('link','g',63,['class':("btn blue"),'controller':("timetableDisplay"),'action':("showTimeTable"),'params':([cid:iclass?.id,sid:section?.id])],4)
printHtmlPart(15)
createClosureForHtmlPart(16, 4)
invokeTag('link','g',66,['class':("btn green"),'controller':("timetableDisplay"),'action':("deleteTime"),'params':([cid:iclass?.id,sid:section?.id])],4)
printHtmlPart(17)
}
printHtmlPart(18)
}
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',81,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925997425L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
