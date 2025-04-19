import com.hiideals.instituite.classcourses.IClass
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_listofStudentsindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/listofStudents/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',13,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',13,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',69,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',76,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',79,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',88,['template':("/header/leftSide"),'model':([activ:[reports:'start active open',GetStudentList1:'active']])],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',100,['action':("create"),'controller':("student")],2)
printHtmlPart(11)
createClosureForHtmlPart(12, 2)
invokeTag('link','g',133,['controller':("listofStudents"),'class':("btn btn-success"),'action':("getstudentlist"),'target':("_blank")],2)
printHtmlPart(13)
createTagBody(2, {->
printHtmlPart(14)
for( cls in (studentInstanceList[0]?.instituite?.classes) ) {
printHtmlPart(15)
expressionOut.print(cls?.id)
printHtmlPart(16)
expressionOut.print(cls?.classname)
printHtmlPart(17)
}
printHtmlPart(18)
for( batch in (batchList) ) {
printHtmlPart(15)
expressionOut.print(batch.batchName)
printHtmlPart(16)
expressionOut.print(batch.batchName)
printHtmlPart(17)
}
printHtmlPart(19)
invokeTag('submitButton','g',177,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(20)
})
invokeTag('form','g',179,['name':("ssone"),'url':([action:'getByClass']),'target':("_blank")],2)
printHtmlPart(21)
createTagBody(2, {->
printHtmlPart(22)
expressionOut.print(params.to)
printHtmlPart(23)
invokeTag('submitButton','g',205,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(20)
})
invokeTag('form','g',207,['name':("ss"),'url':([action:'index']),'update':("Changedisplay")],2)
printHtmlPart(24)
createTagBody(2, {->
printHtmlPart(25)
for( cls in (studentInstanceList[0]?.instituite?.classes) ) {
printHtmlPart(15)
expressionOut.print(cls?.id)
printHtmlPart(16)
expressionOut.print(cls?.classname)
printHtmlPart(17)
}
printHtmlPart(26)
for( batch in (batchList) ) {
printHtmlPart(15)
expressionOut.print(batch.batchName)
printHtmlPart(16)
expressionOut.print(batch.batchName)
printHtmlPart(17)
}
printHtmlPart(27)
loop:{
int c = 0
for( cat in (categories) ) {
printHtmlPart(15)
expressionOut.print(cat)
printHtmlPart(16)
expressionOut.print(cat)
printHtmlPart(17)
c++
}
}
printHtmlPart(28)
invokeTag('submitButton','g',254,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(20)
})
invokeTag('form','g',255,['name':("ssone"),'url':([action:'getBycast']),'target':("_blank")],2)
printHtmlPart(29)
createTagBody(2, {->
printHtmlPart(25)
for( cls in (studentInstanceList[0]?.instituite?.classes) ) {
printHtmlPart(15)
expressionOut.print(cls?.id)
printHtmlPart(16)
expressionOut.print(cls?.classname)
printHtmlPart(17)
}
printHtmlPart(26)
for( batch in (batchList) ) {
printHtmlPart(15)
expressionOut.print(batch.batchName)
printHtmlPart(16)
expressionOut.print(batch.batchName)
printHtmlPart(17)
}
printHtmlPart(30)
invokeTag('submitButton','g',304,['name':("Search"),'class':("btn green"),'style':("margin-top: 22px")],-1)
printHtmlPart(20)
})
invokeTag('form','g',306,['name':("ssone"),'url':([action:'getBygender']),'target':("_blank")],2)
printHtmlPart(31)
invokeTag('render','g',312,['template':("/listofStudents/listofstudenttable")],-1)
printHtmlPart(32)
createTagBody(2, {->
printHtmlPart(33)
invokeTag('hiddenField','g',319,['name':("academicyear"),'value':(params?.academicyear)],-1)
printHtmlPart(33)
invokeTag('hiddenField','g',320,['name':("iclass"),'value':(params?.iclass)],-1)
printHtmlPart(33)
invokeTag('hiddenField','g',322,['name':("from"),'value':(params?.from)],-1)
printHtmlPart(33)
invokeTag('hiddenField','g',325,['name':("orderd"),'value':(params?.orderd)],-1)
printHtmlPart(33)
invokeTag('hiddenField','g',326,['name':("to"),'value':(params?.to)],-1)
printHtmlPart(33)
invokeTag('hiddenField','g',328,['name':("Search"),'value':("Search")],-1)
printHtmlPart(33)
invokeTag('submitButton','g',334,['class':("btn blue"),'name':("Get Print")],-1)
printHtmlPart(34)
})
invokeTag('form','g',335,['controller':("listofStudents"),'action':("getstlist"),'target':("_blank")],2)
printHtmlPart(35)
invokeTag('render','g',341,['template':("/footer/footer")],-1)
printHtmlPart(36)
})
invokeTag('captureBody','sitemesh',490,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(37)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1650689978000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
