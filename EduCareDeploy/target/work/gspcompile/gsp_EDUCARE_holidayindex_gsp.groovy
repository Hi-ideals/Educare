import com.hiideals.instituite.classcourses.IClass
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_holidayindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/holiday/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',13,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',13,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
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
invokeTag('render','g',93,['template':("/header/leftSide"),'model':([activ:[Certificates:'start active open',holidaynotice:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',109,['controller':("holiday"),'action':("index")],2)
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(12)
invokeTag('actionSubmit','g',157,['class':("btn btn-primary"),'action':("holidaysave"),'value':("Submit")],-1)
printHtmlPart(13)
})
invokeTag('form','g',160,['controller':("holiday"),'action':("holidaysave")],2)
printHtmlPart(14)
invokeTag('message','g',177,['code':("Holidaynotice.holidaydate.label"),'default':("Holiday date")],-1)
printHtmlPart(15)
invokeTag('message','g',181,['code':("Holidaynotice.toholidaydate.label"),'default':("To Holiday date")],-1)
printHtmlPart(16)
invokeTag('message','g',184,['code':("Holidaynotice.holidayreason.label"),'default':("Holiday reason")],-1)
printHtmlPart(17)
loop:{
int i = 0
for( holidayInstance in (holidaylist) ) {
printHtmlPart(18)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(19)
expressionOut.print(fieldValue(bean: holidayInstance, field: "holidaydate"))
printHtmlPart(20)
if(true && (holidayInstance.toholidaydate==null ||holidayInstance.toholidaydate=='')) {
printHtmlPart(21)
}
else {
printHtmlPart(22)
expressionOut.print(fieldValue(bean: holidayInstance, field: "toholidaydate"))
printHtmlPart(23)
}
printHtmlPart(24)
expressionOut.print(fieldValue(bean: holidayInstance, field: "holidayreason"))
printHtmlPart(25)
createClosureForHtmlPart(26, 3)
invokeTag('link','g',214,['controller':("holiday"),'action':("printholiday"),'params':([id:holidayInstance.id]),'target':("blank")],3)
printHtmlPart(27)
i++
}
}
printHtmlPart(28)
invokeTag('render','g',232,['template':("/footer/footer")],-1)
printHtmlPart(29)
})
invokeTag('captureBody','sitemesh',363,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(30)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926000873L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
