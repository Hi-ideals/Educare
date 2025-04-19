import com.hiideals.instituite.classcourses.IClass
import com.hiideals.instituite.feemanagment.InstFeeTypes
import com.hiideals.instituite.EDcoding.LookUpED
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_instFeeTypesindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/instFeeTypes/index.gsp" }
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
invokeTag('captureHead','sitemesh',49,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',59,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',63,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',74,['template':("/header/leftSide"),'model':([activ:[feeStructure:'start active open',instFeeTypesList:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',90,['action':("create")],2)
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(12)
invokeTag('hiddenField','g',106,['name':("cls"),'value':("true")],-1)
printHtmlPart(13)
if(true && (instFeeTypesInstanceList?.size()>0)) {
printHtmlPart(14)
for( cls in (IClass.findAllByInstituite(instFeeTypesInstanceList[0]?.instituite)) ) {
printHtmlPart(15)
expressionOut.print(cls.id)
printHtmlPart(16)
expressionOut.print(cls.classname)
printHtmlPart(17)
}
printHtmlPart(18)
}
printHtmlPart(19)
invokeTag('submitButton','g',126,['name':("Search"),'class':("btn blue"),'style':("margin-top:21px")],-1)
printHtmlPart(20)
})
invokeTag('formRemote','g',130,['name':("ss"),'url':([action:'index']),'update':("Changedisplay")],2)
printHtmlPart(21)
if(true && (flash.message)) {
printHtmlPart(22)
expressionOut.print(flash.message)
printHtmlPart(23)
}
printHtmlPart(24)
expressionOut.print(message(code: 'instFeeTypes.typeName.label', default: 'Type Name'))
printHtmlPart(25)
expressionOut.print(message(code: 'instFeeTypes.totalAmount.label', default: 'Total Amount'))
printHtmlPart(26)
loop:{
int i = 0
for( instFeeTypesInstance in (instFeeTypesInstanceList) ) {
printHtmlPart(27)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(28)
expressionOut.print(fieldValue(bean: instFeeTypesInstance, field: "typeName"))
printHtmlPart(29)
expressionOut.print(fieldValue(bean: instFeeTypesInstance.iclass, field: "classname"))
printHtmlPart(29)
expressionOut.print(fieldValue(bean: instFeeTypesInstance, field: "totalAmount"))
printHtmlPart(30)
createTagBody(3, {->
printHtmlPart(31)
createTagBody(4, {->
printHtmlPart(32)
invokeTag('message','g',193,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(33)
})
invokeTag('link','g',194,['action':("edit"),'id':(LookUpED.encod(instFeeTypesInstance.id))],4)
printHtmlPart(34)
invokeTag('actionSubmit','g',199,['style':("background:none;border:none;color:red"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(35)
})
invokeTag('form','g',201,['url':([resource:instFeeTypesInstance, action:'delete']),'method':("DELETE")],3)
printHtmlPart(36)
i++
}
}
printHtmlPart(37)
expressionOut.print(Totalsum)
printHtmlPart(38)
invokeTag('paginate','g',223,['total':(instFeeTypesInstanceCount ?: 0),'params':(params)],-1)
printHtmlPart(39)
invokeTag('render','g',236,['template':("/footer/footer")],-1)
printHtmlPart(40)
})
invokeTag('captureBody','sitemesh',284,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white"),'id':("Changedisplay")],1)
printHtmlPart(41)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628926008256L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
