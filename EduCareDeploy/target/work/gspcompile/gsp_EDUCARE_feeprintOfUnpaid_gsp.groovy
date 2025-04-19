import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_feeprintOfUnpaid_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/fee/printOfUnpaid.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',11,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',11,[:],2)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',53,[:],1)
printHtmlPart(4)
invokeTag('getImage','images',71,['id':(institute?.logo?.id),'width':("80px"),'height':("80px")],-1)
printHtmlPart(5)
expressionOut.print(institute?.name)
printHtmlPart(6)
expressionOut.print(institute?.affiliatedTo)
printHtmlPart(7)
invokeTag('message','g',111,['code':("fee.studentId.label"),'default':("Student Name")],-1)
printHtmlPart(8)
loop:{
int i = 0
for( st in (ss) ) {
printHtmlPart(9)
expressionOut.print(st?.registrationNo)
printHtmlPart(10)
expressionOut.print(st?.studentName)
printHtmlPart(11)
for( _it1641292405 in (st?.academicyear) ) {
changeItVariable(_it1641292405)
printHtmlPart(12)
if(true && (it.status == 'current')) {
printHtmlPart(12)
}
printHtmlPart(13)
}
printHtmlPart(14)
invokeTag('set','g',131,['value':(it?.presentclass),'var':("pclass")],-1)
printHtmlPart(14)
expressionOut.print(pclass.classname)
printHtmlPart(10)
for( _it1712597146 in (st?.academicyear) ) {
changeItVariable(_it1712597146)
printHtmlPart(12)
if(true && (it.status == 'current')) {
printHtmlPart(12)
}
printHtmlPart(13)
}
printHtmlPart(14)
invokeTag('set','g',137,['value':(it),'var':("pclass")],-1)
printHtmlPart(14)
expressionOut.print(pclass.academicyear)
printHtmlPart(15)
i++
}
}
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926001518L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
