import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_vehicleDetailsindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/vehicleDetails/index.gsp" }
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
invokeTag('captureHead','sitemesh',53,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',62,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',66,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',77,['template':("/header/leftSide"),'model':([activ:[TransportManagement:'start active open',AddVechile:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
invokeTag('message','g',94,['code':("default.home.label")],-1)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',96,['class':("create"),'action':("create")],2)
printHtmlPart(12)
if(true && (flash.message)) {
printHtmlPart(13)
expressionOut.print(flash.message)
printHtmlPart(14)
}
printHtmlPart(15)
loop:{
int i = 0
for( vehicleDetailsInstance in (vehicleDetailsInstanceList) ) {
printHtmlPart(16)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(17)
expressionOut.print(fieldValue(bean: vehicleDetailsInstance, field: "vehicleNo"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: vehicleDetailsInstance, field: "noOfSeats"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: vehicleDetailsInstance, field: "contactPerson"))
printHtmlPart(20)
createClosureForHtmlPart(21, 3)
invokeTag('link','g',157,['action':("show"),'id':(LookUpED.encod(vehicleDetailsInstance.id))],3)
printHtmlPart(22)
createTagBody(3, {->
printHtmlPart(23)
createTagBody(4, {->
printHtmlPart(24)
invokeTag('message','g',168,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(25)
})
invokeTag('link','g',169,['action':("edit"),'id':(LookUpED.encod(vehicleDetailsInstance.id))],4)
printHtmlPart(26)
})
invokeTag('form','g',171,['url':([resource:vehicleDetailsInstance, action:'delete']),'method':("DELETE")],3)
printHtmlPart(27)
i++
}
}
printHtmlPart(28)
invokeTag('paginate','g',178,['total':(vehicleDetailsInstanceCount ?: 0)],-1)
printHtmlPart(29)
invokeTag('render','g',187,['template':("/footer/footer")],-1)
printHtmlPart(30)
})
invokeTag('captureBody','sitemesh',237,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(31)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926019602L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
