import java.lang.Integer
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_studentAttendance_monthlySheet_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/studentAttendance/_monthlySheet.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
if(true && (studentList)) {
printHtmlPart(2)
for( count1 in ((1..31).toList()) ) {
printHtmlPart(3)
expressionOut.print(count1)
printHtmlPart(4)
}
printHtmlPart(5)
}
printHtmlPart(6)
loop:{
int k = 0
for( st1 in (studentattendence?.keySet()) ) {
printHtmlPart(7)
invokeTag('set','g',27,['var':("total"),'value':("0")],-1)
printHtmlPart(8)
invokeTag('set','g',28,['var':("present"),'value':("0")],-1)
printHtmlPart(8)
invokeTag('set','g',29,['var':("absent"),'value':("0")],-1)
printHtmlPart(9)
expressionOut.print(st1?.studentName)
printHtmlPart(10)
loop:{
int n = 0
for( dates in (studentattendence.get(st1).keySet()) ) {
printHtmlPart(11)
if(true && (studentattendence.get(st1).get(dates)=='P')) {
printHtmlPart(12)
expressionOut.print(studentattendence.get(st1).get(dates))
printHtmlPart(13)
expressionOut.print(total++)
printHtmlPart(14)
expressionOut.print(present++)
printHtmlPart(15)
}
else if(true && (studentattendence.get(st1).get(dates)=='A')) {
printHtmlPart(16)
expressionOut.print(studentattendence.get(st1).get(dates))
printHtmlPart(13)
expressionOut.print(total++)
printHtmlPart(17)
expressionOut.print(absent++)
printHtmlPart(18)
}
else {
printHtmlPart(19)
expressionOut.print(studentattendence.get(st1).get(dates))
printHtmlPart(20)
}
printHtmlPart(21)
n++
}
}
printHtmlPart(22)
expressionOut.print(total)
printHtmlPart(23)
expressionOut.print(present)
printHtmlPart(23)
expressionOut.print(absent)
printHtmlPart(24)
k++
}
}
printHtmlPart(25)
if(true && (studentList)) {
printHtmlPart(26)
createTagBody(2, {->
printHtmlPart(27)
invokeTag('hiddenField','g',69,['name':("classID"),'value':(params?.classID)],-1)
printHtmlPart(27)
invokeTag('hiddenField','g',70,['name':("section"),'value':(params?.secId)],-1)
printHtmlPart(27)
invokeTag('hiddenField','g',71,['name':("secId"),'value':(params?.secId)],-1)
printHtmlPart(27)
invokeTag('hiddenField','g',72,['name':("studentID"),'value':("All Students")],-1)
printHtmlPart(27)
invokeTag('hiddenField','g',73,['name':("academicyear[0].section.id"),'value':(params?.secId)],-1)
printHtmlPart(27)
invokeTag('hiddenField','g',74,['name':("attendanceType"),'value':(params?.attendanceType)],-1)
printHtmlPart(27)
invokeTag('hiddenField','g',75,['name':("fromDate"),'value':(params?.fromDate)],-1)
printHtmlPart(27)
invokeTag('hiddenField','g',76,['name':("toDate"),'value':(params?.toDate)],-1)
printHtmlPart(27)
invokeTag('hiddenField','g',77,['name':("Search"),'value':("Search")],-1)
printHtmlPart(27)
invokeTag('submitButton','g',78,['name':("Get Print")],-1)
printHtmlPart(28)
})
invokeTag('form','g',80,['controller':("studentAttendance"),'action':("printattendance"),'target':("_blank")],2)
printHtmlPart(29)
}
printHtmlPart(30)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925995018L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
