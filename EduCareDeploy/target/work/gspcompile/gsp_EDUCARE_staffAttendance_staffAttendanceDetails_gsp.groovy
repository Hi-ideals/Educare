import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_staffAttendance_staffAttendanceDetails_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/staffAttendance/_staffAttendanceDetails.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
if(true && (staffAttendanceList)) {
printHtmlPart(1)
loop:{
int k = 0
for( st1 in (staffAttendanceList?.keySet()) ) {
printHtmlPart(2)
expressionOut.print(st1?.staffName)
printHtmlPart(3)
invokeTag('set','g',25,['var':("Atendancedates"),'value':(staffAttendanceList.getAt(st1))],-1)
printHtmlPart(4)
invokeTag('set','g',26,['var':("date"),'value':("1")],-1)
printHtmlPart(4)
invokeTag('set','g',27,['var':("adMap"),'value':([:])],-1)
printHtmlPart(4)
for( att in (staffAttendanceList.getAt(st1).keySet()) ) {
printHtmlPart(5)
if(true && (date.toString() == att.getDate().toString())) {
printHtmlPart(6)
expressionOut.print(att)
printHtmlPart(7)
if(true && (Atendancedates.getAt(att)=='P')) {
printHtmlPart(8)
expressionOut.print(Atendancedates.getAt(att))
printHtmlPart(9)
}
else {
printHtmlPart(10)
expressionOut.print(Atendancedates.getAt(att))
printHtmlPart(9)
}
printHtmlPart(11)
}
else {
printHtmlPart(6)
expressionOut.print(att)
printHtmlPart(12)
invokeTag('set','g',49,['var':("date"),'value':(Integer.parseInt(date.toString())+1)],-1)
printHtmlPart(13)
if(true && (Atendancedates.getAt(att)=='P')) {
printHtmlPart(14)
expressionOut.print(Atendancedates.getAt(att))
printHtmlPart(15)
}
else {
printHtmlPart(16)
expressionOut.print(Atendancedates.getAt(att))
printHtmlPart(15)
}
printHtmlPart(17)
}
printHtmlPart(5)
invokeTag('set','g',63,['var':("date"),'value':(Integer.parseInt(date.toString())+1)],-1)
printHtmlPart(4)
}
printHtmlPart(18)
k++
}
}
printHtmlPart(19)
createTagBody(2, {->
printHtmlPart(5)
invokeTag('hiddenField','g',72,['name':("staffID"),'value':(params?.staffID)],-1)
printHtmlPart(5)
invokeTag('hiddenField','g',73,['name':("fromDate"),'value':(params?.fromDate)],-1)
printHtmlPart(5)
invokeTag('hiddenField','g',74,['name':("attendanceType"),'value':(params?.attendanceType)],-1)
printHtmlPart(5)
invokeTag('hiddenField','g',75,['name':("instituteID"),'value':(params?.instituteID)],-1)
printHtmlPart(5)
invokeTag('hiddenField','g',76,['name':("toDate"),'value':(params?.toDate)],-1)
printHtmlPart(5)
invokeTag('hiddenField','g',77,['name':("Search"),'value':("Search")],-1)
printHtmlPart(5)
invokeTag('submitButton','g',78,['name':("Get Print")],-1)
printHtmlPart(4)
})
invokeTag('form','g',79,['controller':("staffAttendance"),'action':("printattendencestaffdaily"),'target':("_blank")],2)
printHtmlPart(20)
}
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926011488L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
