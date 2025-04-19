import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_listofFeeTypesindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/listofFeeTypes/index.gsp" }
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
invokeTag('captureHead','sitemesh',70,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('render','g',75,['template':("/header/logo")],-1)
printHtmlPart(5)
invokeTag('render','g',78,['template':("/header/topBar")],-1)
printHtmlPart(6)
invokeTag('render','g',86,['template':("/header/leftSide"),'model':([activ:[reports:'start active open',feetypes1:'active']])],-1)
printHtmlPart(7)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('link','g',96,['action':("create"),'controller':("instFeeTypes")],2)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',117,['controller':("listofFeeTypes"),'class':("btn btn-success"),'action':("index")],2)
printHtmlPart(12)
createTagBody(2, {->
printHtmlPart(13)
for( cls in (iclass) ) {
printHtmlPart(14)
expressionOut.print(cls?.id)
printHtmlPart(15)
expressionOut.print(cls?.classname)
printHtmlPart(16)
}
printHtmlPart(17)
invokeTag('submitButton','g',138,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(18)
})
invokeTag('formRemote','g',140,['name':("ssone"),'url':([action:'typeOfFees']),'update':("Changedisplay")],2)
printHtmlPart(19)
invokeTag('render','g',147,['template':("/listofFeeTypes/feetypelist")],-1)
printHtmlPart(20)
invokeTag('render','g',152,['template':("/footer/footer")],-1)
printHtmlPart(21)
})
invokeTag('captureBody','sitemesh',313,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925998431L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
