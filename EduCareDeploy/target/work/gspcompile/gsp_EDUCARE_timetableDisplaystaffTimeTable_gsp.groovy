import com.hiideals.enums.WeekdaysEnum
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_timetableDisplaystaffTimeTable_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/timetableDisplay/staffTimeTable.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('set','g',7,['value':([tt:'start active open',ttstaffList:'active']),'var':("activ"),'scope':("request")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
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
for( _it246452498 in (staffList) ) {
changeItVariable(_it246452498)
printHtmlPart(5)
expressionOut.print(it.staffName)
printHtmlPart(6)
createTagBody(3, {->
printHtmlPart(7)
invokeTag('hiddenField','g',36,['name':("staffId"),'value':(it.id)],-1)
printHtmlPart(7)
invokeTag('submitButton','g',37,['name':("Show TimeTable"),'class':("btn blue")],-1)
printHtmlPart(8)
})
invokeTag('formRemote','g',38,['name':("ff"),'url':([action:'shTT']),'update':("shTT")],3)
printHtmlPart(9)
}
printHtmlPart(10)
})
invokeTag('captureBody','sitemesh',53,[:],1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925997476L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
