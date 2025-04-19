import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.instituite.student.PreEducation
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_preEducationshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/preEducation/show.gsp" }
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
createClosureForHtmlPart(2, 3)
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
invokeTag('captureHead','sitemesh',48,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',57,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',61,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',71,['template':("/header/leftSide")],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',87,['action':("index")],2)
printHtmlPart(11)
createClosureForHtmlPart(12, 2)
invokeTag('link','g',89,['action':("create")],2)
printHtmlPart(13)
invokeTag('message','g',101,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(14)
if(true && (flash.message)) {
printHtmlPart(15)
expressionOut.print(flash.message)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (preEducationInstance?.schoolAddress)) {
printHtmlPart(18)
invokeTag('message','g',114,['code':("preEducation.schoolAddress.label"),'default':("School Address")],-1)
printHtmlPart(19)
createTagBody(3, {->
printHtmlPart(20)
expressionOut.print(preEducationInstance?.schoolAddress?.encodeAsHTML())
printHtmlPart(21)
})
invokeTag('link','g',119,['controller':("address"),'action':("show"),'id':(preEducationInstance?.schoolAddress?.id)],3)
printHtmlPart(22)
}
printHtmlPart(23)
if(true && (preEducationInstance?.marksPercentage)) {
printHtmlPart(24)
invokeTag('message','g',126,['code':("preEducation.marksPercentage.label"),'default':("Marks Percentage")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',129,['bean':(preEducationInstance),'field':("marksPercentage")],-1)
printHtmlPart(26)
}
printHtmlPart(23)
if(true && (preEducationInstance?.qualification)) {
printHtmlPart(27)
invokeTag('message','g',138,['code':("preEducation.qualification.label"),'default':("Qualification")],-1)
printHtmlPart(28)
invokeTag('fieldValue','g',140,['bean':(preEducationInstance),'field':("qualification")],-1)
printHtmlPart(22)
}
printHtmlPart(23)
if(true && (preEducationInstance?.schoolname)) {
printHtmlPart(29)
invokeTag('message','g',146,['code':("preEducation.schoolname.label"),'default':("Schoolname")],-1)
printHtmlPart(30)
invokeTag('fieldValue','g',150,['bean':(preEducationInstance),'field':("schoolname")],-1)
printHtmlPart(22)
}
printHtmlPart(23)
if(true && (preEducationInstance?.studentpreEdu)) {
printHtmlPart(31)
invokeTag('message','g',157,['code':("preEducation.studentpreEdu.label"),'default':("Studentpre Edu")],-1)
printHtmlPart(32)
createTagBody(3, {->
printHtmlPart(20)
expressionOut.print(preEducationInstance?.studentpreEdu?.encodeAsHTML())
printHtmlPart(21)
})
invokeTag('link','g',162,['controller':("student"),'action':("show"),'id':(preEducationInstance?.studentpreEdu?.id)],3)
printHtmlPart(22)
}
printHtmlPart(23)
if(true && (preEducationInstance?.transferCertificatId)) {
printHtmlPart(33)
invokeTag('message','g',169,['code':("preEducation.transferCertificatId.label"),'default':("Transfer Certificat Id")],-1)
printHtmlPart(34)
invokeTag('fieldValue','g',173,['bean':(preEducationInstance),'field':("transferCertificatId")],-1)
printHtmlPart(22)
}
printHtmlPart(23)
for( g in (preEducationInstance.files) ) {
printHtmlPart(35)
expressionOut.print(createLink(controller:'home', action:'displaySingleImage', id:g.id))
printHtmlPart(36)
}
printHtmlPart(37)
createTagBody(2, {->
printHtmlPart(38)
createTagBody(3, {->
printHtmlPart(39)
invokeTag('message','g',189,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(40)
})
invokeTag('link','g',190,['class':("edit"),'action':("edit"),'id':(LookUpED.encod(preEducationInstance.id))],3)
printHtmlPart(40)
invokeTag('actionSubmit','g',193,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(41)
})
invokeTag('form','g',195,['url':([resource:preEducationInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(42)
invokeTag('render','g',209,['template':("/footer/footer")],-1)
printHtmlPart(43)
})
invokeTag('captureBody','sitemesh',247,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(44)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926008335L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
