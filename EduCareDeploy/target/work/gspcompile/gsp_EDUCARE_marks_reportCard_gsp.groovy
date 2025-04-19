import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_marks_reportCard_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/marks/_reportCard.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(exams?.student?.registrationNo[0])
printHtmlPart(1)
expressionOut.print(exams?.student?.studentName[0])
printHtmlPart(2)
expressionOut.print(academicyr?.presentclass?.classname)
printHtmlPart(3)
expressionOut.print(academicyr?.section?.sectionName)
printHtmlPart(4)
expressionOut.print(exams?.student?.studentId[0])
printHtmlPart(5)
expressionOut.print(exams?.student?.fatherDetails?.parentName[0])
printHtmlPart(6)
expressionOut.print(exams?.examDetails.year.batchName[0])
printHtmlPart(7)
expressionOut.print(exams?.examDetails?.exam?.examName[0])
printHtmlPart(8)
loop:{
int i = 0
for( examdetails in (exams) ) {
printHtmlPart(9)
expressionOut.print(examdetails?.examDetails?.subject?.subjectName)
printHtmlPart(10)
expressionOut.print(examdetails?.id)
printHtmlPart(11)
invokeTag('formatDate','g',44,['date':(examdetails?.examDetails?.examDate),'type':("date"),'style':("LONG"),'timeStyle':("SHORT")],-1)
printHtmlPart(12)
expressionOut.print(examdetails?.examDetails?.totalMarks)
printHtmlPart(13)
expressionOut.print(examdetails?.examDetails?.passMarks)
printHtmlPart(13)
expressionOut.print(examdetails?.obtainedMarks)
printHtmlPart(14)
expressionOut.print(i)
printHtmlPart(15)
expressionOut.print(i)
printHtmlPart(16)
expressionOut.print(i)
printHtmlPart(17)
expressionOut.print(i)
printHtmlPart(18)
expressionOut.print(i)
printHtmlPart(19)
expressionOut.print(i)
printHtmlPart(20)
expressionOut.print(i)
printHtmlPart(21)
expressionOut.print(i)
printHtmlPart(22)
expressionOut.print(i)
printHtmlPart(16)
expressionOut.print(i)
printHtmlPart(23)
expressionOut.print(i)
printHtmlPart(24)
expressionOut.print(i)
printHtmlPart(18)
expressionOut.print(i)
printHtmlPart(25)
expressionOut.print(i)
printHtmlPart(26)
expressionOut.print(i)
printHtmlPart(27)
i++
}
}
printHtmlPart(28)
expressionOut.print(exams.sum{it.examDetails?.totalMarks})
printHtmlPart(29)
expressionOut.print(exams.sum{it.examDetails?.passMarks})
printHtmlPart(29)
expressionOut.print(exams.sum{it.obtainedMarks})
printHtmlPart(30)
createClosureForHtmlPart(31, 1)
invokeTag('link','g',121,['class':("btn-u sm-margin-bottom-10 btn blue"),'controller':("marks"),'action':("getreportCardPrint"),'target':("_blank"),'params':([iclass:params.iclass.id,year:params.year.id,exam:params.exam.id,student:params.student.id])],1)
printHtmlPart(32)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925994189L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
