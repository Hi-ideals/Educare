import com.hiideals.instituite.student.Student
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_marksgetreportCardPrint_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/marks/getreportCardPrint.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(0)
createTagBody(2, {->
createTagBody(3, {->
printHtmlPart(2)
expressionOut.print(studentInstance?.studentName)
})
invokeTag('captureTitle','sitemesh',14,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',14,[:],2)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',18,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',73,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',82,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',85,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('getImage','images',111,['id':(instituite?.logo?.id),'width':("100px")],-1)
printHtmlPart(8)
expressionOut.print(instituite?.name)
printHtmlPart(9)
expressionOut.print(instituite?.affiliatedTo)
printHtmlPart(10)
expressionOut.print(instituite?.hsno)
printHtmlPart(11)
expressionOut.print(instituite?.street)
printHtmlPart(12)
expressionOut.print(instituite?.city)
printHtmlPart(13)
expressionOut.print(instituite?.pinCode)
printHtmlPart(11)
expressionOut.print(instituite?.state)
printHtmlPart(12)
expressionOut.print(instituite?.country)
printHtmlPart(14)
expressionOut.print(instituite?.phone)
printHtmlPart(15)
expressionOut.print(exams?.student?.registrationNo[0])
printHtmlPart(16)
expressionOut.print(exams?.examDetails.year.batchName[0])
printHtmlPart(17)
expressionOut.print(exams?.student?.studentName[0])
printHtmlPart(18)
expressionOut.print(exams?.student?.fatherDetails?.parentName[0])
printHtmlPart(19)
expressionOut.print(exams?.student?.studentId[0])
printHtmlPart(20)
expressionOut.print(academicyr?.presentclass?.classname)
printHtmlPart(21)
expressionOut.print(academicyr?.section?.sectionName)
printHtmlPart(22)
expressionOut.print(exams?.examDetails?.exam?.examName[0])
printHtmlPart(23)
loop:{
int i = 0
for( examdetails in (exams) ) {
printHtmlPart(24)
expressionOut.print(examdetails?.examDetails?.subject?.subjectName)
printHtmlPart(25)
expressionOut.print(examdetails?.id)
printHtmlPart(26)
invokeTag('formatDate','g',196,['date':(examdetails?.examDetails?.examDate),'type':("date"),'style':("LONG"),'timeStyle':("SHORT")],-1)
printHtmlPart(27)
expressionOut.print(examdetails?.examDetails?.totalMarks)
printHtmlPart(28)
expressionOut.print(examdetails?.examDetails?.passMarks)
printHtmlPart(28)
expressionOut.print(examdetails?.obtainedMarks)
printHtmlPart(29)
expressionOut.print(i)
printHtmlPart(30)
expressionOut.print(i)
printHtmlPart(31)
expressionOut.print(i)
printHtmlPart(32)
expressionOut.print(i)
printHtmlPart(33)
expressionOut.print(i)
printHtmlPart(34)
expressionOut.print(i)
printHtmlPart(35)
expressionOut.print(i)
printHtmlPart(36)
expressionOut.print(i)
printHtmlPart(37)
expressionOut.print(i)
printHtmlPart(31)
expressionOut.print(i)
printHtmlPart(38)
expressionOut.print(i)
printHtmlPart(39)
expressionOut.print(i)
printHtmlPart(33)
expressionOut.print(i)
printHtmlPart(40)
expressionOut.print(i)
printHtmlPart(41)
expressionOut.print(i)
printHtmlPart(42)
i++
}
}
printHtmlPart(43)
expressionOut.print(exams.sum{it.examDetails?.totalMarks})
printHtmlPart(44)
expressionOut.print(exams.sum{it.examDetails?.passMarks})
printHtmlPart(44)
expressionOut.print(exams.sum{it.obtainedMarks})
printHtmlPart(45)
invokeTag('render','g',321,['template':("/footer/footer")],-1)
printHtmlPart(46)
})
invokeTag('captureBody','sitemesh',349,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(47)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925994178L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
