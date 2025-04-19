import com.hiideals.instituite.classcourses.Section
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_section_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/section/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: sectionInstance, field: 'sectionName', 'error'))
printHtmlPart(1)
invokeTag('message','g',11,['code':("section.sectionName.label"),'default':("Section Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',15,['name':("sectionName"),'required':(""),'class':("form-control"),'value':(sectionInstance?.sectionName),'id':("SectionName")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: sectionInstance, field: 'sectionID', 'error'))
printHtmlPart(4)
invokeTag('message','g',26,['code':("section.sectionID.label"),'default':("Section ID")],-1)
printHtmlPart(2)
if(true && (sectionInstance?.sectionID !=null)) {
printHtmlPart(5)
invokeTag('textField','g',31,['name':("sectionID"),'required':(""),'class':("form-control"),'value':(sectionInstance?.sectionID),'id':("sec")],-1)
printHtmlPart(6)
}
else {
printHtmlPart(5)
invokeTag('getSecId','regId',34,[:],-1)
printHtmlPart(6)
}
printHtmlPart(7)
expressionOut.print(hasErrors(bean: sectionInstance, field: 'sectionStrength', 'error'))
printHtmlPart(8)
invokeTag('message','g',46,['code':("section.sectionStrength.label"),'default':("Section Strength")],-1)
printHtmlPart(9)
invokeTag('field','g',49,['name':("sectionStrength"),'type':("number"),'class':("form-control"),'value':(sectionInstance.sectionStrength)],-1)
printHtmlPart(10)
expressionOut.print(hasErrors(bean: sectionInstance, field: 'sectionClassTeacher', 'error'))
printHtmlPart(8)
invokeTag('message','g',58,['code':("section.sectionStrength.label"),'default':("Section Class Teacher")],-1)
printHtmlPart(9)
invokeTag('field','g',61,['name':("sectionClassTeacher"),'type':("text"),'class':("form-control"),'value':(sectionInstance.sectionClassTeacher)],-1)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: sectionInstance, field: 'instituite', 'error'))
printHtmlPart(12)
invokeTag('message','g',72,['code':("instituite.admin.label"),'default':("instituite")],-1)
printHtmlPart(13)
expressionOut.print(instituite?.id)
printHtmlPart(14)
expressionOut.print(instituite?.name)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926014014L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
