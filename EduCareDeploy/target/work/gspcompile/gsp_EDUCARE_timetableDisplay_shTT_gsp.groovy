import com.hiideals.enums.WeekdaysEnum
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_timetableDisplay_shTT_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/timetableDisplay/_shTT.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print((100/9))
printHtmlPart(1)
for( _it1787843859 in (1..8) ) {
changeItVariable(_it1787843859)
printHtmlPart(2)
expressionOut.print((100/9))
printHtmlPart(3)
expressionOut.print(it)
printHtmlPart(4)
}
printHtmlPart(5)
for( _it798555759 in (weekdaysMap.keySet()) ) {
changeItVariable(_it798555759)
printHtmlPart(6)
expressionOut.print((100/9))
printHtmlPart(7)
expressionOut.print(WeekdaysEnum.get(it))
printHtmlPart(8)
invokeTag('set','g',20,['value':(weekdaysMap.get(it)),'var':("aaa")],-1)
printHtmlPart(9)
for( _it185419891 in (1..8) ) {
changeItVariable(_it185419891)
printHtmlPart(10)
expressionOut.print((100/9))
printHtmlPart(11)
if(true && (aaa.getAt(it.toString()))) {
printHtmlPart(12)
expressionOut.print(aaa.getAt(it.toString())?.classname?.classname)
printHtmlPart(13)
expressionOut.print(aaa.getAt(it.toString())?.section?.sectionName)
printHtmlPart(14)
expressionOut.print(aaa.getAt(it.toString())?.subject?.subjectName)
printHtmlPart(15)
}
else {
printHtmlPart(16)
}
printHtmlPart(17)
}
printHtmlPart(18)
}
printHtmlPart(19)
createClosureForHtmlPart(20, 1)
invokeTag('link','g',36,['class':("btn-u sm-margin-bottom-10 btn blue"),'controller':("timetableDisplay"),'action':("staffTimeTablePrint"),'target':("_blank"),'params':([staffId:params.staffId])],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925997417L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
