import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_listofFees_allListbyYearFees_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/listofFees/_allListbyYearFees.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
invokeTag('getImage','images',10,['id':(instituite?.logo?.id),'width':("100px"),'height':("100px")],-1)
printHtmlPart(2)
expressionOut.print(instituite?.name)
printHtmlPart(3)
expressionOut.print(instituite?.affiliatedTo)
printHtmlPart(4)
loop:{
int i = 0
for( studentInstance in (studentInstanceList) ) {
printHtmlPart(5)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(6)
expressionOut.print(fieldValue(bean: studentInstance?.studentId, field: "studentName"))
printHtmlPart(7)
expressionOut.print(fieldValue(bean: studentInstance, field: "totalFee"))
printHtmlPart(8)
expressionOut.print(fieldValue(bean: studentInstance, field: "totalPaid"))
printHtmlPart(9)
expressionOut.print(fieldValue(bean: studentInstance, field: "due"))
printHtmlPart(10)
invokeTag('formatDate','g',72,['format':("dd-MMM-yyyy"),'date':(studentInstance.dateCreated)],-1)
printHtmlPart(11)
invokeTag('formatDate','g',77,['format':("dd-MMM-yyyy"),'date':(studentInstance.lastUpdated)],-1)
printHtmlPart(12)
if(true && (params?.iclass=="all" || params?.iclass=="" || params?.iclass==null)) {
printHtmlPart(13)
for( _it776916472 in (studentInstance?.studentId?.academicyear) ) {
changeItVariable(_it776916472)
printHtmlPart(14)
if(true && (it.status == 'current')) {
printHtmlPart(14)
}
printHtmlPart(15)
}
printHtmlPart(16)
invokeTag('set','g',86,['value':(it?.presentclass),'var':("pclass")],-1)
printHtmlPart(16)
expressionOut.print(pclass.classname)
printHtmlPart(17)
}
else {
printHtmlPart(18)
expressionOut.print(clsname)
printHtmlPart(17)
}
printHtmlPart(18)
expressionOut.print(studentInstance?.academic?.academicyear)
printHtmlPart(19)
i++
}
}
printHtmlPart(20)
createTagBody(1, {->
printHtmlPart(21)
invokeTag('hiddenField','g',107,['name':("iclass"),'value':(params?.iclass)],-1)
printHtmlPart(0)
invokeTag('hiddenField','g',110,['name':("iyear"),'value':(params?.iyear)],-1)
printHtmlPart(0)
invokeTag('hiddenField','g',110,['name':("Search"),'value':("Search")],-1)
printHtmlPart(0)
invokeTag('submitButton','g',112,['class':("btn blue"),'name':("Get Print")],-1)
printHtmlPart(0)
})
invokeTag('form','g',112,['controller':("listofFees"),'action':("byYearPrint"),'target':("_blank")],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1705994165739L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
