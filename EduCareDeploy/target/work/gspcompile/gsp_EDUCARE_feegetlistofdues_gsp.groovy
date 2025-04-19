import com.hiideals.instituite.feemanagment.Fee
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_feegetlistofdues_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/fee/getlistofdues.gsp" }
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
createClosureForHtmlPart(2, 3)
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
invokeTag('captureHead','sitemesh',48,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',57,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',61,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('getImage','images',81,['id':(instituite?.logo?.id)],-1)
printHtmlPart(8)
expressionOut.print(instituite?.caption)
printHtmlPart(9)
expressionOut.print(instituite?.name)
printHtmlPart(10)
expressionOut.print(instituite?.affiliatedTo)
printHtmlPart(11)
loop:{
int i = 0
for( feedue in (feedueList) ) {
printHtmlPart(12)
expressionOut.print(fieldValue(bean: feedue?.studentId, field: "studentName"))
printHtmlPart(13)
expressionOut.print(fieldValue(bean: feedue, field: "due"))
printHtmlPart(14)
expressionOut.print(fieldValue(bean: feedue, field: "totalFee"))
printHtmlPart(14)
expressionOut.print(fieldValue(bean: feedue, field: "totalPaid"))
printHtmlPart(15)
i++
}
}
printHtmlPart(16)
invokeTag('paginate','g',159,['total':(feeInstanceCount ?: 0)],-1)
printHtmlPart(17)
invokeTag('render','g',169,['template':("/footer/footer")],-1)
printHtmlPart(18)
})
invokeTag('captureBody','sitemesh',197,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926001695L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
