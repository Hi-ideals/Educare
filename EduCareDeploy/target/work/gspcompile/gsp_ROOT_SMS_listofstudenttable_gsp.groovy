import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_SMS_listofstudenttable_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/SMS/_listofstudenttable.gsp" }
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
invokeTag('textArea','g',31,['class':("form-control"),'name':("notemessage")],-1)
printHtmlPart(5)
invokeTag('message','g',37,['code':("student.guardianDetails.label"),'default':("Student Name")],-1)
printHtmlPart(6)
invokeTag('message','g',40,['code':("student.guardianDetails.label"),'default':("Class ")],-1)
printHtmlPart(7)
invokeTag('message','g',41,['code':("student.Actions.label"),'default':("Actions")],-1)
printHtmlPart(8)
loop:{
int i = 0
for( studentInstance in (studentInstanceList) ) {
printHtmlPart(9)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(10)
expressionOut.print(fieldValue(bean: studentInstance, field: "studentName"))
printHtmlPart(11)
expressionOut.print(fieldValue(bean: studentInstance.presentclass, field: "classname"))
printHtmlPart(12)
expressionOut.print(studentInstance?.id)
printHtmlPart(13)
expressionOut.print(studentInstance)
printHtmlPart(14)
invokeTag('hiddenField','g',55,['name':("studentId${i}"),'value':(studentInstance?.id)],-1)
printHtmlPart(15)
i++
}
}
printHtmlPart(16)
invokeTag('hiddenField','g',61,['name':("loopSize"),'value':(studentInstanceList.size())],-1)
printHtmlPart(17)
})
invokeTag('form','g',65,['action':("sendMessageToStudents")],1)
printHtmlPart(18)
invokeTag('paginate','g',70,['total':(studentInstanceCount ?: 0),'params':(params)],-1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926002196L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
