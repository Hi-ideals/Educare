import com.hiideals.instituite.classcourses.IClass
import com.hiideals.exams.Marks
import com.hiideals.exams.Exam
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_marksstudentReports_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/marks/studentReports.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',15,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',15,[:],2)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',18,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',19,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',71,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',78,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',82,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',93,['template':("/header/leftSide"),'model':([activ:[exams:'start active open',marks:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
for( iclass in (IClass.findAllByInstituite(instituite)) ) {
printHtmlPart(11)
expressionOut.print(iclass?.id)
printHtmlPart(12)
expressionOut.print(iclass?.classname)
printHtmlPart(13)
}
printHtmlPart(14)
for( exam in (Exam.findAllByInstitute(instituite)) ) {
printHtmlPart(11)
expressionOut.print(exam?.id)
printHtmlPart(12)
expressionOut.print(exam?.examName)
printHtmlPart(13)
}
printHtmlPart(15)
for( batch in (batchList) ) {
printHtmlPart(11)
expressionOut.print(batch?.id)
printHtmlPart(12)
expressionOut.print(batch?.batchName)
printHtmlPart(13)
}
printHtmlPart(16)
invokeTag('submitButton','g',179,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(17)
})
invokeTag('formRemote','g',180,['name':("ss"),'url':([action:'getExamTT']),'update':("Changedisplay")],2)
printHtmlPart(18)
createTagBody(2, {->
printHtmlPart(19)
expressionOut.print(hasErrors(bean: examDetailsInstance, field: 'year', 'error'))
printHtmlPart(20)
invokeTag('message','g',197,['code':("examDetails.year.label"),'default':("Year")],-1)
printHtmlPart(21)
for( batch in (batchList) ) {
printHtmlPart(22)
expressionOut.print(batch?.id)
printHtmlPart(23)
expressionOut.print(batch?.batchName)
printHtmlPart(24)
}
printHtmlPart(25)
expressionOut.print(hasErrors(bean: examDetailsInstance, field: 'year', 'error'))
printHtmlPart(26)
for( exam in (Exam.findAllByInstitute(instituite)) ) {
printHtmlPart(22)
expressionOut.print(exam?.id)
printHtmlPart(23)
expressionOut.print(exam?.examName)
printHtmlPart(24)
}
printHtmlPart(27)
expressionOut.print(hasErrors(bean: examDetailsInstance, field: 'iclass', 'error'))
printHtmlPart(28)
invokeTag('message','g',227,['code':("examDetails.iclass.label"),'default':("Iclass")],-1)
printHtmlPart(29)
expressionOut.print(remoteFunction(
			          controller: 'marks', 
			          action: 'getExamDetails',
					  update:'subjects',
			         params: "\'iclass=\' + this.value +  \'&examId=\' + document.getElementById('exam').value+ \'&yearId=\' + document.getElementById('year').value "))
printHtmlPart(30)
expressionOut.print(remoteFunction(
			          controller: 'marks', 
			          action: 'getStudents',
					  update:'getStudents',
			         params: "\'iclass=\' + this.value +  \'&examId=\' + document.getElementById('exam').value+ \'&yearId=\' + document.getElementById('year').value "))
printHtmlPart(31)
for( iclass in (IClass.findAllByInstituite(instituite)) ) {
printHtmlPart(22)
expressionOut.print(iclass?.id)
printHtmlPart(23)
expressionOut.print(iclass?.classname)
printHtmlPart(24)
}
printHtmlPart(32)
invokeTag('render','g',251,['template':("students")],-1)
printHtmlPart(33)
invokeTag('submitButton','g',254,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(17)
})
invokeTag('formRemote','g',256,['name':("ss"),'url':([action:'getreportCard']),'update':("Changedisplay")],2)
printHtmlPart(34)
createTagBody(2, {->
printHtmlPart(35)
expressionOut.print(params.to)
printHtmlPart(36)
invokeTag('submitButton','g',283,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(17)
})
invokeTag('form','g',284,['name':("ss"),'url':([action:'index']),'update':("Changedisplay")],2)
printHtmlPart(37)
createTagBody(2, {->
printHtmlPart(38)
invokeTag('submitButton','g',304,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(17)
})
invokeTag('form','g',305,['name':("sscast"),'url':([action:'index']),'update':("Changedisplay")],2)
printHtmlPart(39)
createTagBody(2, {->
printHtmlPart(40)
invokeTag('submitButton','g',332,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(41)
})
invokeTag('formRemote','g',333,['name':("kk"),'url':([action:'byYear']),'update':("Changedisplay")],2)
printHtmlPart(42)
invokeTag('render','g',346,['template':("/footer/footer")],-1)
printHtmlPart(43)
})
invokeTag('captureBody','sitemesh',498,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(44)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925994303L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
