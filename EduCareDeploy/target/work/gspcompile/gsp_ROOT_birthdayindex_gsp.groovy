import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_birthdayindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/birthday/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
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
invokeTag('captureHead','sitemesh',47,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('render','g',52,['template':("/header/logo")],-1)
printHtmlPart(5)
invokeTag('render','g',55,['template':("/header/topBar")],-1)
printHtmlPart(6)
invokeTag('render','g',63,['template':("/header/leftSide"),'model':([activ:[BirthDays:'start active open',BirthDays:'active']])],-1)
printHtmlPart(7)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(8)
invokeTag('message','g',73,['code':("default.home.label")],-1)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
invokeTag('actionSubmit','g',88,['class':("btn blue"),'action':("bday"),'value':("Send to all")],-1)
printHtmlPart(11)
})
invokeTag('form','g',91,['controller':("birthday")],2)
printHtmlPart(12)
loop:{
int j = 0
for( c in (bdays) ) {
printHtmlPart(13)
expressionOut.print(c?.studentName)
printHtmlPart(14)
invokeTag('formatDate','g',120,['date':(c?.studentDOB),'type':("date"),'style':("SHORT")],-1)
printHtmlPart(15)
createTagBody(3, {->
printHtmlPart(16)
expressionOut.print(c?.id)
printHtmlPart(17)
invokeTag('actionSubmit','g',127,['value':("send "),'action':("stubday")],-1)
printHtmlPart(18)
})
invokeTag('form','g',127,['controller':("birthday")],3)
printHtmlPart(19)
j++
}
}
printHtmlPart(20)
createTagBody(2, {->
printHtmlPart(21)
expressionOut.print(params.to)
printHtmlPart(22)
invokeTag('submitButton','g',159,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(23)
})
invokeTag('formRemote','g',160,['name':("ss"),'url':([action:'bydate']),'update':("Changedisplay")],2)
printHtmlPart(24)
invokeTag('render','g',177,['template':("/footer/footer")],-1)
printHtmlPart(25)
})
invokeTag('captureBody','sitemesh',225,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(26)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926004964L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
