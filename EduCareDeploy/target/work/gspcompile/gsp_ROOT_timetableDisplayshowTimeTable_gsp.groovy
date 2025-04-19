import com.hiideals.utils.APPConsumer
import com.hiideals.instituite.classcourses.Subject
import com.hiideals.instituite.classcourses.Section
import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.timetable.Period_Timings
import com.hiideals.instituite.timetable.TimeTable
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_timetableDisplayshowTimeTable_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/timetableDisplay/showTimeTable.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('set','g',12,['value':([tt:'start active open',ttList:'active']),'var':("activ"),'scope':("request")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',15,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',15,[:],2)
printHtmlPart(0)
})
invokeTag('captureHead','sitemesh',16,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('getInstituite','regId',18,[:],-1)
printHtmlPart(3)
invokeTag('set','g',20,['value':(IClass.findAllByInstituite(instituite)),'var':("classList")],-1)
printHtmlPart(3)
invokeTag('set','g',22,['value':(Section.findAllByInstituite(instituite)),'var':("sectionList")],-1)
printHtmlPart(4)
invokeTag('set','g',25,['value':(Subject.findAllByInstitute(instituite)),'var':("subjectList")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',32,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
printHtmlPart(8)
expressionOut.print(single?.classname?.classname)
printHtmlPart(9)
expressionOut.print(single?.id)
printHtmlPart(10)
expressionOut.print(single?.section?.sectionName)
printHtmlPart(11)
expressionOut.print(single?.section?.id)
printHtmlPart(12)
expressionOut.print(noOfColumnsCount)
printHtmlPart(13)
expressionOut.print(single?.lunchAfterPeriod)
printHtmlPart(14)
expressionOut.print(hasErrors(bean: timeTableInstance, field: 'dateOfTimeTable', 'error'))
printHtmlPart(15)
invokeTag('message','g',96,['code':("timeTable.dateOfTimeTable.label"),'default':("Time Table Date")],-1)
printHtmlPart(16)
expressionOut.print(single?.timetables?.getAt(0)?.dateOfTimeTable)
printHtmlPart(17)
expressionOut.print(100/(noOfColumnsCount+1 ?: 1))
printHtmlPart(18)
loop:{
int i = 0
for( tim in (single?.timetables) ) {
printHtmlPart(19)
expressionOut.print(100/(noOfColumnsCount+1))
printHtmlPart(20)
expressionOut.print(tim.periodName)
printHtmlPart(21)
expressionOut.print(tim?.periodtimings)
printHtmlPart(22)
if(true && (single?.lunchAfterPeriod == (i+1))) {
printHtmlPart(23)
expressionOut.print(classTimeTable?.size()+1)
printHtmlPart(24)
}
printHtmlPart(25)
i++
}
}
printHtmlPart(26)
for( _it1645577752 in (classTimeTable) ) {
changeItVariable(_it1645577752)
printHtmlPart(27)
expressionOut.print(100/(noOfColumnsCount+1 ?: 1))
printHtmlPart(28)
expressionOut.print(it.availableFor)
printHtmlPart(29)
loop:{
int i = 0
for( tt in (it.timetables) ) {
printHtmlPart(30)
expressionOut.print(100/(noOfColumnsCount+1 ?: 1))
printHtmlPart(31)
expressionOut.print((i+1)+1)
printHtmlPart(32)
if(true && (!tt.subject?.id)) {
printHtmlPart(33)
expressionOut.print(null)
printHtmlPart(34)
}
printHtmlPart(35)
for( sub in (subjectList) ) {
printHtmlPart(36)
if(true && (tt.subject?.id == sub?.id)) {
printHtmlPart(37)
expressionOut.print(sub?.id)
printHtmlPart(38)
expressionOut.print(sub?.subjectName)
printHtmlPart(39)
}
else {
printHtmlPart(37)
expressionOut.print(sub?.id)
printHtmlPart(40)
expressionOut.print(sub?.subjectName)
printHtmlPart(39)
}
printHtmlPart(41)
}
printHtmlPart(42)
expressionOut.print(tt.staff?.id)
printHtmlPart(43)
expressionOut.print(tt.staff?.staffName)
printHtmlPart(44)
i++
}
}
printHtmlPart(45)
}
printHtmlPart(46)
expressionOut.print(noOfColumnsCount+1)
printHtmlPart(47)
})
invokeTag('form','g',229,['action':("UpdateTimeTable")],2)
printHtmlPart(48)
createClosureForHtmlPart(49, 2)
invokeTag('link','g',233,['class':("btn-u sm-margin-bottom-10 btn blue"),'controller':("timetableDisplay"),'action':("showTimeTablePrint"),'target':("_blank"),'params':([cid:params.cid,sid:params.sid])],2)
printHtmlPart(50)
expressionOut.print(APPConsumer.AJAX_NAME)
printHtmlPart(51)
expressionOut.print(APPConsumer.AJAX_NAME)
printHtmlPart(52)
expressionOut.print(APPConsumer.AJAX_NAME)
printHtmlPart(53)
})
invokeTag('captureBody','sitemesh',376,[:],1)
printHtmlPart(54)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925997468L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
