import com.hiideals.instituite.student.PreEducation
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_preEducation_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/preEducation/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: preEducationInstance, field: 'schoolname', 'error'))
printHtmlPart(1)
invokeTag('message','g',10,['code':("preEducation.schoolname.label"),'default':("Schoolname")],-1)
printHtmlPart(2)
invokeTag('textField','g',14,['name':("schoolname"),'required':(""),'id':("schoolname"),'value':(preEducationInstance?.schoolname),'class':("form-control")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: preEducationInstance, field: 'qualification', 'error'))
printHtmlPart(4)
invokeTag('message','g',25,['code':("preEducation.qualification.label"),'default':("Qualification")],-1)
printHtmlPart(5)
invokeTag('textField','g',29,['name':("qualification"),'required':(""),'id':("qualification"),'value':(preEducationInstance?.qualification),'class':("form-control")],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: preEducationInstance, field: 'marksPercentage', 'error'))
printHtmlPart(7)
invokeTag('message','g',41,['code':("preEducation.marksPercentage.label"),'default':("Marks Percentage")],-1)
printHtmlPart(8)
invokeTag('field','g',45,['name':("marksPercentage"),'type':("number"),'value':(preEducationInstance.marksPercentage),'class':("form-control"),'required':(""),'id':("marksPercentage")],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: preEducationInstance, field: 'transferCertificatId', 'error'))
printHtmlPart(10)
invokeTag('message','g',57,['code':("preEducation.transferCertificatId.label"),'default':("Transfer Certificat Id")],-1)
printHtmlPart(2)
invokeTag('textField','g',62,['name':("transferCertificatId"),'required':(""),'value':(preEducationInstance?.transferCertificatId),'class':("form-control")],-1)
printHtmlPart(11)
invokeTag('render','g',71,['template':("instituiteAddress"),'model':([schoolAddressInstance:preEducationInstance?.schoolAddress])],-1)
printHtmlPart(12)
loop:{
int i = 0
for( documentFile in (1..4) ) {
printHtmlPart(13)
expressionOut.print(i)
printHtmlPart(14)
i++
}
}
printHtmlPart(15)
expressionOut.print(hasErrors(bean: preEducationInstance, field: 'studentpreEdu', 'error'))
printHtmlPart(16)
expressionOut.print(studentInstance.id)
printHtmlPart(17)
expressionOut.print(studentInstance.studentName)
printHtmlPart(18)
invokeTag('message','g',160,['code':("preEducation.studentpreEdu.label"),'default':("Studentpre Edu")],-1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926008404L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
