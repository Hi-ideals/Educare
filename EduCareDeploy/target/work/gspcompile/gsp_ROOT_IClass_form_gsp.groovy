import com.hiideals.instituite.main.Instituite
import com.hiideals.instituite.classcourses.IClass
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_IClass_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/IClass/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
expressionOut.print(hasErrors(bean: IClassInstance, field: 'classID', 'error'))
printHtmlPart(2)
invokeTag('message','g',12,['code':("IClass.classID.label"),'default':("Class ID")],-1)
printHtmlPart(3)
if(true && (IClassInstance?.classID !=null)) {
printHtmlPart(4)
invokeTag('textField','g',16,['name':("classID"),'class':("form-control"),'required':(""),'id':("classID"),'value':(IClassInstance?.classID)],-1)
printHtmlPart(5)
}
else {
printHtmlPart(4)
invokeTag('getIClsId','regId',19,['inst':(instituite?.name)],-1)
printHtmlPart(5)
}
printHtmlPart(6)
expressionOut.print(hasErrors(bean: IClassInstance, field: 'classname', 'error'))
printHtmlPart(7)
invokeTag('message','g',31,['code':("IClass.classname.label"),'default':("Class")],-1)
printHtmlPart(8)
invokeTag('textField','g',35,['name':("classname"),'class':("form-control"),'required':(""),'id':("Classname"),'value':(IClassInstance?.classname)],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: IClassInstance, field: 'sections', 'error'))
printHtmlPart(10)
invokeTag('message','g',45,['code':("IClass.sections.label"),'default':("Sections")],-1)
printHtmlPart(11)
for( section in (com.hiideals.instituite.classcourses.Section.findAllByInstituite(instituite)) ) {
printHtmlPart(12)
expressionOut.print(section.id)
printHtmlPart(13)
expressionOut.print(section.sectionName)
printHtmlPart(14)
}
printHtmlPart(15)
expressionOut.print(hasErrors(bean: sectionInstance, field: 'instituite', 'error'))
printHtmlPart(16)
invokeTag('message','g',65,['code':("instituite.admin.label"),'default':("instituite")],-1)
printHtmlPart(17)
expressionOut.print(instituite?.id)
printHtmlPart(18)
expressionOut.print(instituite?.name)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926006049L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
