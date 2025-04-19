import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_SMS_listofstafftable_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/SMS/_listofstafftable.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('getImage','images',8,['id':(instituite?.logo?.id),'width':("100px"),'height':("100px")],-1)
printHtmlPart(1)
expressionOut.print(instituite?.name)
printHtmlPart(2)
expressionOut.print(instituite?.affiliatedTo)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('textArea','g',32,['class':("form-control"),'name':("notemessage")],-1)
printHtmlPart(5)
invokeTag('message','g',38,['code':("student.fatherDetails.label"),'default':("Registration Number")],-1)
printHtmlPart(6)
invokeTag('message','g',41,['code':("student.Actions.label"),'default':("Actions")],-1)
printHtmlPart(7)
loop:{
int i = 0
for( staffs in (staffInstance) ) {
printHtmlPart(8)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(9)
expressionOut.print(fieldValue(bean: staffs, field: "staffName"))
printHtmlPart(10)
expressionOut.print(staffs?.id)
printHtmlPart(11)
expressionOut.print(staffs)
printHtmlPart(12)
invokeTag('hiddenField','g',54,['name':("staffId${i}"),'value':(staffs?.id)],-1)
printHtmlPart(13)
i++
}
}
printHtmlPart(14)
invokeTag('hiddenField','g',60,['name':("loopSize"),'value':(staffInstance.size())],-1)
printHtmlPart(15)
})
invokeTag('form','g',64,['action':("sendMessageTostaffs")],1)
printHtmlPart(16)
invokeTag('paginate','g',68,['total':(studentInstanceCount ?: 0),'params':(params)],-1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926002171L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
