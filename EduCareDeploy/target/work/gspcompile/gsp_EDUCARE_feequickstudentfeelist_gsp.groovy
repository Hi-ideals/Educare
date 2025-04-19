import com.hiideals.instituite.classcourses.IClass
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_feequickstudentfeelist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/fee/quickstudentfeelist.gsp" }
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
invokeTag('captureHead','sitemesh',61,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',67,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',70,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',79,['template':("/header/leftSide"),'model':([activ:[feeStructure:'start active open',fee3:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',91,['action':("create"),'controller':("student")],2)
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(12)
expressionOut.print(remoteFunction(controller:'fee',action: 'reclassSections',
                       update: 'updateSections',
                       params: '\'classId=\' + this.value'))
printHtmlPart(13)
for( cls in (studentInstanceList[0]?.instituite?.classes) ) {
printHtmlPart(14)
expressionOut.print(cls.id)
printHtmlPart(15)
expressionOut.print(cls.classname)
printHtmlPart(16)
}
printHtmlPart(17)
invokeTag('render','g',151,['template':("section"),'model':([classId:classId])],-1)
printHtmlPart(18)
for( batch in (batchList) ) {
printHtmlPart(14)
expressionOut.print(batch.batchName)
printHtmlPart(15)
expressionOut.print(batch.batchName)
printHtmlPart(16)
}
printHtmlPart(19)
invokeTag('submitButton','g',173,['name':("Search"),'class':("btn blue"),'id':("Collectstudentfee"),'style':("margin-top: 22px")],-1)
printHtmlPart(20)
})
invokeTag('formRemote','g',176,['name':("formremote"),'url':([action:'quickstudentfee']),'update':("Changedisplay")],2)
printHtmlPart(21)
invokeTag('render','g',200,['template':("/footer/footer")],-1)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',273,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926001569L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
