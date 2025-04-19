import java.lang.Integer
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_staffAttendance_monthlySheet_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/staffAttendance/_monthlySheet.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(0)
if(true && (staffList)) {
printHtmlPart(1)
for( count1 in ((1..31).toList()) ) {
printHtmlPart(2)
expressionOut.print(count1)
printHtmlPart(3)
}
printHtmlPart(4)
loop:{
int k = 0
for( st1 in (staffattendence?.keySet()) ) {
printHtmlPart(5)
invokeTag('set','g',26,['var':("total"),'value':("0")],-1)
printHtmlPart(6)
invokeTag('set','g',27,['var':("present"),'value':("0")],-1)
printHtmlPart(6)
invokeTag('set','g',28,['var':("absent"),'value':("0")],-1)
printHtmlPart(2)
expressionOut.print(st1?.staffName)
printHtmlPart(7)
loop:{
int n = 0
for( dates in (staffattendence.get(st1).keySet()) ) {
printHtmlPart(8)
if(true && (staffattendence.get(st1).get(dates)=='P')) {
printHtmlPart(9)
expressionOut.print(staffattendence.get(st1).get(dates))
printHtmlPart(10)
expressionOut.print(total++)
printHtmlPart(11)
expressionOut.print(present++)
printHtmlPart(12)
}
else if(true && (staffattendence.get(st1).get(dates)=='A')) {
printHtmlPart(13)
expressionOut.print(staffattendence.get(st1).get(dates))
printHtmlPart(14)
expressionOut.print(total++)
printHtmlPart(15)
expressionOut.print(absent++)
printHtmlPart(12)
}
else {
printHtmlPart(16)
expressionOut.print(staffattendence.get(st1).get(dates))
printHtmlPart(17)
}
printHtmlPart(18)
n++
}
}
printHtmlPart(19)
expressionOut.print(total)
printHtmlPart(20)
expressionOut.print(present)
printHtmlPart(20)
expressionOut.print(absent)
printHtmlPart(21)
k++
}
}
printHtmlPart(22)
createTagBody(2, {->
printHtmlPart(6)
invokeTag('hiddenField','g',59,['name':("staffID"),'value':(params?.staffID)],-1)
printHtmlPart(6)
invokeTag('hiddenField','g',60,['name':("fromDate"),'value':(params?.fromDate)],-1)
printHtmlPart(6)
invokeTag('hiddenField','g',61,['name':("attendanceType"),'value':(params?.attendanceType)],-1)
printHtmlPart(6)
invokeTag('hiddenField','g',62,['name':("instituteID"),'value':(params?.instituteID)],-1)
printHtmlPart(6)
invokeTag('hiddenField','g',63,['name':("toDate"),'value':(params?.toDate)],-1)
printHtmlPart(6)
invokeTag('hiddenField','g',64,['name':("Search"),'value':("Search")],-1)
printHtmlPart(6)
invokeTag('submitButton','g',65,['name':("Get Print")],-1)
printHtmlPart(23)
})
invokeTag('form','g',67,['controller':("staffAttendance"),'action':("printattendencestaffmonthly"),'target':("_blank")],2)
printHtmlPart(0)
}
printHtmlPart(24)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926011328L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
