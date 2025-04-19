import com.hiideals.instituite.main.Instituite
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ROOT_instituite_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/instituite/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: instituiteInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',9,['code':("instituite.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',12,['name':("name"),'class':("form-control"),'required':(""),'value':(instituiteInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: instituiteInstance, field: 'caption', 'error'))
printHtmlPart(4)
invokeTag('message','g',21,['code':("instituite.caption.label"),'default':("Caption")],-1)
printHtmlPart(5)
invokeTag('textField','g',25,['name':("caption"),'class':("form-control"),'required':(""),'value':(instituiteInstance?.caption)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: instituiteInstance, field: 'affiliatedTo', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("instituite.affiliatedTo.label"),'default':("Affiliated To")],-1)
printHtmlPart(5)
invokeTag('textField','g',38,['name':("affiliatedTo"),'class':("form-control"),'required':(""),'value':(instituiteInstance?.affiliatedTo)],-1)
printHtmlPart(7)
expressionOut.print(hasErrors(bean: instituiteInstance, field: 'description', 'error'))
printHtmlPart(8)
invokeTag('message','g',45,['code':("instituite.description.label"),'default':("Description")],-1)
printHtmlPart(5)
invokeTag('textField','g',49,['name':("description"),'class':("form-control"),'required':(""),'value':(instituiteInstance?.description)],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: instituiteInstance, field: 'institutionFax', 'error'))
printHtmlPart(10)
invokeTag('message','g',61,['code':("instituite.institutionFax.label"),'default':("Institution Fax")],-1)
printHtmlPart(11)
invokeTag('textField','g',65,['name':("institutionFax"),'class':("form-control"),'value':(instituiteInstance?.institutionFax)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: instituiteInstance, field: 'phone', 'error'))
printHtmlPart(12)
invokeTag('message','g',74,['code':("instituite.phone.label"),'default':("Institution Phone Number ")],-1)
printHtmlPart(5)
invokeTag('textField','g',78,['name':("phone"),'class':("form-control"),'required':(""),'value':(instituiteInstance?.phone)],-1)
printHtmlPart(7)
expressionOut.print(hasErrors(bean: instituiteInstance, field: 'institutionID', 'error'))
printHtmlPart(13)
invokeTag('message','g',85,['code':("instituite.institutionID.label"),'default':("Institution ID")],-1)
printHtmlPart(14)
if(true && (instituiteInstance?.institutionID !=null)) {
printHtmlPart(15)
invokeTag('textField','g',90,['name':("institutionID"),'class':("form-control"),'required':(""),'value':(instituiteInstance?.institutionID)],-1)
printHtmlPart(16)
}
else {
printHtmlPart(15)
invokeTag('getInstId','regId',93,['admin':(admin)],-1)
printHtmlPart(16)
}
printHtmlPart(7)
expressionOut.print(hasErrors(bean: instituiteInstance, field: 'institutionPrefixName', 'error'))
printHtmlPart(17)
invokeTag('message','g',102,['code':("instituite.institutionPrefixName.label"),'default':("Set Institute Prefix Name")],-1)
printHtmlPart(5)
invokeTag('textField','g',107,['name':("institutionPrefixName"),'class':("form-control"),'min':("3"),'maxlength':("4"),'required':(""),'id':("institutionPrefixName"),'value':(instituiteInstance?.institutionPrefixName)],-1)
printHtmlPart(18)
if(true && (instituiteInstance?.logo != null)) {
printHtmlPart(19)
invokeTag('getImage','images',132,['id':(instituiteInstance?.logo?.id),'width':("150px")],-1)
printHtmlPart(20)
}
printHtmlPart(21)
expressionOut.print(edit)
printHtmlPart(22)
if(true && (instituiteInstance?.signature != null)) {
printHtmlPart(23)
invokeTag('getImage','images',174,['id':(instituiteInstance?.signature?.id),'width':("150px")],-1)
printHtmlPart(20)
}
printHtmlPart(24)
expressionOut.print(edit)
printHtmlPart(25)
expressionOut.print(hasErrors(bean: instituiteInstance, field: 'admin', 'error'))
printHtmlPart(26)
expressionOut.print(admin?.id)
printHtmlPart(27)
expressionOut.print(admin?.adminName)
printHtmlPart(28)
invokeTag('message','g',205,['code':("instituite.admin.label"),'default':("Admin")],-1)
printHtmlPart(29)
expressionOut.print(hasErrors(bean: instituiteInstance, field: 'hsno', 'error'))
printHtmlPart(30)
invokeTag('message','g',225,['code':("instituite.hsno.label"),'default':("Building No.")],-1)
printHtmlPart(2)
invokeTag('textField','g',230,['name':("hsno"),'class':("form-control"),'required':(""),'value':(instituiteInstance?.hsno)],-1)
printHtmlPart(31)
expressionOut.print(hasErrors(bean: instituiteInstance, field: 'street', 'error'))
printHtmlPart(32)
invokeTag('message','g',239,['code':("instituite.street.label"),'default':("Street")],-1)
printHtmlPart(5)
invokeTag('textField','g',249,['name':("street"),'class':("form-control"),'required':(""),'value':(instituiteInstance?.street)],-1)
printHtmlPart(31)
expressionOut.print(hasErrors(bean: instituiteInstance, field: 'city', 'error'))
printHtmlPart(33)
invokeTag('message','g',253,['code':("instituite.city.label"),'default':("City")],-1)
printHtmlPart(2)
invokeTag('textField','g',260,['name':("city"),'class':("form-control"),'required':(""),'value':(instituiteInstance?.city)],-1)
printHtmlPart(7)
expressionOut.print(hasErrors(bean: instituiteInstance, field: 'state', 'error'))
printHtmlPart(34)
invokeTag('message','g',265,['code':("instituite.state.label"),'default':("State")],-1)
printHtmlPart(2)
invokeTag('textField','g',272,['name':("state"),'class':("form-control"),'required':(""),'value':(instituiteInstance?.state)],-1)
printHtmlPart(35)
expressionOut.print(hasErrors(bean: instituiteInstance, field: 'country', 'error'))
printHtmlPart(36)
invokeTag('message','g',278,['code':("instituite.country.label"),'default':("Country")],-1)
printHtmlPart(5)
invokeTag('textField','g',283,['name':("country"),'class':("form-control"),'required':(""),'value':(instituiteInstance?.country)],-1)
printHtmlPart(7)
expressionOut.print(hasErrors(bean: instituiteInstance, field: 'alternatephno', 'error'))
printHtmlPart(37)
invokeTag('message','g',294,['code':("instituite.alternatephno.label"),'default':("Alternate Phone No.")],-1)
printHtmlPart(2)
invokeTag('textField','g',298,['name':("alternatephno"),'class':("form-control"),'value':(instituiteInstance?.alternatephno)],-1)
printHtmlPart(31)
expressionOut.print(hasErrors(bean: instituiteInstance, field: 'pinCode', 'error'))
printHtmlPart(38)
invokeTag('message','g',304,['code':("instituite.pinCode.label"),'default':("Pin code")],-1)
printHtmlPart(5)
invokeTag('textField','g',309,['name':("pinCode"),'class':("form-control"),'required':(""),'value':(instituiteInstance?.pinCode)],-1)
printHtmlPart(39)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1628925998339L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
