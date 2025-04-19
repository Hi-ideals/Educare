import com.hiideals.institute.staff.Staff
import com.hiideals.instituite.classcourses.Subject
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_staff_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/staff/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
expressionOut.print(hasErrors(bean: staffInstance, field: 'staffID', 'error'))
printHtmlPart(2)
invokeTag('message','g',13,['code':("staff.staffID.label"),'default':("Staff ID")],-1)
printHtmlPart(3)
invokeTag('field','g',16,['name':("staffID"),'type':("number"),'class':("form-control"),'value':(staffInstance.staffID),'required':(""),'id':("staffID")],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: staffInstance, field: 'staffName', 'error'))
printHtmlPart(5)
invokeTag('message','g',29,['code':("staff.staffName.label"),'default':("Staff Name")],-1)
printHtmlPart(6)
invokeTag('textField','g',33,['name':("staffName"),'required':(""),'class':("form-control"),'id':("staffName"),'value':(staffInstance?.staffName)],-1)
printHtmlPart(7)
expressionOut.print(hasErrors(bean: staffInstance, field: 'qualification', 'error'))
printHtmlPart(8)
invokeTag('message','g',44,['code':("staff.qualification.label"),'default':("Qualification")],-1)
printHtmlPart(6)
invokeTag('textField','g',48,['name':("qualification"),'required':(""),'class':("form-control"),'value':(staffInstance?.qualification),'id':("Qualification")],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: staffInstance, field: 'teachingSubject', 'error'))
printHtmlPart(10)
invokeTag('message','g',60,['code':("staff.teachingSubject.label"),'default':("Select a Subject")],-1)
printHtmlPart(11)
if(true && (staffInstance?.teachingSubject !=null)) {
printHtmlPart(12)
expressionOut.print(staffInstance?.teachingSubject)
printHtmlPart(13)
expressionOut.print(staffInstance?.teachingSubject.subjectName)
printHtmlPart(14)
}
else {
printHtmlPart(15)
}
printHtmlPart(16)
for( subject in (Subject.findAllByInstitute(instituite)) ) {
printHtmlPart(12)
expressionOut.print(subject.id)
printHtmlPart(13)
expressionOut.print(subject.subjectName)
printHtmlPart(14)
}
printHtmlPart(17)
invokeTag('render','g',90,['template':("staffaddress"),'model':([addressInstance:staffInstance?.address])],-1)
printHtmlPart(18)
expressionOut.print(hasErrors(bean: staffInstance, field: 'substutingSubjects', 'error'))
printHtmlPart(19)
for( subjects in (com.hiideals.instituite.classcourses.Subject.list()) ) {
printHtmlPart(20)
expressionOut.print(subjects.id)
printHtmlPart(21)
expressionOut.print(subjects.subjectName)
printHtmlPart(22)
}
printHtmlPart(23)
invokeTag('message','g',107,['code':("staff.substutingSubjects.label"),'default':("Substuting Subjects")],-1)
printHtmlPart(24)
expressionOut.print(hasErrors(bean: staffInstance, field: 'staffType', 'error'))
printHtmlPart(25)
invokeTag('message','g',120,['code':("staff.institute.label"),'default':("Staff Type")],-1)
printHtmlPart(26)
loop:{
int i = 0
for( staffType in (staffInstance.constraints.staffType.inList) ) {
printHtmlPart(20)
expressionOut.print(staffType)
printHtmlPart(21)
expressionOut.print(staffType)
printHtmlPart(22)
i++
}
}
printHtmlPart(27)
expressionOut.print(hasErrors(bean: staffInstance, field: 'institute', 'error'))
printHtmlPart(28)
expressionOut.print(instituite?.id)
printHtmlPart(21)
expressionOut.print(instituite?.name)
printHtmlPart(29)
invokeTag('message','g',149,['code':("staff.institute.label"),'default':("Institute")],-1)
printHtmlPart(30)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926002696L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
