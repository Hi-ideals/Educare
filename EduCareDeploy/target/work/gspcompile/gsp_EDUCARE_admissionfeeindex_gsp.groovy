import com.hiideals.instituite.EDcoding.LookUpED
import com.hiideals.instituite.feemanagment.Admissionfee
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_EDUCARE_admissionfeeindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admissionfee/index.gsp" }
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
invokeTag('captureHead','sitemesh',45,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('render','g',50,['template':("/header/logo")],-1)
printHtmlPart(5)
invokeTag('render','g',53,['template':("/header/topBar")],-1)
printHtmlPart(6)
invokeTag('render','g',61,['template':("/header/leftSide"),'model':([activ:[feeStructure:'start active open',admissionfeelist:'active']])],-1)
printHtmlPart(7)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('link','g',71,['action':("index")],2)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',73,['action':("create")],2)
printHtmlPart(12)
if(true && (flash.message)) {
printHtmlPart(13)
expressionOut.print(flash.message)
printHtmlPart(14)
}
printHtmlPart(15)
invokeTag('message','g',103,['code':("admissionfee.iclass.label"),'default':("Iclass")],-1)
printHtmlPart(16)
loop:{
int i = 0
for( admissionfeeInstance in (admissionfeeInstanceList) ) {
printHtmlPart(17)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(18)
expressionOut.print(fieldValue(bean: admissionfeeInstance, field: "name"))
printHtmlPart(19)
expressionOut.print(admissionfeeInstance.iclass.classname)
printHtmlPart(20)
expressionOut.print(fieldValue(bean: admissionfeeInstance, field: "totalAmount"))
printHtmlPart(21)
createTagBody(3, {->
printHtmlPart(22)
createTagBody(4, {->
printHtmlPart(23)
invokeTag('message','g',143,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(24)
})
invokeTag('link','g',144,['class':("edit"),'action':("edit"),'id':(LookUpED.encod(admissionfeeInstance.id))],4)
printHtmlPart(25)
invokeTag('actionSubmit','g',150,['style':("background:none;border:none;color:red"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(26)
})
invokeTag('form','g',150,['url':([resource:admissionfeeInstance, action:'delete']),'method':("DELETE")],3)
printHtmlPart(27)
i++
}
}
printHtmlPart(28)
invokeTag('paginate','g',156,['total':(admissionfeeInstanceCount ?: 0)],-1)
printHtmlPart(29)
invokeTag('render','g',162,['template':("/footer/footer")],-1)
printHtmlPart(30)
})
invokeTag('captureBody','sitemesh',198,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(31)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926014230L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
